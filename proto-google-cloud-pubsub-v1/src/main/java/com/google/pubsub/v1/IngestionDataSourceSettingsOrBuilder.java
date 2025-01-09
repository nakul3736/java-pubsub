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

public interface IngestionDataSourceSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.IngestionDataSourceSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Amazon Kinesis Data Streams.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.AwsKinesis aws_kinesis = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the awsKinesis field is set.
   */
  boolean hasAwsKinesis();
  /**
   *
   *
   * <pre>
   * Optional. Amazon Kinesis Data Streams.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.AwsKinesis aws_kinesis = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The awsKinesis.
   */
  com.google.pubsub.v1.IngestionDataSourceSettings.AwsKinesis getAwsKinesis();
  /**
   *
   *
   * <pre>
   * Optional. Amazon Kinesis Data Streams.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.AwsKinesis aws_kinesis = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.IngestionDataSourceSettings.AwsKinesisOrBuilder getAwsKinesisOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Cloud Storage.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.CloudStorage cloud_storage = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the cloudStorage field is set.
   */
  boolean hasCloudStorage();
  /**
   *
   *
   * <pre>
   * Optional. Cloud Storage.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.CloudStorage cloud_storage = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The cloudStorage.
   */
  com.google.pubsub.v1.IngestionDataSourceSettings.CloudStorage getCloudStorage();
  /**
   *
   *
   * <pre>
   * Optional. Cloud Storage.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.CloudStorage cloud_storage = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.IngestionDataSourceSettings.CloudStorageOrBuilder getCloudStorageOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Azure Event Hubs.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.AzureEventHubs azure_event_hubs = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the azureEventHubs field is set.
   */
  boolean hasAzureEventHubs();
  /**
   *
   *
   * <pre>
   * Optional. Azure Event Hubs.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.AzureEventHubs azure_event_hubs = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The azureEventHubs.
   */
  com.google.pubsub.v1.IngestionDataSourceSettings.AzureEventHubs getAzureEventHubs();
  /**
   *
   *
   * <pre>
   * Optional. Azure Event Hubs.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.AzureEventHubs azure_event_hubs = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.IngestionDataSourceSettings.AzureEventHubsOrBuilder
      getAzureEventHubsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Amazon MSK.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.AwsMsk aws_msk = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the awsMsk field is set.
   */
  boolean hasAwsMsk();
  /**
   *
   *
   * <pre>
   * Optional. Amazon MSK.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.AwsMsk aws_msk = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The awsMsk.
   */
  com.google.pubsub.v1.IngestionDataSourceSettings.AwsMsk getAwsMsk();
  /**
   *
   *
   * <pre>
   * Optional. Amazon MSK.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.AwsMsk aws_msk = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.IngestionDataSourceSettings.AwsMskOrBuilder getAwsMskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Confluent Cloud.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.ConfluentCloud confluent_cloud = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the confluentCloud field is set.
   */
  boolean hasConfluentCloud();
  /**
   *
   *
   * <pre>
   * Optional. Confluent Cloud.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.ConfluentCloud confluent_cloud = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The confluentCloud.
   */
  com.google.pubsub.v1.IngestionDataSourceSettings.ConfluentCloud getConfluentCloud();
  /**
   *
   *
   * <pre>
   * Optional. Confluent Cloud.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.IngestionDataSourceSettings.ConfluentCloud confluent_cloud = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.IngestionDataSourceSettings.ConfluentCloudOrBuilder
      getConfluentCloudOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Platform Logs settings. If unset, no Platform Logs will be
   * generated.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PlatformLogsSettings platform_logs_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the platformLogsSettings field is set.
   */
  boolean hasPlatformLogsSettings();
  /**
   *
   *
   * <pre>
   * Optional. Platform Logs settings. If unset, no Platform Logs will be
   * generated.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PlatformLogsSettings platform_logs_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The platformLogsSettings.
   */
  com.google.pubsub.v1.PlatformLogsSettings getPlatformLogsSettings();
  /**
   *
   *
   * <pre>
   * Optional. Platform Logs settings. If unset, no Platform Logs will be
   * generated.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PlatformLogsSettings platform_logs_settings = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.PlatformLogsSettingsOrBuilder getPlatformLogsSettingsOrBuilder();

  com.google.pubsub.v1.IngestionDataSourceSettings.SourceCase getSourceCase();
}
