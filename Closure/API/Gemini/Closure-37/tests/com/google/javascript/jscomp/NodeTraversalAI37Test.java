package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class NodeTraversalAI37Test {

  @Test
  public void testEnclosingFunctionWithoutFunction() {
    Compiler compiler = new Compiler();
    Node root = new Node(com.google.javascript.rhino.Token.BLOCK);
    NodeTraversal traversal = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
      }
    });
    assertNull(traversal.getEnclosingFunction());
  }

  @Test
  public void testMakeError() {
    Compiler compiler = new Compiler();
    NodeTraversal traversal = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
      }
    });
    Node n = new Node(com.google.javascript.rhino.Token.NAME, "test");
    JSError error = traversal.makeError(n, NodeTraversal.NODE_TRAVERSAL_ERROR, "msg");
    assertNotNull(error);
    assertEquals("msg", error.description);
  }

  @Test
  public void testHasScopeInitialState() {
    Compiler compiler = new Compiler();
    NodeTraversal traversal = new NodeTraversal(compiler, new NodeTraversal.AbstractPostOrderCallback() {
      @Override
      public void visit(NodeTraversal t, Node n, Node parent) {
      }
    });
    assertEquals(false, traversal.hasScope());
  }
}
