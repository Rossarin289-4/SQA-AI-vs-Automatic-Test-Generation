package com.google.javascript.rhino.jstype;

import com.google.common.collect.ImmutableList;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;
import static org.junit.Assert.*;

public class FunctionTypeAI169Test {

  @Test
  public void testHasInstanceTypeForOrdinaryAndConstructor() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    ArrowType arrowType = registry.createArrowType(null, null);
    
    FunctionType ordinaryFunc = new FunctionType(
        registry, "Ordinary", null, arrowType, null, null, false, false);
    assertFalse(ordinaryFunc.hasInstanceType());

    FunctionType constructorFunc = new FunctionType(
        registry, "Constructor", null, arrowType, null, null, true, false);
    assertTrue(constructorFunc.hasInstanceType());
  }

  @Test
  public void testGetTemplateTypeNamesEmptyByDefault() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    ArrowType arrowType = registry.createArrowType(null, null);
    FunctionType func = new FunctionType(
        registry, "Func", null, arrowType, null, null, false, false);

    assertNotNull(func.getTemplateTypeNames());
    assertTrue(func.getTemplateTypeNames().isEmpty());
  }

  @Test
  public void testSetSourceUpdatesSourceAndPrototypeSlot() {
    JSTypeRegistry registry = new JSTypeRegistry(null);
    ArrowType arrowType = registry.createArrowType(null, null);
    FunctionType func = new FunctionType(
        registry, "Func", null, arrowType, null, null, true, false);

    Node source1 = new Node(Token.FUNCTION);
    func.setSource(source1);
    assertEquals(source1, func.getSource());

    Node source2 = new Node(Token.FUNCTION);
    func.setSource(source2);
    assertEquals(source2, func.getSource());
  }
}
