package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.ErrorReporter;
import com.google.javascript.rhino.Node;
import java.util.List;
import java.util.Set;
import java.io.IOException; // Added for appendStringTree if needed, though not directly used here.
import java.util.Collections; // For Collections.emptySet()

// Mock implementations for necessary types to allow NamedType compilation and testing.
// These mocks aim to satisfy the immediate compilation requirements based on the provided API.

// Mock JSTypeRegistry and its dependencies
class MockJSTypeRegistry extends JSTypeRegistry {
    // A minimal mock ErrorReporter.
    private static final ErrorReporter MOCK_ERROR_REPORTER = new ErrorReporter() {
        @Override
        public void warning(String message, String sourceName, int line, int lineOffset) {}
        @Override
        public void error(String message, String sourceName, int line, int lineOffset) {}
    };

    MockJSTypeRegistry() {
        super(MOCK_ERROR_REPORTER);
        // Initialization might be complex; for testing NamedType, focus on what it directly uses.
        // We'll override specific methods needed by NamedType.
    }

    @Override
    public JSType getNativeObjectType(JSTypeNative typeId) {
        // Provide minimal implementations for types NamedType might query.
        if (typeId == JSTypeNative.UNKNOWN_TYPE) return new UnknownType(this);
        if (typeId == JSTypeNative.NO_TYPE) return new NoType(this);
        if (typeId == JSTypeNative.NO_OBJECT_TYPE) return new NoObjectType(this);
        if (typeId == JSTypeNative.NO_RESOLVED_TYPE) return new NoResolvedType(this);
        return super.getNativeObjectType(typeId);
    }

    @Override
    public JSType getType(String reference) {
        // Default to returning null, as NamedType's resolution logic handles this.
        return null;
    }

    @Override
    public boolean isForwardDeclaredType(String reference) {
        // Default to false.
        return false;
    }

    @Override
    public boolean isLastGeneration() {
        // Default to true.
        return true;
    }

    @Override
    public FunctionType getNativeFunctionType(JSTypeNative typeId) {
        // Provide a mock FunctionType if needed.
        if (typeId == JSTypeNative.FUNCTION_TYPE) {
            // This needs to return a valid FunctionType. The actual implementation is complex.
            // For now, return a minimal mock.
            return new MockFunctionType(this, null, false, false);
        } else if (typeId == JSTypeNative.NO_OBJECT_TYPE) {
             // This case is specifically handled in NamedType, so it needs to return a FunctionType
             // whose instance type is potentially NO_OBJECT_TYPE.
             return new MockFunctionType(this, getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE), false, false);
        }
        return super.getNativeFunctionType(typeId);
    }
}

// Mock JSType implementations
abstract class BaseJSType extends JSType {
    protected final JSTypeRegistry registry;

    BaseJSType(JSTypeRegistry registry) {
        super(registry); // Call super constructor
        this.registry = registry;
    }

    // Provide default implementations for methods called by NamedType,
    // returning values that allow NamedType's logic to proceed for testing.
    @Override public String getDisplayName() { return getReferenceName(); }
    // Note: Many methods in JSType are abstract or final. For mocks, we only need to implement
    // abstract methods or override methods that NamedType actually calls and needs specific behavior for.
    // `getDisplayName` is not abstract nor final. `getReferenceName` is in `ObjectType`.
    // We'll rely on ObjectType's implementation for getReferenceName.
    
    @Override public boolean isUnknownType() { return false; }
    @Override public boolean isNoType() { return false; }
    @Override public boolean isNoObjectType() { return false; }
    @Override public boolean isNoResolvedType() { return false; }
    @Override public String getReferenceName() { return "MockReference"; } // Default reference name
    
    // Assume that methods like isString(), isNumber(), isUnionType() etc. are concrete in JSType and final,
    // so we cannot override them here. We must rely on their default behavior or the behavior of concrete mock types.
    // If they were abstract, we would implement them.
    
    // Need to implement all abstract methods from JSType and ObjectType if we were creating a full hierarchy.
    // For this test, we will use concrete mock classes that implement necessary methods.
}

// Concrete mock types implementing BaseJSType or BaseObjectType as needed.

class UnknownType extends BaseJSType {
    UnknownType(JSTypeRegistry registry) { super(registry); }
    @Override public boolean isUnknownType() { return true; }
    @Override public String getReferenceName() { return "Unknown"; }
}

class NoType extends BaseJSType {
    NoType(JSTypeRegistry registry) { super(registry); }
    @Override public boolean isNoType() { return true; }
    @Override public String getReferenceName() { return "NoType"; }
}

class NoObjectType extends BaseJSType {
    NoObjectType(JSTypeRegistry registry) { super(registry); }
    @Override public boolean isNoObjectType() { return true; }
    @Override public String getReferenceName() { return "NoObjectType"; }
}

class NoResolvedType extends BaseJSType {
    NoResolvedType(JSTypeRegistry registry) { super(registry); }
    @Override public boolean isNoResolvedType() { return true; }
    @Override public String getReferenceName() { return "NoResolvedType"; }
}

// Mock EnumElementType
class EnumElementType extends BaseJSType {
    private JSType primitiveType;

    EnumElementType(JSTypeRegistry registry, JSType primitiveType) {
        super(registry);
        this.primitiveType = primitiveType;
    }
    
    public JSType getPrimitiveType() { return primitiveType; }
    @Override public boolean isEnumElementType() { return true; }
    @Override public EnumElementType toMaybeEnumElementType() { return this; }
    @Override public String getReferenceName() { return "EnumElementType"; }
}

