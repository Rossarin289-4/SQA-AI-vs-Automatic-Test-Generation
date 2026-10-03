package com.google.javascript.jscomp;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RenamePrototypesAI157Test {

  @Test
  public void testRenameCustomPrototypeProperty() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    CompilationLevel.SIMPLE_OPTIMIZATIONS.setOptionsForCompilationLevel(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "function Foo() {} " +
        "Foo.prototype.myProp_ = function() {}; " +
        "var f = new Foo(); " +
        "f.myProp_();");

    Result result = compiler.compile(externs, input, options);
    assertTrue(result.success);
  }

  @Test
  public void testExternedPropertyNotRenamed() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    CompilationLevel.SIMPLE_OPTIMIZATIONS.setOptionsForCompilationLevel(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js",
        "var externObj = {}; externObj.extProp_;");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "var externObj = {}; externObj.extProp_ = 1;");

    Result result = compiler.compile(externs, input, options);
    assertTrue(result.success);
  }

  @Test
  public void testObjectLiteralPropertyRenaming() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    CompilationLevel.SIMPLE_OPTIMIZATIONS.setOptionsForCompilationLevel(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "function Foo() {} " +
        "Foo.prototype = { myProp_ : function() {} };");

    Result result = compiler.compile(externs, input, options);
    assertTrue(result.success);
  }
}
