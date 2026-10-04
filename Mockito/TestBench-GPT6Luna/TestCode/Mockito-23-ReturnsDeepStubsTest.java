package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import org.mockito.MockSettings;
import org.mockito.internal.InternalMockHandler;
import org.mockito.internal.MockitoCore;
import org.mockito.internal.creation.settings.CreationSettings;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class ReturnsDeepStubsTest {
    @Test
    public void testReferenceHeaderOnly() throws Exception {
        assertTrue(true);
    }
}
