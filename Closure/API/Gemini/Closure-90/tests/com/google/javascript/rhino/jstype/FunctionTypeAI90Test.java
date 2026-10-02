package com.google.javascript.rhino.jstype;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.javascript.rhino.Token;
import org.junit.Test;

public class FunctionTypeAI90Test {

  @Test
  public void testForInterfaceCreation() {
    JSTypeRegistry registry = new JSTypeRegistry(new SimpleErrorReporter());
    Node source = new Node(Token.FUNCTION);
    FunctionType iface = FunctionType.forInterface(registry, "MyInterface", source);

    assertTrue(iface.isInterface());
    assertTrue(iface.hasInstanceType());
    assertEquals(source, iface.getSource());
    assertNotNull(iface.getInstanceType());
  }

  @Test
  public void testHasInstanceTypeForConstructorAndOrdinary() {
    JSTypeRegistry registry = new JSTypeRegistry(new SimpleErrorReporter());
    ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
    
    FunctionType ctor = new FunctionType(
        registry, "MyCtor", null, arrowType, null, null, true, false);
    assertTrue(ctor.isConstructor());
    assertTrue(ctor.hasInstanceType());

    FunctionType ordinary = new FunctionType(
        registry, "MyFunc", null, arrowType, null, null, false, false);
    assertTrue(!ordinary.isConstructor());
    assertTrue(!ordinary.hasInstanceType());
  }

  @Test
  public void testGetTemplateTypeName() {
    JSTypeRegistry registry = new JSTypeRegistry(new SimpleErrorReporter());
    ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
    FunctionType func = new FunctionType(
        registry, "TemplatedFunc", null, arrowType, null, "T", false, false);

    assertEquals("T", func.getTemplateTypeName());
  }
}
