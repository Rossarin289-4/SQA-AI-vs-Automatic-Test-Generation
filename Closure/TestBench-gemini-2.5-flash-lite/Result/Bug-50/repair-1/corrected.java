package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;
import java.io.Serializable;

public class PeepholeReplaceKnownMethodsTest {

    // Dummy compiler and related classes to satisfy AbstractPeepholeOptimization dependencies
    private static class DummyCompiler extends AbstractCompiler {
        @Override
        public Node parse(CompilerOptions options, String code) { return null; }
        @Override
        public JSError findUniqueName(String name) { return null; }
        @Override
        public void report(JSError error) {}
        @Override
        public void reportCodeChange() {} // This is what we want to test
        @Override
        public void addTypeCheck(TypeCheck typeCheck) {}
        @Override
        public int getErrorCount() { return 0; }
        @Override
        public int getWarningCount() { return 0; }
        @Override
        public void process(CompilerOptions options, SourceFile... inputs) {}
        @Override
        public void process(CompilerOptions options, List<SourceFile> inputs) {}
        @Override
        public CompilerOptions getOptions() { return new CompilerOptions(); }
        @Override
        public String getSourceAsString() { return ""; }
        @Override
        public void reassessBlacklistedTypes() {}
        @Override
        public void reassessChangedTypes() {}
        @Override
        public void reassessChangedConstants() {}
        @Override
        public void reassessChangedFunctionNames() {}
        @Override
        public void reassessChangedGlobalNames() {}
        @Override
        public void setLifeCycleStage(Stage stage) {}
        @Override
        public Stage getLifeCycleStage() { return Stage.NORMALIZED; }
        @Override
        public boolean shouldRun Spicer() { return false; }

        // Methods needed by NodeUtil which are not directly in AbstractCompiler
        public static boolean isEcmaScript5OrGreater() { return true; }
        public static TernaryValue getImpureBooleanValue(Node n) { return TernaryValue.UNKNOWN; }
        public static TernaryValue getPureBooleanValue(Node n) { return TernaryValue.UNKNOWN; }
        public static String getStringValue(Node n) { return null; }
        public static String getStringValue(double value) { return String.valueOf(value); }
        public static String getArrayElementStringValue(Node n) { return ""; }
        public static String arrayToString(Node literal) { return ""; }
        public static Double getNumberValue(Node n) { return 0.0; }
        public static Double getStringNumberValue(String rawJsString) { return Double.parseDouble(rawJsString); }
        public static String trimJsWhiteSpace(String s) { return s.trim(); }
        public static TernaryValue isStrWhiteSpaceChar(int c) { return TernaryValue.UNKNOWN; }
        public static String getFunctionName(Node n) { return null; }
        public static String getNearestFunctionName(Node n) { return null; }
        public static boolean isImmutableValue(Node n) { return true; }
        public static boolean isSymmetricOperation(Node n) { return false; }
        public static boolean isRelationalOperation(Node n) { return false; }
        public static int getInverseOperator(int type) { return type; }
        public static boolean isLiteralValue(Node n, boolean includeFunctions) { return true; }
        public static boolean isValidDefineValue(Node val, Set<String> defines) { return true; }
        public static boolean isEmptyBlock(Node block) { return false; }
        public static boolean isSimpleOperator(Node n) { return false; }
        public static boolean isSimpleOperatorType(int type) { return false; }
        public static Node newExpr(Node child) { return child; }
        public static boolean mayEffectMutableState(Node n) { return false; }
        public static boolean mayEffectMutableState(Node n, AbstractCompiler compiler) { return false; }
        public static boolean mayHaveSideEffects(Node n) { return false; }
        public static boolean mayHaveSideEffects(Node n, AbstractCompiler compiler) { return false; }
        public static boolean constructorCallHasSideEffects(Node callNode) { return false; }
        public static boolean constructorCallHasSideEffects( Node callNode, AbstractCompiler compiler) { return false; }
        public static boolean functionCallHasSideEffects(Node callNode) { return false; }
        public static boolean functionCallHasSideEffects( Node callNode, @Nullable AbstractCompiler compiler) { return false; }
        public static boolean callHasLocalResult(Node n) { return true; }
        public static boolean newHasLocalResult(Node n) { return true; }
        public static boolean nodeTypeMayHaveSideEffects(Node n) { return false; }
        public static boolean nodeTypeMayHaveSideEffects(Node n, AbstractCompiler compiler) { return false; }
        public static boolean canBeSideEffected(Node n) { return false; }
        public static boolean canBeSideEffected(Node n, Set<String> knownConstants) { return false; }
        public static int precedence(int type) { return 0; }
        public static boolean valueCheck(Node n, Predicate<Node> p) { return true; }
        public static boolean isNumericResult(Node n) { return true; }
        public static boolean isNumericResultHelper(Node n) { return true; }
        public static boolean isBooleanResult(Node n) { return true; }
        public static boolean isBooleanResultHelper(Node n) { return true; }
        public static boolean isUndefined(Node n) { return false; }
        public static boolean isNull(Node n) { return false; }
        public static boolean isNullOrUndefined(Node n) { return false; }

