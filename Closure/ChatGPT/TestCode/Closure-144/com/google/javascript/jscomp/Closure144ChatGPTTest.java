package com.google.javascript.jscomp;

import java.util.Enumeration;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestFailure;
import junit.framework.TestResult;
import junit.framework.TestSuite;

/** Generated regression-test wrapper for Defects4J Closure-144. */
public class Closure144ChatGPTTest extends TestCase {

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
                "testTypeAnnotationsAssign");
    }

    public void test02() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testTypeAnnotationsMember");
    }

    public void test03() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testOptionalTypesAnnotation");
    }

    public void test04() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testTempConstructor");
    }

    public void test05() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testTypeAnnotationsDispatcher1");
    }

    public void test06() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testTypeAnnotationsDispatcher2");
    }

    public void test07() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testTypeAnnotationsImplements");
    }

    public void test08() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testTypeAnnotationsNamespace");
    }

    public void test09() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testTypeAnnotations");
    }

    public void test10() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testVariableArgumentsTypesAnnotation");
    }

    public void test11() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testEmitUnknownParamTypesAsAllType");
    }

    public void test12() {
        runRegression(
                "com.google.javascript.jscomp.CodePrinterTest",
                "testTypeAnnotationsMemberSubclass");
    }

    public void test13() {
        runRegression(
                "com.google.javascript.jscomp.DevirtualizePrototypeMethodsTest",
                "testRewritePrototypeMethods2");
    }

    public void test14() {
        runRegression(
                "com.google.javascript.jscomp.DisambiguatePropertiesTest",
                "testStaticProperty");
    }

    public void test15() {
        runRegression(
                "com.google.javascript.jscomp.ExternExportsPassTest",
                "testExportDontEmitPrototypePathPrefix");
    }

    public void test16() {
        runRegression(
                "com.google.javascript.jscomp.ExternExportsPassTest",
                "testExportMultiple");
    }

    public void test17() {
        runRegression(
                "com.google.javascript.jscomp.ExternExportsPassTest",
                "testExportSymbolWithConstructor");
    }

    public void test18() {
        runRegression(
                "com.google.javascript.jscomp.ExternExportsPassTest",
                "testExportSymbolDefinedInVar");
    }

    public void test19() {
        runRegression(
                "com.google.javascript.jscomp.ExternExportsPassTest",
                "testExportSymbol");
    }

    public void test20() {
        runRegression(
                "com.google.javascript.jscomp.ExternExportsPassTest",
                "testExportMultiple2");
    }

    public void test21() {
        runRegression(
                "com.google.javascript.jscomp.ExternExportsPassTest",
                "testExportMultiple3");
    }

    public void test22() {
        runRegression(
                "com.google.javascript.jscomp.ExternExportsPassTest",
                "testExportProperty");
    }

    public void test23() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testNestedFunctionInference1");
    }

    public void test24() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testScoping10");
    }

    public void test25() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testDuplicateOldTypeDef");
    }

    public void test26() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testBadConstructorCall");
    }

    public void test27() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testDontAddMethodsIfNoConstructor");
    }

    public void test28() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testInterfaceInheritanceCheck11");
    }

    public void test29() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testErrorMismatchingPropertyOnInterface5");
    }

    public void test30() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testDuplicateTypeDef");
    }

    public void test31() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testBug911118");
    }

    public void test32() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testFunctionInference12");
    }

    public void test33() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testFunctionInference13");
    }

    public void test34() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testFunctionInference15");
    }

    public void test35() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testFunctionInference16");
    }

    public void test36() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testPrototypePropertyReference");
    }

    public void test37() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testGoodExtends7");
    }

    public void test38() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testTypeRedefinition");
    }

    public void test39() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testFunctionInference1");
    }

    public void test40() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testFunctionInference2");
    }

    public void test41() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testFunctionInference3");
    }

    public void test42() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testFunctionInference4");
    }

    public void test43() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testFunctionInference7");
    }

    public void test44() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testFunctionInference8");
    }

    public void test45() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testFunctionInference9");
    }

    public void test46() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testInterfaceInheritanceCheck7");
    }

    public void test47() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testDuplicateStaticMethodDecl1");
    }

    public void test48() {
        runRegression(
                "com.google.javascript.jscomp.LooseTypeCheckTest",
                "testDuplicateStaticMethodDecl5");
    }

    public void test49() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testNestedFunctionInference1");
    }

    public void test50() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testScoping10");
    }

    public void test51() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testDuplicateOldTypeDef");
    }

    public void test52() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testInferredReturn1");
    }

    public void test53() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testInferredReturn2");
    }

    public void test54() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testInferredReturn3");
    }

    public void test55() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testInferredReturn4");
    }

    public void test56() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testInferredReturn6");
    }

    public void test57() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testBadConstructorCall");
    }

    public void test58() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testDontAddMethodsIfNoConstructor");
    }

    public void test59() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testInterfaceInheritanceCheck11");
    }

    public void test60() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testErrorMismatchingPropertyOnInterface5");
    }

    public void test61() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testDuplicateTypeDef");
    }

    public void test62() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testBug911118");
    }

    public void test63() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testFunctionInference12");
    }

    public void test64() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testFunctionInference13");
    }

    public void test65() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testFunctionInference15");
    }

    public void test66() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testFunctionInference16");
    }

    public void test67() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testPrototypePropertyReference");
    }

    public void test68() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testGoodExtends7");
    }

    public void test69() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testTypeRedefinition");
    }

    public void test70() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testFunctionInference1");
    }

    public void test71() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testFunctionInference2");
    }

    public void test72() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testFunctionInference3");
    }

    public void test73() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testFunctionInference4");
    }

    public void test74() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testFunctionInference7");
    }

    public void test75() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testFunctionInference8");
    }

    public void test76() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testFunctionInference9");
    }

    public void test77() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testInterfaceInheritanceCheck7");
    }

    public void test78() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testDuplicateStaticMethodDecl1");
    }

    public void test79() {
        runRegression(
                "com.google.javascript.jscomp.TypeCheckTest",
                "testDuplicateStaticMethodDecl5");
    }

    public void test80() {
        runRegression(
                "com.google.javascript.jscomp.TypedScopeCreatorTest",
                "testConstructorNode");
    }

    public void test81() {
        runRegression(
                "com.google.javascript.jscomp.TypedScopeCreatorTest",
                "testPropertiesOnInterface");
    }

    public void test82() {
        runRegression(
                "com.google.javascript.jscomp.TypedScopeCreatorTest",
                "testMethodBeforeFunction");
    }

    public void test83() {
        runRegression(
                "com.google.javascript.jscomp.TypedScopeCreatorTest",
                "testConstructorProperty");
    }

    public void test84() {
        runRegression(
                "com.google.javascript.jscomp.TypedScopeCreatorTest",
                "testReturnTypeInference1");
    }
}
