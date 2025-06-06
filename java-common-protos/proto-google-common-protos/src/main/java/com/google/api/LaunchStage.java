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
// source: google/api/launch_stage.proto

// Protobuf Java Version: 3.25.8
package com.google.api;

/**
 *
 *
 * <pre>
 * The launch stage as defined by [Google Cloud Platform
 * Launch Stages](https://cloud.google.com/terms/launch-stages).
 * </pre>
 *
 * Protobuf enum {@code google.api.LaunchStage}
 */
public enum LaunchStage implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Do not use this default value.
   * </pre>
   *
   * <code>LAUNCH_STAGE_UNSPECIFIED = 0;</code>
   */
  LAUNCH_STAGE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The feature is not yet implemented. Users can not use it.
   * </pre>
   *
   * <code>UNIMPLEMENTED = 6;</code>
   */
  UNIMPLEMENTED(6),
  /**
   *
   *
   * <pre>
   * Prelaunch features are hidden from users and are only visible internally.
   * </pre>
   *
   * <code>PRELAUNCH = 7;</code>
   */
  PRELAUNCH(7),
  /**
   *
   *
   * <pre>
   * Early Access features are limited to a closed group of testers. To use
   * these features, you must sign up in advance and sign a Trusted Tester
   * agreement (which includes confidentiality provisions). These features may
   * be unstable, changed in backward-incompatible ways, and are not
   * guaranteed to be released.
   * </pre>
   *
   * <code>EARLY_ACCESS = 1;</code>
   */
  EARLY_ACCESS(1),
  /**
   *
   *
   * <pre>
   * Alpha is a limited availability test for releases before they are cleared
   * for widespread use. By Alpha, all significant design issues are resolved
   * and we are in the process of verifying functionality. Alpha customers
   * need to apply for access, agree to applicable terms, and have their
   * projects allowlisted. Alpha releases don't have to be feature complete,
   * no SLAs are provided, and there are no technical support obligations, but
   * they will be far enough along that customers can actually use them in
   * test environments or for limited-use tests -- just like they would in
   * normal production cases.
   * </pre>
   *
   * <code>ALPHA = 2;</code>
   */
  ALPHA(2),
  /**
   *
   *
   * <pre>
   * Beta is the point at which we are ready to open a release for any
   * customer to use. There are no SLA or technical support obligations in a
   * Beta release. Products will be complete from a feature perspective, but
   * may have some open outstanding issues. Beta releases are suitable for
   * limited production use cases.
   * </pre>
   *
   * <code>BETA = 3;</code>
   */
  BETA(3),
  /**
   *
   *
   * <pre>
   * GA features are open to all developers and are considered stable and
   * fully qualified for production use.
   * </pre>
   *
   * <code>GA = 4;</code>
   */
  GA(4),
  /**
   *
   *
   * <pre>
   * Deprecated features are scheduled to be shut down and removed. For more
   * information, see the "Deprecation Policy" section of our [Terms of
   * Service](https://cloud.google.com/terms/)
   * and the [Google Cloud Platform Subject to the Deprecation
   * Policy](https://cloud.google.com/terms/deprecation) documentation.
   * </pre>
   *
   * <code>DEPRECATED = 5;</code>
   */
  DEPRECATED(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Do not use this default value.
   * </pre>
   *
   * <code>LAUNCH_STAGE_UNSPECIFIED = 0;</code>
   */
  public static final int LAUNCH_STAGE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * The feature is not yet implemented. Users can not use it.
   * </pre>
   *
   * <code>UNIMPLEMENTED = 6;</code>
   */
  public static final int UNIMPLEMENTED_VALUE = 6;

  /**
   *
   *
   * <pre>
   * Prelaunch features are hidden from users and are only visible internally.
   * </pre>
   *
   * <code>PRELAUNCH = 7;</code>
   */
  public static final int PRELAUNCH_VALUE = 7;

  /**
   *
   *
   * <pre>
   * Early Access features are limited to a closed group of testers. To use
   * these features, you must sign up in advance and sign a Trusted Tester
   * agreement (which includes confidentiality provisions). These features may
   * be unstable, changed in backward-incompatible ways, and are not
   * guaranteed to be released.
   * </pre>
   *
   * <code>EARLY_ACCESS = 1;</code>
   */
  public static final int EARLY_ACCESS_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Alpha is a limited availability test for releases before they are cleared
   * for widespread use. By Alpha, all significant design issues are resolved
   * and we are in the process of verifying functionality. Alpha customers
   * need to apply for access, agree to applicable terms, and have their
   * projects allowlisted. Alpha releases don't have to be feature complete,
   * no SLAs are provided, and there are no technical support obligations, but
   * they will be far enough along that customers can actually use them in
   * test environments or for limited-use tests -- just like they would in
   * normal production cases.
   * </pre>
   *
   * <code>ALPHA = 2;</code>
   */
  public static final int ALPHA_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Beta is the point at which we are ready to open a release for any
   * customer to use. There are no SLA or technical support obligations in a
   * Beta release. Products will be complete from a feature perspective, but
   * may have some open outstanding issues. Beta releases are suitable for
   * limited production use cases.
   * </pre>
   *
   * <code>BETA = 3;</code>
   */
  public static final int BETA_VALUE = 3;

  /**
   *
   *
   * <pre>
   * GA features are open to all developers and are considered stable and
   * fully qualified for production use.
   * </pre>
   *
   * <code>GA = 4;</code>
   */
  public static final int GA_VALUE = 4;

  /**
   *
   *
   * <pre>
   * Deprecated features are scheduled to be shut down and removed. For more
   * information, see the "Deprecation Policy" section of our [Terms of
   * Service](https://cloud.google.com/terms/)
   * and the [Google Cloud Platform Subject to the Deprecation
   * Policy](https://cloud.google.com/terms/deprecation) documentation.
   * </pre>
   *
   * <code>DEPRECATED = 5;</code>
   */
  public static final int DEPRECATED_VALUE = 5;

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
  public static LaunchStage valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LaunchStage forNumber(int value) {
    switch (value) {
      case 0:
        return LAUNCH_STAGE_UNSPECIFIED;
      case 6:
        return UNIMPLEMENTED;
      case 7:
        return PRELAUNCH;
      case 1:
        return EARLY_ACCESS;
      case 2:
        return ALPHA;
      case 3:
        return BETA;
      case 4:
        return GA;
      case 5:
        return DEPRECATED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LaunchStage> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<LaunchStage> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<LaunchStage>() {
        public LaunchStage findValueByNumber(int number) {
          return LaunchStage.forNumber(number);
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
    return com.google.api.LaunchStageProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final LaunchStage[] VALUES = values();

  public static LaunchStage valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LaunchStage(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.api.LaunchStage)
}
