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
// source: schema/google/showcase/v1beta1/compliance.proto

// Protobuf Java Version: 3.25.8
package com.google.showcase.v1beta1;

public interface ComplianceDataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.showcase.v1beta1.ComplianceData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string f_string = 1;</code>
   *
   * @return The fString.
   */
  java.lang.String getFString();

  /**
   * <code>string f_string = 1;</code>
   *
   * @return The bytes for fString.
   */
  com.google.protobuf.ByteString getFStringBytes();

  /**
   * <code>int32 f_int32 = 2;</code>
   *
   * @return The fInt32.
   */
  int getFInt32();

  /**
   * <code>sint32 f_sint32 = 3;</code>
   *
   * @return The fSint32.
   */
  int getFSint32();

  /**
   * <code>sfixed32 f_sfixed32 = 4;</code>
   *
   * @return The fSfixed32.
   */
  int getFSfixed32();

  /**
   * <code>uint32 f_uint32 = 5;</code>
   *
   * @return The fUint32.
   */
  int getFUint32();

  /**
   * <code>fixed32 f_fixed32 = 6;</code>
   *
   * @return The fFixed32.
   */
  int getFFixed32();

  /**
   * <code>int64 f_int64 = 7;</code>
   *
   * @return The fInt64.
   */
  long getFInt64();

  /**
   * <code>sint64 f_sint64 = 8;</code>
   *
   * @return The fSint64.
   */
  long getFSint64();

  /**
   * <code>sfixed64 f_sfixed64 = 9;</code>
   *
   * @return The fSfixed64.
   */
  long getFSfixed64();

  /**
   * <code>uint64 f_uint64 = 10;</code>
   *
   * @return The fUint64.
   */
  long getFUint64();

  /**
   * <code>fixed64 f_fixed64 = 11;</code>
   *
   * @return The fFixed64.
   */
  long getFFixed64();

  /**
   * <code>double f_double = 12;</code>
   *
   * @return The fDouble.
   */
  double getFDouble();

  /**
   * <code>float f_float = 13;</code>
   *
   * @return The fFloat.
   */
  float getFFloat();

  /**
   * <code>bool f_bool = 14;</code>
   *
   * @return The fBool.
   */
  boolean getFBool();

  /**
   * <code>bytes f_bytes = 15;</code>
   *
   * @return The fBytes.
   */
  com.google.protobuf.ByteString getFBytes();

  /**
   * <code>.google.showcase.v1beta1.ComplianceData.LifeKingdom f_kingdom = 22;</code>
   *
   * @return The enum numeric value on the wire for fKingdom.
   */
  int getFKingdomValue();

  /**
   * <code>.google.showcase.v1beta1.ComplianceData.LifeKingdom f_kingdom = 22;</code>
   *
   * @return The fKingdom.
   */
  com.google.showcase.v1beta1.ComplianceData.LifeKingdom getFKingdom();

  /**
   * <code>.google.showcase.v1beta1.ComplianceDataChild f_child = 16;</code>
   *
   * @return Whether the fChild field is set.
   */
  boolean hasFChild();

  /**
   * <code>.google.showcase.v1beta1.ComplianceDataChild f_child = 16;</code>
   *
   * @return The fChild.
   */
  com.google.showcase.v1beta1.ComplianceDataChild getFChild();

  /** <code>.google.showcase.v1beta1.ComplianceDataChild f_child = 16;</code> */
  com.google.showcase.v1beta1.ComplianceDataChildOrBuilder getFChildOrBuilder();

  /**
   * <code>optional string p_string = 17;</code>
   *
   * @return Whether the pString field is set.
   */
  boolean hasPString();

  /**
   * <code>optional string p_string = 17;</code>
   *
   * @return The pString.
   */
  java.lang.String getPString();

  /**
   * <code>optional string p_string = 17;</code>
   *
   * @return The bytes for pString.
   */
  com.google.protobuf.ByteString getPStringBytes();

  /**
   * <code>optional int32 p_int32 = 18;</code>
   *
   * @return Whether the pInt32 field is set.
   */
  boolean hasPInt32();

  /**
   * <code>optional int32 p_int32 = 18;</code>
   *
   * @return The pInt32.
   */
  int getPInt32();

  /**
   * <code>optional double p_double = 19;</code>
   *
   * @return Whether the pDouble field is set.
   */
  boolean hasPDouble();

  /**
   * <code>optional double p_double = 19;</code>
   *
   * @return The pDouble.
   */
  double getPDouble();

  /**
   * <code>optional bool p_bool = 20;</code>
   *
   * @return Whether the pBool field is set.
   */
  boolean hasPBool();

  /**
   * <code>optional bool p_bool = 20;</code>
   *
   * @return The pBool.
   */
  boolean getPBool();

  /**
   * <code>optional .google.showcase.v1beta1.ComplianceData.LifeKingdom p_kingdom = 23;</code>
   *
   * @return Whether the pKingdom field is set.
   */
  boolean hasPKingdom();

  /**
   * <code>optional .google.showcase.v1beta1.ComplianceData.LifeKingdom p_kingdom = 23;</code>
   *
   * @return The enum numeric value on the wire for pKingdom.
   */
  int getPKingdomValue();

  /**
   * <code>optional .google.showcase.v1beta1.ComplianceData.LifeKingdom p_kingdom = 23;</code>
   *
   * @return The pKingdom.
   */
  com.google.showcase.v1beta1.ComplianceData.LifeKingdom getPKingdom();

  /**
   * <code>optional .google.showcase.v1beta1.ComplianceDataChild p_child = 21;</code>
   *
   * @return Whether the pChild field is set.
   */
  boolean hasPChild();

  /**
   * <code>optional .google.showcase.v1beta1.ComplianceDataChild p_child = 21;</code>
   *
   * @return The pChild.
   */
  com.google.showcase.v1beta1.ComplianceDataChild getPChild();

  /** <code>optional .google.showcase.v1beta1.ComplianceDataChild p_child = 21;</code> */
  com.google.showcase.v1beta1.ComplianceDataChildOrBuilder getPChildOrBuilder();
}
