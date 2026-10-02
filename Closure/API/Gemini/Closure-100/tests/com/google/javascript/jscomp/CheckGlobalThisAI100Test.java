package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckGlobalThisAI100Test {

  @Test
  public void testGlobalThisAssignmentWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "this.a = 1;");

    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, new CompilerOptions());
    compiler.parse();
    Node root = compiler.getRoot();

    CheckGlobalThis pass = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal.traverse(compiler, root, pass);

    assertEquals(1, compiler.getWarningCount());
    assertEquals(CheckGlobalThis.GLOBAL_THIS, compiler.getWarnings()[0].type);
  }

  @Test
  public void testConstructorNoWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "/** @constructor */ function Foo() { this.a = 1; }");

    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, new CompilerOptions());
    compiler.parse();
    Node root = compiler.getRoot();

    CheckGlobalThis pass = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal.traverse(compiler, root, pass);

    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testPrototypeMethodNoWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function Foo() {} Foo.prototype.bar = function() { this.a = 1; };");

    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, new CompilerOptions());
    compiler.parse();
    Node root = compiler.getRoot();

    CheckGlobalThis pass = new CheckGlobalThis(compiler, CheckLevel.WARNING);
    NodeTraversal.traverse(compiler, root, pass);

    assertEquals(0, compiler.getWarningCount());
  }
}
