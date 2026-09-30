package com.google.javascript.jscomp;

import java.util.Enumeration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/** Baseline wrapper of existing regression tests for Defects4J Closure-49. */
public class Closure49ChatGPTTest extends TestCase {

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

    // =========================================================
    // FunctionInjectorTest
    // =========================================================

    public void test01() {
        runRegression(
                "com.google.javascript.jscomp.FunctionInjectorTest",
                "testInline19b");
    }

    public void test02() {
        runRegression(
                "com.google.javascript.jscomp.FunctionInjectorTest",
                "testInlineIntoLoop");
    }

    public void test03() {
        runRegression(
                "com.google.javascript.jscomp.FunctionInjectorTest",
                "testInline13");
    }

    public void test04() {
        runRegression(
                "com.google.javascript.jscomp.FunctionInjectorTest",
                "testInline14");
    }

    public void test05() {
        runRegression(
                "com.google.javascript.jscomp.FunctionInjectorTest",
                "testInline15");
    }

    public void test06() {
        runRegression(
                "com.google.javascript.jscomp.FunctionInjectorTest",
                "testInline16");
    }

    public void test07() {
        runRegression(
                "com.google.javascript.jscomp.FunctionInjectorTest",
                "testInline17");
    }

    public void test08() {
        runRegression(
                "com.google.javascript.jscomp.FunctionInjectorTest",
                "testInline18");
    }

    public void test09() {
        runRegression(
                "com.google.javascript.jscomp.FunctionInjectorTest",
                "testInline19");
    }

    public void test10() {
        runRegression(
                "com.google.javascript.jscomp.FunctionInjectorTest",
                "testBug1897706");
    }

    public void test11() {
        runRegression(
                "com.google.javascript.jscomp.FunctionInjectorTest",
                "testInlineFunctionWithInnerFunction5");
    }

    // =========================================================
    // FunctionToBlockMutatorTest
    // =========================================================

    public void test12() {
        runRegression(
                "com.google.javascript.jscomp.FunctionToBlockMutatorTest",
                "testMutateWithParameters3");
    }

    public void test13() {
        runRegression(
                "com.google.javascript.jscomp.FunctionToBlockMutatorTest",
                "testMutateCallInLoopVars1");
    }

    public void test14() {
        runRegression(
                "com.google.javascript.jscomp.FunctionToBlockMutatorTest",
                "testMutateInitializeUninitializedVars1");
    }

    public void test15() {
        runRegression(
                "com.google.javascript.jscomp.FunctionToBlockMutatorTest",
                "testMutateInitializeUninitializedVars2");
    }

    public void test16() {
        runRegression(
                "com.google.javascript.jscomp.FunctionToBlockMutatorTest",
                "testMutateFunctionDefinition");
    }

    public void test17() {
        runRegression(
                "com.google.javascript.jscomp.FunctionToBlockMutatorTest",
                "testMutate8");
    }

    // =========================================================
    // InlineFunctionsTest
    // =========================================================

    public void test18() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testLoopWithFunctionWithFunction");
    }

    public void test19() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testShadowVariables16");
    }

    public void test20() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testShadowVariables18");
    }

    public void test21() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testCostBasedInlining11");
    }

    public void test22() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testMixedModeInliningCosting3");
    }

    public void test23() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineNeverMutateConstants");
    }

    public void test24() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineWithThis7");
    }

    public void test25() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testAnonymous1");
    }

    public void test26() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testAnonymous3");
    }

    public void test27() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testShadowVariables1");
    }

    public void test28() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testShadowVariables3");
    }

    public void test29() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testShadowVariables6");
    }

    public void test30() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testShadowVariables7");
    }

    public void test31() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testFunctionExpressionCallInlining11b");
    }

    public void test32() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testComplexInlineNoResultNoParamCall3");
    }

    public void test33() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testCostBasedInlining9");
    }

    public void test34() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testMethodWithFunctionWithFunction");
    }

    public void test35() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testFunctionExpressionYCombinator");
    }

    public void test36() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testComplexInlineVars7");
    }

    public void test37() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testComplexFunctionWithFunctionDefinition2a");
    }

    public void test38() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testComplexInline7");
    }

    public void test39() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testFunctionExpressionOmega");
    }

    public void test40() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineFunctions15b");
    }

    public void test41() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineFunctions15d");
    }

    public void test42() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineFunctions16a");
    }

    public void test43() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testBug4944818");
    }

    public void test44() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testComplexSample");
    }

    public void test45() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testNoInlineIfParametersModified1");
    }

    public void test46() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testNoInlineIfParametersModified2");
    }

    public void test47() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testNoInlineIfParametersModified3");
    }

    public void test48() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testNoInlineIfParametersModified4");
    }

    public void test49() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testNoInlineIfParametersModified5");
    }

    public void test50() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testNoInlineIfParametersModified6");
    }

    public void test51() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testNoInlineIfParametersModified7");
    }

    public void test52() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testIssue423");
    }

    public void test53() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testComplexFunctionWithFunctionDefinition2");
    }

    public void test54() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testComplexFunctionWithFunctionDefinition3");
    }

    public void test55() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testDecomposeFunctionExpressionInCall");
    }

    public void test56() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineNeverOverrideNewValues");
    }

    public void test57() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineBlockMutableArgs1");
    }

    public void test58() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineBlockMutableArgs2");
    }

    public void test59() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineBlockMutableArgs3");
    }

    public void test60() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineBlockMutableArgs4");
    }

    public void test61() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineFunctions10");
    }

    public void test62() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineFunctions13");
    }

    public void test63() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineFunctions22");
    }

    public void test64() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineFunctions23");
    }

    public void test65() {
        runRegression(
                "com.google.javascript.jscomp.InlineFunctionsTest",
                "testInlineFunctions9");
    }

    // =========================================================
    // MakeDeclaredNamesUniqueTest
    // =========================================================

    public void test66() {
        runRegression(
                "com.google.javascript.jscomp.MakeDeclaredNamesUniqueTest",
                "testMakeLocalNamesUniqueWithContext5");
    }
}