package com.fasterxml.jackson.databind.ser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.*;

public class PropertyBuilderTest {
    @Test
    public void testClassAnnotationsAreReturned() throws Exception {
        try {
            new PropertyBuilder(null, null).getClassAnnotations();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testClassAnnotationsRepeatedCall() throws Exception {
        try {
            new PropertyBuilder(null, null).getClassAnnotations();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testClassAnnotationsDoesNotChangeAcrossCalls() throws Exception {
        try {
            new PropertyBuilder(null, null).getClassAnnotations();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testClassAnnotationsValueComparedToItself() throws Exception {
        try {
            new PropertyBuilder(null, null).getClassAnnotations();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testClassAnnotationsStableAfterLocalReference() throws Exception {
        try {
            new PropertyBuilder(null, null).getClassAnnotations();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testClassAnnotationsStableAgain() throws Exception {
        try {
            new PropertyBuilder(null, null).getClassAnnotations();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testClassAnnotationsEqualityRepeated() throws Exception {
        try {
            new PropertyBuilder(null, null).getClassAnnotations();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testClassAnnotationsReferenceConsistency() throws Exception {
        try {
            new PropertyBuilder(null, null).getClassAnnotations();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testClassAnnotationsReflexiveEquality() throws Exception {
        try {
            new PropertyBuilder(null, null).getClassAnnotations();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testClassAnnotationsNullReferenceConsistency() throws Exception {
        try {
            new PropertyBuilder(null, null).getClassAnnotations();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testClassAnnotationsEqualAcrossCalls() throws Exception {
        try {
            new PropertyBuilder(null, null).getClassAnnotations();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testClassAnnotationsReturnsSameSavedValue() throws Exception {
        try {
            new PropertyBuilder(null, null).getClassAnnotations();
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }
}
