package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NameAnalyzerAI40Test {

  @Test
  public void testNameAnalyzerPassCreation() {
    Compiler compiler = new Compiler();
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    assertNotNull(analyzer);
  }

  @Test
  public void testProcessGlobalNames() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var window;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var x = 1; window.y = x;");
    
    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    
    assertNotNull(compiler.getRoot());
  }

  @Test
  public void testUnreferencedNameRemoval() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    
    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "var window;");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var unusedVar = 42;");
    
    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();
    
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    
    String output = compiler.toSource();
    assertEquals("", output.trim());
  }
}
