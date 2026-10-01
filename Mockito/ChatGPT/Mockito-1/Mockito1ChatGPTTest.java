package org.mockito.benchmark;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.matchers.CapturingMatcher;
import org.mockito.invocation.Invocation;
import org.mockitousage.IMethods;
import org.mockitoutil.TestBase;

public class Mockito1ChatGPTTest extends TestBase {

    @Mock
    private IMethods mock;

    @Test
    public void shouldCaptureVarargsArguments() throws Exception {
        // Given
        mock.varargs("first", "second");
        Invocation invocation = getLastInvocation();

        CapturingMatcher capturingMatcher = new CapturingMatcher();

        InvocationMatcher invocationMatcher =
                new InvocationMatcher(
                        invocation,
                        (List) asList(capturingMatcher));

        // When
        invocationMatcher.captureArgumentsFrom(invocation);

        // Then
        assertEquals(1, capturingMatcher.getAllValues().size());
        Object captured = capturingMatcher.getAllValues().get(0);
        assertEquals(String[].class, captured.getClass());
        assertEquals(2, ((String[]) captured).length);
        assertEquals("first", ((String[]) captured)[0]);
        assertEquals("second", ((String[]) captured)[1]);
    }
}
