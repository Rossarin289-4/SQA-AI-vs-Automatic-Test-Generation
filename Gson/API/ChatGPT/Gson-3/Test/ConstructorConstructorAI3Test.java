package com.google.gson.internal;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

import org.junit.Test;

import com.google.gson.InstanceCreator;
import com.google.gson.reflect.TypeToken;

public class ConstructorConstructorAI3Test {

  @Test
  public void testDefaultConstructor() {
    ConstructorConstructor constructorConstructor = new ConstructorConstructor(
        Collections.<Type, InstanceCreator<?>>emptyMap());
    ObjectConstructor<ArrayList> objectConstructor = constructorConstructor.get(
        TypeToken.get(ArrayList.class));
    assertNotNull(objectConstructor);
    assertTrue(objectConstructor.construct() instanceof ArrayList);
  }

  @Test
  public void testCollectionImplementation() {
    ConstructorConstructor constructorConstructor = new ConstructorConstructor(
        Collections.<Type, InstanceCreator<?>>emptyMap());
    ObjectConstructor<Collection> objectConstructor = constructorConstructor.get(
        TypeToken.get(Collection.class));
    assertNotNull(objectConstructor);
    assertTrue(objectConstructor.construct() instanceof Collection);
  }

  @Test
  public void testInstanceCreator() {
    Map<java.lang.reflect.Type, InstanceCreator<?>> creators = 
        new java.util.HashMap<java.lang.reflect.Type, InstanceCreator<?>>();
    creators.put(ArrayList.class, new InstanceCreator<ArrayList>() {
      @Override public ArrayList createInstance(java.lang.reflect.Type type) {
        return new ArrayList();
      }
    });

    ConstructorConstructor constructorConstructor = new ConstructorConstructor(creators);
    ObjectConstructor<ArrayList> objectConstructor = constructorConstructor.get(
        TypeToken.get(ArrayList.class));
    assertNotNull(objectConstructor);
    assertNotNull(objectConstructor.construct());
  }
}
