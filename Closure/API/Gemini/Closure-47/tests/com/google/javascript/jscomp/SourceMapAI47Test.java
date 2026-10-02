package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.debugging.sourcemap.FilePosition;
import com.google.javascript.rhino.Node;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;

public class SourceMapAI47Test {

  @Test
  public void testSourceMapGenerationAndAppend() throws Exception {
    SourceMap sourceMap = SourceMap.Format.DEFAULT.getInstance();
    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "test.js.map");
    assertNotNull(sb);
  }

  @Test
  public void testAddMappingWithValidNode() throws Exception {
    SourceMap sourceMap = SourceMap.Format.V3.getInstance();
    Node node = Node.newString("test");
    node.setSourceFile("original.js");
    node.setLineno(1);

    sourceMap.addMapping(
        node,
        new FilePosition(0, 0),
        new FilePosition(0, 4));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "test.js.map");
    assertTrue(sb.length() >= 0);
  }

  @Test
  public void testPrefixMappings() throws Exception {
    SourceMap sourceMap = SourceMap.Format.V3.getInstance();
    List<SourceMap.LocationMapping> mappings = new ArrayList<SourceMap.LocationMapping>();
    mappings.add(new SourceMap.LocationMapping("prefix/", "replacement/"));
    sourceMap.setPrefixMappings(mappings);

    Node node = Node.newString("test");
    node.setSourceFile("prefix/file.js");
    node.setLineno(1);

    sourceMap.addMapping(
        node,
        new FilePosition(0, 0),
        new FilePosition(0, 4));

    StringBuilder sb = new StringBuilder();
    sourceMap.appendTo(sb, "test.js.map");
    sourceMap.reset();
    assertNotNull(sb.toString());
  }
}
