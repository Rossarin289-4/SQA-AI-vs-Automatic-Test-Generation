package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;

public class InlineCostEstimatorTest {
    @Test
    public void testNumberLiteralCost() throws Exception {
        assertEquals(1, InlineCostEstimator.getCost(Node.newNumber(123)));
    }

    @Test
    public void testEmptyStringLiteralCost() throws Exception {
        assertEquals(2, InlineCostEstimator.getCost(Node.newString("")));
    }

    @Test
    public void testShortStringLiteralCost() throws Exception {
        assertEquals(3, InlineCostEstimator.getCost(Node.newString("a")));
    }

    @Test
    public void testLongStringLiteralCost() throws Exception {
        assertEquals(5, InlineCostEstimator.getCost(Node.newString("abc")));
    }

    @Test
    public void testCostThresholdAtExactCost() throws Exception {
        assertEquals(1, InlineCostEstimator.getCost(Node.newNumber(1), 1));
    }

    @Test
    public void testCostThresholdOneAboveCost() throws Exception {
        assertEquals(1, InlineCostEstimator.getCost(Node.newNumber(1), 2));
    }

    @Test
    public void testCostThresholdOneBelowCost() throws Exception {
        assertEquals(1, InlineCostEstimator.getCost(Node.newNumber(1), 0));
    }

    @Test
    public void testNegativeCostThreshold() throws Exception {
        assertEquals(1, InlineCostEstimator.getCost(Node.newNumber(1), -1));
    }
}
