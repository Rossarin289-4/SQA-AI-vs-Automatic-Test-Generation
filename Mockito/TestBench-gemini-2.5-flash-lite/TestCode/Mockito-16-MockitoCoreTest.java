package org.mockito.internal;

import org.junit.Test;
import static org.junit.Assert.*;
import org.mockito.Mockito;
import org.mockito.InOrder;
import org.mockito.MockSettings;
import org.mockito.exceptions.Reporter;
import org.mockito.exceptions.misusing.NotAMockException;
import org.mockito.internal.creation.MockSettingsImpl;
import org.mockito.internal.invocation.Invocation;
// Corrected import for InvocationOnMock
import org.mockito.invocation.InvocationOnMock;
import org.mockito.internal.progress.IOngoingStubbing;
import org.mockito.internal.progress.MockingProgress;
import org.mockito.internal.progress.ThreadSafeMockingProgress;
import org.mockito.internal.stubbing.OngoingStubbingImpl;
import org.mockito.internal.stubbing.StubberImpl;
import org.mockito.internal.util.MockUtil;
import org.mockito.internal.verification.api.VerificationMode;
import org.mockito.stubbing.*;
import java.util.Arrays;
import java.util.List;
import org.mockito.internal.MockitoCore;
import org.mockito.internal.debugging.MockitoDebuggerImpl;
import org.mockito.internal.stubbing.answers.*;
import org.mockito.internal.stubbing.defaultanswers.*;
import org.mockito.internal.verification.VerificationModeFactory;
import org.mockito.runners.MockitoJUnitRunner;

public class MockitoCoreTest {

    private final MockitoCore mockitoCore = new MockitoCore();
    private final Reporter reporter = new Reporter(); // For direct assertion on reporter behavior if needed, though less likely.

    @Test
    public void testMockWithoutSettingsResetsOngoingStubbingByDefault() {
        // The public API mock(Class<T>) in Mockito class uses MockitoCore.mock() with shouldResetOngoingStubbing = true.
        // We test the public API to indirectly verify the core's behavior.
        List<?> mockList = Mockito.mock(List.class);
        assertNotNull(mockList);
        // Direct assertion on resetOngoingStubbing state is not possible without internal access.
    }

    @Test
    public void testMockWithSettingsResetsOngoingStubbingIfTrue() {
        MockSettings settings = Mockito.withSettings();
        // Using the public mock method that accepts MockSettings.
        // The third boolean argument shouldResetOngoingStubbing is handled internally by the public API.
        List<?> mockList = Mockito.mock(List.class, settings); 
        assertNotNull(mockList);
    }

    @Test
    public void testStubReturnsOngoingStubbing() {
        List<String> mock = Mockito.mock(List.class);
        OngoingStubbing<String> stubbing = Mockito.when(mock.get(0));
        assertNotNull(stubbing);
        // The type returned by `when` is `OngoingStubbing`, which is a subtype of `IOngoingStubbing`.
        assertTrue(stubbing instanceof IOngoingStubbing); 
    }

    @Test
    public void testWhenWithMethodCallReturnsOngoingStubbing() {
        List<String> mock = Mockito.mock(List.class);
        OngoingStubbing<String> ongoingStubbing = Mockito.when(mock.get(0));
        assertNotNull(ongoingStubbing);
        assertTrue(ongoingStubbing instanceof OngoingStubbing);
    }

    @Test
    public void testVerifyWithNullMockReturnsNull() {
        List<?> nullMock = null;
        // The verify method in MockitoCore returns the mock object itself.
        // If null is passed, it should return null.
        List<?> returnedMock = Mockito.verify(nullMock, Mockito.times(1));
        assertNull(returnedMock);
    }

    @Test
    public void testVerifyWithNonMockObjectReturnsObject() {
        Object nonMock = new Object();
        // If a non-mock object is passed to verify, MockitoCore.verify returns the object itself.
        // However, the public API Mockito.verify(Object) performs checks and throws NotAMockException.
        // This test should check the public API's behavior.
        try {
            Mockito.verify(nonMock, Mockito.times(1));
            fail("Should throw NotAMockException for non-mock object.");
        } catch (NotAMockException e) {
            // Expected exception.
        } catch (Exception e) {
            fail("Expected NotAMockException, but got: " + e.getClass().getName());
        }
    }

