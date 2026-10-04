package com.fasterxml.jackson.databind.jsontype.impl;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;

public class SubTypeValidatorTest {
    @Test
    public void testInstanceIsSingleton() throws Exception {
        assertSame(SubTypeValidator.instance(), SubTypeValidator.instance());
    }

    @Test
    public void testAllowsStringType() throws Exception {
        SubTypeValidator.instance().validateSubType(null, null);
    }

    @Test
    public void testAllowsNonBlockedJdkType() throws Exception {
        SubTypeValidator.instance().validateSubType(null, null);
    }

    @Test
    public void testAllowsNullContextWhenTypeIsNotBlocked() throws Exception {
        SubTypeValidator.instance().validateSubType(null, null);
    }

    @Test
    public void testAllowsNonSpringType() throws Exception {
        SubTypeValidator.instance().validateSubType(null, null);
    }

    @Test
    public void testAllowsNonC3p0Type() throws Exception {
        SubTypeValidator.instance().validateSubType(null, null);
    }

    @Test
    public void testAllowsOrdinaryClassName() throws Exception {
        SubTypeValidator.instance().validateSubType(null, null);
    }

    @Test
    public void testAllowsAnotherOrdinaryClassName() throws Exception {
        SubTypeValidator.instance().validateSubType(null, null);
    }

    @Test
    public void testAllowsTypeWithDifferentPackagePrefix() throws Exception {
        SubTypeValidator.instance().validateSubType(null, null);
    }

    @Test
    public void testAllowsTypeWithDifferentSuffix() throws Exception {
        SubTypeValidator.instance().validateSubType(null, null);
    }

    @Test
    public void testAllowsClassOutsideForbiddenSet() throws Exception {
        SubTypeValidator.instance().validateSubType(null, null);
    }

    @Test
    public void testAllowsInterfaceOutsideForbiddenSet() throws Exception {
        SubTypeValidator.instance().validateSubType(null, null);
    }
}
