package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProcessClosurePrimitivesAI113Test {

  @Test
  public void testProvideReplacement() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.closurePass = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "goog.provide('a.b.c');");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    assertEquals("var a={};a.b={};a.b.c={};", compiler.toSource());
  }

  @Test
  public void testRequireRemoval() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.closurePass = true;
    options.setCheckRequires(CheckLevel.OFF);
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "goog.provide('a.b');goog.require('a.b');");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    assertEquals("var a={};a.b={};", compiler.toSource());
  }

  @Test
  public void testNullArgumentError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.closurePass = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "goog.provide();");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    assertEquals(1, compiler.getErrors().length);
    assertEquals("JSC_NULL_ARGUMENT_ERROR", compiler.getErrors()[0].type.name);
  }
}
