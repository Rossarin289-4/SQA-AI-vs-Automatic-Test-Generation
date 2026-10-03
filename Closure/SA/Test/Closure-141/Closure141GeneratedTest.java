package com.google.javascript.jscomp;

import java.util.Enumeration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/** Generated regression-test wrapper for Defects4J Closure-141. */
public class Closure141GeneratedTest extends TestCase {

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
                "com.google.javascript.jscomp.ExpresssionDecomposerTest",
                "testCanExposeExpression2");
    }

    public void test02() {
        runRegression(
                "com.google.javascript.jscomp.ExpresssionDecomposerTest",
                "testCanExposeExpression7");
    }

    public void test03() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testDecomposeAnonymousInCall");
    }

    public void test04() {
        runRegression(
                "com.google.javascript.jscomp.PureFunctionIdentifierTest",
                "testCallFunctionFOrGViaHookWithSideEffects");
    }

    public void test05() {
        runRegression(
                "com.google.javascript.jscomp.PureFunctionIdentifierTest",
                "testCallFunctionForGorH");
    }

    public void test06() {
        runRegression(
                "com.google.javascript.jscomp.PureFunctionIdentifierTest",
                "testCallFunctionFOrG");
    }

    public void test07() {
        runRegression(
                "com.google.javascript.jscomp.PureFunctionIdentifierTest",
                "testCallFunctionFOrGViaHook");
    }

    public void test08() {
        runRegression(
                "com.google.javascript.jscomp.PureFunctionIdentifierTest",
                "testCallFunctionFOrGWithSideEffects");
    }
}
