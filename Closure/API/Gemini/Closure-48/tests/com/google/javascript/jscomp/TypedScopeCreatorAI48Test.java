package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class TypedScopeCreatorAI48Test {

  @Test
  public void testTypedScopeCreatorBasic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");
    compiler.compile(externs, input);
    assertFalse(compiler.hasErrors());
  }

  @Test
  public void testTypedScopeCreatorWithFunction() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function f(a) { return a; }");
    compiler.compile(externs, input);
    assertFalse(compiler.hasErrors());
  }

  @Test
  public void testTypedScopeCreatorWithTypedef() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "/** @typedef {number} */ var MyNum;");
    compiler.compile(externs, input);
    assertFalse(compiler.hasErrors());
  }
}