// Mock EnumType
class EnumType extends BaseJSType {
    private JSType elementsType;

    EnumType(JSTypeRegistry registry, JSType elementsType) {
        super(registry);
        this.elementsType = elementsType;
    }
    
    public JSType getElementsType() { return elementsType; }
    @Override public boolean isEnumType() { return true; }
    @Override public EnumType toMaybeEnumType() { return this; }
    @Override public String getReferenceName() { return "EnumType"; }
}

// Mock FunctionType
abstract class MockFunctionTypeBase extends FunctionType {
    protected JSTypeRegistry registry;
    protected ObjectType instanceType;
    protected boolean isConstructor;
    protected boolean isInterface;

    MockFunctionTypeBase(JSTypeRegistry registry, ObjectType instanceType, boolean isConstructor, boolean isInterface) {
        // Assuming super constructor takes registry, templateKeys, templatizedTypes.
        super(registry, Collections.<String>emptyList(), Collections.<JSType>emptyList());
        this.registry = registry;
        this.instanceType = instanceType;
        this.isConstructor = isConstructor;
        this.isInterface = isInterface;
    }

    @Override public ObjectType getInstanceType() { return instanceType; }
    @Override public boolean isConstructor() { return isConstructor; }
    @Override public boolean isInterface() { return isInterface; }
    @Override public boolean isFunctionType() { return true; }
    @Override public FunctionType toMaybeFunctionType() { return this; }
    @Override public String getReferenceName() { return "MockFunctionType"; }
}

// A concrete mock FunctionType
class MockFunctionType extends MockFunctionTypeBase {
    MockFunctionType(JSTypeRegistry registry, ObjectType instanceType, boolean isConstructor, boolean isInterface) {
        super(registry, instanceType, isConstructor, isInterface);
    }
    
    // Implement abstract methods if any are needed for FunctionType.
}

// Mock ObjectType
abstract class BaseObjectType extends ObjectType {
    protected final JSTypeRegistry registry;

    BaseObjectType(JSTypeRegistry registry) {
        super(registry);
        this.registry = registry;
    }

    // Provide minimal implementations for abstract methods
    @Override public abstract String getReferenceName(); // Must be implemented by concrete subclasses
    @Override public ObjectType getImplicitPrototype() { return null; }
    @Override public FunctionType getConstructor() { return null; }
    @Override public Node getRootNode() { return null; }
    @Override public StaticScope<JSType> getParentScope() { return null; }
    @Override public StaticSlot<JSType> getSlot(String name) { return null; }
    @Override public JSType getTypeOfThis() { return null; }
    
    // Mock implementations for other methods called by NamedType
    @Override public JSType getPropertyType(String propertyName) { return null; }
    @Override public boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode) { return false; }
    @Override public Property getOwnSlot(String name) { return null; }
    @Override public Set<String> getOwnPropertyNames() { return Collections.emptySet(); }
    @Override public PropertyMap getPropertyMap() { return null; }
    // JSDocInfo is not available directly, so we won't mock it. Remove uses if possible.
    // @Override public JSDocInfo getJSDocInfo() { return null; }
    // @Override public void setJSDocInfo(JSDocInfo info) {}
    @Override public boolean detectImplicitPrototypeCycle() { return false; }
    @Override public boolean detectInheritanceCycle() { return false; }
    @Override public String getNormalizedReferenceName() { return getReferenceName(); }
    @Override public String getDisplayName() { return getReferenceName(); }
    @Override public TernaryValue testForEquality(JSType that) { return TernaryValue.UNKNOWN; }
    @Override public boolean defineDeclaredProperty(String propertyName, JSType type, Node propertyNode) { return false; }
    @Override public boolean defineSynthesizedProperty(String propertyName, JSType type, Node propertyNode) { return false; }
    @Override public boolean defineInferredProperty(String propertyName, JSType type, Node propertyNode) { return false; }
    @Override public boolean removeProperty(String propertyName) { return false; }
    @Override public Node getPropertyNode(String propertyName) { return null; }
    // @Override public JSDocInfo getOwnPropertyJSDocInfo(String propertyName) { return null; }
    // @Override public void setPropertyJSDocInfo(String propertyName, JSDocInfo info) {}
    @Override public JSType findPropertyType(String propertyName) { return null; }
    @Override public boolean hasProperty(String propertyName) { return false; }
    @Override public boolean hasOwnProperty(String propertyName) { return false; }
    @Override public boolean isPropertyTypeInferred(String propertyName) { return false; }
    @Override public boolean isPropertyTypeDeclared(String propertyName) { return false; }
    @Override public boolean hasOwnDeclaredProperty(String name) { return false; }
    @Override public boolean isPropertyInExterns(String propertyName) { return false; }
    @Override public int getPropertiesCount() { return 0; }
    @Override public Set<String> getPropertyNames() { return Collections.emptySet(); }
    @Override public JSType getParameterType() { return null; }
    @Override public JSType getIndexType() { return null; }
}

class MockObjectType extends BaseObjectType {
    private String name;
    private JSType propertyType = null;
    private String propertyName = null;
    private boolean propertyInferred = false;
    private Node propertyNode = null;
    private boolean resolved = false; // To simulate resolution state for ProxyObjectType
    private JSType referencedType = null; // For ProxyObjectType

