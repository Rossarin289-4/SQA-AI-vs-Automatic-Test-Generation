package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class ClosureReverseAbstractInterpreterAI138Test {

  @Test
  public void testGoogIsArrayWithNullType() {
    Compiler compiler = new Compiler();
    JSTypeRegistry registry = compiler.getTypeRegistry();
    CodingConvention convention = compiler.getCodingConvention();
    ClosureReverseAbstractInterpreter interpreter =
        new ClosureReverseAbstractInterpreter(convention, registry);

    Node condition = new Node(Token.CALL,
        new Node(Token.GETPROP,
            new Node(Token.NAME, "goog"),
            new Node(Token.STRING, "isArray")),
        new Node(Token.NAME, "x"));

    FlowScope blindScope = compiler.getTopScope().createChildFlowScope();
    FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);

    assertNotNull(resultScope);
  }

  @Test
  public void testNonClosureCallCondition() {
    Compiler compiler = new Compiler();
    JSTypeRegistry registry = compiler.getTypeRegistry();
    CodingConvention convention = compiler.getCodingConvention();
    ClosureReverseAbstractInterpreter interpreter =
        new ClosureReverseAbstractInterpreter(convention, registry);

    Node condition = new Node(Token.CALL,
        new Node(Token.NAME, "notGoog"),
        new Node(Token.NAME, "x"));

    FlowScope blindScope = compiler.getTopScope().createChildFlowScope();
    FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);

    assertNull(resultScope);
  }

  @Test
  public void testGoogIsObjectWithNullType() {
    Compiler compiler = new Compiler();
    JSTypeRegistry registry = compiler.getTypeRegistry();
    CodingConvention convention = compiler.getCodingConvention();
    ClosureReverseAbstractInterpreter interpreter =
        new ClosureReverseAbstractInterpreter(convention, registry);

    Node condition = new Node(Token.CALL,
        new Node(Token.GETPROP,
            new Node(Token.NAME, "goog"),
            new Node(Token.STRING, "isObject")),
        new Node(Token.NAME, "x"));

    FlowScope blindScope = compiler.getTopScope().createChildFlowScope();
    FlowScope resultScope = interpreter.getPreciserScopeKnowingConditionOutcome(
        condition, blindScope, true);

    assertNotNull(resultScope);
  }
}
