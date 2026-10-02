package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.JSType;
import com.google.javascript.rhino.jstype.JSTypeRegistry;
import org.junit.Test;

public class TypeValidatorAI117Test {

  @Test
  public void testTypeMismatchEqualsAndHashCode() {
    Compiler compiler = new Compiler();
    TypeValidator validator = new TypeValidator(compiler);
    JSTypeRegistry registry = compiler.getTypeRegistry();

    JSType strType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.STRING_TYPE);
    JSType numType = registry.getNativeType(com.google.javascript.rhino.jstype.JSTypeNative.NUMBER_TYPE);

    TypeValidator.TypeMismatch mismatch1 = new TypeValidator.TypeMismatch(strType, numType, null);
    TypeValidator.TypeMismatch mismatch2 = new TypeValidator.TypeMismatch(numType, strType, null);
    TypeValidator.TypeMismatch mismatch3 = new TypeValidator.TypeMismatch(strType, strType, null);

    assertEquals(mismatch1, mismatch2);
    assertEquals(mismatch1.hashCode(), mismatch2.hashCode());
    assertEquals(false, mismatch1.equals(mismatch3));
    assertNotNull(mismatch1.toString());
  }

  @Test
  public void testGetReadableJSTypeNameQualifiedName() {
    Compiler compiler = new Compiler();
    TypeValidator validator = new TypeValidator(compiler);
    Node nameNode = Node.newString("a.b.c");
    nameNode.setQualifiedName("a.b.c");

    String typeName = validator.getReadableJSTypeName(nameNode, false);
    assertEquals("a.b.c", typeName);
  }

  @Test
  public void testAllDiagnosticsGroupPresent() {
    assertNotNull(TypeValidator.ALL_DIAGNOSTICS);
    assertNotNull(TypeValidator.TYPE_MISMATCH_WARNING);
  }
}
