package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodeGeneratorAI128Test {

  @Test
  public void testIdentifierEscapeLatin() {
    String input = "myVariable";
    String result = CodeGenerator.identifierEscape(input);
    assertEquals("myVariable", result);
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
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("test.js", "var x = 1;") },
        options
    );
    compiler.parse();
    String source = compiler.toSource();
    assertEquals("var x=1;", source);
  }
}
