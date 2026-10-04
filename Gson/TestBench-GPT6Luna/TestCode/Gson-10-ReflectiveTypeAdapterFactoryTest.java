package com.google.gson.internal.bind;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.gson.FieldNamingStrategy;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.Excluder;
import com.google.gson.internal.ObjectConstructor;
import com.google.gson.internal.Primitives;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ReflectiveTypeAdapterFactoryTest {
    static class Sample {
        int number;
        String text;
    }

    static class Hidden {
        private int number;
    }

    private ReflectiveTypeAdapterFactory factory(Excluder excluder) {
        return new ReflectiveTypeAdapterFactory(
                new ConstructorConstructor(Collections.<Type, com.google.gson.InstanceCreator<?>>emptyMap()),
                new Gson().fieldNamingStrategy(), excluder);
    }

    private Field field(String name) throws Exception {
        return Sample.class.getDeclaredField(name);
    }

    @Test
    public void testIncludesOrdinaryFieldForSerialization() throws Exception {
        assertFalse(factory(new Excluder()).excludeField(field("number"), true));
    }

    @Test
    public void testIncludesOrdinaryFieldForDeserialization() throws Exception {
        assertFalse(factory(new Excluder()).excludeField(field("number"), false));
    }

    @Test
    public void testStaticFieldExcludedFromSerialization() throws Exception {
        Field f = StaticSample.class.getDeclaredField("value");
        assertTrue(factory(new Excluder()).excludeField(f, true));
    }

    static class StaticSample {
        static int value;
    }

    @Test
    public void testStaticFieldExcludedFromDeserialization() throws Exception {
        Field f = StaticSample.class.getDeclaredField("value");
        assertTrue(factory(new Excluder()).excludeField(f, false));
    }

    @Test
    public void testTransientFieldExcludedForSerialization() throws Exception {
        Field f = TransientSample.class.getDeclaredField("value");
        assertTrue(factory(new Excluder()).excludeField(f, true));
    }

    static class TransientSample {
        transient int value;
    }

    @Test
    public void testTransientFieldExcludedForDeserialization() throws Exception {
        Field f = TransientSample.class.getDeclaredField("value");
        assertTrue(factory(new Excluder()).excludeField(f, false));
    }

    @Test
    public void testSyntheticFieldExcluded() throws Exception {
        Field f = Inner.class.getDeclaredFields()[0];
        assertTrue(factory(new Excluder()).excludeField(f, true));
    }

    class Inner {
        int value;
    }

    @Test
    public void testExcludesFieldWhenClassIsExcludedForSerialization() throws Exception {
        Excluder e = new Excluder().withModifiers(0);
        assertFalse(factory(e).excludeField(field("number"), true));
    }

    @Test
    public void testExcludesFieldWhenClassIsExcludedForDeserialization() throws Exception {
        Excluder e = new Excluder().withModifiers(0);
        assertFalse(factory(e).excludeField(field("number"), false));
    }

    @Test
    public void testPrivateFieldIsIncludedByDefault() throws Exception {
        Field f = Hidden.class.getDeclaredField("number");
        assertFalse(factory(new Excluder()).excludeField(f, true));
    }

    @Test
    public void testPrivateFieldIncludedForDeserializationByDefault() throws Exception {
        Field f = Hidden.class.getDeclaredField("number");
        assertFalse(factory(new Excluder()).excludeField(f, false));
    }

    @Test
    public void testExcludesFieldWithUnsupportedVersionForSerialization() throws Exception {
        Field f = Versioned.class.getDeclaredField("value");
        assertTrue(factory(new Excluder().withVersion(1.0)).excludeField(f, true));
    }

    static class Versioned {
        @com.google.gson.annotations.Since(2.0)
        int value;
    }

    @Test
    public void testExcludesFieldWithUnsupportedVersionForDeserialization() throws Exception {
        Field f = Versioned.class.getDeclaredField("value");
        assertTrue(factory(new Excluder().withVersion(1.0)).excludeField(f, false));
    }

    @Test
    public void testExposeOnlyExcludesUnannotatedFieldForSerialization() throws Exception {
        assertTrue(factory(new Excluder().excludeFieldsWithoutExposeAnnotation())
                .excludeField(field("number"), true));
    }

    @Test
    public void testExposeOnlyExcludesUnannotatedFieldForDeserialization() throws Exception {
        assertTrue(factory(new Excluder().excludeFieldsWithoutExposeAnnotation())
                .excludeField(field("number"), false));
    }

    @Test
    public void testExposeAnnotationCanIncludeSerialization() throws Exception {
        Field f = Exposed.class.getDeclaredField("value");
        assertFalse(factory(new Excluder().excludeFieldsWithoutExposeAnnotation())
                .excludeField(f, true));
    }

    static class Exposed {
        @com.google.gson.annotations.Expose
        int value;
    }

    @Test
    public void testExposeAnnotationCanIncludeDeserialization() throws Exception {
        Field f = Exposed.class.getDeclaredField("value");
        assertFalse(factory(new Excluder().excludeFieldsWithoutExposeAnnotation())
                .excludeField(f, false));
    }
}
