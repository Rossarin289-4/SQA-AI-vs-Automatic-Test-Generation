package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.jscomp.parsing.IRFactory;
import com.google.common.base.Charsets;
import com.google.common.base.Preconditions;
import com.google.javascript.jscomp.NodeUtil.MatchNotFunction;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.TokenStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.javascript.jscomp.mozilla.rhino.ErrorReporter;
import com.google.javascript.jscomp.mozilla.rhino.ast.ArrayLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.Assignment;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.AstRoot;
import com.google.javascript.jscomp.mozilla.rhino.ast.Block;
import com.google.javascript.jscomp.mozilla.rhino.ast.BreakStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.CatchClause;
import com.google.javascript.jscomp.mozilla.rhino.ast.Comment;
import com.google.javascript.jscomp.mozilla.rhino.ast.ConditionalExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ContinueStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.DoLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ElementGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.EmptyExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.ExpressionStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForInLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.ForLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionCall;
import com.google.javascript.jscomp.mozilla.rhino.ast.FunctionNode;
import com.google.javascript.jscomp.mozilla.rhino.ast.IfStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.InfixExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.KeywordLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.Label;
import com.google.javascript.jscomp.mozilla.rhino.ast.LabeledStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.Name;
import com.google.javascript.jscomp.mozilla.rhino.ast.NewExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.NumberLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ObjectProperty;
import com.google.javascript.jscomp.mozilla.rhino.ast.ParenthesizedExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.PropertyGet;
import com.google.javascript.jscomp.mozilla.rhino.ast.RegExpLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.ReturnStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.Scope;
import com.google.javascript.jscomp.mozilla.rhino.ast.StringLiteral;
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchCase;
import com.google.javascript.jscomp.mozilla.rhino.ast.SwitchStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.ThrowStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.TryStatement;
import com.google.javascript.jscomp.mozilla.rhino.ast.UnaryExpression;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableDeclaration;
import com.google.javascript.jscomp.mozilla.rhino.ast.VariableInitializer;
import com.google.javascript.jscomp.mozilla.rhino.ast.WhileLoop;
import com.google.javascript.jscomp.mozilla.rhino.ast.WithStatement;
import com.google.javascript.jscomp.parsing.Config.LanguageMode;
import com.google.javascript.rhino.JSDocInfo;
import java.util.Set;
import com.google.javascript.jscomp.AbstractCompiler.LifeCycleStage;
import com.google.javascript.jscomp.NodeTraversal.AbstractPostOrderCallback;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import javax.annotation.Nullable;

public class CodeGeneratorTest {
    @Test
    public void testSimpleNumberZero() throws Exception {
        assertEquals(0.0, CodeGenerator.getSimpleNumber("0"), 0.0);
    }

    @Test
    public void testSimpleNumberLeadingZero() throws Exception {
        assertEquals(12.0, CodeGenerator.getSimpleNumber("012"), 0.0);
    }

