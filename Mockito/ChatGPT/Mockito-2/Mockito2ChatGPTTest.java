package org.mockito.benchmark;

import org.junit.Test;
import org.mockito.exceptions.misusing.FriendlyReminderException;
import org.mockito.internal.util.Timer;

public class Mockito2ChatGPTTest {

    @Test(expected = FriendlyReminderException.class)
    public void shouldRejectNegativeTimerDuration() {
        new Timer(-1);
    }
}
