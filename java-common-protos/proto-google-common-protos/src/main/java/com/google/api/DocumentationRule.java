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
// source: google/api/documentation.proto

// Protobuf Java Version: 3.25.8
package com.google.api;

/**
 *
 *
 * <pre>
 * A documentation rule provides information about individual API elements.
 * </pre>
 *
 * Protobuf type {@code google.api.DocumentationRule}
 */
public final class DocumentationRule extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.DocumentationRule)
    DocumentationRuleOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DocumentationRule.newBuilder() to construct.
  private DocumentationRule(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DocumentationRule() {
    selector_ = "";
    description_ = "";
    deprecationDescription_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DocumentationRule();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.DocumentationProto
        .internal_static_google_api_DocumentationRule_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.DocumentationProto
        .internal_static_google_api_DocumentationRule_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.DocumentationRule.class, com.google.api.DocumentationRule.Builder.class);
  }

  public static final int SELECTOR_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object selector_ = "";

  /**
   *
   *
   * <pre>
   * The selector is a comma-separated list of patterns for any element such as
   * a method, a field, an enum value. Each pattern is a qualified name of the
   * element which may end in "*", indicating a wildcard. Wildcards are only
   * allowed at the end and for a whole component of the qualified name,
   * i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A wildcard will match
   * one or more components. To specify a default for all applicable elements,
   * the whole pattern "*" is used.
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
   * The selector is a comma-separated list of patterns for any element such as
   * a method, a field, an enum value. Each pattern is a qualified name of the
   * element which may end in "*", indicating a wildcard. Wildcards are only
   * allowed at the end and for a whole component of the qualified name,
   * i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A wildcard will match
   * one or more components. To specify a default for all applicable elements,
   * the whole pattern "*" is used.
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

  public static final int DESCRIPTION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";

  /**
   *
   *
   * <pre>
   * Description of the selected proto element (e.g. a message, a method, a
   * 'service' definition, or a field). Defaults to leading &amp; trailing comments
   * taken from the proto source definition of the proto element.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Description of the selected proto element (e.g. a message, a method, a
   * 'service' definition, or a field). Defaults to leading &amp; trailing comments
   * taken from the proto source definition of the proto element.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPRECATION_DESCRIPTION_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object deprecationDescription_ = "";

  /**
   *
   *
   * <pre>
   * Deprecation description of the selected element(s). It can be provided if
   * an element is marked as `deprecated`.
   * </pre>
   *
   * <code>string deprecation_description = 3;</code>
   *
   * @return The deprecationDescription.
   */
  @java.lang.Override
  public java.lang.String getDeprecationDescription() {
    java.lang.Object ref = deprecationDescription_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deprecationDescription_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Deprecation description of the selected element(s). It can be provided if
   * an element is marked as `deprecated`.
   * </pre>
   *
   * <code>string deprecation_description = 3;</code>
   *
   * @return The bytes for deprecationDescription.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDeprecationDescriptionBytes() {
    java.lang.Object ref = deprecationDescription_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      deprecationDescription_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deprecationDescription_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, deprecationDescription_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deprecationDescription_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, deprecationDescription_);
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
    if (!(obj instanceof com.google.api.DocumentationRule)) {
      return super.equals(obj);
    }
    com.google.api.DocumentationRule other = (com.google.api.DocumentationRule) obj;

    if (!getSelector().equals(other.getSelector())) return false;
    if (!getDescription().equals(other.getDescription())) return false;
    if (!getDeprecationDescription().equals(other.getDeprecationDescription())) return false;
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
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + DEPRECATION_DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDeprecationDescription().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.DocumentationRule parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.DocumentationRule parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.DocumentationRule parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.DocumentationRule parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.DocumentationRule parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.DocumentationRule parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.DocumentationRule parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.DocumentationRule parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.DocumentationRule parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.DocumentationRule parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.DocumentationRule parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.DocumentationRule parseFrom(
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

  public static Builder newBuilder(com.google.api.DocumentationRule prototype) {
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
   * A documentation rule provides information about individual API elements.
   * </pre>
   *
   * Protobuf type {@code google.api.DocumentationRule}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.DocumentationRule)
      com.google.api.DocumentationRuleOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.DocumentationProto
          .internal_static_google_api_DocumentationRule_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.DocumentationProto
          .internal_static_google_api_DocumentationRule_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.DocumentationRule.class,
              com.google.api.DocumentationRule.Builder.class);
    }

    // Construct using com.google.api.DocumentationRule.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      selector_ = "";
      description_ = "";
      deprecationDescription_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.DocumentationProto
          .internal_static_google_api_DocumentationRule_descriptor;
    }

    @java.lang.Override
    public com.google.api.DocumentationRule getDefaultInstanceForType() {
      return com.google.api.DocumentationRule.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.DocumentationRule build() {
      com.google.api.DocumentationRule result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.DocumentationRule buildPartial() {
      com.google.api.DocumentationRule result = new com.google.api.DocumentationRule(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.DocumentationRule result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.selector_ = selector_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.deprecationDescription_ = deprecationDescription_;
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
      if (other instanceof com.google.api.DocumentationRule) {
        return mergeFrom((com.google.api.DocumentationRule) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.DocumentationRule other) {
      if (other == com.google.api.DocumentationRule.getDefaultInstance()) return this;
      if (!other.getSelector().isEmpty()) {
        selector_ = other.selector_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDeprecationDescription().isEmpty()) {
        deprecationDescription_ = other.deprecationDescription_;
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
                description_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                deprecationDescription_ = input.readStringRequireUtf8();
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
     * The selector is a comma-separated list of patterns for any element such as
     * a method, a field, an enum value. Each pattern is a qualified name of the
     * element which may end in "*", indicating a wildcard. Wildcards are only
     * allowed at the end and for a whole component of the qualified name,
     * i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A wildcard will match
     * one or more components. To specify a default for all applicable elements,
     * the whole pattern "*" is used.
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
     * The selector is a comma-separated list of patterns for any element such as
     * a method, a field, an enum value. Each pattern is a qualified name of the
     * element which may end in "*", indicating a wildcard. Wildcards are only
     * allowed at the end and for a whole component of the qualified name,
     * i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A wildcard will match
     * one or more components. To specify a default for all applicable elements,
     * the whole pattern "*" is used.
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
     * The selector is a comma-separated list of patterns for any element such as
     * a method, a field, an enum value. Each pattern is a qualified name of the
     * element which may end in "*", indicating a wildcard. Wildcards are only
     * allowed at the end and for a whole component of the qualified name,
     * i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A wildcard will match
     * one or more components. To specify a default for all applicable elements,
     * the whole pattern "*" is used.
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
     * The selector is a comma-separated list of patterns for any element such as
     * a method, a field, an enum value. Each pattern is a qualified name of the
     * element which may end in "*", indicating a wildcard. Wildcards are only
     * allowed at the end and for a whole component of the qualified name,
     * i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A wildcard will match
     * one or more components. To specify a default for all applicable elements,
     * the whole pattern "*" is used.
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
     * The selector is a comma-separated list of patterns for any element such as
     * a method, a field, an enum value. Each pattern is a qualified name of the
     * element which may end in "*", indicating a wildcard. Wildcards are only
     * allowed at the end and for a whole component of the qualified name,
     * i.e. "foo.*" is ok, but not "foo.b*" or "foo.*.bar". A wildcard will match
     * one or more components. To specify a default for all applicable elements,
     * the whole pattern "*" is used.
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

    private java.lang.Object description_ = "";

    /**
     *
     *
     * <pre>
     * Description of the selected proto element (e.g. a message, a method, a
     * 'service' definition, or a field). Defaults to leading &amp; trailing comments
     * taken from the proto source definition of the proto element.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Description of the selected proto element (e.g. a message, a method, a
     * 'service' definition, or a field). Defaults to leading &amp; trailing comments
     * taken from the proto source definition of the proto element.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Description of the selected proto element (e.g. a message, a method, a
     * 'service' definition, or a field). Defaults to leading &amp; trailing comments
     * taken from the proto source definition of the proto element.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Description of the selected proto element (e.g. a message, a method, a
     * 'service' definition, or a field). Defaults to leading &amp; trailing comments
     * taken from the proto source definition of the proto element.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Description of the selected proto element (e.g. a message, a method, a
     * 'service' definition, or a field). Defaults to leading &amp; trailing comments
     * taken from the proto source definition of the proto element.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object deprecationDescription_ = "";

    /**
     *
     *
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     *
     * @return The deprecationDescription.
     */
    public java.lang.String getDeprecationDescription() {
      java.lang.Object ref = deprecationDescription_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deprecationDescription_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     *
     * @return The bytes for deprecationDescription.
     */
    public com.google.protobuf.ByteString getDeprecationDescriptionBytes() {
      java.lang.Object ref = deprecationDescription_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        deprecationDescription_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     *
     * @param value The deprecationDescription to set.
     * @return This builder for chaining.
     */
    public Builder setDeprecationDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      deprecationDescription_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeprecationDescription() {
      deprecationDescription_ = getDefaultInstance().getDeprecationDescription();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Deprecation description of the selected element(s). It can be provided if
     * an element is marked as `deprecated`.
     * </pre>
     *
     * <code>string deprecation_description = 3;</code>
     *
     * @param value The bytes for deprecationDescription to set.
     * @return This builder for chaining.
     */
    public Builder setDeprecationDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      deprecationDescription_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.api.DocumentationRule)
  }

  // @@protoc_insertion_point(class_scope:google.api.DocumentationRule)
  private static final com.google.api.DocumentationRule DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.DocumentationRule();
  }

  public static com.google.api.DocumentationRule getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DocumentationRule> PARSER =
      new com.google.protobuf.AbstractParser<DocumentationRule>() {
        @java.lang.Override
        public DocumentationRule parsePartialFrom(
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

  public static com.google.protobuf.Parser<DocumentationRule> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DocumentationRule> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.DocumentationRule getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
