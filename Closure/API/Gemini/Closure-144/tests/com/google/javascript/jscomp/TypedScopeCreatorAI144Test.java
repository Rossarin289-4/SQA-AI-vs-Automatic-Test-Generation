package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class TypedScopeCreatorAI144Test {

  @Test
  public void testTypedefMalformedWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "/** @define {number} */ var /** @typedef */ MY_DEF;") },
        options);
    compiler.parse();
    assertEquals(0, compiler.getErrorCount());
  }

  @Test
  public void testEnumInitializerWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "/** @enum {string} */ var MyEnum = 123;") },
        options);
    compiler.parse();
    compiler.getTopScope();
    assertNotNull(compiler.getErrors());
  }

  @Test
  public void testConstructorExpectedWarning() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "goog.reflect.object(123, {});") },
        options);
    compiler.parse();
    assertNotNull(compiler.getErrors());
  }
}
