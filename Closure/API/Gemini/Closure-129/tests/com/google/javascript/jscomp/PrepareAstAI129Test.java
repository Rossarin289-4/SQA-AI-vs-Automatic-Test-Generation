package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class PrepareAstAI129Test {

  @Test
  public void testFreeCallAnnotation() {
    Compiler compiler = new Compiler();
    PrepareAst prepareAst = new PrepareAst(compiler, false);

    Node externs = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node root = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node callNode = new Node(com.google.javascript.rhino.Token.CALL, Node.newString("foo"));
    root.addChildToBack(callNode);

    prepareAst.process(externs, root);

    assertTrue(callNode.getBooleanProp(Node.FREE_CALL));
  }

  @Test
  public void testDirectEvalAnnotation() {
    Compiler compiler = new Compiler();
    PrepareAst prepareAst = new PrepareAst(compiler, false);

    Node externs = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node root = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node callNode = new Node(com.google.javascript.rhino.Token.CALL, Node.newString("eval"));
    root.addChildToBack(callNode);

    prepareAst.process(externs, root);

    assertTrue(callNode.getFirstChild().getBooleanProp(Node.DIRECT_EVAL));
  }

  @Test
  public void testNormalizeBlocks() {
    Compiler compiler = new Compiler();
    PrepareAst prepareAst = new PrepareAst(compiler, true);

    Node externs = new Node(com.google.javascript.rhino.Token.BLOCK);
    Node ifNode = new Node(com.google.javascript.rhino.Token.IF, Node.newString("cond"), Node.newString("body"));
    Node root = new Node(com.google.javascript.rhino.Token.BLOCK, ifNode);

    prepareAst.process(externs, root);

    assertTrue(ifNode.getLastChild().isBlock());
  }
}
