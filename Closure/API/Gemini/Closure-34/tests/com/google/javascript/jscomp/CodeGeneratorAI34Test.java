package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodeGeneratorAI34Test {

  @Test
  public void testIdentifierEscapeLatin() {
    String input = "abc123XYZ";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("abc123XYZ", result);
  }

  @Test
  public void testIdentifierEscapeNonLatin() {
    String input = "a\u0101b";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("a\\u0101b", result);
  }

  @Test
  public void testTagAsStrict() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var x = 1;") },
        options);
    compiler.parse();
    CodeConsumer consumer = new CodeConsumer() {
      private final StringBuilder sb = new StringBuilder();
      @Override void add(String str) { sb.append(str); }
      @Override void addOp(String op, boolean needSpace) { sb.append(op); }
      @Override boolean continueProcessing() { return true; }
      @Override String toSource() { return sb.toString(); }
    };
    CodeGenerator generator = new CodeGenerator(consumer);
    generator.tagAsStrict();
    assertEquals("'use strict';", consumer.toSource());
  }
}
