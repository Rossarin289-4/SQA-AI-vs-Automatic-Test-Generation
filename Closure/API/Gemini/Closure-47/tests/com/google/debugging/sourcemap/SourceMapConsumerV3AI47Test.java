package com.google.debugging.sourcemap;

import org.junit.Test;
import static org.junit.Assert.fail;

public class SourceMapConsumerV3AI47Test {

  @Test(expected = SourceMapParseException.class)
  public void testParseInvalidVersion() throws SourceMapParseException {
    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse("{\"version\": 2, \"file\": \"test.js\", \"lineCount\": 1, \"mappings\": \"\", \"sources\": [], \"names\": []}");
  }

  @Test(expected = SourceMapParseException.class)
  public void testParseMissingFile() throws SourceMapParseException {
    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse("{\"version\": 3, \"file\": \"\", \"lineCount\": 1, \"mappings\": \"\", \"sources\": [], \"names\": []}");
  }

  @Test(expected = SourceMapParseException.class)
  public void testParseInvalidJson() throws SourceMapParseException {
    SourceMapConsumerV3 consumer = new SourceMapConsumerV3();
    consumer.parse("invalid-json");
  }
}
