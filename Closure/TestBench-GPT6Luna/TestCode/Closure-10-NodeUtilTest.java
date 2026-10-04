package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.InputId;
import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import com.google.javascript.rhino.jstype.FunctionType;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.StaticSourceFile;
import com.google.javascript.rhino.jstype.TernaryValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import javax.annotation.Nullable;

public class NodeUtilTest {
    @Test
    public void testWhitespaceBoundariesAndSpecialCharacters() throws Exception {
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(' '));
        assertEquals(TernaryValue.TRUE, NodeUtil.isStrWhiteSpaceChar(0xFEFF));
        assertEquals(TernaryValue.UNKNOWN, NodeUtil.isStrWhiteSpaceChar('\u000B'));
        assertEquals(TernaryValue.FALSE, NodeUtil.isStrWhiteSpaceChar(0x7f));
    }

    @Test
    public void testNearestFunctionNameForFunctionNodeAndNonFunction() throws Exception {
        assertNull(NodeUtil.getNearestFunctionName(IR.name("notFn")));
        Node fn = IR.function(IR.name("named"), IR.paramList(), IR.block());
        Node script = IR.script(fn);
        assertEquals("named", NodeUtil.getNearestFunctionName(fn));
        assertSame(fn, script.getFirstChild());
    }

    @Test
    public void testNearestFunctionNameForNameAssignedFunction() throws Exception {
        Node fn = IR.function(IR.name(""), IR.paramList(), IR.block());
        Node name = IR.name("assigned");
        name.addChildToBack(fn);
        IR.var(name);
        assertEquals("assigned", NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testNearestFunctionNameForObjectKey() throws Exception {
        Node fn = IR.function(IR.name(""), IR.paramList(), IR.block());
        Node key = IR.stringKey("entry");
        key.addChildToBack(fn);
        IR.objectlit(key);
        assertEquals("entry", NodeUtil.getNearestFunctionName(fn));
    }

    @Test
    public void testPredicateApplyMatchesExpectedNodeType() throws Exception {
        NodeUtil.MatchNodeType predicate = new NodeUtil.MatchNodeType(Token.NUMBER);
        assertTrue(predicate.apply(IR.number(0)));
        assertFalse(predicate.apply(IR.name("x")));
    }

    @Test
    public void testLValueForVariableDeclaration() throws Exception {
        Node name = IR.name("value");
        IR.var(name);
        assertTrue(NodeUtil.isLValue(name));
    }

    @Test
    public void testLValueForAssignmentAndUnattachedName() throws Exception {
        Node lhs = IR.name("value");
        IR.assign(lhs, IR.number(1));
        assertTrue(NodeUtil.isLValue(lhs));
        assertFalse(NodeUtil.isLValue(IR.name("value")));
    }

    @Test
    public void testQualifiedNameNodeAtRootAndProperty() throws Exception {
        CodingConvention convention = new ClosureCodingConvention();
        Node root = NodeUtil.newQualifiedNameNode(convention, "item");
        Node qualified = NodeUtil.newQualifiedNameNode(convention, "item.part");
        assertEquals("item", root.getQualifiedName());
        assertEquals("item.part", qualified.getQualifiedName());
    }

    @Test
    public void testQualifiedNameValidationEdges() throws Exception {
        assertTrue(NodeUtil.isValidQualifiedName("alpha"));
        assertTrue(NodeUtil.isValidQualifiedName("alpha.beta"));
        assertFalse(NodeUtil.isValidQualifiedName(".alpha"));
        assertFalse(NodeUtil.isValidQualifiedName("alpha."));
        assertFalse(NodeUtil.isValidQualifiedName("alpha..beta"));
    }

    @Test
    public void testQualifiedNameRejectsKeywordAndInvalidIdentifier() throws Exception {
        assertFalse(NodeUtil.isValidQualifiedName("class"));
        assertFalse(NodeUtil.isValidQualifiedName("9name"));
        assertFalse(NodeUtil.isValidQualifiedName("with-hyphen"));
    }

    @Test
    public void testFunctionParametersReturnsParameterList() throws Exception {
        Node param = IR.name("arg");
        Node fn = IR.function(IR.name("f"), IR.paramList(param), IR.block());
        assertSame(param, NodeUtil.getFunctionParameters(fn).getFirstChild());
        assertEquals(1, NodeUtil.getFunctionParameters(fn).getChildCount());
    }

    @Test
    public void testFunctionParametersEmptyList() throws Exception {
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        assertEquals(0, NodeUtil.getFunctionParameters(fn).getChildCount());
    }

    @Test
    public void testFunctionJsDocInfoDirectlyAbsent() throws Exception {
        Node fn = IR.function(IR.name("f"), IR.paramList(), IR.block());
        IR.script(fn);
        assertNull(NodeUtil.getFunctionJSDocInfo(fn));
    }

    @Test
    public void testSourceNameWithoutAnnotation() throws Exception {
        assertNull(NodeUtil.getSourceName(IR.name("x")));
    }

    @Test
    public void testSourceNameOnAncestor() throws Exception {
        Node script = IR.script(IR.name("x"));
        script.setSourceFileForTesting("source.js");
        assertEquals("source.js", NodeUtil.getSourceName(script.getFirstChild()));
    }

    @Test
    public void testSourceFileWithoutAnnotation() throws Exception {
        assertNull(NodeUtil.getSourceFile(IR.name("x")));
    }

    @Test
    public void testInputIdWithoutScriptAncestor() throws Exception {
        assertNull(NodeUtil.getInputId(IR.name("x")));
    }

    @Test
    public void testInputIdFromScriptAncestor() throws Exception {
        Node script = IR.script(IR.name("x"));
        InputId id = new InputId("input.js");
        script.setInputId(id);
        assertSame(id, NodeUtil.getInputId(script.getFirstChild()));
    }
}
