package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FunctionInjectorAI116Test {

  @Test
  public void testDoesFunctionMeetMinimumRequirementsValid() {
    Compiler compiler = new Compiler();
    Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        return "id";
      }
    };
    FunctionInjector injector = new FunctionInjector(
        compiler, supplier, true, true, true);

    Node block = new Node(Token.BLOCK, new Node(Token.RETURN, Node.newNumber(1)));
    Node fnNode = new Node(Token.FUNCTION, new Node(Token.NAME, "f"), new Node(Token.PARAM_LIST), block);

    assertTrue(injector.doesFunctionMeetMinimumRequirements("f", fnNode));
  }

  @Test
  public void testDoesFunctionMeetMinimumRequirementsArguments() {
    Compiler compiler = new Compiler();
    Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        return "id";
      }
    };
    FunctionInjector injector = new FunctionInjector(
        compiler, supplier, true, true, true);

    Node block = new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.NAME, "arguments")));
    Node fnNode = new Node(Token.FUNCTION, new Node(Token.NAME, "f"), new Node(Token.PARAM_LIST), block);

    assertFalse(injector.doesFunctionMeetMinimumRequirements("f", fnNode));
  }

  @Test
  public void testSetKnownConstantsTwice() {
    Compiler compiler = new Compiler();
    Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        return "id";
      }
    };
    FunctionInjector injector = new FunctionInjector(
        compiler, supplier, true, true, true);

    injector.setKnownConstants(java.util.Collections.<String>emptySet());
    boolean thrown = false;
    try {
      injector.setKnownConstants(java.util.Collections.<String>emptySet());
    } catch (IllegalStateException e) {
      thrown = true;
    }
    assertTrue(thrown);
  }
}
