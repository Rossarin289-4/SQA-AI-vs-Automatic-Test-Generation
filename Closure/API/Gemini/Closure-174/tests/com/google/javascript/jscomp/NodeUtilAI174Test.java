package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class NodeUtilAI174Test {

  @Test
  public void testGetPureBooleanValue() {
    Node trueNode = IR.trueNode();
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(trueNode));

    Node falseNode = IR.falseNode();
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(falseNode));

    Node stringNode = IR.string("hello");
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(stringNode));
  }

  @Test
  public void testNumberNode() {
    Node numNode = NodeUtil.numberNode(42.0, null);
    assertTrue(numNode.isNumber());
    assertEquals(42.0, numNode.getDouble(), 0.0);

    Node nanNode = NodeUtil.numberNode(Double.NaN, null);
    assertTrue(nanNode.isName());
    assertEquals("NaN", nanNode.getString());
  }

  @Test
  public void testIsNaN() {
    Node nanNode = IR.name("NaN");
    assertTrue(NodeUtil.isNaN(nanNode));
  }
}
