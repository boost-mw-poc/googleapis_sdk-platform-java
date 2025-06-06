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
// source: schema/google/showcase/v1beta1/messaging.proto

// Protobuf Java Version: 3.25.8
package com.google.showcase.v1beta1;

/**
 *
 *
 * <pre>
 * The operation metadata message for the
 * google.showcase.v1beta1.Messaging&#92;SearchBlurbs method.
 * </pre>
 *
 * Protobuf type {@code google.showcase.v1beta1.SearchBlurbsMetadata}
 */
public final class SearchBlurbsMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.SearchBlurbsMetadata)
    SearchBlurbsMetadataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SearchBlurbsMetadata.newBuilder() to construct.
  private SearchBlurbsMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchBlurbsMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchBlurbsMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.showcase.v1beta1.MessagingOuterClass
        .internal_static_google_showcase_v1beta1_SearchBlurbsMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.MessagingOuterClass
        .internal_static_google_showcase_v1beta1_SearchBlurbsMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.SearchBlurbsMetadata.class,
            com.google.showcase.v1beta1.SearchBlurbsMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int RETRY_INFO_FIELD_NUMBER = 1;
  private com.google.rpc.RetryInfo retryInfo_;

  /**
   *
   *
   * <pre>
   * This signals to the client when to next poll for response.
   * </pre>
   *
   * <code>.google.rpc.RetryInfo retry_info = 1;</code>
   *
   * @return Whether the retryInfo field is set.
   */
  @java.lang.Override
  public boolean hasRetryInfo() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * This signals to the client when to next poll for response.
   * </pre>
   *
   * <code>.google.rpc.RetryInfo retry_info = 1;</code>
   *
   * @return The retryInfo.
   */
  @java.lang.Override
  public com.google.rpc.RetryInfo getRetryInfo() {
    return retryInfo_ == null ? com.google.rpc.RetryInfo.getDefaultInstance() : retryInfo_;
  }

  /**
   *
   *
   * <pre>
   * This signals to the client when to next poll for response.
   * </pre>
   *
   * <code>.google.rpc.RetryInfo retry_info = 1;</code>
   */
  @java.lang.Override
  public com.google.rpc.RetryInfoOrBuilder getRetryInfoOrBuilder() {
    return retryInfo_ == null ? com.google.rpc.RetryInfo.getDefaultInstance() : retryInfo_;
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
      output.writeMessage(1, getRetryInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRetryInfo());
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
    if (!(obj instanceof com.google.showcase.v1beta1.SearchBlurbsMetadata)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.SearchBlurbsMetadata other =
        (com.google.showcase.v1beta1.SearchBlurbsMetadata) obj;

    if (hasRetryInfo() != other.hasRetryInfo()) return false;
    if (hasRetryInfo()) {
      if (!getRetryInfo().equals(other.getRetryInfo())) return false;
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
    if (hasRetryInfo()) {
      hash = (37 * hash) + RETRY_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getRetryInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.SearchBlurbsMetadata parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.showcase.v1beta1.SearchBlurbsMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.SearchBlurbsMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.showcase.v1beta1.SearchBlurbsMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.SearchBlurbsMetadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.showcase.v1beta1.SearchBlurbsMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.SearchBlurbsMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.SearchBlurbsMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.SearchBlurbsMetadata parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.SearchBlurbsMetadata parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.SearchBlurbsMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.SearchBlurbsMetadata parseFrom(
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

  public static Builder newBuilder(com.google.showcase.v1beta1.SearchBlurbsMetadata prototype) {
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
   * The operation metadata message for the
   * google.showcase.v1beta1.Messaging&#92;SearchBlurbs method.
   * </pre>
   *
   * Protobuf type {@code google.showcase.v1beta1.SearchBlurbsMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.SearchBlurbsMetadata)
      com.google.showcase.v1beta1.SearchBlurbsMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.showcase.v1beta1.MessagingOuterClass
          .internal_static_google_showcase_v1beta1_SearchBlurbsMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.MessagingOuterClass
          .internal_static_google_showcase_v1beta1_SearchBlurbsMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.SearchBlurbsMetadata.class,
              com.google.showcase.v1beta1.SearchBlurbsMetadata.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.SearchBlurbsMetadata.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRetryInfoFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      retryInfo_ = null;
      if (retryInfoBuilder_ != null) {
        retryInfoBuilder_.dispose();
        retryInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.showcase.v1beta1.MessagingOuterClass
          .internal_static_google_showcase_v1beta1_SearchBlurbsMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.SearchBlurbsMetadata getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.SearchBlurbsMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.SearchBlurbsMetadata build() {
      com.google.showcase.v1beta1.SearchBlurbsMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.SearchBlurbsMetadata buildPartial() {
      com.google.showcase.v1beta1.SearchBlurbsMetadata result =
          new com.google.showcase.v1beta1.SearchBlurbsMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.showcase.v1beta1.SearchBlurbsMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.retryInfo_ = retryInfoBuilder_ == null ? retryInfo_ : retryInfoBuilder_.build();
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
      if (other instanceof com.google.showcase.v1beta1.SearchBlurbsMetadata) {
        return mergeFrom((com.google.showcase.v1beta1.SearchBlurbsMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.SearchBlurbsMetadata other) {
      if (other == com.google.showcase.v1beta1.SearchBlurbsMetadata.getDefaultInstance())
        return this;
      if (other.hasRetryInfo()) {
        mergeRetryInfo(other.getRetryInfo());
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
                input.readMessage(getRetryInfoFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.rpc.RetryInfo retryInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.RetryInfo,
            com.google.rpc.RetryInfo.Builder,
            com.google.rpc.RetryInfoOrBuilder>
        retryInfoBuilder_;

    /**
     *
     *
     * <pre>
     * This signals to the client when to next poll for response.
     * </pre>
     *
     * <code>.google.rpc.RetryInfo retry_info = 1;</code>
     *
     * @return Whether the retryInfo field is set.
     */
    public boolean hasRetryInfo() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * This signals to the client when to next poll for response.
     * </pre>
     *
     * <code>.google.rpc.RetryInfo retry_info = 1;</code>
     *
     * @return The retryInfo.
     */
    public com.google.rpc.RetryInfo getRetryInfo() {
      if (retryInfoBuilder_ == null) {
        return retryInfo_ == null ? com.google.rpc.RetryInfo.getDefaultInstance() : retryInfo_;
      } else {
        return retryInfoBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * This signals to the client when to next poll for response.
     * </pre>
     *
     * <code>.google.rpc.RetryInfo retry_info = 1;</code>
     */
    public Builder setRetryInfo(com.google.rpc.RetryInfo value) {
      if (retryInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        retryInfo_ = value;
      } else {
        retryInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * This signals to the client when to next poll for response.
     * </pre>
     *
     * <code>.google.rpc.RetryInfo retry_info = 1;</code>
     */
    public Builder setRetryInfo(com.google.rpc.RetryInfo.Builder builderForValue) {
      if (retryInfoBuilder_ == null) {
        retryInfo_ = builderForValue.build();
      } else {
        retryInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * This signals to the client when to next poll for response.
     * </pre>
     *
     * <code>.google.rpc.RetryInfo retry_info = 1;</code>
     */
    public Builder mergeRetryInfo(com.google.rpc.RetryInfo value) {
      if (retryInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && retryInfo_ != null
            && retryInfo_ != com.google.rpc.RetryInfo.getDefaultInstance()) {
          getRetryInfoBuilder().mergeFrom(value);
        } else {
          retryInfo_ = value;
        }
      } else {
        retryInfoBuilder_.mergeFrom(value);
      }
      if (retryInfo_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * This signals to the client when to next poll for response.
     * </pre>
     *
     * <code>.google.rpc.RetryInfo retry_info = 1;</code>
     */
    public Builder clearRetryInfo() {
      bitField0_ = (bitField0_ & ~0x00000001);
      retryInfo_ = null;
      if (retryInfoBuilder_ != null) {
        retryInfoBuilder_.dispose();
        retryInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * This signals to the client when to next poll for response.
     * </pre>
     *
     * <code>.google.rpc.RetryInfo retry_info = 1;</code>
     */
    public com.google.rpc.RetryInfo.Builder getRetryInfoBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRetryInfoFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * This signals to the client when to next poll for response.
     * </pre>
     *
     * <code>.google.rpc.RetryInfo retry_info = 1;</code>
     */
    public com.google.rpc.RetryInfoOrBuilder getRetryInfoOrBuilder() {
      if (retryInfoBuilder_ != null) {
        return retryInfoBuilder_.getMessageOrBuilder();
      } else {
        return retryInfo_ == null ? com.google.rpc.RetryInfo.getDefaultInstance() : retryInfo_;
      }
    }

    /**
     *
     *
     * <pre>
     * This signals to the client when to next poll for response.
     * </pre>
     *
     * <code>.google.rpc.RetryInfo retry_info = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.rpc.RetryInfo,
            com.google.rpc.RetryInfo.Builder,
            com.google.rpc.RetryInfoOrBuilder>
        getRetryInfoFieldBuilder() {
      if (retryInfoBuilder_ == null) {
        retryInfoBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.rpc.RetryInfo,
                com.google.rpc.RetryInfo.Builder,
                com.google.rpc.RetryInfoOrBuilder>(
                getRetryInfo(), getParentForChildren(), isClean());
        retryInfo_ = null;
      }
      return retryInfoBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.SearchBlurbsMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.SearchBlurbsMetadata)
  private static final com.google.showcase.v1beta1.SearchBlurbsMetadata DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.SearchBlurbsMetadata();
  }

  public static com.google.showcase.v1beta1.SearchBlurbsMetadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchBlurbsMetadata> PARSER =
      new com.google.protobuf.AbstractParser<SearchBlurbsMetadata>() {
        @java.lang.Override
        public SearchBlurbsMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchBlurbsMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchBlurbsMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.SearchBlurbsMetadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
