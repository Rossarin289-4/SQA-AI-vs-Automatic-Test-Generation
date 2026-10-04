package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.ser.BeanSerializerFactory;
import com.fasterxml.jackson.databind.ser.std.BeanSerializerBase;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.lang.reflect.Modifier;
import com.fasterxml.jackson.core.type.ResolvedType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.*;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.FilteredBeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.lang.reflect.Type;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.jsonschema.JsonSerializableSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.ser.impl.UnwrappingBeanSerializer;
import com.fasterxml.jackson.databind.ser.BeanSerializer;
import com.fasterxml.jackson.databind.ser.impl.BeanAsArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.RawSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ext.DOMSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

public class JavaTypeTest {
    @Test
    public void testSimpleRawClassAndIdentityNarrowing() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertSame(String.class, type.getRawClass());
        assertTrue(type.hasRawClass(String.class));
        assertSame(type, type.narrowBy(String.class));
        assertSame(type, type.widenBy(String.class));
    }

    @Test
    public void testRejectIncompatibleNarrowing() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        try {
            type.narrowBy(Integer.class);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testRejectIncompatibleWidening() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertSame(Integer.class, type.widenBy(Integer.class).getRawClass());
    }

    @Test
    public void testNarrowAndWidenCompatibleClasses() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Number.class);
        assertSame(Integer.class, type.narrowBy(Integer.class).getRawClass());
        assertSame(Object.class, type.widenBy(Object.class).getRawClass());
    }

    @Test
    public void testForcedNarrowing() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertSame(Object.class, type.forcedNarrowBy(Object.class).getRawClass());
    }

    @Test
    public void testInterfaceAbstractAndConcretePredicates() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        assertTrue(factory.constructType(List.class).isAbstract());
        assertTrue(factory.constructType(List.class).isInterface());
        assertFalse(factory.constructType(List.class).isConcrete());
        assertTrue(factory.constructType(String.class).isConcrete());
    }

    @Test
    public void testPrimitiveConcreteAndFinalPredicates() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        assertTrue(factory.constructType(int.class).isPrimitive());
        assertTrue(factory.constructType(int.class).isConcrete());
        assertTrue(factory.constructType(String.class).isFinal());
        assertFalse(factory.constructType(Number.class).isFinal());
    }

    @Test
    public void testEnumAndThrowablePredicates() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        assertTrue(factory.constructType(Thread.State.class).isEnumType());
        assertFalse(factory.constructType(String.class).isEnumType());
        assertTrue(factory.constructType(Exception.class).isThrowable());
        assertFalse(factory.constructType(String.class).isThrowable());
    }

    @Test
    public void testArrayPredicateForSimpleTypes() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertFalse(type.isArrayType());
        assertFalse(type.isContainerType());
    }

    @Test
    public void testObjectAndStaticTypingPredicates() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType objectType = factory.constructType(Object.class);
        assertTrue(objectType.isJavaLangObject());
        assertFalse(objectType.useStaticType());
        assertFalse(factory.constructType(String.class).isJavaLangObject());
    }

    @Test
    public void testSimpleTypeHasNoContainedTypes() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertFalse(type.hasGenericTypes());
        assertEquals(0, type.containedTypeCount());
        assertNull(type.getKeyType());
        assertNull(type.getContentType());
        assertNull(type.containedType(0));
        assertNull(type.containedTypeName(0));
    }

    @Test
    public void testContainedTypeOrUnknownUsesObjectForAbsentContent() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertTrue(type.containedTypeOrUnknown(0).hasRawClass(Object.class));
    }

    @Test
    public void testSimpleTypeHandlersAreNull() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertNull(type.getValueHandler());
        assertNull(type.getTypeHandler());
    }

    @Test
    public void testGenericAndErasedSignatures() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertEquals("Ljava/lang/String;", type.getGenericSignature());
        assertEquals("Ljava/lang/String;", type.getErasedSignature());
    }

    @Test
    public void testSignatureBuilderAppendsToExistingContent() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        StringBuilder generic = new StringBuilder("X");
        StringBuilder erased = new StringBuilder("Y");
        assertSame(generic, type.getGenericSignature(generic));
        assertSame(erased, type.getErasedSignature(erased));
        assertEquals("XLjava/lang/String;", generic.toString());
        assertEquals("YLjava/lang/String;", erased.toString());
    }

    @Test
    public void testSimpleTypeEqualityAndHashCode() throws Exception {
        TypeFactory factory = TypeFactory.defaultInstance();
        JavaType first = factory.constructType(String.class);
        JavaType second = factory.constructType(String.class);
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
        assertEquals(first.toString(), second.toString());
    }

    @Test
    public void testCollectionTypeReportsContentAndContainerTraits() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        assertTrue(type.isContainerType());
        assertTrue(type.isCollectionLikeType());
        assertEquals(1, type.containedTypeCount());
        assertTrue(type.getContentType().hasRawClass(String.class));
        assertSame(type.getContentType(), type.containedType(0));
    }

    @Test
    public void testMapTypeReportsKeyAndValueTypes() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructMapType(Map.class, String.class, Integer.class);
        assertTrue(type.isContainerType());
        assertTrue(type.isMapLikeType());
        assertTrue(type.getKeyType().hasRawClass(String.class));
        assertTrue(type.getContentType().hasRawClass(Integer.class));
        assertEquals(2, type.containedTypeCount());
    }

    @Test
    public void testConstructedArrayType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String[].class);
        assertTrue(type.isArrayType());
        assertTrue(type.isContainerType());
        assertSame(String[].class, type.getRawClass());
        assertTrue(type.getContentType().hasRawClass(String.class));
    }

    @Test
    public void testTypeHandlerCopyOnSimpleType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        Object marker = new Object();
        JavaType result = type.withTypeHandler(marker);
        assertSame(marker, result.getTypeHandler());
        assertNull(type.getTypeHandler());
    }

    @Test
    public void testValueHandlerCopyOnSimpleType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        Object marker = new Object();
        JavaType result = type.withValueHandler(marker);
        assertSame(marker, result.getValueHandler());
        assertNull(type.getValueHandler());
    }

    @Test
    public void testContentHandlersOnCollectionType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, String.class);
        Object typeMarker = new Object();
        Object valueMarker = new Object();
        JavaType withType = type.withContentTypeHandler(typeMarker);
        JavaType withValue = type.withContentValueHandler(valueMarker);
        assertSame(typeMarker, withType.getContentType().getTypeHandler());
        assertSame(valueMarker, withValue.getContentType().getValueHandler());
        assertNull(type.getContentType().getTypeHandler());
        assertNull(type.getContentType().getValueHandler());
    }

    @Test
    public void testStaticTypingCopy() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        JavaType result = type.withStaticTyping();
        assertEquals(type.getRawClass(), result.getRawClass());
        assertTrue(type.hasRawClass(result.getRawClass()));
    }

    @Test
    public void testNarrowCollectionContents() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, Number.class);
        JavaType result = type.narrowContentsBy(Integer.class);
        assertTrue(result.getContentType().hasRawClass(Integer.class));
        assertTrue(result.hasRawClass(List.class));
    }

    @Test
    public void testWidenCollectionContents() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructCollectionType(List.class, Integer.class);
        JavaType result = type.widenContentsBy(Number.class);
        assertTrue(result.getContentType().hasRawClass(Number.class));
        assertTrue(result.hasRawClass(List.class));
    }

    @Test
    public void testParameterSourceForOrdinaryType() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertNull(type.getParameterSource());
    }

    @Test
    public void testObjectTypeParameterSource() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(Object.class);
        assertNull(type.getParameterSource());
    }

    @Test
    public void testTypeEqualityAgainstNull() throws Exception {
        JavaType type = TypeFactory.defaultInstance().constructType(String.class);
        assertFalse(type.equals(null));
    }
}
