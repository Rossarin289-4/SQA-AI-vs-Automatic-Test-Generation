package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class ProcessClosurePrimitivesAI92Test {

  @Test
  public void testProvideAndRequireValid() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.closurePass = true;
    options.checkRequires = CheckLevel.ERROR;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "goog.provide('a.b'); goog.require('a.b');");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    assertFalse(compiler.hasErrors());
  }

  @Test
  public void testMissingProvideError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.closurePass = true;
    options.checkRequires = CheckLevel.ERROR;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "goog.require('nonexistent.namespace');");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    assertTrue(compiler.hasErrors());
    assertEquals(ProcessClosurePrimitives.MISSING_PROVIDE_ERROR, compiler.getErrors()[0].type);
  }

  @Test
  public void testDuplicateNamespaceError() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.closurePass = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "goog.provide('a.b'); goog.provide('a.b');");

    compiler.compile(externs, new JSSourceFile[] { input }, options);
    assertTrue(compiler.hasErrors());
    assertEquals(ProcessClosurePrimitives.DUPLICATE_NAMESPACE_ERROR, compiler.getErrors()[0].type);
  }
}
