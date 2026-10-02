package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NameAnalyzerAI114Test {

  @Test
  public void testGlobalNameRemoval() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.smartNameRemoval = true;
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] {
          JSSourceFile.fromCode("test.js", "var unreferenced = 1; window.foo = 2;")
        },
        options);
    compiler.parse();
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    String result = compiler.toSource();
    assertEquals("window.foo=2;", result);
  }

  @Test
  public void testAliasReference() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.smartNameRemoval = true;
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] {
          JSSourceFile.fromCode("test.js", "var a = {}; a.b = 1; window.c = a.b;")
        },
        options);
    compiler.parse();
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    String result = compiler.toSource();
    assertEquals("var a={};a.b=1;window.c=a.b;", result);
  }

  @Test
  public void testUnreferencedPrototypeRemoval() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.smartNameRemoval = true;
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] {
          JSSourceFile.fromCode("test.js", "function Foo() {} Foo.prototype.bar = function() {};")
        },
        options);
    compiler.parse();
    NameAnalyzer analyzer = new NameAnalyzer(compiler, true);
    analyzer.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());
    String result = compiler.toSource();
    assertEquals("", result);
  }
}
