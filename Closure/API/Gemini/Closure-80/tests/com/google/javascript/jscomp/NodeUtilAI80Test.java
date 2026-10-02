package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.TernaryValue;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NodeUtilAI80Test {

  @Test
  public void testGetBooleanValue() {
    Node trueNode = Node.newString("hello");
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(trueNode));

    Node falseNode = Node.newNumber(0);
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(falseNode));
  }

  @Test
  public void testGetExpressionBooleanValue() {
    Node stringNode = Node.newString("test");
    TernaryValue val = NodeUtil.getExpressionBooleanValue(stringNode);
    assertEquals(TernaryValue.TRUE, val);
  }

  @Test
  public void testNewCallNode() {
    Node target = Node.newString("f");
    Node callNode = NodeUtil.newCallNode(target);
    assertNotNull(callNode);
  }
}
