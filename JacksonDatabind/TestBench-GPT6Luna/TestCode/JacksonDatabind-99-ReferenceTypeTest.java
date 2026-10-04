package com.fasterxml.jackson.databind.type;

import org.junit.Test;
import static org.junit.Assert.*;
import com.fasterxml.jackson.databind.JavaType;

public class ReferenceTypeTest {
    @Test
    public void testConstructContentAndReferenceAccessors() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);

        assertSame(content, type.getContentType());
        assertSame(content, type.getReferencedType());
        assertTrue(type.hasContentType());
        assertTrue(type.isReferenceType());
        assertTrue(type.isAnchorType());
        assertSame(type, type.getAnchorType());
    }

    @Test
    public void testUpgradeFromUsesBaseAndReferencedType() throws Exception {
        JavaType base = SimpleType.constructUnsafe(Object.class);
        JavaType content = SimpleType.constructUnsafe(Integer.class);
        ReferenceType type = ReferenceType.upgradeFrom(base, content);

        assertSame(content, type.getReferencedType());
        assertTrue(type.isAnchorType());
        assertSame(type, type.getAnchorType());
    }

    @Test
    public void testUpgradeFromRejectsNullReferencedType() throws Exception {
        JavaType base = SimpleType.constructUnsafe(Object.class);
        try {
            ReferenceType.upgradeFrom(base, null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testUpgradeFromAcceptsSimpleTypeBase() throws Exception {
        JavaType base = SimpleType.constructUnsafe(Object.class);
        JavaType content = SimpleType.constructUnsafe(String.class);

        assertSame(content, ReferenceType.upgradeFrom(base, content).getContentType());
    }

    @Test
    public void testWithContentTypeSameReferenceReturnsThis() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);

        assertSame(type, type.withContentType(content));
    }

    @Test
    public void testWithContentTypeReplacesContent() throws Exception {
        JavaType oldContent = SimpleType.constructUnsafe(String.class);
        JavaType newContent = SimpleType.constructUnsafe(Integer.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, oldContent);

        JavaType changed = type.withContentType(newContent);
        assertSame(newContent, changed.getContentType());
        assertSame(oldContent, type.getContentType());
    }

    @Test
    public void testWithTypeHandlerSameReferenceReturnsThis() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);
        Object handler = new Object();
        ReferenceType handled = type.withTypeHandler(handler);

        assertSame(handled, handled.withTypeHandler(handler));
    }

    @Test
    public void testWithTypeHandlerSetsHandler() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);
        Object handler = new Object();

        assertSame(handler, type.withTypeHandler(handler).getTypeHandler());
    }

    @Test
    public void testWithContentTypeHandlerSameHandlerReturnsThis() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class).withTypeHandler("type");
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);

        assertSame(type, type.withContentTypeHandler("type"));
    }

    @Test
    public void testWithContentTypeHandlerSetsContentHandler() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);
        Object handler = new Object();

        assertSame(handler, type.withContentTypeHandler(handler).getContentType().getTypeHandler());
    }

    @Test
    public void testWithValueHandlerSameReferenceReturnsThis() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);
        Object handler = new Object();
        ReferenceType handled = type.withValueHandler(handler);

        assertSame(handled, handled.withValueHandler(handler));
    }

    @Test
    public void testWithValueHandlerSetsHandler() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);
        Object handler = new Object();

        assertSame(handler, type.withValueHandler(handler).getValueHandler());
    }

    @Test
    public void testWithContentValueHandlerSameHandlerReturnsThis() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class).withValueHandler("value");
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);

        assertSame(type, type.withContentValueHandler("value"));
    }

    @Test
    public void testWithContentValueHandlerSetsContentValueHandler() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);
        Object handler = new Object();

        assertSame(handler, type.withContentValueHandler(handler).getContentType().getValueHandler());
    }

    @Test
    public void testWithStaticTypingIsIdempotent() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);
        JavaType staticType = type.withStaticTyping();

        assertSame(staticType, staticType.withStaticTyping());
    }

    @Test
    public void testWithStaticTypingKeepsReferenceContent() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);

        assertEquals(content.getRawClass(), type.withStaticTyping().getContentType().getRawClass());
    }

    @Test
    public void testRefineChangesRawClassAndRetainsContent() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);

        JavaType refined = type.refine(CharSequence.class, TypeBindings.emptyBindings(), null, null);
        assertEquals(CharSequence.class, refined.getRawClass());
        assertSame(content, refined.getContentType());
    }

    @Test
    public void testErasedSignature() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);

        assertEquals("Ljava/lang/Object;", type.getErasedSignature(new StringBuilder()).toString());
    }

    @Test
    public void testGenericSignatureIncludesReferencedType() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);

        assertEquals("Ljava/lang/Object<Ljava/lang/String;>;",
                type.getGenericSignature(new StringBuilder()).toString());
    }

    @Test
    public void testCanonicalName() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);

        assertEquals("java.lang.Object<java.lang.String>", type.toCanonical());
    }

    @Test
    public void testToString() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);

        assertEquals("[reference type, class java.lang.Object<java.lang.String><[simple type, class java.lang.String]>]",
                type.toString());
    }

    @Test
    public void testEqualsForSameRawAndContentTypes() throws Exception {
        JavaType firstContent = SimpleType.constructUnsafe(String.class);
        JavaType secondContent = SimpleType.constructUnsafe(String.class);
        ReferenceType first = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, firstContent);
        ReferenceType second = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, secondContent);

        assertTrue(first.equals(second));
    }

    @Test
    public void testEqualsRejectsDifferentContentTypes() throws Exception {
        ReferenceType first = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, SimpleType.constructUnsafe(String.class));
        ReferenceType second = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, SimpleType.constructUnsafe(Integer.class));

        assertFalse(first.equals(second));
    }

    @Test
    public void testEqualsRejectsDifferentRawTypes() throws Exception {
        JavaType content = SimpleType.constructUnsafe(String.class);
        ReferenceType first = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, content);
        ReferenceType second = ReferenceType.construct(CharSequence.class, TypeBindings.emptyBindings(),
                null, null, content);

        assertFalse(first.equals(second));
    }

    @Test
    public void testEqualsRejectsNullAndOtherType() throws Exception {
        ReferenceType type = ReferenceType.construct(Object.class, TypeBindings.emptyBindings(),
                null, null, SimpleType.constructUnsafe(String.class));

        assertFalse(type.equals(null));
        assertFalse(type.equals(SimpleType.constructUnsafe(Object.class)));
    }
}
