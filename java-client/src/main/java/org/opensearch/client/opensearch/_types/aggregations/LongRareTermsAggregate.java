/*
 * SPDX-License-Identifier: Apache-2.0
 *
 * The OpenSearch Contributors require contributions made to
 * this file be licensed under the Apache-2.0 license or a
 * compatible open source license.
 */

/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

/*
 * Modifications Copyright OpenSearch Contributors. See
 * GitHub history for details.
 */

package org.opensearch.client.opensearch._types.aggregations;

import org.opensearch.client.json.JsonpDeserializable;
import org.opensearch.client.json.JsonpDeserializer;
import org.opensearch.client.json.ObjectBuilderDeserializer;
import org.opensearch.client.json.ObjectDeserializer;
import org.opensearch.client.util.ObjectBuilder;

import java.util.function.Function;

// typedef: _types.aggregations.LongRareTermsAggregate

/**
 * Result of the <code>rare_terms</code> aggregation when the field is some kind
 * of whole number like a integer, long, or a date.
 *
 */
@JsonpDeserializable
public class LongRareTermsAggregate extends MultiBucketAggregateBase<LongRareTermsBucket> implements AggregateVariant {
	// ---------------------------------------------------------------------------------------------

	private LongRareTermsAggregate(Builder builder) {
		super(builder);

	}

	public static LongRareTermsAggregate of(Function<Builder, ObjectBuilder<LongRareTermsAggregate>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Aggregate variant kind.
	 */
	@Override
	public Aggregate.Kind _aggregateKind() {
		return Aggregate.Kind.Lrareterms;
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link LongRareTermsAggregate}.
	 */

	public static class Builder extends MultiBucketAggregateBase.AbstractBuilder<LongRareTermsBucket, Builder>
			implements
				ObjectBuilder<LongRareTermsAggregate> {
		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link LongRareTermsAggregate}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public LongRareTermsAggregate build() {
			_checkSingleUse();
			super.tBucketSerializer(null);

			return new LongRareTermsAggregate(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link LongRareTermsAggregate}
	 */
	public static final JsonpDeserializer<LongRareTermsAggregate> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, LongRareTermsAggregate::setupLongRareTermsAggregateDeserializer);

	protected static void setupLongRareTermsAggregateDeserializer(
			ObjectDeserializer<LongRareTermsAggregate.Builder> op) {
		MultiBucketAggregateBase.setupMultiBucketAggregateBaseDeserializer(op, LongRareTermsBucket._DESERIALIZER);

	}

}
