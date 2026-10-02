package com.google.javascript.jscomp;

import com.google.common.base.Supplier;
import com.google.common.collect.Sets;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Assert;
import org.junit.Test;

public class FunctionInjectorAI175Test {

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

    Node fnNode = new Node(Token.FUNCTION,
        new Node(Token.NAME, "f"),
        new Node(Token.PARAM_LIST),
        new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.NUMBER, "1"))));

    boolean result = injector.doesFunctionMeetMinimumRequirements("f", fnNode);
    Assert.assertTrue(result);
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

    Node fnNode = new Node(Token.FUNCTION,
        new Node(Token.NAME, "f"),
        new Node(Token.PARAM_LIST),
        new Node(Token.BLOCK, new Node(Token.RETURN, new Node(Token.NAME, "arguments"))));

    boolean result = injector.doesFunctionMeetMinimumRequirements("f", fnNode);
    Assert.assertFalse(result);
  }

  @Test
  public void testSetKnownConstantsTwiceThrowsState() {
    Compiler compiler = new Compiler();
    Supplier<String> supplier = new Supplier<String>() {
      @Override
      public String get() {
        return "id";
      }
    };
    FunctionInjector injector = new FunctionInjector(
        compiler, supplier, true, true, true);

    injector.setKnownConstants(Sets.newHashSet("A"));
    try {
      injector.setKnownConstants(Sets.newHashSet("B"));
      Assert.fail("Expected IllegalStateException");
    } catch (IllegalStateException e) {
      // Expected
    }
  }
}
