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
// source: google/pubsub/v1/pubsub.proto

// Protobuf Java Version: 3.25.5
package com.google.pubsub.v1;

public interface PlatformLogsSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.PlatformLogsSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The minimum severity level of Platform Logs that will be written.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PlatformLogsSettings.Severity severity = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();
  /**
   *
   *
   * <pre>
   * Optional. The minimum severity level of Platform Logs that will be written.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PlatformLogsSettings.Severity severity = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The severity.
   */
  com.google.pubsub.v1.PlatformLogsSettings.Severity getSeverity();
}
