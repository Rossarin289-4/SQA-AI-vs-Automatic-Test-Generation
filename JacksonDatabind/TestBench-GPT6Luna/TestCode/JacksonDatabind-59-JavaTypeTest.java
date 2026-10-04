package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.lang.reflect.Modifier;
import java.util.List;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.type.TypeBindings;
import java.lang.reflect.TypeVariable;
import java.util.Collection;
import com.fasterxml.jackson.databind.JavaType;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.lang.reflect.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.LRUMap;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.ResolvedRecursiveType;
import com.fasterxml.jackson.databind.type.ClassStack;
import com.fasterxml.jackson.databind.type.TypeBase;
import com.fasterxml.jackson.databind.type.TypeModifier;

public class JavaTypeTest {
    @Test
    public void testRawClassAndClassPredicates() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertSame(String.class, type.getRawClass());
        assertTrue(type.hasRawClass(String.class));
        assertFalse(type.hasRawClass(Object.class));
        assertTrue(type.isTypeOrSubTypeOf(Object.class));
        assertFalse(type.isTypeOrSubTypeOf(Number.class));
        assertTrue(type.isFinal());
    }

    @Test
    public void testPrimitiveClassPredicates() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(int.class);
        assertTrue(type.isPrimitive());
        assertTrue(type.isConcrete());
        assertFalse(type.isAbstract());
        assertFalse(type.isInterface());
        assertFalse(type.isFinal());
    }

    @Test
    public void testInterfaceAndAbstractPredicates() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType iface = factory.constructType(List.class);
        JavaType abstractType = factory.constructType(Number.class);
        assertTrue(iface.isInterface());
        assertTrue(iface.isAbstract());
        assertFalse(iface.isConcrete());
        assertTrue(abstractType.isAbstract());
        assertFalse(abstractType.isConcrete());
    }

    @Test
    public void testThrowableAndEnumPredicates() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        assertTrue(factory.constructType(Exception.class).isThrowable());
        assertFalse(factory.constructType(String.class).isThrowable());
        assertTrue(factory.constructType(Thread.State.class).isEnumType());
        assertFalse(factory.constructType(String.class).isEnumType());
    }

    @Test
    public void testDefaultSimpleTypeCapabilities() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertFalse(type.isArrayType());
        assertFalse(type.isContainerType());
        assertFalse(type.isCollectionLikeType());
        assertFalse(type.isMapLikeType());
        assertFalse(type.hasContentType());
        assertTrue(type.isJavaLangObject() == false);
        assertFalse(type.useStaticType());
    }

    @Test
    public void testObjectTypeIdentification() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        assertTrue(type.isJavaLangObject());
        assertSame(Object.class, type.getRawClass());
    }

    @Test
    public void testCollectionTypeContentAndBindings() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructCollectionType(List.class, String.class);
        assertTrue(type.isContainerType());
        assertTrue(type.isCollectionLikeType());
        assertFalse(type.isMapLikeType());
        assertSame(String.class, type.getContentType().getRawClass());
        assertEquals(1, type.containedTypeCount());
        assertSame(type.getContentType(), type.containedType(0));
        assertTrue(type.hasGenericTypes());
    }

    @Test
    public void testMapTypeKeyAndContent() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructMapType(Map.class, String.class, Integer.class);
        assertTrue(type.isContainerType());
        assertTrue(type.isMapLikeType());
        assertFalse(type.isCollectionLikeType());
        assertSame(String.class, type.getKeyType().getRawClass());
        assertSame(Integer.class, type.getContentType().getRawClass());
        assertEquals(2, type.containedTypeCount());
    }

    @Test
    public void testContainedTypeOrUnknownAtValidAndInvalidIndex() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructCollectionType(List.class, String.class);
        assertSame(type.containedType(0), type.containedTypeOrUnknown(0));
        assertSame(Object.class, type.containedTypeOrUnknown(-1).getRawClass());
        assertSame(Object.class, type.containedTypeOrUnknown(1).getRawClass());
    }

    @Test
    public void testDefaultNullTypeAccessorsAndBindings() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertNull(type.getKeyType());
        assertNull(type.getContentType());
        assertNull(type.getReferencedType());
        assertNull(type.getParameterSource());
        assertEquals(0, type.containedTypeCount());
        assertNull(type.containedType(0));
        assertNull(type.findSuperType(java.sql.Date.class));
    }

    @Test
    public void testSupertypeLookupAndParameters() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructCollectionType(ArrayList.class, String.class);
        JavaType list = type.findSuperType(List.class);
        assertNotNull(list);
        assertSame(String.class, list.containedType(0).getRawClass());
        assertSame(String.class, type.findTypeParameters(List.class)[0].getRawClass());
        assertSame(type, type.findSuperType(ArrayList.class));
    }

    @Test
    public void testSuperClassAndInterfaces() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructType(ArrayList.class);
        assertSame(AbstractList.class, type.getSuperClass().getRawClass());
        assertFalse(type.getInterfaces().isEmpty());
        assertTrue(type.getInterfaces().get(0).getRawClass().isInterface());
    }

    @Test
    public void testSignaturesForSimpleClass() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertEquals("Ljava/lang/String;", type.getErasedSignature());
        assertEquals("Ljava/lang/String;", type.getGenericSignature());
    }

    @Test
    public void testSignaturesForParameterizedCollection() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructCollectionType(List.class, String.class);
        assertEquals("Ljava/util/List;", type.getErasedSignature());
        assertEquals("Ljava/util/List<Ljava/lang/String;>;", type.getGenericSignature());
    }

    @Test
    public void testHandlerCopiesAndPresenceFlags() throws Exception {
        JavaType original = TypeFactory.defaultInstance().constructType(String.class);
        Object valueHandler = new Object();
        Object typeHandler = new Object();
        JavaType configured = original.withValueHandler(valueHandler).withTypeHandler(typeHandler);
        assertSame(valueHandler, configured.getValueHandler());
        assertSame(typeHandler, configured.getTypeHandler());
        assertTrue(configured.hasValueHandler());
        assertTrue(configured.hasHandlers());
        assertFalse(original.hasHandlers());
    }

    @Test
    public void testWithHandlersFromCopiesBothTopLevelHandlers() throws Exception {
        JavaType source = TypeFactory.defaultInstance().constructType(String.class)
                .withValueHandler("value").withTypeHandler("type");
        JavaType target = TypeFactory.defaultInstance().constructType(String.class)
                .withHandlersFrom(source);
        assertEquals("value", target.getValueHandler());
        assertEquals("type", target.getTypeHandler());
        assertTrue(target.hasHandlers());
    }

    @Test
    public void testCollectionContentHandlers() throws Exception {
        JavaType element = TypeFactory.defaultInstance().constructType(String.class)
                .withValueHandler("element-value").withTypeHandler("element-type");
        JavaType collection = TypeFactory.defaultInstance()
                .constructCollectionLikeType(List.class, element);
        assertEquals("element-value", collection.getContentValueHandler());
        assertEquals("element-type", collection.getContentTypeHandler());
        assertTrue(collection.hasHandlers());
    }

    @Test
    public void testMapKeyAndValueHandlersFromSource() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType source = factory.constructMapType(Map.class, String.class, Integer.class)
                .withKeyTypeHandler("key-type")
                .withKeyValueHandler("key-value")
                .withContentTypeHandler("value-type")
                .withContentValueHandler("value-value");
        JavaType target = factory.constructMapType(Map.class, String.class, Integer.class)
                .withHandlersFrom(source);
        assertEquals("key-type", target.getKeyType().getTypeHandler());
        assertEquals("key-value", target.getKeyType().getValueHandler());
        assertEquals("value-type", target.getContentTypeHandler());
        assertEquals("value-value", target.getContentValueHandler());
    }

    @Test
    public void testStaticTypingIsIdempotentAndPropagates() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructCollectionType(List.class, String.class);
        JavaType staticType = type.withStaticTyping();
        assertTrue(staticType.useStaticType());
        assertTrue(staticType.getContentType().useStaticType());
        assertSame(staticType, staticType.withStaticTyping());
        assertFalse(type.useStaticType());
    }

    @Test
    public void testWithContentTypeIdentityAndReplacement() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType collection = factory.constructCollectionType(List.class, String.class);
        assertSame(collection, collection.withContentType(collection.getContentType()));
        JavaType replacement = collection.withContentType(factory.constructType(Integer.class));
        assertSame(Integer.class, replacement.getContentType().getRawClass());
        assertSame(String.class, collection.getContentType().getRawClass());
    }

    @Test
    public void testForcedNarrowBySameClassAndSubtype() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Number.class);
        assertSame(type, type.forcedNarrowBy(Number.class));
        JavaType narrowed = type.forcedNarrowBy(Integer.class);
        assertSame(Integer.class, narrowed.getRawClass());
    }

    @Test
    public void testForcedNarrowByCopiesHandlers() throws Exception {
        Object valueHandler = new Object();
        Object typeHandler = new Object();
        JavaType type = TypeFactory.defaultInstance().constructType(Number.class)
                .withValueHandler(valueHandler).withTypeHandler(typeHandler);
        JavaType narrowed = type.forcedNarrowBy(Integer.class);
        assertSame(valueHandler, narrowed.getValueHandler());
        assertSame(typeHandler, narrowed.getTypeHandler());
    }

    @Test
    public void testCollectionLikeTypeClassification() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        CollectionLikeType actual = factory.constructCollectionLikeType(List.class, String.class);
        CollectionLikeType merelyLike = factory.constructCollectionLikeType(Iterable.class, String.class);
        assertTrue(actual.isTrueCollectionType());
        assertFalse(merelyLike.isTrueCollectionType());
        assertTrue(actual.isCollectionLikeType());
    }

    @Test
    public void testMapLikeTypeClassification() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        MapLikeType actual = factory.constructMapLikeType(Map.class, String.class, Integer.class);
        MapLikeType merelyLike = factory.constructMapLikeType(Map.Entry.class, String.class, Integer.class);
        assertTrue(actual.isTrueMapType());
        assertFalse(merelyLike.isTrueMapType());
        assertTrue(actual.isMapLikeType());
    }

    @Test
    public void testEqualityAndHashCodeRespectTypeIdentity() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType first = factory.constructCollectionType(List.class, String.class);
        JavaType equal = factory.constructCollectionType(List.class, String.class);
        JavaType different = factory.constructCollectionType(List.class, Integer.class);
        assertEquals(first, equal);
        assertEquals(first.hashCode(), equal.hashCode());
        assertNotEquals(first, different);
        assertNotEquals(first, null);
    }

    @Test
    public void testParameterizedMapCanonicalAndStringForms() throws Exception {
        JavaType type = TypeFactory.defaultInstance()
                .constructMapType(Map.class, String.class, Integer.class);
        assertEquals("java.util.Map<java.lang.String,java.lang.Integer>", type.toCanonical());
        assertTrue(type.toString().contains("java.util.Map"));
        assertTrue(type.toString().contains("java.lang.String"));
        assertTrue(type.toString().contains("java.lang.Integer"));
    }

    @Test
    public void testContainedTypeNamesAndBindings() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType list = factory.constructCollectionType(List.class, String.class);
        assertEquals("E", list.containedTypeName(0));
        assertNull(list.containedTypeName(1));
        assertEquals(1, list.getBindings().size());
        assertSame(String.class, list.getBindings().getBoundType(0).getRawClass());
    }

    @Test
    public void testSimpleTypeBindingsAreEmpty() throws Exception {
        JavaType simple = TypeFactory.defaultInstance().constructType(String.class);
        assertTrue(simple.getBindings().isEmpty());
        assertEquals(0, simple.containedTypeCount());
        assertNull(simple.containedTypeName(0));
    }

    @Test
    public void testRefineCollectionType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType list = factory.constructCollectionType(List.class, String.class);
        JavaType refined = list.refine(ArrayList.class, list.getBindings(), list.getSuperClass(),
                new JavaType[0]);
        assertSame(ArrayList.class, refined.getRawClass());
        assertSame(String.class, refined.getContentType().getRawClass());
        assertTrue(refined.isCollectionLikeType());
    }

    @Test
    public void testCollectionLikeConstructUsesSuppliedContentType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType element = factory.constructType(String.class);
        CollectionLikeType type = CollectionLikeType.construct(
                Iterable.class, TypeBindings.emptyBindings(), null, new JavaType[0], element);
        assertSame(Iterable.class, type.getRawClass());
        assertSame(element, type.getContentType());
        assertTrue(type.isCollectionLikeType());
        assertFalse(type.isTrueCollectionType());
    }

    @Test
    public void testCollectionLikeUpgradeFromSimpleType() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType base = factory.constructType(Object.class);
        JavaType element = factory.constructType(String.class);
        CollectionLikeType upgraded = CollectionLikeType.upgradeFrom(base, element);
        assertSame(Object.class, upgraded.getRawClass());
        assertSame(element, upgraded.getContentType());
        assertTrue(upgraded.isContainerType());
    }

    @Test
    public void testMapLikeWithKeyTypePreservesAndReplacesKey() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        MapLikeType map = factory.constructMapLikeType(Map.class, String.class, Integer.class);
        assertSame(map, map.withKeyType(map.getKeyType()));
        MapLikeType changed = map.withKeyType(factory.constructType(Long.class));
        assertSame(Long.class, changed.getKeyType().getRawClass());
        assertSame(Integer.class, changed.getContentType().getRawClass());
        assertSame(String.class, map.getKeyType().getRawClass());
    }

    @Test
    public void testWithModifierNullClearsClassLoaderSetting() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance().withClassLoader(null);
        TypeFactory changed = factory.withModifier(null);
        assertNull(changed.getClassLoader());
        assertSame(Object.class, changed.constructType(Object.class).getRawClass());
    }

    @Test
    public void testWithClassLoaderPreservesTypeConstruction() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance().withClassLoader(
                JavaTypeTest.class.getClassLoader());
        assertSame(JavaTypeTest.class.getClassLoader(), factory.getClassLoader());
        assertSame(String.class, factory.constructType(String.class).getRawClass());
    }
}
