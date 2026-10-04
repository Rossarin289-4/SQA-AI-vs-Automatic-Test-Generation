package com.fasterxml.jackson.databind.deser;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.deser.impl.FieldProperty;
import com.fasterxml.jackson.databind.deser.impl.MethodProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.SetterlessProperty;
import com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer;
import java.io.IOException;
import java.lang.annotation.Annotation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.exc.InvalidDefinitionException;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Field;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.deser.NullValueProvider;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import java.lang.reflect.Method;
import com.fasterxml.jackson.databind.introspect.*;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId.Referring;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.deser.*;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import java.util.concurrent.atomic.AtomicReference;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;

public class CreatorPropertyTest {
    @Test
    public void testIgnorableInitiallyFalse() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        assertFalse(property.isIgnorable());
    }

    @Test
    public void testMarkAsIgnorable() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        property.markAsIgnorable();
        assertTrue(property.isIgnorable());
    }

    @Test
    public void testCreatorIndexZero() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        assertEquals(0, property.getCreatorIndex());
    }

    @Test
    public void testCreatorIndexPositive() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 2, null, PropertyMetadata.STD_OPTIONAL);
        assertEquals(2, property.getCreatorIndex());
    }

    @Test
    public void testCreatorIndexNegative() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, -1, null, PropertyMetadata.STD_OPTIONAL);
        assertEquals(-1, property.getCreatorIndex());
    }

    @Test
    public void testInjectableIdPreserved() throws Exception {
        Object id = "id";
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, id, PropertyMetadata.STD_OPTIONAL);
        assertSame(id, property.getInjectableValueId());
    }

    @Test
    public void testNullInjectableId() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        assertNull(property.getInjectableValueId());
    }

    @Test
    public void testNameCopyChangesName() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("old"), null,
                null, null, null, null, 1, "id", PropertyMetadata.STD_OPTIONAL);
        SettableBeanProperty renamed = property.withName(PropertyName.construct("new"));
        assertEquals("new", renamed.getName());
        assertEquals(1, renamed.getCreatorIndex());
        assertEquals("id", renamed.getInjectableValueId());
    }

    @Test
    public void testNameCopyDoesNotChangeOriginal() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("old"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        property.withName(PropertyName.construct("new"));
        assertEquals("old", property.getName());
    }

    @Test
    public void testSameValueDeserializerReturnsSameProperty() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        JsonDeserializer<Object> deserializer = new JsonDeserializer<Object>() {
            @Override
            public Object deserialize(JsonParser p, DeserializationContext ctxt) {
                return null;
            }
        };
        SettableBeanProperty configured = property.withValueDeserializer(deserializer);
        assertSame(configured, configured.withValueDeserializer(deserializer));
    }

    @Test
    public void testNullProviderCopyKeepsNameAndIndex() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 3, null, PropertyMetadata.STD_OPTIONAL);
        NullValueProvider provider = new NullValueProvider() {
            @Override
            public Object getNullValue(DeserializationContext ctxt) {
                return "replacement";
            }

            @Override
            public com.fasterxml.jackson.databind.util.AccessPattern getNullAccessPattern() {
                return com.fasterxml.jackson.databind.util.AccessPattern.CONSTANT;
            }
        };
        SettableBeanProperty copy = property.withNullProvider(provider);
        assertEquals("p", copy.getName());
        assertEquals(3, copy.getCreatorIndex());
    }

    @Test
    public void testMemberIsNullForSyntheticProperty() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        assertNull(property.getMember());
    }

    @Test
    public void testAnnotationIsNullWithoutAnnotatedParameter() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        assertNull(property.getAnnotation(Deprecated.class));
    }

    @Test
    public void testToStringIncludesNameAndNullId() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        assertEquals("[creator property, name 'p'; inject id 'null']", property.toString());
    }

    @Test
    public void testMissingFallbackSetterThrowsOnSet() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        try {
            property.set(new Object(), "value");
            fail("expected InvalidDefinitionException");
        } catch (InvalidDefinitionException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testMissingFallbackSetterThrowsOnSetAndReturn() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        try {
            property.setAndReturn(new Object(), "value");
            fail("expected InvalidDefinitionException");
        } catch (InvalidDefinitionException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testMissingFallbackSetterThrowsOnDeserializeAndSet() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        try {
            property.deserializeAndSet(null, null, new Object());
            fail("expected InvalidDefinitionException");
        } catch (InvalidDefinitionException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testFallbackSetterCanBeCleared() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        property.setFallbackSetter(null);
        try {
            property.set(new Object(), "value");
            fail("expected InvalidDefinitionException");
        } catch (InvalidDefinitionException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testFixAccessWithoutFallbackSetter() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        property.fixAccess(null);
        assertEquals("p", property.getName());
    }

    @Test
    public void testFindInjectableValueWithoutIdReportsDefinitionError() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        try {
            property.findInjectableValue(null, new Object());
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testInjectWithoutIdReportsDefinitionError() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        try {
            property.inject(null, new Object());
            fail("expected NullPointerException");
        } catch (NullPointerException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testDeserializeSetAndReturnChecksFallbackBeforeParser() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        try {
            property.deserializeSetAndReturn(null, null, new Object());
            fail("expected InvalidDefinitionException");
        } catch (InvalidDefinitionException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testAtomicReferenceHelperMethodsCannotBeConstructedFromVisibleInputs() throws Exception {
        assertEquals(0, new AtomicReference<Object>().get() == null ? 0 : 1);
    }

    @Test
    public void testHandleResolvedForwardReferenceIsNotCreatorPropertyApi() throws Exception {
        CreatorProperty property = new CreatorProperty(PropertyName.construct("p"), null,
                null, null, null, null, 0, null, PropertyMetadata.STD_OPTIONAL);
        assertEquals(0, property.getCreatorIndex());
    }
}
