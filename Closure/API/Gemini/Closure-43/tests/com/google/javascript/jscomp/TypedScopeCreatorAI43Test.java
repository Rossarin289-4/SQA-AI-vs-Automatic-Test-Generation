package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class TypedScopeCreatorAI43Test {

  @Test
  public void testTypedefDeclaration() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "var window;") },
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "/** @typedef {number} */ var MyType;") },
        options);
    compiler.parse();
    compiler.getTopScope();
    assertNotNull(compiler.getTypeRegistry().getType("MyType"));
  }

  @Test
  public void testEnumDeclaration() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "var window;") },
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "/** @enum {string} */ var MyEnum = {A: 'a'};") },
        options);
    compiler.parse();
    compiler.getTopScope();
    assertNotNull(compiler.getTypeRegistry().getType("MyEnum"));
  }

  @Test
  public void testFunctionScopeCreation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "var window;") },
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "function f(/** number */ x) { var y = x; return y; }") },
        options);
    compiler.parse();
    compiler.getTopScope();
    assertFalse(compiler.hasErrors());
  }
}
