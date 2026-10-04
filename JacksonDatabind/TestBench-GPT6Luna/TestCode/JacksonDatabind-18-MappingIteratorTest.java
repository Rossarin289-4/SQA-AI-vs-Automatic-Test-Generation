package com.fasterxml.jackson.databind;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Closeable;
import java.io.IOException;
import java.util.*;
import com.fasterxml.jackson.core.*;

public class MappingIteratorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testEmptyIteratorHasNoNext() throws Exception {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        assertFalse(it.hasNextValue());
        assertFalse(it.hasNext());
    }

    @Test
    public void testEmptyIteratorNextThrows() throws Exception {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        try { it.nextValue(); fail("expected NoSuchElementException"); }
        catch (NoSuchElementException expected) { }
    }

    @Test
    public void testEmptyIteratorNextThrowsThroughIteratorApi() throws Exception {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        try { it.next(); fail("expected NoSuchElementException"); }
        catch (NoSuchElementException expected) { }
    }

    @Test
    public void testCloseEmptyIteratorRemainsExhausted() throws Exception {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        it.close();
        assertFalse(it.hasNextValue());
    }

    @Test
    public void testRemoveUnsupported() throws Exception {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        try { it.remove(); fail("expected UnsupportedOperationException"); }
        catch (UnsupportedOperationException expected) { }
    }

    @Test
    public void testReadAllReturnsEmptyList() throws Exception {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        List<Object> values = it.readAll();
        assertEquals(0, values.size());
    }

    @Test
    public void testReadAllAddsNothingToSuppliedList() throws Exception {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        List<Object> values = new ArrayList<Object>();
        List<Object> result = it.readAll(values);
        assertSame(values, result);
        assertEquals(0, values.size());
    }

    @Test
    public void testReadAllAddsNothingToSuppliedCollection() throws Exception {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        Collection<Object> values = new LinkedHashSet<Object>();
        Collection<Object> result = it.readAll(values);
        assertSame(values, result);
        assertEquals(0, values.size());
    }

    @Test
    public void testEmptyIteratorParserIsNull() throws Exception {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        assertNull(it.getParser());
    }

    @Test
    public void testHasNextRepeatedlyFalseAfterClose() throws Exception {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        assertFalse(it.hasNext());
        assertFalse(it.hasNext());
    }

    @Test
    public void testCloseCanBeCalledRepeatedly() throws Exception {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        it.close();
        it.close();
        assertFalse(it.hasNextValue());
    }

    @Test
    public void testHasNextValueFalseAfterExhaustion() throws Exception {
        MappingIterator<Object> it = MappingIterator.emptyIterator();
        assertFalse(it.hasNextValue());
    }
}
