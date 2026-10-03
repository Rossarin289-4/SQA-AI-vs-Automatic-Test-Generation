package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import com.google.javascript.rhino.Node;
import org.junit.Test;

public class SyntacticScopeCreatorAI153Test {

  @Test
  public void testGlobalScopeCreation() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    
    JSSourceFile[] externs = new JSSourceFile[] {};
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("test.js", "var x = 1;")
    };
    compiler.init(externs, inputs, options);
    compiler.parse();
    
    Node root = compiler.getRoot();
    assertNotNull(root);

    SyntacticScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope scope = creator.createScope(root, null);
    
    assertNotNull(scope);
    assertEquals(true, scope.isGlobal());
    assertEquals(true, scope.isDeclared("x", false));
  }

  @Test
  public void testFunctionScopeArguments() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    
    JSSourceFile[] externs = new JSSourceFile[] {};
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("test.js", "function f(a) { var arguments = 2; }")
    };
    compiler.init(externs, inputs, options);
    compiler.parse();
    
    Node root = compiler.getRoot();
    assertNotNull(root);

    SyntacticScopeCreator creator = new SyntacticScopeCreator(compiler);
    Scope globalScope = creator.createScope(root, null);
    
    Node scriptNode = root.getFirstChild();
    Node funcNode = scriptNode.getFirstChild();
    
    Scope funcScope = creator.createScope(funcNode, globalScope);
    
    assertNotNull(funcScope);
    assertEquals(true, funcScope.isLocal());
    assertEquals(1, compiler.getErrorCount());
  }

  @Test
  public void testDuplicateVariableDeclaration() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    
    JSSourceFile[] externs = new JSSourceFile[] {};
    JSSourceFile[] inputs = new JSSourceFile[] {
      JSSourceFile.fromCode("test.js", "var x = 1; var x = 2;")
    };
    compiler.init(externs, inputs, options);
    compiler.parse();
    
    Node root = compiler.getRoot();
    assertNotNull(root);

    SyntacticScopeCreator creator = new SyntacticScopeCreator(compiler);
    creator.createScope(root, null);
    
    assertEquals(1, compiler.getErrorCount());
  }
}
