package org.apache.commons.lang3.builder;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ToStringStyleLang34Test {

    private static class SimpleObject {
        private int number = 42;
        private String name = "sample";
    }

    private static class NestedObject {
        private String value = "nested";
    }

    private static class ContainerObject {
        private int id = 7;
        private NestedObject child = new NestedObject();
    }

    @Test
    public void testRegistryIsNullBeforeAnyRegistration() throws Exception {
        final boolean[] registryIsNull = new boolean[1];

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                registryIsNull[0] = ToStringStyle.getRegistry() == null;
            }
        });

        thread.start();
        thread.join();

        assertTrue(registryIsNull[0]);
    }

    @Test
    public void testRegistryBecomesNullAfterLastObjectIsUnregistered() throws Exception {
        final boolean[] registeredThenCleared = new boolean[1];

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                SimpleObject object = new SimpleObject();

                ToStringStyle.register(object);

                boolean registered = ToStringStyle.isRegistered(object);

                ToStringStyle.unregister(object);

                boolean cleared = ToStringStyle.getRegistry() == null;

                registeredThenCleared[0] = registered && cleared;
            }
        });

        thread.start();
        thread.join();

        assertTrue(registeredThenCleared[0]);
    }

    @Test
    public void testReflectionToStringClearsRegistryForSimpleObject() throws Exception {
        final boolean[] registryIsNull = new boolean[1];

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                SimpleObject object = new SimpleObject();

                ToStringBuilder.reflectionToString(object);

                registryIsNull[0] = ToStringStyle.getRegistry() == null;
            }
        });

        thread.start();
        thread.join();

        assertTrue(registryIsNull[0]);
    }

    @Test
    public void testReflectionToStringClearsRegistryForNestedObject() throws Exception {
        final boolean[] registryIsNull = new boolean[1];

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                ContainerObject object = new ContainerObject();

                ToStringBuilder.reflectionToString(object);

                registryIsNull[0] = ToStringStyle.getRegistry() == null;
            }
        });

        thread.start();
        thread.join();

        assertTrue(registryIsNull[0]);
    }

    @Test
    public void testIsRegisteredReturnsFalseWithoutActiveRegistry() throws Exception {
        final boolean[] result = new boolean[1];

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                SimpleObject object = new SimpleObject();

                result[0] = !ToStringStyle.isRegistered(object);
            }
        });

        thread.start();
        thread.join();

        assertFalse(!result[0]);
        assertNull(ToStringStyle.getRegistry());
    }
}
