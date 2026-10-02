package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InlineCostEstimatorAI28Test {

  @Test
  public void testGetCostBasic() {
    Compiler compiler = new Compiler();
    Node root = compiler.parse(SourceFile.fromCode("test.js", "var x = 1;"));
    int cost = InlineCostEstimator.getCost(root);
    assertEquals(6, cost);
  }

  @Test
  public void testGetCostWithThreshold() {
    Compiler compiler = new Compiler();
    Node root = compiler.parse(SourceFile.fromCode("test.js", "var x = 1;"));
    int cost = InlineCostEstimator.getCost(root, 2);
    assertEquals(2, cost);
  }

  @Test
  public void testGetCostNullNode() {
    int cost = InlineCostEstimator.getCost(null);
    assertEquals(0, cost);
  }
}
