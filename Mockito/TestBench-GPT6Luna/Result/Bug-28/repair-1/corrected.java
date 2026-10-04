package org.mockito.internal.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.exceptions.Reporter;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.configuration.injection.FinalMockCandidateFilter;
import org.mockito.internal.configuration.injection.MockCandidateFilter;
import org.mockito.internal.configuration.injection.NameBasedCandidateFilter;
import org.mockito.internal.configuration.injection.TypeBasedCandidateFilter;
import org.mockito.internal.util.reflection.FieldInitializer;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class DefaultInjectionEngineTest {
    public static class Parent {
        Object parentDependency;
    }

    public static class Child extends Parent {
        Object childDependency;
    }

    public static class TestSubject {
        @org.mockito.InjectMocks
        Child subject;
    }

    public static class SingleDependencySubject {
        @org.mockito.InjectMocks
        DependencyTarget subject;
    }

    public static class DependencyTarget {
        Object dependency;
    }

    @Test
    public void testInjectsMatchingMockIntoInitializedField() throws Exception {
        SingleDependencySubject owner = new SingleDependencySubject();
        Object mock = new Object();
        Set<Field> fields = new HashSet<Field>();
        fields.add(SingleDependencySubject.class.getDeclaredField("subject"));
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mock);

        new DefaultInjectionEngine().injectMocksOnFields(fields, mocks, owner);

        assertNotNull(owner.subject);
        assertSame(mock, owner.subject.dependency);
    }

    @Test
    public void testInjectsMocksIntoFieldsAcrossHierarchy() throws Exception {
        TestSubject owner = new TestSubject();
        Object child = new Object();
        Object parent = new Object();
        Set<Field> fields = new HashSet<Field>();
        fields.add(TestSubject.class.getDeclaredField("subject"));
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(child);
        mocks.add(parent);

        new DefaultInjectionEngine().injectMocksOnFields(fields, mocks, owner);

        assertNotNull(owner.subject);
        assertSame(child, owner.subject.childDependency);
        assertSame(parent, owner.subject.parentDependency);
    }

    @Test
    public void testDoesNotInjectWhenNoCandidateExists() throws Exception {
        SingleDependencySubject owner = new SingleDependencySubject();
        Set<Field> fields = new HashSet<Field>();
        fields.add(SingleDependencySubject.class.getDeclaredField("subject"));

        new DefaultInjectionEngine().injectMocksOnFields(fields, new HashSet<Object>(), owner);

        assertNotNull(owner.subject);
        assertNull(owner.subject.dependency);
    }

    @Test
    public void testCompareAssignableTypesInSupertypeOrder() throws Exception {
        Field parent = Parent.class.getDeclaredField("parentDependency");
        Field child = Child.class.getDeclaredField("childDependency");

        assertEquals(-1, compareByFieldType(parent, child));
        assertEquals(1, compareByFieldType(child, parent));
    }

    @Test
    public void testCompareEqualFieldTypes() throws Exception {
        Field first = DependencyTarget.class.getDeclaredField("dependency");
        Field second = AnotherObjectHolder.class.getDeclaredField("value");

        assertEquals(0, compareByFieldType(first, second));
        assertEquals(0, compareByFieldType(second, first));
    }

    @Test
    public void testCompareUnrelatedFieldTypes() throws Exception {
        Field text = StringHolder.class.getDeclaredField("value");
        Field number = IntegerHolder.class.getDeclaredField("value");

        assertEquals(0, compareByFieldType(text, number));
        assertEquals(0, compareByFieldType(number, text));
    }

    public static class StringHolder {
        String value;
    }

    public static class IntegerHolder {
        Integer value;
    }

    @Test
    public void testCompareInterfaceAndImplementingType() throws Exception {
        Field interfaceField = InterfaceHolder.class.getDeclaredField("value");
        Field implementationField = ImplementationHolder.class.getDeclaredField("value");

        assertEquals(-1, compareByFieldType(interfaceField, implementationField));
        assertEquals(1, compareByFieldType(implementationField, interfaceField));
    }

    public interface Marker {
    }

    public static class Implementation implements Marker {
    }

    public static class InterfaceHolder {
        Marker value;
    }

    public static class ImplementationHolder {
        Implementation value;
    }

    @Test
    public void testSameClassFieldComparisonIsZero() throws Exception {
        Field first = DependencyTarget.class.getDeclaredField("dependency");
        Field second = AnotherObjectHolder.class.getDeclaredField("value");

        assertEquals(0, compareByFieldType(first, second));
    }

    public static class AnotherObjectHolder {
        Object value;
    }

    @Test
    public void testInjectMocksOnEmptyFieldSetLeavesOwnerUnchanged() throws Exception {
        SingleDependencySubject owner = new SingleDependencySubject();

        new DefaultInjectionEngine().injectMocksOnFields(new HashSet<Field>(),
                new HashSet<Object>(), owner);

        assertNull(owner.subject);
    }

    @Test
    public void testInjectionUsesExistingInjectMocksInstance() throws Exception {
        SingleDependencySubject owner = new SingleDependencySubject();
        owner.subject = new DependencyTarget();
        DependencyTarget original = owner.subject;
        Object mock = new Object();
        Set<Field> fields = new HashSet<Field>();
        fields.add(SingleDependencySubject.class.getDeclaredField("subject"));
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mock);

        new DefaultInjectionEngine().injectMocksOnFields(fields, mocks, owner);

        assertSame(original, owner.subject);
        assertSame(mock, owner.subject.dependency);
    }

    @Test
    public void testDistinctCandidatesInjectIntoDistinctFields() throws Exception {
        TestSubject owner = new TestSubject();
        Object first = new Object();
        Object second = new Object();
        Set<Field> fields = new HashSet<Field>();
        fields.add(TestSubject.class.getDeclaredField("subject"));
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(first);
        mocks.add(second);

        new DefaultInjectionEngine().injectMocksOnFields(fields, mocks, owner);

        assertTrue((owner.subject.childDependency == first
                && owner.subject.parentDependency == second)
                || (owner.subject.childDependency == second
                && owner.subject.parentDependency == first));
    }

    @Test
    public void testInjectionDoesNotAlterMockSet() throws Exception {
        SingleDependencySubject owner = new SingleDependencySubject();
        Object mock = new Object();
        Set<Field> fields = new HashSet<Field>();
        fields.add(SingleDependencySubject.class.getDeclaredField("subject"));
        Set<Object> mocks = new HashSet<Object>();
        mocks.add(mock);

        new DefaultInjectionEngine().injectMocksOnFields(fields, mocks, owner);

        assertEquals(1, mocks.size());
        assertTrue(mocks.contains(mock));
    }

    private int compareByFieldType(Field first, Field second) {
        Class<?> firstType = first.getType();
        Class<?> secondType = second.getType();

        if (firstType.isAssignableFrom(secondType)) {
            return 1;
        }
        if (secondType.isAssignableFrom(firstType)) {
            return -1;
        }
        return 0;
    }
}
