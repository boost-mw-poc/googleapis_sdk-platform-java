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
// source: google/api/log.proto

// Protobuf Java Version: 3.25.8
package com.google.api;

public interface LogDescriptorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.LogDescriptor)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the log. It must be less than 512 characters long and can
   * include the following characters: upper- and lower-case alphanumeric
   * characters [A-Za-z0-9], and punctuation characters including
   * slash, underscore, hyphen, period [/_-.].
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The name of the log. It must be less than 512 characters long and can
   * include the following characters: upper- and lower-case alphanumeric
   * characters [A-Za-z0-9], and punctuation characters including
   * slash, underscore, hyphen, period [/_-.].
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The set of labels that are available to describe a specific log entry.
   * Runtime requests that contain labels not specified here are
   * considered invalid.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 2;</code>
   */
  java.util.List<com.google.api.LabelDescriptor> getLabelsList();

  /**
   *
   *
   * <pre>
   * The set of labels that are available to describe a specific log entry.
   * Runtime requests that contain labels not specified here are
   * considered invalid.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 2;</code>
   */
  com.google.api.LabelDescriptor getLabels(int index);

  /**
   *
   *
   * <pre>
   * The set of labels that are available to describe a specific log entry.
   * Runtime requests that contain labels not specified here are
   * considered invalid.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 2;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * The set of labels that are available to describe a specific log entry.
   * Runtime requests that contain labels not specified here are
   * considered invalid.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 2;</code>
   */
  java.util.List<? extends com.google.api.LabelDescriptorOrBuilder> getLabelsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The set of labels that are available to describe a specific log entry.
   * Runtime requests that contain labels not specified here are
   * considered invalid.
   * </pre>
   *
   * <code>repeated .google.api.LabelDescriptor labels = 2;</code>
   */
  com.google.api.LabelDescriptorOrBuilder getLabelsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A human-readable description of this log. This information appears in
   * the documentation and can contain details.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * A human-readable description of this log. This information appears in
   * the documentation and can contain details.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The human-readable name for this log. This information appears on
   * the user interface and should be concise.
   * </pre>
   *
   * <code>string display_name = 4;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * The human-readable name for this log. This information appears on
   * the user interface and should be concise.
   * </pre>
   *
   * <code>string display_name = 4;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();
}
