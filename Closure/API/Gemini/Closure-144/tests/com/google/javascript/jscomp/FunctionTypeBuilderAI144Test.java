package com.google.javascript.jscomp;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.javascript.rhino.JSDocInfo;
import com.google.javascript.rhino.Node;
import com.google.javascript.rhino.jstype.FunctionType;
import org.junit.Test;

public class FunctionTypeBuilderAI144Test {

  @Test
  public void testIsFunctionTypeDeclarationWithReturnType() {
    JSDocInfo info = new JSDocInfo();
    info.setReturnType(new com.google.javascript.rhino.JSTypeExpression(new Node(com.google.javascript.rhino.Token.STRING), ""));
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testIsFunctionTypeDeclarationWithConstructor() {
    JSDocInfo info = new JSDocInfo();
    info.setAssociatedNode(new Node(com.google.javascript.rhino.Token.FUNCTION));
    info.setIsConstructor();
    assertTrue(FunctionTypeBuilder.isFunctionTypeDeclaration(info));
  }

  @Test
  public void testBuildAndRegisterBasicFunction() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs.js", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "function f() {}") },
        options);
    compiler.parse();
    Node root = compiler.getRoot();
    Scope scope = compiler.getTopScope();

    FunctionTypeBuilder builder = new FunctionTypeBuilder("f", compiler, root, "input.js", scope);
    Node paramsNode = new Node(com.google.javascript.rhino.Token.PARAM_LIST);
    builder.setSourceNode(root);
    
    FunctionType fnType = builder.buildAndRegister();
    assertNotNull(fnType);
  }
}
