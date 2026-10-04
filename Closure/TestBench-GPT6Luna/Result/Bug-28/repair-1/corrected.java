package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;

public class InlineCostEstimatorTest {
    @Test
    public void testIdentifierCost() throws Exception {
        assertEquals(2, InlineCostEstimator.getCost(Node.newString( Token.NAME, "x")));
    }

    @Test
    public void testDifferentIdentifierNamesHaveSameEstimatedCost() throws Exception {
        assertEquals(InlineCostEstimator.getCost(Node.newString(Token.NAME, "x")),
                InlineCostEstimator.getCost(Node.newString(Token.NAME, "longName")));
    }

    @Test
    public void testEmptyStringLiteralCost() throws Exception {
        assertEquals(2, InlineCostEstimator.getCost(Node.newString("")));
    }

    @Test
    public void testShortStringLiteralCost() throws Exception {
        assertEquals(4, InlineCostEstimator.getCost(Node.newString("a")));
    }

    @Test
    public void testLongStringLiteralCost() throws Exception {
        assertEquals(7, InlineCostEstimator.getCost(Node.newString("abc")));
    }

    @Test
    public void testNumberLiteralCost() throws Exception {
        assertEquals(1, InlineCostEstimator.getCost(Node.newNumber(123)));
    }

    @Test
    public void testBooleanTrueCost() throws Exception {
        assertEquals(1, InlineCostEstimator.getCost(new Node(Token.TRUE)));
    }

    @Test
    public void testBooleanFalseCost() throws Exception {
        assertEquals(1, InlineCostEstimator.getCost(new Node(Token.FALSE)));
    }

    @Test
    public void testNullLiteralCost() throws Exception {
        assertEquals(1, InlineCostEstimator.getCost(new Node(Token.NULL)));
    }

    @Test
    public void testAdditionExpressionCost() throws Exception {
        Node expression = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        assertEquals(3, InlineCostEstimator.getCost(expression));
    }

    @Test
    public void testVariableDeclarationCost() throws Exception {
        Node declaration = new Node(Token.VAR, Node.newString(Token.NAME, "x"));
        assertEquals(5, InlineCostEstimator.getCost(declaration));
    }

    @Test
    public void testCostThresholdAtExactCost() throws Exception {
        Node expression = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        assertEquals(3, InlineCostEstimator.getCost(expression, 3));
    }

    @Test
    public void testCostThresholdOneAboveCost() throws Exception {
        Node expression = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        assertEquals(3, InlineCostEstimator.getCost(expression, 4));
    }

    @Test
    public void testCostThresholdOneBelowCost() throws Exception {
        Node expression = new Node(Token.ADD, Node.newNumber(1), Node.newNumber(2));
        assertEquals(2, InlineCostEstimator.getCost(expression, 2));
    }

    @Test
    public void testZeroCostThreshold() throws Exception {
        assertEquals(1, InlineCostEstimator.getCost(Node.newNumber(1), 0));
    }

    @Test
    public void testNegativeCostThreshold() throws Exception {
        assertEquals(1, InlineCostEstimator.getCost(Node.newNumber(1), -1));
    }
}