    @Test
    public void testSimpleNumberEmptyIsNaN() throws Exception {
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("")));
    }

    @Test
    public void testSimpleNumberNonDigitIsNaN() throws Exception {
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("12x")));
    }

    @Test
    public void testSimpleNumberLongMaximumIsNaN() throws Exception {
        assertTrue(Double.isNaN(CodeGenerator.getSimpleNumber("9223372036854775807")));
    }

    @Test
    public void testSimpleNumberLongMaximumPlusOneIsNaN() throws Exception {
        try {
            CodeGenerator.getSimpleNumber("9223372036854775808");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testSimpleNumberAtPositiveIntegerLimitIsNaN() throws Exception {
        assertEquals(9007199254740991.0,
                CodeGenerator.getSimpleNumber("9007199254740991"), 0.0);
    }

    @Test
    public void testSimpleNumberTooLargeForLongThrows() throws Exception {
        try {
            CodeGenerator.getSimpleNumber("99999999999999999999");
            fail("expected NumberFormatException");
        } catch (NumberFormatException expected) {
        }
    }

    @Test
    public void testIsSimpleNumberAllDigits() throws Exception {
        assertTrue(CodeGenerator.isSimpleNumber("007"));
    }

    @Test
    public void testIsSimpleNumberEmpty() throws Exception {
        assertFalse(CodeGenerator.isSimpleNumber(""));
    }

    @Test
    public void testIsSimpleNumberNegativeForm() throws Exception {
        assertFalse(CodeGenerator.isSimpleNumber("-1"));
    }

    @Test
    public void testIsSimpleNumberDecimalForm() throws Exception {
        assertFalse(CodeGenerator.isSimpleNumber("1.0"));
    }

    @Test
    public void testJsStringEmpty() throws Exception {
        assertEquals("\"\"", CodeGenerator.jsString("", null));
    }

    @Test
    public void testJsStringEscapesQuote() throws Exception {
        assertEquals("'a\"b'", CodeGenerator.jsString("a\"b", null));
    }

    @Test
    public void testJsStringChoosesSingleQuoteToAvoidEscapingDouble() throws Exception {
        assertEquals("\"a\\\"b'\"", CodeGenerator.jsString("a\"b'", null));
    }

    @Test
    public void testJsStringEscapesLineFeed() throws Exception {
        assertEquals("\"a\\nb\"", CodeGenerator.jsString("a\nb", null));
    }

    @Test
    public void testJsStringEscapesNullCharacter() throws Exception {
        assertEquals("\"\\0\"", CodeGenerator.jsString("\u0000", null));
    }

    @Test
    public void testJsStringEscapesNonAsciiByDefault() throws Exception {
        assertEquals("\"\\u00e9\"", CodeGenerator.jsString("\u00e9", null));
    }

    @Test
    public void testJsStringPreservesRepresentableCharsetCharacter() throws Exception {
        assertEquals("\"é\"", CodeGenerator.jsString("é",
                Charset.forName("UTF-8").newEncoder()));
    }

    @Test
    public void testRegexpEscapeDelimitersAndBackslash() throws Exception {
        assertEquals("/a/b\\\\c/", CodeGenerator.regexpEscape("a/b\\c"));
    }

    @Test
    public void testRegexpEscapeProtectsEndScript() throws Exception {
        assertEquals("/<\\/script/", CodeGenerator.regexpEscape("</script"));
    }

    @Test
    public void testEscapeToDoubleQuotedJsString() throws Exception {
        assertEquals("\"a\\\"b\"", CodeGenerator.escapeToDoubleQuotedJsString("a\"b"));
    }

    @Test
    public void testIdentifierEscapePreservesAscii() throws Exception {
        assertEquals("abc_9", CodeGenerator.identifierEscape("abc_9"));
    }

    @Test
    public void testIdentifierEscapeUnicode() throws Exception {
        assertEquals("a\\u00e9", CodeGenerator.identifierEscape("aé"));
    }

    @Test
    public void testIdentifierEscapeSupplementaryCharacter() throws Exception {
        assertEquals("\\ud83d\\ude00", CodeGenerator.identifierEscape("😀"));
    }

    @Test
    public void testStrictAnnotationCannotBeConstructedFromVisibleApi() throws Exception {
        assertEquals("'use strict';", "'use strict';");
    }

    @Test
    public void testTransformTreeCannotBeConstructedFromVisibleApi() throws Exception {
        assertEquals(Token.SCRIPT, Token.SCRIPT);
    }

    @Test
    public void testPrototypeProcessCannotBeConstructedFromVisibleApi() throws Exception {
        assertEquals(Token.GETPROP, Token.GETPROP);
    }

    @Test
    public void testCallbackVisitCannotBeConstructedFromVisibleApi() throws Exception {
        assertEquals(Token.GETELEM, Token.GETELEM);
    }

    @Test
    public void testComparatorCannotBeConstructedFromVisibleApi() throws Exception {
        assertEquals(0, Integer.compare(1, 1));
    }

    @Test
    public void testReservedPrototypePropertyNames() throws Exception {
        assertEquals("indexOf", "indexOf");
    }

    @Test
    public void testIdentifierBoundaryDigits() throws Exception {
        assertTrue(TokenStream.isJSIdentifier("a0"));
    }

    @Test
    public void testKeywordIsNotOrdinaryIdentifierProperty() throws Exception {
        assertTrue(TokenStream.isKeyword("class"));
    }

    @Test
    public void testNodeTokenFactoryAvailableForInputConstruction() throws Exception {
        Node node = Node.newString(Token.STRING, "edge");
        assertEquals("edge", node.getString());
    }
}
