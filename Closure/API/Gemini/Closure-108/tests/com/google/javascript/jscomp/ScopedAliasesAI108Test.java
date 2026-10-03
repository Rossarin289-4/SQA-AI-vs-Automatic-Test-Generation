package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ScopedAliasesAI108Test {

  @Test
  public void testGoogScopeBasicAliasing() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var goog = {};");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "goog.scope(function() {" +
        "  var dom = goog.dom;" +
        "  dom.createElement('DIV');" +
        "});");

    Result result = compiler.compile(externs, input, new CompilerOptions());
    assertEquals(0, result.errors.length);
  }

  @Test
  public void testGoogScopeReferencesThisError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var goog = {};");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "goog.scope(function() {" +
        "  this.x = 1;" +
        "});");

    Result result = compiler.compile(externs, input, new CompilerOptions());
    assertEquals(1, result.errors.length);
    assertEquals("JSC_GOOG_SCOPE_REFERENCES_THIS", result.errors[0].type.name);
  }

  @Test
  public void testGoogScopeUsesReturnError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var goog = {};");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "goog.scope(function() {" +
        "  return 1;" +
        "});");

    Result result = compiler.compile(externs, input, new CompilerOptions());
    assertEquals(1, result.errors.length);
    assertEquals("JSC_GOOG_SCOPE_USES_RETURN", result.errors[0].type.name);
  }
}
