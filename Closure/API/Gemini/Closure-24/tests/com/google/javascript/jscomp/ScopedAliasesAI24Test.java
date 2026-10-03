package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ScopedAliasesAI24Test {

  @Test
  public void testGoogScopeBasic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var goog = {}; goog.scope = function(fn) {};");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "goog.scope(function() { var dom = goog.dom; dom.createElement('DIV'); });");

    compiler.compile(externs, input, new CompilerOptions());
    ScopedAliases pass = new ScopedAliases(compiler, null, null);
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());

    String output = compiler.toSource();
    assertTrue(output.contains("goog.dom.createElement"));
  }

  @Test
  public void testGoogScopeReferencesThisError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var goog = {}; goog.scope = function(fn) {};");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "goog.scope(function() { var x = this; });");

    compiler.compile(externs, input, new CompilerOptions());
    ScopedAliases pass = new ScopedAliases(compiler, null, null);
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());

    assertEquals(1, compiler.getErrors().length);
    assertEquals(ScopedDiagnosticType.accessClass(ScopedAliases.GOOG_SCOPE_REFERENCES_THIS), 
        compiler.getErrors()[0].type);
  }

  @Test
  public void testGoogScopeUsesReturnError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var goog = {}; goog.scope = function(fn) {};");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "goog.scope(function() { return 1; });");

    compiler.compile(externs, input, new CompilerOptions());
    ScopedAliases pass = new ScopedAliases(compiler, null, null);
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());

    assertEquals(1, compiler.getErrors().length);
    assertEquals(ScopedDiagnosticType.accessClass(ScopedAliases.GOOG_SCOPE_USES_RETURN), 
        compiler.getErrors()[0].type);
  }
}
