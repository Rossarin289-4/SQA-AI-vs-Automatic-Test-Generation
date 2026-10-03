package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;

public class NodeAI110Test {

  @Test
  public void testDefaultQuotedStringBehavior() {
    Node node = new Node(Token.STRING);
    assertFalse(node.isQuotedString());
  }

  @Test(expected = IllegalStateException.class)
  public void testSetQuotedStringThrowsExceptionByDefault() {
    Node node = new Node(Token.STRING);
    node.setQuotedString();
  }

  @Test
  public void testNodeMismatchEqualsAndHashCode() {
    Node nodeA = new Node(Token.NAME);
    Node nodeB = new Node(Token.NUMBER);
    Node.NodeMismatch mismatch1 = new Node.NodeMismatch(nodeA, nodeB);
    Node.NodeMismatch mismatch2 = new Node.NodeMismatch(nodeA, nodeB);
    Node.NodeMismatch mismatch3 = new Node.NodeMismatch(nodeB, nodeA);

    assertEquals(mismatch1, mismatch2);
    assertEquals(mismatch1.hashCode(), mismatch2.hashCode());
    assertNotEquals(mismatch1, mismatch3);
    assertNotEquals(mismatch1, "some string");
  }
}
