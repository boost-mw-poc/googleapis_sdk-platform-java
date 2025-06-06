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
// source: google/longrunning/operations.proto

// Protobuf Java Version: 3.25.8
package com.google.longrunning;

public interface OperationInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.longrunning.OperationInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The message name of the primary return type for this
   * long-running operation.
   * This type will be used to deserialize the LRO's response.
   *
   * If the response is in a different package from the rpc, a fully-qualified
   * message name must be used (e.g. `google.protobuf.Struct`).
   *
   * Note: Altering this value constitutes a breaking change.
   * </pre>
   *
   * <code>string response_type = 1;</code>
   *
   * @return The responseType.
   */
  java.lang.String getResponseType();

  /**
   *
   *
   * <pre>
   * Required. The message name of the primary return type for this
   * long-running operation.
   * This type will be used to deserialize the LRO's response.
   *
   * If the response is in a different package from the rpc, a fully-qualified
   * message name must be used (e.g. `google.protobuf.Struct`).
   *
   * Note: Altering this value constitutes a breaking change.
   * </pre>
   *
   * <code>string response_type = 1;</code>
   *
   * @return The bytes for responseType.
   */
  com.google.protobuf.ByteString getResponseTypeBytes();

  /**
   *
   *
   * <pre>
   * Required. The message name of the metadata type for this long-running
   * operation.
   *
   * If the response is in a different package from the rpc, a fully-qualified
   * message name must be used (e.g. `google.protobuf.Struct`).
   *
   * Note: Altering this value constitutes a breaking change.
   * </pre>
   *
   * <code>string metadata_type = 2;</code>
   *
   * @return The metadataType.
   */
  java.lang.String getMetadataType();

  /**
   *
   *
   * <pre>
   * Required. The message name of the metadata type for this long-running
   * operation.
   *
   * If the response is in a different package from the rpc, a fully-qualified
   * message name must be used (e.g. `google.protobuf.Struct`).
   *
   * Note: Altering this value constitutes a breaking change.
   * </pre>
   *
   * <code>string metadata_type = 2;</code>
   *
   * @return The bytes for metadataType.
   */
  com.google.protobuf.ByteString getMetadataTypeBytes();
}
