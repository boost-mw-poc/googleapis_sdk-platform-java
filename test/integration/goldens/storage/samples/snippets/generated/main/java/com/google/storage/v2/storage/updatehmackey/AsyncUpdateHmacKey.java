/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.storage.v2.samples;

// [START storage_v2_generated_Storage_UpdateHmacKey_async]
import com.google.api.core.ApiFuture;
import com.google.protobuf.FieldMask;
import com.google.storage.v2.HmacKeyMetadata;
import com.google.storage.v2.StorageClient;
import com.google.storage.v2.UpdateHmacKeyRequest;

public class AsyncUpdateHmacKey {

  public static void main(String[] args) throws Exception {
    asyncUpdateHmacKey();
  }

  public static void asyncUpdateHmacKey() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (StorageClient storageClient = StorageClient.create()) {
      UpdateHmacKeyRequest request =
          UpdateHmacKeyRequest.newBuilder()
              .setHmacKey(HmacKeyMetadata.newBuilder().build())
              .setUpdateMask(FieldMask.newBuilder().build())
              .build();
      ApiFuture<HmacKeyMetadata> future = storageClient.updateHmacKeyCallable().futureCall(request);
      // Do something.
      HmacKeyMetadata response = future.get();
    }
  }
}
// [END storage_v2_generated_Storage_UpdateHmacKey_async]
