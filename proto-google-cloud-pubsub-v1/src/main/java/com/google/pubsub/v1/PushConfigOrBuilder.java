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

public interface PushConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.PushConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. A URL locating the endpoint to which messages should be pushed.
   * For example, a Webhook endpoint might use `https://example.com/push`.
   * </pre>
   *
   * <code>string push_endpoint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pushEndpoint.
   */
  java.lang.String getPushEndpoint();
  /**
   *
   *
   * <pre>
   * Optional. A URL locating the endpoint to which messages should be pushed.
   * For example, a Webhook endpoint might use `https://example.com/push`.
   * </pre>
   *
   * <code>string push_endpoint = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pushEndpoint.
   */
  com.google.protobuf.ByteString getPushEndpointBytes();

  /**
   *
   *
   * <pre>
   * Optional. Endpoint configuration attributes that can be used to control
   * different aspects of the message delivery.
   *
   * The only currently supported attribute is `x-goog-version`, which you can
   * use to change the format of the pushed message. This attribute
   * indicates the version of the data expected by the endpoint. This
   * controls the shape of the pushed message (i.e., its fields and metadata).
   *
   * If not present during the `CreateSubscription` call, it will default to
   * the version of the Pub/Sub API used to make such call. If not present in a
   * `ModifyPushConfig` call, its value will not be changed. `GetSubscription`
   * calls will always return a valid version, even if the subscription was
   * created without this attribute.
   *
   * The only supported values for the `x-goog-version` attribute are:
   *
   * * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API.
   * * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API.
   *
   * For example:
   * `attributes { "x-goog-version": "v1" }`
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAttributesCount();
  /**
   *
   *
   * <pre>
   * Optional. Endpoint configuration attributes that can be used to control
   * different aspects of the message delivery.
   *
   * The only currently supported attribute is `x-goog-version`, which you can
   * use to change the format of the pushed message. This attribute
   * indicates the version of the data expected by the endpoint. This
   * controls the shape of the pushed message (i.e., its fields and metadata).
   *
   * If not present during the `CreateSubscription` call, it will default to
   * the version of the Pub/Sub API used to make such call. If not present in a
   * `ModifyPushConfig` call, its value will not be changed. `GetSubscription`
   * calls will always return a valid version, even if the subscription was
   * created without this attribute.
   *
   * The only supported values for the `x-goog-version` attribute are:
   *
   * * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API.
   * * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API.
   *
   * For example:
   * `attributes { "x-goog-version": "v1" }`
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAttributes(java.lang.String key);
  /** Use {@link #getAttributesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAttributes();
  /**
   *
   *
   * <pre>
   * Optional. Endpoint configuration attributes that can be used to control
   * different aspects of the message delivery.
   *
   * The only currently supported attribute is `x-goog-version`, which you can
   * use to change the format of the pushed message. This attribute
   * indicates the version of the data expected by the endpoint. This
   * controls the shape of the pushed message (i.e., its fields and metadata).
   *
   * If not present during the `CreateSubscription` call, it will default to
   * the version of the Pub/Sub API used to make such call. If not present in a
   * `ModifyPushConfig` call, its value will not be changed. `GetSubscription`
   * calls will always return a valid version, even if the subscription was
   * created without this attribute.
   *
   * The only supported values for the `x-goog-version` attribute are:
   *
   * * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API.
   * * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API.
   *
   * For example:
   * `attributes { "x-goog-version": "v1" }`
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAttributesMap();
  /**
   *
   *
   * <pre>
   * Optional. Endpoint configuration attributes that can be used to control
   * different aspects of the message delivery.
   *
   * The only currently supported attribute is `x-goog-version`, which you can
   * use to change the format of the pushed message. This attribute
   * indicates the version of the data expected by the endpoint. This
   * controls the shape of the pushed message (i.e., its fields and metadata).
   *
   * If not present during the `CreateSubscription` call, it will default to
   * the version of the Pub/Sub API used to make such call. If not present in a
   * `ModifyPushConfig` call, its value will not be changed. `GetSubscription`
   * calls will always return a valid version, even if the subscription was
   * created without this attribute.
   *
   * The only supported values for the `x-goog-version` attribute are:
   *
   * * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API.
   * * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API.
   *
   * For example:
   * `attributes { "x-goog-version": "v1" }`
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getAttributesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Endpoint configuration attributes that can be used to control
   * different aspects of the message delivery.
   *
   * The only currently supported attribute is `x-goog-version`, which you can
   * use to change the format of the pushed message. This attribute
   * indicates the version of the data expected by the endpoint. This
   * controls the shape of the pushed message (i.e., its fields and metadata).
   *
   * If not present during the `CreateSubscription` call, it will default to
   * the version of the Pub/Sub API used to make such call. If not present in a
   * `ModifyPushConfig` call, its value will not be changed. `GetSubscription`
   * calls will always return a valid version, even if the subscription was
   * created without this attribute.
   *
   * The only supported values for the `x-goog-version` attribute are:
   *
   * * `v1beta1`: uses the push format defined in the v1beta1 Pub/Sub API.
   * * `v1` or `v1beta2`: uses the push format defined in the v1 Pub/Sub API.
   *
   * For example:
   * `attributes { "x-goog-version": "v1" }`
   * </pre>
   *
   * <code>map&lt;string, string&gt; attributes = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getAttributesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. If specified, Pub/Sub will generate and attach an OIDC JWT
   * token as an `Authorization` header in the HTTP request for every pushed
   * message.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PushConfig.OidcToken oidc_token = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the oidcToken field is set.
   */
  boolean hasOidcToken();
  /**
   *
   *
   * <pre>
   * Optional. If specified, Pub/Sub will generate and attach an OIDC JWT
   * token as an `Authorization` header in the HTTP request for every pushed
   * message.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PushConfig.OidcToken oidc_token = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The oidcToken.
   */
  com.google.pubsub.v1.PushConfig.OidcToken getOidcToken();
  /**
   *
   *
   * <pre>
   * Optional. If specified, Pub/Sub will generate and attach an OIDC JWT
   * token as an `Authorization` header in the HTTP request for every pushed
   * message.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PushConfig.OidcToken oidc_token = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.PushConfig.OidcTokenOrBuilder getOidcTokenOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. When set, the payload to the push endpoint is in the form of
   * the JSON representation of a PubsubMessage
   * (https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#pubsubmessage).
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PushConfig.PubsubWrapper pubsub_wrapper = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the pubsubWrapper field is set.
   */
  boolean hasPubsubWrapper();
  /**
   *
   *
   * <pre>
   * Optional. When set, the payload to the push endpoint is in the form of
   * the JSON representation of a PubsubMessage
   * (https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#pubsubmessage).
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PushConfig.PubsubWrapper pubsub_wrapper = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The pubsubWrapper.
   */
  com.google.pubsub.v1.PushConfig.PubsubWrapper getPubsubWrapper();
  /**
   *
   *
   * <pre>
   * Optional. When set, the payload to the push endpoint is in the form of
   * the JSON representation of a PubsubMessage
   * (https://cloud.google.com/pubsub/docs/reference/rpc/google.pubsub.v1#pubsubmessage).
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PushConfig.PubsubWrapper pubsub_wrapper = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.PushConfig.PubsubWrapperOrBuilder getPubsubWrapperOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. When set, the payload to the push endpoint is not wrapped.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PushConfig.NoWrapper no_wrapper = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the noWrapper field is set.
   */
  boolean hasNoWrapper();
  /**
   *
   *
   * <pre>
   * Optional. When set, the payload to the push endpoint is not wrapped.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PushConfig.NoWrapper no_wrapper = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The noWrapper.
   */
  com.google.pubsub.v1.PushConfig.NoWrapper getNoWrapper();
  /**
   *
   *
   * <pre>
   * Optional. When set, the payload to the push endpoint is not wrapped.
   * </pre>
   *
   * <code>
   * .google.pubsub.v1.PushConfig.NoWrapper no_wrapper = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.pubsub.v1.PushConfig.NoWrapperOrBuilder getNoWrapperOrBuilder();

  com.google.pubsub.v1.PushConfig.AuthenticationMethodCase getAuthenticationMethodCase();

  com.google.pubsub.v1.PushConfig.WrapperCase getWrapperCase();
}
