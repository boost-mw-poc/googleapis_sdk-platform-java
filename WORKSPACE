workspace(name = "gapic_generator_java")

load("@bazel_tools//tools/build_defs/repo:http.bzl", "http_archive")

# gax-java and its transitive dependencies must be imported before
# gapic-generator-java dependencies to match the order in googleapis repository,
# which in its turn, prioritizes actual generated clients runtime dependencies
# over the generator dependencies.
local_repository(
   name = "com_google_api_gax_java",
   path = "gax-java",
)

load("@com_google_api_gax_java//:repository_rules.bzl", "com_google_api_gax_java_properties")

com_google_api_gax_java_properties(
    name = "com_google_api_gax_java_properties",
    file = "@com_google_api_gax_java//:dependencies.properties",
)

load("@com_google_api_gax_java//:repositories.bzl", "com_google_api_gax_java_repositories")

com_google_api_gax_java_repositories()

_googleapis_commit = "7438480b2a1bc6371d748e974f7a3647f90c4e8d"

http_archive(
    name = "com_google_googleapis",
    strip_prefix = "googleapis-%s" % _googleapis_commit,
    urls = [
        "https://github.com/googleapis/googleapis/archive/%s.zip" % _googleapis_commit,
    ],
)

# protobuf
RULES_JVM_EXTERNAL_TAG = "4.5"

RULES_JVM_EXTERNAL_SHA = "b17d7388feb9bfa7f2fa09031b32707df529f26c91ab9e5d909eb1676badd9a6"

http_archive(
    name = "rules_jvm_external",
    sha256 = RULES_JVM_EXTERNAL_SHA,
    strip_prefix = "rules_jvm_external-%s" % RULES_JVM_EXTERNAL_TAG,
    url = "https://github.com/bazelbuild/rules_jvm_external/archive/%s.zip" % RULES_JVM_EXTERNAL_TAG,
)

load("@rules_jvm_external//:repositories.bzl", "rules_jvm_external_deps")

rules_jvm_external_deps()

load("@rules_jvm_external//:setup.bzl", "rules_jvm_external_setup")

rules_jvm_external_setup()

load("@com_google_protobuf//:protobuf_deps.bzl", "PROTOBUF_MAVEN_ARTIFACTS", "protobuf_deps")
load("@rules_jvm_external//:defs.bzl", "maven_install")

load("@io_grpc_grpc_java//:repositories.bzl", "IO_GRPC_GRPC_JAVA_ARTIFACTS")
load("@io_grpc_grpc_java//:repositories.bzl", "IO_GRPC_GRPC_JAVA_OVERRIDE_TARGETS")

_gapic_generator_java_version = "2.60.3-SNAPSHOT"  # {x-version-update:gapic-generator-java:current}

maven_install(
    artifacts = [
        "com.google.api:gapic-generator-java:" + _gapic_generator_java_version,
    ] + PROTOBUF_MAVEN_ARTIFACTS + IO_GRPC_GRPC_JAVA_ARTIFACTS,
    fail_on_missing_checksum = False,
    override_targets = IO_GRPC_GRPC_JAVA_OVERRIDE_TARGETS,
    repositories = [
        "m2Local",
        "https://repo.maven.apache.org/maven2/",
    ],
)

protobuf_deps()

# Bazel rules.
_rules_gapic_version = "0.5.5"

http_archive(
    name = "rules_gapic",
    strip_prefix = "rules_gapic-%s" % _rules_gapic_version,
    urls = ["https://github.com/googleapis/rules_gapic/archive/v%s.tar.gz" % _rules_gapic_version],
)

# Java dependencies.
load("@com_google_googleapis//:repository_rules.bzl", "switched_rules_by_language")

switched_rules_by_language(
    name = "com_google_googleapis_imports",
    gapic = True,
    grpc = True,
    java = True,
)

load("@io_grpc_grpc_java//:repositories.bzl", "grpc_java_repositories")

grpc_java_repositories()

load("@envoy_api//bazel:repositories.bzl", "api_dependencies")

api_dependencies()

_disco_to_proto3_converter_commit = "ce8d8732120cdfb5bf4847c3238b5be8acde87e3"

http_archive(
    name = "com_google_disco_to_proto3_converter",
    strip_prefix = "disco-to-proto3-converter-%s" % _disco_to_proto3_converter_commit,
    urls = ["https://github.com/googleapis/disco-to-proto3-converter/archive/%s.zip" % _disco_to_proto3_converter_commit],
)

http_archive(
    name = "rules_pkg",
    sha256 = "8a298e832762eda1830597d64fe7db58178aa84cd5926d76d5b744d6558941c2",
    urls = [
        "https://mirror.bazel.build/github.com/bazelbuild/rules_pkg/releases/download/0.7.0/rules_pkg-0.7.0.tar.gz",
        "https://github.com/bazelbuild/rules_pkg/releases/download/0.7.0/rules_pkg-0.7.0.tar.gz",
    ],
)

load("@rules_pkg//:deps.bzl", "rules_pkg_dependencies")

rules_pkg_dependencies()
