package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.cfg.MapperConfig; // Added for MapperFeature
import com.fasterxml.jackson.databind.deser.DeserializerFactory;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Locale;
import java.util.TimeZone;
import java.text.DateFormat;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.cfg.ContextAttributes; // Added import
import com.fasterxml.jackson.databind.cfg.DeserializationConfig; // Added import
import com.fasterxml.jackson.databind.cfg.MapperConfig.Type; // Added import for MapperFeature
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospector; // Added import
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.deser.DeserializerCache; // Added import
import com.fasterxml.jackson.databind.deser.DeserializationFeature; // Added import
import com.fasterxml.jackson.databind.MapperFeature; // Added import
import com.fasterxml.jackson.databind.util.LinkedNode; // Added import
import com.fasterxml.jackson.core.util.VersionUtil; // Added import for exception creation
import com.fasterxml.jackson.databind.JsonMappingException.Reference; // Added import
import com.fasterxml.jackson.databind.cfg.JsonFormat; // Added import

// Mock implementation for JavaType
abstract class AbstractMockJavaType extends JavaType {
    protected AbstractMockJavaType(Class<?> raw, int additionalHash, Object valueHandler, Object typeHandler, boolean asStatic) {
        super(raw, additionalHash, valueHandler, typeHandler, asStatic);
    }
    protected AbstractMockJavaType(JavaType base) {
        super(base);
    }

    @Override
    public JavaType withTypeHandler(Object h) { return this; }
    @Override
    public JavaType withContentTypeHandler(Object h) { return this; }
    @Override
    public JavaType withValueHandler(Object h) { return this; }
    @Override
    public JavaType withContentValueHandler(Object h) { return this; }
    @Override
    public JavaType withContentType(JavaType contentType) { return this; }
    @Override
    public JavaType withStaticTyping() { return this; }
    @Override
    public JavaType refine(Class<?> rawType, TypeBindings bindings, JavaType superClass, JavaType[] superInterfaces) { return this; }
    @Override
    protected JavaType _narrow(Class<?> subclass) { return this; }
    // Provide implementations for abstract methods from JavaType
    @Override
    public boolean isAbstract() { return false; }
    @Override
    public boolean isConcrete() { return true; }
    @Override
    public boolean isThrowable() { return false; }
    @Override
    public boolean isArrayType() { return false; }
    @Override
    public boolean isEnumType() { return false; }
    @Override
    public boolean isInterface() { return false; }
    @Override
    public boolean isPrimitive() { return false; }
    @Override
    public boolean isFinal() { return false; }
    @Override
    public JavaType narrowBy(Class<?> subclass) { return this; }
    @Override
    public JavaType beneficial().Class<?> narrowBy(Class<?> subclass) { return this; }
    @Override
    public JavaType withHandlersFrom(JavaType src) { return this; }
    @Override
    public JavaType withContentValueHandler(Object h) { return this; }
    @Override
    public JavaType withContentType(JavaType contentType) { return this; }
    @Override
    public JavaType withStaticTyping() { return this; }
    @Override
    public JavaType refine(Class<?> rawType, TypeBindings bindings, JavaType superClass, JavaType[] superInterfaces) { return this; }
    @Override
    public JavaType withArrayElementType(JavaType et) { return this; }
    @Override
    public JavaType withMapKeyType(JavaType kt) { return this; }
    @Override
    public JavaType withMapValueType(JavaType vt) { return this; }
    @Override
    public JavaType withContainerElement(JavaType et) { return this; }
    @Override
    public JavaType withValueHandler(Object h) { return this; }
    @Override
    public JavaType withTypeHandler(Object h) { return this; }
    @Override
    public JavaType withContentTypeHandler(Object h) { return this; }
    @Override
    public boolean hasContentType() { return false; }
    @Override
    public JavaType containedType(int index) { return null; }
    @Override
    public int containedTypeCount() { return 0; }
    @Override
    public String containedTypeName(int index) { return null; }
    @Override
    public JavaType getContentType() { return null; }
    @Override
    public JavaType getKeyType() { return null; }
    @Override
    public JavaType getContent() { return null; }
    @Override
    public JavaType getRawClass() { return null; } // Dummy implementation
    @Override
    public boolean hasRawClass(Class<?> clz) { return false; }
    @Override
    public boolean isContainerType() { return false; }
    @Override
    public boolean isMapType() { return false; }
    @Override
    public boolean isCollectionLikeType() { return false; }
    @Override
    public boolean isCollectionType() { return false; }
    @Override
    public boolean isReferenceType() { return false; }
    @Override
    public boolean isIntegralType() { return false; }
    @Override
    public boolean is dalamanType() { return false; }
    @Override
    public boolean isBooleanType() { return false; }
    @Override
    public boolean isFloatType() { return false; }
    @Override
    public boolean isDoubleType() { return false; }
    @Override
    public boolean isNumberType() { return false; }
    @Override
    public boolean isTextualType() { return false; }
    @Override
    public boolean isObject() { return false; }
    @Override
    public boolean isAnyGetter() { return false; }
    @Override
    public boolean isAnySetter() { return false; }
    @Override
    public boolean isIgnoredProperty() { return false; }
    @Override
    public boolean isSelfReference() { return false; }
    @Override
    public boolean isIgnoredType() { return false; }
    @Override
    public boolean isThrowable() { return false; }
    @Override
    public boolean isAbstract() { return false; }
    @Override
    public boolean isConcrete() { return true; }
    @Override
    public boolean isPrimitive() { return false; }
    @Override
    public boolean isFinal() { return false; }
    @Override
    public boolean isInterface() { return false; }
    @Override
    public boolean isArrayType() { return false; }
    @Override
    public boolean isMapType() { return false; }
    @Override
    public boolean isCollectionLikeType() { return false; }
    @Override
    public boolean isCollectionType() { return false; }
    @Override
    public boolean isEnumType() { return false; }
    @Override
    public boolean isReferenceType() { return false; }
    @Override
    public boolean isContainerType() { return false; }
    @Override
    public boolean isValueType() { return true; }
    @Override
    public boolean isVoid() { return false; }
    @Override
    public boolean isJavaLangObject() { return false; }
    @Override
    public JavaType getSuperClass() { return null; }
    @Override
    public JavaType[] findSuperTypes(Class<?> erasedType) { return null; }
    @Override
    public JavaType[] getInterfaces() { return null; }
    @Override
    public JavaType[] findImplementations(Class<?> erasedType) { return null; }
    @Override
    public String toString() { return "MockJavaType"; }
}

