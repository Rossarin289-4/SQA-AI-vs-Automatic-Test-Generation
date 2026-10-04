package org.mockito.internal.configuration.injection;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.reflection.BeanPropertySetter;
import org.mockito.internal.util.reflection.FieldSetter;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.ArrayList;

public class FinalMockCandidateFilterTest {
    public static class Holder {
        public Object value;
    }

    public static class SetterHolder {
        private Object value;

        public void setValue(Object value) {
            this.value = value;
        }

        public Object getValue() {
            return value;
        }
    }

    private Field field(String name) throws Exception {
        return Holder.class.getField(name);
    }

    private Collection<Object> mocks(Object... values) {
        Collection<Object> result = new ArrayList<Object>();
        for (Object value : values) {
            result.add(value);
        }
        return result;
    }

    private FinalMockCandidateFilter filter() {
        return new FinalMockCandidateFilter();
    }

    @Test
    public void oneCandidateIsInjectedIntoField() throws Exception {
        Holder holder = new Holder();
        Object mock = new Object();
        OngoingInjecter injecter = filter().filterCandidate(mocks(mock), field("value"), holder);
        assertTrue(injecter.thenInject());
        assertSame(mock, holder.value);
    }

    @Test
    public void oneCandidateIsInjectedIntoSetter() throws Exception {
        SetterHolder holder = new SetterHolder();
        Object mock = new Object();
        Field property = SetterHolder.class.getDeclaredField("value");
        OngoingInjecter injecter = filter().filterCandidate(mocks(mock), property, holder);
        assertTrue(injecter.thenInject());
        assertSame(mock, holder.getValue());
    }

    @Test
    public void emptyCandidateCollectionDoesNotInject() throws Exception {
        Holder holder = new Holder();
        OngoingInjecter injecter = filter().filterCandidate(mocks(), field("value"), holder);
        assertFalse(injecter.thenInject());
        assertNull(holder.value);
    }

    @Test
    public void multipleCandidatesDoNotInject() throws Exception {
        Holder holder = new Holder();
        Object first = new Object();
        Object second = new Object();
        OngoingInjecter injecter = filter().filterCandidate(mocks(first, second), field("value"), holder);
        assertFalse(injecter.thenInject());
        assertNull(holder.value);
    }

    @Test
    public void oneCandidateCanBeInjectedRepeatedly() throws Exception {
        Holder holder = new Holder();
        Object mock = new Object();
        OngoingInjecter injecter = filter().filterCandidate(mocks(mock), field("value"), holder);
        assertTrue(injecter.thenInject());
        assertTrue(injecter.thenInject());
        assertSame(mock, holder.value);
    }

    @Test
    public void noCandidateCanBeInjectedRepeatedly() throws Exception {
        Holder holder = new Holder();
        OngoingInjecter injecter = filter().filterCandidate(mocks(), field("value"), holder);
        assertFalse(injecter.thenInject());
        assertFalse(injecter.thenInject());
    }

    @Test
    public void oneElementCollectionSelectsItsOnlyElement() throws Exception {
        Holder holder = new Holder();
        Object mock = new Object();
        Collection<Object> candidates = mocks(mock);
        OngoingInjecter injecter = filter().filterCandidate(candidates, field("value"), holder);
        assertTrue(injecter.thenInject());
        assertSame(mock, holder.value);
    }

    @Test
    public void twoElementCollectionDoesNotSelectEitherElement() throws Exception {
        Holder holder = new Holder();
        Object first = new Object();
        Object second = new Object();
        Collection<Object> candidates = mocks(first, second);
        OngoingInjecter injecter = filter().filterCandidate(candidates, field("value"), holder);
        assertFalse(injecter.thenInject());
        assertNull(holder.value);
    }

    @Test
    public void oneNullCandidateIsStillAnInjectionCandidate() throws Exception {
        Holder holder = new Holder();
        OngoingInjecter injecter = filter().filterCandidate(mocks((Object) null), field("value"), holder);
        assertTrue(injecter.thenInject());
        assertNull(holder.value);
    }

    @Test
    public void multipleCandidatesIncludingNullDoNotInject() throws Exception {
        Holder holder = new Holder();
        OngoingInjecter injecter = filter().filterCandidate(mocks(null, new Object()), field("value"), holder);
        assertFalse(injecter.thenInject());
        assertNull(holder.value);
    }

    @Test
    public void fieldInjectionReplacesExistingValue() throws Exception {
        Holder holder = new Holder();
        Object previous = new Object();
        Object mock = new Object();
        holder.value = previous;
        OngoingInjecter injecter = filter().filterCandidate(mocks(mock), field("value"), holder);
        assertTrue(injecter.thenInject());
        assertSame(mock, holder.value);
        assertNotSame(previous, holder.value);
    }

    @Test
    public void setterInjectionReplacesExistingValue() throws Exception {
        SetterHolder holder = new SetterHolder();
        Object previous = new Object();
        Object mock = new Object();
        holder.setValue(previous);
        Field property = SetterHolder.class.getDeclaredField("value");
        OngoingInjecter injecter = filter().filterCandidate(mocks(mock), property, holder);
        assertTrue(injecter.thenInject());
        assertSame(mock, holder.getValue());
        assertNotSame(previous, holder.getValue());
    }
}
