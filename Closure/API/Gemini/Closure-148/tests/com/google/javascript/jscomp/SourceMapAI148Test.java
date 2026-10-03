package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class SourceMapAI148Test {

  @Test
  public void testSourceMapGeneration() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.sourceMapFormat = SourceMap.Format.V3;
    compiler.initOptions(options);

    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1;");

    Result result = compiler.compile(extern, input, options);
    assertNotNull(result);
  }

  @Test
  public void testSourceMapWithMultipleInputs() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input1 = JSSourceFile.fromCode("input1.js", "function f() {}");
    JSSourceFile input2 = JSSourceFile.fromCode("input2.js", "f();");

    Result result = compiler.compile(extern, new JSSourceFile[] {input1, input2}, options);
    assertNotNull(result);
  }

  @Test
  public void testSourceMapNullOptions() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile extern = JSSourceFile.fromCode("extern.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var y = 2;");

    Result result = compiler.compile(extern, input, options);
    assertNotNull(compiler.getSourceMap());
  }
}
