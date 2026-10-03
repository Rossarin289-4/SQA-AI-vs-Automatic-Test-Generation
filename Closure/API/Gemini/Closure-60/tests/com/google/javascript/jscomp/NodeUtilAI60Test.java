package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.TernaryValue;
import org.junit.Test;

public class NodeUtilAI60Test {

  @Test
  public void testGetImpureBooleanValue() {
    Node trueNode = Node.newString("hello");
    assertEquals(TernaryValue.TRUE, NodeUtil.getImpureBooleanValue(trueNode));

    Node voidNode = new Node(Token.VOID, Node.newNumber(0));
    assertEquals(TernaryValue.FALSE, NodeUtil.getImpureBooleanValue(voidNode));
  }

  @Test
  public void testGetStringValue() {
    Node stringNode = Node.newString("testString");
    assertEquals("testString", NodeUtil.getStringValue(stringNode));

    Node nameNode = Node.newString(Token.NAME, "undefined");
    assertEquals("undefined", NodeUtil.getStringValue(nameNode));

    Node numberNode = Node.newNumber(123.0);
    assertNull(NodeUtil.getStringValue(numberNode));
  }

  @Test
  public void testGetSourceName() {
    Node node = Node.newNumber(1);
    node.setSourceFile("my_test_file.js");
    assertEquals("my_test_file.js", NodeUtil.getSourceName(node));
  }
}
