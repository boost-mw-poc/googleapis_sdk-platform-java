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
// source: google/cloud/audit/audit_log.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.audit;

/**
 *
 *
 * <pre>
 * Information related to policy violations for this request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.audit.PolicyViolationInfo}
 */
public final class PolicyViolationInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.audit.PolicyViolationInfo)
    PolicyViolationInfoOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use PolicyViolationInfo.newBuilder() to construct.
  private PolicyViolationInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PolicyViolationInfo() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PolicyViolationInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.audit.AuditLogProto
        .internal_static_google_cloud_audit_PolicyViolationInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.audit.AuditLogProto
        .internal_static_google_cloud_audit_PolicyViolationInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.audit.PolicyViolationInfo.class,
            com.google.cloud.audit.PolicyViolationInfo.Builder.class);
  }

  private int bitField0_;
  public static final int ORG_POLICY_VIOLATION_INFO_FIELD_NUMBER = 1;
  private com.google.cloud.audit.OrgPolicyViolationInfo orgPolicyViolationInfo_;

  /**
   *
   *
   * <pre>
   * Indicates the orgpolicy violations for this resource.
   * </pre>
   *
   * <code>.google.cloud.audit.OrgPolicyViolationInfo org_policy_violation_info = 1;</code>
   *
   * @return Whether the orgPolicyViolationInfo field is set.
   */
  @java.lang.Override
  public boolean hasOrgPolicyViolationInfo() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Indicates the orgpolicy violations for this resource.
   * </pre>
   *
   * <code>.google.cloud.audit.OrgPolicyViolationInfo org_policy_violation_info = 1;</code>
   *
   * @return The orgPolicyViolationInfo.
   */
  @java.lang.Override
  public com.google.cloud.audit.OrgPolicyViolationInfo getOrgPolicyViolationInfo() {
    return orgPolicyViolationInfo_ == null
        ? com.google.cloud.audit.OrgPolicyViolationInfo.getDefaultInstance()
        : orgPolicyViolationInfo_;
  }

  /**
   *
   *
   * <pre>
   * Indicates the orgpolicy violations for this resource.
   * </pre>
   *
   * <code>.google.cloud.audit.OrgPolicyViolationInfo org_policy_violation_info = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
      getOrgPolicyViolationInfoOrBuilder() {
    return orgPolicyViolationInfo_ == null
        ? com.google.cloud.audit.OrgPolicyViolationInfo.getDefaultInstance()
        : orgPolicyViolationInfo_;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getOrgPolicyViolationInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, getOrgPolicyViolationInfo());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.audit.PolicyViolationInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.audit.PolicyViolationInfo other =
        (com.google.cloud.audit.PolicyViolationInfo) obj;

    if (hasOrgPolicyViolationInfo() != other.hasOrgPolicyViolationInfo()) return false;
    if (hasOrgPolicyViolationInfo()) {
      if (!getOrgPolicyViolationInfo().equals(other.getOrgPolicyViolationInfo())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasOrgPolicyViolationInfo()) {
      hash = (37 * hash) + ORG_POLICY_VIOLATION_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getOrgPolicyViolationInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.audit.PolicyViolationInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.audit.PolicyViolationInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.audit.PolicyViolationInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.audit.PolicyViolationInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.audit.PolicyViolationInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.audit.PolicyViolationInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.audit.PolicyViolationInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.audit.PolicyViolationInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.audit.PolicyViolationInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.audit.PolicyViolationInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.audit.PolicyViolationInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.audit.PolicyViolationInfo parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.audit.PolicyViolationInfo prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * Information related to policy violations for this request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.audit.PolicyViolationInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.audit.PolicyViolationInfo)
      com.google.cloud.audit.PolicyViolationInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.audit.AuditLogProto
          .internal_static_google_cloud_audit_PolicyViolationInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.audit.AuditLogProto
          .internal_static_google_cloud_audit_PolicyViolationInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.audit.PolicyViolationInfo.class,
              com.google.cloud.audit.PolicyViolationInfo.Builder.class);
    }

    // Construct using com.google.cloud.audit.PolicyViolationInfo.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getOrgPolicyViolationInfoFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      orgPolicyViolationInfo_ = null;
      if (orgPolicyViolationInfoBuilder_ != null) {
        orgPolicyViolationInfoBuilder_.dispose();
        orgPolicyViolationInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.audit.AuditLogProto
          .internal_static_google_cloud_audit_PolicyViolationInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.audit.PolicyViolationInfo getDefaultInstanceForType() {
      return com.google.cloud.audit.PolicyViolationInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.audit.PolicyViolationInfo build() {
      com.google.cloud.audit.PolicyViolationInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.audit.PolicyViolationInfo buildPartial() {
      com.google.cloud.audit.PolicyViolationInfo result =
          new com.google.cloud.audit.PolicyViolationInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.audit.PolicyViolationInfo result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.orgPolicyViolationInfo_ =
            orgPolicyViolationInfoBuilder_ == null
                ? orgPolicyViolationInfo_
                : orgPolicyViolationInfoBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.audit.PolicyViolationInfo) {
        return mergeFrom((com.google.cloud.audit.PolicyViolationInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.audit.PolicyViolationInfo other) {
      if (other == com.google.cloud.audit.PolicyViolationInfo.getDefaultInstance()) return this;
      if (other.hasOrgPolicyViolationInfo()) {
        mergeOrgPolicyViolationInfo(other.getOrgPolicyViolationInfo());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                input.readMessage(
                    getOrgPolicyViolationInfoFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private com.google.cloud.audit.OrgPolicyViolationInfo orgPolicyViolationInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.audit.OrgPolicyViolationInfo,
            com.google.cloud.audit.OrgPolicyViolationInfo.Builder,
            com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder>
        orgPolicyViolationInfoBuilder_;

    /**
     *
     *
     * <pre>
     * Indicates the orgpolicy violations for this resource.
     * </pre>
     *
     * <code>.google.cloud.audit.OrgPolicyViolationInfo org_policy_violation_info = 1;</code>
     *
     * @return Whether the orgPolicyViolationInfo field is set.
     */
    public boolean hasOrgPolicyViolationInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Indicates the orgpolicy violations for this resource.
     * </pre>
     *
     * <code>.google.cloud.audit.OrgPolicyViolationInfo org_policy_violation_info = 1;</code>
     *
     * @return The orgPolicyViolationInfo.
     */
    public com.google.cloud.audit.OrgPolicyViolationInfo getOrgPolicyViolationInfo() {
      if (orgPolicyViolationInfoBuilder_ == null) {
        return orgPolicyViolationInfo_ == null
            ? com.google.cloud.audit.OrgPolicyViolationInfo.getDefaultInstance()
            : orgPolicyViolationInfo_;
      } else {
        return orgPolicyViolationInfoBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Indicates the orgpolicy violations for this resource.
     * </pre>
     *
     * <code>.google.cloud.audit.OrgPolicyViolationInfo org_policy_violation_info = 1;</code>
     */
    public Builder setOrgPolicyViolationInfo(com.google.cloud.audit.OrgPolicyViolationInfo value) {
      if (orgPolicyViolationInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        orgPolicyViolationInfo_ = value;
      } else {
        orgPolicyViolationInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Indicates the orgpolicy violations for this resource.
     * </pre>
     *
     * <code>.google.cloud.audit.OrgPolicyViolationInfo org_policy_violation_info = 1;</code>
     */
    public Builder setOrgPolicyViolationInfo(
        com.google.cloud.audit.OrgPolicyViolationInfo.Builder builderForValue) {
      if (orgPolicyViolationInfoBuilder_ == null) {
        orgPolicyViolationInfo_ = builderForValue.build();
      } else {
        orgPolicyViolationInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Indicates the orgpolicy violations for this resource.
     * </pre>
     *
     * <code>.google.cloud.audit.OrgPolicyViolationInfo org_policy_violation_info = 1;</code>
     */
    public Builder mergeOrgPolicyViolationInfo(
        com.google.cloud.audit.OrgPolicyViolationInfo value) {
      if (orgPolicyViolationInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && orgPolicyViolationInfo_ != null
            && orgPolicyViolationInfo_
                != com.google.cloud.audit.OrgPolicyViolationInfo.getDefaultInstance()) {
          getOrgPolicyViolationInfoBuilder().mergeFrom(value);
        } else {
          orgPolicyViolationInfo_ = value;
        }
      } else {
        orgPolicyViolationInfoBuilder_.mergeFrom(value);
      }
      if (orgPolicyViolationInfo_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Indicates the orgpolicy violations for this resource.
     * </pre>
     *
     * <code>.google.cloud.audit.OrgPolicyViolationInfo org_policy_violation_info = 1;</code>
     */
    public Builder clearOrgPolicyViolationInfo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      orgPolicyViolationInfo_ = null;
      if (orgPolicyViolationInfoBuilder_ != null) {
        orgPolicyViolationInfoBuilder_.dispose();
        orgPolicyViolationInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Indicates the orgpolicy violations for this resource.
     * </pre>
     *
     * <code>.google.cloud.audit.OrgPolicyViolationInfo org_policy_violation_info = 1;</code>
     */
    public com.google.cloud.audit.OrgPolicyViolationInfo.Builder
        getOrgPolicyViolationInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getOrgPolicyViolationInfoFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Indicates the orgpolicy violations for this resource.
     * </pre>
     *
     * <code>.google.cloud.audit.OrgPolicyViolationInfo org_policy_violation_info = 1;</code>
     */
    public com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder
        getOrgPolicyViolationInfoOrBuilder() {
      if (orgPolicyViolationInfoBuilder_ != null) {
        return orgPolicyViolationInfoBuilder_.getMessageOrBuilder();
      } else {
        return orgPolicyViolationInfo_ == null
            ? com.google.cloud.audit.OrgPolicyViolationInfo.getDefaultInstance()
            : orgPolicyViolationInfo_;
      }
    }

    /**
     *
     *
     * <pre>
     * Indicates the orgpolicy violations for this resource.
     * </pre>
     *
     * <code>.google.cloud.audit.OrgPolicyViolationInfo org_policy_violation_info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.audit.OrgPolicyViolationInfo,
            com.google.cloud.audit.OrgPolicyViolationInfo.Builder,
            com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder>
        getOrgPolicyViolationInfoFieldBuilder() {
      if (orgPolicyViolationInfoBuilder_ == null) {
        orgPolicyViolationInfoBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.audit.OrgPolicyViolationInfo,
                com.google.cloud.audit.OrgPolicyViolationInfo.Builder,
                com.google.cloud.audit.OrgPolicyViolationInfoOrBuilder>(
                getOrgPolicyViolationInfo(), getParentForChildren(), isClean());
        orgPolicyViolationInfo_ = null;
      }
      return orgPolicyViolationInfoBuilder_;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.audit.PolicyViolationInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.audit.PolicyViolationInfo)
  private static final com.google.cloud.audit.PolicyViolationInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.audit.PolicyViolationInfo();
  }

  public static com.google.cloud.audit.PolicyViolationInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyViolationInfo> PARSER =
      new com.google.protobuf.AbstractParser<PolicyViolationInfo>() {
        @java.lang.Override
        public PolicyViolationInfo parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<PolicyViolationInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyViolationInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.audit.PolicyViolationInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
