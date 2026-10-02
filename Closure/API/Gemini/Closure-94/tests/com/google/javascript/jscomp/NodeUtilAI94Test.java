package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;

public class NodeUtilAI94Test {

  @Test
  public void testGetBooleanValueLiterals() {
    Node trueNode = new Node(Token.TRUE);
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(trueNode));

    Node falseNode = new Node(Token.FALSE);
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(falseNode));

    Node stringNode = Node.newString("hello");
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(stringNode));

    Node emptyStringNode = Node.newString("");
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(emptyStringNode));

    Node numberNode = Node.newNumber(5.0);
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(numberNode));

    Node zeroNumberNode = Node.newNumber(0.0);
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(zeroNumberNode));
  }

  @Test
  public void testGetStringValue() {
    Node stringNode = Node.newString("test");
    assertEquals("test", NodeUtil.getStringValue(stringNode));

    Node numberNode = Node.newNumber(42.0);
    assertEquals("42", NodeUtil.getStringValue(numberNode));

    Node trueNode = new Node(Token.TRUE);
    assertEquals("true", NodeUtil.getStringValue(trueNode));

    Node nullNode = new Node(Token.NULL);
    assertEquals("null", NodeUtil.getStringValue(nullNode));
  }

  @Test
  public void testNewCallNode() {
    Node target = Node.newString("myFunc");
    Node arg = Node.newNumber(1.0);
    Node callNode = Node.newCallNode(target, arg);

    assertEquals(Token.CALL, callNode.getType());
    assertEquals(target, callNode.getFirstChild());
    assertEquals(arg, callNode.getLastChild());
    assertTrue(callNode.getBooleanProp(Node.FREE_CALL));
  }
}
