package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TypeCheckAI11Test {

  @Test
  public void testTypeCheckValidNumberBinaryOp() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1 + 2;");
    
    Result result = compiler.compile(externs, input);
    assertEquals(0, result.errors.length);
  }

  @Test
  public void testTypeCheckInvalidNumberBinaryOp() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);
    
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 'hello' - 2;");
    
    Result result = compiler.compile(externs, input);
    assertEquals(1, result.errors.length);
  }

  @Test
  public void testTypeCheckBitwiseOperation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.checkTypes = true;
    compiler.initOptions(options);
    
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 'abc' << 2;");
    
    Result result = compiler.compile(externs, input);
    assertEquals(1, result.errors.length);
  }
}
