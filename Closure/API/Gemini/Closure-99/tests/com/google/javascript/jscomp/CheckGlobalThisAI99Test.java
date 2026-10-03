package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckGlobalThisAI99Test {

  @Test
  public void testGlobalThisAssignment() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING;
    compiler.initOptions(options);

    JSSourceFile[] externs = new JSSourceFile[] {
      JSSourceFile.fromCode("externs.js", "")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("input.js", "this.foo = 1;")
    };

    compiler.compile(externs, inputs);
    assertEquals(1, compiler.getWarningCount());
    assertEquals(CheckGlobalThis.GLOBAL_THIS, compiler.getWarnings()[0].type);
  }

  @Test
  public void testConstructorFunctionDoesNotWarn() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING;
    compiler.initOptions(options);

    JSSourceFile[] externs = new JSSourceFile[] {
      JSSourceFile.fromCode("externs.js", "")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("input.js", "/** @constructor */ function Foo() { this.bar = 1; }")
    };

    compiler.compile(externs, inputs);
    assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testPrototypeAssignmentDoesNotWarn() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING;
    compiler.initOptions(options);

    JSSourceFile[] externs = new JSSourceFile[] {
      JSSourceFile.fromCode("externs.js", "")
    };
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("input.js", "function Foo() {} Foo.prototype.bar = function() { this.baz = 1; };")
    };

    compiler.compile(externs, inputs);
    assertEquals(0, compiler.getWarningCount());
  }
}
