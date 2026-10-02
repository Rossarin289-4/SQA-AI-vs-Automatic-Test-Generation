package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;

public class ConstructorConstructorAI3Test {

  private enum SampleEnum {
    A, B, C
  }

  public static class SampleClassWithNoArgs {
    public boolean instantiated = true;
  }

  public static class SampleClassWithoutNoArgs {
    private final String value;
    public SampleClassWithoutNoArgs(String value) {
      this.value = value;
    }
  }

  @Test
  public void testInstanceCreatorByType() {
    Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
    creators.put(TypeToken.get(SampleClassWithoutNoArgs.class).getType(), new InstanceCreator<SampleClassWithoutNoArgs>() {
      @Override
      public SampleClassWithoutNoArgs createInstance(Type type) {
        return new SampleClassWithoutNoArgs("customByType");
      }
    });

    ConstructorConstructor cc = new ConstructorConstructor(creators);
    ObjectConstructor<SampleClassWithoutNoArgs> constructor = cc.get(TypeToken.get(SampleClassWithoutNoArgs.class));
    Assert.assertNotNull(constructor);
    SampleClassWithoutNoArgs instance = constructor.construct();
    Assert.assertNotNull(instance);
    Assert.assertEquals("customByType", instance.value);
  }

  @Test
  public void testInstanceCreatorByRawType() {
    Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
    creators.put(SampleClassWithoutNoArgs.class, new InstanceCreator<SampleClassWithoutNoArgs>() {
      @Override
      public SampleClassWithoutNoArgs createInstance(Type type) {
        return new InstanceCreatorForTest();
      }
    });

    ConstructorConstructor cc = new ConstructorConstructor(creators);
    ObjectConstructor<SampleClassWithoutNoArgs> constructor = cc.get(TypeToken.get(SampleClassWithoutNoArgs.class));
    Assert.assertNotNull(constructor);
    SampleClassWithoutNoArgs instance = constructor.construct();
    Assert.assertNotNull(instance);
    Assert.assertEquals("rawType", instance.value);
  }

  private static class InstanceCreatorForTest extends SampleClassWithoutNoArgs {
    public InstanceCreatorForTest() {
      super("rawType");
    }
  }

  @Test
  public void testDefaultConstructor() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    ObjectConstructor<SampleClassWithNoArgs> constructor = cc.get(TypeToken.get(SampleClassWithNoArgs.class));
    Assert.assertNotNull(constructor);
    SampleClassWithNoArgs instance = constructor.construct();
    Assert.assertNotNull(instance);
    Assert.assertTrue(instance.instantiated);
  }

  @Test
  public void testCollections_SortedSet() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    ObjectConstructor<SortedSet> constructor = cc.get(TypeToken.get(SortedSet.class));
    Assert.assertNotNull(constructor);
    SortedSet instance = constructor.construct();
    Assert.assertNotNull(instance);
    Assert.assertTrue(instance instanceof TreeSet);
  }

  @Test
  public void testCollections_EnumSet() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    TypeToken<EnumSet<SampleEnum>> typeToken = new TypeToken<EnumSet<SampleEnum>>() {};
    ObjectConstructor<EnumSet<SampleEnum>> constructor = cc.get(typeToken);
    Assert.assertNotNull(constructor);
    EnumSet<SampleEnum> instance = constructor.construct();
    Assert.assertNotNull(instance);
    Assert.assertTrue(instance.isEmpty());
  }

  @Test(expected = JsonIOException.class)
  public void testCollections_EnumSetInvalidType() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    ObjectConstructor<EnumSet> constructor = cc.get(TypeToken.get(EnumSet.class));
    constructor.construct();
  }

  @Test
  public void testCollections_Set() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    ObjectConstructor<Set> constructor = cc.get(TypeToken.get(Set.class));
    Assert.assertNotNull(constructor);
    Set instance = constructor.construct();
    Assert.assertNotNull(instance);
    Assert.assertTrue(instance instanceof LinkedHashSet);
  }

  @Test
  public void testCollections_Queue() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    ObjectConstructor<Queue> constructor = cc.get(TypeToken.get(Queue.class));
    Assert.assertNotNull(constructor);
    Queue instance = constructor.construct();
    Assert.assertNotNull(instance);
    Assert.assertTrue(instance instanceof LinkedList);
  }

  @Test
  public void testCollections_DefaultList() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    ObjectConstructor<Collection> constructor = cc.get(TypeToken.get(Collection.class));
    Assert.assertNotNull(constructor);
    Collection instance = constructor.construct();
    Assert.assertNotNull(instance);
    Assert.assertTrue(instance instanceof ArrayList);
  }

  @Test
  public void testMaps_ConcurrentNavigableMap() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    ObjectConstructor<ConcurrentNavigableMap> constructor = cc.get(TypeToken.get(ConcurrentNavigableMap.class));
    Assert.assertNotNull(constructor);
    ConcurrentNavigableMap instance = constructor.construct();
    Assert.assertNotNull(instance);
  }

  @Test
  public void testMaps_ConcurrentMap() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    ObjectConstructor<ConcurrentMap> constructor = cc.get(TypeToken.get(ConcurrentMap.class));
    Assert.assertNotNull(constructor);
    ConcurrentMap instance = constructor.construct();
    Assert.assertNotNull(instance);
  }

  @Test
  public void testMaps_SortedMap() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    ObjectConstructor<SortedMap> constructor = cc.get(TypeToken.get(SortedMap.class));
    Assert.assertNotNull(constructor);
    SortedMap instance = constructor.construct();
    Assert.assertNotNull(instance);
    Assert.assertTrue(instance instanceof TreeMap);
  }

  @Test
  public void testMaps_LinkedHashMapNonStringKey() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    TypeToken<Map<Integer, String>> typeToken = new TypeToken<Map<Integer, String>>() {};
    ObjectConstructor<Map<Integer, String>> constructor = cc.get(typeToken);
    Assert.assertNotNull(constructor);
    Map<Integer, String> instance = constructor.construct();
    Assert.assertNotNull(instance);
    Assert.assertTrue(instance instanceof LinkedHashMap);
  }

  @Test
  public void testMaps_LinkedTreeMapStringKey() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    TypeToken<Map<String, String>> typeToken = new TypeToken<Map<String, String>>() {};
    ObjectConstructor<Map<String, String>> constructor = cc.get(typeToken);
    Assert.assertNotNull(constructor);
    Map<String, String> instance = constructor.construct();
    Assert.assertNotNull(instance);
    Assert.assertTrue(instance instanceof LinkedTreeMap);
  }

  @Test
  public void testUnsafeAllocatorFallback() {
    ConstructorConstructor cc = new ConstructorConstructor(new HashMap<Type, InstanceCreator<?>>());
    ObjectConstructor<SampleClassWithoutNoArgs> constructor = cc.get(TypeToken.get(SampleClassWithoutNoArgs.class));
    Assert.assertNotNull(constructor);
    SampleClassWithoutNoArgs instance = constructor.construct();
    Assert.assertNotNull(instance);
  }

  @Test
  public void testToString() {
    Map<Type, InstanceCreator<?>> creators = new HashMap<Type, InstanceCreator<?>>();
    ConstructorConstructor cc = new ConstructorConstructor(creators);
    String str = cc.toString();
    Assert.assertNotNull(str);
  }
}
