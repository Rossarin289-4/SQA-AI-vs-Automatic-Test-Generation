package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.reflect.*;
import java.util.*;
import com.fasterxml.jackson.databind.JavaType;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;

public class TypeBindingsTest {
    @Test
    public void testEmptyBindings() throws Exception {
        TypeBindings bindings = TypeBindings.emptyBindings();
        assertTrue(bindings.isEmpty());
        assertEquals(0, bindings.size());
        assertNull(bindings.findBoundType("any"));
        assertEquals(0, bindings.getTypeParameters().size());
        assertNull(bindings.getBoundName(0));
        assertNull(bindings.getBoundType(0));
        assertFalse(bindings.hasUnbound("any"));
        assertEquals("<>", bindings.toString());
        assertEquals(1, bindings.hashCode()); // Static hash code for empty
    }

    @Test
    public void testCreateWithEmptyList() throws Exception {
        // List<JavaType> can be null or empty. For List, it expects 1 type parameter.
        TypeBindings bindings = TypeBindings.create(List.class, (List<JavaType>) null);
        assertTrue(bindings.isEmpty());
        assertEquals(0, bindings.size());
    }

    @Test
    public void testCreateWithEmptyArray() throws Exception {
        // For Map, it expects 2 type parameters. An empty array means 0.
        // This should throw IllegalArgumentException.
        try {
            TypeBindings.create(Map.class, new JavaType[0]);
            fail("Expected IllegalArgumentException for incorrect number of type parameters");
        } catch (IllegalArgumentException e) {
            // Expected
            assertTrue(e.getMessage().contains("class expects 2"));
        }
    }

