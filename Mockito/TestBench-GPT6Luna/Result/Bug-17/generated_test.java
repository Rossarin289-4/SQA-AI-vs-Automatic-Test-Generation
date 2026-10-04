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

public class MockSettingsImplTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testSerializableSetsFlagAndReturnsSameSettings() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        assertFalse(settings.isSerializable());
        assertSame(settings, settings.serializable());
        assertTrue(settings.isSerializable());
    }

    @Test
    public void testExtraInterfacesRetainsSuppliedInterfaces() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        Class<?>[] interfaces = new Class<?>[] { Runnable.class, Serializable.class };
        assertSame(settings, settings.extraInterfaces(interfaces));
        assertSame(interfaces, settings.getExtraInterfaces());
        assertEquals(2, settings.getExtraInterfaces().length);
        assertEquals(Runnable.class, settings.getExtraInterfaces()[0]);
        assertEquals(Serializable.class, settings.getExtraInterfaces()[1]);
    }

    @Test
    public void testExtraInterfacesRejectsNullArray() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        try {
            settings.extraInterfaces((Class<?>[]) null);
            fail("expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testExtraInterfacesRejectsEmptyArray() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        try {
            settings.extraInterfaces(new Class<?>[0]);
            fail("expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testExtraInterfacesRejectsNullElement() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        try {
            settings.extraInterfaces(new Class<?>[] { null });
            fail("expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testExtraInterfacesRejectsClass() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        try {
            settings.extraInterfaces(String.class);
            fail("expected exception");
        } catch (RuntimeException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testInitialMockNameIsNull() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        assertNull(settings.getMockName());
    }

    @Test
    public void testNameAndInitiateMockName() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        assertSame(settings, settings.name("sample"));
        settings.initiateMockName(String.class);
        MockName name = settings.getMockName();
        assertNotNull(name);
        assertEquals("sample", name.toString());
    }

    @Test
    public void testInitiateMockNameWithoutExplicitName() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.initiateMockName(String.class);
        assertNotNull(settings.getMockName());
        assertEquals("string", settings.getMockName().toString());
    }

    @Test
    public void testSpiedInstanceIsRetained() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        Object instance = new Object();
        assertSame(settings, settings.spiedInstance(instance));
        assertSame(instance, settings.getSpiedInstance());
    }

    @Test
    public void testNullSpiedInstanceIsRetained() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        assertSame(settings, settings.spiedInstance(null));
        assertNull(settings.getSpiedInstance());
    }

    @Test
    public void testDefaultAnswerIsRetained() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        Answer<Object> answer = null;
        assertSame(settings, settings.defaultAnswer(answer));
        assertSame(answer, settings.getDefaultAnswer());
    }

    @Test
    public void testDefaultAnswerCanBeReplaced() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        Answer<Object> first = null;
        Answer<Object> second = null;
        settings.defaultAnswer(first);
        settings.defaultAnswer(second);
        assertSame(second, settings.getDefaultAnswer());
    }

    @Test
    public void testIsSerializableRemainsFalseWithoutConfiguration() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        assertFalse(settings.isSerializable());
    }

    @Test
    public void testNameCanBeReplacedBeforeInitiation() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name("first");
        settings.name("second");
        settings.initiateMockName(String.class);
        assertEquals("second", settings.getMockName().toString());
    }

    @Test
    public void testExtraInterfacesCanBeReplaced() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(Runnable.class);
        Class<?>[] replacement = new Class<?>[] { Serializable.class };
        settings.extraInterfaces(replacement);
        assertSame(replacement, settings.getExtraInterfaces());
        assertEquals(1, settings.getExtraInterfaces().length);
        assertEquals(Serializable.class, settings.getExtraInterfaces()[0]);
    }

    @Test
    public void testNameAcceptsEmptyString() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name("");
        settings.initiateMockName(String.class);
        assertEquals("", settings.getMockName().toString());
    }

    @Test
    public void testSerializableConfigurationCanBeAppliedAfterOtherSettings() throws Exception {
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name("sample");
        settings.extraInterfaces(Runnable.class);
        assertSame(settings, settings.serializable());
        assertTrue(settings.isSerializable());
        assertEquals(Runnable.class, settings.getExtraInterfaces()[0]);
    }

    @Test
    public void testCreateMockOfRunnableAndRecognizeIt() throws Exception {
        MockUtil util = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        Runnable mock = util.createMock(Runnable.class, settings);
        assertTrue(util.isMock(mock));
        assertNotNull(util.getMockHandler(mock));
    }

    @Test
    public void testCreateMockUsesConfiguredNameForHandler() throws Exception {
        MockUtil util = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name("named");
        Runnable mock = util.createMock(Runnable.class, settings);
        assertEquals("named", util.getMockName(mock).toString());
    }

    @Test
    public void testCreateMockSupportsSerializableSetting() throws Exception {
        MockUtil util = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.serializable();
        Runnable mock = util.createMock(Runnable.class, settings);
        assertTrue(util.isMock(mock));
        assertTrue(mock instanceof Serializable);
    }

    @Test
    public void testCreateMockWithExtraInterface() throws Exception {
        MockUtil util = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.extraInterfaces(Serializable.class);
        Runnable mock = util.createMock(Runnable.class, settings);
        assertTrue(util.isMock(mock));
        assertTrue(mock instanceof Serializable);
    }

    @Test
    public void testIsMockForNullAndOrdinaryObject() throws Exception {
        MockUtil util = new MockUtil();
        assertFalse(util.isMock(null));
        assertFalse(util.isMock(new Object()));
    }

    @Test
    public void testGetMockHandlerRejectsNull() throws Exception {
        MockUtil util = new MockUtil();
        try {
            util.getMockHandler(null);
            fail("expected NotAMockException");
        } catch (NotAMockException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testGetMockHandlerRejectsOrdinaryObject() throws Exception {
        MockUtil util = new MockUtil();
        try {
            util.getMockHandler(new Object());
            fail("expected NotAMockException");
        } catch (NotAMockException expected) {
            assertNotNull(expected);
        }
    }

    @Test
    public void testResetMockRemainsRecognizedAsMock() throws Exception {
        MockUtil util = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        Runnable mock = util.createMock(Runnable.class, settings);
        assertTrue(util.isMock(mock));
        util.resetMock(mock);
        assertTrue(util.isMock(mock));
        assertNotNull(util.getMockHandler(mock));
    }

    @Test
    public void testGetMockHandlerForCreatedMockHasSettings() throws Exception {
        MockUtil util = new MockUtil();
        MockSettingsImpl settings = new MockSettingsImpl();
        settings.name("edge");
        Runnable mock = util.createMock(Runnable.class, settings);
        assertEquals("edge", util.getMockHandler(mock).getMockSettings().getMockName().toString());
    }
}
