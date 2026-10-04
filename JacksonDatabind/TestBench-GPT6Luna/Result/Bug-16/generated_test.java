package com.fasterxml.jackson.databind.introspect;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.annotation.Annotation;
import java.util.*;
import com.fasterxml.jackson.databind.util.Annotations;

public class AnnotationMapTest {
    @Test
    public void testEmptyMapSizeAndGet() throws Exception {
        AnnotationMap map = new AnnotationMap();
        assertEquals(0, map.size());
        assertNull(map.get(Deprecated.class));
    }

    @Test
    public void testEmptyAnnotationsIterable() throws Exception {
        AnnotationMap map = new AnnotationMap();
        assertFalse(map.annotations().iterator().hasNext());
    }

    @Test
    public void testEmptyMapString() throws Exception {
        assertEquals("[null]", new AnnotationMap().toString());
    }

    @Test
    public void testAddFirstAnnotation() throws Exception {
        AnnotationMap map = new AnnotationMap();
        Annotation ann = Deprecated.class.getAnnotation(Deprecated.class);
        assertNull(ann);
        assertEquals(0, map.size());
    }

    @Test
    public void testAddAnnotationAndRetrieve() throws Exception {
        AnnotationMap map = new AnnotationMap();
        Annotation ann = Override.class.getAnnotation(Override.class);
        assertNull(ann);
        assertEquals(0, map.size());
    }

    @Test
    public void testMergeNullMaps() throws Exception {
        assertNull(AnnotationMap.merge(null, null));
    }

    @Test
    public void testMergeEmptyMaps() throws Exception {
        AnnotationMap primary = new AnnotationMap();
        AnnotationMap secondary = new AnnotationMap();
        assertSame(secondary, AnnotationMap.merge(primary, secondary));
    }

    @Test
    public void testMergeNullPrimaryReturnsSecondary() throws Exception {
        AnnotationMap secondary = new AnnotationMap();
        assertSame(secondary, AnnotationMap.merge(null, secondary));
    }

    @Test
    public void testMergeNullSecondaryReturnsNull() throws Exception {
        AnnotationMap primary = new AnnotationMap();
        assertNull(AnnotationMap.merge(primary, null));
    }

    @Test
    public void testSizeWithEmptyMap() throws Exception {
        AnnotationMap map = new AnnotationMap();
        assertEquals(0, map.size());
    }

    @Test
    public void testAddIfNotPresentNullAnnotation() throws Exception {
        AnnotationMap map = new AnnotationMap();
        try {
            map.addIfNotPresent(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testAddNullAnnotation() throws Exception {
        AnnotationMap map = new AnnotationMap();
        try {
            map.add(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testToStringEmptyInitializedMap() throws Exception {
        AnnotationMap map = new AnnotationMap();
        assertEquals("[null]", map.toString());
    }
}
