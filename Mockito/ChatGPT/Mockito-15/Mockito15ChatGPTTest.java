package org.mockito.benchmark;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class Mockito15ChatGPTTest {

    @Mock
    private List<?> dependency;

    @InjectMocks
    private Target target;

    @Test
    public void shouldInjectUsingPropertySetterBeforeFieldAccess() {
        MockitoAnnotations.initMocks(this);

        assertTrue(target.setterUsed);
    }

    static class Target {
        List<?> dependency;
        boolean setterUsed;

        public void setDependency(List<?> dependency) {
            setterUsed = true;
        }
    }
}
