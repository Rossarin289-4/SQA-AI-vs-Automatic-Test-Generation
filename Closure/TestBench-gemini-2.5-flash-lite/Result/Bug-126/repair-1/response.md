```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.io.IOException;
import java.io.EOFException;

public class MinimizeExitPointsTest {

    // Mock Compiler class for testing, implementing the necessary methods.
    private static class MockCompiler implements AbstractCompiler {
        @Override
        public void reportCodeChange() {
            // No-op
        }

        @Override
        public void setCompilerOptions(CompilerOptions options) {}

        @Override
        public CompilerOptions getCompilerOptions() {
            return new CompilerOptions();
        }

        @Override
        public Node parse(CodeChangeHandler.RecentChange change, String source, String originalName, DiagnosticType errorType, DiagnosticType warnings, boolean isModule) throws IOException, IOException {
            return null;
        }

        @Override
        public Node parseSyntheticCode(String code) throws IOException {
            return null;
        }

        @Override
        public Node parseTestCode(String code) throws IOException {
            return null;
        }

        @Override
        public boolean areRuntimeTypeCheckersEnabled() {
            return false;
        }

        @Override
        public String getSourcePath(Node node) {
            return null;
        }

        @Override
        public void process(Node externs, Node root) {}

        @Override
        public void process(Node externs, Node root, String rootName) {}

        @Override
        public <T extends JSError> T report(Node node, DiagnosticType diagnosticType, String... arguments) {
            return null;
        }

        @Override
        public <T extends JSError> T report(Node node, CheckLevel level, DiagnosticType diagnosticType, String... arguments) {
            return null;
        }

        @Override
        public JSError makeError(Node node, DiagnosticType diagnosticType, String... arguments) {
            return null;
        }

        @Override
        public JSError makeError(Node node, CheckLevel level, DiagnosticType diagnosticType, String... arguments) {
            return null;
        }

        @Override
        public void setErrorManager(ErrorManager errorManager) {}

        @Override
        public ErrorManager getErrorManager() {
            return new BasicErrorManager() {
                @Override
                protected void printSummary(Appendable appendable) throws IOException {
                }
            };
        }

        @Override
        public boolean isInliningForbidden() {
            return false;
        }

        @Override
        public boolean shouldReport(CheckLevel level) {
            return false;
        }

        @Override
        public void addChange(CodeChangeHandler.CodeChange s) {}

        @Override
        public String normalize(String code) throws IOException {
            return null;
        }

        @Override
        public String getAstDotGraph(Node n) {
            return null;
        }

        @Override
        public void setLifeCycle(LifeCycle lifeCycle) {}

        @Override
        public LifeCycle getLifeCycle() {
            return null;
        }

        @Override
        public boolean isIdeMode() {
            return false;
        }

        @Override
        public void debug(String message) {}

        @Override
        public void log(Level level, String message) {}

        @Override
        public boolean compareNodeContainers(Node n1, Node n2) {
            return false;
        }

        @Override
        public void setNodeForError(Node node) {}

        @Override
        public Node getNodeForError() {
            return null;
        }

        @Override
        public void reassessControlFlowGraphs() {}

        @Override
        public Pass[] getPasses() {
            return new Pass[0];
        }

        @Override
        public void inject(Pass pass) {}

        @Override
        public Pass getExistingPass(Class<? extends Pass> passClass) {
            return null;
        }

        @Override
        public VariableMap getVariableMap() {
            return null;
        }

        @Override
        public CodingConvention getCodingConvention() {
            return new ClosureCodingConvention();
        }

        @Override
        public PreprocessorSymbolTable getPreprocessorSymbolTable() {
            return null;
        }

        @Override
        public void setExterns(List<SourceFile> externs) {}

        @Override
        public List<SourceFile> getExterns() {
            return Collections.emptyList();
        }

        @Override
        public void setSources(List<SourceFile> sources) {}

        @Override
        public List<SourceFile> getSources() {
            return Collections.emptyList();
        }

        @Override
        public boolean isTypeCheckingEnabled() {
            return false;
        }

        @Override
        public void enableTypeChecking() {}

        @Override
        public void disableTypeChecking() {}

        @Override
        public String getSourceLine(Node n) {
            return null;
        }

        @Override
        public void setSymbolTable(SymbolTable symbolTable) {}

        @Override
        public SymbolTable getSymbolTable() {
            return null;
        }
    }

    // Helper to create a root node for testing purposes.
    private Node createRoot(Node... statements) {
        return IR.script(statements);
    }

    @Test
    public void testMinimizeExits_simpleReturn() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.returnNode(),
                                IR.exprResult(IR.number(1))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // After minimization, the exprResult(1) should be removed.
        assertEquals(0, root.getFirstChild().getLastChild().getLastChild().getChildCount());
    }

    @Test
    public void testMinimizeExits_ifReturn() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.ifNode(IR.trueNode(), IR.returnNode()),
                                IR.exprResult(IR.number(1))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The ifNode should remain, but the return inside should be processed.
        // The subsequent exprResult(1) should be moved into the if's else branch,
        // which is then optimized away because the if condition is always true.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        Node ifNode = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(Token.RETURN, ifNode.getChildAtIndex(1).getType()); // then block
        assertNull(ifNode.getChildAtIndex(2)); // else block
    }

    @Test
    public void testMinimizeExits_ifElseReturn() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.ifNode(IR.trueNode(), IR.returnNode(), IR.returnNode()),
                                IR.exprResult(IR.number(1))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The entire block should be simplified to a single IF with two returns.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        Node ifNode = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(Token.RETURN, ifNode.getChildAtIndex(1).getType()); // then block
        assertEquals(Token.RETURN, ifNode.getChildAtIndex(2).getType()); // else block
    }

    @Test
    public void testMinimizeExits_ifReturnElseStmt() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.ifNode(IR.trueNode(), IR.returnNode(), IR.exprResult(IR.number(1))),
                                IR.exprResult(IR.number(2))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The else block should be moved into the if, and then removed because the condition is true.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        Node ifNode = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(Token.RETURN, ifNode.getChildAtIndex(1).getType()); // then block
        assertNull(ifNode.getChildAtIndex(2)); // else block
    }

    @Test
    public void testMinimizeExits_ifStmtElseReturn() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.ifNode(IR.trueNode(), IR.exprResult(IR.number(1)), IR.returnNode()),
                                IR.exprResult(IR.number(2))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The if statement's else block should be minimized.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        Node ifNode = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(Token.EXPR_RESULT, ifNode.getChildAtIndex(1).getType()); // then block
        assertEquals(Token.RETURN, ifNode.getChildAtIndex(2).getType()); // else block
    }

    @Test
    public void testMinimizeExits_labelBreak() throws Exception {
        Node root = createRoot(
                IR.label(IR.labelName("l"),
                        IR.block(
                                IR.breakNode(IR.string("l")),
                                IR.exprResult(IR.number(1))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The break should be removed as it's the last statement in the labeled block.
        assertEquals(0, root.getFirstChild().getLastChild().getChildCount());
    }

    @Test
    public void testMinimizeExits_labelBreakWithOtherStmts() throws Exception {
        Node root = createRoot(
                IR.label(IR.labelName("l"),
                        IR.block(
                                IR.exprResult(IR.number(0)),
                                IR.breakNode(IR.string("l")),
                                IR.exprResult(IR.number(1))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The break should be removed, and the preceding statement moved into the if's else block.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        Node breakNode = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.BREAK, breakNode.getType());
        assertEquals("l", breakNode.getFirstChild().getString());
    }

    @Test
    public void testMinimizeExits_forContinue() throws Exception {
        Node root = createRoot(
                IR.forNode(IR.empty(), IR.trueNode(), IR.empty(),
                        IR.block(
                                IR.continueNode(),
                                IR.exprResult(IR.number(1))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The continue should be removed.
        assertEquals(0, root.getFirstChild().getLastChild().getLastChild().getChildCount());
    }

    @Test
    public void testMinimizeExits_whileContinue() throws Exception {
        Node root = createRoot(
                IR.whileNode(IR.trueNode(),
                        IR.block(
                                IR.continueNode(),
                                IR.exprResult(IR.number(1))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The continue should be removed.
        assertEquals(0, root.getFirstChild().getLastChild().getChildCount());
    }

    @Test
    public void testMinimizeExits_doContinue() throws Exception {
        Node root = createRoot(
                IR.doNode(
                        IR.block(
                                IR.continueNode(),
                                IR.exprResult(IR.number(1))
                        ), IR.trueNode()
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The continue should be removed.
        assertEquals(0, root.getFirstChild().getLastChild().getChildCount());
    }

    @Test
    public void testMinimizeExits_doBreakOnFalseCondition() throws Exception {
        Node root = createRoot(
                IR.doNode(
                        IR.block(
                                IR.breakNode(),
                                IR.exprResult(IR.number(1))
                        ), IR.falseNode()
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The break should be minimized because the condition is always false.
        assertEquals(0, root.getFirstChild().getLastChild().getChildCount());
    }

    @Test
    public void testMinimizeExits_multipleIfsInBlock() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.ifNode(IR.trueNode(), IR.returnNode()),
                                IR.ifNode(IR.trueNode(), IR.returnNode()),
                                IR.exprResult(IR.number(1))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // Should transform into a single IF. The last statement becomes the else of the combined IF.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        Node combinedIf = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.IF, combinedIf.getType());
        // The condition is implicitly "!true && !true" which is false.
        // The else part should be the original exprResult(1).
        assertEquals(Token.EXPR_RESULT, combinedIf.getChildAtIndex(2).getFirstChild().getType());
    }

    @Test
    public void testMinimizeExits_ifWithElseBlock() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.ifNode(IR.trueNode(), IR.returnNode(),
                                        IR.block(IR.exprResult(IR.number(1))))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The return in the then block should be removed. The else block should remain.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        Node ifNode = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(Token.RETURN, ifNode.getChildAtIndex(1).getType()); // then block
        Node elseBlock = ifNode.getChildAtIndex(2);
        assertEquals(Token.BLOCK, elseBlock.getType());
        assertEquals(1, elseBlock.getChildCount());
        assertEquals(Token.EXPR_RESULT, elseBlock.getFirstChild().getType());
    }

    @Test
    public void testMinimizeExits_tryCatchFinally() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.tryFinally(
                                        IR.block(IR.returnNode()),
                                        IR.block(IR.exprResult(IR.number(1)))
                                )
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        Node tryNode = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.TRY, tryNode.getType());
        Node tryBlock = tryNode.getFirstChild();
        assertEquals(Token.RETURN, tryBlock.getFirstChild().getType()); // Return in try should be removed.
        Node finallyBlock = tryNode.getLastChild();
        assertEquals(1, finallyBlock.getChildCount()); // Finally block should not be minimized.
        assertEquals(Token.EXPR_RESULT, finallyBlock.getFirstChild().getType());
    }

    @Test
    public void testMinimizeExits_tryCatchWithReturn() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.tryCatch(
                                        IR.block(IR.returnNode()),
                                        IR.catchNode(IR.name("e"), IR.block(IR.returnNode()))
                                )
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        Node tryNode = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.TRY, tryNode.getType());
        Node tryBlock = tryNode.getFirstChild();
        assertEquals(Token.RETURN, tryBlock.getFirstChild().getType()); // Return in try should be removed.
        Node catchBlock = tryNode.getLastChild().getLastChild();
        assertEquals(Token.RETURN, catchBlock.getFirstChild().getType()); // Return in catch should be removed.
    }

    @Test
    public void testMinimizeExits_breakWithoutLabel() throws Exception {
        Node root = createRoot(
                IR.block(
                        IR.breakNode(),
                        IR.exprResult(IR.number(1))
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The break should be removed.
        assertEquals(0, root.getFirstChild().getChildCount());
    }

    @Test
    public void testMinimizeExits_continueWithoutLabel() throws Exception {
        Node root = createRoot(
                IR.block(
                        IR.continueNode(),
                        IR.exprResult(IR.number(1))
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The continue should be removed.
        assertEquals(0, root.getFirstChild().getChildCount());
    }

    @Test
    public void testMinimizeExits_labelBreakMatchingLabel() throws Exception {
        Node root = createRoot(
                IR.label(IR.labelName("outer"),
                        IR.block(
                                IR.label(IR.labelName("inner"),
                                        IR.block(
                                                IR.breakNode(IR.string("inner")),
                                                IR.exprResult(IR.number(1))
                                        )
                                ),
                                IR.breakNode(IR.string("outer")),
                                IR.exprResult(IR.number(2))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The inner break and exprResult(1) should be removed. The outer break should remain.
        Node outerBlock = root.getFirstChild().getLastChild();
        assertEquals(2, outerBlock.getChildCount());

        Node innerLabel = outerBlock.getFirstChild();
        assertEquals(Token.LABEL, innerLabel.getType());
        Node innerBlock = innerLabel.getLastChild();
        assertEquals(0, innerBlock.getChildCount()); // inner break and exprResult(1) removed

        Node outerBreak = outerBlock.getLastChild().getFirstChild();
        assertEquals(Token.BREAK, outerBreak.getType());
        assertEquals("outer", outerBreak.getFirstChild().getString());
    }

    @Test
    public void testMinimizeExits_labelBreakMismatchedLabel() throws Exception {
        Node root = createRoot(
                IR.label(IR.labelName("outer"),
                        IR.block(
                                IR.breakNode(IR.string("mismatched")),
                                IR.exprResult(IR.number(1))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The break should not be removed as the label doesn't match.
        assertEquals(2, root.getFirstChild().getLastChild().getChildCount());
        Node breakNode = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.BREAK, breakNode.getType());
        assertEquals("mismatched", breakNode.getFirstChild().getString());
        Node exprResultNode = root.getFirstChild().getLastChild().getLastChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
    }

    @Test
    public void testMinimizeExits_functionWithReturnInElse() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.ifNode(IR.trueNode(), IR.exprResult(IR.number(1)), IR.returnNode())
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The return in the else block should be removed.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        Node ifNode = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(Token.EXPR_RESULT, ifNode.getChildAtIndex(1).getType()); // then block
        assertEquals(Token.RETURN, ifNode.getChildAtIndex(2).getType()); // else block
    }

    @Test
    public void testMinimizeExits_forWithContinueInElse() throws Exception {
        Node root = createRoot(
                IR.forNode(IR.empty(), IR.trueNode(), IR.empty(),
                        IR.block(
                                IR.ifNode(IR.trueNode(), IR.exprResult(IR.number(1)), IR.continueNode())
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The continue in the else block should be removed.
        assertEquals(1, root.getFirstChild().getLastChild().getLastChild().getChildCount());
        Node ifNode = root.getFirstChild().getLastChild().getLastChild().getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(Token.EXPR_RESULT, ifNode.getChildAtIndex(1).getType()); // then block
        assertEquals(Token.CONTINUE, ifNode.getChildAtIndex(2).getType()); // else block
    }

    @Test
    public void testMinimizeExits_blockWithMultipleExits() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.ifNode(IR.trueNode(), IR.returnNode()),
                                IR.ifNode(IR.trueNode(), IR.returnNode()),
                                IR.exprResult(IR.number(1))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // This should be reduced to a single IF, with the final exprResult becoming the else block.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        Node combinedIf = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.IF, combinedIf.getType());
        // The else block should contain the original exprResult(1)
        assertEquals(Token.EXPR_RESULT, combinedIf.getChildAtIndex(2).getFirstChild().getType());
    }

    @Test
    public void testMinimizeExits_nestedLabels() throws Exception {
        Node root = createRoot(
                IR.label(IR.labelName("outer"),
                        IR.block(
                                IR.label(IR.labelName("inner"),
                                        IR.block(
                                                IR.breakNode(IR.string("inner")),
                                                IR.exprResult(IR.number(1))
                                        )
                                ),
                                IR.breakNode(IR.string("outer")),
                                IR.exprResult(IR.number(2))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The inner break and exprResult(1) should be removed. The outer break should remain.
        Node outerBlock = root.getFirstChild().getLastChild();
        assertEquals(2, outerBlock.getChildCount());

        Node innerLabel = outerBlock.getFirstChild();
        assertEquals(Token.LABEL, innerLabel.getType());
        Node innerBlock = innerLabel.getLastChild();
        assertEquals(0, innerBlock.getChildCount()); // inner break and exprResult(1) removed

        Node outerBreak = outerBlock.getLastChild().getFirstChild();
        assertEquals(Token.BREAK, outerBreak.getType());
        assertEquals("outer", outerBreak.getFirstChild().getString());
    }

    @Test
    public void testMinimizeExits_emptyBlock() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block()
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // No changes expected for an empty block.
        assertEquals(0, root.getFirstChild().getLastChild().getChildCount());
    }

    @Test
    public void testMinimizeExits_ifWithoutElse() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.ifNode(IR.trueNode(), IR.returnNode())
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The return should be removed.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        Node ifNode = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(Token.RETURN, ifNode.getChildAtIndex(1).getType()); // then block
        assertNull(ifNode.getChildAtIndex(2)); // else block
    }

    @Test
    public void testMinimizeExits_doWhileWithBreak() throws Exception {
        Node root = createRoot(
                IR.doNode(
                        IR.block(
                                IR.breakNode(),
                                IR.exprResult(IR.number(1))
                        ), IR.trueNode()
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The break should be removed.
        assertEquals(0, root.getFirstChild().getLastChild().getChildCount());
    }

    @Test
    public void testMinimizeExits_ifConditionAlwaysFalse() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.ifNode(IR.falseNode(), IR.returnNode()),
                                IR.exprResult(IR.number(1))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The if statement should be removed entirely as its condition is false and it has no else.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getLastChild().getFirstChild().getType());
    }

    @Test
    public void testMinimizeExits_ifConditionAlwaysFalseWithElse() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.ifNode(IR.falseNode(), IR.returnNode(), IR.exprResult(IR.number(1))),
                                IR.exprResult(IR.number(2))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The if statement should be reduced to its else block, which is then placed at the end.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        Node exprResultNode = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.EXPR_RESULT, exprResultNode.getType());
        assertEquals(1.0, exprResultNode.getFirstChild().getDouble(), 0);
    }

    @Test
    public void testMinimizeExits_labelWithNoBreak() throws Exception {
        Node root = createRoot(
                IR.label(IR.labelName("l"),
                        IR.block(
                                IR.exprResult(IR.number(1))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // No changes should occur if there's no break.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        assertEquals(Token.EXPR_RESULT, root.getFirstChild().getLastChild().getFirstChild().getType());
    }

    @Test
    public void testMinimizeExits_complexIfElseStructure() throws Exception {
        Node root = createRoot(
                IR.function(IR.name("fn"), IR.empty(),
                        IR.block(
                                IR.ifNode(IR.trueNode(),
                                        IR.block(IR.returnNode(), IR.exprResult(IR.number(1))),
                                        IR.ifNode(IR.falseNode(), IR.continueNode(), IR.breakNode())
                                ),
                                IR.exprResult(IR.number(2))
                        )
                )
        );
        NodeTraversal.traverse(new MockCompiler(), root, new MinimizeExitPoints(new MockCompiler()));
        // The return in the first if should be removed. The inner if-else should be transformed.
        // The outer if's condition is true, so the else part is processed.
        // The inner if-else is `if(false) continue; else break;` which simplifies to just `break;`
        // The final exprResult(2) should be moved into the else block of the outer if.
        assertEquals(1, root.getFirstChild().getLastChild().getChildCount());
        Node ifNode = root.getFirstChild().getLastChild().getFirstChild();
        assertEquals(Token.IF, ifNode.getType());
        assertEquals(Token.RETURN, ifNode.getChildAtIndex(1).getType()); // then block
        Node elseBlock = ifNode.getChildAtIndex(2);
        assertEquals(Token.BLOCK, elseBlock.getType());
        assertEquals(2, elseBlock.getChildCount()); // break and exprResult(2)
        assertEquals(Token.BREAK, elseBlock.getFirstChild().getType());
        assertEquals(Token.EXPR_RESULT, elseBlock.getLastChild().getType());
    }
}
```
## SOURCE CODE ANALYSIS
The tests target the `tryMinimizeExits` and `tryMinimizeIfBlockExits` methods of the `MinimizeExitPoints` class. They focus on minimizing explicit exit points (RETURN, BREAK, CONTINUE) within various control flow structures like IF, FOR, WHILE, DO, TRY-CATCH-FINALLY, and LABEL.

