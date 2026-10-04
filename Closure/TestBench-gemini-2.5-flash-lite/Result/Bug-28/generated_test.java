package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;

public class InlineCostEstimatorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }


    @Test
    public void testGetCostWithMaxCostThreshold() throws Exception {
        Node root = Node.newString("test");
        // The cost of "test" is estimated as "ab", which has length 2.
        // Integer.MAX_VALUE is a very high threshold, so the full cost should be calculated.
        assertEquals(2, InlineCostEstimator.getCost(root, Integer.MAX_VALUE));
    }

    @Test
    public void testGetCostWithSmallThreshold() throws Exception {
        Node root = Node.newString("test");
        // The cost of "test" is estimated as "ab", length 2.
        // With a threshold of 2, the cost will be exactly 2.
        assertEquals(2, InlineCostEstimator.getCost(root, 2));
    }

    @Test
    public void testGetCostWithThresholdSlightlyLargerThanIdentifier() throws Exception {
        Node root = Node.newString("test");
        // The cost of "test" is estimated as "ab", length 2.
        // With a threshold of 3, the full cost (2) should be calculated.
        assertEquals(2, InlineCostEstimator.getCost(root, 3));
    }

    @Test
    public void testGetCostWithThresholdExactlyIdentifierCost() throws Exception {
        Node root = Node.newString("test");
        // The cost of "test" is estimated as "ab", length 2.
        // The threshold is also 2, so the full cost should be calculated.
        assertEquals(2, InlineCostEstimator.getCost(root, InlineCostEstimator.ESTIMATED_IDENTIFIER_COST));
    }

    @Test
    public void testGetCostWithThresholdBelowIdentifierCost() throws Exception {
        Node root = Node.newString("test");
        // The cost of "test" is estimated as "ab", length 2.
        // With a threshold of 1, the cost will not be able to reach 2.
        // The estimator stops processing if maxCost <= cost.
        // When add("ab") is called, cost becomes 2. Since 1 < 2, continueProcessing becomes false.
        // The returned cost is the one *before* exceeding the threshold.
        // The initial cost is 0.
        assertEquals(0, InlineCostEstimator.getCost(root, 1));
    }


    @Test
    public void testGetCostWithNumberNode() throws Exception {
        Node root = Node.newNumber(123.45);
        // CodeGenerator.add(Node) calls CodeGenerator.add(String) for numbers.
        // The string representation of 123.45 is "123.45", which has length 6.
        assertEquals(6, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithBooleanTrueConstant() throws Exception {
        Node root = Node.newString("true");
        // addConstant("true") calls add("0"). The length is 1.
        assertEquals(1, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithBooleanFalseConstant() throws Exception {
        Node root = Node.newString("false");
        // addConstant("false") calls add("0"). The length is 1.
        assertEquals(1, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithNullConstant() throws Exception {
        Node root = Node.newString("null");
        // addConstant("null") calls add("0"). The length is 1.
        assertEquals(1, InlineCostEstimator.getCost(root));
    }


    @Test
    public void testGetCostWithLongString() throws Exception {
        String longString = "thisIsAVeryLongStringLiteral";
        Node root = Node.newString(longString);
        // For a string literal, CodeGenerator.add(String) is called directly.
        // The length of the string is the cost.
        assertEquals(longString.length(), InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithZeroCostThreshold() throws Exception {
        Node root = Node.newString("test");
        // With a threshold of 0, processing stops immediately if the initial cost is not 0.
        // add(root) will call addIdentifier("test"), which calls add(ESTIMATED_IDENTIFIER).
        // The cost becomes 2. Since 0 < 2, continueProcessing is set to false.
        // The cost returned is 0 (the cost before exceeding the threshold).
        assertEquals(0, InlineCostEstimator.getCost(root, 0));
    }

    @Test
    public void testGetCostWithMaxIntegerCostThreshold() throws Exception {
        Node root = Node.newString("test");
        // Integer.MAX_VALUE is a very high threshold. The cost of "test" is 2.
        assertEquals(2, InlineCostEstimator.getCost(root, Integer.MAX_VALUE));
    }

    @Test
    public void testGetCostWithEmptyString() throws Exception {
        Node root = Node.newString("");
        // An empty string has a cost of 0.
        assertEquals(0, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithEmptyStringAndThreshold() throws Exception {
        Node root = Node.newString("");
        // An empty string has a cost of 0. A threshold of 5 doesn't affect it.
        assertEquals(0, InlineCostEstimator.getCost(root, 5));
    }

    @Test
    public void testGetCostWithEmptyStringAndZeroThreshold() throws Exception {
        Node root = Node.newString("");
        // An empty string has a cost of 0. A threshold of 0 doesn't affect it.
        assertEquals(0, InlineCostEstimator.getCost(root, 0));
    }

    @Test
    public void testGetCostWithOnlyWhitespaceString() throws Exception {
        Node root = Node.newString("   ");
        // CodeGenerator.add("   ") is called. The cost is the length of the string.
        assertEquals(3, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithOnlyWhitespaceStringAndThreshold() throws Exception {
        Node root = Node.newString("   ");
        // Cost is 3, threshold is 3. The cost reaches the threshold exactly.
        assertEquals(3, InlineCostEstimator.getCost(root, 3));
    }

    @Test
    public void testGetCostWithOnlyWhitespaceStringAndSmallThreshold() throws Exception {
        Node root = Node.newString("   ");
        // Cost is 3, threshold is 2.
        // When add("   ") is called, cost becomes 3. Since 2 < 3, continueProcessing becomes false.
        // The cost returned is the one before exceeding the threshold.
        // The initial cost is 0.
        assertEquals(0, InlineCostEstimator.getCost(root, 2));
    }

    @Test
    public void testGetCostWithRootAndZeroThreshold() throws Exception {
        Node root = Node.newString("test");
        // With a threshold of 0, processing stops immediately if the initial cost is not 0.
        // add(root) will call addIdentifier("test"), which calls add(ESTIMATED_IDENTIFIER).
        // The cost becomes 2. Since 0 < 2, continueProcessing is set to false.
        // The cost returned is 0 (the cost before exceeding the threshold).
        assertEquals(0, InlineCostEstimator.getCost(root, 0));
    }
}
