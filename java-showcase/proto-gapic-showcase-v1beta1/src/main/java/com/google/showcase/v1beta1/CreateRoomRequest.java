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
 * The request message for the google.showcase.v1beta1.Messaging&#92;CreateRoom
 * method.
 * </pre>
 *
 * Protobuf type {@code google.showcase.v1beta1.CreateRoomRequest}
 */
public final class CreateRoomRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.showcase.v1beta1.CreateRoomRequest)
    CreateRoomRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CreateRoomRequest.newBuilder() to construct.
  private CreateRoomRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateRoomRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateRoomRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.showcase.v1beta1.MessagingOuterClass
        .internal_static_google_showcase_v1beta1_CreateRoomRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.showcase.v1beta1.MessagingOuterClass
        .internal_static_google_showcase_v1beta1_CreateRoomRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.showcase.v1beta1.CreateRoomRequest.class,
            com.google.showcase.v1beta1.CreateRoomRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ROOM_FIELD_NUMBER = 1;
  private com.google.showcase.v1beta1.Room room_;

  /**
   *
   *
   * <pre>
   * The room to create.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Room room = 1;</code>
   *
   * @return Whether the room field is set.
   */
  @java.lang.Override
  public boolean hasRoom() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The room to create.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Room room = 1;</code>
   *
   * @return The room.
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.Room getRoom() {
    return room_ == null ? com.google.showcase.v1beta1.Room.getDefaultInstance() : room_;
  }

  /**
   *
   *
   * <pre>
   * The room to create.
   * </pre>
   *
   * <code>.google.showcase.v1beta1.Room room = 1;</code>
   */
  @java.lang.Override
  public com.google.showcase.v1beta1.RoomOrBuilder getRoomOrBuilder() {
    return room_ == null ? com.google.showcase.v1beta1.Room.getDefaultInstance() : room_;
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
      output.writeMessage(1, getRoom());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRoom());
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
    if (!(obj instanceof com.google.showcase.v1beta1.CreateRoomRequest)) {
      return super.equals(obj);
    }
    com.google.showcase.v1beta1.CreateRoomRequest other =
        (com.google.showcase.v1beta1.CreateRoomRequest) obj;

    if (hasRoom() != other.hasRoom()) return false;
    if (hasRoom()) {
      if (!getRoom().equals(other.getRoom())) return false;
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
    if (hasRoom()) {
      hash = (37 * hash) + ROOM_FIELD_NUMBER;
      hash = (53 * hash) + getRoom().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.showcase.v1beta1.CreateRoomRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.showcase.v1beta1.CreateRoomRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.CreateRoomRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.showcase.v1beta1.CreateRoomRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.CreateRoomRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.showcase.v1beta1.CreateRoomRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.CreateRoomRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.CreateRoomRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.CreateRoomRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.CreateRoomRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.showcase.v1beta1.CreateRoomRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.showcase.v1beta1.CreateRoomRequest parseFrom(
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

  public static Builder newBuilder(com.google.showcase.v1beta1.CreateRoomRequest prototype) {
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
   * The request message for the google.showcase.v1beta1.Messaging&#92;CreateRoom
   * method.
   * </pre>
   *
   * Protobuf type {@code google.showcase.v1beta1.CreateRoomRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.showcase.v1beta1.CreateRoomRequest)
      com.google.showcase.v1beta1.CreateRoomRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.showcase.v1beta1.MessagingOuterClass
          .internal_static_google_showcase_v1beta1_CreateRoomRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.showcase.v1beta1.MessagingOuterClass
          .internal_static_google_showcase_v1beta1_CreateRoomRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.showcase.v1beta1.CreateRoomRequest.class,
              com.google.showcase.v1beta1.CreateRoomRequest.Builder.class);
    }

    // Construct using com.google.showcase.v1beta1.CreateRoomRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRoomFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      room_ = null;
      if (roomBuilder_ != null) {
        roomBuilder_.dispose();
        roomBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.showcase.v1beta1.MessagingOuterClass
          .internal_static_google_showcase_v1beta1_CreateRoomRequest_descriptor;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.CreateRoomRequest getDefaultInstanceForType() {
      return com.google.showcase.v1beta1.CreateRoomRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.CreateRoomRequest build() {
      com.google.showcase.v1beta1.CreateRoomRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.showcase.v1beta1.CreateRoomRequest buildPartial() {
      com.google.showcase.v1beta1.CreateRoomRequest result =
          new com.google.showcase.v1beta1.CreateRoomRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.showcase.v1beta1.CreateRoomRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.room_ = roomBuilder_ == null ? room_ : roomBuilder_.build();
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
      if (other instanceof com.google.showcase.v1beta1.CreateRoomRequest) {
        return mergeFrom((com.google.showcase.v1beta1.CreateRoomRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.showcase.v1beta1.CreateRoomRequest other) {
      if (other == com.google.showcase.v1beta1.CreateRoomRequest.getDefaultInstance()) return this;
      if (other.hasRoom()) {
        mergeRoom(other.getRoom());
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
                input.readMessage(getRoomFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.showcase.v1beta1.Room room_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.showcase.v1beta1.Room,
            com.google.showcase.v1beta1.Room.Builder,
            com.google.showcase.v1beta1.RoomOrBuilder>
        roomBuilder_;

    /**
     *
     *
     * <pre>
     * The room to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Room room = 1;</code>
     *
     * @return Whether the room field is set.
     */
    public boolean hasRoom() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The room to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Room room = 1;</code>
     *
     * @return The room.
     */
    public com.google.showcase.v1beta1.Room getRoom() {
      if (roomBuilder_ == null) {
        return room_ == null ? com.google.showcase.v1beta1.Room.getDefaultInstance() : room_;
      } else {
        return roomBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The room to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Room room = 1;</code>
     */
    public Builder setRoom(com.google.showcase.v1beta1.Room value) {
      if (roomBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        room_ = value;
      } else {
        roomBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The room to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Room room = 1;</code>
     */
    public Builder setRoom(com.google.showcase.v1beta1.Room.Builder builderForValue) {
      if (roomBuilder_ == null) {
        room_ = builderForValue.build();
      } else {
        roomBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The room to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Room room = 1;</code>
     */
    public Builder mergeRoom(com.google.showcase.v1beta1.Room value) {
      if (roomBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && room_ != null
            && room_ != com.google.showcase.v1beta1.Room.getDefaultInstance()) {
          getRoomBuilder().mergeFrom(value);
        } else {
          room_ = value;
        }
      } else {
        roomBuilder_.mergeFrom(value);
      }
      if (room_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The room to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Room room = 1;</code>
     */
    public Builder clearRoom() {
      bitField0_ = (bitField0_ & ~0x00000001);
      room_ = null;
      if (roomBuilder_ != null) {
        roomBuilder_.dispose();
        roomBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The room to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Room room = 1;</code>
     */
    public com.google.showcase.v1beta1.Room.Builder getRoomBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRoomFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The room to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Room room = 1;</code>
     */
    public com.google.showcase.v1beta1.RoomOrBuilder getRoomOrBuilder() {
      if (roomBuilder_ != null) {
        return roomBuilder_.getMessageOrBuilder();
      } else {
        return room_ == null ? com.google.showcase.v1beta1.Room.getDefaultInstance() : room_;
      }
    }

    /**
     *
     *
     * <pre>
     * The room to create.
     * </pre>
     *
     * <code>.google.showcase.v1beta1.Room room = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.showcase.v1beta1.Room,
            com.google.showcase.v1beta1.Room.Builder,
            com.google.showcase.v1beta1.RoomOrBuilder>
        getRoomFieldBuilder() {
      if (roomBuilder_ == null) {
        roomBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.showcase.v1beta1.Room,
                com.google.showcase.v1beta1.Room.Builder,
                com.google.showcase.v1beta1.RoomOrBuilder>(
                getRoom(), getParentForChildren(), isClean());
        room_ = null;
      }
      return roomBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.showcase.v1beta1.CreateRoomRequest)
  }

  // @@protoc_insertion_point(class_scope:google.showcase.v1beta1.CreateRoomRequest)
  private static final com.google.showcase.v1beta1.CreateRoomRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.showcase.v1beta1.CreateRoomRequest();
  }

  public static com.google.showcase.v1beta1.CreateRoomRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateRoomRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateRoomRequest>() {
        @java.lang.Override
        public CreateRoomRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateRoomRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateRoomRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.showcase.v1beta1.CreateRoomRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
