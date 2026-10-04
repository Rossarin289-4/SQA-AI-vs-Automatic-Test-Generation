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