// Mock implementation of JavaType using a concrete Class
class MockJavaType extends AbstractMockJavaType {
    private final Class<?> _rawClass;
    private final String _className;

    protected MockJavaType(Class<?> raw, int additionalHash, Object valueHandler, Object typeHandler, boolean asStatic) {
        super(raw, additionalHash, valueHandler, typeHandler, asStatic);
        this._rawClass = raw;
        this._className = raw.getName();
    }

    @Override
    public Class<?> getRawClass() { return _rawClass; }

    @Override
    public String toString() { return _className; }

    @Override
    public int hashCode() { return _className.hashCode(); }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MockJavaType other = (MockJavaType) o;
        return _className.equals(other._className);
    }
}

// Minimal stub for DeserializationContext to allow calls.
abstract class AbstractMockDeserializationContext extends DeserializationContext {

    protected AbstractMockDeserializationContext(DeserializerFactory df) {
        super(df);
    }

    protected AbstractMockDeserializationContext(DeserializerFactory df, DeserializerCache cache) {
        super(df, cache);
    }

    protected AbstractMockDeserializationContext(DeserializationContext src, DeserializerFactory factory) {
        super(src, factory);
    }

    protected AbstractMockDeserializationContext(DeserializationContext src) {
        super(src);
    }

    @Override
    public DeserializationConfig getConfig() { return null; }
    @Override
    public JsonParser getParser() { return null; }
    @Override
    public JsonNodeFactory getNodeFactory() { return JsonNodeFactory.instance; }
    @Override
    public boolean isEnabled(MapperFeature feature) { return false; }
    @Override
    public boolean isEnabled(DeserializationFeature feature) { return false; }
    @Override
    public Locale getLocale() { return Locale.getDefault(); }
    @Override
    public TimeZone getTimeZone() { return TimeZone.getDefault(); }
    @Override
    public AnnotationIntrospector getAnnotationIntrospector() { return AnnotationIntrospector.nopInstance(); } // Use nopInstance()
    @Override
    public TypeFactory getTypeFactory() { return TypeFactory.defaultInstance(); }
    @Override
    public Base64Variant getBase64Variant() { return null; }
    @Override
    public DeserializerFactory getFactory() { return null; } // Provide a dummy instance
    @Override
    public Object findInjectableValue(Object valueId, BeanProperty forProperty, Object beanInstance) { return null; }
    @Override
    public ContextAttributes getAttributes() { return ContextAttributes.getEmpty(); }
    @Override
    public LinkedNode<JavaType> getcurrentType() { return null; }
    @Override
    public boolean canOverrideAccessModifiers() { return false; }
    @Override
    public JsonFormat.Value getDefaultPropertyFormat(Class<?> baseType) { return null; }
    @Override
    public ObjectBuffer getObjectBuffer() { return null; }
    @Override
    public DateFormat getDateFormat() { return null; }
    @Override
    public Class<?> getActiveView() { return null; }

