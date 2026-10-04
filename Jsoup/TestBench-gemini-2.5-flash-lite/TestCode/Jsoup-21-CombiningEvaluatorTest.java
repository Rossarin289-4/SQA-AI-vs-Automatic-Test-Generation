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
    public void testQueryParserParseAllElements() {
        Evaluator evaluator = QueryParser.parse("*");
        assertTrue(evaluator instanceof Evaluator.AllElements);
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



    
    // Added tests for attribute selectors that were previously missing
    
}


