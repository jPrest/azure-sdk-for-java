/**
 * Copyright 2012 Microsoft Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.microsoft.windowsazure.services.media.implementation;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import com.microsoft.windowsazure.services.media.implementation.atom.EntryType;

/**
 * Class wrapping deserialized OData entities. Allows easy
 * access to entry and content types.
 * 
 */
public abstract class ODataEntity<T> {

    private final EntryType entry;
    private final T content;

    protected ODataEntity(EntryType entry, T content) {
        this.entry = entry;
        this.content = content;
    }

    /**
     * @return the entry
     */
    protected EntryType getEntry() {
        return entry;
    }

    /**
     * @return the content
     */
    protected T getContent() {
        return content;
    }

    /**
     * Is the given type inherited from ODataEntity
     * 
     * @param type
     *            Type to check
     * @return true if derived from ODataEntity
     */
    public static boolean isODataEntityType(Class<?> type) {
        return ODataEntity.class.isAssignableFrom(type);
    }

    /**
     * Is the given type a collection of ODataEntity
     * 
     * @param type
     *            Base type
     * @param genericType
     *            Generic type
     * @return true if it's List&lt;OEntity> or derive from.
     */
    public static boolean isODataEntityCollectionType(Class<?> type, Type genericType) {
        if (List.class != type) {
            return false;
        }

        ParameterizedType pt = (ParameterizedType) genericType;

        if (pt.getActualTypeArguments().length != 1) {
            return false;
        }

        Class<?> typeClass = getCollectedType(genericType);

        return isODataEntityType(typeClass);
    }

    public static Class<?> getCollectedType(Type genericType) {
        ParameterizedType pt = (ParameterizedType) genericType;
        if (pt.getActualTypeArguments().length != 1) {
            throw new IllegalArgumentException("genericType");
        }
        return (Class<?>) pt.getActualTypeArguments()[0];
    }
}