        // Methods needed by InlineCostEstimator
        static class InlineCostEstimator {
            static int getCost(Node root) { return 1; }
            static int getCost(Node root, int costThreshhold) { return 1; }
        }
    }

    // PeepholeReplaceKnownMethods itself needs a compiler.
    private PeepholeReplaceKnownMethods createOptimizer() {
        return new PeepholeReplaceKnownMethods() {
            // Override methods that would interact with a real compiler
            @Override
            protected void reportCodeChange() {
                // No-op for testing purposes
            }
            @Override
            protected void error(DiagnosticType diagnostic, Node n) {
                // No-op for testing purposes
            }
             @Override
            protected boolean isEcmaScript5OrGreater() {
                return true; // Assume ES5+ for consistent behavior
            }
        };
    }

    // Helper to create a Node for a specific JS expression.
    private Node parseExpression(String js) {
        // Use a real compiler here for parsing to get a valid AST.
        Compiler compiler = new Compiler();
        compiler.initCompiler(new CompilerOptions());
        Node root = compiler.parseSyntheticCode(js);
        // The peephole optimizers work on subtrees, so we need to get the actual
        // expression node, not the root script node.
        Node firstStatement = root.getFirstChild();
        if (firstStatement != null && firstStatement.getType() == Token.EXPR_RESULT) {
            return firstStatement.getFirstChild();
        }
        return root; // Should not happen for simple expressions
    }

    // Helper to simulate replacing a child node.
    private Node replaceChild(Node parent, Node child, Node replacement) {
        parent.replaceChild(child, replacement);
        return replacement;
    }

    // Helper to get the first statement of a script node.
    private Node getFirstStatement(Node root) {
        return root.getFirstChild();
    }

    // Helper to get the expression from an EXPR_RESULT node.
    private Node getExpressionStatement(Node n) {
        if (n != null && n.getType() == Token.EXPR_RESULT) {
            return n.getFirstChild();
        }
        return n;
    }

    // Main assertion helper for testing peephole optimizations.
    private void assertFold(String js, String expectedJs) {
        PeepholeReplaceKnownMethods optimizer = createOptimizer();
        Node originalNode = parseExpression(js);
        Node expectedNode = parseExpression(expectedJs);

        // Clone original node to avoid modification during optimization
        Node optimizedNode = optimizer.optimizeSubtree(originalNode.cloneNode());

        // Compare string representations of the ASTs
        assertEquals(expectedNode.toStringTree(), optimizedNode.toStringTree());
    }

    @Test
    public void testToLowerCase() throws Exception {
        assertFold("var s = 'HELLO'.toLowerCase();", "var s = 'hello';");
        assertFold("var s = 'MiXeD'.toLowerCase();", "var s = 'mixed';");
        assertFold("var s = ''.toLowerCase();", "var s = '';");
    }

    @Test
    public void testToUpperCase() throws Exception {
        assertFold("var s = 'hello'.toUpperCase();", "var s = 'HELLO';");
        assertFold("var s = 'MiXeD'.toUpperCase();", "var s = 'MIXED';");
        assertFold("var s = ''.toUpperCase();", "var s = '';");
    }

    @Test
    public void testIndexOf() throws Exception {
        assertFold("var s = 'abcdef'.indexOf('cd');", "var s = 2;");
        assertFold("var s = 'abcdef'.indexOf('x');", "var s = -1;");
        assertFold("var s = 'aaaaa'.indexOf('a');", "var s = 0;");
        assertFold("var s = 'abcabc'.indexOf('bc', 3);", "var s = 4;");
        assertFold("var s = 'abc'.indexOf('');", "var s = 0;");
        assertFold("var s = ''.indexOf('a');", "var s = -1;");
        assertFold("var s = ''.indexOf('');", "var s = 0;");
    }

