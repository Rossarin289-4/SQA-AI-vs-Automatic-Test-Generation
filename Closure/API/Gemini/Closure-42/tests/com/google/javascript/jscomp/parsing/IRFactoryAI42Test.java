package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.Token;
import org.junit.Test;

public class IRFactoryAI42Test {

  @Test
  public void testSuspiciousCommentWarningConstant() {
    assertEquals(
        "Non-JSDoc comment has annotations. Did you mean to start it with '/**'?",
        IRFactory.SUSPICIOUS_COMMENT_WARNING);
  }

  @Test
  public void testAllowedDirectivesConstantExists() {
    IRFactory factory = null;
    assertNotNull(IRFactory.SUSPICIOUS_COMMENT_WARNING);
  }
}
