package org.mockito.benchmark;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.exceptions.verification.NeverWantedButInvoked;

public class Mockito13ChatGPTTest {

    private interface Methods {
        String otherMethod();
        void simpleMethod(String value);
    }

    @Test
    public void shouldKeepVerificationWhenAnotherMockIsCalledDuringArgumentEvaluation() {
        Methods firstMock = mock(Methods.class);
        Methods secondMock = mock(Methods.class);

        when(firstMock.otherMethod()).thenReturn("foo");

        secondMock.simpleMethod("foo");

        verify(secondMock).simpleMethod(firstMock.otherMethod());

        try {
            verify(secondMock, never()).simpleMethod(firstMock.otherMethod());
            throw new AssertionError("Expected NeverWantedButInvoked");
        } catch (NeverWantedButInvoked expected) {
        }
    }
}
