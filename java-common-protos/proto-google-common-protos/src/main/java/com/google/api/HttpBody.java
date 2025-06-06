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
// source: google/api/httpbody.proto

// Protobuf Java Version: 3.25.8
package com.google.api;

/**
 *
 *
 * <pre>
 * Message that represents an arbitrary HTTP body. It should only be used for
 * payload formats that can't be represented as JSON, such as raw binary or
 * an HTML page.
 *
 *
 * This message can be used both in streaming and non-streaming API methods in
 * the request as well as the response.
 *
 * It can be used as a top-level request field, which is convenient if one
 * wants to extract parameters from either the URL or HTTP template into the
 * request fields and also want access to the raw HTTP body.
 *
 * Example:
 *
 *     message GetResourceRequest {
 *       // A unique request id.
 *       string request_id = 1;
 *
 *       // The raw HTTP body is bound to this field.
 *       google.api.HttpBody http_body = 2;
 *
 *     }
 *
 *     service ResourceService {
 *       rpc GetResource(GetResourceRequest)
 *         returns (google.api.HttpBody);
 *       rpc UpdateResource(google.api.HttpBody)
 *         returns (google.protobuf.Empty);
 *
 *     }
 *
 * Example with streaming methods:
 *
 *     service CaldavService {
 *       rpc GetCalendar(stream google.api.HttpBody)
 *         returns (stream google.api.HttpBody);
 *       rpc UpdateCalendar(stream google.api.HttpBody)
 *         returns (stream google.api.HttpBody);
 *
 *     }
 *
 * Use of this type only changes how the request and response bodies are
 * handled, all other features will continue to work unchanged.
 * </pre>
 *
 * Protobuf type {@code google.api.HttpBody}
 */
