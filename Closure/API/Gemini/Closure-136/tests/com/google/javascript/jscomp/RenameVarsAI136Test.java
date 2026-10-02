package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RenameVarsAI136Test {

  @Test
  public void testRenameGlobalVariable() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.variableRenaming = VariableRenamingPolicy.ALL;
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var longVariableName = 10; function foo() { return longVariableName; }") },
        options
    );
    compiler.parse();
    compiler.processDefines();
    
    RenameVars pass = new RenameVars(
        compiler,
        "",
        false,
        false,
        false,
        null,
        null,
        null
    );
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());

    String result = compiler.toSource();
    assertEquals("var a=10;function foo(){return a}", result);
  }

  @Test
  public void testRenameLocalVariablesOnly() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.variableRenaming = VariableRenamingPolicy.LOCAL;
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var globalVar = 1; function f(localVar) { var innerVar = 2; return globalVar + localVar + innerVar; }") },
        options
    );
    compiler.parse();
    compiler.processDefines();

    RenameVars pass = new RenameVars(
        compiler,
        "",
        true,
        false,
        false,
        null,
        null,
        null
    );
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());

    String result = compiler.toSource();
    assertEquals("var globalVar=1;function f(a){var b=2;return globalVar+a+b}", result);
  }

  @Test
  public void testPseudoNamesGeneration() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.variableRenaming = VariableRenamingPolicy.ALL;
    compiler.init(
        new JSSourceFile[] {},
        new JSSourceFile[] { JSSourceFile.fromCode("input.js", "var myVariable = 5;") },
        options
    );
    compiler.parse();
    compiler.processDefines();

    RenameVars pass = new RenameVars(
        compiler,
        "",
        false,
        false,
        true,
        null,
        null,
        null
    );
    pass.process(compiler.getRoot().getFirstChild(), compiler.getRoot().getLastChild());

    String result = compiler.toSource();
    assertEquals("var $myVariable$$=5", result);
  }
}
