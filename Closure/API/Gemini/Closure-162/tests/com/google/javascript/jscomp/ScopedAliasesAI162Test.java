package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScopedAliasesAI162Test {

  @Test
  public void testScopesAliasesBasic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "var goog;");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "goog.scope(function() {\n" +
        "  var dom = goog.dom;\n" +
        "  dom.createElement('DIV');\n" +
        "});");

    compiler.compile(extern, input, new CompilerOptions());
    String source = compiler.toSource();
    assertTrue(source.contains("goog.dom.createElement(\"DIV\")"));
  }

  @Test
  public void testScopeReferencesThisError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "var goog;");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "goog.scope(function() {\n" +
        "  this.x = 1;\n" +
        "});");

    compiler.compile(extern, input, new CompilerOptions());
    assertTrue(compiler.hasErrors());
    assertEquals(ScopedAliases.GOOG_SCOPE_REFERENCES_THIS, compiler.getErrors()[0].type);
  }

  @Test
  public void testScopeUsesReturnError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "var goog;");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "goog.scope(function() {\n" +
        "  return;\n" +
        "});");

    compiler.compile(extern, input, new CompilerOptions());
    assertTrue(compiler.hasErrors());
    assertEquals(ScopedAliases.GOOG_SCOPE_USES_RETURN, compiler.getErrors()[0].type);
  }
}
