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
    public void testInstanceReturnsSameSingleton() throws Exception {
        assertSame(SubTypeValidator.instance(), SubTypeValidator.instance());
    }

    @Test
    public void testAllowsStringType() throws Exception {
        SubTypeValidator.instance().validateSubType(null,
                com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance()
                        .constructType(String.class));
    }

    @Test
    public void testAllowsIntegerType() throws Exception {
        SubTypeValidator.instance().validateSubType(null,
                com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance()
                        .constructType(Integer.class));
    }

    @Test
    public void testRejectsInvokerTransformerName() throws Exception {
        assertRejectedIfPresent("org.apache.commons.collections.functors.InvokerTransformer");
    }

    @Test
    public void testRejectsInstantiateTransformerName() throws Exception {
        assertRejectedIfPresent("org.apache.commons.collections.functors.InstantiateTransformer");
    }

    @Test
    public void testRejectsCollections4InvokerTransformerName() throws Exception {
        assertRejectedIfPresent("org.apache.commons.collections4.functors.InvokerTransformer");
    }

    @Test
    public void testRejectsConvertedClosureName() throws Exception {
        assertRejectedIfPresent("org.codehaus.groovy.runtime.ConvertedClosure");
    }

    @Test
    public void testRejectsSpringObjectFactoryName() throws Exception {
        assertRejectedIfPresent("org.springframework.beans.factory.ObjectFactory");
    }

    @Test
    public void testRejectsSunTemplatesImplName() throws Exception {
        assertRejectedIfPresent("com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl");
    }

    @Test
    public void testRejectsJdbcRowSetImplName() throws Exception {
        assertRejectedIfPresent("com.sun.rowset.JdbcRowSetImpl");
    }

    @Test
    public void testRejectsFileHandlerName() throws Exception {
        assertRejectedIfPresent("java.util.logging.FileHandler");
    }

    @Test
    public void testRejectsUnicastRemoteObjectName() throws Exception {
        assertRejectedIfPresent("java.rmi.server.UnicastRemoteObject");
    }

    @Test
    public void testRejectsPropertyPathFactoryBeanName() throws Exception {
        assertRejectedIfPresent("org.springframework.beans.factory.config.PropertyPathFactoryBean");
    }

    @Test
    public void testRejectsBasicDataSourceName() throws Exception {
        assertRejectedIfPresent("org.apache.tomcat.dbcp.dbcp2.BasicDataSource");
    }

    @Test
    public void testRejectsBcelClassLoaderName() throws Exception {
        assertRejectedIfPresent("com.sun.org.apache.bcel.internal.util.ClassLoader");
    }

    private void assertRejectedIfPresent(String name) throws Exception {
        try {
            Class<?> cls = Class.forName(name);
            try {
                SubTypeValidator.instance().validateSubType(null,
                        com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance()
                                .constructType(cls));
                fail("expected JsonMappingException");
            } catch (JsonMappingException expected) {
                assertTrue(expected.getMessage().contains(name));
            }
        } catch (ClassNotFoundException unavailable) {
            // Optional third-party types need not be present on the classpath.
        }
    }
}
