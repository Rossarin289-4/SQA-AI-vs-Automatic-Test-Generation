```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.collect.Lists;
import com.google.javascript.jscomp.mozilla.rhino.ScriptRuntime;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.function.Predicate;

public class PeepholeFoldConstantsTest {

    private PeepholeFoldConstants peepholeFoldConstants = new PeepholeFoldConstants();

    // Helper method to create a Node representing a number.
    private Node createNodeFromNumber(double d) {
        return Node.newNumber(d);
    }

    // Helper method to create a Node representing a string.
    private Node createNodeFromString(String s) {
        return Node.newString(s);
    }

    // Helper method to create a Node representing a boolean.
    private Node createNodeFromBoolean(boolean b) {
        return new Node(b ? Token.TRUE : Token.FALSE);
    }

    // Helper method to create a Node representing null.
    private Node createNodeFromNull() {
        return new Node(Token.NULL);
    }

    // Helper method to create a Node representing undefined (as a NAME token).
    private Node createNodeFromUndefinedName() {
        return new Node(Token.NAME, Node.newString("undefined"));
    }
    
    // Helper method to create a void node.
    private Node createNodeFromVoid() {
        return new Node(Token.VOID);
    }

    // Helper to simulate reportCodeChange() and check if a change occurred.
    private boolean codeChanged = false;
    private void reportCodeChange() {
        codeChanged = true;
    }

    // Mock compiler for PeepholeFoldConstants and NodeUtil.
    private class MockCompiler extends AbstractCompiler {
        @Override
        public void report(DiagnosticType diagnosticType, String... arguments) {}

        @Override
        public void report(JSError error) {}

        @Override
        public void setProgress(double progress) {}

        @Override
        public double getProgress() { return 1.0; }

        @Override
        public void process(Node externs, Node root) {}

        @Override
        public Node parse(CompilerOptions options) { return null; }

        @Override
        public void parse(SourceFile externs, SourceFile code) {}

        @Override
        public void parse(SourceFile externs, List<SourceFile> codes) {}

        @Override
        public boolean isNormalized() { return false; }

        @Override
        public boolean isTypeChecked() { return false; }

        @Override
        public boolean isSemanticallyANSASound() { return false; }

        @Override
        public void addChange(Node node, Node replacement) {
            PeepholeFoldConstantsTest.this.reportCodeChange();
        }

        // Abstract method from AbstractCompiler that needs to be implemented or stubbed.
        @Override
        public CheckLevel getErrorLevel(JSError error) {
            return CheckLevel.ERROR;
        }

        // Other abstract methods from AbstractCompiler
        @Override
        public SourceFile getSourceFile(String filename) { return null; }
        @Override
        public void removeWarnings(DiagnosticType type) {}
        @Override
        public void setErrorManager(ErrorManager errorManager) {}
        @Override
        public ErrorManager getErrorManager() { return null; }
        @Override
        public void setExterns(List<SourceFile> externs) {}
        @Override
        public void setCode(List<SourceFile> code) {}
        @Override
        public void inferVariableTypes(boolean force) {}
        @Override
        public JSTypeRegistry getTypeRegistry() { return null; }
        @Override
        public CodingConvention getCodingConvention() { return null; }
        @Override
        public void validateForOptimization() {}
        @Override
        public List<HotSpot> getHotSpots() { return null; }
        @Override
        public String getSourceMapping(Node node) { return null; }
        @Override
        public String getSourcePath(Node node) { return null; }
        @Override
        public void setSourceInformationHandler(SourceInformationHandler handler) {}
        @Override
        public SourceInformationHandler getSourceInformationHandler() { return null; }
        @Override
        public void setPassConfig(PassConfig config) {}
        @Override
        public PassConfig getPassConfig() { return null; }
        @Override
        public void setOptimizeReturns(boolean optimizeReturns) {}
        @Override
        public void setPropertyRenaming(PropertyRenaming propertyRenaming) {}
        @Override
        public void setAnonymousFunctionNaming(AnonymousFunctionNaming anonymousFunctionNaming) {}
        @Override
        public void setRecordFunctionInformation(boolean recordFunctionInformation) {}
        @Override
        public void setGeneratePseudoNames(boolean generatePseudoNames) {}
        @Override
        public void setManageClosureDependencies(boolean manageClosureDependencies) {}
        @Override
        public void setClosurePass(boolean isClosurePass) {}
        @Override
        public void setKnownDefines(Set<String> knownDefines) {}
        @Override
        public void setVariableMap(VariableMap variableMap) {}
        @Override
        public void setFunctionInformationMap(FunctionInformationMap functionInformationMap) {}
        @Override
        public void setSymbolTable(SymbolTable symbolTable) {}
        @Override
        public SymbolTable getSymbolTable() { return null; }
        @Override
        public void setConfig(CompilerOptions options) {}
        @Override
        public CompilerOptions getOptions() { return null; }
        @Override
        public void ensureLibraryInjected(String filename) {}
        @Override
        public void injectCompiledCode(String filename, String code) {}
        @Override
        public String getSourceRoot() { return null; }
        @Override
        public void setSourceRoot(String sourceRoot) {}
    }

    private Node optimize(Node subtree) {
        codeChanged = false;
        // We need to provide a compiler instance to PeepholeFoldConstants and NodeUtil.
        // The optimizeSubtree method of PeepholeFoldConstants directly calls reportCodeChange().
        // We have overridden reportCodeChange in this test class to track changes.
        // NodeUtil.setCompiler(new MockCompiler()); // NodeUtil is not directly used in optimizeSubtree here.
        // PeepholeFoldConstants itself needs a compiler context for reporting errors.
        // However, the current implementation of PeepholeFoldConstants doesn't seem to require a compiler
        // for optimizeSubtree, it calls reportCodeChange directly which we've handled.

        // Wrap the subtree in an EXPR_RESULT to simulate a parent context for replaceChild.
        Node parent = new Node(Token.EXPR_RESULT, subtree);
        peepholeFoldConstants.optimizeSubtree(subtree);

        if (codeChanged) {
            // If code changed, the subtree might have been replaced.
            // Return the potentially new root of the modified subtree.
            // In this setup, optimizeSubtree replaces the node in its parent.
            // So we return the potentially new first child of the EXPR_RESULT.
            return parent.getFirstChild();
        } else {
            return subtree; // No change, return original
        }
    }

    @Test
    public void testFoldTypeofNumber() throws Exception {
        Node typeofNode = new Node(Token.TYPEOF, createNodeFromNumber(123.45));
        Node result = optimize(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("number", result.getString());
    }

    @Test
    public void testFoldTypeofString() throws Exception {
        Node typeofNode = new Node(Token.TYPEOF, createNodeFromString("hello"));
        Node result = optimize(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("string", result.getString());
    }

    @Test
    public void testFoldTypeofBoolean() throws Exception {
        Node typeofNode = new Node(Token.TYPEOF, createNodeFromBoolean(true));
        Node result = optimize(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("boolean", result.getString());
    }

    @Test
    public void testFoldTypeofBooleanFalse() throws Exception {
        Node typeofNode = new Node(Token.TYPEOF, createNodeFromBoolean(false));
        Node result = optimize(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("boolean", result.getString());
    }

    @Test
    public void testFoldTypeofNull() throws Exception {
        Node typeofNode = new Node(Token.TYPEOF, createNodeFromNull());
        Node result = optimize(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("object", result.getString());
    }

    @Test
    public void testFoldTypeofUndefinedName() throws Exception {
        Node typeofNode = new Node(Token.TYPEOF, createNodeFromUndefinedName());
        Node result = optimize(typeofNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("undefined", result.getString());
    }

    @Test
    public void testFoldNegationOfZero() throws Exception {
        Node negNode = new Node(Token.NEG, createNodeFromNumber(0.0));
        Node result = optimize(negNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(0.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldNegationOfNumber() throws Exception {
        Node negNode = new Node(Token.NEG, createNodeFromNumber(5.5));
        Node result = optimize(negNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-5.5, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldNegationOfNegativeNumber() throws Exception {
        Node negNode = new Node(Token.NEG, createNodeFromNumber(-5.5));
        Node result = optimize(negNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.5, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldBitwiseNotOnInteger() throws Exception {
        Node bitNotNode = new Node(Token.BITNOT, createNodeFromNumber(5));
        Node result = optimize(bitNotNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(~5, (int) result.getDouble());
    }

    @Test
    public void testFoldBitwiseNotOnNegativeInteger() throws Exception {
        Node bitNotNode = new Node(Token.BITNOT, createNodeFromNumber(-6));
        Node result = optimize(bitNotNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(~(-6), (int) result.getDouble());
    }

    @Test
    public void testFoldAdditionOfTwoNumbers() throws Exception {
        Node addNode = new Node(Token.ADD, createNodeFromNumber(5), createNodeFromNumber(10));
        Node result = optimize(addNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(15.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldAdditionWithNegativeNumber() throws Exception {
        Node addNode = new Node(Token.ADD, createNodeFromNumber(5), createNodeFromNumber(-10));
        Node result = optimize(addNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-5.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldAdditionOfStrings() throws Exception {
        Node addNode = new Node(Token.ADD, createNodeFromString("hello"), createNodeFromString("world"));
        Node result = optimize(addNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("helloworld", result.getString());
    }

    @Test
    public void testFoldAdditionStringAndNumber() throws Exception {
        Node addNode = new Node(Token.ADD, createNodeFromString("hello"), createNodeFromNumber(123));
        Node result = optimize(addNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello123", result.getString());
    }

    @Test
    public void testFoldAdditionNumberAndString() throws Exception {
        Node addNode = new Node(Token.ADD, createNodeFromNumber(123), createNodeFromString("world"));
        Node result = optimize(addNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("123world", result.getString());
    }

    @Test
    public void testFoldSubtraction() throws Exception {
        Node subNode = new Node(Token.SUB, createNodeFromNumber(10), createNodeFromNumber(3));
        Node result = optimize(subNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(7.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldMultiplication() throws Exception {
        Node mulNode = new Node(Token.MUL, createNodeFromNumber(5), createNodeFromNumber(6));
        Node result = optimize(mulNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(30.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldDivision() throws Exception {
        Node divNode = new Node(Token.DIV, createNodeFromNumber(10), createNodeFromNumber(2));
        Node result = optimize(divNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldModulo() throws Exception {
        Node modNode = new Node(Token.MOD, createNodeFromNumber(10), createNodeFromNumber(3));
        Node result = optimize(modNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldBitwiseAnd() throws Exception {
        Node bitAndNode = new Node(Token.BITAND, createNodeFromNumber(5), createNodeFromNumber(3));
        Node result = optimize(bitAndNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(1.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldBitwiseOr() throws Exception {
        Node bitOrNode = new Node(Token.BITOR, createNodeFromNumber(5), createNodeFromNumber(3));
        Node result = optimize(bitOrNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(7.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldBitwiseXor() throws Exception {
        Node bitXorNode = new Node(Token.BITXOR, createNodeFromNumber(5), createNodeFromNumber(3));
        Node result = optimize(bitXorNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(6.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldLeftShift() throws Exception {
        Node lshNode = new Node(Token.LSH, createNodeFromNumber(5), createNodeFromNumber(1));
        Node result = optimize(lshNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(10.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldRightShift() throws Exception {
        Node rshNode = new Node(Token.RSH, createNodeFromNumber(10), createNodeFromNumber(1));
        Node result = optimize(rshNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(5.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldUnsignedRightShift() throws Exception {
        Node urshNode = new Node(Token.URSH, createNodeFromNumber(-10), createNodeFromNumber(1));
        Node result = optimize(urshNode);
        assertEquals(Token.NUMBER, result.getType());
        // JavaScript's >>> on a negative number (treated as unsigned 32-bit)
        // differs from Java's primitive long >>>.
        // -10 in 32-bit two's complement is 0xFFFFFFF6.
        // 0xFFFFFFF6 >>> 1 is 0x7FFFFFFB.
        // In Java, this would be Integer.MAX_VALUE / 2 + 1 + (-5).
        // We expect the JS result.
        assertEquals(2147483642.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldComparisonEqual() throws Exception {
        Node eqNode = new Node(Token.EQ, createNodeFromNumber(5), createNodeFromNumber(5));
        Node result = optimize(eqNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonNotEqual() throws Exception {
        Node neNode = new Node(Token.NE, createNodeFromNumber(5), createNodeFromNumber(10));
        Node result = optimize(neNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonLessThan() throws Exception {
        Node ltNode = new Node(Token.LT, createNodeFromNumber(5), createNodeFromNumber(10));
        Node result = optimize(ltNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonGreaterThan() throws Exception {
        Node gtNode = new Node(Token.GT, createNodeFromNumber(10), createNodeFromNumber(5));
        Node result = optimize(gtNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonLessThanOrEqual() throws Exception {
        Node leNode = new Node(Token.LE, createNodeFromNumber(5), createNodeFromNumber(5));
        Node result = optimize(leNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldComparisonGreaterThanOrEqual() throws Exception {
        Node geNode = new Node(Token.GE, createNodeFromNumber(10), createNodeFromNumber(5));
        Node result = optimize(geNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldAndTrueTrue() throws Exception {
        Node andNode = new Node(Token.AND, createNodeFromBoolean(true), createNodeFromBoolean(true));
        Node result = optimize(andNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldAndTrueFalse() throws Exception {
        Node andNode = new Node(Token.AND, createNodeFromBoolean(true), createNodeFromBoolean(false));
        Node result = optimize(andNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldAndFalseTrue() throws Exception {
        Node andNode = new Node(Token.AND, createNodeFromBoolean(false), createNodeFromBoolean(true));
        Node result = optimize(andNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldOrTrueTrue() throws Exception {
        Node orNode = new Node(Token.OR, createNodeFromBoolean(true), createNodeFromBoolean(true));
        Node result = optimize(orNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldOrTrueFalse() throws Exception {
        Node orNode = new Node(Token.OR, createNodeFromBoolean(true), createNodeFromBoolean(false));
        Node result = optimize(orNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldOrFalseTrue() throws Exception {
        Node orNode = new Node(Token.OR, createNodeFromBoolean(false), createNodeFromBoolean(true));
        Node result = optimize(orNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldOrFalseFalse() throws Exception {
        Node orNode = new Node(Token.OR, createNodeFromBoolean(false), createNodeFromBoolean(false));
        Node result = optimize(orNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldArrayLiteralLength() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, createNodeFromNumber(1), createNodeFromNumber(2), createNodeFromNumber(3));
        Node getPropNode = new Node(Token.GETPROP, arrayLit, Node.newString("length"));
        Node result = optimize(getPropNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(3.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldStringLength() throws Exception {
        Node stringNode = Node.newString("abc");
        Node getPropNode = new Node(Token.GETPROP, stringNode, Node.newString("length"));
        Node result = optimize(getPropNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(3.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldGetElemFromArrayLiteralValidIndex() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, createNodeFromNumber(10), createNodeFromNumber(20), createNodeFromNumber(30));
        Node getElemNode = new Node(Token.GETELEM, arrayLit, createNodeFromNumber(1));
        Node result = optimize(getElemNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(20.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldGetElemFromArrayLiteralFirstIndex() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, createNodeFromNumber(10), createNodeFromNumber(20), createNodeFromNumber(30));
        Node getElemNode = new Node(Token.GETELEM, arrayLit, createNodeFromNumber(0));
        Node result = optimize(getElemNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(10.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldGetElemFromArrayLiteralLastIndex() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, createNodeFromNumber(10), createNodeFromNumber(20), createNodeFromNumber(30));
        Node getElemNode = new Node(Token.GETELEM, arrayLit, createNodeFromNumber(2));
        Node result = optimize(getElemNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(30.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldInstanceOfImmutable() throws Exception {
        Node instanceofNode = new Node(Token.INSTANCEOF, createNodeFromNumber(123), createNodeFromString("Object"));
        Node result = optimize(instanceofNode);
        assertEquals(Token.FALSE, result.getType());
    }

    @Test
    public void testFoldInstanceOfObjectConstructor() throws Exception {
        Node instanceofNode = new Node(Token.INSTANCEOF, createNodeFromString("test"), createNodeFromString("Object"));
        Node result = optimize(instanceofNode);
        assertEquals(Token.TRUE, result.getType());
    }

    @Test
    public void testFoldArrayJoinEmpty() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT);
        Node joinCall = new Node(Token.CALL, new Node(Token.GETPROP, arrayLit, Node.newString("join")), Node.newString(""));
        Node result = optimize(joinCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("", result.getString());
    }

    @Test
    public void testFoldArrayJoinSingleElement() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newString("a"));
        Node joinCall = new Node(Token.CALL, new Node(Token.GETPROP, arrayLit, Node.newString("join")), Node.newString(""));
        Node result = optimize(joinCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("a", result.getString());
    }

    @Test
    public void testFoldArrayJoinMultipleElements() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"), Node.newString("c"));
        Node joinCall = new Node(Token.CALL, new Node(Token.GETPROP, arrayLit, Node.newString("join")), Node.newString(""));
        Node result = optimize(joinCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("abc", result.getString());
    }

    @Test
    public void testFoldArrayJoinWithCommaDelimiter() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, Node.newString("a"), Node.newString("b"));
        Node joinCall = new Node(Token.CALL, new Node(Token.GETPROP, arrayLit, Node.newString("join")), Node.newString(","));
        Node result = optimize(joinCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("a,b", result.getString());
    }

    @Test
    public void testFoldStringIndexOf() throws Exception {
        Node stringLiteral = Node.newString("abcdef");
        Node searchValue = Node.newString("cd");
        Node indexOfCall = new Node(Token.CALL, new Node(Token.GETPROP, stringLiteral, Node.newString("indexOf")), searchValue);
        Node result = optimize(indexOfCall);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(2.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldStringIndexOfNotFound() throws Exception {
        Node stringLiteral = Node.newString("abcdef");
        Node searchValue = Node.newString("xyz");
        Node indexOfCall = new Node(Token.CALL, new Node(Token.GETPROP, stringLiteral, Node.newString("indexOf")), searchValue);
        Node result = optimize(indexOfCall);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(-1.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldStringIndexOfWithStartIndex() throws Exception {
        Node stringLiteral = Node.newString("abcabc");
        Node searchValue = Node.newString("bc");
        Node startIndex = Node.newNumber(3);
        Node indexOfCall = new Node(Token.CALL, new Node(Token.GETPROP, stringLiteral, Node.newString("indexOf")), searchValue, startIndex);
        Node result = optimize(indexOfCall);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(3.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldStringLastIndexOf() throws Exception {
        Node stringLiteral = Node.newString("abcabc");
        Node searchValue = Node.newString("bc");
        Node lastIndexOfCall = new Node(Token.CALL, new Node(Token.GETPROP, stringLiteral, Node.newString("lastIndexOf")), searchValue);
        Node result = optimize(lastIndexOfCall);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(3.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldStringLastIndexOfWithStartIndex() throws Exception {
        Node stringLiteral = Node.newString("abcabc");
        Node searchValue = Node.newString("bc");
        Node startIndex = Node.newNumber(3); // Start from index 3
        Node lastIndexOfCall = new Node(Token.CALL, new Node(Token.GETPROP, stringLiteral, Node.newString("lastIndexOf")), searchValue, startIndex);
        Node result = optimize(lastIndexOfCall);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(3.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldStringSubstringSimple() throws Exception {
        Node stringLiteral = Node.newString("abcdef");
        Node startIndex = Node.newNumber(2);
        Node endIndex = Node.newNumber(4);
        Node substringCall = new Node(Token.CALL, new Node(Token.GETPROP, stringLiteral, Node.newString("substring")), startIndex, endIndex);
        Node result = optimize(substringCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("cd", result.getString());
    }

    @Test
    public void testFoldStringSubstringToEnd() throws Exception {
        Node stringLiteral = Node.newString("abcdef");
        Node startIndex = Node.newNumber(2);
        Node substringCall = new Node(Token.CALL, new Node(Token.GETPROP, stringLiteral, Node.newString("substring")), startIndex);
        Node result = optimize(substringCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("cdef", result.getString());
    }

    @Test
    public void testFoldStringSubstrSimple() throws Exception {
        Node stringLiteral = Node.newString("abcdef");
        Node start = Node.newNumber(2);
        Node length = Node.newNumber(2);
        Node substrCall = new Node(Token.CALL, new Node(Token.GETPROP, stringLiteral, Node.newString("substr")), start, length);
        Node result = optimize(substrCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("cd", result.getString());
    }

    @Test
    public void testFoldStringSubstrToTheEnd() throws Exception {
        Node stringLiteral = Node.newString("abcdef");
        Node start = Node.newNumber(4);
        Node substrCall = new Node(Token.CALL, new Node(Token.GETPROP, stringLiteral, Node.newString("substr")), start);
        Node result = optimize(substrCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("ef", result.getString());
    }

    // The implementation of substr with negative indices or lengths is not folded by the current PeepholeFoldConstants.
    // These tests verify that the node remains a CALL node, indicating no folding occurred.
    @Test
    public void testFoldStringSubstrNegativeStart() throws Exception {
        Node stringLiteral = Node.newString("abcdef");
        Node start = Node.newNumber(-2);
        Node length = Node.newNumber(2);
        Node substrCall = new Node(Token.CALL, new Node(Token.GETPROP, stringLiteral, Node.newString("substr")), start, length);
        Node result = optimize(substrCall);
        assertEquals(Token.CALL, result.getType()); // No folding expected for negative start
    }

    @Test
    public void testFoldStringSubstrNegativeLength() throws Exception {
        Node stringLiteral = Node.newString("abcdef");
        Node start = Node.newNumber(2);
        Node length = Node.newNumber(-1); // Negative length
        Node substrCall = new Node(Token.CALL, new Node(Token.GETPROP, stringLiteral, Node.newString("substr")), start, length);
        Node result = optimize(substrCall);
        assertEquals(Token.CALL, result.getType()); // No folding expected for negative length
    }

    @Test
    public void testFoldStringToLowercase() throws Exception {
        Node stringLiteral = Node.newString("HeLlO");
        Node toLowerCaseCall = new Node(Token.CALL, new Node(Token.GETPROP, stringLiteral, Node.newString("toLowerCase")));
        Node result = optimize(toLowerCaseCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("hello", result.getString());
    }

    @Test
    public void testFoldStringToUpperCase() throws Exception {
        Node stringLiteral = Node.newString("HeLlO");
        Node toUpperCaseCall = new Node(Token.CALL, new Node(Token.GETPROP, stringLiteral, Node.newString("toUpperCase")));
        Node result = optimize(toUpperCaseCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("HELLO", result.getString());
    }

    @Test
    public void testFoldNewString() throws Exception {
        // The Node constructor for new String("test") is Node(Token.NEW, constructor, arg1, ...)
        // Here, constructor is NAME, value "String"
        Node stringConstructor = new Node(Token.NAME, Node.newString("String"));
        Node stringArg = Node.newString("test");
        Node stringConstructorCall = new Node(Token.NEW, stringConstructor, stringArg);
        Node result = optimize(stringConstructorCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("test", result.getString());
    }

    @Test
    public void testFoldNewStringEmpty() throws Exception {
        // The Node constructor for new String() is Node(Token.NEW, constructor)
        Node stringConstructor = new Node(Token.NAME, Node.newString("String"));
        Node stringConstructorCall = new Node(Token.NEW, stringConstructor);
        Node result = optimize(stringConstructorCall);
        assertEquals(Token.STRING, result.getType());
        assertEquals("", result.getString());
    }

    @Test
    public void testFoldAddLeftChildOpNumber() throws Exception {
        Node left = new Node(Token.ADD, Node.newNumber(2), Node.newNumber(3));
        Node addNode = new Node(Token.ADD, left, Node.newNumber(5));
        Node result = optimize(addNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(10.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldMulLeftChildOpNumber() throws Exception {
        Node left = new Node(Token.MUL, Node.newNumber(2), Node.newNumber(3));
        Node mulNode = new Node(Token.MUL, left, Node.newNumber(5));
        Node result = optimize(mulNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(30.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldAddLeftChildOpString() throws Exception {
        Node left = new Node(Token.ADD, Node.newString("a"), Node.newString("b"));
        Node addNode = new Node(Token.ADD, left, Node.newString("c"));
        Node result = optimize(addNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("abc", result.getString());
    }

    @Test
    public void testFoldGetElemFromArrayLiteralOutOfBounds() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, createNodeFromNumber(10), createNodeFromNumber(20));
        Node getElemNode = new Node(Token.GETELEM, arrayLit, createNodeFromNumber(5));
        // The optimization reports an error but does not change the node structure.
        Node result = optimize(getElemNode);
        assertEquals(Token.GETELEM, result.getType()); // The node itself is not replaced.
    }

    @Test
    public void testFoldGetElemFromArrayLiteralInvalidIndex() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, createNodeFromNumber(10), createNodeFromNumber(20));
        Node getElemNode = new Node(Token.GETELEM, arrayLit, Node.newNumber(1.5));
        // The optimization reports an error but does not change the node structure.
        Node result = optimize(getElemNode);
        assertEquals(Token.GETELEM, result.getType()); // The node itself is not replaced.
    }

    @Test
    public void testFoldGetElemFromArrayLiteralNegativeIndex() throws Exception {
        Node arrayLit = new Node(Token.ARRAYLIT, createNodeFromNumber(10), createNodeFromNumber(20));
        Node getElemNode = new Node(Token.GETELEM, arrayLit, createNodeFromNumber(-1));
        // The optimization reports an error but does not change the node structure.
        Node result = optimize(getElemNode);
        assertEquals(Token.GETELEM, result.getType()); // The node itself is not replaced.
    }

    @Test
    public void testFoldVoidZero() throws Exception {
        Node voidNode = new Node(Token.VOID, createNodeFromNumber(0.0));
        Node result = optimize(voidNode);
        assertEquals(Token.NUMBER, result.getType());
        assertEquals(0.0, result.getDouble(), 1e-9);
    }

    @Test
    public void testFoldVoidNonZero() throws Exception {
        Node voidNode = new Node(Token.VOID, createNodeFromString("something"));
        // Need to wrap in a parent to allow replaceChild to work correctly within optimize.
        Node parent = new Node(Token.EXPR_RESULT, voidNode);
        peepholeFoldConstants.optimizeSubtree(voidNode); // Optimize directly
        // After optimization, the VOID node should be replaced by a number 0.
        Node replacedNode = parent.getFirstChild();
        assertEquals(Token.NUMBER, replacedNode.getType());
        assertEquals(0.0, replacedNode.getDouble(), 1e-9);
    }

    @Test
    public void testFoldAssignAdd() throws Exception {
        Node left = Node.newNumber(5);
        Node rightRhs = new Node(Token.ADD, Node.newNumber(10), Node.newNumber(2));
        Node assignNode = new Node(Token.ASSIGN, left, rightRhs);
        Node result = optimize(assignNode);
        assertEquals(Token.ASSIGN_ADD, result.getType());
        // Ensure the left and right operands are correctly set in the new ASSIGN_ADD node.
        assertEquals(left, result.getFirstChild());
        assertEquals(rightRhs.getLastChild(), result.getLastChild());
    }

    @Test
    public void testFoldAssignMul() throws Exception {
        Node left = Node.newNumber(5);
        Node rightRhs = new Node(Token.MUL, Node.newNumber(10), Node.newNumber(2));
        Node assignNode = new Node(Token.ASSIGN, left, rightRhs);
        Node result = optimize(assignNode);
        assertEquals(Token.ASSIGN_MUL, result.getType());
        assertEquals(left, result.getFirstChild());
        assertEquals(rightRhs.getLastChild(), result.getLastChild());
    }

    @Test
    public void testFoldAssignBitAnd() throws Exception {
        Node left = Node.newNumber(5);
        Node rightRhs = new Node(Token.BITAND, Node.newNumber(10), Node.newNumber(2));
        Node assignNode = new Node(Token.ASSIGN, left, rightRhs);
        Node result = optimize(assignNode);
        assertEquals(Token.ASSIGN_BITAND, result.getType());
        assertEquals(left, result.getFirstChild());
        assertEquals(rightRhs.getLastChild(), result.getLastChild());
    }

    @Test
    public void testFoldObjectLiteralAccessFolded() throws Exception {
        Node objLit = new Node(Token.OBJECTLIT,
                               new Node(Token.STRING, "a", 0, 0), // Key name
                               new Node(Token.SET, new Node(Token.STRING, "a"), Node.newString("value_a"))); // Property definition
        Node getPropNode = new Node(Token.GETPROP, objLit, Node.newString("a"));
        Node result = optimize(getPropNode);
        assertEquals(Token.STRING, result.getType());
        assertEquals("value_a", result.getString());
    }

    @Test
    public void testFoldObjectLiteralAccessFunctionName() throws Exception {
        Node objLit = new Node(Token.OBJECTLIT,
                               new Node(Token.STRING, "method", 0, 0), // Key name
                               new Node(Token.SET, new Node(Token.STRING, "method"), new Node(Token.FUNCTION))); // Property definition
        Node getPropNode = new Node(Token.GETPROP, objLit, Node.newString("method"));
        Node result = optimize(getPropNode);
        assertEquals(Token.CALL, result.getType()); // Function is replaced by CALL
    }

    @Test
    public void testFoldObjectLiteralAccessNotFound() throws Exception {
        Node objLit = new Node(Token.OBJECTLIT,
                               new Node(Token.STRING, "a", 0, 0),
                               new Node(Token.SET, new Node(Token.STRING, "a"), Node.newString("value_a")));
        Node getPropNode = new Node(Token.GETPROP, objLit, Node.newString("b")); // Accessing a non-existent property
        Node result = optimize(getPropNode);
        assertEquals(Token.GETPROP, result.getType()); // Should not be folded
    }

    @Test
    public void testFoldObjectLiteralAccessAssignmentTarget() throws Exception {
        Node objLit = new Node(Token.OBJECTLIT,
                               new Node(Token.STRING, "a", 0, 0),
                               new Node(Token.SET, new Node(Token.STRING, "a"), Node.newString("value_a")));
        Node getPropNode = new Node(Token.GETPROP, objLit, Node.newString("a"));
        Node assignNode = new Node(Token.ASSIGN_ADD, getPropNode, Node.newNumber(1)); // Example assignment op
        // Optimize the parent assignment node to see if the GETPROP is folded.
        Node result = optimize(assignNode);
        assertEquals(Token.ASSIGN_ADD, result.getType());
        // The GETPROP node should not be folded when it's part of an assignment.
        // We check the type of the child of the result node.
        assertEquals(Token.GETPROP, result.getFirstChild().getType());
    }
}
```