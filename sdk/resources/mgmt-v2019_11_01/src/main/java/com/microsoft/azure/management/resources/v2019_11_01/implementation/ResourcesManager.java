/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.resources.v2019_11_01.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.resources.v2019_11_01.Operations;
import com.microsoft.azure.management.resources.v2019_11_01.Subscriptions;
import com.microsoft.azure.management.resources.v2019_11_01.Tenants;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Resources resource management.
 */
public final class ResourcesManager extends ManagerCore<ResourcesManager, SubscriptionClientImpl> {
    private Operations operations;
    private Subscriptions subscriptions;
    private Tenants tenants;
    /**
    * Get a Configurable instance that can be used to create ResourcesManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new ResourcesManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of ResourcesManager that exposes Resources resource management API entry points.
    *
    * @param credentials the credentials to use
    * @return the ResourcesManager
    */
    public static ResourcesManager authenticate(AzureTokenCredentials credentials) {
        return new ResourcesManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build());
    }
    /**
    * Creates an instance of ResourcesManager that exposes Resources resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @return the ResourcesManager
    */
    public static ResourcesManager authenticate(RestClient restClient) {
        return new ResourcesManager(restClient);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of ResourcesManager that exposes Resources management API entry points.
        *
        * @param credentials the credentials to use
        * @return the interface exposing Resources management API entry points that work across subscriptions
        */
        ResourcesManager authenticate(AzureTokenCredentials credentials);
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage Subscriptions.
     */
    public Subscriptions subscriptions() {
        if (this.subscriptions == null) {
            this.subscriptions = new SubscriptionsImpl(this);
        }
        return this.subscriptions;
    }

    /**
     * @return Entry point to manage Tenants.
     */
    public Tenants tenants() {
        if (this.tenants == null) {
            this.tenants = new TenantsImpl(this);
        }
        return this.tenants;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public ResourcesManager authenticate(AzureTokenCredentials credentials) {
           return ResourcesManager.authenticate(buildRestClient(credentials));
        }
     }
    private ResourcesManager(RestClient restClient) {
        super(
            restClient,
            null,
            new SubscriptionClientImpl(restClient));
    }
}
