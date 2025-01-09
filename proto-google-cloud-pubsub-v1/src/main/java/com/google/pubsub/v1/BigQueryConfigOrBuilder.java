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

public interface BigQueryConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.BigQueryConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The name of the table to which to write data, of the form
   * {projectId}.{datasetId}.{tableId}
   * </pre>
   *
   * <code>string table = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The table.
   */
  java.lang.String getTable();
  /**
   *
   *
   * <pre>
   * Optional. The name of the table to which to write data, of the form
   * {projectId}.{datasetId}.{tableId}
   * </pre>
   *
   * <code>string table = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for table.
   */
  com.google.protobuf.ByteString getTableBytes();

  /**
   *
   *
   * <pre>
   * Optional. When true, use the topic's schema as the columns to write to in
   * BigQuery, if it exists. `use_topic_schema` and `use_table_schema` cannot be
   * enabled at the same time.
   * </pre>
   *
   * <code>bool use_topic_schema = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The useTopicSchema.
   */
  boolean getUseTopicSchema();

  /**
   *
   *
   * <pre>
   * Optional. When true, write the subscription name, message_id, publish_time,
   * attributes, and ordering_key to additional columns in the table. The
   * subscription name, message_id, and publish_time fields are put in their own
   * columns while all other message properties (other than data) are written to
   * a JSON object in the attributes column.
   * </pre>
   *
   * <code>bool write_metadata = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The writeMetadata.
   */
  boolean getWriteMetadata();

  /**
   *
   *
   * <pre>
   * Optional. When true and use_topic_schema is true, any fields that are a
   * part of the topic schema that are not part of the BigQuery table schema are
   * dropped when writing to BigQuery. Otherwise, the schemas must be kept in
   * sync and any messages with extra fields are not written and remain in the
   * subscription's backlog.
   * </pre>
   *
   * <code>bool drop_unknown_fields = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The dropUnknownFields.
   */
  boolean getDropUnknownFields();

  /**
   *
   *
   * <pre>
   * Output only. An output-only field that indicates whether or not the
   * subscription can receive messages.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.BigQueryConfig.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. An output-only field that indicates whether or not the
   * subscription can receive messages.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.BigQueryConfig.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.pubsub.v1.BigQueryConfig.State getState();

  /**
   *
   *
   * <pre>
   * Optional. When true, use the BigQuery table's schema as the columns to
   * write to in BigQuery. `use_table_schema` and `use_topic_schema` cannot be
   * enabled at the same time.
   * </pre>
   *
   * <code>bool use_table_schema = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The useTableSchema.
   */
  boolean getUseTableSchema();

  /**
   *
   *
   * <pre>
   * Optional. The service account to use to write to BigQuery. The subscription
   * creator or updater that specifies this field must have
   * `iam.serviceAccounts.actAs` permission on the service account. If not
   * specified, the Pub/Sub [service
   * agent](https://cloud.google.com/iam/docs/service-agents),
   * service-{project_number}&#64;gcp-sa-pubsub.iam.gserviceaccount.com, is used.
   * </pre>
   *
   * <code>string service_account_email = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The serviceAccountEmail.
   */
  java.lang.String getServiceAccountEmail();
  /**
   *
   *
   * <pre>
   * Optional. The service account to use to write to BigQuery. The subscription
   * creator or updater that specifies this field must have
   * `iam.serviceAccounts.actAs` permission on the service account. If not
   * specified, the Pub/Sub [service
   * agent](https://cloud.google.com/iam/docs/service-agents),
   * service-{project_number}&#64;gcp-sa-pubsub.iam.gserviceaccount.com, is used.
   * </pre>
   *
   * <code>string service_account_email = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for serviceAccountEmail.
   */
  com.google.protobuf.ByteString getServiceAccountEmailBytes();
}
