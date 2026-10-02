package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class FoldConstantsAI105Test {

  @Test
  public void testFoldTypeofString() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "typeof 'abc';") },
        options);
    Node root = compiler.parse();
    FoldConstants folder = new FoldConstants(compiler);
    folder.process(null, root);
    String output = compiler.toSource();
    assertEquals("\"string\";", output);
  }

  @Test
  public void testFoldNegateNaN() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "-NaN;") },
        options);
    Node root = compiler.parse();
    FoldConstants folder = new FoldConstants(compiler);
    folder.process(null, root);
    String output = compiler.toSource();
    assertEquals("NaN;", output);
  }

  @Test
  public void testFoldNotLiteral() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "!true;") },
        options);
    Node root = compiler.parse();
    FoldConstants folder = new FoldConstants(compiler);
    folder.process(null, root);
    String output = compiler.toSource();
    assertEquals("false;", output);
  }
}
