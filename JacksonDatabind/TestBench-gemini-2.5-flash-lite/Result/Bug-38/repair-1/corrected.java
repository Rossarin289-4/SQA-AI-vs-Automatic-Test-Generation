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
    public void testConstruct_basic() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null; // Assuming no specific superclass for this test
        JavaType[] superInts = null; // Assuming no specific superinterfaces
        JavaType elemT = SimpleType.constructUnsafe(String.class);

        CollectionType ct = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        assertNotNull(ct);
        assertEquals(rawType, ct.getRawClass());
        assertEquals(elemT, ct.getContentType());
        assertNull(ct.getValueHandler()); // Use assertNull instead of checking with assertFalse
        assertNull(ct.getTypeHandler());  // Use assertNull instead of checking with assertFalse
        assertFalse(ct.isStatic());
    }

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
    public void testWithContentType_different() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        JavaType differentContentType = SimpleType.constructUnsafe(Integer.class);
        CollectionType newCT = (CollectionType) originalCT.withContentType(differentContentType);

        assertNotNull(newCT);
        assertNotSame(originalCT, newCT);
        assertEquals(rawType, newCT.getRawClass());
        assertEquals(differentContentType, newCT.getContentType());
        assertEquals(originalCT.getValueHandler(), newCT.getValueHandler());
        assertEquals(originalCT.getTypeHandler(), newCT.getTypeHandler());
        assertEquals(originalCT.isStatic(), newCT.isStatic());
    }

    @Test
    public void testWithTypeHandler() throws Exception {
        Object handler = "testHandler";
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        CollectionType newCT = originalCT.withTypeHandler(handler);

        assertNotNull(newCT);
        assertNotSame(originalCT, newCT);
        assertEquals(handler, newCT.getTypeHandler());
        assertEquals(originalCT.getValueHandler(), newCT.getValueHandler());
        assertEquals(originalCT.getContentType(), newCT.getContentType());
        assertEquals(originalCT.isStatic(), newCT.isStatic());
    }

    @Test
    public void testWithContentTypeHandler() throws Exception {
        Object handler = "testContentTypeHandler";
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        CollectionType newCT = originalCT.withContentTypeHandler(handler);

        assertNotNull(newCT);
        assertNotSame(originalCT, newCT);
        assertEquals(handler, newCT.getContentTypeHandler());
        assertEquals(originalCT.getValueHandler(), newCT.getValueHandler());
        assertEquals(originalCT.getTypeHandler(), newCT.getTypeHandler());
        assertEquals(originalCT.isStatic(), newCT.isStatic());
    }

    @Test
    public void testWithValueHandler() throws Exception {
        Object handler = "testValueHandler";
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        CollectionType newCT = originalCT.withValueHandler(handler);

        assertNotNull(newCT);
        assertNotSame(originalCT, newCT);
        assertEquals(handler, newCT.getValueHandler());
        assertEquals(originalCT.getTypeHandler(), newCT.getTypeHandler());
        assertEquals(originalCT.getContentType(), newCT.getContentType());
        assertEquals(originalCT.isStatic(), newCT.isStatic());
    }

    @Test
    public void testWithContentValueHandler() throws Exception {
        Object handler = "testContentValueHandler";
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        CollectionType newCT = originalCT.withContentValueHandler(handler);

        assertNotNull(newCT);
        assertNotSame(originalCT, newCT);
        assertEquals(handler, newCT.getContentValueHandler());
        assertEquals(originalCT.getValueHandler(), newCT.getValueHandler());
        assertEquals(originalCT.getTypeHandler(), newCT.getTypeHandler());
        assertEquals(originalCT.isStatic(), newCT.isStatic());
    }

    @Test
    public void testWithStaticTyping_false_to_true() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        assertFalse(originalCT.isStatic());
        CollectionType newCT = originalCT.withStaticTyping();

        assertNotNull(newCT);
        assertNotSame(originalCT, newCT);
        assertTrue(newCT.isStatic());
        assertEquals(originalCT.getRawClass(), newCT.getRawClass());
        assertEquals(originalCT.getContentType(), newCT.getContentType());
        assertEquals(originalCT.getValueHandler(), newCT.getValueHandler());
        assertEquals(originalCT.getTypeHandler(), newCT.getTypeHandler());
    }

    @Test
    public void testWithStaticTyping_true_to_true() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT).withStaticTyping();

        assertTrue(originalCT.isStatic());
        CollectionType newCT = originalCT.withStaticTyping();

        // Should return the same instance if already static
        assertSame(originalCT, newCT);
    }

    @Test
    public void testRefine_differentRawType() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        Class<?> newRawType = LinkedList.class;
        TypeBindings newBindings = TypeBindings.create(newRawType, SimpleType.constructUnsafe(Integer.class));
        JavaType newSuperClass = SimpleType.constructUnsafe(AbstractList.class);
        JavaType[] newSuperInts = new JavaType[] { SimpleType.constructUnsafe(List.class) };

        JavaType refinedType = originalCT.refine(newRawType, newBindings, newSuperClass, newSuperInts);

        assertNotNull(refinedType);
        assertTrue(refinedType instanceof CollectionType); // Should remain a CollectionType
        CollectionType newCT = (CollectionType) refinedType;
        assertEquals(newRawType, newCT.getRawClass());
        assertEquals(newBindings, newCT.getBindings());
        assertEquals(newSuperClass, newCT.getSuperClass());
        assertArrayEquals(newSuperInts, newCT.getSuperInterfaces());
        assertEquals(originalCT.getContentType(), newCT.getContentType()); // Content type should be preserved
        assertEquals(originalCT.getValueHandler(), newCT.getValueHandler());
        assertEquals(originalCT.getTypeHandler(), newCT.getTypeHandler());
        assertEquals(originalCT.isStatic(), newCT.isStatic());
    }

    @Test
    public void testRefine_nullSuperTypes() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        JavaType refinedType = originalCT.refine(rawType, bindings, null, null);

        assertNotNull(refinedType);
        assertTrue(refinedType instanceof CollectionType);
        CollectionType newCT = (CollectionType) refinedType;
        assertNull(newCT.getSuperClass());
        assertNull(newCT.getSuperInterfaces());
        // Check that other properties are preserved
        assertEquals(originalCT.getContentType(), newCT.getContentType());
        assertEquals(originalCT.getValueHandler(), newCT.getValueHandler());
        assertEquals(originalCT.getTypeHandler(), newCT.getTypeHandler());
        assertEquals(originalCT.isStatic(), newCT.isStatic());
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

        // The expected erased signature depends on how _classSignature is implemented for ArrayList
        // The method `_classSignature` is protected in TypeBase and not directly accessible.
        // However, the structure `L<rawClassName>;` is standard.
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

        // The expected generic signature for ArrayList<String>
        // _classSignature would be "Ljava.util.ArrayList;"
        // and containedType(0).getGenericSignature() for String would be "Ljava.lang.String;"
        // So, the final result should be "Ljava.util.ArrayList<Ljava.lang.String;>;"
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
    public void testWithContentType_null() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        JavaType nullContentType = null;
        CollectionType newCT = (CollectionType) originalCT.withContentType(nullContentType);

        assertNotNull(newCT);
        assertNotSame(originalCT, newCT);
        assertNull(newCT.getContentType());
        assertEquals(originalCT.getRawClass(), newCT.getRawClass());
        assertEquals(originalCT.getValueHandler(), newCT.getValueHandler());
        assertEquals(originalCT.getTypeHandler(), newCT.getTypeHandler());
        assertEquals(originalCT.isStatic(), newCT.isStatic());
    }

    @Test
    public void testRefine_nullBindings() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        JavaType refinedType = originalCT.refine(rawType, null, superClass, superInts);

        assertNotNull(refinedType);
        assertTrue(refinedType instanceof CollectionType);
        CollectionType newCT = (CollectionType) refinedType;
        assertNull(newCT.getBindings()); // Should reflect the null passed in
        // Check that other properties are preserved
        assertEquals(originalCT.getContentType(), newCT.getContentType());
        assertEquals(originalCT.getValueHandler(), newCT.getValueHandler());
        assertEquals(originalCT.getTypeHandler(), newCT.getTypeHandler());
        assertEquals(originalCT.isStatic(), newCT.isStatic());
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
    
    @Test
    public void testWithContentTypeHandler_null() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        CollectionType newCT = originalCT.withContentTypeHandler(null);

        assertNotNull(newCT);
        assertNotSame(originalCT, newCT);
        assertNull(newCT.getContentTypeHandler());
        assertEquals(originalCT.getValueHandler(), newCT.getValueHandler());
        assertEquals(originalCT.getTypeHandler(), newCT.getTypeHandler());
        assertEquals(originalCT.getContentType(), newCT.getContentType());
        assertEquals(originalCT.isStatic(), newCT.isStatic());
    }

    @Test
    public void testWithContentValueHandler_null() throws Exception {
        Class<?> rawType = ArrayList.class;
        TypeBindings bindings = TypeBindings.emptyBindings();
        JavaType superClass = null;
        JavaType[] superInts = null;
        JavaType elemT = SimpleType.constructUnsafe(String.class);
        CollectionType originalCT = CollectionType.construct(rawType, bindings, superClass, superInts, elemT);

        CollectionType newCT = originalCT.withContentValueHandler(null);

        assertNotNull(newCT);
        assertNotSame(originalCT, newCT);
        assertNull(newCT.getContentValueHandler());
        assertEquals(originalCT.getValueHandler(), newCT.getValueHandler());
        assertEquals(originalCT.getTypeHandler(), newCT.getTypeHandler());
        assertEquals(originalCT.getContentType(), newCT.getContentType());
        assertEquals(originalCT.isStatic(), newCT.isStatic());
    }
}
