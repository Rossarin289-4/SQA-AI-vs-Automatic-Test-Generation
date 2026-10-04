package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.select.QueryParser;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.parser.TokenQueue;
import org.jsoup.select.Evaluator;
import org.jsoup.select.Selector;
import org.jsoup.select.Evaluator.Tag;
import org.jsoup.select.Evaluator.Id;
import org.jsoup.select.Evaluator.Class;
import org.jsoup.select.Evaluator.Attribute;
import org.jsoup.select.Evaluator.AttributeStarting;
import org.jsoup.select.Evaluator.AttributeWithValue;
import org.jsoup.select.Evaluator.AttributeWithValueNot;
import org.jsoup.select.Evaluator.AttributeWithValueStarting;
import org.jsoup.select.Evaluator.AttributeWithValueEnding;
import org.jsoup.select.Evaluator.AttributeWithValueContaining;
import org.jsoup.select.Evaluator.AttributeWithValueMatching;
import org.jsoup.select.Evaluator.AllElements;
import org.jsoup.select.Evaluator.IndexLessThan;
import org.jsoup.select.Evaluator.IndexGreaterThan;
import org.jsoup.select.Evaluator.IndexEquals;
import org.jsoup.select.Evaluator.IsFirstChild;
import org.jsoup.select.Evaluator.IsLastChild;
import org.jsoup.select.Evaluator.IsFirstOfType;
import org.jsoup.select.Evaluator.IsLastOfType;
import org.jsoup.select.Evaluator.IsOnlyChild;
import org.jsoup.select.Evaluator.IsOnlyOfType;
import org.jsoup.select.Evaluator.IsEmpty;
import org.jsoup.select.Evaluator.IsRoot;
import org.jsoup.select.Evaluator.IsNthChild;
import org.jsoup.select.Evaluator.IsNthLastChild;
import org.jsoup.select.Evaluator.IsNthOfType;
import org.jsoup.select.Evaluator.IsNthLastOfType;
import org.jsoup.select.Evaluator.ContainsText;
import org.jsoup.select.Evaluator.ContainsOwnText;
import org.jsoup.select.Evaluator.ContainsData;
import org.jsoup.select.Evaluator.Matches;

public class TokenQueueTest {
    @Test
    public void isEmptyCorrectly() throws Exception {
        TokenQueue tq = new TokenQueue(" ");
        assertFalse(tq.isEmpty());
        tq.advance();
        assertTrue(tq.isEmpty());
    }

    @Test
    public void peekReturnsZeroWhenEmpty() throws Exception {
        TokenQueue tq = new TokenQueue("");
        assertEquals(0, tq.peek());
    }

    @Test
    public void peekReturnsFirstChar() throws Exception {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals('a', tq.peek());
        // Directly accessing private fields like 'pos' is not allowed.
        // We infer that peek doesn't advance by checking if the next consume gets the same char.
        assertEquals('a', tq.consume()); 
    }

    @Test
    public void addFirstCharacter() throws Exception {
        TokenQueue tq = new TokenQueue("bc");
        tq.addFirst('a');
        assertEquals('a', tq.consume());
        assertEquals('b', tq.consume());
        assertEquals('c', tq.consume());
    }
    
    @Test
    public void addFirstString() throws Exception {
        TokenQueue tq = new TokenQueue("cde");
        tq.consume(); // consumes 'c'
        tq.addFirst("ab");
        assertEquals('a', tq.consume());
        assertEquals('b', tq.consume());
        assertEquals('d', tq.consume());
        assertEquals('e', tq.consume());
    }

