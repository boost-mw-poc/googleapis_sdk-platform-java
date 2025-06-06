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

public interface GridOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.apps.card.v1.Grid)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The text that displays in the grid header.
   * </pre>
   *
   * <code>string title = 1;</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();

  /**
   *
   *
   * <pre>
   * The text that displays in the grid header.
   * </pre>
   *
   * <code>string title = 1;</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * The items to display in the grid.
   * </pre>
   *
   * <code>repeated .google.apps.card.v1.Grid.GridItem items = 2;</code>
   */
  java.util.List<com.google.apps.card.v1.Grid.GridItem> getItemsList();

  /**
   *
   *
   * <pre>
   * The items to display in the grid.
   * </pre>
   *
   * <code>repeated .google.apps.card.v1.Grid.GridItem items = 2;</code>
   */
  com.google.apps.card.v1.Grid.GridItem getItems(int index);

  /**
   *
   *
   * <pre>
   * The items to display in the grid.
   * </pre>
   *
   * <code>repeated .google.apps.card.v1.Grid.GridItem items = 2;</code>
   */
  int getItemsCount();

  /**
   *
   *
   * <pre>
   * The items to display in the grid.
   * </pre>
   *
   * <code>repeated .google.apps.card.v1.Grid.GridItem items = 2;</code>
   */
  java.util.List<? extends com.google.apps.card.v1.Grid.GridItemOrBuilder> getItemsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The items to display in the grid.
   * </pre>
   *
   * <code>repeated .google.apps.card.v1.Grid.GridItem items = 2;</code>
   */
  com.google.apps.card.v1.Grid.GridItemOrBuilder getItemsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The border style to apply to each grid item.
   * </pre>
   *
   * <code>.google.apps.card.v1.BorderStyle border_style = 3;</code>
   *
   * @return Whether the borderStyle field is set.
   */
  boolean hasBorderStyle();

  /**
   *
   *
   * <pre>
   * The border style to apply to each grid item.
   * </pre>
   *
   * <code>.google.apps.card.v1.BorderStyle border_style = 3;</code>
   *
   * @return The borderStyle.
   */
  com.google.apps.card.v1.BorderStyle getBorderStyle();

  /**
   *
   *
   * <pre>
   * The border style to apply to each grid item.
   * </pre>
   *
   * <code>.google.apps.card.v1.BorderStyle border_style = 3;</code>
   */
  com.google.apps.card.v1.BorderStyleOrBuilder getBorderStyleOrBuilder();

  /**
   *
   *
   * <pre>
   * The number of columns to display in the grid. A default value
   * is used if this field isn't specified, and that default value is
   * different depending on where the grid is shown (dialog versus companion).
   * </pre>
   *
   * <code>int32 column_count = 4;</code>
   *
   * @return The columnCount.
   */
  int getColumnCount();

  /**
   *
   *
   * <pre>
   * This callback is reused by each individual grid item, but with the
   * item's identifier and index in the items list added to the callback's
   * parameters.
   * </pre>
   *
   * <code>.google.apps.card.v1.OnClick on_click = 5;</code>
   *
   * @return Whether the onClick field is set.
   */
  boolean hasOnClick();

  /**
   *
   *
   * <pre>
   * This callback is reused by each individual grid item, but with the
   * item's identifier and index in the items list added to the callback's
   * parameters.
   * </pre>
   *
   * <code>.google.apps.card.v1.OnClick on_click = 5;</code>
   *
   * @return The onClick.
   */
  com.google.apps.card.v1.OnClick getOnClick();

  /**
   *
   *
   * <pre>
   * This callback is reused by each individual grid item, but with the
   * item's identifier and index in the items list added to the callback's
   * parameters.
   * </pre>
   *
   * <code>.google.apps.card.v1.OnClick on_click = 5;</code>
   */
  com.google.apps.card.v1.OnClickOrBuilder getOnClickOrBuilder();
}