public final class HttpBody extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.HttpBody)
    HttpBodyOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use HttpBody.newBuilder() to construct.
  private HttpBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HttpBody() {
    contentType_ = "";
    data_ = com.google.protobuf.ByteString.EMPTY;
    extensions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new HttpBody();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.HttpBodyProto.internal_static_google_api_HttpBody_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.HttpBodyProto.internal_static_google_api_HttpBody_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.HttpBody.class, com.google.api.HttpBody.Builder.class);
  }

  public static final int CONTENT_TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object contentType_ = "";

  /**
   *
   *
   * <pre>
   * The HTTP Content-Type header value specifying the content type of the body.
   * </pre>
   *
   * <code>string content_type = 1;</code>
   *
   * @return The contentType.
   */
  @java.lang.Override
  public java.lang.String getContentType() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      contentType_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The HTTP Content-Type header value specifying the content type of the body.
   * </pre>
   *
   * <code>string content_type = 1;</code>
   *
   * @return The bytes for contentType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContentTypeBytes() {
    java.lang.Object ref = contentType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      contentType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;

  /**
   *
   *
   * <pre>
   * The HTTP request/response body as raw binary.
   * </pre>
   *
   * <code>bytes data = 2;</code>
   *
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  public static final int EXTENSIONS_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.Any> extensions_;

  /**
   *
   *
   * <pre>
   * Application specific response metadata. Must be set in the first response
   * for streaming APIs.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extensions = 3;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.Any> getExtensionsList() {
    return extensions_;
  }

  /**
   *
   *
   * <pre>
   * Application specific response metadata. Must be set in the first response
   * for streaming APIs.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extensions = 3;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.protobuf.AnyOrBuilder> getExtensionsOrBuilderList() {
    return extensions_;
  }

  /**
   *
   *
   * <pre>
   * Application specific response metadata. Must be set in the first response
   * for streaming APIs.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extensions = 3;</code>
   */
  @java.lang.Override
  public int getExtensionsCount() {
    return extensions_.size();
  }

  /**
   *
   *
   * <pre>
   * Application specific response metadata. Must be set in the first response
   * for streaming APIs.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extensions = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.Any getExtensions(int index) {
    return extensions_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Application specific response metadata. Must be set in the first response
   * for streaming APIs.
   * </pre>
   *
   * <code>repeated .google.protobuf.Any extensions = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getExtensionsOrBuilder(int index) {
    return extensions_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, contentType_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(2, data_);
    }
    for (int i = 0; i < extensions_.size(); i++) {
      output.writeMessage(3, extensions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(contentType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, contentType_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, data_);
    }
    for (int i = 0; i < extensions_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, extensions_.get(i));
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
    if (!(obj instanceof com.google.api.HttpBody)) {
      return super.equals(obj);
    }
    com.google.api.HttpBody other = (com.google.api.HttpBody) obj;

    if (!getContentType().equals(other.getContentType())) return false;
    if (!getData().equals(other.getData())) return false;
    if (!getExtensionsList().equals(other.getExtensionsList())) return false;
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
    hash = (37 * hash) + CONTENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getContentType().hashCode();
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    if (getExtensionsCount() > 0) {
      hash = (37 * hash) + EXTENSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getExtensionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.HttpBody parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.HttpBody parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.HttpBody parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.HttpBody parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.HttpBody parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.HttpBody parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.HttpBody parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.HttpBody parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.HttpBody parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.HttpBody parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.HttpBody parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.HttpBody parseFrom(
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

  public static Builder newBuilder(com.google.api.HttpBody prototype) {
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
   * Message that represents an arbitrary HTTP body. It should only be used for
   * payload formats that can't be represented as JSON, such as raw binary or
   * an HTML page.
   *
   *
   * This message can be used both in streaming and non-streaming API methods in
   * the request as well as the response.
   *
   * It can be used as a top-level request field, which is convenient if one
   * wants to extract parameters from either the URL or HTTP template into the
   * request fields and also want access to the raw HTTP body.
   *
   * Example:
   *
   *     message GetResourceRequest {
   *       // A unique request id.
   *       string request_id = 1;
   *
   *       // The raw HTTP body is bound to this field.
   *       google.api.HttpBody http_body = 2;
   *
   *     }
   *
   *     service ResourceService {
   *       rpc GetResource(GetResourceRequest)
   *         returns (google.api.HttpBody);
   *       rpc UpdateResource(google.api.HttpBody)
   *         returns (google.protobuf.Empty);
   *
   *     }
   *
   * Example with streaming methods:
   *
   *     service CaldavService {
   *       rpc GetCalendar(stream google.api.HttpBody)
   *         returns (stream google.api.HttpBody);
   *       rpc UpdateCalendar(stream google.api.HttpBody)
   *         returns (stream google.api.HttpBody);
   *
   *     }
   *
   * Use of this type only changes how the request and response bodies are
   * handled, all other features will continue to work unchanged.
   * </pre>
   *
   * Protobuf type {@code google.api.HttpBody}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.HttpBody)
      com.google.api.HttpBodyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.HttpBodyProto.internal_static_google_api_HttpBody_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.HttpBodyProto.internal_static_google_api_HttpBody_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.HttpBody.class, com.google.api.HttpBody.Builder.class);
    }

    // Construct using com.google.api.HttpBody.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      contentType_ = "";
      data_ = com.google.protobuf.ByteString.EMPTY;
      if (extensionsBuilder_ == null) {
        extensions_ = java.util.Collections.emptyList();
      } else {
        extensions_ = null;
        extensionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.HttpBodyProto.internal_static_google_api_HttpBody_descriptor;
    }

    @java.lang.Override
    public com.google.api.HttpBody getDefaultInstanceForType() {
      return com.google.api.HttpBody.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.HttpBody build() {
      com.google.api.HttpBody result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.HttpBody buildPartial() {
      com.google.api.HttpBody result = new com.google.api.HttpBody(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.api.HttpBody result) {
      if (extensionsBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)) {
          extensions_ = java.util.Collections.unmodifiableList(extensions_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.extensions_ = extensions_;
      } else {
        result.extensions_ = extensionsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.api.HttpBody result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contentType_ = contentType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.data_ = data_;
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
      if (other instanceof com.google.api.HttpBody) {
        return mergeFrom((com.google.api.HttpBody) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.HttpBody other) {
      if (other == com.google.api.HttpBody.getDefaultInstance()) return this;
      if (!other.getContentType().isEmpty()) {
        contentType_ = other.contentType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      if (extensionsBuilder_ == null) {
        if (!other.extensions_.isEmpty()) {
          if (extensions_.isEmpty()) {
            extensions_ = other.extensions_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureExtensionsIsMutable();
            extensions_.addAll(other.extensions_);
          }
          onChanged();
        }
      } else {
        if (!other.extensions_.isEmpty()) {
          if (extensionsBuilder_.isEmpty()) {
            extensionsBuilder_.dispose();
            extensionsBuilder_ = null;
            extensions_ = other.extensions_;
            bitField0_ = (bitField0_ & ~0x00000004);
            extensionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getExtensionsFieldBuilder()
                    : null;
          } else {
            extensionsBuilder_.addAllMessages(other.extensions_);
          }
        }
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
                contentType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                data_ = input.readBytes();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                com.google.protobuf.Any m =
                    input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
                if (extensionsBuilder_ == null) {
                  ensureExtensionsIsMutable();
                  extensions_.add(m);
                } else {
                  extensionsBuilder_.addMessage(m);
                }
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

    private java.lang.Object contentType_ = "";

    /**
     *
     *
     * <pre>
     * The HTTP Content-Type header value specifying the content type of the body.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     *
     * @return The contentType.
     */
    public java.lang.String getContentType() {
      java.lang.Object ref = contentType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        contentType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The HTTP Content-Type header value specifying the content type of the body.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     *
     * @return The bytes for contentType.
     */
    public com.google.protobuf.ByteString getContentTypeBytes() {
      java.lang.Object ref = contentType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        contentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The HTTP Content-Type header value specifying the content type of the body.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     *
     * @param value The contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      contentType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The HTTP Content-Type header value specifying the content type of the body.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContentType() {
      contentType_ = getDefaultInstance().getContentType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The HTTP Content-Type header value specifying the content type of the body.
     * </pre>
     *
     * <code>string content_type = 1;</code>
     *
     * @param value The bytes for contentType to set.
     * @return This builder for chaining.
     */
    public Builder setContentTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      contentType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;

    /**
     *
     *
     * <pre>
     * The HTTP request/response body as raw binary.
     * </pre>
     *
     * <code>bytes data = 2;</code>
     *
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    /**
     *
     *
     * <pre>
     * The HTTP request/response body as raw binary.
     * </pre>
     *
     * <code>bytes data = 2;</code>
     *
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      data_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The HTTP request/response body as raw binary.
     * </pre>
     *
     * <code>bytes data = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000002);
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.Any> extensions_ = java.util.Collections.emptyList();

    private void ensureExtensionsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        extensions_ = new java.util.ArrayList<com.google.protobuf.Any>(extensions_);
        bitField0_ |= 0x00000004;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Any,
            com.google.protobuf.Any.Builder,
            com.google.protobuf.AnyOrBuilder>
        extensionsBuilder_;

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public java.util.List<com.google.protobuf.Any> getExtensionsList() {
      if (extensionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(extensions_);
      } else {
        return extensionsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public int getExtensionsCount() {
      if (extensionsBuilder_ == null) {
        return extensions_.size();
      } else {
        return extensionsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public com.google.protobuf.Any getExtensions(int index) {
      if (extensionsBuilder_ == null) {
        return extensions_.get(index);
      } else {
        return extensionsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public Builder setExtensions(int index, com.google.protobuf.Any value) {
      if (extensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtensionsIsMutable();
        extensions_.set(index, value);
        onChanged();
      } else {
        extensionsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public Builder setExtensions(int index, com.google.protobuf.Any.Builder builderForValue) {
      if (extensionsBuilder_ == null) {
        ensureExtensionsIsMutable();
        extensions_.set(index, builderForValue.build());
        onChanged();
      } else {
        extensionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public Builder addExtensions(com.google.protobuf.Any value) {
      if (extensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtensionsIsMutable();
        extensions_.add(value);
        onChanged();
      } else {
        extensionsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public Builder addExtensions(int index, com.google.protobuf.Any value) {
      if (extensionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureExtensionsIsMutable();
        extensions_.add(index, value);
        onChanged();
      } else {
        extensionsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public Builder addExtensions(com.google.protobuf.Any.Builder builderForValue) {
      if (extensionsBuilder_ == null) {
        ensureExtensionsIsMutable();
        extensions_.add(builderForValue.build());
        onChanged();
      } else {
        extensionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public Builder addExtensions(int index, com.google.protobuf.Any.Builder builderForValue) {
      if (extensionsBuilder_ == null) {
        ensureExtensionsIsMutable();
        extensions_.add(index, builderForValue.build());
        onChanged();
      } else {
        extensionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public Builder addAllExtensions(java.lang.Iterable<? extends com.google.protobuf.Any> values) {
      if (extensionsBuilder_ == null) {
        ensureExtensionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, extensions_);
        onChanged();
      } else {
        extensionsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public Builder clearExtensions() {
      if (extensionsBuilder_ == null) {
        extensions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        extensionsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public Builder removeExtensions(int index) {
      if (extensionsBuilder_ == null) {
        ensureExtensionsIsMutable();
        extensions_.remove(index);
        onChanged();
      } else {
        extensionsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public com.google.protobuf.Any.Builder getExtensionsBuilder(int index) {
      return getExtensionsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public com.google.protobuf.AnyOrBuilder getExtensionsOrBuilder(int index) {
      if (extensionsBuilder_ == null) {
        return extensions_.get(index);
      } else {
        return extensionsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public java.util.List<? extends com.google.protobuf.AnyOrBuilder> getExtensionsOrBuilderList() {
      if (extensionsBuilder_ != null) {
        return extensionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(extensions_);
      }
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public com.google.protobuf.Any.Builder addExtensionsBuilder() {
      return getExtensionsFieldBuilder().addBuilder(com.google.protobuf.Any.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public com.google.protobuf.Any.Builder addExtensionsBuilder(int index) {
      return getExtensionsFieldBuilder()
          .addBuilder(index, com.google.protobuf.Any.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Application specific response metadata. Must be set in the first response
     * for streaming APIs.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any extensions = 3;</code>
     */
    public java.util.List<com.google.protobuf.Any.Builder> getExtensionsBuilderList() {
      return getExtensionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.protobuf.Any,
            com.google.protobuf.Any.Builder,
            com.google.protobuf.AnyOrBuilder>
        getExtensionsFieldBuilder() {
      if (extensionsBuilder_ == null) {
        extensionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.protobuf.Any,
                com.google.protobuf.Any.Builder,
                com.google.protobuf.AnyOrBuilder>(
                extensions_, ((bitField0_ & 0x00000004) != 0), getParentForChildren(), isClean());
        extensions_ = null;
      }
      return extensionsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.api.HttpBody)
  }

  // @@protoc_insertion_point(class_scope:google.api.HttpBody)
  private static final com.google.api.HttpBody DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.HttpBody();
  }

  public static com.google.api.HttpBody getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HttpBody> PARSER =
      new com.google.protobuf.AbstractParser<HttpBody>() {
        @java.lang.Override
        public HttpBody parsePartialFrom(
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

  public static com.google.protobuf.Parser<HttpBody> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HttpBody> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.HttpBody getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
