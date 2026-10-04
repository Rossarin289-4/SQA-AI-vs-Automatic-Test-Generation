```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.parsing.ParserRunner;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.Node;
import java.io.IOException;
import java.util.logging.Logger;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;
import com.google.common.collect.HashMultiset;
import com.google.common.collect.Lists;
import com.google.common.collect.Multiset;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformation;
import com.google.javascript.jscomp.CompilerOptions.AliasTransformationHandler;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.SourcePosition;
import java.util.List;
import java.util.function.Supplier; // Added import for Supplier

public class JsAstTest {

    // Dummy AbstractCompiler for testing purposes
    private static class DummyCompiler extends AbstractCompiler {
        private ErrorManager errorManager = new BasicErrorManager() {
            @Override
            public boolean shouldReport(CheckLevel level) {
                return true;
            }

            @Override
            public void report(JSError error) {
                // Do nothing for now
            }

            @Override
            public void printSummary() {
                // No-op
            }

            // Added missing method
            @Override
            public void println(CheckLevel level, JSError error) {
                 // No-op
            }
        };

        @Override
        public void report(JSError error) {
            // Do nothing for now
        }

        @Override
        public ErrorManager getErrorManager() {
            return errorManager;
        }

        @Override
        public CodingConvention getCodingConvention() {
            // Default coding convention
            return new DefaultCodingConvention();
        }

        @Override
        public Node getNodeForCodeInsertion(JSModule module) {
            return IR.script(); // Dummy node
        }

        @Override
        public String toSource(Node root) {
            return "dummy source"; // Dummy source
        }

        @Override
        public ErrorReporter getDefaultErrorReporter() {
            return new BaseErrorReporter() {
                @Override
                public void runtimeError(String message, String sourceName, int line, int column, String script, int scriptStart, int scriptEnd) {
                    // Do nothing
                }
            };
        }
        
        @Override
        public Node getOldParseTreeByName(String sourceName) {
            return null;
        }

        @Override
        public TypeValidator getTypeValidator() {
            return null; // Not needed for these tests
        }

        @Override
        public JSModuleGraph getModuleGraph() {
            return null; // Not needed
        }

        @Override
        public List<CompilerInput> getInputsInOrder() {
            return Collections.emptyList(); // Not needed
        }

        @Override
        public JSTypeRegistry getTypeRegistry() {
            return null; // Not needed
        }

        @Override
        public Scope getTopScope() {
            return null; // Not needed
        }

        @Override
        public CompilerInput getInput(InputId inputId) {
            return null; // Not needed
        }

        @Override
        public SourceFile getSourceFileByName(String sourceName) {
            return null; // Not needed
        }

        @Override
        public CompilerInput newExternInput(String name) {
            return null; // Not needed
        }

        @Override
        public ReverseAbstractInterpreter getReverseAbstractInterpreter() {
            return null; // Not needed
        }

        @Override
        public Supplier<String> getUniqueNameIdSupplier() {
            return () -> "unique";
        }

        @Override
        public boolean hasHaltingErrors() {
            return false; // Not needed
        }

        @Override
        public void addChangeHandler(CodeChangeHandler handler) {
            // Not needed
        }

        @Override
        public void removeChangeHandler(CodeChangeHandler handler) {
            // Not needed
        }

        @Override
        public void setScope(Node n) {
            // Not needed
        }

        @Override
        public Node getJsRoot() {
            return IR.script(); // Dummy node
        }

        @Override
        public boolean hasScopeChanged(Node n) {
            return false; // Not needed
        }

        @Override
        public void reportChangeToEnclosingScope(Node n) {
            // Not needed
        }

        @Override
        public boolean isIdeMode() {
            return false; // Not needed
        }

        @Override
        public boolean acceptEcmaScript5() {
            return true; // Default
        }

        @Override
        public boolean acceptConstKeyword() {
            return true; // Default
        }

        @Override
        public Config getParserConfig() {
            return new ParserRunner.Config.Builder().setSuppressWarningHandler(getDefaultErrorReporter()).build();
        }

        @Override
        public boolean isTypeCheckingEnabled() {
            return false; // Not needed
        }

        @Override
        public void prepareAst(Node root) {
            // Not needed
        }

        @Override
        public void reportCodeChange() {
            // Not needed
        }

        @Override
        public void addToDebugLog(String message) {
            // Not needed
        }

        @Override
        public void setCssRenamingMap(CssRenamingMap map) {
            // Not needed
        }

        @Override
        public CssRenamingMap getCssRenamingMap() {
            return null; // Not needed
        }

        @Override
        public boolean areNodesEqualForInlining(Node n1, Node n2) {
            return false; // Not needed
        }
        
        @Override
        public LifeCycleStage getLifeCycleStage() {
            return LifeCycleStage.NORMALIZED; // Dummy stage
        }
    }

    // Dummy SourceFile for testing purposes
    private static class DummySourceFile extends SourceFile {
        private String code;

        protected DummySourceFile(String name, String code) {
            super(name);
            this.code = code;
        }

        @Override
        public String getCode() {
            return code;
        }

        @Override
        public void clearCachedSource() {
            // No-op
        }
    }

    private static final DummyCompiler COMPILER = new DummyCompiler();

    @Test
    public void testConstructorAndGetAstRoot() throws Exception {
        SourceFile sf = new DummySourceFile("test.js", "var a = 1;");
        JsAst jsAst = new JsAst(sf);
        Node root = jsAst.getAstRoot(COMPILER);
        assertNotNull(root);
        assertTrue(root.isScript());
        assertEquals(1, root.getChildCount());
    }

    @Test
    public void testGetAstRootTwice() throws Exception {
        SourceFile sf = new DummySourceFile("test.js", "var b = 2;");
        JsAst jsAst = new JsAst(sf);
        Node root1 = jsAst.getAstRoot(COMPILER);
        Node root2 = jsAst.getAstRoot(COMPILER);
        assertNotNull(root1);
        assertNotNull(root2);
        // The AST should be generated only once
        assertSame(root1, root2);
    }

    @Test
    public void testClearAst() throws Exception {
        SourceFile sf = new DummySourceFile("test.js", "var c = 3;");
        JsAst jsAst = new JsAst(sf);
        jsAst.getAstRoot(COMPILER); // Generate AST
        jsAst.clearAst();
        // After clearing, getAstRoot should regenerate it
        Node root = jsAst.getAstRoot(COMPILER);
        assertNotNull(root);
        assertTrue(root.isScript());
    }

    @Test
    public void testGetInputId() throws Exception {
        SourceFile sf = new DummySourceFile("test.js", "var d = 4;");
        JsAst jsAst = new JsAst(sf);
        InputId id = jsAst.getInputId();
        assertNotNull(id);
        assertEquals("test.js", id.getId());
    }

    @Test
    public void testGetSourceFile() throws Exception {
        SourceFile sf = new DummySourceFile("test.js", "var e = 5;");
        JsAst jsAst = new JsAst(sf);
        SourceFile sourceFile = jsAst.getSourceFile();
        assertNotNull(sourceFile);
        assertEquals("test.js", sourceFile.getName());
        assertEquals("var e = 5;", sourceFile.getCode());
    }

    @Test
    public void testSetSourceFile() throws Exception {
        SourceFile sf1 = new DummySourceFile("test1.js", "var f = 6;");
        SourceFile sf2 = new DummySourceFile("test2.js", "var g = 7;");
        JsAst jsAst = new JsAst(sf1);
        assertEquals(sf1, jsAst.getSourceFile());
        jsAst.setSourceFile(sf2);
        assertEquals(sf2, jsAst.getSourceFile());
    }

    @Test
    public void testSetSourceFileWithDifferentNameFails() throws Exception {
        SourceFile sf1 = new DummySourceFile("test1.js", "var h = 8;");
        SourceFile sf2 = new DummySourceFile("test2.js", "var i = 9;");
        JsAst jsAst = new JsAst(sf1);
        try {
            jsAst.setSourceFile(sf2);
            fail("Expected Preconditions.checkState to fail");
        } catch (IllegalStateException expected) {
            // Expected
        }
    }
    
    // Tests for NodeUtil methods used indirectly or with simple logic

    @Test
    public void testIsStrWhiteSpaceChar() throws Exception {
        assertTrue(NodeUtil.isStrWhiteSpaceChar(' ') == TernaryValue.TRUE);
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\n') == TernaryValue.TRUE);
        assertTrue(NodeUtil.isStrWhiteSpaceChar('\u000B') == TernaryValue.UNKNOWN);
        assertFalse(NodeUtil.isStrWhiteSpaceChar('a') == TernaryValue.TRUE);
    }

    @Test
    public void testGetNearestFunctionNameForFunctionDeclaration() throws Exception {
        Node fn = IR.function(IR.name("myFunc"), IR.paramList(), IR.block());
        assertEquals("myFunc", NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testGetNearestFunctionNameForFunctionExpressionAssignedToVar() throws Exception {
        Node fn = IR.function(null, IR.paramList(), IR.block());
        Node var = IR.var(IR.name("myVar"), fn);
        assertEquals("myVar", NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testGetNearestFunctionNameForFunctionExpressionInObjectLit() throws Exception {
        Node fn = IR.function(null, IR.paramList(), IR.block());
        Node prop = IR.stringKey("myProp", fn); // Corrected: stringKey takes only String
        Node obj = IR.objectlit(prop);
        assertEquals("myProp", NodeUtil.getNearestFunctionName(fn));
    }
    
    @Test
    public void testIsLValueForName() {
        Node name = IR.name("x");
        Node assign = IR.assign(name, IR.number(1));
        assertTrue(NodeUtil.isLValue(name));
    }

    @Test
    public void testIsLValueForGetProp() {
        Node obj = IR.name("obj");
        Node prop = IR.stringKey("prop");
        Node getProp = IR.getprop(obj, prop);
        Node assign = IR.assign(getProp, IR.number(1));
        assertTrue(NodeUtil.isLValue(getProp));
    }

    @Test
    public void testIsLValueForGetElem() {
        Node obj = IR.name("arr");
        Node index = IR.number(0);
        Node getElem = IR.getelem(obj, index);
        Node assign = IR.assign(getElem, IR.number(1));
        assertTrue(NodeUtil.isLValue(getElem));
    }
    
    @Test
    public void testNewQualifiedNameNodeSimple() {
        Node nameNode = NodeUtil.newQualifiedNameNode(COMPILER.getCodingConvention(), "myVar");
        assertTrue(nameNode.isName());
        assertEquals("myVar", nameNode.getString());
    }

    @Test
    public void testNewQualifiedNameNodeNested() {
        Node nameNode = NodeUtil.newQualifiedNameNode(COMPILER.getCodingConvention(), "my.nested.var");
        assertTrue(nameNode.isGetProp());
        assertEquals("my.nested.var", nameNode.getQualifiedName());
    }
    
    @Test
    public void testNewQualifiedNameNodeDeclarationVar() {
        Node value = IR.number(10);
        Node decl = NodeUtil.newQualifiedNameNodeDeclaration(COMPILER.getCodingConvention(), "my.var", value, null);
        assertTrue(decl.isVar());
        assertEquals("my.var", decl.getFirstChild().getQualifiedName());
        assertEquals(value, decl.getChildAtIndex(1)); // Use getChildAtIndex instead of getSecondChild
    }

    @Test
    public void testNewQualifiedNameNodeDeclarationAssign() {
        Node value = IR.number(10);
        Node varDecl = NodeUtil.newQualifiedNameNodeDeclaration(COMPILER.getCodingConvention(), "my.qualified.var", IR.number(5), null);
        assertTrue(varDecl.isVar());
        assertTrue(varDecl.getFirstChild().isGetProp());
        assertEquals("my.qualified.var", varDecl.getFirstChild().getQualifiedName());
    }
    
    @Test
    public void testIsValidQualifiedNameSimple() {
        assertTrue(NodeUtil.isValidQualifiedName("myVar"));
    }

    @Test
    public void testIsValidQualifiedNameNested() {
        assertTrue(NodeUtil.isValidQualifiedName("my.nested.var"));
    }

    @Test
    public void testIsValidQualifiedNameInvalidStart() {
        assertFalse(NodeUtil.isValidQualifiedName(".my.var"));
    }

    @Test
    public void testIsValidQualifiedNameInvalidEnd() {
        assertFalse(NodeUtil.isValidQualifiedName("my.var."));
    }
    
    @Test
    public void testGetFunctionParametersBasic() {
        Node params = IR.paramList(IR.name("a"), IR.name("b"));
        Node fn = IR.function(IR.name("foo"), params, IR.block());
        Node functionParams = NodeUtil.getFunctionParameters(fn);
        assertNotNull(functionParams);
        assertTrue(functionParams.hasChildren());
        assertEquals("a", functionParams.getFirstChild().getString());
        assertEquals("b", functionParams.getLastChild().getString());
    }

    @Test
    public void testGetFunctionParametersNoParams() {
        Node params = IR.paramList();
        Node fn = IR.function(IR.name("foo"), params, IR.block());
        Node functionParams = NodeUtil.getFunctionParameters(fn);
        assertNotNull(functionParams);
        assertFalse(functionParams.hasChildren());
    }
    
    @Test
    public void testGetFunctionJSDocInfoSimple() {
        Node fn = IR.function(IR.name("foo"), IR.paramList(), IR.block());
        JSDocInfo info = new JSDocInfo();
        fn.setJSDocInfo(info);
        assertEquals(info, NodeUtil.getFunctionJSDocInfo(fn));
    }

    @Test
    public void testGetFunctionJSDocInfoForExpression() {
        Node fn = IR.function(null, IR.paramList(), IR.block());
        JSDocInfo info = new JSDocInfo();
        Node assign = IR.assign(IR.name("myFunc"), fn);
        Node exprResult = IR.exprResult(assign);
        assign.setJSDocInfo(info); // JSDoc on assignment
        
        assertEquals(info, NodeUtil.getFunctionJSDocInfo(fn));
    }
    
    @Test
    public void testGetSourceName() {
        Node script = IR.script();
        InputId inputId = new InputId("test.js");
        script.setInputId(inputId);
        assertEquals("test.js", NodeUtil.getSourceName(script));
    }

    @Test
    public void testGetSourceNameFromAncestor() {
        Node body = IR.block();
        Node fn = IR.function(IR.name("foo"), IR.paramList(), body);
        Node script = IR.script(fn);
        InputId inputId = new InputId("test.js");
        script.setInputId(inputId);
        assertEquals("test.js", NodeUtil.getSourceName(body));
    }

    @Test
    public void testGetSourceNameNull() {
        Node script = IR.script();
        assertNull(NodeUtil.getSourceName(script));
    }

    @Test
    public void testMapMainToClone() {
        Node mainScript = IR.script(IR.block(IR.var(IR.name("a"), IR.number(1))));
        Node cloneScript = IR.script(IR.block(IR.var(IR.name("a"), IR.number(1))));
        Map<Node, Node> mapping = NodeUtil.mapMainToClone(mainScript, cloneScript);
        assertNotNull(mapping);
        assertEquals(cloneScript, mapping.get(mainScript));
    }
    
    @Test
    public void testVerifyScopeChanges() {
        Node mainScript = IR.script(IR.block(IR.var(IR.name("a"), IR.number(1))));
        Node cloneScript = IR.script(IR.block(IR.var(IR.name("a"), IR.number(1))));
        Map<Node, Node> mapping = new HashMap<>();
        mapping.put(mainScript, cloneScript);
        
        // Initially, no changes.
        NodeUtil.verifyScopeChanges(mapping, mainScript, true, COMPILER);
        
        // Simulate a change in the main AST
        mainScript.getFirstChild().getChildAtIndex(0).setString("b"); // Change 'a' to 'b'
        
        // Now verify should fail if verifyUnchangedNodes is true
        try {
            NodeUtil.verifyScopeChanges(mapping, mainScript, true, COMPILER);
            fail("Expected failure due to scope change");
        } catch (IllegalStateException expected) {
            // Expected
        }
    }
    
    @Test
    public void testProcessOnEmptyRoot() {
        Node root = IR.script();
        ScopedAliases pass = new ScopedAliases(COMPILER, null, null);
        pass.process(null, root); // Should not throw
    }

    @Test
    public void testHotSwapScriptOnEmptyRoot() {
        Node root = IR.script();
        ScopedAliases pass = new ScopedAliases(COMPILER, null, null);
        pass.hotSwapScript(root, null); // Should not throw
    }
}
```