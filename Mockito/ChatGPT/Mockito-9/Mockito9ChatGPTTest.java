package org.mockito.benchmark;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.CALLS_REAL_METHODS;
import static org.mockito.Mockito.mock;

import org.junit.Test;

public class Mockito9ChatGPTTest {

    interface Service {
        String abstractMethod();
    }

    @Test
    public void callsRealMethodsShouldReturnDefaultForAbstractMethod() {
        Service service = mock(Service.class, CALLS_REAL_METHODS);

        assertEquals(null, service.abstractMethod());
    }
}
