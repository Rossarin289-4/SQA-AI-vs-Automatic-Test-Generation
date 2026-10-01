package org.mockito.benchmark;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.mockito.internal.util.reflection.GenericMaster;

public class Mockito12ChatGPTTest {

    private List<Set<String>> nested;
    private List<Set<List<String>>> multiNested;

    @Test
    public void shouldResolveNestedGenericType() throws Exception {
        GenericMaster master = new GenericMaster();

        Field nestedField =
                Mockito12ChatGPTTest.class.getDeclaredField("nested");

        Field multiNestedField =
                Mockito12ChatGPTTest.class.getDeclaredField("multiNested");

        assertEquals(Set.class, master.getGenericType(nestedField));
        assertEquals(Set.class, master.getGenericType(multiNestedField));
    }
}
