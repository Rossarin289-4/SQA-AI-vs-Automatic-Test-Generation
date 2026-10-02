package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class TypedScopeCreatorAI17Test {

  @Test
  public void testGlobalScopeCreation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    assertNotNull(compiler.getRoot());
  }

  @Test
  public void testTypedScopeCreatorWithEmptySource() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "");
    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    assertNotNull(compiler.getTypeRegistry());
  }

  @Test
  public void testFunctionScopeCreation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(a) { var b = a; return b; }");
    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    assertNotNull(compiler.getInput(input.getInputId()));
  }
}
