package org.mockito.benchmark;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Method;

import org.junit.Test;
import org.mockito.internal.util.reflection.GenericMetadataSupport;

public class Mockito8ChatGPTTest {

    interface SelfReferential<T extends SelfReferential<T>> {
        T self();
    }

    @Test
    public void shouldResolveRawTypeOfSelfReferentialGeneric() throws Exception {
        Method selfMethod =
                SelfReferential.class.getDeclaredMethod("self");

        GenericMetadataSupport genericMetadata =
                GenericMetadataSupport.inferFrom(SelfReferential.class)
                        .resolveGenericReturnType(selfMethod);

        assertEquals(SelfReferential.class, genericMetadata.rawType());
    }
}
