package com.google.javascript.jscomp;

import java.util.Enumeration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * Baseline wrapper prepared by ChatGPT from existing regression tests for Defects4J Closure-7.
 */
public class Closure7GeminiTest extends TestCase {

    @SuppressWarnings("unchecked")
    private void runRegression(String className, String methodName) {
        try {
            Class<?> loadedClass = Class.forName(className.indexOf('.') >= 0 ? className : "com.google.javascript.jscomp." + className);

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

                message.append(className)
                        .append("::")
                        .append(methodName);

                Enumeration<TestFailure> failures = result.failures();

                if (failures.hasMoreElements()) {
                    TestFailure failure = failures.nextElement();

                    message.append(" failed: ")
                            .append(failure.exceptionMessage());
                }

                Enumeration<TestFailure> errors = result.errors();

                if (errors.hasMoreElements()) {
                    TestFailure error = errors.nextElement();

                    message.append(" error: ")
                            .append(error.exceptionMessage());
                }

                fail(message.toString());
            }

        } catch (ClassNotFoundException e) {
            fail("Test class not found: " + className);
        }
    }

    // TC01
    public void test01() {
        runRegression(
                "ClosureReverseAbstractInterpreterTest",
                "testGoogIsFunction2");
    }

    // TC02
    public void test02() {
        runRegression(
                "SemanticReverseAbstractInterpreterTest",
                "testTypeof3");
    }
}