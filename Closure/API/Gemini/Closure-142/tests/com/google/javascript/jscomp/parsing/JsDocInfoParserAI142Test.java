package com.google.javascript.jscomp.parsing;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class JsDocInfoParserAI142Test {

  @Test
  public void testParseTypeStringValid() {
    com.google.javascript.rhino.Node node = JsDocInfoParser.parseTypeString("{string}");
    assertNotNull(node);
  }

  @Test
  public void testParseTypeStringInvalidRecord() {
    com.google.javascript.rhino.Node node = JsDocInfoParser.parseTypeString("{number");
    assertNull(node);
  }

  @Test
  public void testParseTypeStringEmpty() {
    com.google.javascript.rhino.Node node = JsDocInfoParser.parseTypeString("");
    assertNull(node);
  }
}
