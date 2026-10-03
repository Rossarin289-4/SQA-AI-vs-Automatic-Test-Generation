package com.google.javascript.jscomp;

import com.google.javascript.rhino.IR;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class NodeUtilAI10Test {

  @Test
  public void testGetPureBooleanValueLiterals() {
    Node trueNode = IR.trueNode();
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(trueNode));

    Node falseNode = IR.falseNode();
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(falseNode));

    Node stringNode = IR.string("hello");
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(stringNode));

    Node emptyStringNode = IR.string("");
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(emptyStringNode));

    Node numberNode = IR.number(5.0);
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(numberNode));

    Node zeroNode = IR.number(0.0);
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(zeroNode));
  }

  @Test
  public void testBooleanNode() {
    Node tNode = NodeUtil.booleanNode(true);
    assertTrue(tNode.isTrue());

    Node fNode = NodeUtil.booleanNode(false);
    assertTrue(fNode.isFalse());
  }

  @Test
  public void testGetBestLValueNullParent() {
    Node node = IR.name("a");
    assertNull(NodeUtil.getBestLValue(node));
  }
}
