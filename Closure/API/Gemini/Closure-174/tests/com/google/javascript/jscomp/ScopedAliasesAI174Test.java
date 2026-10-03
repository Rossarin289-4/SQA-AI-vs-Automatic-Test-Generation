package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ScopedAliasesAI174Test {

  @Test
  public void testBasicScopeAlias() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] {
          JSSourceFile.fromCode("input.js",
              "goog.scope(function() {\n" +
              "  var dom = goog.dom;\n" +
              "  dom.createElement('DIV');\n" +
              "});\n")
        },
        options);
    ScopedAliases pass = new ScopedAliases(compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    pass.process(null, compiler.getRoot());
    assertEquals(0, compiler.getErrors().length);
    String output = compiler.toSource();
    assertTrue(output.contains("goog.dom.createElement"));
  }

  @Test
  public void testScopeUsedImproperly() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] {
          JSSourceFile.fromCode("input.js",
              "var x = goog.scope(function() {});\n")
        },
        options);
    ScopedAliases pass = new ScopedAliases(compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    pass.process(null, compiler.getRoot());
    assertEquals(1, compiler.getErrors().length);
    assertEquals("JSC_GOOG_SCOPE_USED_IMPROPERLY", compiler.getErrors()[0].type.name);
  }

  @Test
  public void testScopeReferencesThis() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] {
          JSSourceFile.fromCode("input.js",
              "goog.scope(function() {\n" +
              "  this.x = 1;\n" +
              "});\n")
        },
        options);
    ScopedAliases pass = new ScopedAliases(compiler, null, CompilerOptions.NULL_ALIAS_TRANSFORMATION_HANDLER);
    pass.process(null, compiler.getRoot());
    assertEquals(1, compiler.getErrors().length);
    assertEquals("JSC_GOOG_SCOPE_REFERENCES_THIS", compiler.getErrors()[0].type.name);
  }
}