    MockObjectType(JSTypeRegistry registry, String name) {
        super(registry);
        this.name = name;
    }

    @Override public String getReferenceName() { return name; }

    public void setProperty(String name, JSType type, boolean inferred, Node node) {
        this.propertyName = name;
        this.propertyType = type;
        this.propertyInferred = inferred;
        this.propertyNode = node;
    }

    @Override
    public JSType getPropertyType(String propertyName) {
        if (this.propertyName != null && this.propertyName.equals(propertyName)) {
            return propertyType;
        }
        return null;
    }

    @Override
    public boolean defineProperty(String propertyName, JSType type, boolean inferred, Node propertyNode) {
        // In a real ObjectType, this would add properties. Here, we just store the last one for simplicity.
        setProperty(propertyName, type, inferred, propertyNode);
        return true;
    }
    
    // Mock resolution state for ProxyObjectType behavior
    public boolean isResolved() { return resolved; }
    public void setResolved(boolean resolved) { this.resolved = resolved; }
    public JSType getReferencedTypeInternal() { return referencedType; }
    public void setReferencedAndResolvedType(JSType type, ErrorReporter t, StaticScope<JSType> enclosing) {
        this.referencedType = type;
        this.resolved = true;
    }
}

// Mock StaticSlot
class MockStaticSlot<T> implements StaticSlot<T> {
    private String name;
    private T type;
    private Node declaration = null; // Default

    MockStaticSlot(String name, T type) {
        this.name = name;
        this.type = type;
    }
    
    @Override public String getName() { return name; }
    @Override public T getType() { return type; }
    @Override public Node getDeclaration() { return declaration; }
    @Override public boolean isWhiteListed() { return false; }
    @Override public boolean isImplicit() { return false; }
    @Override public void setType(T type) { this.type = type; }
}

// Mock StaticScope
class MockStaticScope<T> implements StaticScope<T> {
    private StaticSlot<T> slot = null;
    private StaticScope<T> parentScope = null;

    public void setSlot(StaticSlot<T> slot) { this.slot = slot; }
    public void setParentScope(StaticScope<T> parentScope) { this.parentScope = parentScope; }

    @Override public Node getRootNode() { return null; }
    @Override public StaticScope<T> getParentScope() { return parentScope; }
    @Override public StaticSlot<T> getSlot(String name) { return slot; } // Simplified: only returns own slot
    @Override public JSType getTypeOfThis() { return null; }
}


public class NamedTypeTest {

    // Mock ErrorReporter for calls where it's needed but its output isn't tested.
    private final ErrorReporter MOCK_ERROR_REPORTER = new ErrorReporter() {
        @Override public void warning(String message, String sourceName, int line, int lineOffset) {}
        @Override public void error(String message, String sourceName, int line, int lineOffset) {}
    };

    // Helper to create a basic JSTypeRegistry
    private JSTypeRegistry createRegistry() {
        return new MockJSTypeRegistry();
    }
    
    // Helper to create a StaticScope
    private StaticScope<JSType> createScope() {
        return new MockStaticScope<>();
    }
    
    @Test
    public void testConstructorAndInitialState() throws Exception {
        JSTypeRegistry registry = createRegistry();
        NamedType namedType = new NamedType(registry, "my.Type", "source.js", 1, 2);

        // NamedType itself does not have isResolved(). ProxyObjectType does.
        // We can test this indirectly by checking if getReferencedType() is null.
        assertNull(namedType.getReferencedType()); 
        assertEquals("my.Type", namedType.getReferenceName());
        assertEquals("my.Type", namedType.toStringHelper(false)); // Assuming toStringHelper is accessible or we mock it.
        assertTrue(namedType.hasReferenceName());
        assertFalse(namedType.isNominalType()); 
        // `validator` is private, we can't directly access it to check if null.
        // However, `setValidator` returns true, implying initial state is valid for setting.
    }

    @Test
    public void testDefinePropertyOnUnresolvedType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        NamedType namedType = new NamedType(registry, "unresolved.Type", "source.js", 1, 2);
        UnknownType unknownType = new UnknownType(registry);
        Node propNode = new Node(Node.STRING_NODE, "value");

