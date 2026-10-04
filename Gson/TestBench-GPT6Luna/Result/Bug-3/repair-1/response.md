```java
package com.google.gson.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;

public class ConstructorConstructorTest {
    @Test
    public void testExactTypeInstanceCreator() throws Exception {
        final TypeToken<String> token = TypeToken.get(String.class);
        Map<Type, InstanceCreator<?>> creators = new LinkedHashMap<Type, InstanceCreator<?>>();
        creators.put(token.getType(), new InstanceCreator<String>() {
            public String createInstance(Type type) { return "exact"; }
        });
        assertEquals("exact", new ConstructorConstructor(creators).get(token).construct());
    }

    @Test
    public void testRawTypeInstanceCreator() throws Exception {
        final TypeToken<String> token = TypeToken.get(String.class);
        Map<Type, InstanceCreator<?>> creators = new LinkedHashMap<Type, InstanceCreator<?>>();
        creators.put(String.class, new InstanceCreator<String>() {
            public String createInstance(Type type) { return "raw"; }
        });
        assertEquals("raw", new ConstructorConstructor(creators).get(token).construct());
    }

    @Test
    public void testExactCreatorTakesPrecedence() throws Exception {
        final TypeToken<String> token = TypeToken.get(String.class);
        Map<Type, InstanceCreator<?>> creators = new LinkedHashMap<Type, InstanceCreator<?>>();
        creators.put(token.getType(), new InstanceCreator<String>() {
            public String createInstance(Type type) { return "exact"; }
        });
        creators.put(String.class, new InstanceCreator<String>() {
            public String createInstance(Type type) { return "raw"; }
        });
        assertEquals("exact", new ConstructorConstructor(creators).get(token).construct());
    }

    @Test
    public void testCreatorReceivesParameterizedType() throws Exception {
        final TypeToken<ArrayList<String>> token =
                new TypeToken<ArrayList<String>>() {};
        final Type[] received = new Type[1];
        Map<Type, InstanceCreator<?>> creators = new LinkedHashMap<Type, InstanceCreator<?>>();
        creators.put(ArrayList.class, new InstanceCreator<ArrayList<String>>() {
            public ArrayList<String> createInstance(Type type) {
                received[0] = type;
                return new ArrayList<String>();
            }
        });
        ObjectConstructor<ArrayList<String>> constructor =
                new ConstructorConstructor(creators).get(token);
        assertEquals(token.getType(), received[0] == null ? constructor.construct() : received[0]);
        assertEquals(token.getType(), received[0]);
    }

    @Test
    public void testInvokesDeclaredNoArgConstructor() throws Exception {
        ObjectConstructor<StringBuilder> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(TypeToken.get(StringBuilder.class));
        assertEquals("", constructor.construct().toString());
    }

    @Test
    public void testDefaultCollectionIsArrayList() throws Exception {
        ObjectConstructor<Collection<String>> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(new TypeToken<Collection<String>>() {});
        Collection<String> result = constructor.construct();
        assertEquals(0, result.size());
        result.add("a");
        assertEquals(1, result.size());
    }

    @Test
    public void testSetInterfacePreservesInsertionOrder() throws Exception {
        ObjectConstructor<Set<String>> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(new TypeToken<Set<String>>() {});
        Set<String> result = constructor.construct();
        result.add("b");
        result.add("a");
        assertEquals(new ArrayList<String>(java.util.Arrays.asList("b", "a")),
                new ArrayList<String>(result));
    }

    @Test
    public void testSortedSetInterfaceOrdersElements() throws Exception {
        ObjectConstructor<SortedSet<String>> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(new TypeToken<SortedSet<String>>() {});
        SortedSet<String> result = constructor.construct();
        result.add("b");
        result.add("a");
        assertEquals(new ArrayList<String>(java.util.Arrays.asList("a", "b")),
                new ArrayList<String>(result));
    }

    @Test
    public void testQueueInterfacePreservesQueueOrder() throws Exception {
        ObjectConstructor<Queue<String>> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(new TypeToken<Queue<String>>() {});
        Queue<String> result = constructor.construct();
        result.add("first");
        result.add("last");
        assertEquals("first", result.remove());
        assertEquals("last", result.remove());
        assertEquals(0, result.size());
    }

    @Test
    public void testEnumSetUsesEnumElementType() throws Exception {
        ObjectConstructor<EnumSet<Thread.State>> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(new TypeToken<EnumSet<Thread.State>>() {});
        EnumSet<Thread.State> result = constructor.construct();
        assertEquals(0, result.size());
        result.add(Thread.State.NEW);
        assertTrue(result.contains(Thread.State.NEW));
    }

    @Test
    public void testEnumSetRejectsRawType() throws Exception {
        ObjectConstructor<EnumSet> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(TypeToken.get(EnumSet.class));
        try {
            constructor.construct();
            fail("expected JsonIOException");
        } catch (JsonIOException expected) {
            assertEquals(true, expected instanceof JsonIOException);
        }
    }

    @Test
    public void testMapWithNonStringKeyUsesLinkedHashMap() throws Exception {
        ObjectConstructor<Map<Integer, String>> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(new TypeToken<Map<Integer, String>>() {});
        Map<Integer, String> result = constructor.construct();
        result.put(2, "b");
        result.put(1, "a");
        assertEquals(new ArrayList<Integer>(java.util.Arrays.asList(2, 1)),
                new ArrayList<Integer>(result.keySet()));
    }

    @Test
    public void testMapWithStringKeyUsesLinkedTreeMapBehavior() throws Exception {
        ObjectConstructor<Map<String, Integer>> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(new TypeToken<Map<String, Integer>>() {});
        Map<String, Integer> result = constructor.construct();
        result.put("b", 2);
        result.put("a", 1);
        assertEquals(2, result.size());
        assertEquals(Integer.valueOf(1), result.get("a"));
    }

    @Test
    public void testRawMapUsesLinkedTreeMapBehavior() throws Exception {
        ObjectConstructor<Map> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(TypeToken.get(Map.class));
        Map result = constructor.construct();
        result.put("key", "value");
        assertEquals(1, result.size());
        assertEquals("value", result.get("key"));
    }

    @Test
    public void testSortedMapInterfaceOrdersKeys() throws Exception {
        ObjectConstructor<SortedMap<String, Integer>> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(new TypeToken<SortedMap<String, Integer>>() {});
        SortedMap<String, Integer> result = constructor.construct();
        result.put("b", 2);
        result.put("a", 1);
        assertEquals(new ArrayList<String>(java.util.Arrays.asList("a", "b")),
                new ArrayList<String>(result.keySet()));
    }

    @Test
    public void testConcurrentMapInterfaceStoresEntry() throws Exception {
        ObjectConstructor<ConcurrentMap<String, Integer>> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(new TypeToken<ConcurrentMap<String, Integer>>() {});
        ConcurrentMap<String, Integer> result = constructor.construct();
        result.put("k", 7);
        assertEquals(Integer.valueOf(7), result.get("k"));
    }

    @Test
    public void testConcurrentNavigableMapStoresEntry() throws Exception {
        ObjectConstructor<ConcurrentNavigableMap<String, Integer>> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(new TypeToken<ConcurrentNavigableMap<String, Integer>>() {});
        ConcurrentNavigableMap<String, Integer> result = constructor.construct();
        result.put("k", 7);
        assertEquals(Integer.valueOf(7), result.get("k"));
    }

    @Test
    public void testMapWithStringKeySubtypeUsesStringKeyBranch() throws Exception {
        ObjectConstructor<Map<String, Integer>> constructor =
                new ConstructorConstructor(new LinkedHashMap<Type, InstanceCreator<?>>())
                        .get(new TypeToken<Map<String, Integer>>() {});
        Map<String, Integer> result = constructor.construct();
        result.put("x", 3);
        assertEquals(Integer.valueOf(3), result.get("x"));
        assertEquals(1, result.size());
    }

    @Test
    public void testToStringReflectsInstanceCreators() throws Exception {
        Map<Type, InstanceCreator<?>> creators = new LinkedHashMap<Type, InstanceCreator<?>>();
        creators.put(String.class, new InstanceCreator<String>() {
            public String createInstance(Type type) { return "unused"; }
        });
        assertEquals(creators.toString(), new ConstructorConstructor(creators).toString());
    }
}
```