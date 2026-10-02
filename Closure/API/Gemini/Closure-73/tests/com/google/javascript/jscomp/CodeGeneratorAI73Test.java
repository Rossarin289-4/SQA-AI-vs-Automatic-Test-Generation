package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CodeGeneratorAI73Test {

  @Test
  public void testIdentifierEscapeLatin() {
    String input = "abc123XYZ";
    assertEquals("abc123XYZ", CodeGenerator.identifierEscape(input));
  }

  @Test
  public void testIdentifierEscapeNonLatin() {
    String input = "a\u00e1b";
    assertEquals("a\\u00e1b", CodeGenerator.identifierEscape(input));
  }

  @Test
  public void testTagAsStrict() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "var x = 1;") },
        options);
    compiler.parse();
    CodeBuilder cb = new Compiler.CodeBuilder();
    compiler.toSource(cb, 0, compiler.getRoot());
    assertEquals("var x=1;", cb.toString());
  }
}
