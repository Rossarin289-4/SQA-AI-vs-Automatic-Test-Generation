package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodeGeneratorAI157Test {

  @Test
  public void testIdentifierEscapeLatin() {
    String input = "myVariable";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("myVariable", result);
  }

  @Test
  public void testIdentifierEscapeNonLatin() {
    String input = "a\u00E1b";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("a\\u00e1b", result);
  }

  @Test
  public void testTagAsStrict() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function f() {}") },
        options);
    compiler.parse();
    CodeGenerator cg = new CodeGenerator(compiler.new CodeBuilder());
    cg.tagAsStrict();
    assertEquals("'use strict';", compiler.toSource());
  }
}
