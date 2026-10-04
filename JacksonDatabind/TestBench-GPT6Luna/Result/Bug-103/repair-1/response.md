```java
package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.deser.BasicDeserializerFactory;
import com.fasterxml.jackson.databind.deser.BeanDeserializerFactory;
import com.fasterxml.jackson.databind.deser.DeserializerCache;
import com.fasterxml.jackson.databind.deser.SettableAnyProperty;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdValueInstantiator;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.databind.ser.PropertyBuilder;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Type;
import java.util.Locale;
import java.util.TimeZone;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.exc.MismatchedInputException;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.exc.InvalidTypeIdException;
import com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.util.*;
import java.io.Closeable;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.deser.ContextualDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.*;
import com.fasterxml.jackson.databind.ser.impl.FailingSerializer;
import com.fasterxml.jackson.databind.ser.impl.ReadOnlyClassToSerializerMap;
import com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer;
import com.fasterxml.jackson.databind.ser.impl.UnknownSerializer;
import com.fasterxml.jackson.databind.ser.impl.WritableObjectId;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import java.util.concurrent.*;
import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.deser.impl.CreatorCandidate;
import com.fasterxml.jackson.databind.deser.impl.CreatorCollector;
import com.fasterxml.jackson.databind.deser.impl.JavaUtilCollectionsDeserializers;
import com.fasterxml.jackson.databind.deser.std.*;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.*;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.fasterxml.jackson.databind.deser.impl.*;
import com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer;
import com.fasterxml.jackson.databind.jsontype.impl.SubTypeValidator;
import com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import java.util.Map;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.databind.deser.impl.FailingDeserializer;
import com.fasterxml.jackson.databind.deser.impl.NullsConstantProvider;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ViewMatcher;
import com.fasterxml.jackson.annotation.Nulls;
import com.fasterxml.jackson.core.io.NumberInput;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.deser.impl.NullsAsEmptyProvider;
import com.fasterxml.jackson.databind.deser.impl.NullsFailProvider;
import com.fasterxml.jackson.databind.util.AccessPattern;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.util.EnumResolver;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.lang.reflect.InvocationTargetException;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.introspect.AnnotatedWithParams;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.lang.reflect.*;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.CreatorProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.std.NullifyingDeserializer;
import com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer;
import com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer;
import com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer;
import com.fasterxml.jackson.databind.deser.std.AtomicBooleanDeserializer;

public class DatabindContextTest {
    @Test
    public void testPathStartsEmpty() throws Exception {
        JsonMappingException e = new JsonMappingException(null, "problem");
        assertEquals(Collections.emptyList(), e.getPath());
        assertEquals("", e.getPathReference());
    }

    @Test
    public void testPathFieldReference() throws Exception {
        JsonMappingException e = new JsonMappingException(null, "problem");
        e.prependPath("source", "field");
        assertEquals(1, e.getPath().size());
        assertEquals("\"field\"", e.getPath().get(0).getDescription());
        assertEquals("problem (through reference chain: \"field\")", e.getMessage());
    }

    @Test
    public void testPathIndexReference() throws Exception {
        JsonMappingException e = new JsonMappingException(null, "problem");
        e.prependPath("source", 0);
        assertEquals(0, e.getPath().get(0).getIndex());
        assertEquals("0", e.getPathReference());
    }

    @Test
    public void testPathPrependsNewestFirst() throws Exception {
        JsonMappingException e = new JsonMappingException(null, "problem");
        e.prependPath("source", "old");
        e.prependPath("source", 1);
        assertEquals("1->\"old\"", e.getPathReference());
        assertEquals(2, e.getPath().size());
    }

    @Test
    public void testReferenceDescriptionForArrayClass() throws Exception {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(String[].class, 2);
        assertEquals("java.lang.String[][2]", ref.getDescription());
        assertEquals(2, ref.getIndex());
    }

    @Test
    public void testReferenceNullFromDescription() throws Exception {
        JsonMappingException.Reference ref = new JsonMappingException.Reference((Object) null);
        assertEquals("UNKNOWN[?]", ref.getDescription());
        assertEquals(-1, ref.getIndex());
    }

    @Test
    public void testWrapWithPathAddsField() throws Exception {
        JsonMappingException e = JsonMappingException.wrapWithPath(
                new IllegalArgumentException("bad"), "source", "name");
        assertEquals(1, e.getPath().size());
        assertEquals("\"name\"", e.getPath().get(0).getDescription());
        assertEquals("bad", e.getOriginalMessage());
    }

    @Test
    public void testWrapExistingExceptionPrepends() throws Exception {
        JsonMappingException original = new JsonMappingException(null, "bad");
        original.prependPath("source", "inner");
        JsonMappingException wrapped = JsonMappingException.wrapWithPath(original, "source", 3);
        assertSame(original, wrapped);
        assertEquals("3->\"inner\"", wrapped.getPathReference());
    }

    @Test
    public void testPathReferenceAppendsToProvidedBuilder() throws Exception {
        JsonMappingException e = new JsonMappingException(null, "problem");
        e.prependPath("source", 4);
        StringBuilder b = new StringBuilder("prefix:");
        assertSame(b, e.getPathReference(b));
        assertEquals("prefix:4", b.toString());
    }

    @Test
    public void testFromUnexpectedIoException() throws Exception {
        JsonMappingException e = JsonMappingException.fromUnexpectedIOE(new IOException("failure"));
        assertTrue(e.getMessage().contains("failure"));
        assertEquals(null, e.getProcessor());
    }

    @Test
    public void testReferenceRejectsNullFieldName() throws Exception {
        try {
            new JsonMappingException.Reference("source", (String) null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testReferenceNoIndexForField() throws Exception {
        JsonMappingException.Reference ref = new JsonMappingException.Reference("source", "x");
        assertEquals(-1, ref.getIndex());
        assertEquals("x", ref.getFieldName());
    }

    @Test
    public void testMappingExceptionUsesMessageWithoutPath() throws Exception {
        JsonMappingException e = JsonMappingException.from((JsonParser) null, "message");
        assertEquals("message", e.getMessage());
        assertEquals("", e.getPathReference());
    }

    @Test
    public void testNestedPathChainMessage() throws Exception {
        JsonMappingException e = new JsonMappingException(null, "bad");
        e.prependPath("source", "leaf");
        e.prependPath("source", 2);
        assertEquals("bad (through reference chain: 2->\"leaf\")", e.getLocalizedMessage());
    }

    @Test
    public void testFromParserRetainsProcessor() throws Exception {
        JsonMappingException e = new JsonMappingException((Closeable) null, "message");
        assertEquals(null, e.getProcessor());
        assertEquals("message", e.toString().substring(e.toString().indexOf(": ") + 2));
    }

    @Test
    public void testReferenceClassDescriptionUsesClassName() throws Exception {
        JsonMappingException.Reference ref = new JsonMappingException.Reference(Integer.class);
        assertEquals("java.lang.Integer[?]", ref.getDescription());
        assertEquals(null, ref.getFieldName());
    }

    @Test
    public void testConstructTypeForClassAndNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(mapper.constructType(String.class), mapper.getDeserializationContext().constructType((Type) String.class));
        assertNull(mapper.getDeserializationContext().constructType((Type) null));
    }

    @Test
    public void testConstructSpecializedTypeSameRawType() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType type = mapper.constructType(String.class);
        assertSame(type, mapper.getDeserializationContext().constructSpecializedType(type, String.class));
    }

    @Test
    public void testResolveSubtypeClassName() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JavaType base = mapper.constructType(Number.class);
        JavaType subtype = mapper.getDeserializationContext().resolveSubType(base, Integer.class.getName());
        assertEquals(Integer.class, subtype.getRawClass());
    }

    @Test
    public void testResolveUnknownSubtypeReturnsNull() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertNull(mapper.getDeserializationContext().resolveSubType(
                mapper.constructType(Number.class), "no.such.Type"));
    }

    @Test
    public void testFindClassAndUnknownClass() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        assertEquals(String.class, mapper.getDeserializationContext().findClass(String.class.getName()));
        try {
            mapper.getDeserializationContext().findClass("no.such.Type");
            fail("expected ClassNotFoundException");
        } catch (ClassNotFoundException expected) { }
    }

    @Test
    public void testBufferLeaseReturnAndReuse() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        ObjectBuffer first = ctxt.leaseObjectBuffer();
        ctxt.returnObjectBuffer(first);
        assertSame(first, ctxt.leaseObjectBuffer());
        assertNotSame(first, ctxt.leaseObjectBuffer());
    }

    @Test
    public void testArrayBuildersAreReused() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        DeserializationContext ctxt = mapper.getDeserializationContext();
        assertSame(ctxt.getArrayBuilders(), ctxt.getArrayBuilders());
    }
}
```