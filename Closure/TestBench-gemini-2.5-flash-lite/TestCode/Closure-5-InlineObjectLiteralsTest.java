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





