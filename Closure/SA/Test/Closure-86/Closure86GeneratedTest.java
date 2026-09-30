package com.google.javascript.jscomp;

import java.util.Enumeration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/** Generated regression-test wrapper for Defects4J Closure-86. */
public class Closure86GeneratedTest extends TestCase {

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

    public void test01() {
        runRegression(
                "com.google.javascript.jscomp.NodeUtilTest",
                "testLocalValue1"
        );
    }

    public void test02() {
        runRegression(
                "com.google.javascript.jscomp.PureFunctionIdentifierTest",
                "testLocalizedSideEffects8"
        );
    }

    public void test03() {
        runRegression(
                "com.google.javascript.jscomp.PureFunctionIdentifierTest",
                "testLocalizedSideEffects9"
        );
    }

    public void test04() {
        runRegression(
                "com.google.javascript.jscomp.PureFunctionIdentifierTest",
                "testAnnotationInExterns_new4"
        );
    }

    public void test05() {
        runRegression(
                "com.google.javascript.jscomp.PureFunctionIdentifierTest",
                "testAnnotationInExterns_new6"
        );
    }

    public void test06() {
        runRegression(
                "com.google.javascript.jscomp.PureFunctionIdentifierTest",
                "testIssue303b"
        );
    }

    public void test07() {
        runRegression(
                "com.google.javascript.jscomp.PureFunctionIdentifierTest",
                "testIssue303"
        );
    }
}
