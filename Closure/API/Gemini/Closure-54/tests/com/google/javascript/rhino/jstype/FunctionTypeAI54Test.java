package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import org.junit.Test;

public class FunctionTypeAI54Test {

  @Test
  public void testGetTypeOfThisNoObjectTypeCoercion() {
    JSTypeRegistry registry = new JSTypeRegistry(new SimpleErrorReporter());
    ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
    FunctionType fnType = new FunctionType(
        registry, "TestFunc", null, arrowType,
        registry.getNativeObjectType(JSTypeNative.NO_OBJECT_TYPE),
        null, false, false);
    
    assertEquals(registry.getNativeObjectType(OBJECT_TYPE), fnType.getTypeOfThis());
  }

  @Test
  public void testHasInstanceTypeForConstructorAndInterface() {
    JSTypeRegistry registry = new JSTypeRegistry(new SimpleErrorReporter());
    ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
    FunctionType ctorType = new FunctionType(
        registry, "Ctor", null, arrowType, null, null, true, false);
    
    assertTrue(ctorType.hasInstanceType());
    assertNotNull(ctorType.getInstanceType());
  }

  @Test
  public void testGetSourceAndSetSource() {
    JSTypeRegistry registry = new JSTypeRegistry(new SimpleErrorReporter());
    ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
    FunctionType fnType = new FunctionType(
        registry, "SourceFunc", null, arrowType, null, null, false, false);
    
    Node sourceNode = new Node(Token.FUNCTION);
    fnType.setSource(sourceNode);
    assertEquals(sourceNode, fnType.getSource());
  }
}
