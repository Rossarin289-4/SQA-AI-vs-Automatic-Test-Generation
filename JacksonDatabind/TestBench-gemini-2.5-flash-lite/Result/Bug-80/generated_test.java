package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.Modifier;
import java.util.*;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class StdSubtypeResolverTest {

    // Helper method to create a mock MapperConfig

    // Minimal concrete implementation of MapperConfig for testing purposes

    // Minimal concrete implementation of AnnotatedMember for testing purposes

    // Helper to create a dummy JavaType

    @Test
    public void testRegisterSubtypesWithNullArray() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes((NamedType[]) null);
        assertNull(resolver._registeredSubtypes);
    }

    @Test
    public void testRegisterSubtypesWithEmptyArray() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(new NamedType[0]);
        assertNull(resolver._registeredSubtypes);
    }

    @Test
    public void testRegisterSubtypesWithNamedTypes() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        NamedType nt1 = new NamedType(String.class, "myString");
        NamedType nt2 = new NamedType(Integer.class);
        resolver.registerSubtypes(nt1, nt2);

        assertNotNull(resolver._registeredSubtypes);
        assertEquals(2, resolver._registeredSubtypes.size());
        assertTrue(resolver._registeredSubtypes.contains(nt1));
        assertTrue(resolver._registeredSubtypes.contains(nt2));
    }

    @Test
    public void testRegisterSubtypesWithClasses() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(String.class, Integer.class);

        assertNotNull(resolver._registeredSubtypes);
        assertEquals(2, resolver._registeredSubtypes.size());
        NamedType nt1 = new NamedType(String.class, null);
        NamedType nt2 = new NamedType(Integer.class, null);
        assertTrue(resolver._registeredSubtypes.contains(nt1));
        assertTrue(resolver._registeredSubtypes.contains(nt2));
    }
    
    @Test
    public void testRegisterSubtypesDuplicateClasses() throws Exception {
        StdSubtypeResolver resolver = new StdSubtypeResolver();
        resolver.registerSubtypes(String.class, String.class);

        assertNotNull(resolver._registeredSubtypes);
        assertEquals(1, resolver._registeredSubtypes.size());
        NamedType nt = new NamedType(String.class, null);
        assertTrue(resolver._registeredSubtypes.contains(nt));
    }






    
    

    static class Animal {}
    static class Mammal extends Animal {}
    static class Dog extends Mammal {}
    static class Cat extends Mammal {}
    static class Vehicle {}
    static class Car extends Vehicle {}
    static class ElectricCar extends Car {}

    


    
    

    

    
    

    
    static class BaseTypeForAnnotationTest {}

    
    


    

}



