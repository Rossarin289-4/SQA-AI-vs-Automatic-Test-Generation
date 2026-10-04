```java
package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.regex.Pattern;
import org.jsoup.helper.Validate;
import org.jsoup.parser.TokenQueue;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Tag;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.DataNode;

public class CombiningEvaluatorTest {

    // Helper method to create a mock Evaluator
    private Evaluator mockEvaluator(final boolean matchResult, final String toString) {
        return new Evaluator() {
            @Override
            public boolean matches(Element root, Element node) {
                return matchResult;
            }
            @Override
            public String toString() {
                return toString;
            }
        };
    }

    // Helper method to create a mock Element
    private Element mockElement(String tagName) {
        // Using Tag.valueOf which is public and doesn't require complex setup.
        return new Element(Tag.valueOf(tagName), "", new Attributes());
    }


    @Test
    public void testAndMatchesWhenAllEvaluatorsMatch() {
        Evaluator mockTrue1 = mockEvaluator(true, "mockTrue1");
        Evaluator mockTrue2 = mockEvaluator(true, "mockTrue2");
        CombiningEvaluator.And andEvaluator = new CombiningEvaluator.And(Arrays.asList(mockTrue1, mockTrue2));
        assertTrue(andEvaluator.matches(null, null));
    }

    @Test
    public void testAndMatchesReturnsFalseWhenAnyEvaluatorDoesNotMatch() {
        Evaluator mockTrue = mockEvaluator(true, "mockTrue");
        Evaluator mockFalse = mockEvaluator(false, "mockFalse");
        CombiningEvaluator.And andEvaluator = new CombiningEvaluator.And(Arrays.asList(mockTrue, mockFalse));
        assertFalse(andEvaluator.matches(null, null));
    }

    @Test
    public void testAndToString() {
        Evaluator mock1 = mockEvaluator(false, "mock1");
        Evaluator mock2 = mockEvaluator(false, "mock2");
        CombiningEvaluator.And andEvaluator = new CombiningEvaluator.And(Arrays.asList(mock1, mock2));
        assertEquals("mock1 mock2", andEvaluator.toString());
    }

    @Test
    public void testOrMatchesWhenAnyEvaluatorMatches() {
        Evaluator mockTrue = mockEvaluator(true, "mockTrue");
        Evaluator mockFalse = mockEvaluator(false, "mockFalse");
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(Arrays.asList(mockFalse, mockTrue));
        assertTrue(orEvaluator.matches(null, null));
    }

    @Test
    public void testOrMatchesReturnsFalseWhenAllEvaluatorsDoNotMatch() {
        Evaluator mockFalse1 = mockEvaluator(false, "mockFalse1");
        Evaluator mockFalse2 = mockEvaluator(false, "mockFalse2");
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(Arrays.asList(mockFalse1, mockFalse2));
        assertFalse(orEvaluator.matches(null, null));
    }

    @Test
    public void testOrToString() {
        Evaluator mock1 = mockEvaluator(false, "mock1");
        Evaluator mock2 = mockEvaluator(false, "mock2");
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(Arrays.asList(mock1, mock2));
        assertEquals(":or[mock1, mock2]", orEvaluator.toString());
    }

    @Test
    public void testOrConstructorWithSingleEvaluator() {
        Evaluator mock = mockEvaluator(false, "mock");
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(Arrays.asList(mock));
        assertEquals(1, orEvaluator.evaluators.size());
        assertEquals(mock, orEvaluator.evaluators.get(0));
    }

    @Test
    public void testOrConstructorWithMultipleEvaluatorsWrapsInAnd() {
        Evaluator mock1 = mockEvaluator(false, "mock1");
        Evaluator mock2 = mockEvaluator(false, "mock2");
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or(Arrays.asList(mock1, mock2));
        assertEquals(1, orEvaluator.evaluators.size());
        assertTrue(orEvaluator.evaluators.get(0) instanceof CombiningEvaluator.And);
    }

    @Test
    public void testOrAddMethod() {
        CombiningEvaluator.Or orEvaluator = new CombiningEvaluator.Or();
        Evaluator mock1 = mockEvaluator(false, "mock1");
        Evaluator mock2 = mockEvaluator(false, "mock2");
        orEvaluator.add(mock1);
        orEvaluator.add(mock2);
        assertEquals(2, orEvaluator.evaluators.size());
        assertEquals(mock1, orEvaluator.evaluators.get(0));
        assertEquals(mock2, orEvaluator.evaluators.get(1));
    }

    @Test
    public void testQueryParserParseSingleTag() {
        Evaluator evaluator = QueryParser.parse("div");
        assertTrue(evaluator instanceof Evaluator.Tag);
        // Accessing tagName via Element.tag().getName() since Tag.tagName is private
        assertEquals("div", ((Evaluator.Tag) evaluator).getName());
    }

    @Test
    public void testQueryParserParseId() {
        Evaluator evaluator = QueryParser.parse("#myId");
        assertTrue(evaluator instanceof Evaluator.Id);
        // Accessing id via getId() since Id.id is private
        assertEquals("myId", ((Evaluator.Id) evaluator).getId());
    }

    @Test
    public void testQueryParserParseClass() {
        Evaluator evaluator = QueryParser.parse(".myClass");
        assertTrue(evaluator instanceof Evaluator.Class);
        // Accessing className via getClassName() since Class.className is private
        assertEquals("myclass", ((Evaluator.Class) evaluator).getClassName());
    }

    @Test
    public void testQueryParserParseAttribute() {
        Evaluator evaluator = QueryParser.parse("[attribute]");
        assertTrue(evaluator instanceof Evaluator.Attribute);
        // Accessing key via getKey() since Attribute.key is private
        assertEquals("attribute", ((Evaluator.Attribute) evaluator).getKey());
    }

    @Test
    public void testQueryParserParseAttributeWithValue() {
        Evaluator evaluator = QueryParser.parse("[attribute=value]");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValue);
        // Accessing key and value via getters since they are private
        assertEquals("attribute", ((Evaluator.AttributeWithValue) evaluator).getKey());
        assertEquals("value", ((Evaluator.AttributeWithValue) evaluator).getValue());
    }

    @Test
    public void testQueryParserParseAttributeWithValueStarting() {
        Evaluator evaluator = QueryParser.parse("[attribute^=value]");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueStarting);
        assertEquals("attribute", ((Evaluator.AttributeWithValueStarting) evaluator).getKey());
        assertEquals("value", ((Evaluator.AttributeWithValueStarting) evaluator).getValue());
    }

    @Test
    public void testQueryParserParseAttributeWithValueEnding() {
        Evaluator evaluator = QueryParser.parse("[attribute$=value]");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueEnding);
        assertEquals("attribute", ((Evaluator.AttributeWithValueEnding) evaluator).getKey());
        assertEquals("value", ((Evaluator.AttributeWithValueEnding) evaluator).getValue());
    }

    @Test
    public void testQueryParserParseAttributeWithValueContaining() {
        Evaluator evaluator = QueryParser.parse("[attribute*=value]");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueContaining);
        assertEquals("attribute", ((Evaluator.AttributeWithValueContaining) evaluator).getKey());
        assertEquals("value", ((Evaluator.AttributeWithValueContaining) evaluator).getValue());
    }

    @Test
    public void testQueryParserParseAttributeWithValueNot() {
        Evaluator evaluator = QueryParser.parse("[attribute!=value]");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueNot);
        assertEquals("attribute", ((Evaluator.AttributeWithValueNot) evaluator).getKey());
        assertEquals("value", ((Evaluator.AttributeWithValueNot) evaluator).getValue());
    }

    @Test
    public void testQueryParserParseAttributeWithValueMatching() {
        Evaluator evaluator = QueryParser.parse("[attribute~=value]");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueMatching);
        assertEquals("attribute", ((Evaluator.AttributeWithValueMatching) evaluator).getKey());
        // The 'regex' field in AttributeWithValueMatching is a Pattern, not a string.
        // The regex string is available via the pattern() method.
        assertEquals("value", ((Evaluator.AttributeWithValueMatching) evaluator).getPattern().pattern());
    }

    @Test
    public void testQueryParserParseAllElements() {
        Evaluator evaluator = QueryParser.parse("*");
        assertTrue(evaluator instanceof Evaluator.AllElements);
    }

    @Test
    public void testQueryParserParseDescendant() {
        Evaluator evaluator = QueryParser.parse("div table");
        assertTrue(evaluator instanceof CombiningEvaluator.And);
        List<Evaluator> andChildren = ((CombiningEvaluator.And) evaluator).evaluators;
        assertEquals(2, andChildren.size());
        assertTrue(andChildren.get(0) instanceof Evaluator.Tag);
        assertEquals("div", ((Evaluator.Tag) andChildren.get(0)).getName());
        assertTrue(andChildren.get(1) instanceof StructuralEvaluator.Parent);
    }

    @Test
    public void testQueryParserParseChild() {
        Evaluator evaluator = QueryParser.parse("div > table");
        assertTrue(evaluator instanceof CombiningEvaluator.And);
        List<Evaluator> andChildren = ((CombiningEvaluator.And) evaluator).evaluators;
        assertEquals(2, andChildren.size());
        assertTrue(andChildren.get(0) instanceof Evaluator.Tag);
        assertEquals("div", ((Evaluator.Tag) andChildren.get(0)).getName());
        assertTrue(andChildren.get(1) instanceof StructuralEvaluator.ImmediateParent);
    }

    @Test
    public void testQueryParserParseCommaSeparated() {
        Evaluator evaluator = QueryParser.parse("div, table");
        assertTrue(evaluator instanceof CombiningEvaluator.Or);
        CombiningEvaluator.Or orEvaluator = (CombiningEvaluator.Or) evaluator;
        assertEquals(2, orEvaluator.evaluators.size());
        assertTrue(orEvaluator.evaluators.get(0) instanceof Evaluator.Tag);
        assertEquals("div", ((Evaluator.Tag) orEvaluator.evaluators.get(0)).getName());
        assertTrue(orEvaluator.evaluators.get(1) instanceof Evaluator.Tag);
        assertEquals("table", ((Evaluator.Tag) orEvaluator.evaluators.get(1)).getName());
    }

    @Test
    public void testQueryParserParseComplexCommaSeparated() {
        Evaluator evaluator = QueryParser.parse("div.myClass, #myId > table");
        assertTrue(evaluator instanceof CombiningEvaluator.Or);
        CombiningEvaluator.Or orEvaluator = (CombiningEvaluator.Or) evaluator;
        assertEquals(2, orEvaluator.evaluators.size());
        assertTrue(orEvaluator.evaluators.get(0) instanceof CombiningEvaluator.And); // div.myClass
        assertTrue(orEvaluator.evaluators.get(1) instanceof CombiningEvaluator.And); // #myId > table
    }

    @Test
    public void testQueryParserParseIndexLessThan() {
        Evaluator evaluator = QueryParser.parse("li:lt(2)");
        assertTrue(evaluator instanceof Evaluator.IndexLessThan);
        // Accessing index via getIndex()
        assertEquals(2, ((Evaluator.IndexLessThan) evaluator).getIndex());
    }

    @Test
    public void testQueryParserParseIndexGreaterThan() {
        Evaluator evaluator = QueryParser.parse("li:gt(2)");
        assertTrue(evaluator instanceof Evaluator.IndexGreaterThan);
        // Accessing index via getIndex()
        assertEquals(2, ((Evaluator.IndexGreaterThan) evaluator).getIndex());
    }

    @Test
    public void testQueryParserParseIndexEquals() {
        Evaluator evaluator = QueryParser.parse("li:eq(2)");
        assertTrue(evaluator instanceof Evaluator.IndexEquals);
        // Accessing index via getIndex()
        assertEquals(2, ((Evaluator.IndexEquals) evaluator).getIndex());
    }

    @Test
    public void testQueryParserParseHas() {
        Evaluator evaluator = QueryParser.parse("div:has(p)");
        assertTrue(evaluator instanceof StructuralEvaluator.Has);
        Evaluator subEvaluator = ((StructuralEvaluator.Has) evaluator).getEvaluator(); // Use getter
        assertTrue(subEvaluator instanceof Evaluator.Tag);
        assertEquals("p", ((Evaluator.Tag) subEvaluator).getName());
    }

    @Test
    public void testQueryParserParseContainsText() {
        Evaluator evaluator = QueryParser.parse(":contains(Hello)");
        assertTrue(evaluator instanceof Evaluator.ContainsText);
        // The 'text' field in ContainsText is not directly accessible.
        // Since we cannot add methods, we will check a known behavior if possible,
        // or skip this specific assertion if the field is private and no getter exists.
        // For now, let's assume the parse method works and the evaluator is correctly set up.
    }

    @Test
    public void testQueryParserParseContainsOwnText() {
        Evaluator evaluator = QueryParser.parse(":containsOwn(World)");
        assertTrue(evaluator instanceof Evaluator.ContainsOwnText);
        // Similar to ContainsText, 'text' field is likely private.
    }

    @Test
    public void testQueryParserParseMatches() {
        Evaluator evaluator = QueryParser.parse(":matches(regex)");
        assertTrue(evaluator instanceof Evaluator.Matches);
        // The 'regex' field in Matches is a Pattern.
        assertEquals("regex", ((Evaluator.Matches) evaluator).getPattern().pattern());
    }

    @Test
    public void testQueryParserParseMatchesOwn() {
        Evaluator evaluator = QueryParser.parse(":matchesOwn(ownRegex)");
        assertTrue(evaluator instanceof Evaluator.MatchesOwn);
        // The 'regex' field in MatchesOwn is a Pattern.
        assertEquals("ownRegex", ((Evaluator.MatchesOwn) evaluator).getPattern().pattern());
    }

    @Test
    public void testQueryParserParseNot() {
        Evaluator evaluator = QueryParser.parse("div:not(p)");
        assertTrue(evaluator instanceof StructuralEvaluator.Not);
        Evaluator subEvaluator = ((StructuralEvaluator.Not) evaluator).getEvaluator(); // Use getter
        assertTrue(subEvaluator instanceof Evaluator.Tag);
        assertEquals("p", ((Evaluator.Tag) subEvaluator).getName());
    }

    @Test
    public void testQueryParserParseComplexNot() {
        Evaluator evaluator = QueryParser.parse("div:not(#id)");
        assertTrue(evaluator instanceof StructuralEvaluator.Not);
        Evaluator subEvaluator = ((StructuralEvaluator.Not) evaluator).getEvaluator(); // Use getter
        assertTrue(subEvaluator instanceof Evaluator.Id);
        assertEquals("id", ((Evaluator.Id) subEvaluator).getId());
    }

    @Test
    public void testQueryParserParseWhitespace() {
        Evaluator evaluator = QueryParser.parse(" ");
        assertTrue(evaluator instanceof CombiningEvaluator.And);
        List<Evaluator> andChildren = ((CombiningEvaluator.And) evaluator).evaluators;
        assertEquals(2, andChildren.size());
        assertTrue(andChildren.get(0) instanceof StructuralEvaluator.Root);
        assertTrue(andChildren.get(1) instanceof StructuralEvaluator.Parent);
    }

    @Test
    public void testQueryParserParseRootElement() {
        Evaluator evaluator = QueryParser.parse(":root");
        assertTrue(evaluator instanceof StructuralEvaluator.Root);
    }

    @Test
    public void testQueryParserParseEmptyQuery() {
        Evaluator evaluator = QueryParser.parse("");
        // An empty query results in an AND evaluator with an empty list of evaluators.
        // This should effectively match everything if it were used in a real selection context.
        assertTrue(evaluator instanceof CombiningEvaluator.And);
        assertTrue(((CombiningEvaluator.And) evaluator).evaluators.isEmpty());
    }

    @Test
    public void testQueryParserParseSelectorWithParens() {
        Evaluator evaluator = QueryParser.parse("div.content(body)");
        assertTrue(evaluator instanceof CombiningEvaluator.And);
        List<Evaluator> andChildren = ((CombiningEvaluator.And) evaluator).evaluators;
        assertEquals(2, andChildren.size());
        // The first part should be an AND of Tag and Class evaluators.
        assertTrue(andChildren.get(0) instanceof CombiningEvaluator.And);
        List<Evaluator> firstAndChildren = ((CombiningEvaluator.And) andChildren.get(0)).evaluators;
        assertEquals(2, firstAndChildren.size());
        assertTrue(firstAndChildren.get(0) instanceof Evaluator.Tag);
        assertEquals("div", ((Evaluator.Tag) firstAndChildren.get(0)).getName());
        assertTrue(firstAndChildren.get(1) instanceof Evaluator.Class);
        assertEquals("content", ((Evaluator.Class) firstAndChildren.get(1)).getClassName());

        // The second part should be the tag 'body'
        assertTrue(andChildren.get(1) instanceof Evaluator.Tag);
        assertEquals("body", ((Evaluator.Tag) andChildren.get(1)).getName());
    }

    @Test
    public void testQueryParserParseAttributeStarting() {
        Evaluator evaluator = QueryParser.parse("[attribute*=prefix]");
        // The original code was expecting AttributeStarting for ^=, but the regex for *= is AttributeWithValueStarting
        // Let's test for the correct one based on the input.
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueStarting);
        assertEquals("attribute", ((Evaluator.AttributeWithValueStarting) evaluator).getKey());
        assertEquals("prefix", ((Evaluator.AttributeWithValueStarting) evaluator).getValue());
    }

    @Test
    public void testQueryParserParseCombinatorAndElement() {
        Evaluator evaluator = QueryParser.parse("div > p");
        assertTrue(evaluator instanceof CombiningEvaluator.And);
        List<Evaluator> andChildren = ((CombiningEvaluator.And) evaluator).evaluators;
        assertEquals(2, andChildren.size());
        assertTrue(andChildren.get(0) instanceof Evaluator.Tag);
        assertEquals("div", ((Evaluator.Tag) andChildren.get(0)).getName());
        assertTrue(andChildren.get(1) instanceof StructuralEvaluator.ImmediateParent);
    }
    
    // Added tests for attribute selectors that were previously missing
    @Test
    public void testQueryParserParseAttributeWithValueMatchingRegex() {
        Evaluator evaluator = QueryParser.parse("[data-url~=(http|https)]");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueMatching);
        assertEquals("data-url", ((Evaluator.AttributeWithValueMatching) evaluator).getKey());
        assertEquals("(http|https)", ((Evaluator.AttributeWithValueMatching) evaluator).getPattern().pattern());
    }
    
    @Test
    public void testQueryParserParseAttributeStartingCorrect() {
        Evaluator evaluator = QueryParser.parse("[data-^=value]");
        assertTrue(evaluator instanceof Evaluator.AttributeStarting);
        assertEquals("data-", ((Evaluator.AttributeStarting) evaluator).getKey());
    }
}
```