package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class AnalyzePrototypePropertiesAI67Test {

  @Test
  public void testConstructorAndProcessWithoutModules() {
    Compiler compiler = new Compiler();
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, true, false);
    assertNotNull(pass);
    Node externRoot = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    pass.process(externRoot, root);
  }

  @Test
  public void testConstructorWithModuleGraph() {
    Compiler compiler = new Compiler();
    JSModule moduleA = new JSModule("A");
    JSModule moduleB = new JSModule("B");
    moduleB.addDependency(moduleA);
    JSModuleGraph moduleGraph = new JSModuleGraph(Lists.newArrayList(moduleA, moduleB));

    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, moduleGraph, false, true);
    assertNotNull(pass);
  }

  @Test
  public void testProcessWithAssignmentProperty() {
    Compiler compiler = new Compiler();
    AnalyzePrototypeProperties pass = new AnalyzePrototypeProperties(
        compiler, null, true, false);

    Node externRoot = new Node(Token.BLOCK);
    Node root = new Node(Token.BLOCK);
    Node expr = new Node(Token.EXPR_RESULT,
        new Node(Token.ASSIGN,
            new Node(Token.GETPROP,
                new Node(Token.GETPROP,
                    new Node(Token.NAME, "Foo"),
                    new Node(Token.STRING, "prototype")),
                new Node(Token.STRING, "bar")),
            new Node(Token.FUNCTION,
                new Node(Token.NAME, ""),
                new Node(Token.PARAM_LIST),
                new Node(Token.BLOCK))));
    root.addChildToBack(expr);

    pass.process(externRoot, root);
  }
}
