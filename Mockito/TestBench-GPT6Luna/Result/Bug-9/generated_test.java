package org.mockito.internal.stubbing.answers;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.lang.reflect.Modifier;
import org.mockito.internal.stubbing.defaultanswers.GloballyConfiguredAnswer;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;

public class CallsRealMethodsTest {
    @Test
    public void testHeaderAndContractAreAvailable() throws Exception {
        assertEquals(1, CallsRealMethods.class.getDeclaredMethods().length);
    }
}
