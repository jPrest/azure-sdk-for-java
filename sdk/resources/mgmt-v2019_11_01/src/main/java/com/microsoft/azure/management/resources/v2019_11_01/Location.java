/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_11_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.resources.v2019_11_01.implementation.LocationInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.resources.v2019_11_01.implementation.ResourcesManager;

/**
 * Type representing Location.
 */
public interface Location extends HasInner<LocationInner>, HasManager<ResourcesManager> {
    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the metadata value.
     */
    LocationMetadata metadata();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the regionalDisplayName value.
     */
    String regionalDisplayName();

    /**
     * @return the subscriptionId value.
     */
    String subscriptionId();

}
