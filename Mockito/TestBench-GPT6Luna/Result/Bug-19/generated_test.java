package org.mockito.internal.configuration.injection.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.internal.configuration.injection.PropertyAndSetterInjection;
import org.mockito.exceptions.Reporter;
import org.mockito.internal.util.reflection.BeanPropertySetter;
import org.mockito.internal.util.reflection.FieldSetter;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import org.mockito.internal.util.MockUtil;
import java.util.ArrayList;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.configuration.injection.filter.FinalMockCandidateFilter;
import org.mockito.internal.configuration.injection.filter.MockCandidateFilter;
import org.mockito.internal.configuration.injection.filter.NameBasedCandidateFilter;
import org.mockito.internal.configuration.injection.filter.TypeBasedCandidateFilter;
import org.mockito.internal.util.collections.ListUtil;
import org.mockito.internal.util.reflection.FieldInitializationReport;
import org.mockito.internal.util.reflection.FieldInitializer;
import org.mockito.internal.util.reflection.SuperTypesLastSorter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.*;

public class FinalMockCandidateFilterTest {
    static class Holder { Object value; }

    private Field field(String name) throws Exception {
        return Holder.class.getDeclaredField(name);
    }

    private List<Field> fields(Field field) {
        return new ArrayList<Field>(Collections.singletonList(field));
    }

    @Test
    public void singleCandidateReturnedAndInjectedToField() throws Exception {
        Holder holder = new Holder();
        Object candidate = new Object();
        Field f = field("value");
        Object result = new FinalMockCandidateFilter().filterCandidate(
                Collections.<Object>singleton(candidate), f, fields(f), holder).thenInject();
        assertSame(candidate, result);
        assertSame(candidate, holder.value);
    }

    @Test
    public void emptyCandidatesReturnNullWithoutChangingField() throws Exception {
        Holder holder = new Holder();
        Object original = new Object();
        holder.value = original;
        Field f = field("value");
        Object result = new FinalMockCandidateFilter().filterCandidate(
                Collections.<Object>emptyList(), f, fields(f), holder).thenInject();
        assertNull(result);
        assertSame(original, holder.value);
    }

    @Test
    public void multipleCandidatesReturnNullWithoutChangingField() throws Exception {
        Holder holder = new Holder();
        Object original = new Object();
        holder.value = original;
        Field f = field("value");
        Collection<Object> candidates = Arrays.<Object>asList(new Object(), new Object());
        Object result = new FinalMockCandidateFilter().filterCandidate(
                candidates, f, fields(f), holder).thenInject();
        assertNull(result);
        assertSame(original, holder.value);
    }

    @Test
    public void oneCandidateIsSelectedWhenItIsTheOnlyEntry() throws Exception {
        Object candidate = new Object();
        Field f = field("value");
        assertSame(candidate, new FinalMockCandidateFilter().filterCandidate(
                Collections.<Object>singleton(candidate), f, fields(f), new Holder()).thenInject());
    }

    @Test
    public void nonSingletonCollectionWithTwoEntriesIsNotSelected() throws Exception {
        Field f = field("value");
        assertNull(new FinalMockCandidateFilter().filterCandidate(
                Arrays.<Object>asList(new Object(), new Object()), f, fields(f), new Holder()).thenInject());
    }

    @Test
    public void singletonListCandidateIsInjected() throws Exception {
        Holder holder = new Holder();
        Object candidate = new Object();
        Field f = field("value");
        assertSame(candidate, new FinalMockCandidateFilter().filterCandidate(
                Collections.<Object>singletonList(candidate), f, fields(f), holder).thenInject());
        assertSame(candidate, holder.value);
    }

    @Test
    public void noCandidatesPreserveNullField() throws Exception {
        Holder holder = new Holder();
        Field f = field("value");
        assertNull(new FinalMockCandidateFilter().filterCandidate(
                Collections.<Object>emptyList(), f, fields(f), holder).thenInject());
        assertNull(holder.value);
    }

    @Test
    public void selectedCandidateReplacesExistingFieldValue() throws Exception {
        Holder holder = new Holder();
        Object oldValue = new Object();
        Object candidate = new Object();
        holder.value = oldValue;
        Field f = field("value");
        assertSame(candidate, new FinalMockCandidateFilter().filterCandidate(
                Collections.<Object>singleton(candidate), f, fields(f), holder).thenInject());
        assertSame(candidate, holder.value);
    }

    @Test
    public void injectionIntoNullFieldReturnsCandidate() throws Exception {
        Holder holder = new Holder();
        Object candidate = new Object();
        Field f = field("value");
        Object result = new FinalMockCandidateFilter().filterCandidate(
                Collections.<Object>singleton(candidate), f, fields(f), holder).thenInject();
        assertSame(candidate, result);
        assertSame(candidate, holder.value);
    }

    @Test
    public void zeroCandidatesDoNotCreateAnInjectionResult() throws Exception {
        Field f = field("value");
        OngoingInjecter injecter = new FinalMockCandidateFilter().filterCandidate(
                Collections.<Object>emptyList(), f, fields(f), new Holder());
        assertNull(injecter.thenInject());
    }

    @Test
    public void twoCandidatesDoNotCreateAnInjectionResult() throws Exception {
        Field f = field("value");
        OngoingInjecter injecter = new FinalMockCandidateFilter().filterCandidate(
                Arrays.<Object>asList(new Object(), new Object()), f, fields(f), new Holder());
        assertNull(injecter.thenInject());
    }

    @Test
    public void returnedInjectionResultIsTheAssignedReference() throws Exception {
        Holder holder = new Holder();
        Object candidate = new Object();
        Field f = field("value");
        Object result = new FinalMockCandidateFilter().filterCandidate(
                Collections.<Object>singleton(candidate), f, fields(f), holder).thenInject();
        assertSame(holder.value, result);
    }
}
