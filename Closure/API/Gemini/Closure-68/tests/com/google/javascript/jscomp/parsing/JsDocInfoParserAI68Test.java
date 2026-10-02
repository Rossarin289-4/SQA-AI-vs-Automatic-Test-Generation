package com.google.javascript.jscomp.parsing;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.*;

public class JsDocInfoParserAI68Test {

  @Test
  public void testParseTypeStringValid() {
    String typeString = "{string}";
    Node node = JsDocInfoParser.parseTypeString(typeString);
    assertNotNull(node);
  }

  @Test
  public void testParseTypeStringInvalid() {
    String typeString = "{";
    Node node = JsDocInfoParser.parseTypeString(typeString);
    assertNull(node);
  }

  @Test
  public void testParseTypeStringEmpty() {
    Node node = JsDocInfoParser.parseTypeString("");
    assertNull(node);
  }
}
