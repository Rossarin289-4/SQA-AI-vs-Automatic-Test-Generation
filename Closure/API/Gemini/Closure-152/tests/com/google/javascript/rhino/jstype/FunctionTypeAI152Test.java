package com.google.javascript.rhino.jstype;

import org.junit.Test;
import static org.junit.Assert.*;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;

public class FunctionTypeAI152Test {

  @Test
  public void testForInterfaceCreation() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    Node source = new Node(Token.FUNCTION);
    FunctionType interfaceType = FunctionType.forInterface(registry, "MyInterface", source);
    
    assertTrue(interfaceType.isInterface());
    assertFalse(interfaceType.isConstructor());
    assertTrue(interfaceType.hasInstanceType());
    assertEquals("MyInterface", interfaceType.getReferenceName());
    assertEquals(source, interfaceType.getSource());
  }

  @Test
  public void testHasCachedValuesInitialState() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
    FunctionType fnType = new FunctionType(registry, "MyFunc", null, arrowType, null, null, false, false);
    
    assertFalse(fnType.hasCachedValues());
  }

  @Test
  public void testGetTemplateTypeName() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    ArrowType arrowType = new ArrowType(registry, new Node(Token.LP), null);
    FunctionType fnType = new FunctionType(registry, "MyFunc", null, arrowType, null, "T", false, false);
    
    assertEquals("T", fnType.getTemplateTypeName());
  }
}
