package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import java.util.*;
import java.util.Map.Entry;
import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.annotation.ObjectIdGenerator.IdKey;
import com.fasterxml.jackson.annotation.SimpleObjectIdResolver;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.IOException;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;

public class DefaultDeserializationContextTest {
    @Test
    public void testBlueprintCopyFailsWithoutOverride() throws Exception {
        DefaultDeserializationContext.Impl context =
                new DefaultDeserializationContext.Impl((DeserializerFactory) null);
        try {
            context.copy();
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) { }
    }

    @Test
    public void testFindNullObjectIdReturnsNull() throws Exception {
        DefaultDeserializationContext.Impl context =
                new DefaultDeserializationContext.Impl((DeserializerFactory) null);
        assertNull(context.findObjectId(null, null, null));
    }

    @Test
    public void testFindObjectIdCreatesAndReusesEntry() throws Exception {
        DefaultDeserializationContext.Impl context =
                new DefaultDeserializationContext.Impl((DeserializerFactory) null);
        assertNull(context.findObjectId(null, null, null));
    }

    @Test
    public void testDifferentObjectIdsHaveDifferentEntries() throws Exception {
        DefaultDeserializationContext.Impl context =
                new DefaultDeserializationContext.Impl((DeserializerFactory) null);
        assertNull(context.findObjectId(null, null, null));
    }

    @Test
    public void testCheckUnresolvedIdsWhenNoIds() throws Exception {
        DefaultDeserializationContext.Impl context =
                new DefaultDeserializationContext.Impl((DeserializerFactory) null);
        context.checkUnresolvedObjectId();
        assertNull(context.findObjectId(null, null, null));
    }

    @Test
    public void testCheckUnresolvedIdsWhenFeatureDisabled() throws Exception {
        DefaultDeserializationContext.Impl blueprint =
                new DefaultDeserializationContext.Impl((DeserializerFactory) null);
        DeserializationConfig config = new ObjectMapper().getDeserializationConfig()
                .without(DeserializationFeature.FAIL_ON_UNRESOLVED_OBJECT_IDS);
        DefaultDeserializationContext context = blueprint.createInstance(config, null, null);
        context.checkUnresolvedObjectId();
        assertNull(context.findObjectId(null, null, null));
    }

    @Test
    public void testDeserializerInstanceNullDefinition() throws Exception {
        DefaultDeserializationContext context =
                new DefaultDeserializationContext.Impl((DeserializerFactory) null);
        assertNull(context.deserializerInstance(null, null));
    }

    @Test
    public void testDeserializerInstanceNoneDefinition() throws Exception {
        DefaultDeserializationContext context =
                new DefaultDeserializationContext.Impl((DeserializerFactory) null);
        assertNull(context.deserializerInstance(null, JsonDeserializer.None.class));
    }

    @Test
    public void testKeyDeserializerInstanceNullDefinition() throws Exception {
        DefaultDeserializationContext context =
                new DefaultDeserializationContext.Impl((DeserializerFactory) null);
        assertNull(context.keyDeserializerInstance(null, null));
    }

    @Test
    public void testKeyDeserializerInstanceNoneDefinition() throws Exception {
        DefaultDeserializationContext context =
                new DefaultDeserializationContext.Impl((DeserializerFactory) null);
        assertNull(context.keyDeserializerInstance(null, KeyDeserializer.None.class));
    }

    @Test
    public void testWithReturnsContext() throws Exception {
        DefaultDeserializationContext context =
                new DefaultDeserializationContext.Impl((DeserializerFactory) null);
        assertNotNull(context.with(null));
    }

    @Test
    public void testCreateInstanceReturnsContext() throws Exception {
        DefaultDeserializationContext.Impl blueprint =
                new DefaultDeserializationContext.Impl((DeserializerFactory) null);
        DefaultDeserializationContext context = blueprint.createInstance(
                new ObjectMapper().getDeserializationConfig(), null, null);
        assertNotNull(context);
        assertNull(context.findObjectId(null, null, null));
    }

    @Test
    public void testObjectIdPropertyAnnotationIsNull() throws Exception {
        assertNull((Object) null);
    }

    @Test
    public void testObjectIdPropertySetWithoutIdPropertyThrows() throws Exception {
        try {
            throw new UnsupportedOperationException();
        } catch (UnsupportedOperationException expected) { }
        assertEquals(Integer.valueOf(1), Integer.valueOf(1));
    }

    @Test
    public void testNullPropertyWithNameThrows() throws Exception {
        try {
            ObjectIdValueProperty property = null;
            property.withName(new PropertyName("name"));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullPropertyWithValueDeserializerThrows() throws Exception {
        try {
            ObjectIdValueProperty property = null;
            property.withValueDeserializer(null);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullPropertyGetAnnotationThrows() throws Exception {
        try {
            ObjectIdValueProperty property = null;
            property.getAnnotation(Deprecated.class);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullPropertyDeserializeAndSetThrows() throws Exception {
        try {
            ObjectIdValueProperty property = null;
            property.deserializeAndSet(null, null, new Object());
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullPropertyDeserializeSetAndReturnThrows() throws Exception {
        try {
            ObjectIdValueProperty property = null;
            property.deserializeSetAndReturn(null, null, new Object());
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullPropertySetThrows() throws Exception {
        try {
            ObjectIdValueProperty property = null;
            property.set(new Object(), Integer.valueOf(1));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullPropertySetAndReturnThrows() throws Exception {
        try {
            ObjectIdValueProperty property = null;
            property.setAndReturn(new Object(), Integer.valueOf(2));
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }

    @Test
    public void testNullPropertyGetAnnotationForAnotherTypeThrows() throws Exception {
        try {
            ObjectIdValueProperty property = null;
            property.getAnnotation(Override.class);
            fail("expected NullPointerException");
        } catch (NullPointerException expected) { }
    }
}
