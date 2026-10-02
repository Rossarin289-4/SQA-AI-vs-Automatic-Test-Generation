package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LightweightMessageFormatterAI62Test {

  @Test
  public void testWithoutSourceFormatError() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    DiagnosticType type = DiagnosticType.error("JSC_TEST_ERROR", "Test error message");
    JSError error = JSError.make("test.js", 1, 1, type);

    String formatted = formatter.formatError(error);
    assertEquals("test.js:1: ERROR - Test error message\n", formatted);
  }

  @Test
  public void testFormatWarningWithoutLineNumber() {
    LightweightMessageFormatter formatter = LightweightMessageFormatter.withoutSource();
    DiagnosticType type = DiagnosticType.warning("JSC_TEST_WARNING", "Test warning message");
    JSError error = JSError.make("test.js", 0, 0, type);

    String formatted = formatter.formatWarning(error);
    assertEquals("test.js: WARNING - Test warning message\n", formatted);
  }

  @Test
  public void testFormatErrorWithSource() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    SourceFile file = SourceFile.fromCode("test.js", "var x = ;");
    compiler.init(new JSSourceFile[0], new JSSourceFile[] { JSSourceFile.fromCode("test.js", "var x = ;") }, new CompilerOptions());

    LightweightMessageFormatter formatter = new LightweightMessageFormatter(compiler);
    DiagnosticType type = DiagnosticType.error("JSC_PARSE_ERROR", "Parse error");
    JSError error = JSError.make("test.js", 1, 8, type);

    String formatted = formatter.formatError(error);
    assertEquals("test.js:1: ERROR - Parse error\nvar x = ;\n        ^\n", formatted);
  }
}
