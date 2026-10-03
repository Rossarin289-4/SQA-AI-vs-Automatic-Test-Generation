package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;
import static org.junit.Assert.*;

public class NodeUtilAI137Test {

  @Test
  public void testGetBooleanValue() {
    Node trueNode = Node.newString(Token.TRUE, "true");
    assertTrue(NodeUtil.getBooleanValue(trueNode));

    Node falseNode = Node.newString(Token.FALSE, "false");
    assertFalse(NodeUtil.getBooleanValue(falseNode));

    Node numZero = Node.newNumber(0.0);
    assertFalse(NodeUtil.getBooleanValue(numZero));

    Node numNonZero = Node.newNumber(5.0);
    assertTrue(NodeUtil.getBooleanValue(numNonZero));
  }

  @Test
  public void testGetStringValue() {
    Node strNode = Node.newString("hello");
    assertEquals("hello", NodeUtil.getStringValue(strNode));

    Node numNode = Node.newNumber(1.0);
    assertEquals("1", NodeUtil.getStringValue(numNode));

    Node trueNode = Node.newString(Token.TRUE, "true");
    assertEquals("true", NodeUtil.getStringValue(trueNode));
  }

  @Test
  public void testHasFinally() {
    Node tryNode = new Node(Token.TRY);
    tryNode.addChildToBack(new Node(Token.BLOCK));
    tryNode.addChildToBack(new Node(Token.BLOCK));
    tryNode.addChildToBack(new Node(Token.BLOCK));

    assertTrue(NodeUtil.hasFinally(tryNode));

    Node tryNodeNoFinally = new Node(Token.TRY);
    tryNodeNoFinally.addChildToBack(new Node(Token.BLOCK));
    tryNodeNoFinally.addChildToBack(new Node(Token.BLOCK));

    assertFalse(NodeUtil.hasFinally(tryNodeNoFinally));
  }
}
