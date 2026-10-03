package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class CollapsePropertiesAI89Test {

  @Test
  public void testCollapsePropertiesProcess() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var ns = {}; ns.foo = 1;");

    compiler.init(Lists.newArrayList(externs), Lists.newArrayList(input), options);
    compiler.parse();
    assertNotNull(compiler.getRoot());

    CollapseProperties collapse = new CollapseProperties(compiler, false, true);
    collapse.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    assertTrue(compiler.getErrors().length == 0);
  }

  @Test
  public void testCollapsePropertiesWithoutInlineAliases() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = {}; a.b = 2;");

    compiler.init(Lists.newArrayList(externs), Lists.newArrayList(input), options);
    compiler.parse();

    CollapseProperties collapse = new CollapseProperties(compiler, true, false);
    collapse.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    assertTrue(compiler.getErrors().length == 0);
  }

  @Test
  public void testCollapsePropertiesMultipleNamespaces() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = {}; x.y = {}; x.y.z = 5;");

    compiler.init(Lists.newArrayList(externs), Lists.newArrayList(input), options);
    compiler.parse();

    CollapseProperties collapse = new CollapseProperties(compiler, false, true);
    collapse.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    assertTrue(compiler.getWarnings().length == 0);
  }
}
