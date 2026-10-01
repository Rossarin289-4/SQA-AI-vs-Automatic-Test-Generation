package org.mockito.benchmark;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.mockito.internal.invocation.InvocationMatcher;
import org.mockito.internal.matchers.CapturingMatcher;
import org.mockito.invocation.Invocation;
import org.mockitousage.IMethods;
import org.mockitoutil.TestBase;
import org.mockito.Mock;

public class Mockito3ChatGPTTest extends TestBase {

    @Mock
    private IMethods mock;

    @Test
    public void shouldCaptureEachVarargArgumentIndividually() throws Exception {
        // Given
        mock.mixedVarargs(1, "a", "b");
        Invocation invocation = getLastInvocation();

        CapturingMatcher capturingMatcher = new CapturingMatcher();

        InvocationMatcher invocationMatcher =
                new InvocationMatcher(
                        invocation,
                        (List) asList(
                                new org.mockito.internal.matchers.Equals(1),
                                capturingMatcher));

        // When
        invocationMatcher.captureArgumentsFrom(invocation);

        // Then
        assertEquals(2, capturingMatcher.getAllValues().size());
        assertEquals("a", capturingMatcher.getAllValues().get(0));
        assertEquals("b", capturingMatcher.getAllValues().get(1));
    }
}
