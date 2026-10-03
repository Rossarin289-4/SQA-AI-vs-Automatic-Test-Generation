package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class CollapsePropertiesAI156Test {

  @Test
  public void testCollapseSimpleNamespace() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.collapseProperties = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = {}; a.b = 1;");

    compiler.init(new JSSourceFile[] {externs}, new JSSourceFile[] {input}, options);
    compiler.parse();
    assertNotNull(compiler.getRoot());

    CollapseProperties pass = new CollapseProperties(compiler, false, true);
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());

    String output = compiler.toSource();
    assertEquals("var a$b=1;", output);
  }

  @Test
  public void testCollapseObjectLiteralValues() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.collapseProperties = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = {b: 2};");

    compiler.init(new JSSourceFile[] {externs}, new JSSourceFile[] {input}, options);
    compiler.parse();
    assertNotNull(compiler.getRoot());

    CollapseProperties pass = new CollapseProperties(compiler, false, true);
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());

    String output = compiler.toSource();
    assertEquals("var a$b=2;", output);
  }

  @Test
  public void testNoCollapseOnAlias() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.collapseProperties = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = {}; a.b = 1; var c = a;");

    compiler.init(new JSSourceFile[] {externs}, new JSSourceFile[] {input}, options);
    compiler.parse();
    assertNotNull(compiler.getRoot());

    CollapseProperties pass = new CollapseProperties(compiler, false, true);
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());

    String output = compiler.toSource();
    assertEquals("var a={};a.b=1;var c=a;", output);
  }
}