        // In NamedType, defineProperty on unresolved type adds to propertyContinuations.
        // The method should return true. We cannot assert on private fields directly.
        assertTrue(namedType.defineProperty("myProp", unknownType, false, propNode));
    }
    
    @Test
    public void testResolveInternal_resolveViaRegistry_success() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType knownType = new MockObjectType(registry, "KnownType");
        
        MockJSTypeRegistry mockRegistry = new MockJSTypeRegistry() {
            @Override public JSType getType(String reference) { return knownType; }
            @Override public boolean isLastGeneration() { return true; }
            @Override public JSType getNativeObjectType(JSTypeNative typeId) { return new UnknownType(this); }
        };

        NamedType namedType = new NamedType(mockRegistry, "known.Type", "source.js", 1, 2);
        StaticScope<JSType> scope = createScope();
        
        JSType resolvedType = namedType.resolveInternal(MOCK_ERROR_REPORTER, scope);
        
        assertEquals(knownType, namedType.getReferencedType());
        assertEquals(knownType, resolvedType);
        // The superclass `ProxyObjectType` has `isResolved()`. We can test it if we have a concrete instance.
        // Here we rely on `getReferencedType()` not being null as an indicator.
        assertTrue(namedType.isResolved()); 
    }

    @Test
    public void testResolveInternal_resolveViaRegistry_failsThenViaProperties() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType knownObject = new MockObjectType(registry, "ResolvedViaProperties");
        
        MockJSTypeRegistry mockRegistry = new MockJSTypeRegistry() {
            @Override public JSType getType(String reference) { return null; } // Fails registry lookup
            @Override public boolean isLastGeneration() { return true; }
            @Override public JSType getNativeObjectType(JSTypeNative typeId) { return new UnknownType(this); }
        };

        MockStaticScope<JSType> mockScope = new MockStaticScope<>();
        ObjectType firstPartType = new MockObjectType(mockRegistry, "MyType");
        mockScope.setSlot(new MockStaticSlot<>("my", firstPartType));

        NamedType namedType = new NamedType(mockRegistry, "my.ResolvedViaProperties", "source.js", 1, 2);
        
        ((MockObjectType)firstPartType).setProperty("ResolvedViaProperties", knownObject, false, new Node(Node.STRING_NODE));

        JSType resolvedType = namedType.resolveInternal(MOCK_ERROR_REPORTER, mockScope);

        assertEquals(knownObject, namedType.getReferencedType());
        assertEquals(knownObject, resolvedType);
        assertTrue(namedType.isResolved());
    }
    
    @Test
    public void testResolveInternal_cycleDetected() throws Exception {
        // This test simulates the *outcome* of a cycle detection.
        // Directly mocking `detectInheritanceCycle` or `handleTypeCycle` is complex.
        // The `handleTypeCycle` method sets the referenced type to `UNKNOWN_TYPE`.
        // We will create a scenario that leads to `handleTypeCycle` being called,
        // and then assert the expected state.
        
        JSTypeRegistry registry = createRegistry();
        
        // Mock registry to return null for getType, forcing path through properties.
        MockJSTypeRegistry mockRegistry = new MockJSTypeRegistry() {
            @Override public JSType getType(String reference) { return null; }
            @Override public boolean isLastGeneration() { return true; }
            @Override public JSType getNativeObjectType(JSTypeNative typeId) { 
                if (typeId == JSTypeNative.UNKNOWN_TYPE) return new UnknownType(this);
                return super.getNativeObjectType(typeId);
            }
        };

        NamedType namedType = new NamedType(mockRegistry, "cyclic.Type", "source.js", 1, 2);
        
        // To trigger cycle detection, we need a scenario where a type references itself.
        // This typically happens with complex inheritance or recursive type definitions.
        // For this mock test, we'll use a simplified approach by directly manipulating
        // the state *as if* `handleTypeCycle` was called.
        // In `resolveInternal`, `handleTypeCycle` is called after `super.resolveInternal(t, enclosing)`
        // or after `resolveViaProperties`.

        // If `super.resolveInternal` were to trigger `detectInheritanceCycle` and return true,
        // `handleTypeCycle` would be called, setting `referencedType` to `UNKNOWN_TYPE`.
        // We cannot directly mock `super.resolveInternal`'s behavior.

        // The closest we can do is to ensure `handleUnresolvedType` is called, which sets to `NO_RESOLVED_TYPE`,
        // or to mock a type that would lead to `handleTypeCycle`.
        
        // Let's attempt to mock the `lookupViaProperties` to return a type that causes a cycle.
        // This is difficult without actual `EnumType` or `EnumElementType` setup.

        // For now, we focus on `handleUnresolvedType` which is more directly testable.
        // The logic for `UNKNOWN_TYPE` from cycle detection is:
        // `setReferencedType(registry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE));`
        // and `setResolvedTypeInternal(getReferencedType());`

        // Let's simulate the state after `handleTypeCycle` is called, assuming it sets `referencedType`.
        // This is a pragmatic approach given mocking limitations.
        
        // We will test the path that leads to `handleUnresolvedType` and sets `NO_RESOLVED_TYPE`
        // in `testResolveInternal_handleUnresolvedType_warning`.
        // For `UNKNOWN_TYPE` from cycle, we can only describe the expected behavior.
        
        // To make this test pass with current mocks, we can force the state.
        // This is not ideal, but demonstrates the expected outcome.
        // In a real scenario, a complex type graph would trigger this.
        
        // The `resolveInternal` method has logic like:
        // if (detectInheritanceCycle()) { handleTypeCycle(t); }
        // This call occurs after `resolveViaRegistry` and `resolveViaProperties`.
        
        // If we assume `resolveViaProperties` fails to find a type, and `super.resolveInternal` 
        // returns true for `detectInheritanceCycle`, then `handleTypeCycle` is called.
        
        // Let's assume a scenario where `lookupViaProperties` returns a type that, when `super.resolveInternal`
        // is called on it, `detectInheritanceCycle` returns true.
        // This is hard to mock directly.
        
        // Instead, we will test the outcome of `handleTypeCycle` indirectly.
        // The `NamedType` `resolveInternal` calls `super.resolveInternal(t, enclosing)` twice.
        // If `detectInheritanceCycle` returns true during these calls, `handleTypeCycle` is invoked.
        // `handleTypeCycle` sets `referencedType` to `UNKNOWN_TYPE`.
        
        // To make this pass, we'll mock the `JSTypeRegistry` to return `UNKNOWN_TYPE`.
        // This is a proxy for the actual cycle detection mechanism.
        
        JSType expectedUnknownType = mockRegistry.getNativeObjectType(JSTypeNative.UNKNOWN_TYPE);
        
        // We need to find a way to call `handleTypeCycle`.
        // This can be triggered if `detectInheritanceCycle()` returns true.
        // This is usually called on `super.resolveInternal(t, enclosing)`.
        
        // Let's rely on the `NamedType.resolveInternal` logic.
        // If `resolveViaRegistry` fails, and `resolveViaProperties` fails.
        // Then `super.resolveInternal(t, enclosing)` is called. If this call
        // results in `detectInheritanceCycle()` returning true, `handleTypeCycle` is called.
        
        // The test `testResolveInternal_handleUnresolvedType_warning` covers the fallback.
        // For this cycle test, we ensure `UNKNOWN_TYPE` is the result.
        
        // We can bypass `resolveViaRegistry` and `resolveViaProperties` if we mock `super.resolveInternal`.
        // But we want to test `NamedType`'s logic.
        
        // For this test, let's assume the path that results in `handleTypeCycle` being called.
        // The output of `handleTypeCycle` is to set `referencedType` to `UNKNOWN_TYPE`.
        
        // Let's construct a scenario where `resolveViaProperties` returns a type that has a cycle.
        // This requires more detailed mocks of `ObjectType`.
        
        // Given the constraints, we will assert the expected state of `referencedType` after resolution.
        // If `handleTypeCycle` was called, `referencedType` becomes `UNKNOWN_TYPE`.
        
        // We simulate this by making `getReferencedType()` return `UNKNOWN_TYPE` after `resolveInternal`.
        // This is a placeholder for actual cycle detection.
        
        // If `resolveViaRegistry` fails, `resolveViaProperties` is called.
        // If `lookupViaProperties` returns null, `handleUnresolvedType` is called.
        // This leads to `NO_RESOLVED_TYPE`.
        
        // If `lookupViaProperties` returns an `ObjectType`, and `detectInheritanceCycle()` on that type is true,
        // then `handleTypeCycle` is called.
        
        // Let's force `UNKNOWN_TYPE` as the final resolved type to represent cycle outcome.
        // This is a simplification.
        
        // The most reliable way to test this with mocks is to create a mock that
        // returns `UNKNOWN_TYPE` from `getReferencedType()` after resolution.
        // The actual trigger for `handleTypeCycle` is complex to mock.
        
        // We'll test the outcome, assuming `handleTypeCycle` results in `UNKNOWN_TYPE`.
        NamedType namedTypeForCycle = new NamedType(mockRegistry, "cycle.ref", "source.js", 1, 2);
        
        // Mock a type that would cause a cycle.
        MockObjectType cycleType = new MockObjectType(mockRegistry, "CycleType") {
            // Force detection of a cycle. This is a simplification.
            @Override
            public boolean detectInheritanceCycle() { return true; }
        };
        
        // Set up scope and property to return this cycleType.
        MockStaticScope<JSType> mockScope = new MockStaticScope<>();
        ObjectType firstPartType = new MockObjectType(mockRegistry, "CyclePart");
        mockScope.setSlot(new MockStaticSlot<>("cycle", firstPartType));
        ((MockObjectType)firstPartType).setProperty("cycle", cycleType, false, new Node(Node.STRING_NODE));

        // `resolveInternal` calls `super.resolveInternal` which would then call `detectInheritanceCycle`.
        // We need to ensure `super.resolveInternal` is called on `cycleType`.
        
        // The `NamedType.resolveInternal` calls `super.resolveInternal` which is `ProxyObjectType.resolveInternal`.
        // ProxyObjectType.resolveInternal calls `getReferencedObjTypeInternal()`, which is `cycleType`.
        // Then it calls `cycleType.detectInheritanceCycle()`.
        
        // So the setup above should work if `cycleType` is correctly returned.
        JSType resolvedType = namedTypeForCycle.resolveInternal(MOCK_ERROR_REPORTER, mockScope);
        
        // The `handleTypeCycle` method is called inside `resolveInternal`.
        // It sets `referencedType` to `UNKNOWN_TYPE`.
        assertEquals(expectedUnknownType, namedTypeForCycle.getReferencedType());
        assertEquals(expectedUnknownType, resolvedType); // `resolveInternal` returns `getReferencedType()` in this case.
        assertTrue(namedTypeForCycle.isResolved());
    }

    @Test
    public void testResolveInternal_handleUnresolvedType_warning() throws Exception {
        JSTypeRegistry registry = createRegistry();
        
        MockJSTypeRegistry mockRegistry = new MockJSTypeRegistry() {
            @Override public JSType getType(String reference) { return null; } 
            @Override public boolean isLastGeneration() { return true; }
            @Override public boolean isForwardDeclaredType(String reference) { return false; }
            @Override public JSType getNativeObjectType(JSTypeNative typeId) { 
                if (typeId == JSTypeNative.NO_RESOLVED_TYPE) return new NoResolvedType(this);
                return super.getNativeObjectType(typeId); 
            }
        };

        NamedType namedType = new NamedType(mockRegistry, "unresolved.Ref", "source.js", 1, 2);
        StaticScope<JSType> scope = createScope();

        JSType resolvedType = namedType.resolveInternal(MOCK_ERROR_REPORTER, scope);

        assertEquals(mockRegistry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), namedType.getReferencedType());
        assertEquals(mockRegistry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), resolvedType);
        assertTrue(namedType.isResolved());
    }

    @Test
    public void testResolveInternal_handleUnresolvedType_forwardDeclared() throws Exception {
        JSTypeRegistry registry = createRegistry();
        
        MockJSTypeRegistry mockRegistry = new MockJSTypeRegistry() {
            @Override public JSType getType(String reference) { return null; }
            @Override public boolean isLastGeneration() { return true; }
            @Override public boolean isForwardDeclaredType(String reference) { return true; } 
            @Override public JSType getNativeObjectType(JSTypeNative typeId) { 
                if (typeId == JSTypeNative.NO_RESOLVED_TYPE) return new NoResolvedType(this);
                return super.getNativeObjectType(typeId); 
            }
        };

        NamedType namedType = new NamedType(mockRegistry, "forward.Ref", "source.js", 1, 2);
        StaticScope<JSType> scope = createScope();

        JSType resolvedType = namedType.resolveInternal(MOCK_ERROR_REPORTER, scope);

        assertEquals(mockRegistry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), namedType.getReferencedType());
        assertEquals(mockRegistry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), resolvedType);
        assertTrue(namedType.isResolved());
    }

    @Test
    public void testResolveInternal_handleUnresolvedType_notLastGeneration() throws Exception {
        JSTypeRegistry registry = createRegistry();
        
        MockJSTypeRegistry mockRegistry = new MockJSTypeRegistry() {
            @Override public JSType getType(String reference) { return null; }
            @Override public boolean isLastGeneration() { return false; } 
            @Override public JSType getNativeObjectType(JSTypeNative typeId) { return new UnknownType(this); }
        };

        NamedType namedType = new NamedType(mockRegistry, "intermediate.Ref", "source.js", 1, 2);
        StaticScope<JSType> scope = createScope();

        JSType resolvedType = namedType.resolveInternal(MOCK_ERROR_REPORTER, scope);

        assertNull(namedType.getReferencedType());
        assertEquals(namedType, resolvedType); 
        assertFalse(namedType.isResolved()); 
    }

    @Test
    public void testResolveInternal_finishPropertyContinuations() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType knownType = new MockObjectType(registry, "TargetType");
        
        MockJSTypeRegistry mockRegistry = new MockJSTypeRegistry() {
            @Override public JSType getType(String reference) { return knownType; }
            @Override public boolean isLastGeneration() { return true; }
            @Override public JSType getNativeObjectType(JSTypeNative typeId) { return new UnknownType(this); }
        };

        NamedType namedType = new NamedType(mockRegistry, "type.WithProps", "source.js", 1, 2);
        UnknownType propType = new UnknownType(mockRegistry);
        Node propNode = new Node(Node.STRING_NODE, "value");

        namedType.defineProperty("myProp", propType, false, propNode);
        
        StaticScope<JSType> scope = createScope();
        namedType.resolveInternal(MOCK_ERROR_REPORTER, scope);

        assertTrue(namedType.isResolved());
        // Cannot directly assert propertyContinuations is null, but test implies it's handled.
    }
    
    @Test
    public void testGetReferencedType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        NamedType namedType = new NamedType(registry, "ref.Type", "source.js", 1, 2);
        
        assertNull(namedType.getReferencedType()); 
        
        ObjectType resolved = new MockObjectType(registry, "ResolvedType");
        
        MockJSTypeRegistry mockRegistry = new MockJSTypeRegistry() {
            @Override public JSType getType(String reference) { return resolved; }
            @Override public boolean isLastGeneration() { return true; }
            @Override public JSType getNativeObjectType(JSTypeNative typeId) { return new UnknownType(this); }
        };
        
        NamedType namedTypeResolved = new NamedType(mockRegistry, "ref.Type", "source.js", 1, 2);
        namedTypeResolved.resolveInternal(MOCK_ERROR_REPORTER, createScope());
        
        assertEquals(resolved, namedTypeResolved.getReferencedType());
    }

    @Test
    public void testGetReferenceName() throws Exception {
        JSTypeRegistry registry = createRegistry();
        NamedType namedType = new NamedType(registry, "my.Reference", "source.js", 1, 2);
        assertEquals("my.Reference", namedType.getReferenceName());

        NamedType anotherNamedType = new NamedType(registry, "another.Type", "file.js", 10, 5);
        assertEquals("another.Type", anotherNamedType.getReferenceName());
    }

    @Test
    public void testHasReferenceName() throws Exception {
        JSTypeRegistry registry = createRegistry();
        NamedType namedType = new NamedType(registry, "has.Name", "source.js", 1, 2);
        assertTrue(namedType.hasReferenceName());
    }

    @Test
    public void testIsNominalType() {
        JSTypeRegistry registry = createRegistry();
        NamedType namedType = new NamedType(registry, "nominal.Type", "source.js", 1, 2);
        assertFalse(namedType.isNominalType());
    }

    @Test
    public void testHashCode() {
        JSTypeRegistry registry = createRegistry();
        NamedType type1 = new NamedType(registry, "type.A", "source1.js", 1, 1);
        NamedType type2 = new NamedType(registry, "type.A", "source2.js", 2, 2); 
        NamedType type3 = new NamedType(registry, "type.B", "source1.js", 1, 1);

        assertEquals(type1.hashCode(), type2.hashCode()); 
        assertNotEquals(type1.hashCode(), type3.hashCode());
    }

    @Test
    public void testSetValidator_resolvedType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType unknownAsKnownType = new UnknownType(registry); // This matches the predicate
        
        MockJSTypeRegistry mockRegistry = new MockJSTypeRegistry() {
            @Override public JSType getType(String reference) { return unknownAsKnownType; }
            @Override public boolean isLastGeneration() { return true; }
            @Override public JSType getNativeObjectType(JSTypeNative typeId) { return new UnknownType(this); }
        };

        NamedType namedType = new NamedType(mockRegistry, "validatable.Type", "source.js", 1, 2);
        namedType.resolveInternal(MOCK_ERROR_REPORTER, createScope()); 

        Predicate<JSType> validator = new Predicate<JSType>() {
            @Override
            public boolean apply(JSType input) {
                return input != null && input.isUnknownType(); 
            }
        };
        
        assertTrue(namedType.setValidator(validator)); 
        assertNull(namedType.getValidator()); // Validator is cleared after application.
    }

    @Test
    public void testSetValidator_unresolvedType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        NamedType namedType = new NamedType(registry, "unresolved.Validator", "source.js", 1, 2);
        
        Predicate<JSType> validator = new Predicate<JSType>() {
            @Override
            public boolean apply(JSType input) {
                return input != null;
            }
        };
        
        assertTrue(namedType.setValidator(validator));
        // Cannot directly assert private field `validator`. Rely on `setValidator` return value.
    }

    @Test
    public void testSetValidator_appliedOnResolution() throws Exception {
        JSTypeRegistry registry = createRegistry();
        ObjectType resolvedTargetType = new MockObjectType(registry, "TargetType");

        MockJSTypeRegistry mockRegistry = new MockJSTypeRegistry() {
            private JSType typeToReturn = null;
            public void setTypeToReturn(JSType type) { this.typeToReturn = type; }
            @Override public JSType getType(String reference) { return typeToReturn; }
            @Override public boolean isLastGeneration() { return true; }
            @Override public JSType getNativeObjectType(JSTypeNative typeId) { return new UnknownType(this); }
        };

        NamedType namedType = new NamedType(mockRegistry, "resolve.with.validator", "source.js", 1, 2);
        
        Predicate<JSType> validator = new Predicate<JSType>() {
            @Override
            public boolean apply(JSType input) {
                return input == resolvedTargetType;
            }
        };
        
        assertTrue(namedType.setValidator(validator)); 

        mockRegistry.setTypeToReturn(resolvedTargetType);
        StaticScope<JSType> scope = createScope();
        namedType.resolveInternal(MOCK_ERROR_REPORTER, scope);

        assertNull(namedType.getValidator());
        assertEquals(resolvedTargetType, namedType.getReferencedType());
        assertTrue(namedType.isResolved());
    }

    @Test
    public void testToStringHelper_forAnnotations() {
        JSTypeRegistry registry = createRegistry();
        NamedType namedType = new NamedType(registry, "my.AnnotationType", "source.js", 1, 2);
        assertEquals("my.AnnotationType", namedType.toStringHelper(true));
    }
    
    @Test
    public void testToStringHelper_notForAnnotations() {
        JSTypeRegistry registry = createRegistry();
        NamedType namedType = new NamedType(registry, "my.NormalType", "source.js", 1, 2);
        assertEquals("my.NormalType", namedType.toStringHelper(false));
    }
    
    @Test
    public void testConstructor_nullReference() {
        JSTypeRegistry registry = createRegistry();
        try {
            new NamedType(registry, null, "source.js", 1, 2);
            fail("Expected NullPointerException for null reference");
        } catch (NullPointerException e) {
            // Expected exception.
        }
    }
    
    @Test
    public void testResolveInternal_resolveViaProperties_functionType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        
        ObjectType instanceType = new MockObjectType(registry, "MyInstanceType");
        MockFunctionType funcType = new MockFunctionType(registry, instanceType, true, false); // isConstructor = true
        
        MockJSTypeRegistry mockRegistry = new MockJSTypeRegistry() {
            @Override public JSType getType(String reference) { return null; }
            @Override public boolean isLastGeneration() { return true; }
            @Override public JSType getNativeObjectType(JSTypeNative typeId) { return new UnknownType(this); }
        };

        NamedType namedType = new NamedType(mockRegistry, "my.Constructor", "source.js", 1, 2);
        
        MockStaticScope<JSType> mockScope = new MockStaticScope<>();
        ObjectType firstPartType = new MockObjectType(mockRegistry, "MyType");
        mockScope.setSlot(new MockStaticSlot<>("my", firstPartType));
        
        ((MockObjectType)firstPartType).setProperty("Constructor", funcType, false, new Node(Node.STRING_NODE));

        JSType resolvedType = namedType.resolveInternal(MOCK_ERROR_REPORTER, mockScope);
        
        assertEquals(instanceType, namedType.getReferencedType());
        assertEquals(instanceType, resolvedType);
        assertTrue(namedType.isResolved());
    }
    
    @Test
    public void testResolveInternal_resolveViaProperties_noObjectType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        NoObjectType noObject = new NoObjectType(registry);

        MockJSTypeRegistry mockRegistry = new MockJSTypeRegistry() {
            @Override public JSType getType(String reference) { return null; }
            @Override public boolean isLastGeneration() { return true; }
            @Override public JSType getNativeObjectType(JSTypeNative typeId) { 
                if (typeId == JSTypeNative.NO_OBJECT_TYPE) return noObject;
                return super.getNativeObjectType(typeId); 
            }
            @Override public FunctionType getNativeFunctionType(JSTypeNative typeId) {
                if (typeId == JSTypeNative.NO_OBJECT_TYPE) {
                    return new MockFunctionType(this, noObject, false, false);
                }
                return super.getNativeFunctionType(typeId);
            }
        };

        NamedType namedType = new NamedType(mockRegistry, "my.NoObject", "source.js", 1, 2);
        
        MockStaticScope<JSType> mockScope = new MockStaticScope<>();
        ObjectType firstPartType = new MockObjectType(mockRegistry, "MyType");
        mockScope.setSlot(new MockStaticSlot<>("my", firstPartType));
        
        ((MockObjectType)firstPartType).setProperty("NoObject", noObject, false, new Node(Node.STRING_NODE));

        JSType resolvedType = namedType.resolveInternal(MOCK_ERROR_REPORTER, mockScope);
        
        assertEquals(noObject, namedType.getReferencedType());
        assertEquals(noObject, resolvedType);
        assertTrue(namedType.isResolved());
    }
    
    @Test
    public void testResolveInternal_resolveViaProperties_enumType() throws Exception {
        JSTypeRegistry registry = createRegistry();
        
        EnumType enumType = new EnumType(registry, new UnknownType(registry)); 
        
        MockJSTypeRegistry mockRegistry = new MockJSTypeRegistry() {
            @Override public JSType getType(String reference) { return null; }
            @Override public boolean isLastGeneration() { return true; }
            @Override public JSType getNativeObjectType(JSTypeNative typeId) { return new UnknownType(this); }
        };

        NamedType namedType = new NamedType(mockRegistry, "my.Enum", "source.js", 1, 2);
        
        MockStaticScope<JSType> mockScope = new MockStaticScope<>();
        ObjectType firstPartType = new MockObjectType(mockRegistry, "MyType");
        mockScope.setSlot(new MockStaticSlot<>("my", firstPartType));
        
        ((MockObjectType)firstPartType).setProperty("Enum", enumType, false, new Node(Node.STRING_NODE));

        JSType resolvedType = namedType.resolveInternal(MOCK_ERROR_REPORTER, mockScope);
        
        assertEquals(enumType.getElementsType(), namedType.getReferencedType());
        assertEquals(enumType.getElementsType(), resolvedType);
        assertTrue(namedType.isResolved());
    }

    @Test
    public void testLookupViaProperties_nullSlot() {
        JSTypeRegistry registry = createRegistry();
        NamedType namedType = new NamedType(registry, "nonexistent.Type", "source.js", 1, 2);
        StaticScope<JSType> scope = createScope(); // Scope where getSlot returns null.
        
        JSType resolvedType = namedType.resolveInternal(MOCK_ERROR_REPORTER, scope);
        
        assertTrue(namedType.isResolved());
        assertEquals(registry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), namedType.getReferencedType());
        assertEquals(registry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), resolvedType);
    }
    
    @Test
    public void testLookupViaProperties_nullSlotType() {
        JSTypeRegistry registry = createRegistry();
        
        MockStaticSlot<JSType> slot = new MockStaticSlot<>("nullTypeSlot", null);
        MockStaticScope<JSType> scope = new MockStaticScope<>();
        scope.setSlot(slot);
        
        NamedType namedType = new NamedType(registry, "nullTypeSlot.Type", "source.js", 1, 2);
        
        JSType resolvedType = namedType.resolveInternal(MOCK_ERROR_REPORTER, scope);
        
        assertTrue(namedType.isResolved());
        assertEquals(registry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), namedType.getReferencedType());
        assertEquals(registry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), resolvedType);
    }

    @Test
    public void testLookupViaProperties_nullPropertyType() {
        JSTypeRegistry registry = createRegistry();
        
        MockObjectType nullPropTypeObject = new MockObjectType(registry, "NullPropTypeObject") {
            @Override
            public JSType getPropertyType(String propertyName) {
                return null; 
            }
        };
        
        MockStaticSlot<JSType> slot = new MockStaticSlot<>("obj", nullPropTypeObject);
        MockStaticScope<JSType> scope = new MockStaticScope<>();
        scope.setSlot(slot);
        
        NamedType namedType = new NamedType(registry, "obj.nonexistentProp", "source.js", 1, 2);
        
        JSType resolvedType = namedType.resolveInternal(MOCK_ERROR_REPORTER, scope);
        
        assertTrue(namedType.isResolved());
        assertEquals(registry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), namedType.getReferencedType());
        assertEquals(registry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), resolvedType);
    }

    @Test
    public void testLookupViaProperties_emptyComponentName() {
        JSTypeRegistry registry = createRegistry();
        NamedType namedType = new NamedType(registry, "my.", "source.js", 1, 2); 
        StaticScope<JSType> scope = createScope();
        
        JSType resolvedType = namedType.resolveInternal(MOCK_ERROR_REPORTER, scope);
        
        assertTrue(namedType.isResolved());
        assertEquals(registry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), namedType.getReferencedType());
        assertEquals(registry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), resolvedType);
    }
    
    @Test
    public void testLookupViaProperties_leadingDot() {
        JSTypeRegistry registry = createRegistry();
        NamedType namedType = new NamedType(registry, ".invalid", "source.js", 1, 2); 
        StaticScope<JSType> scope = createScope();
        
        JSType resolvedType = namedType.resolveInternal(MOCK_ERROR_REPORTER, scope);
        
        assertTrue(namedType.isResolved());
        assertEquals(registry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), namedType.getReferencedType());
        assertEquals(registry.getNativeObjectType(JSTypeNative.NO_RESOLVED_TYPE), resolvedType);
    }
}
