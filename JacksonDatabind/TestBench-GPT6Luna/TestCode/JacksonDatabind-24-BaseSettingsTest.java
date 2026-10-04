package com.fasterxml.jackson.databind.cfg;

import org.junit.Test;
import static org.junit.Assert.*;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;

public class BaseSettingsTest {
    private BaseSettings settings() {
        return new BaseSettings(null, null, VisibilityChecker.Std.defaultInstance(),
                null, TypeFactory.defaultInstance(), null, new StdDateFormat(), null,
                Locale.ROOT, TimeZone.getTimeZone("UTC"), null);
    }

    @Test
    public void testClassIntrospectorIdentityAndReplacement() throws Exception {
        BaseSettings s = settings();
        assertSame(s, s.withClassIntrospector(null));
        assertNull(s.withClassIntrospector(null).getClassIntrospector());
    }

    @Test
    public void testAnnotationIntrospectorIdentityAndReplacement() throws Exception {
        BaseSettings s = settings();
        assertSame(s, s.withAnnotationIntrospector(null));
        assertNull(s.withAnnotationIntrospector(null).getAnnotationIntrospector());
    }

    @Test
    public void testInsertedAnnotationIntrospectorWithNulls() throws Exception {
        BaseSettings s = settings();
        assertNull(s.withInsertedAnnotationIntrospector(null).getAnnotationIntrospector());
    }

    @Test
    public void testAppendedAnnotationIntrospectorWithNulls() throws Exception {
        BaseSettings s = settings();
        assertNull(s.withAppendedAnnotationIntrospector(null).getAnnotationIntrospector());
    }

    @Test
    public void testVisibilityCheckerIdentity() throws Exception {
        BaseSettings s = settings();
        assertSame(s, s.withVisibilityChecker(s.getVisibilityChecker()));
    }

    @Test
    public void testVisibilityUpdateProducesChecker() throws Exception {
        BaseSettings s = settings();
        VisibilityChecker<?> updated = s.withVisibility(
                PropertyAccessor.FIELD, JsonAutoDetect.Visibility.NONE).getVisibilityChecker();
        assertNotNull(updated);
        assertNotSame(s.getVisibilityChecker(), updated);
    }

    @Test
    public void testPropertyNamingStrategyIdentityAndNullReplacement() throws Exception {
        BaseSettings s = settings();
        assertSame(s, s.withPropertyNamingStrategy(null));
        assertNull(s.withPropertyNamingStrategy(null).getPropertyNamingStrategy());
    }

    @Test
    public void testTypeFactoryIdentityAndReplacement() throws Exception {
        BaseSettings s = settings();
        assertSame(s, s.withTypeFactory(s.getTypeFactory()));
        assertSame(s.getTypeFactory(), s.withTypeFactory(s.getTypeFactory()).getTypeFactory());
    }

    @Test
    public void testTypeResolverBuilderIdentityAndNullReplacement() throws Exception {
        BaseSettings s = settings();
        assertSame(s, s.withTypeResolverBuilder(null));
        assertNull(s.withTypeResolverBuilder(null).getTypeResolverBuilder());
    }

    @Test
    public void testDateFormatIdentityAndNullReplacement() throws Exception {
        BaseSettings s = settings();
        assertSame(s, s.withDateFormat(s.getDateFormat()));
        assertNull(s.withDateFormat(null).getDateFormat());
    }

    @Test
    public void testHandlerInstantiatorIdentityAndNullReplacement() throws Exception {
        BaseSettings s = settings();
        assertSame(s, s.withHandlerInstantiator(null));
        assertNull(s.withHandlerInstantiator(null).getHandlerInstantiator());
    }

    @Test
    public void testLocaleIdentityAndReplacement() throws Exception {
        BaseSettings s = settings();
        assertSame(s, s.with(Locale.ROOT));
        assertSame(Locale.ROOT, s.with(Locale.ROOT).getLocale());
    }

    @Test
    public void testTimeZoneRejectsNull() throws Exception {
        BaseSettings s = settings();
        try {
            s.with((TimeZone) null);
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) { }
    }

    @Test
    public void testTimeZoneChangeUpdatesSettingsAndDateFormat() throws Exception {
        BaseSettings s = settings();
        TimeZone zone = TimeZone.getTimeZone("GMT+05:00");
        BaseSettings changed = s.with(zone);
        assertSame(zone, changed.getTimeZone());
        assertEquals(zone, changed.getDateFormat().getTimeZone());
        assertEquals(TimeZone.getTimeZone("UTC"), s.getTimeZone());
    }

    @Test
    public void testBase64VariantIdentityAndNullReplacement() throws Exception {
        BaseSettings s = settings();
        assertSame(s, s.with((Base64Variant) null));
        assertNull(s.with((Base64Variant) null).getBase64Variant());
    }

    @Test
    public void testAllInitialGettersReturnConfiguredValues() throws Exception {
        BaseSettings s = settings();
        assertNull(s.getClassIntrospector());
        assertNull(s.getAnnotationIntrospector());
        assertNotNull(s.getVisibilityChecker());
        assertNull(s.getPropertyNamingStrategy());
        assertSame(TypeFactory.defaultInstance(), s.getTypeFactory());
        assertNull(s.getTypeResolverBuilder());
        assertNotNull(s.getDateFormat());
        assertNull(s.getHandlerInstantiator());
        assertSame(Locale.ROOT, s.getLocale());
        assertEquals(TimeZone.getTimeZone("UTC"), s.getTimeZone());
        assertNull(s.getBase64Variant());
    }
}
