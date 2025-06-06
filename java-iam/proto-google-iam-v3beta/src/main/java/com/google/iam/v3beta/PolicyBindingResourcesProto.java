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
// source: google/iam/v3beta/policy_binding_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.iam.v3beta;

public final class PolicyBindingResourcesProto {
  private PolicyBindingResourcesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_v3beta_PolicyBinding_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_v3beta_PolicyBinding_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_v3beta_PolicyBinding_Target_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_v3beta_PolicyBinding_Target_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_iam_v3beta_PolicyBinding_AnnotationsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_iam_v3beta_PolicyBinding_AnnotationsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "0google/iam/v3beta/policy_binding_resou"
          + "rces.proto\022\021google.iam.v3beta\032\037google/ap"
          + "i/field_behavior.proto\032\033google/api/field"
          + "_info.proto\032\031google/api/resource.proto\032\037"
          + "google/protobuf/timestamp.proto\032\026google/type/expr.proto\"\342\007\n\r"
          + "PolicyBinding\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\010\022\030\n"
          + "\003uid\030\002 \001(\tB\013\340A\003\342\214\317\327\010\002\010\001\022\021\n"
          + "\004etag\030\003 \001(\tB\003\340A\001\022\031\n"
          + "\014display_name\030\004 \001(\tB\003\340A\001\022K\n"
          + "\013annotations\030\005 \003(\01321.google.iam.v"
          + "3beta.PolicyBinding.AnnotationsEntryB\003\340A\001\022?\n"
          + "\006target\030\006"
          + " \001(\0132\'.google.iam.v3beta.PolicyBinding.TargetB\006\340A\005\340A\002\022E\n"
          + "\013policy_kind\030\013"
          + " \001(\0162+.google.iam.v3beta.PolicyBinding.PolicyKindB\003\340A\005\022\026\n"
          + "\006policy\030\007 \001(\tB\006\340A\005\340A\002\022\027\n\n"
          + "policy_uid\030\014 \001(\tB\003\340A\003\022)\n"
          + "\tcondition\030\010 \001(\0132\021.google.type.ExprB\003\340A\001\0224\n"
          + "\013create_time\030\t \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\n"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0320\n"
          + "\006Target\022\034\n\r"
          + "principal_set\030\001 \001(\tB\003\340A\005H\000B\010\n"
          + "\006target\0322\n"
          + "\020AnnotationsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"H\n\n"
          + "PolicyKind\022\033\n"
          + "\027POLICY_KIND_UNSPECIFIED\020\000\022\035\n"
          + "\031PRINCIPAL_ACCESS_BOUNDARY\020\001:\250\002\352A\244\002\n"
          + " iam.googleapis.com/PolicyBinding\022Qorganizations/{organization}/locations/{loca"
          + "tion}/policyBindings/{policy_binding}\022Efolders/{folder}/locations/{location}/pol"
          + "icyBindings/{policy_binding}\022Gprojects/{"
          + "project}/locations/{location}/policyBindings/{policy_binding}*\016policyBindings2\r"
          + "policyBindingB\231\001\n"
          + "\025com.google.iam.v3betaB\033PolicyBindingResourcesProtoP\001Z-cloud.goo"
          + "gle.com/go/iam/apiv3beta/iampb;iampb\252\002\027G"
          + "oogle.Cloud.Iam.V3Beta\312\002\027Google\\Cloud\\Iam\\V3betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.FieldInfoProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.type.ExprProto.getDescriptor(),
            });
    internal_static_google_iam_v3beta_PolicyBinding_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_iam_v3beta_PolicyBinding_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_v3beta_PolicyBinding_descriptor,
            new java.lang.String[] {
              "Name",
              "Uid",
              "Etag",
              "DisplayName",
              "Annotations",
              "Target",
              "PolicyKind",
              "Policy",
              "PolicyUid",
              "Condition",
              "CreateTime",
              "UpdateTime",
            });
    internal_static_google_iam_v3beta_PolicyBinding_Target_descriptor =
        internal_static_google_iam_v3beta_PolicyBinding_descriptor.getNestedTypes().get(0);
    internal_static_google_iam_v3beta_PolicyBinding_Target_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_v3beta_PolicyBinding_Target_descriptor,
            new java.lang.String[] {
              "PrincipalSet", "Target",
            });
    internal_static_google_iam_v3beta_PolicyBinding_AnnotationsEntry_descriptor =
        internal_static_google_iam_v3beta_PolicyBinding_descriptor.getNestedTypes().get(1);
    internal_static_google_iam_v3beta_PolicyBinding_AnnotationsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_iam_v3beta_PolicyBinding_AnnotationsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.FieldInfoProto.fieldInfo);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.FieldInfoProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.type.ExprProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
