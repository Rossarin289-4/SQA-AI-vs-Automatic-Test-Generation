package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class NodeUtilAI75Test {

  @Test
  public void testGetPureBooleanValueLiterals() {
    Node trueNode = new Node(Token.TRUE);
    Node falseNode = new Node(Token.FALSE);
    Node stringNode = Node.newString("hello");
    Node emptyStringNode = Node.newString("");
    Node numberNode = Node.newNumber(5.0);
    Node zeroNumberNode = Node.newNumber(0.0);

    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(trueNode));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(falseNode));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(stringNode));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(emptyStringNode));
    assertEquals(TernaryValue.TRUE, NodeUtil.getPureBooleanValue(numberNode));
    assertEquals(TernaryValue.FALSE, NodeUtil.getPureBooleanValue(zeroNumberNode));
  }

  @Test
  public void testGetStringValueNamesAndNumbers() {
    Node stringNode = Node.newString("test");
    assertEquals("test", NodeUtil.getStringValue(stringNode));

    Node undefinedName = Node.newString(Token.NAME, "undefined");
    assertEquals("undefined", NodeUtil.getStringValue(undefinedName));

    Node numberNode = Node.newNumber(42.0);
    assertEquals("42", NodeUtil.getStringValue(numberNode));
  }

  @Test
  public void testGetSourceName() {
    Node node = new Node(Token.NAME, "foo");
    assertNull(NodeUtil.getSourceName(node));

    node.putProp(Node.SOURCENAME_PROP, "file.js");
    assertEquals("file.js", NodeUtil.getSourceName(node));
  }
}
