package org.mockito.benchmark;

import org.junit.Test;
import org.mockito.exceptions.Reporter;
import org.mockito.exceptions.verification.VerificationInOrderFailure;
import org.mockito.internal.invocation.InvocationBuilder;
import org.mockito.invocation.Invocation;
import org.mockitousage.IMethods;

import static org.mockito.Mockito.mock;

public class Mockito4ChatGPTTest {

    @Test(expected = VerificationInOrderFailure.class)
    public void shouldReportNoMoreInteractionsForMockWithBogusDefaultAnswer() throws Exception {
        IMethods mockWithBogusDefaultAnswer =
                mock(IMethods.class, new org.mockito.internal.stubbing.answers.Returns(false));

        Invocation invocation =
                new InvocationBuilder()
                        .mock(mockWithBogusDefaultAnswer)
                        .toInvocation();

        new Reporter().noMoreInteractionsWantedInOrder(invocation);
    }
}
