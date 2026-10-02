package com.google.javascript.jscomp.type;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.SimpleCodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.testing.TestErrorReporter;
import org.junit.Before;
import org.junit.Test;

public class ClosureReverseAbstractInterpreterAI111Test {

  private JSTypeRegistry typeRegistry;
  private CodingConvention convention;
  private ClosureReverseAbstractInterpreter interpreter;

  @Before
  public void setUp() {
    typeRegistry = new JSTypeRegistry(TestErrorReporter.signallable);
    convention = new SimpleCodingConvention();
    interpreter = new ClosureReverseAbstractInterpreter(convention, typeRegistry);
  }

  @Test
  public void testNonCallCondition() {
    Node condition = new Node(Token.TRUE);
    FlowScope blindScope = FlowScope.createEntry();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(result);
  }

  @Test
  public void testNullConditionChildCount() {
    Node condition = new Node(Token.CALL);
    FlowScope blindScope = FlowScope.createEntry();
    FlowScope result = interpreter.getPreciserScopeKnowingConditionOutcome(condition, blindScope, true);
    assertNotNull(result);
  }
}
