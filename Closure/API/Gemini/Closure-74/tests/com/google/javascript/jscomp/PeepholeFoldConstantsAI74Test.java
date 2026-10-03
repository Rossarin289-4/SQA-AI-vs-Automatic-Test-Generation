package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PeepholeFoldConstantsAI74Test {

  @Test
  public void testFoldArrayLengthConstant() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.foldConstants = true;
    compiler.initOptions(options);
    
    CompilerInput input = new CompilerInput(SourceFile.fromCode("test", "var x = [1, 2, 3].length;"));
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { JSSourceFile.fromCode("test", "var x = [1, 2, 3].length;") }, options);
    compiler.parse();
    compiler.processDefines();
    compiler.optimize();

    String js = compiler.toSource();
    assertEquals("var x=3;", js);
  }

  @Test
  public void testFoldObjectPropAccessConstant() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.foldConstants = true;
    compiler.initOptions(options);

    compiler.init(new JSSourceFile[0], new JSSourceFile[] { JSSourceFile.fromCode("test", "var x = {a: 10}.a;") }, options);
    compiler.parse();
    compiler.processDefines();
    compiler.optimize();

    String js = compiler.toSource();
    assertEquals("var x=10;", js);
  }

  @Test
  public void testFoldGetElemConstant() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.foldConstants = true;
    compiler.initOptions(options);

    compiler.init(new JSSourceFile[0], new JSSourceFile[] { JSSourceFile.fromCode("test", "var x = [10, 20, 30][1];") }, options);
    compiler.parse();
    compiler.processDefines();
    compiler.optimize();

    String js = compiler.toSource();
    assertEquals("var x=20;", js);
  }
}
