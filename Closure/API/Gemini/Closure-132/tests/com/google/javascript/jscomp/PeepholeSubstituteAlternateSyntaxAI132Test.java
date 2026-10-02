package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertNotNull;

public class PeepholeSubstituteAlternateSyntaxAI132Test {

  @Test
  public void testUnicodeEscapeCheck() {
    boolean result = PeepholeSubstituteAlternateSyntax.containsUnicodeEscape("test");
    assertNotNull(result);
  }

  @Test
  public void testDontTraverseFunctionsPredicate() {
    assertNotNull(PeepholeSubstituteAlternateSyntax.DONT_TRAVERSE_FUNCTIONS_PREDICATE);
  }

  @Test
  public void testInvalidRegExpFlagsDiagnosticType() {
    assertNotNull(PeepholeSubstituteAlternateSyntax.INVALID_REGULAR_EXPRESSION_FLAGS);
  }
}
