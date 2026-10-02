package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodeGeneratorAI123Test {

  @Test
  public void testIdentifierEscapeLatin() {
    String input = "abc123XYZ";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("abc123XYZ", result);
  }

  @Test
  public void testIdentifierEscapeNonLatin() {
    String input = "a\u0100b";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("a\\u0100b", result);
  }

  @Test
  public void testTagAsStrict() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    CodeGenerator codeGenerator = new CodeGenerator(compiler.new CodeBuilder(), options);
    codeGenerator.tagAsStrict();
  }
}
