package com.google.javascript.jscomp;

import java.util.Enumeration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

public class Closure47ChatGPTTest extends TestCase {

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

    public void test01() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testParseSourceMetaMap");
    }

    public void test02() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testGoldenOutput0a");
    }

    public void test03() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testMultilineMapping");
    }

    public void test04() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testMultiFunctionMapping");
    }

    public void test05() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testLiteralMappingsGoldenOutput");
    }

    public void test06() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testMultilineMapping2");
    }

    public void test07() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testBasicMappingGoldenOutput");
    }

    public void test08() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testSourceMapMerging");
    }

    public void test09() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testLiteralMappings");
    }

    public void test10() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testBasicMapping1");
    }

    public void test11() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testBasicMapping2");
    }

    public void test12() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testGoldenOutput1");
    }

    public void test13() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testGoldenOutput2");
    }

    public void test14() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testGoldenOutput3");
    }

    public void test15() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testGoldenOutput4");
    }

    public void test16() {
        runRegression(
                "com.google.debugging.sourcemap.SourceMapGeneratorV3Test",
                "testGoldenOutput5");
    }
}