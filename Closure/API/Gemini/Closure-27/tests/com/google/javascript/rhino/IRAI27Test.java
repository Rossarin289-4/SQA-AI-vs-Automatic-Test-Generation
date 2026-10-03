package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;

public class IRAI27Test {

  @Test
  public void testBasicNodes() {
    Node emptyNode = IR.empty();
    assertNotNull(emptyNode);
    assertEquals(Token.EMPTY, emptyNode.getType());

    Node trueNode = IR.trueNode();
    assertNotNull(trueNode);
    assertEquals(Token.TRUE, trueNode.getType());

    Node numNode = IR.number(42.0);
    assertNotNull(numNode);
    assertEquals(Token.NUMBER, numNode.getType());
    assertEquals(42.0, numNode.getDouble(), 0.001);
  }

  @Test
  public void testBinaryAndUnaryOps() {
    Node str1 = IR.string("a");
    Node str2 = IR.string("b");
    Node addNode = IR.add(str1, str2);
    assertNotNull(addNode);
    assertEquals(Token.ADD, addNode.getType());

    Node negNode = IR.neg(IR.number(5.0));
    assertNotNull(negNode);
    assertEquals(Token.NEG, negNode.getType());
  }

  @Test
  public void testBlockAndScript() {
    Node stmt = IR.returnNode();
    Node blockNode = IR.block(stmt);
    assertNotNull(blockNode);
    assertEquals(Token.BLOCK, blockNode.getType());
    assertTrue(blockNode.hasChildren());

    Node scriptNode = IR.script(IR.empty());
    assertNotNull(scriptNode);
    assertEquals(Token.SCRIPT, scriptNode.getType());
  }
}
