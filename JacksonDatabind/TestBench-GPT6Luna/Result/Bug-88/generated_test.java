package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;

public class ClassNameIdResolverTest {
    @Test
    public void testMechanism() throws Exception {
        ClassNameIdResolver resolver = new ClassNameIdResolver(
                TypeFactory.defaultInstance().constructType(Object.class),
                TypeFactory.defaultInstance());
        assertEquals(JsonTypeInfo.Id.CLASS, resolver.getMechanism());
    }

    @Test
    public void testRegisterSubtypeDoesNotAlterClassId() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        resolver.registerSubtype(String.class, "text");
        assertEquals(String.class.getName(), resolver.idFromValue("x"));
    }

    @Test
    public void testIdFromValueForOrdinaryClass() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        assertEquals(String.class.getName(), resolver.idFromValue("x"));
    }

    @Test
    public void testIdFromValueAndTypeUsesProvidedType() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        assertEquals(Object.class.getName(), resolver.idFromValueAndType("x", Object.class));
    }

    @Test
    public void testEnumSetIdIncludesEnumType() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        EnumSet<Thread.State> value = EnumSet.noneOf(Thread.State.class);
        assertEquals(tf.constructCollectionType(EnumSet.class, Thread.State.class).toCanonical(),
                resolver.idFromValue(value));
    }

    @Test
    public void testEnumMapIdIncludesEnumKeyAndObjectValueTypes() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        EnumMap<Thread.State, Object> value = new EnumMap<>(Thread.State.class);
        assertEquals(tf.constructMapType(EnumMap.class, Thread.State.class, Object.class).toCanonical(),
                resolver.idFromValue(value));
    }

    @Test
    public void testArraysAsListUsesArrayListId() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        assertEquals(ArrayList.class.getName(), resolver.idFromValue(Arrays.asList("a", "b")));
    }

    @Test
    public void testCollectionsSingletonListUsesArrayListId() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        assertEquals(ArrayList.class.getName(), resolver.idFromValue(Collections.singletonList("a")));
    }

    @Test
    public void testOtherJavaUtilClassKeepsItsName() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        assertEquals(HashMap.class.getName(), resolver.idFromValue(new HashMap<Object, Object>()));
    }

    @Test
    public void testIdFromValueAndTypeForJavaUtilListUsesProvidedClassName() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        assertEquals(List.class.getName(), resolver.idFromValueAndType(new ArrayList<Object>(), List.class));
    }

    @Test
    public void testTypeFromIdForClassName() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        assertEquals(tf.constructType(String.class),
                resolver.typeFromId(new ObjectMapper().getDeserializationContext(), String.class.getName()));
    }

    @Test
    public void testTypeFromIdForCanonicalGenericSubtype() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        JavaType expected = tf.constructCollectionType(ArrayList.class, String.class);
        assertEquals(expected, resolver.typeFromId(new ObjectMapper().getDeserializationContext(), expected.toCanonical()));
    }

    @Test
    public void testGenericTypeNotAssignableToBaseThrows() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Number.class), tf);
        String id = tf.constructCollectionType(ArrayList.class, String.class).toCanonical();
        try {
            resolver.typeFromId(new ObjectMapper().getDeserializationContext(), id);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testUnknownClassIdWithNullContextReturnsNull() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        assertNull(resolver.typeFromId(null, "no.such.Class"));
    }

    @Test
    public void testDescForKnownTypeIds() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        assertEquals("class name used as type id", resolver.getDescForKnownTypeIds());
    }

    @Test
    public void testInnerClassIdFallsBackToBaseWhenBaseIsTopLevel() throws Exception {
        TypeFactory tf = TypeFactory.defaultInstance();
        ClassNameIdResolver resolver = new ClassNameIdResolver(tf.constructType(Object.class), tf);
        assertEquals(HashMap.SimpleEntry.class.getName(),
                resolver.idFromValue(new HashMap.SimpleEntry<String, String>("a", "b")));
    }
}
