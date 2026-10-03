package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

public class FunctionToBlockMutatorAI72Test {

  @Test
  public void testMutateBasicFunction() {
    Compiler compiler = new Compiler();
    Supplier<String> supplier = new Supplier<String>() {
      int id = 0;
      @Override
      public String get() {
        return String.valueOf(++id);
      }
    };

    FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, supplier);

    Node fnNode = new Node(Token.FUNCTION,
        Node.newString(Token.NAME, "f"),
        new Node(Token.PARAM_LIST),
        new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1))));
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "f"));

    Node result = mutator.mutate("f", fnNode, callNode, "res", true, false);
    assertNotNull(result);
  }

  @Test
  public void testMutateLoopFunction() {
    Compiler compiler = new Compiler();
    Supplier<String> supplier = new Supplier<String>() {
      int id = 0;
      @Override
      public String get() {
        return String.valueOf(++id);
      }
    };

    FunctionToBlockMutator mutator = new FunctionToBlockMutator(compiler, supplier);

    Node fnNode = new Node(Token.FUNCTION,
        Node.newString(Token.NAME, "g"),
        new Node(Token.PARAM_LIST),
        new Node(Token.BLOCK, new Node(Token.VAR, Node.newString(Token.NAME, "x"))));
    Node callNode = new Node(Token.CALL, Node.newString(Token.NAME, "g"));

    Node result = mutator.mutate("g", fnNode, callNode, null, false, true);
    assertNotNull(result);
  }
}
