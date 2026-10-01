package org.mockito.benchmark;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class Mockito6ChatGPTTest {

    private interface IntegerService {
        String forInteger(Integer value);
    }

    @Test
    public void anyIntShouldNotMatchNullInteger() {
        IntegerService mock = mock(IntegerService.class);

        when(mock.forInteger(anyInt())).thenReturn("matched");

        assertEquals(null, mock.forInteger(null));
    }
}
