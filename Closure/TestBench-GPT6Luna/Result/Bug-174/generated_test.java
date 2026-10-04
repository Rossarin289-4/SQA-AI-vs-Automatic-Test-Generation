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

public class JsAstTest {
    @Test
    public void testWhitespaceSpaceAndOrdinaryCharacter() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
        assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar('x'));
    }

    @Test
    public void testWhitespaceVerticalTabIsUnknown() throws Exception {
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B'));
    }

    @Test
    public void testWhitespaceUnicodeSeparator() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(0x00A0));
    }

    @Test
    public void testQualifiedNameSingleAndMultiPart() throws Exception {
        assertTrue(NodeUtil.isValidQualifiedName("alpha"));
        assertTrue(NodeUtil.isValidQualifiedName("alpha.beta"));
    }

    @Test
    public void testQualifiedNameRejectsEdgesAndKeyword() throws Exception {
        assertFalse(NodeUtil.isValidQualifiedName(".alpha"));
        assertFalse(NodeUtil.isValidQualifiedName("alpha."));
        assertFalse(NodeUtil.isValidQualifiedName("for"));
    }

    @Test
    public void testQualifiedNameRejectsEmptyPart() throws Exception {
        assertFalse(NodeUtil.isValidQualifiedName("alpha..beta"));
    }

    @Test
    public void testQualifiedNameBuildsPropertyChain() throws Exception {
        Node result = NodeUtil.newQualifiedNameNode(null, "alpha.beta.gamma");
        assertNull(result.getQualifiedName());
    }

    @Test
    public void testQualifiedNameBuildsThisProperty() throws Exception {
        Node result = NodeUtil.newQualifiedNameNode(null, "this.alpha");
        assertNull(result.getQualifiedName());
    }

    @Test
    public void testQualifiedNameDeclarationWithoutValue() throws Exception {
        Node declaration = NodeUtil.newQualifiedNameNodeDeclaration(
                null, "alpha.beta", null, null);
        assertTrue(declaration.isExprResult());
        assertNull(declaration.getFirstChild().getQualifiedName());
    }

    @Test
    public void testQualifiedNameDeclarationWithSimpleName() throws Exception {
        Node declaration = NodeUtil.newQualifiedNameNodeDeclaration(
                null, "alpha", IR.number(3), null);
        assertTrue(declaration.isVar());
        assertEquals("alpha", declaration.getFirstChild().getString());
        assertEquals(3.0, declaration.getFirstChild().getFirstChild().getDouble(), 0.0);
    }

    @Test
    public void testFunctionParametersReturnsParameterList() throws Exception {
        Node fn = IR.function(IR.name("f"), IR.paramList(IR.name("p")), IR.block());
        assertSame(fn.getFirstChild().getNext(), NodeUtil.getFunctionParameters(fn));
        assertEquals("p", NodeUtil.getFunctionParameters(fn).getFirstChild().getString());
    }

    @Test
    public void testSourceNameFindsNameOnNode() throws Exception {
        Node node = IR.name("x");
        node.setSourceFileForTesting("unit.js");
        assertEquals("unit.js", NodeUtil.getSourceName(node));
    }

    @Test
    public void testSourceNameFindsAncestorName() throws Exception {
        Node child = IR.name("x");
        Node parent = IR.script(child);
        parent.setSourceFileForTesting("unit.js");
        assertEquals("unit.js", NodeUtil.getSourceName(child));
    }

    @Test
    public void testInputIdForScriptRoot() throws Exception {
        Node script = IR.script();
        InputId id = new InputId("unit.js");
        script.setInputId(id);
        assertSame(id, NodeUtil.getInputId(script));
    }

    @Test
    public void testInputIdFindsScriptAncestor() throws Exception {
        Node script = IR.script(IR.name("x"));
        InputId id = new InputId("unit.js");
        script.setInputId(id);
        assertSame(id, NodeUtil.getInputId(script.getFirstChild()));
    }

    @Test
    public void testInputIdAbsentWithoutScriptAncestor() throws Exception {
        assertNull(NodeUtil.getInputId(IR.name("x")));
    }

    @Test
    public void testIsLValueAssignmentLeftSide() throws Exception {
        Node name = IR.name("x");
        IR.assign(name, IR.number(1));
        assertTrue(NodeUtil.isLValue(name));
    }

    @Test
    public void testIsLValueVariableDeclaration() throws Exception {
        Node name = IR.name("x");
        IR.var(name);
        assertTrue(NodeUtil.isLValue(name));
    }

    @Test
    public void testIsLValueDetachedName() throws Exception {
        assertFalse(NodeUtil.isLValue(IR.name("x")));
    }

    @Test
    public void testWhitespaceLineAndParagraphSeparators() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(0x2028));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(0x2029));
    }

    @Test
    public void testNearestFunctionNameForNamedDeclaration() throws Exception {
        Node fn = IR.function(IR.name("named"), IR.paramList(), IR.block());
        IR.script(fn);
        assertEquals("named", NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testNearestFunctionNameForVariableAssignedFunction() throws Exception {
        Node fn = IR.function(IR.name(""), IR.paramList(), IR.block());
        IR.var(IR.name("assigned"), fn);
        assertEquals("assigned", NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testNearestFunctionNameForAnonymousFunctionIsNull() throws Exception {
        Node fn = IR.function(IR.name(""), IR.paramList(), IR.block());
        IR.exprResult(fn);
        assertNull(NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testFunctionJSDocInfoOnFunctionIsReturned() throws Exception {
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        JSDocInfo info = new JSDocInfo();
        fn.setJSDocInfo(info);
        assertSame(info, NodeUtil.getFunctionJSDocInfo(fn));
    }

    @Test
    public void testFunctionJSDocInfoAbsentIsNull() throws Exception {
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        IR.script(fn);
        assertNull(NodeUtil.getFunctionJSDocInfo(fn));
    }

    @Test
    public void testMapMainToCloneMapsRoot() throws Exception {
        Node main = IR.script(IR.exprResult(IR.number(1)));
        Node clone = main.cloneTree();
        Map<Node, Node> mapping = NodeUtil.mapMainToClone(main, clone);
        assertSame(clone, mapping.get(main));
        assertEquals(1, mapping.size());
    }

    @Test
    public void testMapMainToCloneMapsNestedFunction() throws Exception {
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        Node main = IR.script(fn);
        Node clone = main.cloneTree();
        Map<Node, Node> mapping = NodeUtil.mapMainToClone(main, clone);
        assertSame(clone.getFirstChild(), mapping.get(fn));
        assertEquals(2, mapping.size());
    }

    @Test
    public void testJsAstSourceFileGetterAndInputId() throws Exception {
        SourceFile file = SourceFile.fromCode("unit.js", "var x;");
        JsAst ast = new JsAst(file);
        assertSame(file, ast.getSourceFile());
        assertEquals("unit.js", ast.getInputId().getIdName());
    }

    @Test
    public void testJsAstSetSameNamedSourceFile() throws Exception {
        SourceFile initial = SourceFile.fromCode("unit.js", "var x;");
        SourceFile replacement = SourceFile.fromCode("unit.js", "var y;");
        JsAst ast = new JsAst(initial);
        ast.setSourceFile(replacement);
        assertSame(replacement, ast.getSourceFile());
    }

    @Test
    public void testJsAstSetDifferentNamedSourceFileThrows() throws Exception {
        JsAst ast = new JsAst(SourceFile.fromCode("unit.js", "var x;"));
        try {
            ast.setSourceFile(SourceFile.fromCode("other.js", "var y;"));
            fail("expected IllegalStateException");
        } catch (IllegalStateException expected) {
        }
    }
}
