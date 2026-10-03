package com.google.javascript.rhino.jstype;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.SimpleErrorReporter;
import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

public class FunctionBuilderAI144Test {

  @Test
  public void testBuildDefaultFunction() {
    JSTypeRegistry registry = new JSTypeRegistry(new SimpleErrorReporter());
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionType functionType = builder.build();
    assertNotNull(functionType);
    assertTrue(!functionType.isConstructor());
  }

  @Test
  public void testBuildConstructorFunction() {
    JSTypeRegistry registry = new JSTypeRegistry(new SimpleErrorReporter());
    FunctionBuilder builder = new FunctionBuilder(registry);
    FunctionType functionType = builder.withName("MyConstructor").forConstructor().build();
    assertNotNull(functionType);
    assertTrue(functionType.isConstructor());
  }

  @Test
  public void testBuildWithParamsNode() {
    JSTypeRegistry registry = new JSTypeRegistry(new SimpleErrorReporter());
    FunctionBuilder builder = new FunctionBuilder(registry);
    Node paramsNode = new Node(1);
    FunctionType functionType = builder.withParamsNode(paramsNode).build();
    assertNotNull(functionType);
  }
}
