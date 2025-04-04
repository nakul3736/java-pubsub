/*
 * Copyright 2019 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.google.cloud.pubsub.v1;

import io.opentelemetry.api.common.AttributesBuilder;

public class ModAckHandler implements RpcOperationHandler{

    private static final String ACK_DEADLINE_ATTR_KEY = "messaging.gcp_pubsub.message.ack_deadline";
    private static final String RECEIPT_MODACK_ATTR_KEY = "messaging.gcp_pubsub.is_receipt_modack";

    @Override
    public String getCodeFunction() {
        return "sendModAckOperations";
    }

    @Override
    public String getOperationName() {
        return "modack";
    }

    @Override
    public void addAttributes(AttributesBuilder builder, int ackDeadline, boolean isReceiptModack) {
        builder.put("messaging.gcp_pubsub.message.ack_deadline", ackDeadline)
                .put("messaging.gcp_pubsub.is_receipt_modack", isReceiptModack);
    }

    @Override
    public void addEvent(PubsubMessageWrapper message) {
        message.addModAckStartEvent();
    }
}
