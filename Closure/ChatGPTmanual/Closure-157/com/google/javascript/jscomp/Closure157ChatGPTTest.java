package com.google.javascript.jscomp;

import java.util.Enumeration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/** Generated regression-test wrapper for Defects4J Closure-157. */
public class Closure157ChatGPTTest extends TestCase {

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
                "com.google.javascript.jscomp.CodePrinterTest",
                "testObjectLit2");
    }

    public void test02() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testObjectLit3");
    }

    public void test03() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testGetter");
    }

    public void test04() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testSetter");
    }

    public void test05() {
        runRegression(
                "com.google.javascript.jscomp.FunctionNamesTest",
                "testFunctionsNamesAndIds");
    }

    public void test06() {
        runRegression(
                "com.google.javascript.jscomp.RenamePropertiesTest",
                "testPrototypePropertiesAsObjLitKeys2");
    }

    public void test07() {
        runRegression(
                "com.google.javascript.jscomp.RenamePropertiesTest",
                "testPrototypePropertiesAsObjLitKeys3");
    }

    public void test08() {
        runRegression(
                "com.google.javascript.jscomp.SimpleDefinitionFinderTest",
                "testDefineNumber");
    }

    public void test09() {
        runRegression(
                "com.google.javascript.jscomp.parsing.IRFactoryTest",
                "testObjectLiteral6");
    }

    public void test10() {
        runRegression(
                "com.google.javascript.jscomp.parsing.IRFactoryTest",
                "testObjectLiteral7");
    }

    public void test11() {
        runRegression(
                "com.google.javascript.jscomp.parsing.IRFactoryTest",
                "testObjectLiteral8");
    }

    public void test12() {
        runRegression(
                "com.google.javascript.jscomp.parsing.ParserTest",
                "testObjectLiteralDoc1");
    }
}
