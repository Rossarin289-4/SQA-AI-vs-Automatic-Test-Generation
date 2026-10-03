package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class AnalyzePrototypePropertiesAI163Test {

  @Test
  public void testProcessImplicitlyUsedProperties() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var arguments;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function Foo() {} Foo.prototype.toString = function() { return ''; };");

    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    assertNotNull(compiler.getRoot());

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, true, true);
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
  }

  @Test
  public void testProcessLiteralProperty() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var arguments;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function Foo() {} Foo.prototype = { bar: function() {} };");

    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    assertNotNull(compiler.getRoot());

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, false, false);
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
  }

  @Test
  public void testProcessAssignmentProperty() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var arguments;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "function Foo() {} Foo.prototype.baz = function() { this.toString(); };");

    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    assertNotNull(compiler.getRoot());

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(compiler, null, true, false);
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
  }
}
