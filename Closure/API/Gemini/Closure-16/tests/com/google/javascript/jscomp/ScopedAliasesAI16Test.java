package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class ScopedAliasesAI16Test {

  @Test
  public void testGoogScopeBasicAlias() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "goog.scope(function() {\n" +
        "  var dom = goog.dom;\n" +
        "  dom.createElement('DIV');\n" +
        "});\n");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    Node root = compiler.getRoot();

    ScopedAliases pass = new ScopedAliases(compiler, null, null);
    pass.process(externs, root);

    String output = compiler.toSource();
    assertTrue(output.contains("goog.dom.createElement(\"DIV\")"));
  }

  @Test
  public void testGoogScopeReferencesThisError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "goog.scope(function() {\n" +
        "  this.x = 1;\n" +
        "});\n");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    Node root = compiler.getRoot();

    ScopedAliases pass = new ScopedAliases(compiler, null, null);
    pass.process(externs, root);

    assertTrue(compiler.getErrorCount() > 0);
  }

  @Test
  public void testGoogScopeUsesReturnError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "goog.scope(function() {\n" +
        "  return 1;\n" +
        "});\n");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    Node root = compiler.getRoot();

    ScopedAliases pass = new ScopedAliases(compiler, null, null);
    pass.process(externs, root);

    assertTrue(compiler.getErrorCount() > 0);
  }
}
