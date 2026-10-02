package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

public class SourceFileAI56Test {

  @Test
  public void testPreloadedSourceFileBasicProperties() {
    SourceFile file = SourceFile.fromCode("test.js", "var x = 1;");
    assertEquals("test.js", file.getName());
    assertEquals("test.js", file.getOriginalPath());
    assertFalse(file.isExtern());
  }

  @Test(expected = IllegalArgumentException.class)
  public void testNullOrEmptyFileNameThrowsException() {
    new SourceFile("");
  }

  @Test
  public void testGeneratedSourceFileCaching() throws Exception {
    SourceFile.Generator generator = new SourceFile.Generator() {
      @Override
      public String getCode() {
        return "generated code";
      }
    };
    SourceFile file = SourceFile.fromGenerator("gen.js", generator);
    assertEquals("generated code", file.getCode());
    file.clearCachedSource();
    assertEquals("generated code", file.getCode());
  }
}
