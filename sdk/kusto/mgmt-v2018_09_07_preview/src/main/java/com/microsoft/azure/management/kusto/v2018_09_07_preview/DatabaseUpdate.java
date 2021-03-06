/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.kusto.v2018_09_07_preview;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Class representing an update to a Kusto database.
 */
@JsonFlatten
public class DatabaseUpdate extends ProxyResource {
    /**
     * Resource location.
     */
    @JsonProperty(value = "location")
    private String location;

    /**
     * An ETag of the resource updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * The provisioned state of the resource. Possible values include:
     * 'Running', 'Creating', 'Deleting', 'Succeeded', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /**
     * The number of days data should be kept before it stops being accessible
     * to queries.
     */
    @JsonProperty(value = "properties.softDeletePeriodInDays", required = true)
    private int softDeletePeriodInDays;

    /**
     * The number of days of data that should be kept in cache for fast
     * queries.
     */
    @JsonProperty(value = "properties.hotCachePeriodInDays")
    private Integer hotCachePeriodInDays;

    /**
     * The statistics of the database.
     */
    @JsonProperty(value = "properties.statistics")
    private DatabaseStatistics statistics;

    /**
     * Get resource location.
     *
     * @return the location value
     */
    public String location() {
        return this.location;
    }

    /**
     * Set resource location.
     *
     * @param location the location value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get an ETag of the resource updated.
     *
     * @return the etag value
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the provisioned state of the resource. Possible values include: 'Running', 'Creating', 'Deleting', 'Succeeded', 'Failed'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the number of days data should be kept before it stops being accessible to queries.
     *
     * @return the softDeletePeriodInDays value
     */
    public int softDeletePeriodInDays() {
        return this.softDeletePeriodInDays;
    }

    /**
     * Set the number of days data should be kept before it stops being accessible to queries.
     *
     * @param softDeletePeriodInDays the softDeletePeriodInDays value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withSoftDeletePeriodInDays(int softDeletePeriodInDays) {
        this.softDeletePeriodInDays = softDeletePeriodInDays;
        return this;
    }

    /**
     * Get the number of days of data that should be kept in cache for fast queries.
     *
     * @return the hotCachePeriodInDays value
     */
    public Integer hotCachePeriodInDays() {
        return this.hotCachePeriodInDays;
    }

    /**
     * Set the number of days of data that should be kept in cache for fast queries.
     *
     * @param hotCachePeriodInDays the hotCachePeriodInDays value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withHotCachePeriodInDays(Integer hotCachePeriodInDays) {
        this.hotCachePeriodInDays = hotCachePeriodInDays;
        return this;
    }

    /**
     * Get the statistics of the database.
     *
     * @return the statistics value
     */
    public DatabaseStatistics statistics() {
        return this.statistics;
    }

    /**
     * Set the statistics of the database.
     *
     * @param statistics the statistics value to set
     * @return the DatabaseUpdate object itself.
     */
    public DatabaseUpdate withStatistics(DatabaseStatistics statistics) {
        this.statistics = statistics;
        return this;
    }

}
