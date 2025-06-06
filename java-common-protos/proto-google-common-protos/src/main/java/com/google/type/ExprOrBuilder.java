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
// source: google/type/expr.proto

// Protobuf Java Version: 3.25.8
package com.google.type;

public interface ExprOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.type.Expr)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Textual representation of an expression in Common Expression Language
   * syntax.
   * </pre>
   *
   * <code>string expression = 1;</code>
   *
   * @return The expression.
   */
  java.lang.String getExpression();

  /**
   *
   *
   * <pre>
   * Textual representation of an expression in Common Expression Language
   * syntax.
   * </pre>
   *
   * <code>string expression = 1;</code>
   *
   * @return The bytes for expression.
   */
  com.google.protobuf.ByteString getExpressionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Title for the expression, i.e. a short string describing
   * its purpose. This can be used e.g. in UIs which allow to enter the
   * expression.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The title.
   */
  java.lang.String getTitle();

  /**
   *
   *
   * <pre>
   * Optional. Title for the expression, i.e. a short string describing
   * its purpose. This can be used e.g. in UIs which allow to enter the
   * expression.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString getTitleBytes();

  /**
   *
   *
   * <pre>
   * Optional. Description of the expression. This is a longer text which
   * describes the expression, e.g. when hovered over it in a UI.
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
   * Optional. Description of the expression. This is a longer text which
   * describes the expression, e.g. when hovered over it in a UI.
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
   * Optional. String indicating the location of the expression for error
   * reporting, e.g. a file name and a position in the file.
   * </pre>
   *
   * <code>string location = 4;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();

  /**
   *
   *
   * <pre>
   * Optional. String indicating the location of the expression for error
   * reporting, e.g. a file name and a position in the file.
   * </pre>
   *
   * <code>string location = 4;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();
}
