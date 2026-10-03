package com.google.javascript.jscomp;

import java.util.Enumeration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/** Generated regression wrapper for Defects4J Closure-63. */
public class Closure63GeneratedTest extends TestCase {

    @SuppressWarnings("unchecked")
    private void runRegression(String className, String methodName) {
        try {
            Class<?> loadedClass = Class.forName(className);
            if (!TestCase.class.isAssignableFrom(loadedClass)) {
                fail(className + " is not a JUnit TestCase");
                return;
            }
            Class<? extends TestCase> testClass =
                    (Class<? extends TestCase>) loadedClass;
            Test test = TestSuite.createTest(testClass, methodName);
            TestResult result = new TestResult();
            test.run(result);
            if (!result.wasSuccessful()) {
                StringBuffer message = new StringBuffer();
                message.append(className).append("::").append(methodName);
                Enumeration<TestFailure> failures = result.failures();
                if (failures.hasMoreElements()) {
                    TestFailure failure = failures.nextElement();
                    message.append(" failed: ").append(failure.exceptionMessage());
                }
                Enumeration<TestFailure> errors = result.errors();
                if (errors.hasMoreElements()) {
                    TestFailure error = errors.nextElement();
                    message.append(" error: ").append(error.exceptionMessage());
                }
                fail(message.toString());
            }
        } catch (ClassNotFoundException e) {
            fail("Test class not found: " + className);
        }
    }

    // No failing-test name was provided in the supplied Closure-63 data.
    // Intentionally left without fabricated test cases.
}
