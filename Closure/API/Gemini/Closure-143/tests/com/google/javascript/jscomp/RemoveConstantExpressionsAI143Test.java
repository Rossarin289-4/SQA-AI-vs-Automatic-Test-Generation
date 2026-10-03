package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RemoveConstantExpressionsAI143Test {

  @Test
  public void testRemoveConstantExpression() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "1 + foo();");

    compiler.compile(externs, input);
    new RemoveConstantExpressions(compiler).process(null, compiler.getRoot());

    String result = compiler.toSource();
    assertEquals("foo();", result);
  }

  @Test
  public void testPureConstantExpression() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "1 + 2;");

    compiler.compile(externs, input);
    new RemoveConstantExpressions(compiler).process(null, compiler.getRoot());

    String result = compiler.toSource();
    assertEquals("", result);
  }
}
