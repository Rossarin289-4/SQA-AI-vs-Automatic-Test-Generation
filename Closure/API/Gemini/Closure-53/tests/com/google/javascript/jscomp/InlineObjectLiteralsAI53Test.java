package com.google.javascript.jscomp;

import junit.framework.TestCase;
import org.junit.Test;

public class InlineObjectLiteralsAI53Test extends TestCase {

  private Compiler createCompiler() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);
    return compiler;
  }

  @Test
  public void testInlineObjectLiteral() {
    Compiler compiler = createCompiler();
    String js = "function f() { var x = {a: 1, b: 2}; return x.a + x.b; }";
    String expected = "function f() {var JSCompiler_object_inline_a_0=1,JSCompiler_object_inline_b_1=2;return JSCompiler_object_inline_a_0+JSCompiler_object_inline_b_1;}";
    
    Node externs = new Node(Token.BLOCK);
    Node root = compiler.parse(SourceFile.fromCode("testcode", js));
    
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
    pass.process(externs, root);
    
    String result = compiler.toSource();
    assertEquals(expected, result);
  }

  @Test
  public void testNoInlineDirectReference() {
    Compiler compiler = createCompiler();
    String js = "function f() { var x = {a: 1}; return x; }";
    
    Node externs = new Node(Token.BLOCK);
    Node root = compiler.parse(SourceFile.fromCode("testcode", js));
    
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
    pass.process(externs, root);
    
    String result = compiler.toSource();
    assertEquals(js, result);
  }

  @Test
  public void testInlineObjectWithCall() {
    Compiler compiler = createCompiler();
    String js = "function f() { var x = {a: function() { return this; }}; return x.a(); }";
    
    Node externs = new Node(Token.BLOCK);
    Node root = compiler.parse(SourceFile.fromCode("testcode", js));
    
    InlineObjectLiterals pass = new InlineObjectLiterals(compiler, compiler.getUniqueNameIdSupplier());
    pass.process(externs, root);
    
    String result = compiler.toSource();
    assertTrue(result.contains("JSCompiler_object_inline_a_0"));
  }
}