    @Test
    public void testLastIndexOf() throws Exception {
        assertFold("var s = 'abcabc'.lastIndexOf('bc');", "var s = 4;");
        assertFold("var s = 'aaaaa'.lastIndexOf('a');", "var s = 4;");
        assertFold("var s = 'abc'.lastIndexOf('x');", "var s = -1;");
        assertFold("var s = 'abcabc'.lastIndexOf('bc', 3);", "var s = 1;");
        assertFold("var s = 'abc'.lastIndexOf('');", "var s = 3;");
        assertFold("var s = ''.lastIndexOf('a');", "var s = -1;");
        assertFold("var s = ''.lastIndexOf('');", "var s = 0;");
    }

    @Test
    public void testSubstring() throws Exception {
        assertFold("var s = 'abcdef'.substring(1, 4);", "var s = 'bcd';");
        // substring swaps args if start > end
        assertFold("var s = 'abcdef'.substring(4, 1);", "var s = 'bcd';");
        assertFold("var s = 'abcdef'.substring(1);", "var s = 'bcdef';");
        assertFold("var s = 'abcdef'.substring(0, 0);", "var s = '';");
        assertFold("var s = 'abcdef'.substring(6);", "var s = '';");
        assertFold("var s = 'abcdef'.substring(6, 6);", "var s = '';");
        assertFold("var s = ''.substring(0, 0);", "var s = '';");
        assertFold("var s = ''.substring(1, 2);", "var s = '';");
        // Edge cases for substring
        assertFold("var s = 'abcdef'.substring(0, 7);", "var s = 'abcdef';"); // end > length
        assertFold("var s = 'abcdef'.substring(7, 8);", "var s = '';"); // start > length
        assertFold("var s = 'abcdef'.substring(-1, 3);", "var s = 'abc';"); // start < 0 treated as 0
        assertFold("var s = 'abcdef'.substring(1, -3);", "var s = 'abcdef';"); // end < 0 treated as 0, then swapped
    }

    @Test
    public void testSubstr() throws Exception {
        assertFold("var s = 'abcdef'.substr(1, 3);", "var s = 'bcd';");
        assertFold("var s = 'abcdef'.substr(4);", "var s = 'ef';");
        assertFold("var s = 'abcdef'.substr(0, 3);", "var s = 'abc';");
        assertFold("var s = 'abcdef'.substr(3, 0);", "var s = '';");
        // JS substr handles negative start differently than Java's substring
        assertFold("var s = 'abcdef'.substr(-3, 3);", "var s = 'def';");
        assertFold("var s = 'abcdef'.substr(-3);", "var s = 'def';");
        // Negative start clamped to 0 if length is also specified and negative (JS specific)
        assertFold("var s = 'abcdef'.substr(-10, 3);", "var s = 'abc';");
        // Length clamped to string length
        assertFold("var s = 'abcdef'.substr(1, 10);", "var s = 'bcdef';");
        assertFold("var s = ''.substr(0, 3);", "var s = '';");
        assertFold("var s = ''.substr(1, 3);", "var s = '';");
        // Edge case: start + length exceeds string length
        assertFold("var s = 'abcdef'.substr(4, 5);", "var s = 'ef';");
    }

    @Test
    public void testCharAt() throws Exception {
        assertFold("var s = 'abcdef'.charAt(1);", "var s = 'b';");
        assertFold("var s = 'abcdef'.charAt(0);", "var s = 'a';");
        assertFold("var s = 'abcdef'.charAt(5);", "var s = 'f';");
        assertFold("var s = ''.charAt(0);", "var s = '';");
        // Edge cases for charAt
        assertFold("var s = 'abcdef'.charAt(6);", "var s = '';"); // index out of bounds
        assertFold("var s = 'abcdef'.charAt(-1);", "var s = '';"); // negative index
    }

    @Test
    public void testCharCodeAt() throws Exception {
        assertFold("var s = 'abcdef'.charCodeAt(1);", "var s = 98;");
        assertFold("var s = 'abcdef'.charCodeAt(0);", "var s = 97;");
        assertFold("var s = 'abcdef'.charCodeAt(5);", "var s = 102;");
        // Behavior for out of bounds index is NaN according to ECMA-262
        // However, the current implementation returns n, so we test for that.
        // If the implementation changes to match ECMA-262, this test would need adjustment.
        assertFold("var s = ''.charCodeAt(0);", "var s = NaN;"); // Assuming current behavior
        // Edge cases for charCodeAt
        assertFold("var s = 'abcdef'.charCodeAt(6);", "var s = NaN;"); // index out of bounds
        assertFold("var s = 'abcdef'.charCodeAt(-1);", "var s = NaN;"); // negative index
    }

