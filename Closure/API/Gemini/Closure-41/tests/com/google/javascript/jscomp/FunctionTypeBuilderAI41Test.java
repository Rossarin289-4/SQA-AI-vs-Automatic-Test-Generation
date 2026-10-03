package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FunctionTypeBuilderAI41Test {

  @Test
  public void testIsFunctionTypeDeclarationWithEmptyInfo() {
    com.google.javascript.rhino.JSDocInfo info = new com.google.javascript.rhino.JSDocInfo();
    boolean result = FunctionTypeBuilder.isFunctionTypeDeclaration(info);
    assertTrue(!result);
  }

  @Test
  public void testIsFunctionTypeDeclarationWithConstructor() {
    com.google.javascript.rhino.JSDocInfo info = new com.google.javascript.rhino.JSDocInfo();
    info.setAssociatedWithNode(new com.google.javascript.rhino.Node(com.google.javascript.rhino.Token.FUNCTION));
    info.setIsConstructor();
    boolean result = FunctionTypeBuilder.isFunctionTypeDeclaration(info);
    assertTrue(result);
  }

  @Test
  public void testBuilderCreationAndValidation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f() {}");
    compiler.compile(externs, input);

    Scope scope = compiler.getTopScope();
    Node errorRoot = new Node(com.google.javascript.rhino.Token.EMPTY);
    
    FunctionTypeBuilder builder = new FunctionTypeBuilder(
        "f", compiler, compiler.getCodingConvention(), compiler.getTypeRegistry(), errorRoot, "input.js", scope);
    
    assertNotNull(builder);
  }
}
