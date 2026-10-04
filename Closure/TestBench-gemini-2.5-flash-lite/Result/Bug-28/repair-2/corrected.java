package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;

public class InlineCostEstimatorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testGetCostWithEmptyNode() throws Exception {
        // Node.NULL is a valid constructor for a minimal node if not UNCONNECTED_NODE
        Node root = new Node(Node.NULL);
        assertEquals(0, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithMaxCostThreshold() throws Exception {
        Node root = Node.newString("test");
        // For "test", the estimated identifier cost is 2.
        assertEquals(2, InlineCostEstimator.getCost(root, Integer.MAX_VALUE));
    }

    @Test
    public void testGetCostWithSmallThreshold() throws Exception {
        Node root = Node.newString("test");
        // The cost of "test" is estimated as "ab" which has length 2.
        assertEquals(2, InlineCostEstimator.getCost(root, 2));
    }

    @Test
    public void testGetCostWithThresholdSlightlyLargerThanIdentifier() throws Exception {
        Node root = Node.newString("test");
        assertEquals(2, InlineCostEstimator.getCost(root, 3));
    }

    @Test
    public void testGetCostWithThresholdExactlyIdentifierCost() throws Exception {
        Node root = Node.newString("test");
        assertEquals(2, InlineCostEstimator.getCost(root, InlineCostEstimator.ESTIMATED_IDENTIFIER_COST));
    }

    @Test
    public void testGetCostWithThresholdBelowIdentifierCost() throws Exception {
        Node root = Node.newString("test");
        // The estimator will stop processing once cost exceeds threshold.
        // For "test", the identifier cost is 2. If threshold is 1, cost will be 0.
        assertEquals(0, InlineCostEstimator.getCost(root, 1));
    }

    @Test
    public void testGetCostWithMultipleNodes() throws Exception {
        Node root = new Node(Node.COMMA); // Node.COMMA is a valid token type
        root.addChildToBack(Node.newString("a"));
        root.addChildToBack(Node.newString("b"));
        // Cost of "a" is 2, cost of "b" is 2. Total 4.
        assertEquals(4, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithNumberNode() throws Exception {
        Node root = Node.newNumber(123.45);
        // CodeGenerator handles numbers by converting them to strings. "123.45" has length 6.
        assertEquals(6, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithBooleanTrueConstant() throws Exception {
        Node root = Node.newString("true"); // Using newString for simplicity, as Node.TRUE is not exposed in API.
        // addConstant("true") calls add("0")
        assertEquals(1, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithBooleanFalseConstant() throws Exception {
        Node root = Node.newString("false"); // Using newString for simplicity, as Node.FALSE is not exposed in API.
        // addConstant("false") calls add("0")
        assertEquals(1, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithNullConstant() throws Exception {
        Node root = Node.newString("null"); // Using newString for simplicity, as Node.NULL is not exposed in API.
        // addConstant("null") calls add("0")
        assertEquals(1, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithNestedNodes() throws Exception {
        Node root = new Node(Node.COMMA);
        Node inner = new Node(Node.COMMA);
        inner.addChildToBack(Node.newString("x"));
        root.addChildToBack(inner);
        root.addChildToBack(Node.newString("y"));
        // Cost of "x" is 2, cost of "y" is 2. Total 4.
        assertEquals(4, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithLongString() throws Exception {
        String longString = "thisIsAVeryLongStringLiteral";
        Node root = Node.newString(longString);
        // The estimator uses "ab" for identifiers, so it should use the string length.
        assertEquals(longString.length(), InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithZeroCostThreshold() throws Exception {
        Node root = Node.newString("test");
        assertEquals(0, InlineCostEstimator.getCost(root, 0));
    }

    @Test
    public void testGetCostWithMaxIntegerCostThreshold() throws Exception {
        Node root = Node.newString("test");
        // This should be the same as Integer.MAX_VALUE, as it's unlikely to be exceeded.
        assertEquals(2, InlineCostEstimator.getCost(root, Integer.MAX_VALUE));
    }

    @Test
    public void testGetCostWithEmptyString() throws Exception {
        Node root = Node.newString("");
        assertEquals(0, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithEmptyStringAndThreshold() throws Exception {
        Node root = Node.newString("");
        assertEquals(0, InlineCostEstimator.getCost(root, 5));
    }

    @Test
    public void testGetCostWithEmptyStringAndZeroThreshold() throws Exception {
        Node root = Node.newString("");
        assertEquals(0, InlineCostEstimator.getCost(root, 0));
    }

    @Test
    public void testGetCostWithOnlyWhitespaceString() throws Exception {
        Node root = Node.newString("   ");
        assertEquals(3, InlineCostEstimator.getCost(root));
    }

    @Test
    public void testGetCostWithOnlyWhitespaceStringAndThreshold() throws Exception {
        Node root = Node.newString("   ");
        assertEquals(3, InlineCostEstimator.getCost(root, 3));
    }

    @Test
    public void testGetCostWithOnlyWhitespaceStringAndSmallThreshold() throws Exception {
        Node root = Node.newString("   ");
        // Cost is 3, threshold is 2. Processing should stop, cost should be 0.
        assertEquals(0, InlineCostEstimator.getCost(root, 2));
    }

    @Test
    public void testGetCostWithEmptyRootAndThreshold() throws Exception {
        Node root = new Node(Node.EMPTY); // Node.EMPTY is a valid token type
        assertEquals(0, InlineCostEstimator.getCost(root, 10));
    }

    @Test
    public void testGetCostWithRootAndZeroThreshold() throws Exception {
        Node root = Node.newString("test");
        assertEquals(0, InlineCostEstimator.getCost(root, 0));
    }
}
