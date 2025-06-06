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
// source: google/api/policy.proto

// Protobuf Java Version: 3.25.8
package com.google.api;

/**
 *
 *
 * <pre>
 * Google API Policy Annotation
 *
 * This message defines a simple API policy annotation that can be used to
 * annotate API request and response message fields with applicable policies.
 * One field may have multiple applicable policies that must all be satisfied
 * before a request can be processed. This policy annotation is used to
 * generate the overall policy that will be used for automatic runtime
 * policy enforcement and documentation generation.
 * </pre>
 *
 * Protobuf type {@code google.api.FieldPolicy}
 */
public final class FieldPolicy extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.FieldPolicy)
    FieldPolicyOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use FieldPolicy.newBuilder() to construct.
  private FieldPolicy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FieldPolicy() {
    selector_ = "";
    resourcePermission_ = "";
    resourceType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FieldPolicy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.PolicyProto.internal_static_google_api_FieldPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.PolicyProto.internal_static_google_api_FieldPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.FieldPolicy.class, com.google.api.FieldPolicy.Builder.class);
  }

  public static final int SELECTOR_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object selector_ = "";

  /**
   *
   *
   * <pre>
   * Selects one or more request or response message fields to apply this
   * `FieldPolicy`.
   *
   * When a `FieldPolicy` is used in proto annotation, the selector must
   * be left as empty. The service config generator will automatically fill
   * the correct value.
   *
   * When a `FieldPolicy` is used in service config, the selector must be a
   * comma-separated string with valid request or response field paths,
   * such as "foo.bar" or "foo.bar,foo.baz".
   * </pre>
   *
   * <code>string selector = 1;</code>
   *
   * @return The selector.
   */
  @java.lang.Override
  public java.lang.String getSelector() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      selector_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Selects one or more request or response message fields to apply this
   * `FieldPolicy`.
   *
   * When a `FieldPolicy` is used in proto annotation, the selector must
   * be left as empty. The service config generator will automatically fill
   * the correct value.
   *
   * When a `FieldPolicy` is used in service config, the selector must be a
   * comma-separated string with valid request or response field paths,
   * such as "foo.bar" or "foo.bar,foo.baz".
   * </pre>
   *
   * <code>string selector = 1;</code>
   *
   * @return The bytes for selector.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSelectorBytes() {
    java.lang.Object ref = selector_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      selector_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_PERMISSION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resourcePermission_ = "";

  /**
   *
   *
   * <pre>
   * Specifies the required permission(s) for the resource referred to by the
   * field. It requires the field contains a valid resource reference, and
   * the request must pass the permission checks to proceed. For example,
   * "resourcemanager.projects.get".
   * </pre>
   *
   * <code>string resource_permission = 2;</code>
   *
   * @return The resourcePermission.
   */
  @java.lang.Override
  public java.lang.String getResourcePermission() {
    java.lang.Object ref = resourcePermission_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourcePermission_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Specifies the required permission(s) for the resource referred to by the
   * field. It requires the field contains a valid resource reference, and
   * the request must pass the permission checks to proceed. For example,
   * "resourcemanager.projects.get".
   * </pre>
   *
   * <code>string resource_permission = 2;</code>
   *
   * @return The bytes for resourcePermission.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourcePermissionBytes() {
    java.lang.Object ref = resourcePermission_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourcePermission_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RESOURCE_TYPE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceType_ = "";

  /**
   *
   *
   * <pre>
   * Specifies the resource type for the resource referred to by the field.
   * </pre>
   *
   * <code>string resource_type = 3;</code>
   *
   * @return The resourceType.
   */
  @java.lang.Override
  public java.lang.String getResourceType() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceType_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Specifies the resource type for the resource referred to by the field.
   * </pre>
   *
   * <code>string resource_type = 3;</code>
   *
   * @return The bytes for resourceType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceTypeBytes() {
    java.lang.Object ref = resourceType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourceType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(selector_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, selector_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourcePermission_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, resourcePermission_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, resourceType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(selector_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, selector_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourcePermission_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, resourcePermission_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, resourceType_);
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
    if (!(obj instanceof com.google.api.FieldPolicy)) {
      return super.equals(obj);
    }
    com.google.api.FieldPolicy other = (com.google.api.FieldPolicy) obj;

    if (!getSelector().equals(other.getSelector())) return false;
    if (!getResourcePermission().equals(other.getResourcePermission())) return false;
    if (!getResourceType().equals(other.getResourceType())) return false;
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
    hash = (37 * hash) + SELECTOR_FIELD_NUMBER;
    hash = (53 * hash) + getSelector().hashCode();
    hash = (37 * hash) + RESOURCE_PERMISSION_FIELD_NUMBER;
    hash = (53 * hash) + getResourcePermission().hashCode();
    hash = (37 * hash) + RESOURCE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getResourceType().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.FieldPolicy parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.FieldPolicy parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.FieldPolicy parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.FieldPolicy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.FieldPolicy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.FieldPolicy parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.FieldPolicy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.FieldPolicy parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.FieldPolicy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.FieldPolicy parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.FieldPolicy parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.FieldPolicy parseFrom(
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

  public static Builder newBuilder(com.google.api.FieldPolicy prototype) {
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
   * Google API Policy Annotation
   *
   * This message defines a simple API policy annotation that can be used to
   * annotate API request and response message fields with applicable policies.
   * One field may have multiple applicable policies that must all be satisfied
   * before a request can be processed. This policy annotation is used to
   * generate the overall policy that will be used for automatic runtime
   * policy enforcement and documentation generation.
   * </pre>
   *
   * Protobuf type {@code google.api.FieldPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.FieldPolicy)
      com.google.api.FieldPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.PolicyProto.internal_static_google_api_FieldPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.PolicyProto.internal_static_google_api_FieldPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.FieldPolicy.class, com.google.api.FieldPolicy.Builder.class);
    }

    // Construct using com.google.api.FieldPolicy.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      selector_ = "";
      resourcePermission_ = "";
      resourceType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.PolicyProto.internal_static_google_api_FieldPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.api.FieldPolicy getDefaultInstanceForType() {
      return com.google.api.FieldPolicy.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.FieldPolicy build() {
      com.google.api.FieldPolicy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.FieldPolicy buildPartial() {
      com.google.api.FieldPolicy result = new com.google.api.FieldPolicy(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.FieldPolicy result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.selector_ = selector_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.resourcePermission_ = resourcePermission_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.resourceType_ = resourceType_;
      }
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
      if (other instanceof com.google.api.FieldPolicy) {
        return mergeFrom((com.google.api.FieldPolicy) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.FieldPolicy other) {
      if (other == com.google.api.FieldPolicy.getDefaultInstance()) return this;
      if (!other.getSelector().isEmpty()) {
        selector_ = other.selector_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getResourcePermission().isEmpty()) {
        resourcePermission_ = other.resourcePermission_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getResourceType().isEmpty()) {
        resourceType_ = other.resourceType_;
        bitField0_ |= 0x00000004;
        onChanged();
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
                selector_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                resourcePermission_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                resourceType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object selector_ = "";

    /**
     *
     *
     * <pre>
     * Selects one or more request or response message fields to apply this
     * `FieldPolicy`.
     *
     * When a `FieldPolicy` is used in proto annotation, the selector must
     * be left as empty. The service config generator will automatically fill
     * the correct value.
     *
     * When a `FieldPolicy` is used in service config, the selector must be a
     * comma-separated string with valid request or response field paths,
     * such as "foo.bar" or "foo.bar,foo.baz".
     * </pre>
     *
     * <code>string selector = 1;</code>
     *
     * @return The selector.
     */
    public java.lang.String getSelector() {
      java.lang.Object ref = selector_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        selector_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Selects one or more request or response message fields to apply this
     * `FieldPolicy`.
     *
     * When a `FieldPolicy` is used in proto annotation, the selector must
     * be left as empty. The service config generator will automatically fill
     * the correct value.
     *
     * When a `FieldPolicy` is used in service config, the selector must be a
     * comma-separated string with valid request or response field paths,
     * such as "foo.bar" or "foo.bar,foo.baz".
     * </pre>
     *
     * <code>string selector = 1;</code>
     *
     * @return The bytes for selector.
     */
    public com.google.protobuf.ByteString getSelectorBytes() {
      java.lang.Object ref = selector_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        selector_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Selects one or more request or response message fields to apply this
     * `FieldPolicy`.
     *
     * When a `FieldPolicy` is used in proto annotation, the selector must
     * be left as empty. The service config generator will automatically fill
     * the correct value.
     *
     * When a `FieldPolicy` is used in service config, the selector must be a
     * comma-separated string with valid request or response field paths,
     * such as "foo.bar" or "foo.bar,foo.baz".
     * </pre>
     *
     * <code>string selector = 1;</code>
     *
     * @param value The selector to set.
     * @return This builder for chaining.
     */
    public Builder setSelector(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      selector_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Selects one or more request or response message fields to apply this
     * `FieldPolicy`.
     *
     * When a `FieldPolicy` is used in proto annotation, the selector must
     * be left as empty. The service config generator will automatically fill
     * the correct value.
     *
     * When a `FieldPolicy` is used in service config, the selector must be a
     * comma-separated string with valid request or response field paths,
     * such as "foo.bar" or "foo.bar,foo.baz".
     * </pre>
     *
     * <code>string selector = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSelector() {
      selector_ = getDefaultInstance().getSelector();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Selects one or more request or response message fields to apply this
     * `FieldPolicy`.
     *
     * When a `FieldPolicy` is used in proto annotation, the selector must
     * be left as empty. The service config generator will automatically fill
     * the correct value.
     *
     * When a `FieldPolicy` is used in service config, the selector must be a
     * comma-separated string with valid request or response field paths,
     * such as "foo.bar" or "foo.bar,foo.baz".
     * </pre>
     *
     * <code>string selector = 1;</code>
     *
     * @param value The bytes for selector to set.
     * @return This builder for chaining.
     */
    public Builder setSelectorBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      selector_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object resourcePermission_ = "";

    /**
     *
     *
     * <pre>
     * Specifies the required permission(s) for the resource referred to by the
     * field. It requires the field contains a valid resource reference, and
     * the request must pass the permission checks to proceed. For example,
     * "resourcemanager.projects.get".
     * </pre>
     *
     * <code>string resource_permission = 2;</code>
     *
     * @return The resourcePermission.
     */
    public java.lang.String getResourcePermission() {
      java.lang.Object ref = resourcePermission_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourcePermission_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Specifies the required permission(s) for the resource referred to by the
     * field. It requires the field contains a valid resource reference, and
     * the request must pass the permission checks to proceed. For example,
     * "resourcemanager.projects.get".
     * </pre>
     *
     * <code>string resource_permission = 2;</code>
     *
     * @return The bytes for resourcePermission.
     */
    public com.google.protobuf.ByteString getResourcePermissionBytes() {
      java.lang.Object ref = resourcePermission_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourcePermission_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Specifies the required permission(s) for the resource referred to by the
     * field. It requires the field contains a valid resource reference, and
     * the request must pass the permission checks to proceed. For example,
     * "resourcemanager.projects.get".
     * </pre>
     *
     * <code>string resource_permission = 2;</code>
     *
     * @param value The resourcePermission to set.
     * @return This builder for chaining.
     */
    public Builder setResourcePermission(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resourcePermission_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specifies the required permission(s) for the resource referred to by the
     * field. It requires the field contains a valid resource reference, and
     * the request must pass the permission checks to proceed. For example,
     * "resourcemanager.projects.get".
     * </pre>
     *
     * <code>string resource_permission = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourcePermission() {
      resourcePermission_ = getDefaultInstance().getResourcePermission();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specifies the required permission(s) for the resource referred to by the
     * field. It requires the field contains a valid resource reference, and
     * the request must pass the permission checks to proceed. For example,
     * "resourcemanager.projects.get".
     * </pre>
     *
     * <code>string resource_permission = 2;</code>
     *
     * @param value The bytes for resourcePermission to set.
     * @return This builder for chaining.
     */
    public Builder setResourcePermissionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resourcePermission_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object resourceType_ = "";

    /**
     *
     *
     * <pre>
     * Specifies the resource type for the resource referred to by the field.
     * </pre>
     *
     * <code>string resource_type = 3;</code>
     *
     * @return The resourceType.
     */
    public java.lang.String getResourceType() {
      java.lang.Object ref = resourceType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Specifies the resource type for the resource referred to by the field.
     * </pre>
     *
     * <code>string resource_type = 3;</code>
     *
     * @return The bytes for resourceType.
     */
    public com.google.protobuf.ByteString getResourceTypeBytes() {
      java.lang.Object ref = resourceType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourceType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Specifies the resource type for the resource referred to by the field.
     * </pre>
     *
     * <code>string resource_type = 3;</code>
     *
     * @param value The resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resourceType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specifies the resource type for the resource referred to by the field.
     * </pre>
     *
     * <code>string resource_type = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceType() {
      resourceType_ = getDefaultInstance().getResourceType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specifies the resource type for the resource referred to by the field.
     * </pre>
     *
     * <code>string resource_type = 3;</code>
     *
     * @param value The bytes for resourceType to set.
     * @return This builder for chaining.
     */
    public Builder setResourceTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resourceType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
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

    // @@protoc_insertion_point(builder_scope:google.api.FieldPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.api.FieldPolicy)
  private static final com.google.api.FieldPolicy DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.FieldPolicy();
  }

  public static com.google.api.FieldPolicy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FieldPolicy> PARSER =
      new com.google.protobuf.AbstractParser<FieldPolicy>() {
        @java.lang.Override
        public FieldPolicy parsePartialFrom(
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

  public static com.google.protobuf.Parser<FieldPolicy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FieldPolicy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.FieldPolicy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
