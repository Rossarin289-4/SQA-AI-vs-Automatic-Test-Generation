package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Test;

public class NodeUtilAI86Test {

  @Test
  public void testGetBooleanValue() {
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newString("hello")));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newString("")));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(Node.newNumber(5.0)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(Node.newNumber(0.0)));
    assertEquals(TernaryValue.FALSE, NodeUtil.getBooleanValue(new Node(Token.NULL)));
    assertEquals(TernaryValue.TRUE, NodeUtil.getBooleanValue(new Node(Token.TRUE)));
  }

  @Test
  public void testGetStringValue() {
    assertEquals("hello", NodeUtil.getStringValue(Node.newString("hello")));
    assertEquals("1", NodeUtil.getStringValue(Node.newNumber(1.0)));
    assertEquals("null", NodeUtil.getStringValue(new Node(Token.NULL)));
    assertEquals("undefined", NodeUtil.getStringValue(new Node(Token.VOID)));
  }

  @Test
  public void testNewCallNode() {
    Node target = Node.newString("f");
    Node arg = Node.newNumber(1.0);
    Node call = NodeUtil.newCallNode(target, arg);

    assertNotNull(call);
    assertEquals(Token.CALL, call.getType());
    assertEquals(target, call.getFirstChild());
    assertEquals(arg, call.getLastChild());
  }
}
