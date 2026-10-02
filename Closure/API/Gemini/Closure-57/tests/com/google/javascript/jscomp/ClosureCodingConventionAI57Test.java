package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

public class ClosureCodingConventionAI57Test {

  @Test
  public void testIsSuperClassReference() {
    ClosureCodingConvention convention = new ClosureCodingConvention();
    assertEquals(true, convention.isSuperClassReference("superClass_"));
    assertEquals(false, convention.isSuperClassReference("constructor"));
  }

  @Test
  public void testGetSingletonGetterClassName() {
    ClosureCodingConvention convention = new ClosureCodingConvention();
    Node callNode = new Node(Token.CALL,
        Node.newString(Token.NAME, "goog.addSingletonGetter"),
        Node.newString(Token.NAME, "MyClass"));
    String className = convention.getSingletonGetterClassName(callNode);
    assertEquals("MyClass", className);
  }

  @Test
  public void testDescribeFunctionBind() {
    ClosureCodingConvention convention = new ClosureCodingConvention();
    Node callNode = new Node(Token.CALL,
        Node.newString(Token.NAME, "goog.bind"),
        Node.newString(Token.NAME, "myFunc"));
    CodingConvention.Bind bind = convention.describeFunctionBind(callNode);
    assertNotNull(bind);
  }
}
