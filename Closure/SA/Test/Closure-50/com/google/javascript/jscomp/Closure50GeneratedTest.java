package com.google.javascript.jscomp;

import java.util.Enumeration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/** Generated candidate regression tests for Defects4J Closure-50. */
public class Closure50GeneratedTest extends TestCase {

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
                message.append(className)
                       .append("::")
                       .append(methodName);

                Enumeration<TestFailure> failures = result.failures();

                if (failures.hasMoreElements()) {
                    message.append(" failed: ")
                           .append(failures.nextElement().exceptionMessage());
                }

                Enumeration<TestFailure> errors = result.errors();

                if (errors.hasMoreElements()) {
                    message.append(" error: ")
                           .append(errors.nextElement().exceptionMessage());
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
                "com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest",
                "testStringJoinAdd");
    }

    // TC02
    public void test02() {
        runRegression(
                "com.google.javascript.jscomp.PeepholeReplaceKnownMethodsTest",
                "testNoStringJoin");
    }
}