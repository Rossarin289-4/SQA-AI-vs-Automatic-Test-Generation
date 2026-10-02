package com.google.javascript.jscomp.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.jscomp.SimpleCodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import com.google.javascript.rhino.testing.TestErrorReporter;
import org.junit.Before;
import org.junit.Test;

public class ChainableReverseAbstractInterpreterAI19Test {

  private JSTypeRegistry registry;
  private CodingConvention convention;
  private ChainableReverseAbstractInterpreter interpreter;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(TestErrorReporter.noWarnings);
    convention = new SimpleCodingConvention();
    interpreter = new ChainableReverseAbstractInterpreter(convention, registry) {
      @Override
      public FlowScope getPreciserScopeKnowingConditionOutcome(
          Node condition, FlowScope blindScope, boolean outcome) {
        return blindScope;
      }
    };
  }

  @Test
  public void testChainAppendAndGetFirst() {
    ChainableReverseAbstractInterpreter second = new ChainableReverseAbstractInterpreter(convention, registry) {
      @Override
      public FlowScope getPreciserScopeKnowingConditionOutcome(
          Node condition, FlowScope blindScope, boolean outcome) {
        return blindScope;
      }
    };

    assertSame(interpreter, interpreter.getFirst());
    ChainableReverseAbstractInterpreter appended = interpreter.append(second);
    assertSame(second, appended);
    assertSame(interpreter, second.getFirst());
  }

  @Test
  public void testGetTypeIfRefinableNonRefinableNode() {
    Node node = new Node(Token.NUMBER, 1.0);
    assertNull(interpreter.getTypeIfRefinable(node, null));
  }

  @Test
  public void testGetRestrictedByTypeOfResultNullType() {
    JSType result = interpreter.getRestrictedByTypeOfResult(null, "number", true);
    assertNotNull(result);
    assertEquals(registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE), result);
  }
}
