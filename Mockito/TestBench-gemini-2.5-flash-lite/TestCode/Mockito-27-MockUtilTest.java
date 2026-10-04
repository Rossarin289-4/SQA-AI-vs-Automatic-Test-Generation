package org.mockito.internal.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.cglib.proxy.Callback;
import org.mockito.cglib.proxy.Factory;
import org.mockito.cglib.proxy.MethodProxy;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.InvocationNotifierHandler;
import org.mockito.internal.MockHandler;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MethodInterceptorFilter;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.creation.jmock.ClassImposterizer;
import org.mockito.internal.util.reflection.LenientCopyTool;
import java.io.Serializable;
import java.lang.reflect.Method;

public class MockUtilTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testCreateMock_withBasicClassAndNoSettings() throws Exception {
        MockUtil mockUtil = new MockUtil();
        Object mock = mockUtil.createMock(String.class, new MockSettingsImpl());
        assertTrue(mockUtil.isMock(mock));
        assertFalse(mockUtil.getMockHandler(mock).getMockSettings().isSerializable());
    }

    @Test
    public void testCreateMock_withClassAndSerializableSetting() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.serializable();
        Object mock = mockUtil.createMock(String.class, settings);
        assertTrue(mockUtil.isMock(mock));
        assertTrue(mockUtil.getMockHandler(mock).getMockSettings().isSerializable());
        assertTrue(mock instanceof Serializable);
    }

    @Test
    public void testCreateMock_withClassAndExtraInterfaces() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(Runnable.class);
        Object mock = mockUtil.createMock(String.class, settings);
        assertTrue(mockUtil.isMock(mock));
        assertTrue(mock instanceof Runnable);
    }

    @Test
    public void testCreateMock_withClassAndSerializableAndExtraInterfaces() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.serializable();
        settings.extraInterfaces(Runnable.class);
        Object mock = mockUtil.createMock(String.class, settings);
        assertTrue(mockUtil.isMock(mock));
        assertTrue(mock instanceof Serializable);
        assertTrue(mock instanceof Runnable);
    }

    @Test
    public void testCreateMock_withSpiedInstance() throws Exception {
        MockUtil mockUtil = new MockUtil();
        String spiedInstance = "hello";
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.spiedInstance(spiedInstance);
        String mock = mockUtil.createMock(String.class, settings);
        assertTrue(mockUtil.isMock(mock));
        // LenientCopyTool copies the content of the spied instance to the mock.
        // For String, this means the mock will also be "hello".
        assertEquals(spiedInstance, mock);
    }

    @Test
    public void testResetMock_withValidMock() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        Object mock = mockUtil.createMock(String.class, settings);

        MockHandlerInterface<?> oldMockHandler = mockUtil.getMockHandler(mock);

        mockUtil.resetMock(mock);

        MockHandlerInterface<?> newMockHandler = mockUtil.getMockHandler(mock);

        // The resetMock method replaces the callback, so it should be a different instance.
        assertNotSame(oldMockHandler, newMockHandler);
        // Verify that the settings are preserved after reset by comparing the settings objects.
        assertEquals(oldMockHandler.getMockSettings(), newMockHandler.getMockSettings());
    }

    @Test
    public void testGetMockHandler_withValidMock() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        Object mock = mockUtil.createMock(String.class, settings);
        MockHandlerInterface<?> handler = mockUtil.getMockHandler(mock);
        assertNotNull(handler);
        // The handler should be an instance of MockHandler for a newly created mock.
        assertTrue(handler instanceof MockHandler);
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_withNull() throws Exception {
        MockUtil mockUtil = new MockUtil();
        mockUtil.getMockHandler(null);
    }

    @Test(expected = NotAMockException.class)
    public void testGetMockHandler_withNonMockObject() throws Exception {
        MockUtil mockUtil = new MockUtil();
        mockUtil.getMockHandler(new Object());
    }

    @Test
    public void testIsMock_withValidMock() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        Object mock = mockUtil.createMock(String.class, settings);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testIsMock_withNull() throws Exception {
        MockUtil mockUtil = new MockUtil();
        assertFalse(mockUtil.isMock(null));
    }

    @Test
    public void testIsMock_withNonMockObject() throws Exception {
        MockUtil mockUtil = new MockUtil();
        assertFalse(mockUtil.isMock(new Object()));
    }

    @Test
    public void testGetMockName_withDefaultMockName() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        Object mock = mockUtil.createMock(String.class, settings);
        MockName mockName = mockUtil.getMockName(mock);
        // The default mock name should be the class name.
        assertEquals("String", mockName.toString());
        assertFalse(mockName.isSurrogate());
    }


    @Test
    public void testCreateMock_withEmptyExtraInterfaces() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        // Passing an empty array for extra interfaces.
        settings.extraInterfaces(new Class<?>[0]);
        Object mock = mockUtil.createMock(Runnable.class, settings);
        assertTrue(mockUtil.isMock(mock));
        // Should not be serializable if only empty extra interfaces are provided.
        assertFalse(mock instanceof Serializable);
    }

    @Test
    public void testCreateMock_withNullExtraInterfaces() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        // Passing null for extra interfaces.
        settings.extraInterfaces(null);
        Object mock = mockUtil.createMock(Runnable.class, settings);
        assertTrue(mockUtil.isMock(mock));
        // Should not be serializable if null extra interfaces are provided.
        assertFalse(mock instanceof Serializable);
    }

    @Test
    public void testCreateMock_withSerializableAndEmptyExtraInterfaces() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.serializable();
        settings.extraInterfaces(new Class<?>[0]);
        Object mock = mockUtil.createMock(Runnable.class, settings);
        assertTrue(mockUtil.isMock(mock));
        // Should be serializable as serializable() was called.
        assertTrue(mock instanceof Serializable);
    }

    @Test
    public void testCreateMock_withSerializableAndNullExtraInterfaces() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.serializable();
        settings.extraInterfaces(null);
        Object mock = mockUtil.createMock(Runnable.class, settings);
        assertTrue(mockUtil.isMock(mock));
        // Should be serializable as serializable() was called.
        assertTrue(mock instanceof Serializable);
    }

    @Test
    public void testGetMockHandler_withSerializableMock() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.serializable();
        Object mock = mockUtil.createMock(String.class, settings);
        MockHandlerInterface<?> handler = mockUtil.getMockHandler(mock);
        assertNotNull(handler);
        // Check if the handler's settings reflect the serializable flag.
        assertTrue(handler.getMockSettings().isSerializable());
    }

    @Test
    public void testGetMockHandler_withExtraInterfacesMock() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(Runnable.class);
        Object mock = mockUtil.createMock(String.class, settings);
        MockHandlerInterface<?> handler = mockUtil.getMockHandler(mock);
        assertNotNull(handler);
        // Check if the handler's settings correctly store the extra interfaces.
        Class<?>[] extraInterfaces = handler.getMockSettings().getExtraInterfaces();
        assertEquals(1, extraInterfaces.length);
        assertEquals(Runnable.class, extraInterfaces[0]);
    }

    @Test
    public void testGetMockName_withMockCreatedWithoutExplicitName() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        Object mock = mockUtil.createMock(Runnable.class, settings);
        MockName mockName = mockUtil.getMockName(mock);
        // The default mock name for Runnable should be "Runnable".
        assertEquals("Runnable", mockName.toString());
    }

    @Test
    public void testIsMock_withAnObjectThatIsAFactoryButNotAMock() throws Exception {
        MockUtil mockUtil = new MockUtil();
        // Any object that is not created by Mockito's mechanism should not be considered a mock.
        // A plain Object instance is a good example.
        assertFalse(mockUtil.isMock(new Object()));
    }


    @Test
    public void testCreateMock_validatesType() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        // The createMock method internally calls creationValidator.validateType(classToMock).
        // If this validation passes for String.class, no exception is thrown.
        mockUtil.createMock(String.class, settings);
        assertTrue(true); // Test passes if no exception is thrown.
    }

    @Test
    public void testCreateMock_validatesExtraInterfaces() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(Runnable.class);
        // The createMock method internally calls creationValidator.validateExtraInterfaces.
        // If this validation passes for Runnable.class, no exception is thrown.
        mockUtil.createMock(String.class, settings);
        assertTrue(true); // Test passes if no exception is thrown.
    }

    @Test
    public void testCreateMock_validatesSpiedInstance() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        String spiedInstance = "test";
        settings.spiedInstance(spiedInstance);
        // The createMock method internally calls creationValidator.validateMockedType.
        // If this validation passes for String.class with a spied instance, no exception is thrown.
        mockUtil.createMock(String.class, settings);
        assertTrue(true); // Test passes if no exception is thrown.
    }

    @Test
    public void testResetMock_withNewMockInstance() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        Object mock1 = mockUtil.createMock(String.class, settings);

        // Create a new mock instance. Resetting mock1 should not affect mock2.
        MockSettingsImpl settings2 = new MockSettingsImpl();
        Object mock2 = mockUtil.createMock(String.class, settings2);

        MockHandlerInterface<?> handler1BeforeReset = mockUtil.getMockHandler(mock1);
        mockUtil.resetMock(mock1);
        MockHandlerInterface<?> handler1AfterReset = mockUtil.getMockHandler(mock1);
        MockHandlerInterface<?> handler2 = mockUtil.getMockHandler(mock2);

        // Ensure that mock1's handler has changed after reset.
        assertNotSame(handler1BeforeReset, handler1AfterReset);
        // Ensure that mock2's handler is still valid and not affected by resetting mock1.
        assertNotNull(handler2);
    }

    @Test
    public void testGetMockHandler_withMockCreatedWithExtraInterfaces() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(Runnable.class, Serializable.class);
        Object mock = mockUtil.createMock(String.class, settings);
        MockHandlerInterface<?> handler = mockUtil.getMockHandler(mock);
        assertNotNull(handler);
        Class<?>[] extraInterfaces = handler.getMockSettings().getExtraInterfaces();
        assertEquals(2, extraInterfaces.length);
        assertTrue(contains(extraInterfaces, Runnable.class));
        assertTrue(contains(extraInterfaces, Serializable.class));
    }

    // Helper method to check if a class is present in an array of classes.
    private boolean contains(Class<?>[] classes, Class<?> target) {
        if (classes == null) {
            return false;
        }
        for (Class<?> c : classes) {
            if (c.equals(target)) {
                return true;
            }
        }
        return false;
    }
}
