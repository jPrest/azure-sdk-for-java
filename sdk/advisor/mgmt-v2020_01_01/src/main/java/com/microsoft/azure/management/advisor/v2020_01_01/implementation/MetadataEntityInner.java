/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.advisor.v2020_01_01.implementation;

import java.util.List;
import com.microsoft.azure.management.advisor.v2020_01_01.Scenario;
import com.microsoft.azure.management.advisor.v2020_01_01.MetadataSupportedValueDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The metadata entity contract.
 */
@JsonFlatten
public class MetadataEntityInner {
    /**
     * The resource Id of the metadata entity.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * The type of the metadata entity.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * The name of the metadata entity.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * The display name.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * The list of keys on which this entity depends on.
     */
    @JsonProperty(value = "properties.dependsOn")
    private List<String> dependsOn;

    /**
     * The list of scenarios applicable to this metadata entity.
     */
    @JsonProperty(value = "properties.applicableScenarios")
    private List<Scenario> applicableScenarios;

    /**
     * The list of supported values.
     */
    @JsonProperty(value = "properties.supportedValues")
    private List<MetadataSupportedValueDetail> supportedValues;

    /**
     * Get the resource Id of the metadata entity.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the resource Id of the metadata entity.
     *
     * @param id the id value to set
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the type of the metadata entity.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type of the metadata entity.
     *
     * @param type the type value to set
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get the name of the metadata entity.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the metadata entity.
     *
     * @param name the name value to set
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the display name.
     *
     * @param displayName the displayName value to set
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the list of keys on which this entity depends on.
     *
     * @return the dependsOn value
     */
    public List<String> dependsOn() {
        return this.dependsOn;
    }

    /**
     * Set the list of keys on which this entity depends on.
     *
     * @param dependsOn the dependsOn value to set
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withDependsOn(List<String> dependsOn) {
        this.dependsOn = dependsOn;
        return this;
    }

    /**
     * Get the list of scenarios applicable to this metadata entity.
     *
     * @return the applicableScenarios value
     */
    public List<Scenario> applicableScenarios() {
        return this.applicableScenarios;
    }

    /**
     * Set the list of scenarios applicable to this metadata entity.
     *
     * @param applicableScenarios the applicableScenarios value to set
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withApplicableScenarios(List<Scenario> applicableScenarios) {
        this.applicableScenarios = applicableScenarios;
        return this;
    }

    /**
     * Get the list of supported values.
     *
     * @return the supportedValues value
     */
    public List<MetadataSupportedValueDetail> supportedValues() {
        return this.supportedValues;
    }

    /**
     * Set the list of supported values.
     *
     * @param supportedValues the supportedValues value to set
     * @return the MetadataEntityInner object itself.
     */
    public MetadataEntityInner withSupportedValues(List<MetadataSupportedValueDetail> supportedValues) {
        this.supportedValues = supportedValues;
        return this;
    }

}
