/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2020_01_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.advisor.v2020_01_01.implementation.AdvisorManager;
import com.microsoft.azure.management.advisor.v2020_01_01.implementation.MetadataEntityInner;
import java.util.List;

/**
 * Type representing MetadataEntity.
 */
public interface MetadataEntity extends HasInner<MetadataEntityInner>, HasManager<AdvisorManager> {
    /**
     * @return the applicableScenarios value.
     */
    List<Scenario> applicableScenarios();

    /**
     * @return the dependsOn value.
     */
    List<String> dependsOn();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the supportedValues value.
     */
    List<MetadataSupportedValueDetail> supportedValues();

    /**
     * @return the type value.
     */
    String type();

}
