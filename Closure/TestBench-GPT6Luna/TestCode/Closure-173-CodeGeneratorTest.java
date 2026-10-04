package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.javascript.jscomp.CompilerOptions.LanguageMode;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.Map;
import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableSet;
import com.google.javascript.jscomp.CodingConvention.Bind;
import com.google.javascript.rhino.IR;
import java.util.regex.Pattern;

public class CodeGeneratorTest {
    @Test
    public void testSimpleNumberZero() throws Exception {
        assertTrue(CodeGenerator.isSimpleNumber("0"));
        assertEquals(0.0, CodeGenerator.getSimpleNumber("0"), 0.0);
    }

    @Test
    public void testSimpleNumberPositiveDigits() throws Exception {
        assertTrue(CodeGenerator.isSimpleNumber("123"));
        assertEquals(123.0, CodeGenerator.getSimpleNumber("123"), 0.0);
    }

    @Test
    public void testSimpleNumberRejectsEmptyAndLeadingZero() throws Exception {
        assertFalse(CodeGenerator.isSimpleNumber(""));
        assertFalse(CodeGenerator.isSimpleNumber("01"));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("01")));
    }

    @Test
    public void testSimpleNumberRejectsNondigits() throws Exception {
        assertFalse(CodeGenerator.isSimpleNumber("-1"));
        assertFalse(CodeGenerator.isSimpleNumber("1.0"));
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("-1")));
    }

    @Test
    public void testSimpleNumberMaximumAcceptedBelowNodeLimit() throws Exception {
        assertEquals(9007199254740990.0,
                CodeGenerator.getSimpleNumber("9007199254740990"), 0.0);
    }

    @Test
    public void testSimpleNumberNodeLimitIsNotAccepted() throws Exception {
        assertEquals(9007199254740991.0,
                CodeGenerator.getSimpleNumber("9007199254740991"), 0.0);
    }

    @Test
    public void testSimpleNumberLongParseOverflow() throws Exception {
        assertTrue(Double.isNaN(
                CodeGenerator.getSimpleNumber("9223372036854775808")));
    }

    @Test
    public void testContainsUnicodeEscapeForNonLatinCharacter() throws Exception {
        assertTrue(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("é"));
    }

    @Test
    public void testContainsUnicodeEscapeDoesNotMistakeLiteralSlashU() throws Exception {
        assertTrue(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("\\u"));
    }

    @Test
    public void testContainsUnicodeEscapeForSupplementaryCharacter() throws Exception {
        assertTrue(PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("😀"));
    }

    @Test
    public void testLateBooleanOptimizationRewritesTrue() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax(true);
        Node script = IR.script(IR.exprResult(IR.trueNode()));
        Node original = script.getFirstChild().getFirstChild();

        assertSame(original, optimization.optimizeSubtree(original));
        assertEquals(Token.TRUE, original.getType());
    }

    @Test
    public void testEarlyBooleanOptimizationLeavesTrue() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax(false);
        Node script = IR.script(IR.exprResult(IR.trueNode()));
        Node original = script.getFirstChild().getFirstChild();

        assertSame(original, optimization.optimizeSubtree(original));
        assertEquals(Token.TRUE, original.getType());
    }

    @Test
    public void testLateBooleanOptimizationRewritesFalse() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax(true);
        Node script = IR.script(IR.exprResult(IR.falseNode()));
        Node original = script.getFirstChild().getFirstChild();

        assertSame(original, optimization.optimizeSubtree(original));
        assertEquals(Token.FALSE, original.getType());
    }

    @Test
    public void testReturnUndefinedBecomesBareReturn() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax(false);
        Node script = IR.script(IR.function(
                IR.name("f"), IR.paramList(),
                IR.block(IR.returnNode(IR.name("undefined")))));
        Node returnNode = script.getFirstChild().getLastChild()
                .getFirstChild().getFirstChild();

        Node result = optimization.optimizeSubtree(returnNode);

        assertEquals(Token.RETURN, result.getType());
        assertFalse(result.hasChildren());
    }

    @Test
    public void testReturnVoidPureExpressionBecomesBareReturn() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax(false);
        Node script = IR.script(IR.function(
                IR.name("f"), IR.paramList(),
                IR.block(IR.returnNode(IR.voidNode(IR.number(1))))));
        Node returnNode = script.getFirstChild().getLastChild()
                .getFirstChild().getFirstChild();

        Node result = optimization.optimizeSubtree(returnNode);

        assertEquals(Token.RETURN, result.getType());
        assertFalse(result.hasChildren());
    }

    @Test
    public void testReturnVoidCallIsPreserved() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax(false);
        Node script = IR.script(IR.function(
                IR.name("f"), IR.paramList(),
                IR.block(IR.returnNode(IR.voidNode(IR.call(IR.name("f")))))));
        Node returnNode = script.getFirstChild().getLastChild()
                .getFirstChild().getFirstChild();

        Node result = optimization.optimizeSubtree(returnNode);

        assertEquals(Token.RETURN, result.getType());
        assertEquals(Token.VOID, result.getFirstChild().getType());
    }

    @Test
    public void testNameUndefinedIsUnchangedWhenNotNormalized() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax(false);
        Node script = IR.script(IR.function(
                IR.name("f"), IR.paramList(),
                IR.block(IR.exprResult(IR.name("undefined")))));
        Node original = script.getFirstChild().getLastChild()
                .getFirstChild().getFirstChild();

        assertSame(original, optimization.optimizeSubtree(original));
        assertEquals(Token.NAME, original.getType());
    }

    @Test
    public void testObjectConstructorNotFoldedWhenNotNormalized() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax(false);
        Node script = IR.script(IR.function(
                IR.name("f"), IR.paramList(),
                IR.block(IR.exprResult(IR.call(IR.name("Object"))))));
        Node original = script.getFirstChild().getLastChild()
                .getFirstChild().getFirstChild();

        assertSame(original, optimization.optimizeSubtree(original));
        assertEquals(Token.CALL, original.getType());
    }

    @Test
    public void testArrayConstructorNotFoldedWhenNotNormalized() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax(false);
        Node script = IR.script(IR.function(
                IR.name("f"), IR.paramList(),
                IR.block(IR.exprResult(IR.call(
                        IR.name("Array"), IR.string("x"))))));
        Node original = script.getFirstChild().getLastChild()
                .getFirstChild().getFirstChild();

        assertSame(original, optimization.optimizeSubtree(original));
        assertEquals(Token.CALL, original.getType());
    }

    @Test
    public void testRegularExpressionConstructorNotFoldedWhenNotNormalized() throws Exception {
        PeepholeSubstituteAlternateSyntax optimization =
                new PeepholeSubstituteAlternateSyntax(false);
        Node script = IR.script(IR.function(
                IR.name("f"), IR.paramList(),
                IR.block(IR.exprResult(IR.call(
                        IR.name("RegExp"), IR.string("ab"))))));
        Node original = script.getFirstChild().getLastChild()
                .getFirstChild().getFirstChild();

        assertSame(original, optimization.optimizeSubtree(original));
        assertEquals(Token.CALL, original.getType());
    }
}
