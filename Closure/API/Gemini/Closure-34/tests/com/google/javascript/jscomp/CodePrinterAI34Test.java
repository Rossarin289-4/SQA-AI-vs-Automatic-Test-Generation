package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class CodePrinterAI34Test {

  @Test
  public void testBuilderWithoutRootThrowsException() {
    boolean thrown = false;
    try {
      new CodePrinter.Builder(null).build();
    } catch (IllegalStateException e) {
      thrown = true;
    }
    assertTrue(thrown);
  }

  @Test
  public void testCompactPrintBasicNode() {
    Compiler compiler = new Compiler();
    Node root = compiler.parse(SourceFile.fromCode("test.js", "var x = 10;"));
    String output = new CodePrinter.Builder(root)
        .setPrettyPrint(false)
        .build();
    assertNotNull(output);
  }

  @Test
  public void testPrettyPrintBasicNode() {
    Compiler compiler = new Compiler();
    Node root = compiler.parse(SourceFile.fromCode("test.js", "var x = 10;"));
    String output = new CodePrinter.Builder(root)
        .setPrettyPrint(true)
        .build();
    assertNotNull(output);
  }
}
