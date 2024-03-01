package org.fugerit.java.fjdaogenquickstart;

import io.quarkus.runtime.annotations.RegisterForReflection;
import org.fugerit.java.core.function.SimpleValue;

@RegisterForReflection( targets = { SimpleValueRef.class, SimpleValue.class })
public class SimpleValueRef<T> extends  SimpleValue<T> {

    public SimpleValueRef(T value) {
        super(value);
    }

    public SimpleValueRef() {
    }

}
