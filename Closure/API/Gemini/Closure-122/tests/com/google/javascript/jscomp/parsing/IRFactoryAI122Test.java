package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IRFactoryAI122Test {

  @Test
  public void testErrorMessagesExist() {
    assertEquals(
        "getters are not supported in older versions of JavaScript. " +
        "If you are targeting newer versions of JavaScript, " +
        "set the appropriate language_in option.",
        IRFactory.GETTER_ERROR_MESSAGE);

    assertEquals(
        "setters are not supported in older versions of JavaScript. " +
        "If you are targeting newer versions of JavaScript, " +
        "set the appropriate language_in option.",
        IRFactory.SETTER_ERROR_MESSAGE);
  }

  @Test
  public void testSuspiciousCommentWarningConstant() {
    assertEquals(
        "Non-JSDoc comment has annotations. " +
        "Did you mean to start it with '/**'?",
        IRFactory.SUSPICIOUS_COMMENT_WARNING);
  }

  @Test
  public void testInvalidEs3PropNameConstant() {
    assertEquals(
        "Keywords and reserved words are not allowed as unquoted property " +
        "names in older versions of JavaScript. " +
        "If you are targeting newer versions of JavaScript, " +
        "set the appropriate language_in option.",
        IRFactory.INVALID_ES3_PROP_NAME);
  }
}
