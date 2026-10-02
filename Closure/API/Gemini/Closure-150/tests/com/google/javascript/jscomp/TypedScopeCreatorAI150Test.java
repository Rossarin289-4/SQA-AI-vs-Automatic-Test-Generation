package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class TypedScopeCreatorAI150Test {

  @Test
  public void testTypedScopeCreatorCreation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    assertNotNull(scopeCreator);
  }

  @Test
  public void testCreateGlobalScope() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 10;");
    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    Node root = compiler.getRoot();
    TypedScopeCreator scopeCreator = new TypedScopeCreator(compiler);
    Scope scope = scopeCreator.createScope(root, null);
    assertNotNull(scope);
  }
}
