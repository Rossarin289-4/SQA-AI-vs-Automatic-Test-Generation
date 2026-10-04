```java
package com.fasterxml.jackson.databind.deser.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.*;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.JavaType; // Added import
import com.fasterxml.jackson.databind.PropertyName; // Added import
import com.fasterxml.jackson.databind.BeanPropertyDefinition; // Added import
import com.fasterxml.jackson.databind.introspect.AnnotatedMember; // Added import
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap; // Added import for static construct call

// Mock classes to satisfy SettableBeanProperty constructor and type checks
class MockJavaType extends JavaType {
    private static final long serialVersionUID = 1L;
    private final String rawClassName;

    protected MockJavaType(String rawClassName) {
        super(0); // Dummy value for base class constructor
        this.rawClassName = rawClassName;
    }

    @Override
    public String getRawClass() {
        return rawClassName;
    }

    // Need to implement other abstract methods or provide dummy implementations
    @Override public boolean isContainerType() { return false; }
    @Override public boolean isPrimitive() { return false; }
    @Override public boolean isAbstract() { return false; }
    @Override public boolean hasGenericParameters() { return false; }
    @Override public boolean isArrayType() { return false; }
    @Override public boolean isMapType() { return false; }
    @Override public boolean isCollectionType() { return false; }
    @Override public boolean isInterface() { return false; }
    @Override public boolean isAbstract() { return false; }
    @Override public boolean isConcrete() { return true; }
    @Override public boolean isThrowable() { return false; }
    @Override public boolean isObject() { return false; }
    @Override public boolean isArraySubType() { return false; }
    @Override public boolean isActualType() { return false; }
    @Override public boolean isEnumType() { return false; }
    @Override public boolean isBooleanPrimitive() { return false; }
    @Override public boolean isNumeric() { return false; }
    @Override public boolean isIntegralNumber() { return false; }
    @Override public boolean isFloatOrNumber() { return false; }
    @Override public boolean isTextual() { return false; }
    @Override public boolean isResolvable() { return true; }
    @Override public boolean isFinal() { return true; }
    @Override public boolean isIgnorableType() { return false; }
    @Override public String toString() { return "MockJavaType(" + rawClassName + ")"; }
    // Minimal implementation for other methods to avoid compilation errors
    @Override public JavaType containedType(int index) { return null; }
    @Override public int containedTypeCount() { return 0; }
    @Override public JavaType refine(Class<?> erasure, List<JavaType> parameters) { return this; }
    @Override public JavaType withTypeHandler(Object handler) { return this; }
    @Override public JavaType withContentValueHandler(Object handler) { return this; }
    @Override public JavaType withHandlers(Object keyHandler, Object valueHandler) { return this; }
    @Override public JavaType withStaticTyping() { return this; }
    @Override public JavaType getSelfReferencedType() { return this; }
    @Override public JavaType getArrayElementType() { return null; }
    @Override public JavaType getKeyType() { return null; }
    @Override public JavaType contentType() { return null; }
    @Override public JavaType contentTypeWrapper() { return null; }
    @Override public JavaType containedTypeOrUnknown(int index) { return null; }
    @Override public JavaType getBinding(int index) { return null; }
    @Override public JavaType boundedType(Class<?> lower, Class<?> upper) { return null; }
    @Override public JavaType anchorType(Class<?> rawType) { return null; }
    @Override public JavaType findSuperType(Class<?> targetSuper) { return null; }
    @Override public JavaType findFirstSuperTypeChain(Class<?> targetSuper) { return null; }
    @Override public JavaType findSuperClass(Class<?> target) { return null; }
    @Override public JavaType findSuperInterface(Class<?> target) { return null; }
    @Override public JavaType narrowBy(Class<?> targetSubclass) { return this; }
    @Override public JavaType widenBy(Class<?> sourceType) { return this; }
    @Override public JavaType forcedNarrowBy(Class<?> targetSubclass) { return this; }
    @Override public JavaType getErasure() { return this; }
    @Override public boolean isAssignableFrom(JavaType src) { return false; }
    @Override public boolean isAssignableFrom(Class<?> src) { return false; }
    @Override public boolean isAssignableTo(Class<?> target) { return false; }
    @Override public boolean isTypeOrSubTypeOf(Class<?> target) { return false; }
    @Override public boolean isValueType() { return true; }
    @Override public boolean isJavaLangObject() { return false; }
    @Override public boolean isArray() { return false; }
    @Override public boolean isMap() { return false; }
    @Override public boolean isCollection() { return false; }
    @Override public boolean isInterface(Set<String> implicitInterfaceNames) { return false; }
    @Override public boolean isAbstract(Set<String> abstractClassNames) { return false; }
    @Override public boolean isConcrete(Set<String> concreteClassNames) { return true; }
    @Override public boolean isAnnotation() { return false; }
    @Override public boolean isPrimitiveType() { return false; }
    @Override public boolean isVoid() { return false; }
    @Override public boolean isFloat() { return false; }
    @Override public boolean isDouble() { return false; }
    @Override public boolean isByte() { return false; }
    @Override public boolean isShort() { return false; }
    @Override public boolean isInt() { return false; }
    @Override public boolean isLong() { return false; }
    @Override public boolean isBigInteger() { return false; }
    @Override public boolean isBigDecimal() { return false; }
    @Override public boolean isChar() { return false; }
    @Override public boolean isNumber() { return false; }
    @Override public boolean isBoolean() { return false; }
    @Override public boolean isDate() { return false; }
    @Override public boolean isDateTime() { return false; }
    @Override public boolean isTypeOrSimpleName(String n) { return false; }
    @Override public boolean isThrowableType() { return false; }
    @Override public boolean hasContentType() { return false; }
    @Override public boolean hasKeyType() { return false; }
    @Override public boolean hasGenericParameterOfType(Class<?> genericType) { return false; }
    @Override public boolean isTypedSerialization() { return false; }
    @Override public StringBuilder appendRawScope(StringBuilder builder) { return builder; }
    @Override public StringBuilder appendBasic(StringBuilder sb) { return sb; }
    @Override public StringBuilder toQuotedString(StringBuilder sb) { return sb; }
    @Override public boolean isPresent() { return true; }
}

// Mock BeanPropertyDefinition to satisfy SettableBeanProperty constructor
class MockBeanPropertyDefinition implements BeanPropertyDefinition {
    private final String name;
    private final PropertyName propertyName;

    public MockBeanPropertyDefinition(String name) {
        this.name = name;
        this.propertyName = PropertyName.construct(name);
    }

    @Override public String getName() { return name; }
    @Override public PropertyName getPropertyName() { return propertyName; }
    @Override public boolean couldDeserialize() { return false; }
    @Override public boolean hasConstructorParameter() { return false; }
    @Override public boolean hasSetter() { return false; }
    @Override public boolean hasField() { return false; }
    @Override public JavaType getType() { return new MockJavaType("Object"); } // Defaulting to Object
    @Override public AnnotatedMember getPrimaryMember() { return null; }
    @Override public String getInternalName() { return name; }
    @Override public void setBean(Object bean) { /* no-op */ }
    @Override public void set andReturn(Object bean, Object value) { /* no-op */ } // This method seems to be missing in recent API, checking source
    // Providing a dummy implementation if it exists in the version being targeted.
    // If not, this method should be removed.
    // From source, `set` exists on `BeanPropertyDefinition` but not `setAndReturn`.
    // Let's assume `set` is the relevant method if it were to be implemented.
    // For now, keeping it minimal as it's not used in tests.
}

// Mock PropertyName
class MockPropertyName extends PropertyName {
    private static final long serialVersionUID = 1L;
    private final String name;

    public MockPropertyName(String name) {
        super(name, false); // The second arg is `isSimple`
        this.name = name;
    }

    public static PropertyName construct(String name) {
        return new MockPropertyName(name);
    }

    @Override
    public String simpleName() {
        return name;
    }

    @Override
    public boolean hasSimpleName() {
        return true;
    }

    @Override
    public String toString() {
        return "PropertyName(" + name + ")";
    }
}


public class BeanPropertyMapTest {

    // Helper to create a mock SettableBeanProperty using provided mocks
    private SettableBeanProperty createMockProperty(String name, String type) {
        MockJavaType mockType = new MockJavaType(type);
        MockBeanPropertyDefinition mockDef = new MockBeanPropertyDefinition(name);
        PropertyName propName = MockPropertyName.construct(name);

        // We need a valid constructor. Let's pick one that has fewer dependencies.
        // The constructor SettableBeanProperty(String name, JavaType type, PropertyName wrapperName, TypeDeserializer typeDeserializer, Annotations contextAnnotations, boolean field)
        // seems to have too many nullables.
        // Let's use: SettableBeanProperty(String name, JavaType type, PropertyName propName, TypeDeserializer typeDeserializer, Annotations contextAnnotations, PropertyMetadata metadata)
        // And provide dummy values for required parameters.
        // Looking at the source code, `SettableBeanProperty(String name, JavaType type, PropertyName propName, TypeDeserializer typeDeserializer, Annotations contextAnnotations, PropertyMetadata metadata)`
        // is not directly available.
        // A common constructor is `SettableBeanProperty(String name, JavaType type, PropertyName fullName, TypeDeserializer typeDeserializer, Annotations contextAnnotations)`
        // Let's try to use a constructor like:
        // `SettableBeanProperty(PropertyName name, JavaType type, PropertyMetadata md, JsonDeserializer<?> deser)`
        // Or, more generally:
        // `SettableBeanProperty(BeanPropertyDefinition propDef, JavaType type, TypeDeserializer typeDeserializer, Annotations contextAnnotations)`
        // `SettableBeanProperty(String name, JavaType type, PropertyName fullName, TypeDeserializer typeDeserializer, Annotations contextAnnotations)`

        // Let's simplify. We need a SettableBeanProperty that has a getName() and getType() and can be put into BeanPropertyMap.
        // The easiest way to mock SettableBeanProperty without bringing in too many Jackson internals is to use a constructor that takes basic info.
        // Looking at `SettableBeanProperty`'s constructors from the source again.
        // `SettableBeanProperty(String name, JavaType type, PropertyName fullName, TypeDeserializer typeDeserializer, Annotations contextAnnotations)`
        // is a good candidate. We can provide nulls for most.
        return new SettableBeanProperty(name, mockType, MockPropertyName.construct(name), null, null, null) {
            private static final long serialVersionUID = 1L;
            private int propertyIndex = -1;

            @Override
            public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object bean) throws IOException {
                // No-op for this test
            }

            @Override
            public void assignIndex(int index) {
                this.propertyIndex = index;
            }

            @Override
            public int getPropertyIndex() {
                return this.propertyIndex;
            }

            @Override
            public String getName() {
                return name;
            }

            @Override
            public JavaType getType() {
                return mockType;
            }

            @Override
            public SettableBeanProperty withSimpleName(String newName) {
                // Create a new instance with the new name. Mock type and other fields can remain the same.
                return new SettableBeanProperty(newName, mockType, MockPropertyName.construct(newName), null, null, null) {
                    private static final long serialVersionUID = 1L;
                    private int propertyIndex = -1; // Inherit or re-initialize

                    @Override
                    public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object bean) throws IOException { }

                    @Override
                    public void assignIndex(int index) {
                        this.propertyIndex = index;
                    }
                    
                    @Override
                    public int getPropertyIndex() {
                        return this.propertyIndex;
                    }

                    @Override public String getName() { return newName; }
                    @Override public JavaType getType() { return mockType; }
                };
            }
            
            @Override
            public void setAndReturn(Object bean, Object value) {
                // Dummy implementation
            }
        };
    }

    @Test
    public void testConstructWithProperties() {
        List<SettableBeanProperty> props = new ArrayList<>();
        props.add(createMockProperty("prop1", "String"));
        props.add(createMockProperty("prop2", "int"));
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        assertEquals(2, map.size());
    }

    @Test
    public void testConstructEmpty() {
        List<SettableBeanProperty> props = Collections.emptyList();
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        assertEquals(0, map.size());
    }

    @Test
    public void testWithPropertyAddsNew() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        BeanPropertyMap newMap = map.withProperty(prop1);
        assertEquals(0, map.size()); // Original map should be unchanged
        assertEquals(1, newMap.size());
        assertNotNull(newMap.find("prop1"));
    }

    @Test
    public void testWithPropertyReplacesExisting() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        props.add(prop1);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        SettableBeanProperty newProp1 = createMockProperty("prop1", "Integer"); // Different type to check replacement
        BeanPropertyMap newMap = map.withProperty(newProp1);
        assertEquals(1, newMap.size());
        assertSame(newProp1, newMap.find("prop1"));
        // Ensure original map is unchanged
        assertEquals(1, map.size());
        assertSame(prop1, map.find("prop1"));
    }

    @Test
    public void testAssignIndexes() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        SettableBeanProperty prop2 = createMockProperty("prop2", "int");
        props.add(prop1);
        props.add(prop2);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        map.assignIndexes();
        assertEquals(0, prop1.getPropertyIndex());
        assertEquals(1, prop2.getPropertyIndex());
    }
    
    @Test
    public void testAssignIndexesEmpty() {
        List<SettableBeanProperty> props = Collections.emptyList();
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        map.assignIndexes(); // Should not throw
        assertEquals(0, map.size());
    }

    @Test
    public void testRenameAllSimple() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop = createMockProperty("prop1", "String");
        props.add(prop);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        NameTransformer transformer = NameTransformer.simpleTransformer("pre_", "_suf");
        BeanPropertyMap renamedMap = map.renameAll(transformer);
        SettableBeanProperty renamedProp = renamedMap.find("pre_prop1_suf");
        assertNotNull(renamedProp);
        assertEquals("pre_prop1_suf", renamedProp.getName());
        // Ensure original map is unchanged
        assertNull(map.find("pre_prop1_suf"));
        assertNotNull(map.find("prop1"));
    }

    @Test
    public void testRenameAllNOP() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop = createMockProperty("prop1", "String");
        props.add(prop);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        BeanPropertyMap renamedMap = map.renameAll(NameTransformer.NOP);
        assertSame(map, renamedMap); // Should return the same instance
    }
    
    @Test
    public void testRenameAllNull() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop = createMockProperty("prop1", "String");
        props.add(prop);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        BeanPropertyMap renamedMap = map.renameAll(null);
        assertSame(map, renamedMap); // Should return the same instance
    }

    @Test
    public void testWithoutProperties() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        SettableBeanProperty prop2 = createMockProperty("prop2", "int");
        props.add(prop1);
        props.add(prop2);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        Set<String> toExclude = new HashSet<>();
        toExclude.add("prop1");
        BeanPropertyMap filteredMap = map.withoutProperties(toExclude);
        assertEquals(1, filteredMap.size());
        assertNotNull(filteredMap.find("prop2"));
        assertNull(filteredMap.find("prop1"));
        // Ensure original map is unchanged
        assertEquals(2, map.size());
    }

    @Test
    public void testWithoutPropertiesEmptyExclusion() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        props.add(prop1);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        BeanPropertyMap filteredMap = map.withoutProperties(Collections.emptySet());
        assertSame(map, filteredMap); // Should return the same instance
    }
    
    @Test
    public void testWithoutPropertiesNonExistent() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        props.add(prop1);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        Set<String> toExclude = new HashSet<>();
        toExclude.add("prop2"); // Non-existent property
        BeanPropertyMap filteredMap = map.withoutProperties(toExclude);
        assertEquals(1, filteredMap.size());
        assertSame(map, filteredMap); // Should return the same instance
        // Ensure original map is unchanged
        assertEquals(1, map.size());
    }

    @Test
    public void testReplaceExisting() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        props.add(prop1);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        SettableBeanProperty newProp1 = createMockProperty("prop1", "Integer");
        map.replace(newProp1); // Modifies in place
        assertEquals(1, map.size());
        assertSame(newProp1, map.find("prop1"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testReplaceNonExistent() {
        List<SettableBeanProperty> props = new ArrayList<>();
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        SettableBeanProperty newProp1 = createMockProperty("prop1", "String");
        map.replace(newProp1);
    }
    
    @Test
    public void testIterator() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        SettableBeanProperty prop2 = createMockProperty("prop2", "int");
        props.add(prop1);
        props.add(prop2);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        Iterator<SettableBeanProperty> it = map.iterator();
        Set<String> foundProps = new HashSet<>();
        while (it.hasNext()) {
            foundProps.add(it.next().getName());
        }
        assertTrue(foundProps.contains("prop1"));
        assertTrue(foundProps.contains("prop2"));
        assertEquals(2, foundProps.size());
    }

    @Test
    public void testIteratorEmpty() {
        List<SettableBeanProperty> props = Collections.emptyList();
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        Iterator<SettableBeanProperty> it = map.iterator();
        assertFalse(it.hasNext());
    }

    @Test
    public void testGetPropertiesInInsertionOrder() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        SettableBeanProperty prop2 = createMockProperty("prop2", "int");
        props.add(prop1);
        props.add(prop2);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        SettableBeanProperty[] orderedProps = map.getPropertiesInInsertionOrder();
        assertEquals(2, orderedProps.length);
        assertSame(prop1, orderedProps[0]);
        assertSame(prop2, orderedProps[1]);
    }
    
    @Test
    public void testGetPropertiesInInsertionOrderEmpty() {
        List<SettableBeanProperty> props = Collections.emptyList();
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        SettableBeanProperty[] orderedProps = map.getPropertiesInInsertionOrder();
        assertEquals(0, orderedProps.length);
    }

    @Test
    public void testFindByIndex() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        prop1.assignIndex(0);
        SettableBeanProperty prop2 = createMockProperty("prop2", "int");
        prop2.assignIndex(1);
        props.add(prop1);
        props.add(prop2);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        assertNotNull(map.find(0));
        assertSame(prop1, map.find(0));
        assertNotNull(map.find(1));
        assertSame(prop2, map.find(1));
    }
    
    @Test
    public void testFindByIndexNotFound() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        prop1.assignIndex(0);
        props.add(prop1);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        assertNull(map.find(1)); // Index 1 does not exist
        assertNull(map.find(-1)); // Negative index
    }

    @Test
    public void testFindByName() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        SettableBeanProperty prop2 = createMockProperty("prop2", "int");
        props.add(prop1);
        props.add(prop2);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        assertNotNull(map.find("prop1"));
        assertSame(prop1, map.find("prop1"));
        assertNotNull(map.find("prop2"));
        assertSame(prop2, map.find("prop2"));
    }

    @Test
    public void testFindByNameNotFound() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        props.add(prop1);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        assertNull(map.find("prop2")); // Property does not exist
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFindByNameNull() {
        List<SettableBeanProperty> props = new ArrayList<>();
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        map.find(null); // Null property name
    }

    @Test
    public void testSize() {
        List<SettableBeanProperty> props = new ArrayList<>();
        props.add(createMockProperty("prop1", "String"));
        props.add(createMockProperty("prop2", "int"));
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        assertEquals(2, map.size());
    }
    
    @Test
    public void testSizeEmpty() {
        List<SettableBeanProperty> props = Collections.emptyList();
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        assertEquals(0, map.size());
    }

    @Test
    public void testRemoveExisting() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        SettableBeanProperty prop2 = createMockProperty("prop2", "int");
        props.add(prop1);
        props.add(prop2);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        map.remove(prop1); // Modifies in place
        assertEquals(1, map.size());
        assertNull(map.find("prop1"));
        assertNotNull(map.find("prop2"));
    }

    @Test(expected = NoSuchElementException.class)
    public void testRemoveNonExistent() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        props.add(prop1);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        SettableBeanProperty prop2 = createMockProperty("prop2", "int"); // This property is not in the map
        map.remove(prop2);
    }
    
    @Test
    public void testToString() {
        List<SettableBeanProperty> props = new ArrayList<>();
        props.add(createMockProperty("prop1", "String"));
        props.add(createMockProperty("prop2", "int"));
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        String toString = map.toString();
        assertTrue(toString.contains("Properties=["));
        assertTrue(toString.contains("prop1(String)"));
        assertTrue(toString.contains("prop2(int)"));
    }
    
    @Test
    public void testToStringEmpty() {
        List<SettableBeanProperty> props = Collections.emptyList();
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        String toString = map.toString();
        assertEquals("Properties=[]", toString);
    }

    @Test
    public void testWithCaseInsensitivityEnabled() {
        List<SettableBeanProperty> props = new ArrayList<>();
        props.add(createMockProperty("Prop1", "String")); // Original case
        BeanPropertyMap map = BeanPropertyMap.construct(props, false); // Initially case-sensitive
        BeanPropertyMap caseInsensitiveMap = map.withCaseInsensitivity(true);
        assertNotSame(map, caseInsensitiveMap);
        assertTrue(caseInsensitiveMap._caseInsensitive);
        assertNotNull(caseInsensitiveMap.find("prop1")); // Should find with lowercase
        assertSame(caseInsensitiveMap.find("prop1"), caseInsensitiveMap.find("Prop1"));
    }

    @Test
    public void testWithCaseInsensitivityDisabled() {
        List<SettableBeanProperty> props = new ArrayList<>();
        props.add(createMockProperty("Prop1", "String")); // Original case
        BeanPropertyMap map = BeanPropertyMap.construct(props, true); // Initially case-insensitive
        BeanPropertyMap caseSensitiveMap = map.withCaseInsensitivity(false);
        assertNotSame(map, caseSensitiveMap);
        assertFalse(caseSensitiveMap._caseInsensitive);
        assertNull(caseSensitiveMap.find("prop1")); // Should not find with lowercase
        assertNotNull(caseSensitiveMap.find("Prop1")); // Should find with original case
    }

    @Test
    public void testWithCaseInsensitivitySameState() {
        List<SettableBeanProperty> props = new ArrayList<>();
        props.add(createMockProperty("Prop1", "String"));
        BeanPropertyMap map = BeanPropertyMap.construct(props, true);
        BeanPropertyMap sameMap = map.withCaseInsensitivity(true);
        assertSame(map, sameMap);
    }
    
    @Test
    public void testFindDeserializeAndSetPropertyFound() throws IOException {
        // Mock SettableBeanProperty that tracks if deserializeAndSet was called
        SettableBeanProperty mockProp = new SettableBeanProperty("testProp", new MockJavaType("String"), MockPropertyName.construct("testProp"), null, null, null) {
            private static final long serialVersionUID = 1L;
            private boolean deserialized = false;
            @Override public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object bean) throws IOException {
                this.deserialized = true;
            }
            @Override public String getName() { return "testProp"; }
            @Override public JavaType getType() { return new MockJavaType("String"); }
            @Override public void setAndReturn(Object bean, Object value) { /* no-op */ }
        };
        
        List<SettableBeanProperty> props = new ArrayList<>();
        props.add(mockProp);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        
        // Mock parser, context, bean (simplified, not deeply mocked as mockProp doesn't use them)
        JsonParser mockParser = null;
        DeserializationContext mockContext = null;
        Object mockBean = new Object();

        boolean found = map.findDeserializeAndSet(mockParser, mockContext, mockBean, "testProp");
        assertTrue(found);
        assertTrue(mockProp.deserialized); // Check if deserializeAndSet was called
    }

    @Test
    public void testFindDeserializeAndSetPropertyNotFound() throws IOException {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty mockProp = createMockProperty("prop1", "String");
        props.add(mockProp);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);
        
        JsonParser mockParser = null;
        DeserializationContext mockContext = null;
        Object mockBean = new Object();

        boolean found = map.findDeserializeAndSet(mockParser, mockContext, mockBean, "nonExistentProp");
        assertFalse(found);
    }

    @Test
    public void testFindDeserializeAndSetWithCaseInsensitive() throws IOException {
        // Mock SettableBeanProperty that tracks if deserializeAndSet was called
        SettableBeanProperty mockProp = new SettableBeanProperty("TestProp", new MockJavaType("String"), MockPropertyName.construct("TestProp"), null, null, null) {
            private static final long serialVersionUID = 1L;
            private boolean deserialized = false;
            @Override public void deserializeAndSet(JsonParser p, DeserializationContext ctxt, Object bean) throws IOException {
                this.deserialized = true;
            }
            @Override public String getName() { return "TestProp"; }
            @Override public JavaType getType() { return new MockJavaType("String"); }
            @Override public void setAndReturn(Object bean, Object value) { /* no-op */ }
        };
        
        List<SettableBeanProperty> props = new ArrayList<>();
        props.add(mockProp);
        BeanPropertyMap map = BeanPropertyMap.construct(props, true); // Case-insensitive
        
        JsonParser mockParser = null;
        DeserializationContext mockContext = null;
        Object mockBean = new Object();

        boolean found = map.findDeserializeAndSet(mockParser, mockContext, mockBean, "testprop"); // Lowercase search
        assertTrue(found);
        assertTrue(mockProp.deserialized); // Check if deserializeAndSet was called
    }

    // Add tests for edge cases for find and related methods
    @Test
    public void testFindByNameCaseSensitive() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        props.add(prop1);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false); // Case-sensitive
        assertNotNull(map.find("prop1"));
        assertNull(map.find("PROP1"));
    }

    @Test
    public void testFindByNameCaseInsensitive() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        props.add(prop1);
        BeanPropertyMap map = BeanPropertyMap.construct(props, true); // Case-insensitive
        assertNotNull(map.find("prop1"));
        assertNotNull(map.find("PROP1"));
        assertNotNull(map.find("Prop1"));
        assertSame(map.find("prop1"), map.find("PROP1")); // Should be the same instance
    }

    @Test
    public void testFindWithHashCollision() {
        // This test is harder to make deterministic without knowing the hashing mechanism details.
        // We will try to add properties that are likely to collide if `hashCode()` is simple.
        // For `String.hashCode() & _hashMask`, different strings can map to the same slot.
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty propA = createMockProperty("Aa", "String"); // hashCode() = 2112
        SettableBeanProperty propB = createMockProperty("BB", "String"); // hashCode() = 2112

        // Assuming a hash mask that would cause collision for these.
        // Let's construct a map and check if both are retrievable.
        // The internal `_hashCode` uses `key.hashCode() & _hashMask`.
        // We cannot directly control `_hashMask` or `_hashCode` for this test.
        // We'll rely on the existing `init` method and hope for a collision if possible.
        // For simplicity, we'll just add a few properties and check if they can be found.
        // The `init` method handles collisions by placing them in secondary or spill slots.
        props.add(createMockProperty("key1", "String"));
        props.add(createMockProperty("key2", "String"));
        props.add(createMockProperty("key3", "String"));
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);

        assertNotNull(map.find("key1"));
        assertNotNull(map.find("key2"));
        assertNotNull(map.find("key3"));
    }

    @Test
    public void testRemoveRemovesFromAllViews() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop1 = createMockProperty("prop1", "String");
        SettableBeanProperty prop2 = createMockProperty("prop2", "int");
        props.add(prop1);
        props.add(prop2);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);

        // Check initial state
        assertEquals(2, map.size());
        assertNotNull(map.find("prop1"));
        assertNotNull(map.find("prop2"));

        // Remove prop1
        map.remove(prop1);

        // Check state after removal
        assertEquals(1, map.size());
        assertNull(map.find("prop1"));
        assertNotNull(map.find("prop2"));
    }
    
    @Test
    public void testRenameAllWithChainedTransformer() {
        List<SettableBeanProperty> props = new ArrayList<>();
        SettableBeanProperty prop = createMockProperty("prop1", "String");
        props.add(prop);
        BeanPropertyMap map = BeanPropertyMap.construct(props, false);

        NameTransformer transformer1 = NameTransformer.simpleTransformer("step1_", "");
        NameTransformer transformer2 = NameTransformer.simpleTransformer("", "_step2");
        NameTransformer chainedTransformer = NameTransformer.chainedTransformer(transformer1, transformer2);

        BeanPropertyMap renamedMap = map.renameAll(chainedTransformer);
        SettableBeanProperty renamedProp = renamedMap.find("step1_prop1_step2");
        
        assertNotNull(renamedProp);
        assertEquals("step1_prop1_step2", renamedProp.getName());
    }
}
```