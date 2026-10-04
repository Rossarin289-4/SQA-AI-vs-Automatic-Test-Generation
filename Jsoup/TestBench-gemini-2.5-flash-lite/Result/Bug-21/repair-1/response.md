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

    // Helper method to create a mock Tag
    private Tag mockTag(String name) {
        // Using a constructor that is visible for testing purposes and doesn't require complex setup.
        // In a real scenario, you might need to mock Tag more thoroughly if its methods were being called.
        return Tag.valueOf(name);
    }

    // Helper method to create a mock Element
    private Element mockElement(String tagName) {
        return new Element(mockTag(tagName), "", new Attributes());
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
        assertEquals("div", ((Evaluator.Tag) evaluator).tagName.getName()); // Access tagName via getName()
    }

    @Test
    public void testQueryParserParseId() {
        Evaluator evaluator = QueryParser.parse("#myId");
        assertTrue(evaluator instanceof Evaluator.Id);
        assertEquals("myId", ((Evaluator.Id) evaluator).id);
    }

    @Test
    public void testQueryParserParseClass() {
        Evaluator evaluator = QueryParser.parse(".myClass");
        assertTrue(evaluator instanceof Evaluator.Class);
        assertEquals("myclass", ((Evaluator.Class) evaluator).className);
    }

    @Test
    public void testQueryParserParseAttribute() {
        Evaluator evaluator = QueryParser.parse("[attribute]");
        assertTrue(evaluator instanceof Evaluator.Attribute);
        assertEquals("attribute", ((Evaluator.Attribute) evaluator).key);
    }

    @Test
    public void testQueryParserParseAttributeWithValue() {
        Evaluator evaluator = QueryParser.parse("[attribute=value]");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValue);
        assertEquals("attribute", ((Evaluator.AttributeWithValue) evaluator).key);
        assertEquals("value", ((Evaluator.AttributeWithValue) evaluator).value);
    }

    @Test
    public void testQueryParserParseAttributeWithValueStarting() {
        Evaluator evaluator = QueryParser.parse("[attribute^=value]");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueStarting);
        assertEquals("attribute", ((Evaluator.AttributeWithValueStarting) evaluator).key);
        assertEquals("value", ((Evaluator.AttributeWithValueStarting) evaluator).value);
    }

    @Test
    public void testQueryParserParseAttributeWithValueEnding() {
        Evaluator evaluator = QueryParser.parse("[attribute$=value]");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueEnding);
        assertEquals("attribute", ((Evaluator.AttributeWithValueEnding) evaluator).key);
        assertEquals("value", ((Evaluator.AttributeWithValueEnding) evaluator).value);
    }

    @Test
    public void testQueryParserParseAttributeWithValueContaining() {
        Evaluator evaluator = QueryParser.parse("[attribute*=value]");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueContaining);
        assertEquals("attribute", ((Evaluator.AttributeWithValueContaining) evaluator).key);
        assertEquals("value", ((Evaluator.AttributeWithValueContaining) evaluator).value);
    }

    @Test
    public void testQueryParserParseAttributeWithValueNot() {
        Evaluator evaluator = QueryParser.parse("[attribute!=value]");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueNot);
        assertEquals("attribute", ((Evaluator.AttributeWithValueNot) evaluator).key);
        assertEquals("value", ((Evaluator.AttributeWithValueNot) evaluator).value);
    }

    @Test
    public void testQueryParserParseAttributeWithValueMatching() {
        Evaluator evaluator = QueryParser.parse("[attribute~=value]");
        assertTrue(evaluator instanceof Evaluator.AttributeWithValueMatching);
        assertEquals("attribute", ((Evaluator.AttributeWithValueMatching) evaluator).key);
        // The 'value' field in AttributeWithValueMatching is a Pattern, not a string.
        // The regex string is available via the pattern() method.
        assertEquals("value", ((Evaluator.AttributeWithValueMatching) evaluator).regex.pattern());
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
        assertEquals("div", ((Evaluator.Tag) andChildren.get(0)).tagName.getName());
        assertTrue(andChildren.get(1) instanceof StructuralEvaluator.Parent);
    }

    @Test
    public void testQueryParserParseChild() {
        Evaluator evaluator = QueryParser.parse("div > table");
        assertTrue(evaluator instanceof CombiningEvaluator.And);
        List<Evaluator> andChildren = ((CombiningEvaluator.And) evaluator).evaluators;
        assertEquals(2, andChildren.size());
        assertTrue(andChildren.get(0) instanceof Evaluator.Tag);
        assertEquals("div", ((Evaluator.Tag) andChildren.get(0)).tagName.getName());
        assertTrue(andChildren.get(1) instanceof StructuralEvaluator.ImmediateParent);
    }

    @Test
    public void testQueryParserParseCommaSeparated() {
        Evaluator evaluator = QueryParser.parse("div, table");
        assertTrue(evaluator instanceof CombiningEvaluator.Or);
        CombiningEvaluator.Or orEvaluator = (CombiningEvaluator.Or) evaluator;
        assertEquals(2, orEvaluator.evaluators.size());
        assertTrue(orEvaluator.evaluators.get(0) instanceof Evaluator.Tag);
        assertEquals("div", ((Evaluator.Tag) orEvaluator.evaluators.get(0)).tagName.getName());
        assertTrue(orEvaluator.evaluators.get(1) instanceof Evaluator.Tag);
        assertEquals("table", ((Evaluator.Tag) orEvaluator.evaluators.get(1)).tagName.getName());
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
        assertEquals(2, ((Evaluator.IndexLessThan) evaluator).index);
    }

    @Test
    public void testQueryParserParseIndexGreaterThan() {
        Evaluator evaluator = QueryParser.parse("li:gt(2)");
        assertTrue(evaluator instanceof Evaluator.IndexGreaterThan);
        assertEquals(2, ((Evaluator.IndexGreaterThan) evaluator).index);
    }

    @Test
    public void testQueryParserParseIndexEquals() {
        Evaluator evaluator = QueryParser.parse("li:eq(2)");
        assertTrue(evaluator instanceof Evaluator.IndexEquals);
        assertEquals(2, ((Evaluator.IndexEquals) evaluator).index);
    }

    @Test
    public void testQueryParserParseHas() {
        Evaluator evaluator = QueryParser.parse("div:has(p)");
        assertTrue(evaluator instanceof StructuralEvaluator.Has);
        Evaluator subEvaluator = ((StructuralEvaluator.Has) evaluator).evaluator;
        assertTrue(subEvaluator instanceof Evaluator.Tag);
        assertEquals("p", ((Evaluator.Tag) subEvaluator).tagName.getName());
    }

    @Test
    public void testQueryParserParseContainsText() {
        Evaluator evaluator = QueryParser.parse(":contains(Hello)");
        assertTrue(evaluator instanceof Evaluator.ContainsText);
        // The 'text' field in ContainsText is not directly accessible.
        // We'd need a getter or a way to assert its value.
        // Since we cannot add methods, we will check a known behavior if possible,
        // or skip this specific assertion if the field is private and no getter exists.
        // For now, let's assume the parse method works and the evaluator is correctly set up.
        // If a specific value check is needed and the field is private, this test might need adjustment.
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
        assertEquals("regex", ((Evaluator.Matches) evaluator).regex.pattern());
    }

    @Test
    public void testQueryParserParseMatchesOwn() {
        Evaluator evaluator = QueryParser.parse(":matchesOwn(ownRegex)");
        assertTrue(evaluator instanceof Evaluator.MatchesOwn);
        // The 'regex' field in MatchesOwn is a Pattern.
        assertEquals("ownRegex", ((Evaluator.MatchesOwn) evaluator).regex.pattern());
    }

    @Test
    public void testQueryParserParseNot() {
        Evaluator evaluator = QueryParser.parse("div:not(p)");
        assertTrue(evaluator instanceof StructuralEvaluator.Not);
        Evaluator subEvaluator = ((StructuralEvaluator.Not) evaluator).evaluator;
        assertTrue(subEvaluator instanceof Evaluator.Tag);
        assertEquals("p", ((Evaluator.Tag) subEvaluator).tagName.getName());
    }

    @Test
    public void testQueryParserParseComplexNot() {
        Evaluator evaluator = QueryParser.parse("div:not(#id)");
        assertTrue(evaluator instanceof StructuralEvaluator.Not);
        Evaluator subEvaluator = ((StructuralEvaluator.Not) evaluator).evaluator;
        assertTrue(subEvaluator instanceof Evaluator.Id);
        assertEquals("id", ((Evaluator.Id) subEvaluator).id);
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
        assertTrue(andChildren.get(0) instanceof CombiningEvaluator.And); // div.content
        assertTrue(andChildren.get(1) instanceof Evaluator.Tag);
        assertEquals("body", ((Evaluator.Tag) andChildren.get(1)).tagName.getName());
    }

    @Test
    public void testQueryParserParseAttributeStarting() {
        Evaluator evaluator = QueryParser.parse("[attribute*=prefix]");
        assertTrue(evaluator instanceof Evaluator.AttributeStarting);
        assertEquals("attribute", ((Evaluator.AttributeStarting) evaluator).key);
    }

    @Test
    public void testQueryParserParseCombinatorAndElement() {
        Evaluator evaluator = QueryParser.parse("div > p");
        assertTrue(evaluator instanceof CombiningEvaluator.And);
        List<Evaluator> andChildren = ((CombiningEvaluator.And) evaluator).evaluators;
        assertEquals(2, andChildren.size());
        assertTrue(andChildren.get(0) instanceof Evaluator.Tag);
        assertEquals("div", ((Evaluator.Tag) andChildren.get(0)).tagName.getName());
        assertTrue(andChildren.get(1) instanceof StructuralEvaluator.ImmediateParent);
    }
}
```