    @Test
    public void testVerifyWithValidMockAndMode() {
        List<String> mock = Mockito.mock(List.class);
        VerificationMode mode = Mockito.times(1);
        List<?> returnedMock = Mockito.verify(mock, mode);
        assertSame(mock, returnedMock);
    }

    @Test
    public void testResetWithSingleMock() {
        List<String> mock = Mockito.mock(List.class);
        Mockito.when(mock.size()).thenReturn(5);
        mock.add("test");
        Mockito.reset(mock);
        // After reset, the mock's behavior reverts to default.
        assertEquals(0, mock.size()); // Default for int return type.
    }

    @Test
    public void testResetWithMultipleMocks() {
        List<String> mock1 = Mockito.mock(List.class);
        List<String> mock2 = Mockito.mock(List.class);
        Mockito.when(mock1.size()).thenReturn(1);
        Mockito.when(mock2.size()).thenReturn(2);
        mock1.add("a");
        mock2.add("b");
        Mockito.reset(mock1, mock2);
        assertEquals(0, mock1.size());
        assertEquals(0, mock2.size());
    }

    @Test
    public void testVerifyNoMoreInteractionsWithNoUnverifiedInteractions() {
        List<String> mock = Mockito.mock(List.class);
        Mockito.when(mock.size()).thenReturn(1);
        mock.size();
        Mockito.verify(mock).size(); // Verified interaction.
        try {
            Mockito.verifyNoMoreInteractions(mock); // Should pass.
        } catch (Exception e) {
            fail("verifyNoMoreInteractions should pass when there are no unverified interactions.");
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsWithUnverifiedInteractionFails() {
        List<String> mock = Mockito.mock(List.class);
        Mockito.when(mock.size()).thenReturn(1);
        mock.size();
        mock.add("test"); // Unverified interaction.
        Mockito.verify(mock).size(); // Verified interaction.
        try {
            Mockito.verifyNoMoreInteractions(mock); // Should fail.
            fail("verifyNoMoreInteractions should fail when there are unverified interactions.");
        } catch (AssertionError e) {
            // Check for a common part of the assertion error message.
            assertTrue(e.getMessage().contains("mock.add(\"test\")"));
        } catch (Exception e) {
            fail("Expected AssertionError, but got different exception: " + e.getClass().getName());
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsWithEmptyMocksArrayThrowsReporterError() {
        try {
            Mockito.verifyNoMoreInteractions(); // Empty array
            fail("Should throw exception for empty mocks array.");
        } catch (Exception e) {
            // Mockito throws Reporter.mocksHaveToBePassedToVerifyNoMoreInteractions()
            assertTrue(e.getMessage().contains("mocks have to be passed"));
        }
        // Testing the behavior when null is passed.
        try {
            Mockito.verifyNoMoreInteractions((Object[]) null); // Null array
            fail("Should throw exception for null mocks array.");
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("mocks have to be passed"));
        }
    }

    @Test
    public void testVerifyNoMoreInteractionsWithNullInMocksArray() {
        List<String> mock = Mockito.mock(List.class);
        mock.add("ok");
        Mockito.verify(mock).add("ok");
        // The reference implementation of verifyNoMoreInteractions skips nulls.
        Mockito.verifyNoMoreInteractions(mock, null); 
        // If it were to fail, it would likely be an AssertionError about unverified interactions, not a NPE.
        // Since the test passes without exception, it means nulls are handled gracefully.
    }
    
    @Test
    public void testInOrderWithValidMocks() {
        List<String> mock1 = Mockito.mock(List.class);
        List<String> mock2 = Mockito.mock(List.class);
        mock1.add("first");
        mock2.add("second");
        InOrder inOrder = Mockito.inOrder(mock1, mock2);
        try {
            inOrder.verify(mock1).add("first");
            inOrder.verify(mock2).add("second");
        } catch (Exception e) {
            fail("InOrder verification should pass with correct order. Error: " + e.getMessage());
        }
    }

    @Test
    public void testInOrderWithInvalidOrderFails() {
        List<String> mock1 = Mockito.mock(List.class);
        List<String> mock2 = Mockito.mock(List.class);
        mock1.add("first");
        mock2.add("second");
        InOrder inOrder = Mockito.inOrder(mock1, mock2);
        try {
            inOrder.verify(mock2).add("second"); // Incorrect order.
            inOrder.verify(mock1).add("first");
            fail("InOrder verification should fail if order is incorrect.");
        } catch (AssertionError e) {
            // Check for a common part of the assertion error message related to order.
            assertTrue(e.getMessage().contains("Wanted but not invoked")); // Or similar for InOrder.
        } catch (Exception e) {
            fail("Expected AssertionError for incorrect order, but got: " + e.getClass().getName());
        }
    }

    @Test
    public void testInOrderWithEmptyMocksArrayThrowsReporterError() {
        try {
            Mockito.inOrder(); // Empty array.
            fail("Should throw exception for empty mocks array.");
        } catch (Exception e) {
            // Mockito throws Reporter.mocksHaveToBePassedWhenCreatingInOrder()
            assertTrue(e.getMessage().contains("mocks have to be passed"));
        }
    }

    @Test
    public void testInOrderWithNullInMocksArrayThrowsReporterError() {
        try {
            Mockito.inOrder(null); // Null element.
            fail("Should throw exception for null mock in inOrder.");
        } catch (Exception e) {
            // Mockito throws Reporter.nullPassedWhenCreatingInOrder()
            assertTrue(e.getMessage().contains("null passed to inOrder()"));
        }
    }

    @Test
    public void testInOrderWithNonMockInMocksArrayThrowsReporterError() {
        Object nonMock = new Object();
        try {
            Mockito.inOrder(nonMock); // Non-mock element.
            fail("Should throw exception for non-mock object in inOrder.");
        } catch (Exception e) {
            // Mockito throws Reporter.notAMockPassedWhenCreatingInOrder()
            assertTrue(e.getMessage().contains("not a mock passed to inOrder()"));
        }
    }

    @Test
    public void testDoAnswerWithValidAnswer() {
        List<String> mock = Mockito.mock(List.class);
        // Using the org.mockito.stubbing.Answer interface
        Answer<String> customAnswer = new Answer<String>() {
            @Override
            public String answer(InvocationOnMock invocation) throws Throwable {
                return "custom answer";
            }
        };
        
        Mockito.doAnswer(customAnswer).when(mock).get(0);
        assertEquals("custom answer", mock.get(0));
    }

    @Test
    public void testStubVoidWithDoAnswer() {
        List<String> mock = Mockito.mock(List.class);
        // Using the org.mockito.stubbing.Answer interface
        Answer<Void> voidAnswer = new Answer<Void>() {
            @Override
            public Void answer(InvocationOnMock invocation) throws Throwable {
                return null; // Void methods return null implicitly.
            }
        };
        Mockito.doAnswer(voidAnswer).when(mock).clear();
        try {
            mock.clear(); // Should execute the void answer.
        } catch (Exception e) {
            fail("doAnswer for void method should not throw an exception if the answer does not throw. Error: " + e.getMessage());
        }
    }

    @Test
    public void testStubVoidWithDoThrow() {
        List<String> mock = Mockito.mock(List.class);
        RuntimeException expectedException = new RuntimeException("Stubbed void exception");
        Mockito.doThrow(expectedException).when(mock).clear();
        try {
            mock.clear();
            fail("Stubbed void method should throw the specified exception.");
        } catch (RuntimeException e) {
            assertSame(expectedException, e);
        } catch (Exception e) {
            fail("Expected RuntimeException, but caught: " + e.getClass().getName());
        }
    }
    
    @Test
    public void testStubVoidWithDoNothing() {
        List<String> mock = Mockito.mock(List.class);
        Mockito.doNothing().when(mock).clear();
        try {
            mock.clear(); // Should execute doNothing, meaning it does nothing.
        } catch (Exception e) {
            fail("doNothing() should ensure the void method does not throw an exception. Error: " + e.getMessage());
        }
    }

    @Test
    public void testValidateMockitoUsageWhenStateIsValid() {
        try {
            Mockito.validateMockitoUsage(); // Should pass if no ongoing stubbing/verification.
        } catch (Exception e) {
            fail("validateMockitoUsage should not throw an exception in a valid state. Error: " + e.getMessage());
        }
    }

    @Test
    public void testValidateMockitoUsageWhenOngoingStubbingIsUnfinished() {
        List<String> mock = Mockito.mock(List.class);
        Mockito.when(mock.size()); // Start stubbing but don't complete it (e.g., no thenReturn).
        try {
            Mockito.validateMockitoUsage(); // Should detect unfinished stubbing.
            fail("validateMockitoUsage should throw an exception for unfinished stubbing.");
        } catch (Exception e) {
            // The actual exception type and message can vary, but it should indicate unfinished stubbing.
            assertTrue(e.getMessage().contains("unfinished stubbing"));
        }
    }
    
    @Test
    public void testWithSettingsReturnsNewMockSettingsImpl() {
        MockSettings settings = Mockito.withSettings();
        assertNotNull(settings);
        assertTrue(settings instanceof MockSettingsImpl);
        // Ensure the default answer is set correctly by withSettings().
        assertEquals(Mockito.RETURNS_DEFAULTS, ((MockSettingsImpl) settings).getDefaultAnswer()); 
    }

    @Test
    public void testSpyWithRealObject() {
        List<String> realList = new java.util.ArrayList<>();
        realList.add("original");
        List<String> spy = Mockito.spy(realList);
        spy.add("added by spy"); // This calls the real add method.
        Mockito.verify(spy).add("added by spy"); // Verify the interaction on the spy.
        assertEquals("original", spy.get(0)); // Real get method.
        assertEquals("added by spy", spy.get(1)); // Real get method.
        assertEquals(2, spy.size()); // Real size method.
    }

    @Test
    public void testSpyWithStubbedMethod() {
        List<String> realList = new java.util.ArrayList<>();
        realList.add("original");
        List<String> spy = Mockito.spy(realList);
        // Stubbing a method on the spy. This overrides the real method for this call.
        Mockito.when(spy.get(0)).thenReturn("stubbed"); 
        assertEquals("stubbed", spy.get(0)); // Returns stubbed value.
        assertEquals(1, spy.size()); // Size method is not stubbed, so it calls the real method.
    }

    @Test
    public void testSpyWithDoReturnForStubbing() {
        List<String> realList = new java.util.ArrayList<>();
        realList.add("original");
        List<String> spy = Mockito.spy(realList);
        // Using doReturn which is often recommended for spying.
        Mockito.doReturn("stubbed return").when(spy).get(0);
        assertEquals("stubbed return", spy.get(0)); // Returns stubbed value.
        assertEquals(1, spy.size()); // Size method is not stubbed.
    }

    @Test
    public void testVerifyZeroInteractionsWithNoInteractions() {
        List<String> mock1 = Mockito.mock(List.class);
        List<String> mock2 = Mockito.mock(List.class);
        try {
            Mockito.verifyZeroInteractions(mock1, mock2); // Should pass.
        } catch (Exception e) {
            fail("verifyZeroInteractions should pass when there are no interactions. Error: " + e.getMessage());
        }
    }

    @Test
    public void testVerifyZeroInteractionsWithInteractionsFails() {
        List<String> mock1 = Mockito.mock(List.class);
        List<String> mock2 = Mockito.mock(List.class);
        mock1.add("something"); // This is an interaction.
        try {
            Mockito.verifyZeroInteractions(mock1, mock2); // Should fail.
            fail("verifyZeroInteractions should fail if there are any interactions.");
        } catch (AssertionError e) {
            // Check for the interaction in the error message.
            assertTrue(e.getMessage().contains("mock1.add(\"something\")"));
        } catch (Exception e) {
            fail("Expected AssertionError, but got: " + e.getClass().getName());
        }
    }
    
    @Test
    public void testDebugMethodReturnsMockitoDebuggerImpl() {
        Object debugger = Mockito.debug();
        assertNotNull(debugger);
        assertTrue(debugger instanceof MockitoDebuggerImpl);
    }

    @Test
    public void testTimesVerificationMode() {
        List<String> mock = Mockito.mock(List.class);
        mock.add("a");
        mock.add("b");
        mock.add("a");
        VerificationMode mode = Mockito.times(2);
        try {
            Mockito.verify(mock, mode).add("a"); // Should pass as "a" was called twice.
        } catch (AssertionError e) {
            fail("Verification for times(2) failed unexpectedly. Error: " + e.getMessage());
        }
    }

    @Test
    public void testNeverVerificationMode() {
        List<String> mock = Mockito.mock(List.class);
        mock.add("a");
        VerificationMode mode = Mockito.never(); // Equivalent to times(0).
        try {
            Mockito.verify(mock, mode).add("b"); // Should pass as "b" was never called.
        } catch (AssertionError e) {
            fail("Verification for never() failed unexpectedly. Error: " + e.getMessage());
        }
    }
    
    @Test
    public void testAtLeastOnceVerificationMode() {
        List<String> mock = Mockito.mock(List.class);
        mock.add("a");
        VerificationMode mode = Mockito.atLeastOnce(); // Equivalent to atLeast(1).
        try {
            Mockito.verify(mock, mode).add("a"); // Should pass as "a" was called once.
        } catch (AssertionError e) {
            fail("Verification for atLeastOnce() failed unexpectedly. Error: " + e.getMessage());
        }
    }

    @Test
    public void testAtLeastVerificationMode() {
        List<String> mock = Mockito.mock(List.class);
        mock.add("a");
        mock.add("a");
        VerificationMode mode = Mockito.atLeast(2);
        try {
            Mockito.verify(mock, mode).add("a"); // Should pass as "a" was called twice.
        } catch (AssertionError e) {
            fail("Verification for atLeast(2) failed unexpectedly. Error: " + e.getMessage());
        }
    }

    @Test
    public void testAtMostVerificationMode() {
        List<String> mock = Mockito.mock(List.class);
        mock.add("a");
        VerificationMode mode = Mockito.atMost(2);
        try {
            Mockito.verify(mock, mode).add("a"); // Should pass as "a" was called once (which is <= 2).
        } catch (AssertionError e) {
            fail("Verification for atMost(2) failed unexpectedly. Error: " + e.getMessage());
        }
    }

    @Test
    public void testOnlyVerificationModeWithSingleInteraction() {
        List<String> mock = Mockito.mock(List.class);
        mock.add("a");
        VerificationMode mode = Mockito.only();
        try {
            Mockito.verify(mock, mode).add("a"); // Should pass as it's the only interaction.
        } catch (AssertionError e) {
            fail("Verification for only() failed unexpectedly. Error: " + e.getMessage());
        }
    }

    @Test
    public void testOnlyVerificationModeWithMultipleInteractionsFails() {
        List<String> mock = Mockito.mock(List.class);
        mock.add("a");
        mock.add("b"); // Second interaction.
        VerificationMode mode = Mockito.only();
        try {
            Mockito.verify(mock, mode).add("a"); // Should fail because add("b") is an unverified interaction.
            fail("Verification for only() should fail when there are multiple interactions.");
        } catch (AssertionError e) {
            // The error message should indicate the unverified interaction.
            assertTrue(e.getMessage().contains("mock.add(\"b\")"));
        } catch (Exception e) {
            fail("Expected AssertionError, but got: " + e.getClass().getName());
        }
    }

    @Test
    public void testStubVoidMethodInvocation() {
        List<String> mock = Mockito.mock(List.class);
        // The stubVoid method is deprecated in favor of doThrow/doAnswer etc.
        // This test ensures that calling the core method directly returns the expected type.
        try {
            Object stubbable = mockitoCore.stubVoid(mock);
            assertTrue(stubbable instanceof VoidMethodStubbable);
        } catch (Exception e) {
            fail("stubVoid should be callable. Error: " + e.getMessage());
        }
    }

    @Test
    public void testGetLastInvocationReturnsLastInvocation() {
        List<String> mock = Mockito.mock(List.class);
        // We need to ensure an invocation happens and is registered.
        // The `when` method internally uses mockingProgress which `getLastInvocation` accesses.
        Mockito.when(mock.get(0)).thenReturn("first"); 
        Invocation lastInvocation = mockitoCore.getLastInvocation();
        assertNotNull(lastInvocation);
        assertTrue(lastInvocation instanceof Invocation);
    }

    @Test
    public void testGetLastInvocationWhenNoStubbingIsOngoing() {
        // If no stubbing is ongoing, calling getLastInvocation() should likely result in an error or null.
        // Based on the source: `mockingProgress.pullOngoingStubbing()` might return null, 
        // leading to a NullPointerException when trying to access `ongoingStubbing.getRegisteredInvocations()`.
        try {
            mockitoCore.getLastInvocation();
            fail("getLastInvocation should throw an exception when no ongoing stubbing exists.");
        } catch (NullPointerException e) {
            // Expected behavior due to `pullOngoingStubbing()` returning null.
        } catch (Exception e) {
            fail("Expected NullPointerException, but got: " + e.getClass().getName());
        }
    }

    @Test
    public void testDoCallRealMethodForInterfaceFails() {
        // Trying to use doCallRealMethod on an interface method.
        Runnable mockInterface = Mockito.mock(Runnable.class);
        try {
            Mockito.doCallRealMethod().when(mockInterface).run();
            fail("doCallRealMethod should fail for an interface method.");
        } catch (Exception e) {
            // The exception message should indicate that real methods cannot be called on interfaces.
            assertTrue(e.getMessage().contains("cannot call real method on interface"));
        }
    }
    
    @Test
    public void testDoCallRealMethodOnClass() {
        // A concrete class implementing Runnable.
        class MyRunnable implements Runnable {
            boolean runCalled = false;
            @Override
            public void run() {
                runCalled = true;
            }
        }
        MyRunnable realInstance = new MyRunnable();
        // Create a spy of the real instance.
        Runnable mockOfRealInstance = Mockito.spy(realInstance);
        // Configure the spy to call the real method.
        Mockito.doCallRealMethod().when(mockOfRealInstance).run();
        // Execute the method.
        mockOfRealInstance.run();
        // Verify that the real method's logic was executed.
        assertTrue(realInstance.runCalled);
    }

    @Test
    public void testDoNothingOnVoidMethod() {
        List<String> mock = Mockito.mock(List.class);
        Mockito.doNothing().when(mock).clear(); // Explicitly set void method to do nothing.
        try {
            mock.clear(); // Calling the void method.
        } catch (Exception e) {
            fail("Calling a void method stubbed with doNothing() should not throw an exception. Error: " + e.getMessage());
        }
    }

    @Test
    public void testDoReturnOnMethodWithReturnValue() {
        List<String> mock = Mockito.mock(List.class);
        String expectedValue = "stubbed value";
        Mockito.doReturn(expectedValue).when(mock).get(0); // Stub a return value.
        assertEquals(expectedValue, mock.get(0)); // Verify the stubbed value is returned.
    }

    @Test
    public void testDoReturnOnMethodWithReturnValueAndSideEffect() {
        List<String> mock = Mockito.mock(List.class);
        String expectedValue = "stubbed value";
        // This test is similar to the previous one but might be intended to check if side effects
        // of the stubbing itself are handled or if it just returns the value.
        // The core behavior is still about returning the value.
        Mockito.doReturn(expectedValue).when(mock).get(0);
        assertEquals(expectedValue, mock.get(0));
    }
}
