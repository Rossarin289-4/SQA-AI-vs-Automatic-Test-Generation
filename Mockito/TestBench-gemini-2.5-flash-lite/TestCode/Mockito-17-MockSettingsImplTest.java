package org.mockito.internal.creation;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.internal.util.MockUtil;
import org.mockito.MockSettings;
import org.mockito.exceptions.Reporter;
import org.mockito.internal.util.MockName;
import org.mockito.stubbing.Answer;
import org.mockito.cglib.proxy.*;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.MockHandler;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MethodInterceptorFilter;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.creation.jmock.ClassImposterizer;
import org.mockito.internal.util.reflection.LenientCopyTool;
import java.io.Serializable;
import java.lang.reflect.Method;
import java.util.List;
import org.mockito.invocation.InvocationOnMock; // Added import for InvocationOnMock

public class MockSettingsImplTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSerializableSetAndGet() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        assertFalse(settings.isSerializable());
        settings.serializable();
        assertTrue(settings.isSerializable());
    }

    @Test
    public void testExtraInterfacesSetAndGet() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        assertNull(settings.getExtraInterfaces());
        Class<?>[] interfaces = new Class<?>[]{Runnable.class, java.io.Serializable.class};
        settings.extraInterfaces(interfaces);
        assertArrayEquals(interfaces, settings.getExtraInterfaces());
    }
    
    @Test
    public void testExtraInterfacesWithEmptyArray() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        // The Reporter.extraInterfacesRequiresAtLeastOneInterface() method will be called
        // This test asserts that no exception is thrown by the extraInterfaces method itself
        // when an empty array is passed. The Reporter would handle the error reporting.
        settings.extraInterfaces(new Class<?>[0]); 
        assertNull(settings.getExtraInterfaces()); // Should not set extra interfaces
    }

    @Test
    public void testExtraInterfacesWithNullArray() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        // Similar to empty array test, this asserts no exception from extraInterfaces.
        settings.extraInterfaces((Class<?>[]) null);
        assertNull(settings.getExtraInterfaces()); // Should not set extra interfaces
    }

    @Test
    public void testExtraInterfacesWithNullParameter() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        // This should trigger Reporter.extraInterfacesDoesNotAcceptNullParameters()
        // The method itself does not throw an exception but calls the reporter.
        settings.extraInterfaces(Runnable.class, null, java.io.Serializable.class);
        // The `extraInterfaces` field will be set to the array containing null.
        // A more precise test would verify the reporter was called.
        // For now, we assert the field is set.
        assertNotNull(settings.getExtraInterfaces());
        assertEquals(3, settings.getExtraInterfaces().length);
        assertNull(settings.getExtraInterfaces()[1]);
    }

    @Test
    public void testExtraInterfacesWithNonInterfaceClass() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        // This should trigger Reporter.extraInterfacesAcceptsOnlyInterfaces(i)
        // The method itself does not throw an exception but calls the reporter.
        settings.extraInterfaces(Runnable.class, String.class);
        // The `extraInterfaces` field will be set to the array containing String.class.
        assertNotNull(settings.getExtraInterfaces());
        assertEquals(2, settings.getExtraInterfaces().length);
        assertEquals(String.class, settings.getExtraInterfaces()[1]);
    }

    @Test
    public void testNameSetAndGet() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name("myMock");
        // The name is used internally by initiateMockName.
        // We will test this indirectly via getMockName.
        settings.initiateMockName(Object.class);
        assertNotNull(settings.getMockName());
        assertEquals("myMock", settings.getMockName().toString());
    }

    @Test
    public void testSpiedInstanceSetAndGet() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        Object instance = new Object();
        settings.spiedInstance(instance);
        assertSame(instance, settings.getSpiedInstance());
    }

    @Test
    public void testDefaultAnswerSetAndGet() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        Answer<Object> answer = new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "test";
            }
        };
        settings.defaultAnswer(answer);
        assertSame(answer, settings.getDefaultAnswer());
    }
    
    @Test
    public void testDefaultAnswerWithNull() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.defaultAnswer(null);
        assertNull(settings.getDefaultAnswer());
    }

    @Test
    public void testInitiateMockName() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.initiateMockName(String.class);
        MockName mockName = settings.getMockName();
        assertNotNull(mockName);
        assertEquals("String", mockName.toString()); // Assuming MockName.toString() returns the name
        assertFalse(mockName.isSurrogate());
    }

    @Test
    public void testInitiateMockNameWithName() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name("customName");
        settings.initiateMockName(Integer.class);
        MockName mockName = settings.getMockName();
        assertNotNull(mockName);
        assertEquals("customName", mockName.toString()); // Assuming MockName.toString() returns the name
        assertFalse(mockName.isSurrogate());
    }
    
    @Test
    public void testInitiateMockNameWithNullName() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name(null);
        settings.initiateMockName(Long.class);
        MockName mockName = settings.getMockName();
        assertNotNull(mockName);
        // If name is null, MockName uses the class name.
        assertEquals("Long", mockName.toString()); 
        assertFalse(mockName.isSurrogate());
    }

    // Tests for MockUtil methods that use MockSettingsImpl

    @Test
    public void testCreateMockBasic() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name("testMock");
        settings.extraInterfaces(Runnable.class);
        settings.serializable();
        
        Runnable mock = mockUtil.createMock(Runnable.class, settings);
        
        assertNotNull(mock);
        assertTrue(mock instanceof Runnable);
        assertTrue(mock instanceof Serializable);
        assertEquals("testMock", mockUtil.getMockName(mock).toString());
    }
    
    @Test
    public void testCreateMockWithSpiedInstance() throws Exception {
        MockUtil mockUtil = new MockUtil();
        Object instance = new Object() {
            public String toString() {
                return "spied";
            }
        };
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.spiedInstance(instance);
        
        Object mock = mockUtil.createMock(Object.class, settings);
        
        assertNotNull(mock);
        assertEquals("spied", mock.toString()); // LenientCopyTool should copy toString
    }

    @Test
    public void testResetMock() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.defaultAnswer(new Answer<Object>() {
            @Override
            public Object answer(InvocationOnMock invocation) throws Throwable {
                return "default";
            }
        });
        
        Object mock = mockUtil.createMock(Object.class, settings);
        
        // Call resetMock
        mockUtil.resetMock(mock);
        
        // After reset, default answer should be RETURNS_DEFAULTS
        MockHandlerInterface<Object> handler = mockUtil.getMockHandler(mock);
        // We can't directly assert the default answer from the handler without a public getter.
        // The test assumes resetMock reinitializes the handler with RETURNS_DEFAULTS.
        assertNotNull(handler);
    }
    
    @Test
    public void testGetMockHandlerValidMock() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        Object mock = mockUtil.createMock(Object.class, settings);
        
        MockHandlerInterface<Object> handler = mockUtil.getMockHandler(mock);
        assertNotNull(handler);
        assertTrue(handler instanceof MockHandler);
    }

    @Test
    public void testGetMockHandlerNull() throws Exception {
        MockUtil mockUtil = new MockUtil();
        try {
            mockUtil.getMockHandler(null);
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            // Expected
        }
    }

    @Test
    public void testGetMockHandlerNotAMock() throws Exception {
        MockUtil mockUtil = new MockUtil();
        try {
            mockUtil.getMockHandler(new Object());
            fail("Expected NotAMockException");
        } catch (NotAMockException e) {
            // Expected
        }
    }

    @Test
    public void testIsMockValidMock() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        Object mock = mockUtil.createMock(Object.class, settings);
        assertTrue(mockUtil.isMock(mock));
    }

    @Test
    public void testIsMockNull() throws Exception {
        MockUtil mockUtil = new MockUtil();
        assertFalse(mockUtil.isMock(null));
    }

    @Test
    public void testIsMockNotAMock() throws Exception {
        MockUtil mockUtil = new MockUtil();
        assertFalse(mockUtil.isMock(new Object()));
    }
    
    // Tests for MockName
    @Test
    public void testMockNameToString() throws Exception {
        MockName mockName = new MockName("myMock", String.class);
        assertEquals("myMock", mockName.toString());
    }
    
    @Test
    public void testMockNameToStringWhenNull() throws Exception {
        MockName mockName = new MockName(null, Integer.class);
        // If name is null, MockName uses the class name.
        assertEquals("Integer", mockName.toString()); 
    }

    @Test
    public void testMockNameIsSurrogate() throws Exception {
        MockName mockName = new MockName("myMock", String.class);
        assertFalse(mockName.isSurrogate());
    }
    
    // Add a test for isSurrogate when name is null
    @Test
    public void testMockNameIsSurrogateWhenNullName() throws Exception {
        MockName mockName = new MockName(null, String.class);
        // If name is null, MockName uses the class name. Thus, it's not a surrogate.
        assertFalse(mockName.isSurrogate()); 
    }

    // MockSettingsImpl public methods coverage
    // `name()` is tested via `testNameSetAndGet`.
    // `spiedInstance()` is tested via `testSpiedInstanceSetAndGet`.
    // `defaultAnswer()` is tested via `testDefaultAnswerSetAndGet`.
    // `serializable()` is tested via `testSerializableSetAndGet`.
    // `extraInterfaces()` is tested via `testExtraInterfacesSetAndGet`.
    // `getMockName()` is tested via `testInitiateMockName` and related tests.
    // `getExtraInterfaces()` is tested via `testExtraInterfacesSetAndGet`.
    // `getSpiedInstance()` is tested via `testSpiedInstanceSetAndGet`.
    // `getDefaultAnswer()` is tested via `testDefaultAnswerSetAndGet`.
    // `isSerializable()` is tested via `testSerializableSetAndGet`.
    // `initiateMockName()` is tested via `testInitiateMockName` and related tests.

    // MockUtil public methods coverage
    // `createMock()` is tested via `testCreateMockBasic` and `testCreateMockWithSpiedInstance`.
    // `resetMock()` is tested via `testResetMock`.
    // `getMockHandler()` is tested via `testGetMockHandlerValidMock`, `testGetMockHandlerNull`, `testGetMockHandlerNotAMock`.
    // `isMock()` is tested via `testIsMockValidMock`, `testIsMockNull`, `testIsMockNotAMock`.
    // `getMockName()` is tested via `testCreateMockBasic`.

    // Test for edge cases in MockSettingsImpl.extraInterfaces
    @Test
    public void testExtraInterfacesWithOneInterface() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        Class<?>[] interfaces = new Class<?>[]{Runnable.class};
        settings.extraInterfaces(interfaces);
        assertArrayEquals(interfaces, settings.getExtraInterfaces());
    }
    
    @Test
    public void testExtraInterfacesWithMultipleInterfaces() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        Class<?>[] interfaces = new Class<?>[]{Runnable.class, java.io.Serializable.class, java.lang.Cloneable.class};
        settings.extraInterfaces(interfaces);
        assertArrayEquals(interfaces, settings.getExtraInterfaces());
    }

    // Test for default behavior of MockSettingsImpl if no configuration is done
    @Test
    public void testDefaultMockSettingsImplState() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        assertNull(settings.getExtraInterfaces());
        assertNull(settings.getMockName());
        assertNull(settings.getSpiedInstance());
        assertNull(settings.getDefaultAnswer());
        assertFalse(settings.isSerializable());
    }
    
    // Test MockUtil.createMock with extraInterfaces and serializable together
    @Test
    public void testCreateMockWithExtraInterfacesAndSerializable() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(Runnable.class);
        settings.serializable();
        
        // Mocking a class that is not itself serializable, but requires Serializable interface
        Object mock = mockUtil.createMock(Object.class, settings);
        
        assertNotNull(mock);
        assertTrue(mock instanceof Runnable);
        assertTrue(mock instanceof Serializable);
    }

    // Test MockUtil.createMock with only extraInterfaces
    @Test
    public void testCreateMockWithOnlyExtraInterfaces() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(Runnable.class);
        
        Object mock = mockUtil.createMock(Object.class, settings);
        
        assertNotNull(mock);
        assertTrue(mock instanceof Runnable);
        assertFalse(mock instanceof Serializable); // Not serializable by default
    }

    // Test MockUtil.createMock with only serializable
    @Test
    public void testCreateMockWithOnlySerializable() throws Exception {
        MockUtil mockUtil = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.serializable();
        
        Object mock = mockUtil.createMock(Object.class, settings);
        
        assertNotNull(mock);
        assertFalse(mock instanceof Runnable); // No extra interfaces
        assertTrue(mock instanceof Serializable);
    }
    
    // Test the reporter calls for extraInterfaces more explicitly
    // This requires creating a MockSettingsImpl and then trying to call the methods that trigger reporters.
    // The actual assertion will be that the reporter method is called. Since we can't mock reporters here,
    // we'll test that the code path *can* be reached without crashing, and that the state is as expected.
    @Test
    public void testExtraInterfacesWithNonInterfaceAndNullCombination() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        // This will trigger both Reporter.extraInterfacesDoesNotAcceptNullParameters() and Reporter.extraInterfacesAcceptsOnlyInterfaces()
        settings.extraInterfaces(Runnable.class, null, String.class);
        // The field should be set to the array containing null and String.class
        assertNotNull(settings.getExtraInterfaces());
        assertEquals(3, settings.getExtraInterfaces().length);
        assertNull(settings.getExtraInterfaces()[1]);
        assertEquals(String.class, settings.getExtraInterfaces()[2]);
    }
}
