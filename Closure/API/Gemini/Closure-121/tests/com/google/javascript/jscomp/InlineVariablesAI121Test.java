package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InlineVariablesAI121Test {

  @Test
  public void testInlineConstantsOnly() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.inlineConstantVars = true;
    compiler.initOptions(options);

    String original = "var /** @const */ X = 10; var y = X;";
    String expected = "var y = 10;";

    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test", original) },
        options);

    Node externs = compiler.getRoot().getFirstChild();
    Node root = compiler.getRoot().getLastChild();

    InlineVariables pass = new InlineVariables(
        compiler, InlineVariables.Mode.CONSTANTS_ONLY, false);
    pass.process(externs, root);

    assertEquals(expected, compiler.toSource(root));
  }

  @Test
  public void testInlineLocalsOnly() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    String original = "function f() { var x = 5; return x; }";
    String expected = "function f() { return 5; }";

    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test", original) },
        options);

    Node externs = compiler.getRoot().getFirstChild();
    Node root = compiler.getRoot().getLastChild();

    InlineVariables pass = new InlineVariables(
        compiler, InlineVariables.Mode.LOCALS_ONLY, false);
    pass.process(externs, root);

    assertEquals(expected, compiler.toSource(root));
  }

  @Test
  public void testInlineAll() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    String original = "var x = 42; function g() { return x; }";
    String expected = "function g() { return 42; }";

    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test", original) },
        options);

    Node externs = compiler.getRoot().getFirstChild();
    Node root = compiler.getRoot().getLastChild();

    InlineVariables pass = new InlineVariables(
        compiler, InlineVariables.Mode.ALL, false);
    pass.process(externs, root);

    assertEquals(expected, compiler.toSource(root));
  }
}