## TEST CASE DESIGN
- `testMinimizeExits_simpleReturn`: Removes a RETURN from the end of a function block.
- `testMinimizeExits_ifReturn`: Processes a RETURN within an IF statement, moving subsequent statements.
- `testMinimizeExits_ifElseReturn`: Handles IF with RETURN in both THEN and ELSE branches.
- `testMinimizeExits_ifReturnElseStmt`: Optimizes IF with RETURN in THEN and a statement in ELSE.
- `testMinimizeExits_ifStmtElseReturn`: Optimizes IF with a statement in THEN and RETURN in ELSE.
- `testMinimizeExits_labelBreak`: Removes a BREAK from the end of a labeled block.
- `testMinimizeExits_labelBreakWithOtherStmts`: Moves statements before a BREAK in a labeled block.
- `testMinimizeExits_forContinue`: Removes a CONTINUE from a FOR loop body.
- `testMinimizeExits_whileContinue`: Removes a CONTINUE from a WHILE loop body.
- `testMinimizeExits_doContinue`: Removes a CONTINUE from a DO-WHILE loop body.
- `testMinimizeExits_doBreakOnFalseCondition`: Minimizes BREAK in DO-WHILE when condition is always false.
- `testMinimizeExits_multipleIfsInBlock`: Combines multiple IF statements with exits in a block.
- `testMinimizeExits_ifWithElseBlock`: Tests IF with a block as ELSE.
- `testMinimizeExits_tryCatchFinally`: Ensures FINALLY blocks are not minimized.
- `testMinimizeExits_tryCatchWithReturn`: Minimizes RETURNs within TRY and CATCH blocks.
- `testMinimizeExits_breakWithoutLabel`: Tests BREAK without a label in a simple block.
- `testMinimizeExits_continueWithoutLabel`: Tests CONTINUE without a label in a simple block.
- `testMinimizeExits_labelBreakMatchingLabel`: Handles nested labels with matching BREAK.
- `testMinimizeExits_labelBreakMismatchedLabel`: Tests BREAK with a non-matching label.
- `testMinimizeExits_functionWithReturnInElse`: Tests RETURN in the ELSE part of an IF within a function.
- `testMinimizeExits_forWithContinueInElse`: Tests CONTINUE in the ELSE part of an IF within a FOR loop.
- `testMinimizeExits_blockWithMultipleExits`: Tests multiple exit points within a general block.
- `testMinimizeExits_nestedLabels`: Tests BREAK within nested labeled blocks.
- `testMinimizeExits_emptyBlock`: Tests handling of an empty block.
- `testMinimizeExits_ifWithoutElse`: Tests IF with a RETURN and no ELSE branch.
- `testMinimizeExits_doWhileWithBreak`: Tests BREAK within a DO-WHILE loop.
- `testMinimizeExits_ifConditionAlwaysFalse`: Tests IF with a false condition and no ELSE.
- `testMinimizeExits_ifConditionAlwaysFalseWithElse`: Tests IF with a false condition and an ELSE branch.
- `testMinimizeExits_labelWithNoBreak`: Tests a labeled block with no BREAK statement.
- `testMinimizeExits_complexIfElseStructure`: Tests a more complex nested IF-ELSE structure with various exits.

## DEFECT DETECTION STRATEGY
The tests aim to verify that explicit exit statements (RETURN, BREAK, CONTINUE) at the end of reachable code blocks are correctly removed or integrated into conditional structures, preserving the program's control flow and behavior according to the reference implementation.

## SUMMARY
30 tests.

## LIMITATIONS
The tests are based on the provided reference source code and API outline. They do not cover all possible AST structures or edge cases that might not be apparent from the provided information. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.