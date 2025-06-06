/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/field_behavior.proto

// Protobuf Java Version: 3.25.8
package com.google.api;

public final class FieldBehaviorProto {
  private FieldBehaviorProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static final int FIELD_BEHAVIOR_FIELD_NUMBER = 1052;

  /**
   *
   *
   * <pre>
   * A designation of a specific field behavior (required, output only, etc.)
   * in protobuf messages.
   *
   * Examples:
   *
   *   string name = 1 [(google.api.field_behavior) = REQUIRED];
   *   State state = 1 [(google.api.field_behavior) = OUTPUT_ONLY];
   *   google.protobuf.Duration ttl = 1
   *     [(google.api.field_behavior) = INPUT_ONLY];
   *   google.protobuf.Timestamp expire_time = 1
   *     [(google.api.field_behavior) = OUTPUT_ONLY,
   *      (google.api.field_behavior) = IMMUTABLE];
   * </pre>
   *
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.FieldOptions,
          java.util.List<com.google.api.FieldBehavior>>
      fieldBehavior =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              com.google.api.FieldBehavior.class, null);

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\037google/api/field_behavior.proto\022\ngoogl"
          + "e.api\032 google/protobuf/descriptor.proto*"
          + "\266\001\n\rFieldBehavior\022\036\n\032FIELD_BEHAVIOR_UNSP"
          + "ECIFIED\020\000\022\014\n\010OPTIONAL\020\001\022\014\n\010REQUIRED\020\002\022\017\n"
          + "\013OUTPUT_ONLY\020\003\022\016\n\nINPUT_ONLY\020\004\022\r\n\tIMMUTA"
          + "BLE\020\005\022\022\n\016UNORDERED_LIST\020\006\022\025\n\021NON_EMPTY_D"
          + "EFAULT\020\007\022\016\n\nIDENTIFIER\020\010:U\n\016field_behavi"
          + "or\022\035.google.protobuf.FieldOptions\030\234\010 \003(\016"
          + "2\031.google.api.FieldBehaviorB\002\020\000Bp\n\016com.g"
          + "oogle.apiB\022FieldBehaviorProtoP\001ZAgoogle."
          + "golang.org/genproto/googleapis/api/annot"
          + "ations;annotations\242\002\004GAPIb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.protobuf.DescriptorProtos.getDescriptor(),
            });
    fieldBehavior.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
