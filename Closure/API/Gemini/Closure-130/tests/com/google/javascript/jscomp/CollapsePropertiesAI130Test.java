package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CollapsePropertiesAI130Test {

  @Test
  public void testCollapseSimpleNamespace() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.collapseProperties = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = {}; a.b = 1;");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    String expected = "var a$b = 1;";
    assertEquals(expected.trim(), compiler.toSource().trim());
  }

  @Test
  public void testCollapseObjectLiteral() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.collapseProperties = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = {b: 2};");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    String expected = "var a$b = 2;";
    assertEquals(expected.trim(), compiler.toSource().trim());
  }

  @Test
  public void testNoCollapseOnAlias() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.collapseProperties = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = {}; a.b = 1; var c = a;");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    String expected = "var a={};a.b=1;var c=a;";
    assertEquals(expected.trim(), compiler.toSource().trim());
  }
}
