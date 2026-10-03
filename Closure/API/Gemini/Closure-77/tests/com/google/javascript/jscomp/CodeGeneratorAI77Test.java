package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CodeGeneratorAI77Test {

  @Test
  public void testIdentifierEscapeLatin() {
    String original = "testIdentifier";
    String escaped = CodeGenerator.identifierEscape(original);
    assertEquals(original, escaped);
  }

  @Test
  public void testIdentifierEscapeNonLatin() {
    String original = "a\u0101b";
    String escaped = CodeGenerator.identifierEscape(original);
    assertEquals("a\\u0101b", escaped);
  }

  @Test
  public void testCompilerCodeGenerationBasic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var x = 10;") },
        options);
    compiler.parse();
    String code = compiler.toSource();
    assertEquals("var x=10;", code);
  }
}
