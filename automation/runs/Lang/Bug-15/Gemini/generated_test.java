package org.apache.commons.lang3.reflect;

import org.junit.Test;
import static org.junit.Assert.*;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public class TypeUtilsDefectTest_Lang15 {

    // Helper classes for testing generic type assignability with type variables
    public static class StringListParent<T> {
        public T value;
    }

    public static class ChildWithVariable<E> extends StringListParent<E> {
    }

    public static class ConcreteStringChild extends ChildWithVariable<String> {
    }

    // Generic interface hierarchy
    public interface GenericInterface<T> {
    }

    public static class IntermediateClass<T> implements GenericInterface<T> {
    }

    public static class FinalClass extends IntermediateClass<String> {
    }

    @Test
    public void testIsAssignableParameterizedWithChainedTypeVariables() throws Exception {
        // Subject type: ChildWithVariable<E> extended or parameterized
        Type subjectType = ChildWithVariable.class.getGenericSuperclass();
        // Target type: StringListParent<String> via a parameterized type representation
        ParameterizedType targetType = (ParameterizedType) ConcreteStringChild.class.getGenericSuperclass().getGenericSuperclass();
        
        // Alternatively, construct/obtain a parameterized type with type variable mapping
        Type parentGenericSuper = ChildWithVariable.class.getField("value").getGenericType();
        
        // Test assignability where type variables need unrolling
        boolean assignable = TypeUtils.isAssignable(ConcreteStringChild.class, StringListParent.class);
        assertTrue(assignable);
    }

    @Test
    public void testIsAssignableParameterizedInterfaceHierarchy() throws Exception {
        // Test assignability of FinalClass to GenericInterface<String>
        Type targetType = FinalClass.class.getGenericInterfaces()[0];
        
        // Using TypeUtils.isAssignable with parameterized types
        boolean result = TypeUtils.isAssignable(FinalClass.class, targetType);
        assertTrue("FinalClass should be assignable to GenericInterface<String>", result);
    }

    @Test
    public void testIsAssignableWithInheritedTypeVariables() throws Exception {
        // Create scenarios where type variables are passed up and need unrolling
        Class<?> subclass = FinalClass.class;
        Type superType = IntermediateClass.class.getGenericInterfaces()[0];
        
        Map<TypeVariable<?>, Type> typeargs = TypeUtils.getTypeArguments(subclass, IntermediateClass.class);
        assertNotNull(typeargs);
        
        boolean assignable = TypeUtils.isAssignable(subclass, IntermediateClass.class);
        assertTrue(assignable);
    }
}
