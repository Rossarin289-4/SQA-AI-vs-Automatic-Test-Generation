```java
package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Behavior;
import com.google.javascript.jscomp.ReferenceCollectingCallback.Reference;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceCollection;
import com.google.javascript.jscomp.ReferenceCollectingCallback.ReferenceMap;
import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InlineObjectLiteralsTest {

    // Helper method to create a basic compiler instance for testing.
    private static AbstractCompiler createCompiler() {
        return new AbstractCompiler() {
            @Override
            public void process(Node externs, Node root) {}

            @Override
            public void process(Node externs, Node root, Set<Node> markedForCompilation) {}

            @Override
            public Node parse(com.google.javascript.jscomp.CompilerOptions.LanguageMode mode, String code) throws IOException {
                return null;
            }

            @Override
            public Node parseSyntheticCode(String code) {
                return null;
            }

            @Override
            public Node getRoot() {
                return null;
            }

            @Override
            public Node getAstRoot() {
                return null;
            }

            @Override
            public void reassessOwnership(Node node) {}

            @Override
            public boolean removeClosureAsserts() {
                return false;
            }

            @Override
            public void addChange(NodeChange<String> change) {}

            @Override
            public List<NodeChange<String>> getChanges() {
                return null;
            }

            @Override
            public void applyNodeChanges(List<NodeChange<String>> changes) {}

            @Override
            public void normalize(Node root) {}

            @Override
            public void setNormalized() {}

            @Override
            public boolean hasErrors() {
                return false;
            }

            @Override
            public void stop() {}

            @Override
            public int getErrorCount() {
                return 0;
            }

            @Override
            public int getWarningCount() {
                return 0;
            }

            @Override
            public JSError[] getErrors() {
                return new JSError[0];
            }

            @Override
            public JSError[] getWarnings() {
                return new JSError[0];
            }

            @Override
            public void throwError(JSError error) {
                throw new RuntimeException(error.format(null, null));
            }

            @Override
            public CodingConvention getCodingConvention() {
                return new DefaultCodingConvention();
            }

            @Override
            public void reportChangeToEnclosingSideEffects(Node n) {}

            @Override
            public void reportCodeChange() {}

            @Override
            public void updateGlobalVarReferences(String varName, Var var) {}

            @Override
            public boolean isNormalized() {
                return false;
            }

            @Override
            public boolean hasRegExpPrototype() {
                return false;
            }

            @Override
            public Supplier<String> getUniqueNameIdSupplier() {
                return () -> "unique";
            }

            @Override
            public boolean isIdeMode() {
                return false;
            }

            @Override
            public void setIdeMode(boolean ideMode) {}

            @Override
            public void setErrorManager(ErrorManager errorManager) {}

            @Override
            public String getSourceLine(Node n, int lineOffset) {
                return null;
            }

            @Override
            public void setSourceMapPath(String path) {}

            @Override
            public String getSourceMapPath() {
                return null;
            }

            @Override
            public void ensureLibraryInjected(String libraryName) {}
        };
    }

    private Node createObjectLit(Node... properties) {
        Node objLit = IR.objectlit();
        for (Node prop : properties) {
            objLit.addChildToBack(prop);
        }
        return objLit;
    }

    private Node createPropDef(String key, Node value) {
        return IR.propdef(IR.stringKey(key), value);
    }

    private Node createAssignment(String varName, Node value) {
        return IR.assign(IR.name(varName), value);
    }

    private Node createVarDecl(String varName, Node value) {
        return IR.var(IR.name(varName), value);
    }

    @Test
    public void testProcess_emptyTree() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script();
        pass.process(new Node(Token.EXTERN), root);
        assertEquals(Token.SCRIPT, root.getType());
    }

    @Test
    public void testProcess_noObjectLiterals() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(IR.exprResult(IR.string("hello")));
        pass.process(new Node(Token.EXTERN), root);
        assertEquals(Token.SCRIPT, root.getType());
        assertEquals("hello", root.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_simpleObjectLiteral() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("a", createObjectLit(
                        createPropDef("x", IR.number(1)),
                        createPropDef("y", IR.string("test"))
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node stmt = root.getFirstChild();
        assertEquals(Token.VAR, stmt.getType());
        assertEquals("x", stmt.getFirstChild().getString());
        assertEquals(1.0, stmt.getFirstChild().getSecondChild().getDouble(), 0.0);

        stmt = stmt.getNext();
        assertEquals(Token.VAR, stmt.getType());
        assertEquals("y", stmt.getFirstChild().getString());
        assertEquals("test", stmt.getFirstChild().getSecondChild().getString());
    }

    @Test
    public void testProcess_objectLiteralWithPropertyAccess() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("a", createObjectLit(
                        createPropDef("x", IR.number(1))
                )),
                IR.exprResult(IR.getprop(IR.name("a"), IR.string("x")))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_x = root.getFirstChild();
        assertEquals(Token.VAR, var_x.getType());
        assertEquals("x", var_x.getFirstChild().getString());
        assertEquals(1.0, var_x.getFirstChild().getSecondChild().getDouble(), 0.0);

        Node expr = root.getLastChild();
        assertEquals(Token.EXPR_RESULT, expr.getType());
        Node getProp = expr.getFirstChild();
        assertEquals(Token.GETPROP, getProp.getType());
        assertEquals("x", getProp.getLastChild().getString());
        assertEquals("x", getProp.getFirstChild().getString());
    }

    @Test
    public void testProcess_objectLiteralAssignedToVariable() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.exprResult(
                        createAssignment("a", createObjectLit(
                                createPropDef("x", IR.number(1))
                        ))
                )
        );
        pass.process(new Node(Token.EXTERN), root);

        Node expr = root.getFirstChild();
        assertEquals(Token.EXPR_RESULT, expr.getType());
        Node assignment = expr.getFirstChild();
        assertEquals(Token.ASSIGN, assignment.getType());
        assertEquals("x", assignment.getFirstChild().getString());
        assertEquals(1.0, assignment.getSecondChild().getDouble(), 0.0);
        assertEquals("x", assignment.getFirstChild().getString());
    }

    @Test
    public void testProcess_objectLiteralUsedInCall() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("a", createObjectLit(
                        createPropDef("x", IR.number(1))
                )),
                IR.exprResult(IR.call(IR.name("test"), IR.name("a")))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_x = root.getFirstChild();
        assertEquals(Token.VAR, var_x.getType());
        assertEquals("x", var_x.getFirstChild().getString());
        assertEquals(1.0, var_x.getFirstChild().getSecondChild().getDouble(), 0.0);

        Node expr = root.getLastChild();
        assertEquals(Token.EXPR_RESULT, expr.getType());
        Node call = expr.getFirstChild();
        assertEquals(Token.CALL, call.getType());
        assertEquals("test", call.getFirstChild().getString());
        assertEquals("x", call.getLastChild().getString());
    }

    @Test
    public void testProcess_multipleProperties() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("obj", createObjectLit(
                        createPropDef("p1", IR.number(10)),
                        createPropDef("p2", IR.string("hello")),
                        createPropDef("p3", IR.trueNode())
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_p1 = root.getFirstChild();
        assertEquals(Token.VAR, var_p1.getType());
        assertEquals("p1", var_p1.getFirstChild().getString());
        assertEquals(10.0, var_p1.getFirstChild().getSecondChild().getDouble(), 0.0);

        Node var_p2 = var_p1.getNext();
        assertEquals(Token.VAR, var_p2.getType());
        assertEquals("p2", var_p2.getFirstChild().getString());
        assertEquals("hello", var_p2.getFirstChild().getSecondChild().getString());

        Node var_p3 = var_p2.getNext();
        assertEquals(Token.VAR, var_p3.getType());
        assertEquals("p3", var_p3.getFirstChild().getString());
        assertTrue(var_p3.getFirstChild().getSecondChild().isTrue());
    }

    @Test
    public void testProcess_objectLiteralWithMissingProperties() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("obj", createObjectLit(
                        createPropDef("x", IR.number(1))
                )),
                IR.exprResult(IR.getprop(IR.name("obj"), IR.string("y")))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_obj = root.getFirstChild();
        assertEquals(Token.VAR, var_obj.getType());
        assertEquals("obj", var_obj.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_obj.getFirstChild().getSecondChild().getType());

        Node expr = root.getLastChild();
        assertEquals(Token.EXPR_RESULT, expr.getType());
        assertEquals(Token.GETPROP, expr.getFirstChild().getType());
        assertEquals("y", expr.getFirstChild().getLastChild().getString());
        assertEquals("obj", expr.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_objectLiteralWithSelfReferentialAssignment() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("x", createObjectLit(
                        createPropDef("a", IR.number(1)),
                        createPropDef("b", IR.getprop(IR.name("x"), IR.string("a"))) // Self-reference
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_x = root.getFirstChild();
        assertEquals(Token.VAR, var_x.getType());
        assertEquals("x", var_x.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_x.getFirstChild().getSecondChild().getType());
    }

    @Test
    public void testProcess_objectLiteralWithGetterDef() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("obj", createObjectLit(
                        IR.getterDef(IR.stringKey("a"), IR.number(1))
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_obj = root.getFirstChild();
        assertEquals(Token.VAR, var_obj.getType());
        assertEquals("obj", var_obj.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_obj.getFirstChild().getSecondChild().getType());
        assertTrue(var_obj.getFirstChild().getSecondChild().hasChildren());
        assertEquals(Token.GETTER_DEF, var_obj.getFirstChild().getSecondChild().getFirstChild().getType());
    }

    @Test
    public void testProcess_objectLiteralWithSetterDef() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("obj", createObjectLit(
                        IR.setterDef(IR.stringKey("a"), IR.name("v"), IR.number(1))
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_obj = root.getFirstChild();
        assertEquals(Token.VAR, var_obj.getType());
        assertEquals("obj", var_obj.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_obj.getFirstChild().getSecondChild().getType());
        assertTrue(var_obj.getFirstChild().getSecondChild().hasChildren());
        assertEquals(Token.SETTER_DEF, var_obj.getFirstChild().getSecondChild().getFirstChild().getType());
    }

    @Test
    public void testProcess_objectLiteralAssignedAndThenModified() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("a", createObjectLit(
                        createPropDef("x", IR.number(1))
                )),
                IR.exprResult(IR.assign(IR.getprop(IR.name("a"), IR.string("x")), IR.number(2)))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_a = root.getFirstChild();
        assertEquals(Token.VAR, var_a.getType());
        assertEquals("a", var_a.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_a.getFirstChild().getSecondChild().getType());

        Node expr = root.getLastChild();
        assertEquals(Token.EXPR_RESULT, expr.getType());
        Node assign = expr.getFirstChild();
        assertEquals(Token.ASSIGN, assign.getType());
        assertEquals("x", assign.getFirstChild().getLastChild().getString());
        assertEquals("a", assign.getFirstChild().getFirstChild().getString());
    }

    @Test
    public void testProcess_objectLiteralUsedAsThisInCall() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("obj", createObjectLit(
                        createPropDef("method", IR.function(null, IR.empty(), IR.block(IR.returnNode(IR.thisNode()))))
                )),
                IR.exprResult(IR.call(IR.getprop(IR.name("obj"), IR.string("method"))))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_obj = root.getFirstChild();
        assertEquals(Token.VAR, var_obj.getType());
        assertEquals("obj", var_obj.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_obj.getFirstChild().getSecondChild().getType());
    }

    @Test
    public void testProcess_objectLiteralWithDelProp() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("a", createObjectLit(
                        createPropDef("x", IR.number(1))
                )),
                IR.exprResult(IR.delprop(IR.name("a"), IR.string("x")))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_a = root.getFirstChild();
        assertEquals(Token.VAR, var_a.getType());
        assertEquals("a", var_a.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_a.getFirstChild().getSecondChild().getType());
    }

    @Test
    public void testProcess_globalVariableNotInlineable() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("globalObj", createObjectLit(
                        createPropDef("x", IR.number(1))
                ))
        );
        Node externs = IR.script();
        pass.process(externs, root);

        Node var_globalObj = root.getFirstChild();
        assertEquals(Token.VAR, var_globalObj.getType());
        assertEquals("globalObj", var_globalObj.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_globalObj.getFirstChild().getSecondChild().getType());
    }

    @Test
    public void testProcess_exportedVariableNotInlineable() throws Exception {
        AbstractCompiler compiler = createCompiler();
        CodingConvention convention = new DefaultCodingConvention() {
            @Override
            public boolean isExported(String name) {
                return "exportedObj".equals(name);
            }
        };
        AbstractCompiler compilerWithConvention = new AbstractCompiler() {
            @Override
            public void process(Node externs, Node root) {}
            @Override
            public void process(Node externs, Node root, Set<Node> markedForCompilation) {}
            @Override
            public Node parse(com.google.javascript.jscomp.CompilerOptions.LanguageMode mode, String code) throws IOException { return null; }
            @Override
            public Node parseSyntheticCode(String code) { return null; }
            @Override
            public Node getRoot() { return null; }
            @Override
            public Node getAstRoot() { return null; }
            @Override
            public void reassessOwnership(Node node) {}
            @Override
            public boolean removeClosureAsserts() { return false; }
            @Override
            public void addChange(NodeChange<String> change) {}
            @Override
            public List<NodeChange<String>> getChanges() { return null; }
            @Override
            public void applyNodeChanges(List<NodeChange<String>> changes) {}
            @Override
            public void normalize(Node root) {}
            @Override
            public void setNormalized() {}
            @Override
            public boolean hasErrors() { return false; }
            @Override
            public void stop() {}
            @Override
            public int getErrorCount() { return 0; }
            @Override
            public int getWarningCount() { return 0; }
            @Override
            public JSError[] getErrors() { return new JSError[0]; }
            @Override
            public JSError[] getWarnings() { return new JSError[0]; }
            @Override
            public void throwError(JSError error) { throw new RuntimeException(error.format(null, null)); }
            @Override
            public CodingConvention getCodingConvention() { return convention; }
            @Override
            public void reportChangeToEnclosingSideEffects(Node n) {}
            @Override
            public void reportCodeChange() {}
            @Override
            public void updateGlobalVarReferences(String varName, Var var) {}
            @Override
            public boolean isNormalized() { return false; }
            @Override
            public boolean hasRegExpPrototype() { return false; }
            @Override
            public Supplier<String> getUniqueNameIdSupplier() { return () -> "unique"; }
            @Override
            public boolean isIdeMode() { return false; }
            @Override
            public void setIdeMode(boolean ideMode) {}
            @Override
            public void setErrorManager(ErrorManager errorManager) {}
            @Override
            public String getSourceLine(Node n, int lineOffset) { return null; }
            @Override
            public void setSourceMapPath(String path) {}
            @Override
            public String getSourceMapPath() { return null; }
             @Override
            public void ensureLibraryInjected(String libraryName) {}
        };

        InlineObjectLiterals pass = new InlineObjectLiterals(compilerWithConvention, compilerWithConvention.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("exportedObj", createObjectLit(
                        createPropDef("x", IR.number(1))
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_exportedObj = root.getFirstChild();
        assertEquals(Token.VAR, var_exportedObj.getType());
        assertEquals("exportedObj", var_exportedObj.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_exportedObj.getFirstChild().getSecondChild().getType());
    }

    @Test
    public void testProcess_renamePropertyFunctionNameNotInlineable() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var(RenameProperties.RENAME_PROPERTY_FUNCTION_NAME, createObjectLit(
                        createPropDef("x", IR.number(1))
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_renameProp = root.getFirstChild();
        assertEquals(Token.VAR, var_renameProp.getType());
        assertEquals(RenameProperties.RENAME_PROPERTY_FUNCTION_NAME, var_renameProp.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_renameProp.getFirstChild().getSecondChild().getType());
    }

    @Test
    public void testProcess_staleVarDoesNotGetInlined() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());

        Node root = IR.script(
                IR.var("obj", createObjectLit(
                        createPropDef("x", IR.number(1))
                )),
                IR.exprResult(IR.delprop(IR.name("obj"), IR.string("x")))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_obj = root.getFirstChild();
        assertEquals(Token.VAR, var_obj.getType());
        assertEquals("obj", var_obj.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_obj.getFirstChild().getSecondChild().getType());
    }

    @Test
    public void testProcess_complexObjectLiteral() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("complexObj", createObjectLit(
                        createPropDef("a", IR.number(1)),
                        createPropDef("b", IR.string("two")),
                        createPropDef("c", createObjectLit(createPropDef("d", IR.booleanNode(true))))
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_a = root.getFirstChild();
        assertEquals(Token.VAR, var_a.getType());
        assertEquals("a", var_a.getFirstChild().getString());
        assertEquals(1.0, var_a.getFirstChild().getSecondChild().getDouble(), 0.0);

        Node var_b = var_a.getNext();
        assertEquals(Token.VAR, var_b.getType());
        assertEquals("b", var_b.getFirstChild().getString());
        assertEquals("two", var_b.getFirstChild().getSecondChild().getString());

        Node var_c = var_b.getNext();
        assertEquals(Token.VAR, var_c.getType());
        assertEquals("c", var_c.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_c.getFirstChild().getSecondChild().getType());
        assertEquals(Token.PROPDEF, var_c.getFirstChild().getSecondChild().getFirstChild().getType());
        assertEquals("d", var_c.getFirstChild().getSecondChild().getFirstChild().getString());
        assertTrue(var_c.getFirstChild().getSecondChild().getFirstChild().getSecondChild().isTrue());
    }

    @Test
    public void testProcess_assignmentWithCommaOperator() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("a", createObjectLit(
                        createPropDef("x", IR.number(1))
                )),
                IR.exprResult(
                        IR.comma(
                                IR.assign(IR.name("a"), createObjectLit(createPropDef("y", IR.number(2)))),
                                IR.string("done")
                        )
                )
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_a = root.getFirstChild();
        assertEquals(Token.VAR, var_a.getType());
        assertEquals("a", var_a.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_a.getFirstChild().getSecondChild().getType());

        Node expr = root.getLastChild();
        assertEquals(Token.EXPR_RESULT, expr.getType());
        Node comma = expr.getFirstChild();
        assertEquals(Token.COMMA, comma.getType());
        Node assign = comma.getFirstChild();
        assertEquals(Token.ASSIGN, assign.getType());
        assertEquals("a", assign.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, assign.getSecondChild().getType());
        assertEquals("y", assign.getSecondChild().getFirstChild().getString());
        assertEquals(2.0, assign.getSecondChild().getFirstChild().getSecondChild().getDouble(), 0.0);
        assertEquals("done", comma.getLastChild().getString());
    }

    @Test
    public void testProcess_inlineObjectLiteralWithFunctionProperty() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("obj", createObjectLit(
                        createPropDef("fn", IR.function(null, IR.empty(), IR.block(IR.returnNode(IR.string("hello")))))
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_obj = root.getFirstChild();
        assertEquals(Token.VAR, var_obj.getType());
        assertEquals("obj", var_obj.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_obj.getFirstChild().getSecondChild().getType());
        assertEquals(Token.PROPDEF, var_obj.getFirstChild().getSecondChild().getFirstChild().getType());
        assertEquals("fn", var_obj.getFirstChild().getSecondChild().getFirstChild().getString());
        assertEquals(Token.FUNCTION, var_obj.getFirstChild().getSecondChild().getFirstChild().getSecondChild().getType());
    }

    @Test
    public void testProcess_inlineObjectLiteralWithNestedObject() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("outer", createObjectLit(
                        createPropDef("inner", createObjectLit(
                                createPropDef("x", IR.number(1))
                        ))
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_outer = root.getFirstChild();
        assertEquals(Token.VAR, var_outer.getType());
        assertEquals("outer", var_outer.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_outer.getFirstChild().getSecondChild().getType());
        assertEquals(Token.PROPDEF, var_outer.getFirstChild().getSecondChild().getFirstChild().getType());
        assertEquals("inner", var_outer.getFirstChild().getSecondChild().getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_outer.getFirstChild().getSecondChild().getFirstChild().getSecondChild().getType());
    }

    @Test
    public void testProcess_mixedPropertyTypes() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("mixedObj", createObjectLit(
                        createPropDef("num", IR.number(100)),
                        createPropDef("str", IR.string("text")),
                        createPropDef("bool", IR.falseNode()),
                        createPropDef("undef", IR.voidNode(IR.number(0)))
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_num = root.getFirstChild();
        assertEquals(Token.VAR, var_num.getType());
        assertEquals("num", var_num.getFirstChild().getString());
        assertEquals(100.0, var_num.getFirstChild().getSecondChild().getDouble(), 0.0);

        Node var_str = var_num.getNext();
        assertEquals(Token.VAR, var_str.getType());
        assertEquals("str", var_str.getFirstChild().getString());
        assertEquals("text", var_str.getFirstChild().getSecondChild().getString());

        Node var_bool = var_str.getNext();
        assertEquals(Token.VAR, var_bool.getType());
        assertEquals("bool", var_bool.getFirstChild().getString());
        assertFalse(var_bool.getFirstChild().getSecondChild().isTrue());

        Node var_undef = var_bool.getNext();
        assertEquals(Token.VAR, var_undef.getType());
        assertEquals("undef", var_undef.getFirstChild().getString());
        assertEquals(Token.VOID, var_undef.getFirstChild().getSecondChild().getType());
    }

    @Test
    public void testProcess_objectLiteralWithUndefinedProperty() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("obj", createObjectLit(
                        createPropDef("a", IR.number(1)),
                        createPropDef("b", IR.undefinedNode())
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_a = root.getFirstChild();
        assertEquals(Token.VAR, var_a.getType());
        assertEquals("a", var_a.getFirstChild().getString());
        assertEquals(1.0, var_a.getFirstChild().getSecondChild().getDouble(), 0.0);

        Node var_b = var_a.getNext();
        assertEquals(Token.VAR, var_b.getType());
        assertEquals("b", var_b.getFirstChild().getString());
        assertEquals(Token.VOID, var_b.getFirstChild().getSecondChild().getType());
    }

    @Test
    public void testProcess_objectLiteralWithNullProperty() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("obj", createObjectLit(
                        createPropDef("a", IR.nullNode())
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_a = root.getFirstChild();
        assertEquals(Token.VAR, var_a.getType());
        assertEquals("a", var_a.getFirstChild().getString());
        assertEquals(Token.NULL, var_a.getFirstChild().getSecondChild().getType());
    }

    @Test
    public void testProcess_objectLiteralWithEmptyObjectLiteralProperty() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("obj", createObjectLit(
                        createPropDef("nested", IR.objectlit())
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_obj = root.getFirstChild();
        assertEquals(Token.VAR, var_obj.getType());
        assertEquals("obj", var_obj.getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_obj.getFirstChild().getSecondChild().getType());
        assertEquals(Token.PROPDEF, var_obj.getFirstChild().getSecondChild().getFirstChild().getType());
        assertEquals("nested", var_obj.getFirstChild().getSecondChild().getFirstChild().getString());
        assertEquals(Token.OBJECTLIT, var_obj.getFirstChild().getSecondChild().getFirstChild().getSecondChild().getType());
    }

    @Test
    public void testProcess_objectLiteralInStatementExpression() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.exprResult(createObjectLit(
                        createPropDef("x", IR.number(1))
                ))
        );
        pass.process(new Node(Token.EXTERN), root);

        Node expr = root.getFirstChild();
        assertEquals(Token.EXPR_RESULT, expr.getType());
        assertEquals(Token.VAR, expr.getFirstChild().getType());
        assertEquals("x", expr.getFirstChild().getFirstChild().getString());
        assertEquals(1.0, expr.getFirstChild().getFirstChild().getSecondChild().getDouble(), 0.0);
    }

    @Test
    public void testProcess_objectLiteralAssignedToVariableThenRead() throws Exception {
        AbstractCompiler compiler = createCompiler();
        InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
        Node root = IR.script(
                IR.var("a", createObjectLit(
                        createPropDef("x", IR.number(1))
                )),
                IR.exprResult(IR.add(IR.name("a"), IR.number(2))) // Read 'a'
        );
        pass.process(new Node(Token.EXTERN), root);

        Node var_x = root.getFirstChild();
        assertEquals(Token.VAR, var_x.getType());
        assertEquals("x", var_x.getFirstChild().getString());
        assertEquals(1.0, var_x.getFirstChild().getSecondChild().getDouble(), 0.0);

        Node expr = root.getLastChild();
        assertEquals(Token.EXPR_RESULT, expr.getType());
        Node add = expr.getFirstChild();
        assertEquals(Token.ADD, add.getType());
        assertEquals("x", add.getFirstChild().getString());
        assertEquals(2.0, add.getLastChild().getDouble(), 0.0);
    }
}
```