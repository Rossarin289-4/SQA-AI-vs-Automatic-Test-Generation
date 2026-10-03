package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Test;

public class NodeUtilAI61Test {

  @Test
  public void testGetImpureBooleanValue() {
    Node trueNode = new Node(Token.TRUE);
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(trueNode));

    Node notNode = new Node(Token.NOT, new Node(Token.FALSE));
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(notNode));

    Node stringNode = Node.newString("hello");
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(stringNode));
  }

  @Test
  public void testGetSourceName() {
    Node node = new Node(Token.NAME, "testName");
    assertNull(NodeUtil.getSourceName(node));

    node.putProp(Node.SOURCENAME_PROP, "file.js");
    assertEquals("file.js", NodeUtil.getSourceName(node));
  }

  @Test
  public void testNewCallNode() {
    Node target = new Node(Token.NAME, "foo");
    Node arg = Node.newNumber(1.0);
    Node callNode = NodeUtil.newCallNode(target, arg);

    assertNotNull(callNode);
    assertEquals(Token.CALL, callNode.getType());
    assertEquals(target, callNode.getFirstChild());
    assertEquals(arg, callNode.getLastChild());
  }
}
