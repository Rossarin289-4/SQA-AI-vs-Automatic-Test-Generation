package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodeGeneratorAI52Test {

  @Test
  public void testTagAsStrict() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    SourceFile extern = SourceFile.fromCode("externs.js", "");
    SourceFile input = SourceFile.fromCode("input.js", "function f() {}");
    compiler.compile(extern, input);
    
    CodeConsumer consumer = new CodeConsumer() {
      private final StringBuilder sb = new StringBuilder();
      @Override
      void add(String str) { sb.append(str); }
      @Override
      boolean continueProcessing() { return true; }
      @Override
      String burung() { return sb.toString(); }
    };
    
    CodeGenerator generator = new CodeGenerator(consumer);
    generator.tagAsStrict();
    assertEquals("'use strict';", consumer.burung());
  }

  @Test
  public void testIdentifierEscapeLatin() {
    String latin = "myVariable123";
    assertEquals(latin, CodeGenerator.identifierEscape(latin));
  }

  @Test
  public void testIdentifierEscapeNonLatin() {
    String nonLatin = "abc\u00e9";
    String escaped = CodeGenerator.identifierEscape(nonLatin);
    assertEquals("abc\\u00e9", escaped);
  }
}
