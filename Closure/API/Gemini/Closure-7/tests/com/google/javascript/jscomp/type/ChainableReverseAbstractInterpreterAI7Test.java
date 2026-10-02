package com.google.javascript.jscomp.type;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;

import com.google.javascript.jscomp.CodingConvention;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Test;

public class ChainableReverseAbstractInterpreterAI7Test {

  private static class DummyInterpreter extends ChainableReverseAbstractInterpreter {
    public DummyInterpreter(CodingConvention convention, JSTypeRegistry typeRegistry) {
      super(convention, typeRegistry);
    }

    @Override
    public FlowScope getPreciserScopeKnowingConditionOutcome(
        Node condition, FlowScope blindScope, boolean outcome) {
      return blindScope;
    }
  }

  @Test
  public void testAppendAndGetFirst() {
    CodingConvention convention = new CodingConvention.DefaultCodingConvention();
    JSTypeRegistry registry = new JSTypeRegistry(null, true);

    DummyInterpreter first = new DummyInterpreter(convention, registry);
    DummyInterpreter second = new DummyInterpreter(convention, registry);

    assertSame(first, first.getFirst());
    ChainableReverseAbstractInterpreter returned = first.append(second);
    assertSame(second, returned);
    assertSame(first, second.getFirst());
  }

  @Test
  public void testGetTypeIfRefinableNameNotInScope() {
    CodingConvention convention = new CodingConvention.DefaultCodingConvention();
    JSTypeRegistry registry = new JSTypeRegistry(null, true);
    DummyInterpreter interpreter = new DummyInterpreter(convention, registry);

    Node nameNode = Node.newString(Token.NAME, "x");
    FlowScope scope = new ScopelessFlowScope();

    assertNull(interpreter.getTypeIfRefinable(nameNode, scope));
  }

  @Test
  public void testGetRestrictedByTypeOfResultNullType() {
    CodingConvention convention = new CodingConvention.DefaultCodingConvention();
    JSTypeRegistry registry = new JSTypeRegistry(null, true);
    DummyInterpreter interpreter = new DummyInterpreter(convention, registry);

    JSType result = interpreter.getRestrictedByTypeOfResult(null, "number", true);
    assertNotNull(result);
  }
}
