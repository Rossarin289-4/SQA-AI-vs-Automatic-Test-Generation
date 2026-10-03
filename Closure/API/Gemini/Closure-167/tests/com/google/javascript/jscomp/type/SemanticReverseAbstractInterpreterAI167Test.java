package com.google.javascript.jscomp.type;

import static org.junit.Assert.assertNotNull;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.SimpleCodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.testing.TestErrorReporter;
import org.junit.Before;
import org.junit.Test;

public class SemanticReverseAbstractInterpreterAI167Test {

  private JSTypeRegistry typeRegistry;
  private CodingConvention convention;
  private SemanticReverseAbstractInterpreter interpreter;
  private FlowScope blindScope;

  @Before
  public void setUp() {
    typeRegistry = new JSTypeRegistry(TestErrorReporter.logger);
    convention = new SimpleCodingConvention();
    interpreter = new SemanticReverseAbstractInterpreter(convention, typeRegistry);
    blindScope = new ScopeFlowScope(null);
  }

  @Test
  public void testNullCondition() {
    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(null, blindScope, true);
    assertNotNull(scope);
  }

  @Test
  public void testSimpleTypeofCondition() {
    Node typeofNode = new Node(com.google.javascript.rhino.Token.TYPEOF, Node.newString("x"));
    Node stringNode = Node.newString("string");
    Node eqNode = new Node(com.google.javascript.rhino.Token.EQ, typeofNode, stringNode);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(eqNode, blindScope, true);
    assertNotNull(scope);
  }

  @Test
  public void testInstanceOfCondition() {
    Node nameNode = Node.newString("x");
    Node rightNode = Node.newString("Object");
    Node instanceofNode = new Node(com.google.javascript.rhino.Token.INSTANCEOF, nameNode, rightNode);

    FlowScope scope = interpreter.getPreciserScopeKnowingConditionOutcome(instanceofNode, blindScope, true);
    assertNotNull(scope);
  }
}
