/*
 * Copyright 2015 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty5.util;

import io.netty5.util.concurrent.Future;
import io.netty5.util.concurrent.Promise;

public interface AsyncMapping<IN, OUT> {

    /**
     * Returns the {@link Future} that will provide the result of the mapping. The given {@link Promise} will
     * be fulfilled when the result is available.
     */
    Future<OUT> map(IN input, Promise<OUT> promise);
}