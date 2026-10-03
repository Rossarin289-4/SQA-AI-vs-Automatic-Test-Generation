package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class FunctionTypeAI144Test {

  private JSTypeRegistry registry;

  @Before
  public void setUp() {
    registry = new JSTypeRegistry(new SimpleErrorReporter());
  }

  @Test
  public void testForInterfaceCreation() {
    Node sourceNode = new Node(Token.FUNCTION);
    FunctionType interfaceType = FunctionType.forInterface(registry, "MyInterface", sourceNode);

    assertTrue(interfaceType.isInterface());
    assertFalse(interfaceType.isConstructor());
    assertTrue(interfaceType.hasInstanceType());
    assertEquals(sourceNode, interfaceType.getSource());
  }

  @Test
  public void testIsSubtypeWithInterface() {
    FunctionType interfaceType = FunctionType.forInterface(registry, "AnInterface", null);
    FunctionType ordinaryFn = new FunctionType(
        registry, "OrdinaryFn", null,
        new ArrowType(registry, new Node(Token.LP), null),
        null, null, false, false
    );

    assertTrue(ordinaryFn.isSubtype(interfaceType));
    assertFalse(interfaceType.isSubtype(ordinaryFn));
  }

  @Test
  public void testHasCachedValuesAndTemplateTypeName() {
    ArrowType arrow = new ArrowType(registry, new Node(Token.LP), null);
    FunctionType fn = new FunctionType(
        registry, "TemplatedFn", null,
        arrow, null, "T", false, false
    );

    assertEquals("T", fn.getTemplateTypeName());
    assertFalse(fn.hasCachedValues());
  }
}
