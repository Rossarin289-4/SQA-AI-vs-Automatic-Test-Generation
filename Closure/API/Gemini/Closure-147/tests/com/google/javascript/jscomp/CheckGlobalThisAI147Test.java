package com.google.javascript.jscomp;

import org.junit.Assert;
import org.junit.Test;

public class CheckGlobalThisAI147Test {

  @Test
  public void testGlobalThisAssignmentWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING;
    compiler.initOptions(options);

    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "this.x = 1;");

    compiler.init(new JSSourceFile[] { extern }, new JSSourceFile[] { input }, options);
    compiler.parse();
    compiler.check();

    Assert.assertEquals(1, compiler.getWarningCount());
  }

  @Test
  public void testConstructorNoWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING;
    compiler.initOptions(options);

    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "/** @constructor */ function Foo() { this.x = 1; }");

    compiler.init(new JSSourceFile[] { extern }, new JSSourceFile[] { input }, options);
    compiler.parse();
    compiler.check();

    Assert.assertEquals(0, compiler.getWarningCount());
  }

  @Test
  public void testPrototypeMethodNoWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkGlobalThisLevel = CheckLevel.WARNING;
    compiler.initOptions(options);

    JSSourceFile extern = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function Foo() {} Foo.prototype.bar = function() { this.x = 1; };");

    compiler.init(new JSSourceFile[] { extern }, new JSSourceFile[] { input }, options);
    compiler.parse();
    compiler.check();

    Assert.assertEquals(0, compiler.getWarningCount());
  }
}
