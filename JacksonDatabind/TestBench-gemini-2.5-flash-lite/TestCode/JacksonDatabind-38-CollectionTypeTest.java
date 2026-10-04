package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.TypeVariable;
import com.fasterxml.jackson.databind.JavaType;
import java.util.*;

public class CollectionTypeTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }


    @Test
    public void testConstruct_withBindings() throws Exception {
        Class<?> rawType = List.class;
        TypeBindings bindings = TypeBindings.create(List.class, SimpleType.constructUnsafe(Integer.class));
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(Integer.class);

        CollectionType ct = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        assertNotNull(ct);
        assertEquals(rawType, ct.getRawClass());
        assertEquals(elemT, ct.getContentType());
        assertEquals(bindings, ct.getBindings());
    }

    @Test
    public void testWithContentType_same() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        JavaType sameContentType = SimpleType.constructUnsafe(String.class);
        CollectionType newCT = (CollectionType) originalCT.withContentType(sameContentType);

        // Should return the same instance if content type is the same
        assertSame(originalCT, newCT);
    }










    @Test
    public void testToString_basic() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType ct = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        String expected = "[collection type; class " + rawType.getName() + ", contains " + elemT.toString() + "]";
        assertEquals(expected, ct.toString());
    }

    @Test
    public void testToString_withContentTypeName() throws Exception {
        Class<?> rawType = LinkedList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(Integer.class);
        CollectionType ct = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        String expected = "[collection type; class " + rawType.getName() + ", contains " + elemT.toString() + "]";
        assertEquals(expected, ct.toString());
    }
    
    @Test
    public void testIsContainerType_CollectionType() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType ct = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);
        assertTrue(ct.isContainerType());
    }

    @Test
    public void testIsCollectionLikeType_CollectionType() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType ct = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);
        assertTrue(ct.isCollectionLikeType());
    }

    @Test
    public void testIsMapLikeType_CollectionType() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType ct = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);
        assertFalse(ct.isMapLikeType());
    }

    @Test
    public void testGetErasedSignature_basic() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType ct = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        StringBuilder sb = new StringBuilder();
        ct.getErasedSignature(sb);

        assertTrue(sb.toString().startsWith("Ljava.util.ArrayList;"));
        assertEquals(sb.toString().length(), "Ljava.util.ArrayList;".length());
    }

    @Test
    public void testGetGenericSignature_basic() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType ct = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        StringBuilder sb = new StringBuilder();
        ct.getGenericSignature(sb);

        assertTrue(sb.toString().startsWith("Ljava.util.ArrayList"));
        assertTrue(sb.toString().endsWith("<Ljava.lang.String;>;"));
    }
    
    @Test
    public void testEquals_sameInstance() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType ct = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        assertTrue(ct.equals(ct));
    }

    @Test
    public void testEquals_differentInstance_sameContent() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        
        CollectionType ct1 = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);
        CollectionType ct2 = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        assertTrue(ct1.equals(ct2));
        assertTrue(ct2.equals(ct1));
    }

    @Test
    public void testEquals_differentContentType() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        
        JavaType elemT1 = SimpleType.constructUnsafe(String.class);
        CollectionType ct1 = CollectionType.construct(rawType, bindings, superClass, superInts, elemT1);
        
        JavaType elemT2 = SimpleType.constructUnsafe(Integer.class);
        CollectionType ct2 = CollectionType.construct(rawType, bindings, superClass, superInts, elemT2);

        assertFalse(ct1.equals(ct2));
    }

    @Test
    public void testEquals_differentRawType() throws Exception {
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        
        CollectionType ct1 = CollectionType.construct(ArrayList.class, bindings, superClass, superInts, elemT);
        CollectionType ct2 = CollectionType.construct(LinkedList.class, bindings, superClass, superInts, elemT);

        assertFalse(ct1.equals(ct2));
    }

    @Test
    public void testEquals_differentValueHandler() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        
        CollectionType ct1 = CollectionType.construct(rawType, bindings, superClass, superInts, elemT).withValueHandler("handler1");
        CollectionType ct2 = CollectionType.construct(rawType, bindings, superClass, superInts, elemT).withValueHandler("handler2");

        assertFalse(ct1.equals(ct2));
    }
    
    @Test
    public void testEquals_differentTypeHandler() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        
        CollectionType ct1 = CollectionType.construct(rawType, bindings, superClass, superInts, elemT).withTypeHandler("handler1");
        CollectionType ct2 = CollectionType.construct(rawType, bindings, superClass, superInts, elemT).withTypeHandler("handler2");

        assertFalse(ct1.equals(ct2));
    }
    
    @Test
    public void testEquals_differentStaticTyping() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        
        CollectionType ct1 = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);
        CollectionType ct2 = CollectionType.construct(rawType, bindings, superClass, superInts, elemT).withStaticTyping();

        assertFalse(ct1.equals(ct2));
    }
    


    @Test
    public void testRefine_returnsNonNullForCollectionType() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        JavaType refined = originalCT.refine(rawType, bindings, superClass, superInts);
        assertNotNull(refined);
        assertTrue(refined instanceof CollectionType);
    }
    

}