    @Test
    public void testCreateWithOneType() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        // For List, it expects 1 type parameter. The name should be 'E'.
        TypeBindings bindings = TypeBindings.create(List.class, stringType);
        assertFalse(bindings.isEmpty());
        assertEquals(1, bindings.size());
        assertEquals("E", bindings.getBoundName(0)); // Parameter name for List is 'E'
        assertEquals(stringType, bindings.getBoundType(0));
        assertEquals(stringType, bindings.findBoundType("E"));
        assertNull(bindings.findBoundType("String")); // Name is 'E', not 'String'
        assertEquals(1, bindings.getTypeParameters().size());
        assertEquals(stringType, bindings.getTypeParameters().get(0));
        assertEquals("<String>", bindings.toString());
    }

    @Test
    public void testCreateWithTwoTypes() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        // For Map, it expects 2 type parameters. Names should be 'K' and 'V'.
        TypeBindings bindings = TypeBindings.create(Map.class, new JavaType[]{stringType, intType});
        assertFalse(bindings.isEmpty());
        assertEquals(2, bindings.size());
        assertEquals("K", bindings.getBoundName(0));
        assertEquals(stringType, bindings.getBoundType(0));
        assertEquals(stringType, bindings.findBoundType("K"));
        assertEquals("V", bindings.getBoundName(1));
        assertEquals(intType, bindings.getBoundType(1));
        assertEquals(intType, bindings.findBoundType("V"));
        assertNull(bindings.findBoundType("String")); // Names are 'K', 'V'
        assertEquals(2, bindings.getTypeParameters().size());
        assertEquals(stringType, bindings.getTypeParameters().get(0));
        assertEquals(intType, bindings.getTypeParameters().get(1));
        assertEquals("<String,Integer>", bindings.toString());
    }

    @Test
    public void testCreateIfNeededWhenNeedsParams() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        // List expects 1 type parameter, name 'E'.
        TypeBindings bindings = TypeBindings.createIfNeeded(List.class, stringType);
        assertFalse(bindings.isEmpty());
        assertEquals(1, bindings.size());
        assertEquals("E", bindings.getBoundName(0)); // Default type parameter name for List
        assertEquals(stringType, bindings.getBoundType(0));
        assertEquals(stringType, bindings.findBoundType("E"));
    }

    @Test
    public void testCreateIfNeededWhenNotNeedsParams() throws Exception {
        // String class has no type parameters.
        TypeBindings bindings = TypeBindings.createIfNeeded(String.class, TypeFactory.defaultInstance().constructType(Object.class));
        assertTrue(bindings.isEmpty());
        assertEquals(0, bindings.size());
    }

    @Test
    public void testCreateIfNeededWithMultipleTypes() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        JavaType[] types = new JavaType[]{stringType, intType};
        // Map expects 2 type parameters, names 'K' and 'V'.
        TypeBindings bindings = TypeBindings.createIfNeeded(Map.class, types);
        assertFalse(bindings.isEmpty());
        assertEquals(2, bindings.size());
        assertEquals("K", bindings.getBoundName(0)); // Default type parameter name for Map
        assertEquals(stringType, bindings.getBoundType(0));
        assertEquals("V", bindings.getBoundName(1));
        assertEquals(intType, bindings.getBoundType(1));
        assertEquals(stringType, bindings.findBoundType("K"));
        assertEquals(intType, bindings.findBoundType("V"));
    }

    @Test
    public void testWithUnboundVariable() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType); // bindings for 'E' -> String
        TypeBindings withUnbound = bindings.withUnboundVariable("T");
        assertFalse(withUnbound.isEmpty());
        assertEquals(1, withUnbound.size()); // size is based on _types, not _unboundVariables
        assertEquals(stringType, withUnbound.findBoundType("E")); // Original binding should remain
        assertTrue(withUnbound.hasUnbound("T"));
        assertFalse(withUnbound.hasUnbound("E"));
        assertEquals("<String>", withUnbound.toString()); // toString does not reflect unbound variables
        assertEquals(stringType, withUnbound.getBoundType(0)); // Should still return the bound type
    }

    @Test
    public void testFindBoundTypeWhenBound() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType); // bindings for 'E' -> String
        assertEquals(stringType, bindings.findBoundType("E"));
    }

    @Test
    public void testFindBoundTypeWhenUnbound() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType);
        assertNull(bindings.findBoundType("Object"));
    }

    @Test
    public void testFindBoundTypeWhenVariableIsRecursive() throws Exception {
        // To test this correctly, we would need to construct a ResolvedRecursiveType,
        // which is an internal class not directly exposed. However, the `findBoundType`
        // method's logic for `ResolvedRecursiveType` is to try and get the `selfReferencedType`.
        // If that's null, it comments out throwing an exception. We can test the "normal" path.
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType);
        // If stringType were a ResolvedRecursiveType that resolved to something else,
        // findBoundType would attempt to resolve it. Here, it's a SimpleType.
        assertEquals(stringType, bindings.findBoundType("E"));
    }


    @Test
    public void testGetBoundName() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        TypeBindings bindings = TypeBindings.create(Map.class, new JavaType[]{stringType, intType});
        assertEquals("K", bindings.getBoundName(0));
        assertEquals("V", bindings.getBoundName(1));
        assertNull(bindings.getBoundName(2));
        assertNull(bindings.getBoundName(-1));
    }

    @Test
    public void testGetBoundType() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        TypeBindings bindings = TypeBindings.create(Map.class, new JavaType[]{stringType, intType});
        assertEquals(stringType, bindings.getBoundType(0));
        assertEquals(intType, bindings.getBoundType(1));
        assertNull(bindings.getBoundType(2));
        assertNull(bindings.getBoundType(-1));
    }

    @Test
    public void testGetTypeParameters() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        TypeBindings bindings = TypeBindings.create(Map.class, new JavaType[]{stringType, intType});
        List<JavaType> params = bindings.getTypeParameters();
        assertEquals(2, params.size());
        assertEquals(stringType, params.get(0));
        assertEquals(intType, params.get(1));
    }

    @Test
    public void testHasUnboundWhenBound() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType); // bindings for 'E' -> String
        assertFalse(bindings.hasUnbound("E"));
    }

    @Test
    public void testHasUnboundWhenUnbound() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType).withUnboundVariable("T");
        assertTrue(bindings.hasUnbound("T"));
        assertFalse(bindings.hasUnbound("E")); // E is bound, T is unbound
    }

    @Test
    public void testAsKey() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        TypeBindings bindings = TypeBindings.create(Map.class, new JavaType[]{stringType, intType});
        Object key = bindings.asKey(Map.class);
        assertNotNull(key);
        assertTrue(key instanceof TypeBindings.AsKey);
        TypeBindings.AsKey asKey = (TypeBindings.AsKey) key;
        // The toString() of AsKey is just the raw type name, not the parameters.
        assertEquals(Map.class.getName(), asKey.toString());
        assertEquals(bindings.hashCode(), asKey.hashCode());
    }

    @Test
    public void testEqualsSameInstance() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType);
        assertTrue(bindings.equals(bindings));
    }

    @Test
    public void testEqualsDifferentInstanceSameContent() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        TypeBindings bindings1 = TypeBindings.create(Map.class, new JavaType[]{stringType, intType});
        TypeBindings bindings2 = TypeBindings.create(Map.class, new JavaType[]{stringType, intType});
        assertTrue(bindings1.equals(bindings2));
        assertTrue(bindings2.equals(bindings1));
    }

    @Test
    public void testEqualsDifferentSize() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        // The create method for Map expects 2 parameters.
        try {
            TypeBindings.create(Map.class, new JavaType[]{stringType});
            fail("Expected IllegalArgumentException");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("class expects 2"));
        }
    }

    @Test
    public void testEqualsDifferentTypeContent() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        JavaType longType = TypeFactory.defaultInstance().constructType(Long.class);
        TypeBindings bindings1 = TypeBindings.create(Map.class, new JavaType[]{stringType, intType});
        TypeBindings bindings2 = TypeBindings.create(Map.class, new JavaType[]{stringType, longType});
        assertFalse(bindings1.equals(bindings2));
        assertFalse(bindings2.equals(bindings1));
    }

    @Test
    public void testEqualsNull() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType);
        assertFalse(bindings.equals(null));
    }

    @Test
    public void testEqualsDifferentClass() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        TypeBindings bindings = TypeBindings.create(List.class, stringType);
        assertFalse(bindings.equals("some string"));
    }

    @Test
    public void testToStringEmpty() throws Exception {
        assertEquals("<>", TypeBindings.emptyBindings().toString());
    }

    @Test
    public void testToStringWithTypes() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        TypeBindings bindings = TypeBindings.create(Map.class, new JavaType[]{stringType, intType});
        assertEquals("<String,Integer>", bindings.toString());
    }

    @Test
    public void testHashCodeEmpty() throws Exception {
        assertEquals(1, TypeBindings.emptyBindings().hashCode());
    }

    @Test
    public void testHashCodeWithTypes() throws Exception {
        JavaType stringType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType intType = TypeFactory.defaultInstance().constructType(Integer.class);
        TypeBindings bindings1 = TypeBindings.create(Map.class, new JavaType[]{stringType, intType});
        TypeBindings bindings2 = TypeBindings.create(Map.class, new JavaType[]{stringType, intType});
        assertEquals(bindings1.hashCode(), bindings2.hashCode());

        // Test that a different type makes a different hash
        JavaType longType = TypeFactory.defaultInstance().constructType(Long.class);
        TypeBindings bindings3 = TypeBindings.create(Map.class, new JavaType[]{stringType, longType});
        assertNotEquals(bindings1.hashCode(), bindings3.hashCode());
    }
    
    // New tests for unexercised methods

    @Test
    public void testConstructSpecializedTypeSimple() throws Exception {
        JavaType listStringType = TypeFactory.defaultInstance().constructType(new TypeReference<List<String>>(){});
        JavaType arrayListStringType = TypeFactory.defaultInstance().constructSpecializedType(listStringType, ArrayList.class);
        
        assertNotNull(arrayListStringType);
        // constructSpecializedType should return a type compatible with ArrayList, with the same content type.
        assertEquals(ArrayList.class, arrayListStringType.getRawClass());
        assertEquals(String.class, arrayListStringType.getContentType().getRawClass());
        assertEquals("<String>", arrayListStringType.toString());
    }

    @Test
    public void testConstructGeneralizedTypeSimple() throws Exception {
        JavaType arrayListStringType = TypeFactory.defaultInstance().constructType(new TypeReference<ArrayList<String>>(){});
        JavaType listStringType = TypeFactory.defaultInstance().constructGeneralizedType(arrayListStringType, List.class);
        
        assertNotNull(listStringType);
        // constructGeneralizedType should return a type compatible with List, with the same content type.
        assertEquals(List.class, listStringType.getRawClass());
        assertEquals(String.class, listStringType.getContentType().getRawClass());
        assertEquals("<String>", listStringType.toString());
    }

    @Test
    public void testConstructFromCanonicalString() throws Exception {
        String canonical = "java.util.Map<java.lang.String, java.lang.Integer>";
        JavaType mapType = TypeFactory.defaultInstance().constructFromCanonical(canonical);
        
        assertNotNull(mapType);
        assertTrue(mapType.isMapLikeType());
        assertEquals(String.class, mapType.getKeyType().getRawClass());
        assertEquals(Integer.class, mapType.getContentType().getRawClass());
        assertEquals(Map.class, mapType.getRawClass());
    }
    
    @Test
    public void testFindTypeParametersForMap() throws Exception {
        JavaType mapType = TypeFactory.defaultInstance().constructType(new TypeReference<Map<String, Integer>>(){});
        JavaType[] params = TypeFactory.defaultInstance().findTypeParameters(mapType, Map.class);
        
        assertNotNull(params);
        assertEquals(2, params.length);
        assertEquals(String.class, params[0].getRawClass());
        assertEquals(Integer.class, params[1].getRawClass());
    }

    @Test
    public void testMoreSpecificTypeWhenFirstIsMoreSpecific() throws Exception {
        JavaType arrayListStringType = TypeFactory.defaultInstance().constructType(new TypeReference<ArrayList<String>>(){});
        JavaType listStringType = TypeFactory.defaultInstance().constructType(new TypeReference<List<String>>(){});
        JavaType result = TypeFactory.defaultInstance().moreSpecificType(arrayListStringType, listStringType);
        
        assertSame(arrayListStringType, result);
    }

    @Test
    public void testMoreSpecificTypeWhenSecondIsMoreSpecific() throws Exception {
        JavaType listStringType = TypeFactory.defaultInstance().constructType(new TypeReference<List<String>>(){});
        JavaType arrayListStringType = TypeFactory.defaultInstance().constructType(new TypeReference<ArrayList<String>>(){});
        JavaType result = TypeFactory.defaultInstance().moreSpecificType(listStringType, arrayListStringType);
        
        assertSame(arrayListStringType, result);
    }
    
    @Test
    public void testConstructTypeWithParameterizedType() throws Exception {
        JavaType listStringType = TypeFactory.defaultInstance().constructType(new TypeReference<List<String>>(){});
        assertEquals(String.class, listStringType.getContentType().getRawClass());
        assertEquals(List.class, listStringType.getRawClass());
    }

    @Test
    public void testConstructArrayType() throws Exception {
        JavaType stringArrayType = TypeFactory.defaultInstance().constructArrayType(String.class);
        assertTrue(stringArrayType.isArrayType());
        assertEquals(String.class, stringArrayType.getContentType().getRawClass());
    }


    @Test
    public void testConstructCollectionLikeType() throws Exception {
        CollectionLikeType setStringType = TypeFactory.defaultInstance().constructCollectionLikeType(HashSet.class, String.class);
        assertTrue(setStringType.isCollectionLikeType());
        assertEquals(String.class, setStringType.getContentType().getRawClass());
        assertEquals(HashSet.class, setStringType.getRawClass());
    }

    @Test
    public void testConstructMapType() throws Exception {
        MapType mapStringIntegerType = TypeFactory.defaultInstance().constructMapType(HashMap.class, String.class, Integer.class);
        assertTrue(mapStringIntegerType.isMapLikeType());
        assertEquals(String.class, mapStringIntegerType.getKeyType().getRawClass());
        assertEquals(Integer.class, mapStringIntegerType.getContentType().getRawClass());
        assertEquals(HashMap.class, mapStringIntegerType.getRawClass());
    }

    @Test
    public void testConstructMapLikeType() throws Exception {
        MapLikeType mapStringIntegerType = TypeFactory.defaultInstance().constructMapLikeType(TreeMap.class, String.class, Integer.class);
        assertTrue(mapStringIntegerType.isMapLikeType());
        assertEquals(String.class, mapStringIntegerType.getKeyType().getRawClass());
        assertEquals(Integer.class, mapStringIntegerType.getContentType().getRawClass());
        assertEquals(TreeMap.class, mapStringIntegerType.getRawClass());
    }
    
    @Test
    public void testConstructSimpleType() throws Exception {
        JavaType[] params = new JavaType[] { TypeFactory.defaultInstance().constructType(String.class) };
        JavaType listStringType = TypeFactory.defaultInstance().constructSimpleType(List.class, params);
        
        assertNotNull(listStringType);
        assertEquals(List.class, listStringType.getRawClass());
        assertEquals(1, listStringType.containedTypeCount());
        assertEquals(String.class, listStringType.containedType(0).getRawClass());
    }

    @Test
    public void testConstructReferenceType() throws Exception {
        JavaType referredType = TypeFactory.defaultInstance().constructType(String.class);
        JavaType atomicRefStringType = TypeFactory.defaultInstance().constructReferenceType(AtomicReference.class, referredType);
        
        assertNotNull(atomicRefStringType);
        assertEquals(AtomicReference.class, atomicRefStringType.getRawClass());
        assertEquals(String.class, atomicRefStringType.getContentType().getRawClass());
    }

    @Test
    public void testUncheckedSimpleType() throws Exception {
        JavaType dateType = TypeFactory.defaultInstance().uncheckedSimpleType(Date.class);
        assertNotNull(dateType);
        assertEquals(Date.class, dateType.getRawClass());
        assertTrue(dateType.getBindings().isEmpty());
    }

    @Test
    public void testConstructParametricType() throws Exception {
        JavaType listStringType = TypeFactory.defaultInstance().constructParametricType(List.class, String.class);
        assertEquals(String.class, listStringType.getContentType().getRawClass());
        assertEquals(List.class, listStringType.getRawClass());
    }
    
    @Test
    public void testConstructParametrizedTypeWithParametersFor() throws Exception {
        JavaType innerType = TypeFactory.defaultInstance().constructType(Integer.class);
        // For ArrayList, it expects 1 type parameter. The 'parametersFor' argument is used to determine
        // the generic supertype for which the parameters are defined. Here, it's List.
        JavaType parameterizedList = TypeFactory.defaultInstance().constructParametrizedType(ArrayList.class, List.class, innerType);
        
        assertNotNull(parameterizedList);
        assertEquals(ArrayList.class, parameterizedList.getRawClass());
        assertEquals(Integer.class, parameterizedList.getContentType().getRawClass());
        // The bindings should reflect the parameters defined for List.
        assertEquals(1, parameterizedList.getBindings().size());
        assertEquals("E", parameterizedList.getBindings().getBoundName(0));
        assertEquals(Integer.class, parameterizedList.getBindings().getBoundType(0).getRawClass());
    }

    @Test
    public void testConstructRawCollectionLikeType() throws Exception {
        CollectionLikeType rawSet = TypeFactory.defaultInstance().constructRawCollectionLikeType(Set.class);
        assertTrue(rawSet.isCollectionLikeType());
        assertEquals(Object.class, rawSet.getContentType().getRawClass());
        assertEquals(Set.class, rawSet.getRawClass());
    }

    @Test
    public void testConstructRawMapType() throws Exception {
        MapType rawMap = TypeFactory.defaultInstance().constructRawMapType(Map.class);
        assertTrue(rawMap.isMapLikeType());
        assertEquals(Object.class, rawMap.getKeyType().getRawClass());
        assertEquals(Object.class, rawMap.getContentType().getRawClass());
        assertEquals(Map.class, rawMap.getRawClass());
    }

    @Test
    public void testConstructRawMapLikeType() throws Exception {
        MapLikeType rawTreeMap = TypeFactory.defaultInstance().constructRawMapLikeType(TreeMap.class);
        assertTrue(rawTreeMap.isMapLikeType());
        assertEquals(Object.class, rawTreeMap.getKeyType().getRawClass());
        assertEquals(Object.class, rawTreeMap.getContentType().getRawClass());
        assertEquals(TreeMap.class, rawTreeMap.getRawClass());
    }
}