    @Test
    public void matchesCaseInsensitive() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDE");
        assertTrue(tq.matches("abc"));
        assertTrue(tq.matches("ABC"));
        assertFalse(tq.matches("abd"));
    }

    @Test
    public void matchesCaseSensitive() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDE");
        assertTrue(tq.matchesCS("ABC"));
        assertFalse(tq.matchesCS("abc"));
    }

    @Test
    public void matchesAnyString() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDE");
        assertTrue(tq.matchesAny("aBc", "X", "ABC"));
        assertFalse(tq.matchesAny("aBd", "X"));
    }

    @Test
    public void matchesAnyChar() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDE");
        assertTrue(tq.matchesAny('a', 'B', 'X'));
        assertFalse(tq.matchesAny('X', 'Y')); // Test where none match
    }

    @Test
    public void matchesStartTag() throws Exception {
        TokenQueue tq = new TokenQueue("<div");
        assertTrue(tq.matchesStartTag());
        
        TokenQueue tq2 = new TokenQueue(" <div"); // Space before <
        assertFalse(tq2.matchesStartTag());

        TokenQueue tq3 = new TokenQueue("<1div"); // Digit after <
        assertFalse(tq3.matchesStartTag());
        
        TokenQueue tq4 = new TokenQueue("<"); // Too short
        assertFalse(tq4.matchesStartTag());
    }

    @Test
    public void matchChompFound() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDE");
        assertTrue(tq.matchChomp("ABC"));
        assertEquals("DE", tq.remainder());
    }

    @Test
    public void matchChompNotFound() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDE");
        assertFalse(tq.matchChomp("abd"));
        assertEquals("ABCDE", tq.remainder());
    }

    @Test
    public void matchesWhitespace() throws Exception {
        TokenQueue tq = new TokenQueue("  abc");
        assertTrue(tq.matchesWhitespace());
        tq.advance();
        assertTrue(tq.matchesWhitespace());
        tq.advance();
        assertFalse(tq.matchesWhitespace());
    }

    @Test
    public void matchesWord() throws Exception {
        TokenQueue tq = new TokenQueue("abc 123");
        assertTrue(tq.matchesWord());
        tq.advance();
        assertTrue(tq.matchesWord());
        tq.advance();
        assertTrue(tq.matchesWord());
        tq.advance();
        assertFalse(tq.matchesWord());
    }


    @Test
    public void consumeChar() throws Exception {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals('a', tq.consume());
        assertEquals('b', tq.consume());
        assertEquals('c', tq.consume());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void consumeCharEmpty() throws Exception {
        TokenQueue tq = new TokenQueue("");
        tq.consume();
    }

    @Test
    public void consumeString() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDE");
        tq.consume("ABC");
        assertEquals("DE", tq.remainder());
    }

    @Test(expected = IllegalStateException.class)
    public void consumeStringMismatch() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDE");
        tq.consume("abd");
    }

    @Test(expected = IllegalStateException.class)
    public void consumeStringTooShort() throws Exception {
        TokenQueue tq = new TokenQueue("AB");
        tq.consume("ABC");
    }

    @Test
    public void consumeToFound() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDEFG");
        assertEquals("ABC", tq.consumeTo("DEF"));
        assertEquals("DEFG", tq.remainder()); // Ensure the rest is still there
    }

    @Test
    public void consumeToNotFound() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDEFG");
        assertEquals("ABCDEFG", tq.consumeTo("XYZ"));
        assertEquals("ABCDEFG", tq.remainder()); // Should not advance if not found
    }
    
    @Test
    public void consumeToIgnoreCaseFound() throws Exception {
        TokenQueue tq = new TokenQueue("AbCdEfG");
        assertEquals("AbC", tq.consumeToIgnoreCase("def"));
        assertEquals("dEfG", tq.remainder());
    }

    @Test
    public void consumeToIgnoreCaseNotFound() throws Exception {
        TokenQueue tq = new TokenQueue("AbCdEfG");
        assertEquals("AbCdEfG", tq.consumeToIgnoreCase("XYZ"));
        assertEquals("AbCdEfG", tq.remainder());
    }

    @Test
    public void consumeToAny() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDEFG");
        assertEquals("ABC", tq.consumeToAny("DEF", "XYZ"));
        assertEquals("DEFG", tq.remainder());
    }

    @Test
    public void consumeToAnyNotFound() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDEFG");
        assertEquals("ABCDEFG", tq.consumeToAny("XYZ", "123"));
        assertEquals("ABCDEFG", tq.remainder());
    }
    
    @Test
    public void chompToFound() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDEFG");
        assertEquals("ABC", tq.chompTo("DEF"));
        assertEquals("G", tq.remainder()); // Should consume "DEF" as well
    }

    @Test
    public void chompToNotFound() throws Exception {
        TokenQueue tq = new TokenQueue("ABCDEFG");
        assertEquals("ABCDEFG", tq.chompTo("XYZ"));
        assertEquals("", tq.remainder()); // Consumed whole string
    }

    @Test
    public void chompToIgnoreCaseFound() throws Exception {
        TokenQueue tq = new TokenQueue("AbCdEfG");
        assertEquals("AbC", tq.chompToIgnoreCase("def"));
        assertEquals("G", tq.remainder());
    }

    @Test
    public void chompToIgnoreCaseNotFound() throws Exception {
        TokenQueue tq = new TokenQueue("AbCdEfG");
        assertEquals("AbCdEfG", tq.chompToIgnoreCase("XYZ"));
        assertEquals("", tq.remainder());
    }
    
    @Test
    public void chompBalancedSimple() throws Exception {
        TokenQueue tq = new TokenQueue("(abc)");
        assertEquals("abc", tq.chompBalanced('(', ')'));
        assertEquals("", tq.remainder());
    }

    @Test
    public void chompBalancedNested() throws Exception {
        TokenQueue tq = new TokenQueue("((abc))");
        assertEquals("(abc)", tq.chompBalanced('(', ')'));
        assertEquals("", tq.remainder());
    }
    
    @Test
    public void chompBalancedWithEscapes() throws Exception {
        TokenQueue tq = new TokenQueue("(\\(abc\\))");
        assertEquals("\\(abc\\)", tq.chompBalanced('(', ')'));
        assertEquals("", tq.remainder());
    }

    @Test
    public void chompBalancedInQuotes() throws Exception {
        TokenQueue tq = new TokenQueue("(\"a(b)c\")");
        assertEquals("\"a(b)c\"", tq.chompBalanced('(', ')'));
        assertEquals("", tq.remainder());
    }

    @Test
    public void chompBalancedUnbalanced() throws Exception {
        TokenQueue tq = new TokenQueue("((abc)");
        try {
            tq.chompBalanced('(', ')');
            fail("Expected exception for unbalanced input");
        } catch (IllegalStateException e) {
            assertTrue(e.getMessage().contains("Did not find balanced maker"));
        }
    }

    @Test
    public void unescapeSimple() throws Exception {
        assertEquals("abc", TokenQueue.unescape("abc"));
    }

    @Test
    public void unescapeSingleEscape() throws Exception {
        assertEquals("abc", TokenQueue.unescape("abc"));
    }

    @Test
    public void unescapeDoubleEscape() throws Exception {
        assertEquals("a\\bc", TokenQueue.unescape("a\\\\bc"));
    }

    @Test
    public void unescapeMixed() throws Exception {
        assertEquals("a\\b\\c", TokenQueue.unescape("a\\\\b\\\\c"));
    }

    @Test
    public void consumeWhitespace() throws Exception {
        TokenQueue tq = new TokenQueue("  abc");
        assertTrue(tq.consumeWhitespace());
        assertEquals("abc", tq.remainder());
        assertFalse(tq.consumeWhitespace()); // no more whitespace
        assertEquals("abc", tq.remainder());
    }
    
    @Test
    public void consumeWhitespaceOnly() throws Exception {
        TokenQueue tq = new TokenQueue("   ");
        assertTrue(tq.consumeWhitespace());
        assertTrue(tq.isEmpty());
    }

    @Test
    public void consumeWord() throws Exception {
        TokenQueue tq = new TokenQueue("word123 abc");
        assertEquals("word123", tq.consumeWord());
        assertEquals(" abc", tq.remainder());
    }

    @Test
    public void consumeWordEmpty() throws Exception {
        TokenQueue tq = new TokenQueue(" abc");
        assertEquals("", tq.consumeWord());
        assertEquals(" abc", tq.remainder());
    }

    @Test
    public void consumeTagName() throws Exception {
        TokenQueue tq = new TokenQueue("div-1:test");
        assertEquals("div-1:test", tq.consumeTagName());
        assertEquals("", tq.remainder());
    }

    @Test
    public void consumeTagNameWithSpaces() throws Exception {
        TokenQueue tq = new TokenQueue("div tag");
        assertEquals("div", tq.consumeTagName());
        assertEquals(" tag", tq.remainder());
    }

    @Test
    public void consumeElementSelector() throws Exception {
        TokenQueue tq = new TokenQueue("div*|test");
        assertEquals("div*|test", tq.consumeElementSelector());
        assertEquals("", tq.remainder());
        
        TokenQueue tq2 = new TokenQueue("|test");
        assertEquals("|test", tq2.consumeElementSelector());
        assertEquals("", tq2.remainder());
    }
    
    @Test
    public void consumeElementSelectorWithSpace() throws Exception {
        TokenQueue tq = new TokenQueue("div tag");
        assertEquals("div", tq.consumeElementSelector());
        assertEquals(" tag", tq.remainder());
    }

    @Test
    public void consumeCssIdentifier() throws Exception {
        TokenQueue tq = new TokenQueue("my_id-123");
        assertEquals("my_id-123", tq.consumeCssIdentifier());
        assertEquals("", tq.remainder());
    }
    
    @Test
    public void consumeCssIdentifierWithSpace() throws Exception {
        TokenQueue tq = new TokenQueue("my_id-123 ");
        assertEquals("my_id-123", tq.consumeCssIdentifier());
        assertEquals(" ", tq.remainder());
    }

    @Test
    public void consumeAttributeKey() throws Exception {
        TokenQueue tq = new TokenQueue("data-value:");
        assertEquals("data-value:", tq.consumeAttributeKey());
        assertEquals("", tq.remainder());
    }
    
    @Test
    public void consumeAttributeKeyWithSpace() throws Exception {
        TokenQueue tq = new TokenQueue("data-value: ");
        assertEquals("data-value:", tq.consumeAttributeKey());
        assertEquals(" ", tq.remainder());
    }

    @Test
    public void remainder() throws Exception {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals("abc", tq.remainder());
        assertTrue(tq.isEmpty());
    }

    @Test
    public void remainderOnEmpty() throws Exception {
        TokenQueue tq = new TokenQueue("");
        assertEquals("", tq.remainder());
        assertTrue(tq.isEmpty());
    }

    @Test
    public void toStringOutput() throws Exception {
        TokenQueue tq = new TokenQueue("abc");
        assertEquals("abc", tq.toString());
        tq.advance();
        assertEquals("bc", tq.toString());
    }

    @Test
    public void toStringOnEmpty() throws Exception {
        TokenQueue tq = new TokenQueue("");
        assertEquals("", tq.toString());
    }

    // Tests for QueryParser, which uses TokenQueue extensively.
    


















    @Test
    public void parseAllElements() {
        Evaluator eval = QueryParser.parse("*");
        assertTrue(eval instanceof AllElements);
    }

    @Test
    public void parsePseudoFirstChild() {
        Evaluator eval = QueryParser.parse(":first-child");
        assertTrue(eval instanceof IsFirstChild);
    }

    @Test
    public void parsePseudoLastChild() {
        Evaluator eval = QueryParser.parse(":last-child");
        assertTrue(eval instanceof IsLastChild);
    }

    @Test
    public void parsePseudoFirstOfType() {
        Evaluator eval = QueryParser.parse(":first-of-type");
        assertTrue(eval instanceof IsFirstOfType);
    }
    
    @Test
    public void parsePseudoLastOfType() {
        Evaluator eval = QueryParser.parse(":last-of-type");
        assertTrue(eval instanceof IsLastOfType);
    }

    @Test
    public void parsePseudoOnlyChild() {
        Evaluator eval = QueryParser.parse(":only-child");
        assertTrue(eval instanceof IsOnlyChild);
    }

    @Test
    public void parsePseudoOnlyOfType() {
        Evaluator eval = QueryParser.parse(":only-of-type");
        assertTrue(eval instanceof IsOnlyOfType);
    }
    
    @Test
    public void parsePseudoEmpty() {
        Evaluator eval = QueryParser.parse(":empty");
        assertTrue(eval instanceof IsEmpty);
    }

    @Test
    public void parsePseudoRoot() {
        Evaluator eval = QueryParser.parse(":root");
        assertTrue(eval instanceof IsRoot);
    }
    


    













}



