/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_11_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Information regarding paired region.
 */
public class PairedRegion {
    /**
     * The name of the paired region.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The fully qualified ID of the location. For example,
     * /subscriptions/00000000-0000-0000-0000-000000000000/locations/westus.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The subscription ID.
     */
    @JsonProperty(value = "subscriptionId", access = JsonProperty.Access.WRITE_ONLY)
    private String subscriptionId;

    /**
     * Get the name of the paired region.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the fully qualified ID of the location. For example, /subscriptions/00000000-0000-0000-0000-000000000000/locations/westus.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the subscription ID.
     *
     * @return the subscriptionId value
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

}
