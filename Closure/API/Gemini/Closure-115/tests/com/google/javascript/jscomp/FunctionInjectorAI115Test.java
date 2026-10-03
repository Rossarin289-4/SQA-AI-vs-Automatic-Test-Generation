package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FunctionInjectorAI115Test {

  @Test
  public void testMeetsMinimumRequirementsValid() {
    Compiler compiler = new Compiler();
    Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        return "id";
      }
    };
    FunctionInjector injector = new FunctionInjector(
        compiler, supplier, true, true, true);

    Node fnNode = new Node(Token.FUNCTION,
        new Node(Token.NAME, "f"),
        new Node(Token.LP),
        new Node(Token.BLOCK));

    assertTrue(injector.doesFunctionMeetMinimumRequirements("f", fnNode));
  }

  @Test
  public void testMeetsMinimumRequirementsArguments() {
    Compiler compiler = new Compiler();
    Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        return "id";
      }
    };
    FunctionInjector injector = new FunctionInjector(
        compiler, supplier, true, true, true);

    Node block = new Node(Token.BLOCK, new Node(Token.NAME, "arguments"));
    Node fnNode = new Node(Token.FUNCTION,
        new Node(Token.NAME, "f"),
        new Node(Token.LP),
        block);

    assertFalse(injector.doesFunctionMeetMinimumRequirements("f", fnNode));
  }

  @Test
  public void testMeetsMinimumRequirementsEval() {
    Compiler compiler = new Compiler();
    Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        return "id";
      }
    };
    FunctionInjector injector = new FunctionInjector(
        compiler, supplier, true, true, true);

    Node block = new Node(Token.BLOCK, new Node(Token.NAME, "eval"));
    Node fnNode = new Node(Token.FUNCTION,
        new Node(Token.NAME, "f"),
        new Node(Token.LP),
        block);

    assertFalse(injector.doesFunctionMeetMinimumRequirements("f", fnNode));
  }
}
