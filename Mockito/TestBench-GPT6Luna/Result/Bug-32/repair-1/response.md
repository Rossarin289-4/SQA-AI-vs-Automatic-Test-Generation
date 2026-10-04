```java
package org.mockito.internal.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.configuration.AnnotationEngine;
import org.mockito.exceptions.Reporter;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.internal.util.MockUtil;

public class SpyAnnotationEngineTest {
    public static class Sample {
        public int value() { return 7; }
    }

    static class SpyField {
        @Spy Sample sample = new Sample();
    }

    static class NullSpyField {
        @Spy Sample sample;
    }

    static class PlainField {
        Sample sample = new Sample();
    }

    static class AlreadyMockedField {
        @Spy Sample sample = Mockito.mock(Sample.class);
    }

    static class MockAndSpyField {
        @Spy @Mock Sample sample = new Sample();
    }

    static class CaptorAndSpyField {
        @Spy @Captor Sample sample = new Sample();
    }

    @Test
    public void testCreateMockForReturnsNull() throws Exception {
        SpyAnnotationEngine engine = new SpyAnnotationEngine();
        Field field = PlainField.class.getDeclaredField("sample");
        assertNull(engine.createMockFor(null, field));
    }

    @Test
    public void testProcessLeavesUnannotatedFieldAlone() throws Exception {
        PlainField holder = new PlainField();
        Sample original = holder.sample;
        new SpyAnnotationEngine().process(PlainField.class, holder);
        assertSame(original, holder.sample);
    }

    @Test
    public void testProcessWrapsInitializedSpyAndCallsRealMethod() throws Exception {
        SpyField holder = new SpyField();
        Sample original = holder.sample;
        new SpyAnnotationEngine().process(SpyField.class, holder);
        assertNotSame(original, holder.sample);
        assertEquals(7, holder.sample.value());
    }

    @Test
    public void testProcessNullSpyThrowsMockitoException() throws Exception {
        NullSpyField holder = new NullSpyField();
        try {
            new SpyAnnotationEngine().process(NullSpyField.class, holder);
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertTrue(expected.getMessage().contains("instance"));
        }
    }

    @Test
    public void testProcessNullSpyRestoresAccessibility() throws Exception {
        Field field = NullSpyField.class.getDeclaredField("sample");
        boolean before = field.isAccessible();
        try {
            new SpyAnnotationEngine().process(NullSpyField.class, new NullSpyField());
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertEquals(before, field.isAccessible());
        }
    }

    @Test
    public void testProcessResetsAlreadyMockedSpy() throws Exception {
        AlreadyMockedField holder = new AlreadyMockedField();
        Sample mock = holder.sample;
        Mockito.when(mock.value()).thenReturn(19);
        assertEquals(19, holder.sample.value());
        new SpyAnnotationEngine().process(AlreadyMockedField.class, holder);
        assertSame(mock, holder.sample);
        assertEquals(0, holder.sample.value());
    }

    @Test
    public void testProcessSpyRestoresFieldAccessibility() throws Exception {
        Field field = SpyField.class.getDeclaredField("sample");
        boolean before = field.isAccessible();
        new SpyAnnotationEngine().process(SpyField.class, new SpyField());
        assertEquals(before, field.isAccessible());
    }

    @Test
    public void testProcessRejectsSpyAndMockCombination() throws Exception {
        try {
            new SpyAnnotationEngine().process(MockAndSpyField.class, new MockAndSpyField());
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testProcessRejectsSpyAndCaptorCombination() throws Exception {
        try {
            new SpyAnnotationEngine().process(CaptorAndSpyField.class, new CaptorAndSpyField());
            fail("expected MockitoException");
        } catch (MockitoException expected) {
            assertNotNull(expected.getMessage());
        }
    }

    @Test
    public void testProcessDoesNotChangePlainFieldAfterSpyProcessing() throws Exception {
        PlainField holder = new PlainField();
        Sample original = holder.sample;
        new SpyAnnotationEngine().process(PlainField.class, holder);
        assertEquals(7, holder.sample.value());
        assertSame(original, holder.sample);
    }

    @Test
    public void testRepeatedProcessKeepsSpyAndRealBehavior() throws Exception {
        SpyField holder = new SpyField();
        new SpyAnnotationEngine().process(SpyField.class, holder);
        Sample spy = holder.sample;
        new SpyAnnotationEngine().process(SpyField.class, holder);
        assertSame(spy, holder.sample);
        assertEquals(7, holder.sample.value());
    }
}
```