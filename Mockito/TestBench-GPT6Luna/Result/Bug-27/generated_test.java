package org.mockito.internal.util;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.cglib.proxy.Callback;
import org.mockito.cglib.proxy.Factory;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.InvocationNotifierHandler;
import org.mockito.internal.MockHandler;
import org.mockito.internal.MockHandlerInterface;
import org.mockito.internal.creation.MethodInterceptorFilter;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.creation.jmock.ClassImposterizer;
import org.mockito.internal.util.reflection.LenientCopyTool;
import java.io.Serializable;

public class MockUtilTest {
    @Test
    public void testIsMockForNull() throws Exception {
        assertFalse(new MockUtil().isMock(null));
    }

    @Test
    public void testIsMockForOrdinaryObject() throws Exception {
        assertFalse(new MockUtil().isMock(new Object()));
    }

    @Test
    public void testGetMockHandlerRejectsNull() throws Exception {
        try {
            new MockUtil().getMockHandler(null);
            fail("expected NotAMockException");
        } catch (NotAMockException expected) {
        }
    }

    @Test
    public void testGetMockHandlerRejectsOrdinaryObject() throws Exception {
        try {
            new MockUtil().getMockHandler(new Object());
            fail("expected NotAMockException");
        } catch (NotAMockException expected) {
        }
    }

    @Test
    public void testGetMockNameRejectsNull() throws Exception {
        try {
            new MockUtil().getMockName(null);
            fail("expected NotAMockException");
        } catch (NotAMockException expected) {
        }
    }

    @Test
    public void testCreatedMockIsRecognized() throws Exception {
        MockUtil util = new MockUtil();
        Object mock = util.createMock(Object.class, new MockSettingsImpl());
        assertTrue(util.isMock(mock));
    }

    @Test
    public void testCreatedMockHasHandler() throws Exception {
        MockUtil util = new MockUtil();
        Object mock = util.createMock(Object.class, new MockSettingsImpl());
        assertNotNull(util.getMockHandler(mock));
    }

    @Test
    public void testCreatedMockHasName() throws Exception {
        MockUtil util = new MockUtil();
        Object mock = util.createMock(Object.class, new MockSettingsImpl());
        assertNotNull(util.getMockName(mock));
    }

    @Test
    public void testCreatedMockHandlerIsStable() throws Exception {
        MockUtil util = new MockUtil();
        Object mock = util.createMock(Object.class, new MockSettingsImpl());
        assertSame(util.getMockHandler(mock), util.getMockHandler(mock));
    }

    @Test
    public void testResetPreservesMockRecognition() throws Exception {
        MockUtil util = new MockUtil();
        Object mock = util.createMock(Object.class, new MockSettingsImpl());
        util.resetMock(mock);
        assertTrue(util.isMock(mock));
    }

    @Test
    public void testResetPreservesMockName() throws Exception {
        MockUtil util = new MockUtil();
        Object mock = util.createMock(Object.class, new MockSettingsImpl());
        MockName name = util.getMockName(mock);
        util.resetMock(mock);
        assertEquals(name.toString(), util.getMockName(mock).toString());
    }

    @Test
    public void testResetProvidesHandler() throws Exception {
        MockUtil util = new MockUtil();
        Object mock = util.createMock(Object.class, new MockSettingsImpl());
        util.resetMock(mock);
        assertNotNull(util.getMockHandler(mock));
    }
}
