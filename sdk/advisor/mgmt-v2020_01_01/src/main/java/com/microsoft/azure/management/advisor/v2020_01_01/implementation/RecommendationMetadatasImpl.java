/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * abc
 */

package com.microsoft.azure.management.advisor.v2020_01_01.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.advisor.v2020_01_01.RecommendationMetadatas;
import rx.functions.Func1;
import rx.Observable;
import com.microsoft.azure.Page;
import com.microsoft.azure.management.advisor.v2020_01_01.MetadataEntity;

class RecommendationMetadatasImpl extends WrapperImpl<RecommendationMetadatasInner> implements RecommendationMetadatas {
    private final AdvisorManager manager;

    RecommendationMetadatasImpl(AdvisorManager manager) {
        super(manager.inner().recommendationMetadatas());
        this.manager = manager;
    }

    public AdvisorManager manager() {
        return this.manager;
    }

    @Override
    public Observable<Object> getAsync(String name) {
        RecommendationMetadatasInner client = this.inner();
        return client.getAsync(name)
    ;}

    @Override
    public Observable<MetadataEntity> listAsync() {
        RecommendationMetadatasInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<MetadataEntityInner>, Iterable<MetadataEntityInner>>() {
            @Override
            public Iterable<MetadataEntityInner> call(Page<MetadataEntityInner> page) {
                return page.items();
            }
        })
        .map(new Func1<MetadataEntityInner, MetadataEntity>() {
            @Override
            public MetadataEntity call(MetadataEntityInner inner) {
                return new MetadataEntityImpl(inner, manager());
            }
        });
    }

}
