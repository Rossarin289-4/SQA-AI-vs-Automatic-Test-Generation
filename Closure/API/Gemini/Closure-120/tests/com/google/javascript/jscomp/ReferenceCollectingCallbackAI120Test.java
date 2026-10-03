package com.google.javascript.jscomp;

import com.google.javascript.jscomp.Scope.Var;
import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ReferenceCollectingCallbackAI120Test {

  @Test
  public void testBasicBlockProvablyExecutesBefore() {
    Compiler compiler = new Compiler();
    Node root = new Node(Token.BLOCK);
    ReferenceCollectingCallback.BasicBlock block1 =
        new ReferenceCollectingCallback.BasicBlock(null, root);
    ReferenceCollectingCallback.BasicBlock block2 =
        new ReferenceCollectingCallback.BasicBlock(block1, root);

    org.junit.Assert.assertTrue(block1.provablyExecutesBefore(block2));
  }

  @Test
  public void testCreateRefForTest() {
    Compiler compiler = new Compiler();
    CompilerInput input = new CompilerInput(SourceFile.fromCode("test.js", "var x;"));
    ReferenceCollectingCallback.Reference ref =
        ReferenceCollectingCallback.Reference.createRefForTest(input);
    assertNotNull(ref);
  }

  @Test
  public void testGetAllSymbolsEmpty() {
    Compiler compiler = new Compiler();
    ReferenceCollectingCallback.Behavior behavior =
        new ReferenceCollectingCallback.Behavior() {
          @Override
          public void afterExitScope(NodeTraversal t, ReferenceMap referenceMap) {
          }
        };
    ReferenceCollectingCallback callback =
        new ReferenceCollectingCallback(compiler, behavior);
    Iterable<Var> symbols = callback.getAllSymbols();
    assertNotNull(symbols);
  }
}
