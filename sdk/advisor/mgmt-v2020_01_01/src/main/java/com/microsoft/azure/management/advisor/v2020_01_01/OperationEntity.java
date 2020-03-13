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
import com.microsoft.azure.management.advisor.v2020_01_01.implementation.OperationEntityInner;

/**
 * Type representing OperationEntity.
 */
public interface OperationEntity extends HasInner<OperationEntityInner>, HasManager<AdvisorManager> {
    /**
     * @return the display value.
     */
    OperationDisplayInfo display();

    /**
     * @return the name value.
     */
    String name();

}
