/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2020_01_01.implementation;

import com.microsoft.azure.management.advisor.v2020_01_01.OperationEntity;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.advisor.v2020_01_01.OperationDisplayInfo;

class OperationEntityImpl extends WrapperImpl<OperationEntityInner> implements OperationEntity {
    private final AdvisorManager manager;
    OperationEntityImpl(OperationEntityInner inner, AdvisorManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public AdvisorManager manager() {
        return this.manager;
    }

    @Override
    public OperationDisplayInfo display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

}
