package com.google.javascript.jscomp;

import java.util.Enumeration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/**
 * Baseline wrapper prepared by ChatGPT from existing regression tests for Defects4J Closure-1.
 */
public class Closure1GeminiTest extends TestCase {

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

    public void test01() {
        runRegression(
                "CommandLineRunnerTest",
                "testSimpleModeLeavesUnusedParams");
    }

    public void test02() {
        runRegression(
                "CommandLineRunnerTest",
                "testForwardDeclareDroppedTypes");
    }

    public void test03() {
        runRegression(
                "CommandLineRunnerTest",
                "testDebugFlag1");
    }

    public void test04() {
        runRegression(
                "IntegrationTest",
                "testIssue787");
    }

    public void test05() {
        runRegression(
                "RemoveUnusedVarsTest",
                "testRemoveGlobal1");
    }

    public void test06() {
        runRegression(
                "RemoveUnusedVarsTest",
                "testRemoveGlobal2");
    }

    public void test07() {
        runRegression(
                "RemoveUnusedVarsTest",
                "testRemoveGlobal3");
    }

    public void test08() {
        runRegression(
                "RemoveUnusedVarsTest",
                "testIssue168b");
    }
}