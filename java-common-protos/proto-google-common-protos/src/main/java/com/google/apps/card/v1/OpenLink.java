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
// source: google/apps/card/v1/card.proto

// Protobuf Java Version: 3.25.8
package com.google.apps.card.v1;

/**
 *
 *
 * <pre>
 * Represents an `onClick` event that opens a hyperlink.
 *
 * [Google Workspace Add-ons and Chat
 * apps](https://developers.google.com/workspace/extend):
 * </pre>
 *
 * Protobuf type {@code google.apps.card.v1.OpenLink}
 */
public final class OpenLink extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.apps.card.v1.OpenLink)
    OpenLinkOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use OpenLink.newBuilder() to construct.
  private OpenLink(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OpenLink() {
    url_ = "";
    openAs_ = 0;
    onClose_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OpenLink();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.apps.card.v1.CardProto
        .internal_static_google_apps_card_v1_OpenLink_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.apps.card.v1.CardProto
        .internal_static_google_apps_card_v1_OpenLink_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.apps.card.v1.OpenLink.class, com.google.apps.card.v1.OpenLink.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * When an `OnClick` action opens a link, then the client can either open it
   * as a full-size window (if that's the frame used by the client), or an
   * overlay (such as a pop-up). The implementation depends on the client
   * platform capabilities, and the value selected might be ignored if the
   * client doesn't support it. `FULL_SIZE` is supported by all clients.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * Protobuf enum {@code google.apps.card.v1.OpenLink.OpenAs}
   */
  public enum OpenAs implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * The link opens as a full-size window (if that's the frame used by the
     * client).
     * </pre>
     *
     * <code>FULL_SIZE = 0;</code>
     */
    FULL_SIZE(0),
    /**
     *
     *
     * <pre>
     * The link opens as an overlay, such as a pop-up.
     * </pre>
     *
     * <code>OVERLAY = 1;</code>
     */
    OVERLAY(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * The link opens as a full-size window (if that's the frame used by the
     * client).
     * </pre>
     *
     * <code>FULL_SIZE = 0;</code>
     */
    public static final int FULL_SIZE_VALUE = 0;

    /**
     *
     *
     * <pre>
     * The link opens as an overlay, such as a pop-up.
     * </pre>
     *
     * <code>OVERLAY = 1;</code>
     */
    public static final int OVERLAY_VALUE = 1;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OpenAs valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OpenAs forNumber(int value) {
      switch (value) {
        case 0:
          return FULL_SIZE;
        case 1:
          return OVERLAY;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OpenAs> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<OpenAs> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OpenAs>() {
          public OpenAs findValueByNumber(int number) {
            return OpenAs.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.apps.card.v1.OpenLink.getDescriptor().getEnumTypes().get(0);
    }

    private static final OpenAs[] VALUES = values();

    public static OpenAs valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OpenAs(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.apps.card.v1.OpenLink.OpenAs)
  }

  /**
   *
   *
   * <pre>
   * What the client does when a link opened by an `OnClick` action is closed.
   *
   * Implementation depends on client platform capabilities. For example, a web
   * browser might open a link in a pop-up window with an `OnClose` handler.
   *
   * If both `OnOpen` and `OnClose` handlers are set, and the client platform
   * can't support both values, `OnClose` takes precedence.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * Protobuf enum {@code google.apps.card.v1.OpenLink.OnClose}
   */
  public enum OnClose implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value. The card doesn't reload; nothing happens.
     * </pre>
     *
     * <code>NOTHING = 0;</code>
     */
    NOTHING(0),
    /**
     *
     *
     * <pre>
     * Reloads the card after the child window closes.
     *
     * If used in conjunction with
     * [`OpenAs.OVERLAY`](https://developers.google.com/workspace/add-ons/reference/rpc/google.apps.card.v1#openas),
     * the child window acts as a modal dialog and the parent card is blocked
     * until the child window closes.
     * </pre>
     *
     * <code>RELOAD = 1;</code>
     */
    RELOAD(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value. The card doesn't reload; nothing happens.
     * </pre>
     *
     * <code>NOTHING = 0;</code>
     */
    public static final int NOTHING_VALUE = 0;

    /**
     *
     *
     * <pre>
     * Reloads the card after the child window closes.
     *
     * If used in conjunction with
     * [`OpenAs.OVERLAY`](https://developers.google.com/workspace/add-ons/reference/rpc/google.apps.card.v1#openas),
     * the child window acts as a modal dialog and the parent card is blocked
     * until the child window closes.
     * </pre>
     *
     * <code>RELOAD = 1;</code>
     */
    public static final int RELOAD_VALUE = 1;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OnClose valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OnClose forNumber(int value) {
      switch (value) {
        case 0:
          return NOTHING;
        case 1:
          return RELOAD;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OnClose> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<OnClose> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OnClose>() {
          public OnClose findValueByNumber(int number) {
            return OnClose.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.apps.card.v1.OpenLink.getDescriptor().getEnumTypes().get(1);
    }

    private static final OnClose[] VALUES = values();

    public static OnClose valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OnClose(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.apps.card.v1.OpenLink.OnClose)
  }

  public static final int URL_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object url_ = "";

  /**
   *
   *
   * <pre>
   * The URL to open.
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The url.
   */
  @java.lang.Override
  public java.lang.String getUrl() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      url_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The URL to open.
   * </pre>
   *
   * <code>string url = 1;</code>
   *
   * @return The bytes for url.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUrlBytes() {
    java.lang.Object ref = url_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      url_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OPEN_AS_FIELD_NUMBER = 2;
  private int openAs_ = 0;

  /**
   *
   *
   * <pre>
   * How to open a link.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.OpenLink.OpenAs open_as = 2;</code>
   *
   * @return The enum numeric value on the wire for openAs.
   */
  @java.lang.Override
  public int getOpenAsValue() {
    return openAs_;
  }

  /**
   *
   *
   * <pre>
   * How to open a link.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.OpenLink.OpenAs open_as = 2;</code>
   *
   * @return The openAs.
   */
  @java.lang.Override
  public com.google.apps.card.v1.OpenLink.OpenAs getOpenAs() {
    com.google.apps.card.v1.OpenLink.OpenAs result =
        com.google.apps.card.v1.OpenLink.OpenAs.forNumber(openAs_);
    return result == null ? com.google.apps.card.v1.OpenLink.OpenAs.UNRECOGNIZED : result;
  }

  public static final int ON_CLOSE_FIELD_NUMBER = 3;
  private int onClose_ = 0;

  /**
   *
   *
   * <pre>
   * Whether the client forgets about a link after opening it, or observes it
   * until the window closes.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.OpenLink.OnClose on_close = 3;</code>
   *
   * @return The enum numeric value on the wire for onClose.
   */
  @java.lang.Override
  public int getOnCloseValue() {
    return onClose_;
  }

  /**
   *
   *
   * <pre>
   * Whether the client forgets about a link after opening it, or observes it
   * until the window closes.
   *
   * [Google Workspace
   * Add-ons](https://developers.google.com/workspace/add-ons):
   * </pre>
   *
   * <code>.google.apps.card.v1.OpenLink.OnClose on_close = 3;</code>
   *
   * @return The onClose.
   */
  @java.lang.Override
  public com.google.apps.card.v1.OpenLink.OnClose getOnClose() {
    com.google.apps.card.v1.OpenLink.OnClose result =
        com.google.apps.card.v1.OpenLink.OnClose.forNumber(onClose_);
    return result == null ? com.google.apps.card.v1.OpenLink.OnClose.UNRECOGNIZED : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, url_);
    }
    if (openAs_ != com.google.apps.card.v1.OpenLink.OpenAs.FULL_SIZE.getNumber()) {
      output.writeEnum(2, openAs_);
    }
    if (onClose_ != com.google.apps.card.v1.OpenLink.OnClose.NOTHING.getNumber()) {
      output.writeEnum(3, onClose_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(url_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, url_);
    }
    if (openAs_ != com.google.apps.card.v1.OpenLink.OpenAs.FULL_SIZE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, openAs_);
    }
    if (onClose_ != com.google.apps.card.v1.OpenLink.OnClose.NOTHING.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, onClose_);
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
    if (!(obj instanceof com.google.apps.card.v1.OpenLink)) {
      return super.equals(obj);
    }
    com.google.apps.card.v1.OpenLink other = (com.google.apps.card.v1.OpenLink) obj;

    if (!getUrl().equals(other.getUrl())) return false;
    if (openAs_ != other.openAs_) return false;
    if (onClose_ != other.onClose_) return false;
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
    hash = (37 * hash) + URL_FIELD_NUMBER;
    hash = (53 * hash) + getUrl().hashCode();
    hash = (37 * hash) + OPEN_AS_FIELD_NUMBER;
    hash = (53 * hash) + openAs_;
    hash = (37 * hash) + ON_CLOSE_FIELD_NUMBER;
    hash = (53 * hash) + onClose_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.apps.card.v1.OpenLink parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.card.v1.OpenLink parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.card.v1.OpenLink parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.card.v1.OpenLink parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.card.v1.OpenLink parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.apps.card.v1.OpenLink parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.apps.card.v1.OpenLink parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.card.v1.OpenLink parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.card.v1.OpenLink parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.apps.card.v1.OpenLink parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.apps.card.v1.OpenLink parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.apps.card.v1.OpenLink parseFrom(
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

  public static Builder newBuilder(com.google.apps.card.v1.OpenLink prototype) {
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
   * Represents an `onClick` event that opens a hyperlink.
   *
   * [Google Workspace Add-ons and Chat
   * apps](https://developers.google.com/workspace/extend):
   * </pre>
   *
   * Protobuf type {@code google.apps.card.v1.OpenLink}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.apps.card.v1.OpenLink)
      com.google.apps.card.v1.OpenLinkOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.apps.card.v1.CardProto
          .internal_static_google_apps_card_v1_OpenLink_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.apps.card.v1.CardProto
          .internal_static_google_apps_card_v1_OpenLink_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.apps.card.v1.OpenLink.class,
              com.google.apps.card.v1.OpenLink.Builder.class);
    }

    // Construct using com.google.apps.card.v1.OpenLink.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      url_ = "";
      openAs_ = 0;
      onClose_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.apps.card.v1.CardProto
          .internal_static_google_apps_card_v1_OpenLink_descriptor;
    }

    @java.lang.Override
    public com.google.apps.card.v1.OpenLink getDefaultInstanceForType() {
      return com.google.apps.card.v1.OpenLink.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.apps.card.v1.OpenLink build() {
      com.google.apps.card.v1.OpenLink result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.apps.card.v1.OpenLink buildPartial() {
      com.google.apps.card.v1.OpenLink result = new com.google.apps.card.v1.OpenLink(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.apps.card.v1.OpenLink result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.url_ = url_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.openAs_ = openAs_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.onClose_ = onClose_;
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
      if (other instanceof com.google.apps.card.v1.OpenLink) {
        return mergeFrom((com.google.apps.card.v1.OpenLink) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.apps.card.v1.OpenLink other) {
      if (other == com.google.apps.card.v1.OpenLink.getDefaultInstance()) return this;
      if (!other.getUrl().isEmpty()) {
        url_ = other.url_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.openAs_ != 0) {
        setOpenAsValue(other.getOpenAsValue());
      }
      if (other.onClose_ != 0) {
        setOnCloseValue(other.getOnCloseValue());
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
                url_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                openAs_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                onClose_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object url_ = "";

    /**
     *
     *
     * <pre>
     * The URL to open.
     * </pre>
     *
     * <code>string url = 1;</code>
     *
     * @return The url.
     */
    public java.lang.String getUrl() {
      java.lang.Object ref = url_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        url_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The URL to open.
     * </pre>
     *
     * <code>string url = 1;</code>
     *
     * @return The bytes for url.
     */
    public com.google.protobuf.ByteString getUrlBytes() {
      java.lang.Object ref = url_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        url_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The URL to open.
     * </pre>
     *
     * <code>string url = 1;</code>
     *
     * @param value The url to set.
     * @return This builder for chaining.
     */
    public Builder setUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      url_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URL to open.
     * </pre>
     *
     * <code>string url = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUrl() {
      url_ = getDefaultInstance().getUrl();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The URL to open.
     * </pre>
     *
     * <code>string url = 1;</code>
     *
     * @param value The bytes for url to set.
     * @return This builder for chaining.
     */
    public Builder setUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      url_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int openAs_ = 0;

    /**
     *
     *
     * <pre>
     * How to open a link.
     *
     * [Google Workspace
     * Add-ons](https://developers.google.com/workspace/add-ons):
     * </pre>
     *
     * <code>.google.apps.card.v1.OpenLink.OpenAs open_as = 2;</code>
     *
     * @return The enum numeric value on the wire for openAs.
     */
    @java.lang.Override
    public int getOpenAsValue() {
      return openAs_;
    }

    /**
     *
     *
     * <pre>
     * How to open a link.
     *
     * [Google Workspace
     * Add-ons](https://developers.google.com/workspace/add-ons):
     * </pre>
     *
     * <code>.google.apps.card.v1.OpenLink.OpenAs open_as = 2;</code>
     *
     * @param value The enum numeric value on the wire for openAs to set.
     * @return This builder for chaining.
     */
    public Builder setOpenAsValue(int value) {
      openAs_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * How to open a link.
     *
     * [Google Workspace
     * Add-ons](https://developers.google.com/workspace/add-ons):
     * </pre>
     *
     * <code>.google.apps.card.v1.OpenLink.OpenAs open_as = 2;</code>
     *
     * @return The openAs.
     */
    @java.lang.Override
    public com.google.apps.card.v1.OpenLink.OpenAs getOpenAs() {
      com.google.apps.card.v1.OpenLink.OpenAs result =
          com.google.apps.card.v1.OpenLink.OpenAs.forNumber(openAs_);
      return result == null ? com.google.apps.card.v1.OpenLink.OpenAs.UNRECOGNIZED : result;
    }

    /**
     *
     *
     * <pre>
     * How to open a link.
     *
     * [Google Workspace
     * Add-ons](https://developers.google.com/workspace/add-ons):
     * </pre>
     *
     * <code>.google.apps.card.v1.OpenLink.OpenAs open_as = 2;</code>
     *
     * @param value The openAs to set.
     * @return This builder for chaining.
     */
    public Builder setOpenAs(com.google.apps.card.v1.OpenLink.OpenAs value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      openAs_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * How to open a link.
     *
     * [Google Workspace
     * Add-ons](https://developers.google.com/workspace/add-ons):
     * </pre>
     *
     * <code>.google.apps.card.v1.OpenLink.OpenAs open_as = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOpenAs() {
      bitField0_ = (bitField0_ & ~0x00000002);
      openAs_ = 0;
      onChanged();
      return this;
    }

    private int onClose_ = 0;

    /**
     *
     *
     * <pre>
     * Whether the client forgets about a link after opening it, or observes it
     * until the window closes.
     *
     * [Google Workspace
     * Add-ons](https://developers.google.com/workspace/add-ons):
     * </pre>
     *
     * <code>.google.apps.card.v1.OpenLink.OnClose on_close = 3;</code>
     *
     * @return The enum numeric value on the wire for onClose.
     */
    @java.lang.Override
    public int getOnCloseValue() {
      return onClose_;
    }

    /**
     *
     *
     * <pre>
     * Whether the client forgets about a link after opening it, or observes it
     * until the window closes.
     *
     * [Google Workspace
     * Add-ons](https://developers.google.com/workspace/add-ons):
     * </pre>
     *
     * <code>.google.apps.card.v1.OpenLink.OnClose on_close = 3;</code>
     *
     * @param value The enum numeric value on the wire for onClose to set.
     * @return This builder for chaining.
     */
    public Builder setOnCloseValue(int value) {
      onClose_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether the client forgets about a link after opening it, or observes it
     * until the window closes.
     *
     * [Google Workspace
     * Add-ons](https://developers.google.com/workspace/add-ons):
     * </pre>
     *
     * <code>.google.apps.card.v1.OpenLink.OnClose on_close = 3;</code>
     *
     * @return The onClose.
     */
    @java.lang.Override
    public com.google.apps.card.v1.OpenLink.OnClose getOnClose() {
      com.google.apps.card.v1.OpenLink.OnClose result =
          com.google.apps.card.v1.OpenLink.OnClose.forNumber(onClose_);
      return result == null ? com.google.apps.card.v1.OpenLink.OnClose.UNRECOGNIZED : result;
    }

    /**
     *
     *
     * <pre>
     * Whether the client forgets about a link after opening it, or observes it
     * until the window closes.
     *
     * [Google Workspace
     * Add-ons](https://developers.google.com/workspace/add-ons):
     * </pre>
     *
     * <code>.google.apps.card.v1.OpenLink.OnClose on_close = 3;</code>
     *
     * @param value The onClose to set.
     * @return This builder for chaining.
     */
    public Builder setOnClose(com.google.apps.card.v1.OpenLink.OnClose value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      onClose_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether the client forgets about a link after opening it, or observes it
     * until the window closes.
     *
     * [Google Workspace
     * Add-ons](https://developers.google.com/workspace/add-ons):
     * </pre>
     *
     * <code>.google.apps.card.v1.OpenLink.OnClose on_close = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOnClose() {
      bitField0_ = (bitField0_ & ~0x00000004);
      onClose_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.apps.card.v1.OpenLink)
  }

  // @@protoc_insertion_point(class_scope:google.apps.card.v1.OpenLink)
  private static final com.google.apps.card.v1.OpenLink DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.apps.card.v1.OpenLink();
  }

  public static com.google.apps.card.v1.OpenLink getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OpenLink> PARSER =
      new com.google.protobuf.AbstractParser<OpenLink>() {
        @java.lang.Override
        public OpenLink parsePartialFrom(
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

  public static com.google.protobuf.Parser<OpenLink> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OpenLink> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.apps.card.v1.OpenLink getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
