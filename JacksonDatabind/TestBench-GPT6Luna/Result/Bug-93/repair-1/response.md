```java
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
        assertRejected("org.apache.commons.collections.functors.InvokerTransformer");
    }

    @Test
    public void testRejectsInstantiateTransformerName() throws Exception {
        assertRejected("org.apache.commons.collections.functors.InstantiateTransformer");
    }

    @Test
    public void testRejectsCollections4InvokerTransformerName() throws Exception {
        assertRejected("org.apache.commons.collections4.functors.InvokerTransformer");
    }

    @Test
    public void testRejectsConvertedClosureName() throws Exception {
        assertRejected("org.codehaus.groovy.runtime.ConvertedClosure");
    }

    @Test
    public void testRejectsSpringObjectFactoryName() throws Exception {
        assertRejected("org.springframework.beans.factory.ObjectFactory");
    }

    @Test
    public void testRejectsSunTemplatesImplName() throws Exception {
        assertRejected("com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl");
    }

    @Test
    public void testRejectsJdbcRowSetImplName() throws Exception {
        assertRejected("com.sun.rowset.JdbcRowSetImpl");
    }

    @Test
    public void testRejectsFileHandlerName() throws Exception {
        assertRejected("java.util.logging.FileHandler");
    }

    @Test
    public void testRejectsUnicastRemoteObjectName() throws Exception {
        assertRejected("java.rmi.server.UnicastRemoteObject");
    }

    @Test
    public void testRejectsPropertyPathFactoryBeanName() throws Exception {
        assertRejected("org.springframework.beans.factory.config.PropertyPathFactoryBean");
    }

    @Test
    public void testRejectsBasicDataSourceName() throws Exception {
        assertRejected("org.apache.tomcat.dbcp.dbcp2.BasicDataSource");
    }

    @Test
    public void testRejectsBcelClassLoaderName() throws Exception {
        assertRejected("com.sun.org.apache.bcel.internal.util.ClassLoader");
    }

    private void assertRejected(String name) throws Exception {
        try {
            SubTypeValidator.instance().validateSubType(null,
                    com.fasterxml.jackson.databind.type.TypeFactory.defaultInstance()
                            .constructType(Class.forName(name)));
            fail("expected JsonMappingException");
        } catch (JsonMappingException expected) {
            assertTrue(expected.getMessage().contains(name));
        } catch (ClassNotFoundException expected) {
            throw new AssertionError(expected);
        }
    }
}
```