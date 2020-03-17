/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_11_01;

import rx.Observable;
import com.microsoft.azure.management.resources.v2019_11_01.implementation.TenantsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing Tenants.
 */
public interface Tenants extends HasInner<TenantsInner> {
    /**
     * Gets the tenants for your account.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<TenantIdDescription> listAsync();

}