    @Test
    public void testParseInt() throws Exception {
        assertFold("var i = parseInt('10');", "var i = 10;");
        assertFold("var i = parseInt('10', 16);", "var i = 16;");
        assertFold("var i = parseInt('10', 2);", "var i = 2;");
        assertFold("var i = parseInt('10', 8);", "var i = 8;");
        assertFold("var i = parseInt('010');", "var i = 10;"); // Default radix 10
        assertFold("var i = parseInt('0x10');", "var i = 16;"); // Auto-detect hex
        assertFold("var i = parseInt('10.5');", "var i = 10;");
        assertFold("var i = parseInt('abc');", "var i = NaN;"); // Invalid input
        assertFold("var i = parseInt('');", "var i = NaN;"); // Empty string
        assertFold("var i = parseInt(' 10 ');", "var i = 10;"); // Whitespace trimming
        assertFold("var i = parseInt('10a');", "var i = 10;"); // Stops at non-digit
        assertFold("var i = parseInt('10', 37);", "var i = NaN;"); // Invalid radix
        assertFold("var i = parseInt('10', 0);", "var i = 10;"); // Radix 0 defaults to 10
        assertFold("var i = parseInt('10', 1);", "var i = NaN;"); // Invalid radix
        assertFold("var i = parseInt(10);", "var i = 10;"); // Numeric argument
        assertFold("var i = parseInt(10.5);", "var i = 10;"); // Numeric argument (float to int)
        assertFold("var i = parseInt(10, 16);", "var i = 16;"); // Numeric argument with radix
        // Edge cases for parseInt
        assertFold("var i = parseInt('07');", "var i = 7;"); // Radix 10 for 0-prefixed non-octal strings in ES5+
        assertFold("var i = parseInt('08');", "var i = 8;"); // Radix 10 for 0-prefixed non-octal strings in ES5+
        assertFold("var i = parseInt('0x');", "var i = NaN;"); // Invalid hex string
        assertFold("var i = parseInt('abc', 10);", "var i = NaN;"); // Invalid string with radix
        assertFold("var i = parseInt(2147483647);", "var i = 2147483647;"); // Max int
        assertFold("var i = parseInt('2147483648');", "var i = 2147483648;"); // Number too large for int, should be double then potentially truncated if used as int
        assertFold("var i = parseInt('-1');", "var i = -1;"); // Negative number
    }

    @Test
    public void testParseFloat() throws Exception {
        assertFold("var f = parseFloat('10.5');", "var f = 10.5;");
        assertFold("var f = parseFloat('10');", "var f = 10.0;");
        assertFold("var f = parseFloat('0.123');", "var f = 0.123;");
        assertFold("var f = parseFloat('1.23e-4');", "var f = 0.000123;");
        assertFold("var f = parseFloat('abc');", "var f = NaN;");
        assertFold("var f = parseFloat('');", "var f = NaN;");
        assertFold("var f = parseFloat(' 10.5 ');", "var f = 10.5;"); // Whitespace trimming
        assertFold("var f = parseFloat('10.5a');", "var f = 10.5;"); // Stops at non-digit
        assertFold("var f = parseFloat('10.');", "var f = 10.0;");
        assertFold("var f = parseFloat('.5');", "var f = 0.5;");
        assertFold("var f = parseFloat(10.5);", "var f = 10.5;"); // Numeric argument
        assertFold("var f = parseFloat(10);", "var f = 10.0;"); // Numeric argument (int to float)
        // Edge cases for parseFloat
        assertFold("var f = parseFloat('0xff');", "var f = 0.0;"); // Hexadecimal is not parsed by parseFloat
        assertFold("var f = parseFloat('Infinity');", "var f = Infinity;");
        assertFold("var f = parseFloat('-Infinity');", "var f = -Infinity;");
        assertFold("var f = parseFloat('NaN');", "var f = NaN;");
        assertFold("var f = parseFloat('1.7976931348623157e+308');", "var f = 1.7976931348623157E308;"); // Max double
        assertFold("var f = parseFloat('1.7976931348623157e+309');", "var f = Infinity;"); // Exceeds max double
        assertFold("var f = parseFloat('5e-324');", "var f = 5.0E-324;"); // Smallest positive double
        assertFold("var f = parseFloat('4.9e-324');", "var f = 0.0;"); // Subnormal number below smallest positive double
        assertFold("var f = parseFloat('-5e-324');", "var f = -0.0;");
    }

    @Test
    public void testArrayJoin_empty() throws Exception {
        assertFold("var a = [].join(',');", "var a = '';");
        assertFold("var a = [].join('');", "var a = '';");
        assertFold("var a = [].join();", "var a = '';"); // Default separator is comma
    }

