package com.google.javascript.jscomp;

import java.util.Enumeration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/** Generated regression-test wrapper for Defects4J Closure-110. */
public class Closure110ChatGPTTest extends TestCase {

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
                "com.google.javascript.jscomp.ScopedAliasesTest",
                "testHoistedFunctionDeclaration"
        );
    }

    public void test02() {
        runRegression(
                "com.google.javascript.jscomp.ScopedAliasesTest",
                "testFunctionDeclaration"
        );
    }
}
