/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2020_01_01.implementation;

import com.microsoft.azure.arm.collection.InnerSupportsListing;
import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.ListOperationCallback;
import com.microsoft.azure.management.advisor.v2020_01_01.ArmErrorResponseException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Configurations.
 */
public class ConfigurationsInner implements InnerSupportsListing<ConfigDataInner> {
    /** The Retrofit service to perform REST calls. */
    private ConfigurationsService service;
    /** The service client containing this operation class. */
    private AdvisorManagementClientImpl client;

    /**
     * Initializes an instance of ConfigurationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public ConfigurationsInner(Retrofit retrofit, AdvisorManagementClientImpl client) {
        this.service = retrofit.create(ConfigurationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Configurations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface ConfigurationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.advisor.v2020_01_01.Configurations list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.Advisor/configurations")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.advisor.v2020_01_01.Configurations createInSubscription" })
        @PUT("subscriptions/{subscriptionId}/providers/Microsoft.Advisor/configurations/{configurationName}")
        Observable<Response<ResponseBody>> createInSubscription(@Path("subscriptionId") String subscriptionId, @Path("configurationName") String configurationName, @Query("api-version") String apiVersion, @Body ConfigDataInner configContract, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.advisor.v2020_01_01.Configurations listByResourceGroup" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Advisor/configurations")
        Observable<Response<ResponseBody>> listByResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("resourceGroup") String resourceGroup, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.advisor.v2020_01_01.Configurations createInResourceGroup" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroup}/providers/Microsoft.Advisor/configurations/{configurationName}")
        Observable<Response<ResponseBody>> createInResourceGroup(@Path("subscriptionId") String subscriptionId, @Path("configurationName") String configurationName, @Path("resourceGroup") String resourceGroup, @Query("api-version") String apiVersion, @Body ConfigDataInner configContract, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.advisor.v2020_01_01.Configurations listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Retrieve Azure Advisor configurations.
     * Retrieve Azure Advisor configurations and also retrieve configurations of contained resource groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ArmErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ConfigDataInner&gt; object if successful.
     */
    public PagedList<ConfigDataInner> list() {
        ServiceResponse<Page<ConfigDataInner>> response = listSinglePageAsync().toBlocking().single();
        return new PagedList<ConfigDataInner>(response.body()) {
            @Override
            public Page<ConfigDataInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieve Azure Advisor configurations.
     * Retrieve Azure Advisor configurations and also retrieve configurations of contained resource groups.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ConfigDataInner>> listAsync(final ListOperationCallback<ConfigDataInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(),
            new Func1<String, Observable<ServiceResponse<Page<ConfigDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ConfigDataInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieve Azure Advisor configurations.
     * Retrieve Azure Advisor configurations and also retrieve configurations of contained resource groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ConfigDataInner&gt; object
     */
    public Observable<Page<ConfigDataInner>> listAsync() {
        return listWithServiceResponseAsync()
            .map(new Func1<ServiceResponse<Page<ConfigDataInner>>, Page<ConfigDataInner>>() {
                @Override
                public Page<ConfigDataInner> call(ServiceResponse<Page<ConfigDataInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieve Azure Advisor configurations.
     * Retrieve Azure Advisor configurations and also retrieve configurations of contained resource groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ConfigDataInner&gt; object
     */
    public Observable<ServiceResponse<Page<ConfigDataInner>>> listWithServiceResponseAsync() {
        return listSinglePageAsync()
            .concatMap(new Func1<ServiceResponse<Page<ConfigDataInner>>, Observable<ServiceResponse<Page<ConfigDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ConfigDataInner>>> call(ServiceResponse<Page<ConfigDataInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieve Azure Advisor configurations.
     * Retrieve Azure Advisor configurations and also retrieve configurations of contained resource groups.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ConfigDataInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ConfigDataInner>>> listSinglePageAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ConfigDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ConfigDataInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ConfigDataInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ConfigDataInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ConfigDataInner>> listDelegate(Response<ResponseBody> response) throws ArmErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ConfigDataInner>, ArmErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ConfigDataInner>>() { }.getType())
                .registerError(ArmErrorResponseException.class)
                .build(response);
    }

    /**
     * Create/Overwrite Azure Advisor configuration.
     * Create/Overwrite Azure Advisor configuration and also delete all configurations of contained resource groups.
     *
     * @param configContract The Azure Advisor configuration data structure.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ArmErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConfigDataInner object if successful.
     */
    public ConfigDataInner createInSubscription(ConfigDataInner configContract) {
        return createInSubscriptionWithServiceResponseAsync(configContract).toBlocking().single().body();
    }

    /**
     * Create/Overwrite Azure Advisor configuration.
     * Create/Overwrite Azure Advisor configuration and also delete all configurations of contained resource groups.
     *
     * @param configContract The Azure Advisor configuration data structure.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ConfigDataInner> createInSubscriptionAsync(ConfigDataInner configContract, final ServiceCallback<ConfigDataInner> serviceCallback) {
        return ServiceFuture.fromResponse(createInSubscriptionWithServiceResponseAsync(configContract), serviceCallback);
    }

    /**
     * Create/Overwrite Azure Advisor configuration.
     * Create/Overwrite Azure Advisor configuration and also delete all configurations of contained resource groups.
     *
     * @param configContract The Azure Advisor configuration data structure.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConfigDataInner object
     */
    public Observable<ConfigDataInner> createInSubscriptionAsync(ConfigDataInner configContract) {
        return createInSubscriptionWithServiceResponseAsync(configContract).map(new Func1<ServiceResponse<ConfigDataInner>, ConfigDataInner>() {
            @Override
            public ConfigDataInner call(ServiceResponse<ConfigDataInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create/Overwrite Azure Advisor configuration.
     * Create/Overwrite Azure Advisor configuration and also delete all configurations of contained resource groups.
     *
     * @param configContract The Azure Advisor configuration data structure.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConfigDataInner object
     */
    public Observable<ServiceResponse<ConfigDataInner>> createInSubscriptionWithServiceResponseAsync(ConfigDataInner configContract) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (configContract == null) {
            throw new IllegalArgumentException("Parameter configContract is required and cannot be null.");
        }
        Validator.validate(configContract);
        final String configurationName = "default";
        return service.createInSubscription(this.client.subscriptionId(), configurationName, this.client.apiVersion(), configContract, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ConfigDataInner>>>() {
                @Override
                public Observable<ServiceResponse<ConfigDataInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ConfigDataInner> clientResponse = createInSubscriptionDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ConfigDataInner> createInSubscriptionDelegate(Response<ResponseBody> response) throws ArmErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ConfigDataInner, ArmErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ConfigDataInner>() { }.getType())
                .registerError(ArmErrorResponseException.class)
                .build(response);
    }

    /**
     * Retrieve Azure Advisor configurations.
     *
     * @param resourceGroup The name of the Azure resource group.
     * @return the PagedList<ConfigDataInner> object if successful.
     */
    public PagedList<ConfigDataInner> listByResourceGroup(String resourceGroup) {
        PageImpl1<ConfigDataInner> page = new PageImpl1<>();
        page.setItems(listByResourceGroupWithServiceResponseAsync(resourceGroup).toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<ConfigDataInner>(page) {
            @Override
            public Page<ConfigDataInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Retrieve Azure Advisor configurations.
     *
     * @param resourceGroup The name of the Azure resource group.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ConfigDataInner>> listByResourceGroupAsync(String resourceGroup, final ServiceCallback<List<ConfigDataInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listByResourceGroupWithServiceResponseAsync(resourceGroup), serviceCallback);
    }

    /**
     * Retrieve Azure Advisor configurations.
     *
     * @param resourceGroup The name of the Azure resource group.
     * @return the observable to the List&lt;ConfigDataInner&gt; object
     */
    public Observable<Page<ConfigDataInner>> listByResourceGroupAsync(String resourceGroup) {
        return listByResourceGroupWithServiceResponseAsync(resourceGroup).map(new Func1<ServiceResponse<List<ConfigDataInner>>, Page<ConfigDataInner>>() {
            @Override
            public Page<ConfigDataInner> call(ServiceResponse<List<ConfigDataInner>> response) {
                PageImpl1<ConfigDataInner> page = new PageImpl1<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Retrieve Azure Advisor configurations.
     *
     * @param resourceGroup The name of the Azure resource group.
     * @return the observable to the List&lt;ConfigDataInner&gt; object
     */
    public Observable<ServiceResponse<List<ConfigDataInner>>> listByResourceGroupWithServiceResponseAsync(String resourceGroup) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroup == null) {
            throw new IllegalArgumentException("Parameter resourceGroup is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.listByResourceGroup(this.client.subscriptionId(), resourceGroup, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<ConfigDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<ConfigDataInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl1<ConfigDataInner>> result = listByResourceGroupDelegate(response);
                        List<ConfigDataInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<ConfigDataInner>> clientResponse = new ServiceResponse<List<ConfigDataInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl1<ConfigDataInner>> listByResourceGroupDelegate(Response<ResponseBody> response) throws ArmErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl1<ConfigDataInner>, ArmErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl1<ConfigDataInner>>() { }.getType())
                .registerError(ArmErrorResponseException.class)
                .build(response);
    }

    /**
     * Create/Overwrite Azure Advisor configuration.
     *
     * @param resourceGroup The name of the Azure resource group.
     * @param configContract The Azure Advisor configuration data structure.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ArmErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the ConfigDataInner object if successful.
     */
    public ConfigDataInner createInResourceGroup(String resourceGroup, ConfigDataInner configContract) {
        return createInResourceGroupWithServiceResponseAsync(resourceGroup, configContract).toBlocking().single().body();
    }

    /**
     * Create/Overwrite Azure Advisor configuration.
     *
     * @param resourceGroup The name of the Azure resource group.
     * @param configContract The Azure Advisor configuration data structure.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<ConfigDataInner> createInResourceGroupAsync(String resourceGroup, ConfigDataInner configContract, final ServiceCallback<ConfigDataInner> serviceCallback) {
        return ServiceFuture.fromResponse(createInResourceGroupWithServiceResponseAsync(resourceGroup, configContract), serviceCallback);
    }

    /**
     * Create/Overwrite Azure Advisor configuration.
     *
     * @param resourceGroup The name of the Azure resource group.
     * @param configContract The Azure Advisor configuration data structure.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConfigDataInner object
     */
    public Observable<ConfigDataInner> createInResourceGroupAsync(String resourceGroup, ConfigDataInner configContract) {
        return createInResourceGroupWithServiceResponseAsync(resourceGroup, configContract).map(new Func1<ServiceResponse<ConfigDataInner>, ConfigDataInner>() {
            @Override
            public ConfigDataInner call(ServiceResponse<ConfigDataInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Create/Overwrite Azure Advisor configuration.
     *
     * @param resourceGroup The name of the Azure resource group.
     * @param configContract The Azure Advisor configuration data structure.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the ConfigDataInner object
     */
    public Observable<ServiceResponse<ConfigDataInner>> createInResourceGroupWithServiceResponseAsync(String resourceGroup, ConfigDataInner configContract) {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (resourceGroup == null) {
            throw new IllegalArgumentException("Parameter resourceGroup is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (configContract == null) {
            throw new IllegalArgumentException("Parameter configContract is required and cannot be null.");
        }
        Validator.validate(configContract);
        final String configurationName = "default";
        return service.createInResourceGroup(this.client.subscriptionId(), configurationName, resourceGroup, this.client.apiVersion(), configContract, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<ConfigDataInner>>>() {
                @Override
                public Observable<ServiceResponse<ConfigDataInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<ConfigDataInner> clientResponse = createInResourceGroupDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<ConfigDataInner> createInResourceGroupDelegate(Response<ResponseBody> response) throws ArmErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<ConfigDataInner, ArmErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<ConfigDataInner>() { }.getType())
                .registerError(ArmErrorResponseException.class)
                .build(response);
    }

    /**
     * Retrieve Azure Advisor configurations.
     * Retrieve Azure Advisor configurations and also retrieve configurations of contained resource groups.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ArmErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;ConfigDataInner&gt; object if successful.
     */
    public PagedList<ConfigDataInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<ConfigDataInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<ConfigDataInner>(response.body()) {
            @Override
            public Page<ConfigDataInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Retrieve Azure Advisor configurations.
     * Retrieve Azure Advisor configurations and also retrieve configurations of contained resource groups.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<ConfigDataInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<ConfigDataInner>> serviceFuture, final ListOperationCallback<ConfigDataInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<ConfigDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ConfigDataInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Retrieve Azure Advisor configurations.
     * Retrieve Azure Advisor configurations and also retrieve configurations of contained resource groups.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ConfigDataInner&gt; object
     */
    public Observable<Page<ConfigDataInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<ConfigDataInner>>, Page<ConfigDataInner>>() {
                @Override
                public Page<ConfigDataInner> call(ServiceResponse<Page<ConfigDataInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Retrieve Azure Advisor configurations.
     * Retrieve Azure Advisor configurations and also retrieve configurations of contained resource groups.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;ConfigDataInner&gt; object
     */
    public Observable<ServiceResponse<Page<ConfigDataInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<ConfigDataInner>>, Observable<ServiceResponse<Page<ConfigDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ConfigDataInner>>> call(ServiceResponse<Page<ConfigDataInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Retrieve Azure Advisor configurations.
     * Retrieve Azure Advisor configurations and also retrieve configurations of contained resource groups.
     *
    ServiceResponse<PageImpl<ConfigDataInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;ConfigDataInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<ConfigDataInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<ConfigDataInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<ConfigDataInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<ConfigDataInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<ConfigDataInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<ConfigDataInner>> listNextDelegate(Response<ResponseBody> response) throws ArmErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<ConfigDataInner>, ArmErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<ConfigDataInner>>() { }.getType())
                .registerError(ArmErrorResponseException.class)
                .build(response);
    }

}
