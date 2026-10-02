package com.google.javascript.jscomp.parsing;

import org.junit.Test;
import static org.junit.Assert.assertNull;

public class JsDocInfoParserAI133Test {

  @Test
  public void testParseTypeStringNull() {
    assertNull(JsDocInfoParser.parseTypeString(null));
  }

  @Test
  public void testParseTypeStringEmpty() {
    assertNull(JsDocInfoParser.parseTypeString(""));
  }
}