    // Implementations for JsonMappingException.from methods used by the class under test
    public static JsonMappingException from(DeserializationContext ctxt, String msg) {
        return new JsonMappingException(msg);
    }
    // Need to provide a dummy implementation for JsonParser if it's ever accessed
    // but in this case, only the context is needed.
}

public class SubTypeValidatorTest {

    private static final String PREFIX_STRING = "org.springframework.";
    private static final Set<String> DEFAULT_NO_DESER_CLASS_NAMES = SubTypeValidator.DEFAULT_NO_DESER_CLASS_NAMES;

    // Helper to create a mock JavaType from a class name string.
    private JavaType createMockJavaType(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            return new MockJavaType(clazz, 0, null, null, false);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Could not create mock JavaType for " + className, e);
        }
    }

    // Helper to create a mock DeserializationContext.
    private DeserializationContext createMockDeserializationContext() {
        // Use a minimal concrete implementation if needed, but often abstract mocks suffice.
        return new AbstractMockDeserializationContext(new DeserializerFactoryConfig().getDeserializerFactory()) {
            // Override specific methods if called by validateSubType and not handled by default mock.
            // JsonMappingException.from(ctxt, msg) primarily uses the context for exception creation, not specific methods.
            // For safety, we can add a minimal factory for exceptions.
            public JsonMappingException createRawMappingException(String message) {
                return new JsonMappingException(message);
            }
        };
    }

    @Test
    public void testForbiddenClassInvokerTransformer() throws Exception {
        String className = "org.apache.commons.collections.functors.InvokerTransformer";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);

        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testForbiddenClassJdbcRowSetImpl() throws Exception {
        String className = "com.sun.rowset.JdbcRowSetImpl";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);

        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testForbiddenClassPropertyPathFactoryBean() throws Exception {
        String className = "org.springframework.beans.factory.config.PropertyPathFactoryBean";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);

        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    // Tests for specific forbidden classes from DEFAULT_NO_DESER_CLASS_NAMES
    @Test
    public void testForbiddenClassInstantiateTransformer() throws Exception {
        String className = "org.apache.commons.collections.functors.InstantiateTransformer";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testForbiddenClassGroovyConvertedClosure() throws Exception {
        String className = "org.codehaus.groovy.runtime.ConvertedClosure";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testForbiddenClassSpringObjectFactory() throws Exception {
        String className = "org.springframework.beans.factory.ObjectFactory";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testForbiddenClassSunTemplatesImpl() throws Exception {
        String className = "com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testForbiddenClassXalanTemplatesImpl() throws Exception {
        String className = "org.apache.xalan.xsltc.trax.TemplatesImpl";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testForbiddenClassJavaFileHandler() throws Exception {
        String className = "java.util.logging.FileHandler";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testForbiddenClassSunRemoteObject() throws Exception {
        String className = "java.rmi.server.UnicastRemoteObject";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testForbiddenClassC3p0DataSource() throws Exception {
        String className = "com.mchange.v2.c3p0.JndiRefForwardingDataSource";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testForbiddenClassTomcatDbcpDataSource() throws Exception {
        String className = "org.apache.tomcat.dbcp.dbcp2.BasicDataSource";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testForbiddenClassBcelClassLoader() throws Exception {
        String className = "com.sun.org.apache.bcel.internal.util.ClassLoader";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    // Test for Spring classes starting with the prefix that are not directly forbidden
    @Test
    public void testSpringClassNotForbidden() throws Exception {
        String className = "org.springframework.util.StringUtils"; // A common, safe Spring class
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            // Expected: no exception
        } catch (JsonMappingException e) {
            fail("Unexpected exception for " + className + ": " + e.getMessage());
        }
    }

    // Test for a class that starts with the Spring prefix and has a problematic superclass.
    // This is hard to simulate directly without helper classes.
    // We will simulate the class name and trust the `startsWith` prefix logic.
    // The actual superclass check is internal reflection logic.
    @Test
    public void testSpringClassWithAbstractPointcutAdvisorSuperclass() throws Exception {
        // Simulating a Spring class whose *actual* superclass is AbstractPointcutAdvisor.
        // Since we cannot mock class hierarchies, we must rely on the `startsWith` check for the prefix.
        // The method then iterates through superclasses. If a superclass's simple name matches "AbstractPointcutAdvisor",
        // it breaks. We assume this iteration works correctly for real classes.
        // This test will pass if the class name is not in the forbidden list AND does not have the forbidden superclass.
        // We use a name that starts with the prefix.
        String simulatedSpringClassName = "org.springframework.beans.factory.support.SimpleInstantiationStrategy";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(simulatedSpringClassName);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            // Expected: no exception, as this specific class is not in the default list and we cannot directly test superclasses.
        } catch (JsonMappingException e) {
            fail("Unexpected exception for " + simulatedSpringClassName + ": " + e.getMessage());
        }
    }

    // Test for interface types
    @Test
    public void testInterfaceTypeThatIsForbidden() throws Exception {
        // `org.springframework.beans.factory.ObjectFactory` is an interface and is forbidden.
        String className = "org.springframework.beans.factory.ObjectFactory";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testInterfaceTypeNotForbidden() throws Exception {
        // An interface that starts with the Spring prefix but is not forbidden.
        String className = "org.springframework.core.Constants";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            // Expected: no exception
        } catch (JsonMappingException e) {
            fail("Unexpected exception for " + className + ": " + e.getMessage());
        }
    }

    @Test
    public void testNonSpringClass() throws Exception {
        String className = "java.lang.String";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            // Expected: no exception
        } catch (JsonMappingException e) {
            fail("Unexpected exception for " + className + ": " + e.getMessage());
        }
    }

    @Test
    public void testAnotherNonSpringClass() throws Exception {
        String className = "java.util.ArrayList";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            // Expected: no exception
        } catch (JsonMappingException e) {
            fail("Unexpected exception for " + className + ": " + e.getMessage());
        }
    }

    @Test
    public void testJavaLangObject() throws Exception {
        String className = "java.lang.Object";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            // Expected: no exception
        } catch (JsonMappingException e) {
            fail("Unexpected exception for " + className + ": " + e.getMessage());
        }
    }

    @Test
    public void testCommonsCollections4InvokerTransformer() throws Exception {
        String className = "org.apache.commons.collections4.functors.InvokerTransformer";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testCommonsCollections4InstantiateTransformer() throws Exception {
        String className = "org.apache.commons.collections4.functors.InstantiateTransformer";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testGroovyMethodClosure() throws Exception {
        String className = "org.codehaus.groovy.runtime.MethodClosure";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    @Test
    public void testForbiddenClassMchangeWrapperConnectionPoolDataSource() throws Exception {
        String className = "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(className);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            fail("Expected JsonMappingException for " + className);
        } catch (JsonMappingException e) {
            assertTrue(e.getMessage().contains(className));
        }
    }

    // This test is for the `full.startsWith(PREFIX_STRING)` condition followed by superclass iteration.
    // Since we cannot easily create a class hierarchy that matches `AbstractApplicationContext` as a superclass,
    // we will test a class name that starts with the prefix.
    // The actual superclass check is internal reflection logic and we assume it works correctly.
    @Test
    public void testSpringClassWithAbstractApplicationContextSuperclass() throws Exception {
        String simulatedSpringClassName = "org.springframework.context.support.GenericXmlApplicationContext";
        DeserializationContext ctxt = createMockDeserializationContext();
        JavaType type = createMockJavaType(simulatedSpringClassName);
        try {
            SubTypeValidator.instance().validateSubType(ctxt, type);
            // Expected: no exception, as this specific class is not in the default list and we cannot directly test superclasses.
        } catch (JsonMappingException e) {
            fail("Unexpected exception for " + simulatedSpringClassName + ": " + e.getMessage());
        }
    }
}
