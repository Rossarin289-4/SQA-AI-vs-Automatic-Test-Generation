package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class RuntimeTypeCheckAI147Test {

  @Test
  public void testRuntimeTypeCheckProcess() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js",
        "var arguments;");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "/** @constructor */ function C() {}" +
        "/** @param {number} x */ function f(x) { return x; }");

    compiler.init(ImmutableList.of(externs), ImmutableList.of(input), options);
    compiler.parse();
    compiler.processDefines();
    compiler.check();

    RuntimeTypeCheck rtc = new RuntimeTypeCheck(compiler, null);
    rtc.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());

    String output = compiler.toSource();
    assertNotNull(output);
    assertTrue(output.contains("jscomp.typecheck"));
  }

  @Test
  public void testGetBoilerplateCode() {
    Compiler compiler = new Compiler();
    Node boilerplate = RuntimeTypeCheck.getBoilerplateCode(compiler, null);
    assertNotNull(boilerplate);
  }

  @Test
  public void testRuntimeTypeCheckWithLogFunction() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js",
        "/** @param {string} s */ function g(s) {}");

    compiler.init(ImmutableList.of(externs), ImmutableList.of(input), options);
    compiler.parse();
    compiler.processDefines();
    compiler.check();

    RuntimeTypeCheck rtc = new RuntimeTypeCheck(compiler, "function(w, e) {}");
    rtc.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());

    String output = compiler.toSource();
    assertNotNull(output);
    assertTrue(output.contains("jscomp_runtimeTypeCheck_"));
  }
}
