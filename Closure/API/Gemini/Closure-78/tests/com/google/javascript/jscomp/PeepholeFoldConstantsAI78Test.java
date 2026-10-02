package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PeepholeFoldConstantsAI78Test {

  @Test
  public void testFoldArrayLengthConstant() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.foldConstants = true;
    compiler.initOptions(options);
    
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "var x = [1, 2, 3].length;") },
        new CompilerOptions());
    compiler.parse();
    compiler.processDefines();
    compiler.optimize();
    
    String output = compiler.toSource();
    assertEquals("var x=3;", output);
  }

  @Test
  public void testFoldGetElemConstant() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.foldConstants = true;
    compiler.initOptions(options);
    
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "var x = [10, 20, 30][1];") },
        new CompilerOptions());
    compiler.parse();
    compiler.processDefines();
    compiler.optimize();
    
    String output = compiler.toSource();
    assertEquals("var x=20;", output);
  }

  @Test
  public void testFoldStringLengthConstant() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.foldConstants = true;
    compiler.initOptions(options);
    
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "var x = 'abc'.length;") },
        new CompilerOptions());
    compiler.parse();
    compiler.processDefines();
    compiler.optimize();
    
    String output = compiler.toSource();
    assertEquals("var x=3;", output);
  }
}
