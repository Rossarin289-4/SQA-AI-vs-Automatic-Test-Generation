```java
package org.mockito.internal.stubbing.defaultanswers;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.MockSettings;
import org.mockito.Mockito;
import org.mockito.internal.InternalMockHandler;
import org.mockito.internal.MockitoCore;
import org.mockito.internal.creation.settings.CreationSettings;
import org.mockito.internal.stubbing.InvocationContainerImpl;
import org.mockito.internal.stubbing.StubbedInvocationMatcher;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.util.reflection.GenericMetadataSupport;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.mock.MockCreationSettings;
import org.mockito.stubbing.Answer;
import java.io.IOException;
import java.io.Serializable;

public class ReturnsDeepStubsTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    public interface Leaf {
        String value();
    }

    public interface Branch {
        Leaf leaf();
    }

    public interface Root {
        Branch branch();
        Branch otherBranch();
    }

    @Test
    public void testRepeatedCallReturnsSameDeepStub() throws Exception {
        Root root = Mockito.mock(Root.class, Mockito.RETURNS_DEEP_STUBS);
        Branch first = root.branch();
        Branch second = root.branch();
        assertSame(first, second);
    }

    @Test
    public void testSeparateCallsHaveSeparateDeepStubs() throws Exception {
        Root root = Mockito.mock(Root.class, Mockito.RETURNS_DEEP_STUBS);
        assertNotSame(root.branch(), root.otherBranch());
    }
}
```