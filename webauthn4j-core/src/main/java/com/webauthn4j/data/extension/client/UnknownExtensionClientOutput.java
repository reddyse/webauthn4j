/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.webauthn4j.data.extension.client;

import com.webauthn4j.data.extension.AbstractExtensionOutput;

import java.io.Serializable;
import java.util.Objects;

public class UnknownExtensionClientOutput extends AbstractExtensionOutput<Serializable> implements RegistrationExtensionClientOutput<Serializable> {

    private String name;

    public UnknownExtensionClientOutput(String name, Serializable value) {
        super(value);
        this.name = name;
    }

    @Override
    public String getIdentifier() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        UnknownExtensionClientOutput that = (UnknownExtensionClientOutput) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), name);
    }
}
