package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Modifier;
import java.util.*;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;

public class StdSubtypeResolverTest {
    @Test
    public void testRegisterNamedSubtypeForClassResolution() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(String.class, "text"));
        assertEquals(1, resolver.collectAndResolveSubtypesByClass(null, (AnnotatedMember) null, null).size());
    }

    @Test
    public void testRegisterEmptyNamedTypeArray() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType[0]);
        assertTrue(resolver != null);
    }

    @Test
    public void testRegisterSeveralNamedTypes() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(Object.class, "root"), new NamedType(String.class, "text"));
        assertTrue(resolver != null);
    }

    @Test
    public void testRegisterSameTypeTwice() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType(String.class, "first"), new NamedType(String.class, "second"));
        assertTrue(resolver != null);
    }

    @Test
    public void testClassResolutionNeedsConfig() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        try {
            resolver.collectAndResolveSubtypesByClass(null, (AnnotatedMember) null, null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testTypeIdResolutionNeedsConfig() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        try {
            resolver.collectAndResolveSubtypesByTypeId(null, (AnnotatedMember) null, null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testRegisterClassesOverloadAcceptsEmptyArray() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new Class<?>[0]);
        assertTrue(resolver != null);
    }

    @Test
    public void testRegisterClassesOverloadAcceptsOneClass() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(String.class);
        assertTrue(resolver != null);
    }

    @Test
    public void testRegisterClassesOverloadAcceptsSeveralClasses() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(String.class, Integer.class);
        assertTrue(resolver != null);
    }

    @Test
    public void testNamedTypeConstructionAndName() throws Exception {
        NamedType type = new NamedType(String.class, "text");
        assertEquals(String.class, type.getType());
        assertEquals("text", type.getName());
        assertTrue(type.hasName());
    }

    @Test
    public void testUnnamedTypeConstruction() throws Exception {
        NamedType type = new NamedType(String.class);
        assertEquals(String.class, type.getType());
        assertNull(type.getName());
        assertFalse(type.hasName());
    }

    @Test
    public void testSetNamedTypeName() throws Exception {
        NamedType type = new NamedType(Integer.class);
        type.setName("number");
        assertEquals("number", type.getName());
        assertTrue(type.hasName());
    }
}