    @Test
    public void testArrayJoin_singleElement() throws Exception {
        assertFold("var a = ['a'].join(',');", "var a = 'a';");
        assertFold("var a = [1].join('-');", "var a = '1';");
        assertFold("var a = [null].join('-');", "var a = 'null';");
        assertFold("var a = [undefined].join('-');", "var a = 'undefined';");
    }

    @Test
    public void testArrayJoin_multipleElements() throws Exception {
        assertFold("var a = ['a', 'b', 'c'].join('');", "var a = 'abc';");
        assertFold("var a = ['a', 'b', 'c'].join('-');", "var a = 'a-b-c';");
        assertFold("var a = ['a', '', 'c'].join(',');", "var a = 'a,,c';");
        assertFold("var a = ['a', 'b', 'c'].join();", "var a = 'a,b,c';"); // Default separator is comma
        assertFold("var a = ['a', , 'c'].join(',');", "var a = 'a,,c';"); // Empty slot becomes empty string
        assertFold("var a = ['a', '', 'c'].join('');", "var a = 'ac';");
    }

    @Test
    public void testArrayJoin_noSeparator() throws Exception {
        assertFold("var a = ['a', 'b', 'c'].join();", "var a = 'a,b,c';");
    }

    @Test
    public void testArrayJoin_withDefaultSeparatorComma() throws Exception {
        assertFold("var a = ['a', 'b', 'c'].join(',');", "var a = 'a,b,c';");
    }

    @Test
    public void testArrayJoin_numericElements() throws Exception {
        assertFold("var a = [1, 2, 3].join(',');", "var a = '1,2,3';");
        assertFold("var a = [1.1, 2.2, 3.3].join('');", "var a = '1.12.23.3';");
    }

    @Test
    public void testArrayJoin_mixedElements() throws Exception {
        assertFold("var a = [1, 'b', 3.3].join('-');", "var a = '1-b-3.3';");
    }

    @Test
    public void testArrayJoin_complexElements() throws Exception {
        // Nested array toString
        assertFold("var a = [1, [2, 3], 4].join('-');", "var a = '1-2,3-4';");
        // Object toString
        assertFold("var a = [1, {x:1}, 4].join('-');", "var a = '1-[object Object]-4';");
        // Array with empty slots
        assertFold("var a = [1, , 3].join('-');", "var a = '1--3';");
    }

    // Tests for methods that don't have a specific folding method but might be called.
    // These tests ensure the optimizer doesn't break them.
    @Test
    public void testNonFoldableStringMethods() throws Exception {
        assertFold("var s = 'abc'.slice(1);", "var s = 'abc'.slice(1);");
        assertFold("var s = 'abc'.concat('d');", "var s = 'abc'.concat('d');");
        assertFold("var s = 'abc'.replace('b', 'x');", "var s = 'abc'.replace('b', 'x');");
    }

    @Test
    public void testNonFoldableNumericMethods() throws Exception {
        assertFold("var x = Math.max(1, 2);", "var x = Math.max(1, 2);");
        assertFold("var x = Number.isInteger(5);", "var x = Number.isInteger(5);");
    }

    @Test
    public void testStringContains() throws Exception {
        assertFold("var s = 'abcdef'.includes('bc');", "var s = 'abcdef'.includes('bc');");
    }

    @Test
    public void testStringStartsWith() throws Exception {
        assertFold("var s = 'abcdef'.startsWith('ab');", "var s = 'abcdef'.startsWith('ab');");
    }

    @Test
    public void testStringEndsWith() throws Exception {
        assertFold("var s = 'abcdef'.endsWith('ef');", "var s = 'abcdef'.endsWith('ef');");
    }

    @Test
    public void testStringTrim() throws Exception {
        assertFold("var s = '  abc  '.trim();", "var s = '  abc  '.trim();");
    }

    @Test
    public void testStringSplit() throws Exception {
        assertFold("var a = 'a,b,c'.split(',');", "var a = 'a,b,c'.split(',');");
    }

    @Test
    public void testStringSlice() throws Exception {
        assertFold("var s = 'abcdef'.slice(1, 4);", "var s = 'abcdef'.slice(1, 4);");
        assertFold("var s = 'abcdef'.slice(4);", "var s = 'abcdef'.slice(4);");
        assertFold("var s = 'abcdef'.slice(-2);", "var s = 'abcdef'.slice(-2);");
    }

    @Test
    public void testStringReplace() throws Exception {
        assertFold("var s = 'abcdef'.replace('bc', 'xy');", "var s = 'abcdef'.replace('bc', 'xy');");
    }

    @Test
    public void testStringSplitWithRegex() throws Exception {
        assertFold("var a = 'a,b,c'.split(/,/);", "var a = 'a,b,c'.split(/,/);");
    }
}
