package com.google.javascript.jscomp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoalesceVariableNamesAI142Test {

  @Test
  public void testCoalesceVariablesBasic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.coalesceVariableNames = true;
    compiler.initOptions(options);

    CompilerInput externs = new CompilerInput(SourceFile.fromCode("externs.js", ""));
    CompilerInput input = new CompilerInput(SourceFile.fromCode("input.js", "function f() { var x = 1; print(x); var y = 2; print(y); }"));
    compiler.init(ImmutableList.of(externs), ImmutableList.of(input), options);
    compiler.parse();
    compiler.processDefines();
    compiler.check();
    compiler.optimize();

    String expected = "function f() {var x=1;print(x);x=2;print(x)}";
    assertEquals(expected, compiler.toSource().trim());
  }

  @Test
  public void testCoalesceVariablesNoOverlap() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    options.coalesceVariableNames = true;
    compiler.initOptions(options);

    CompilerInput externs = new CompilerInput(SourceFile.fromCode("externs.js", ""));
    CompilerInput input = new CompilerInput(SourceFile.fromCode("input.js", "function f() { if (true) { var x = 1; print(x); } else { var y = 2; print(y); } }"));
    compiler.init(ImmutableList.of(externs), ImmutableList.of(input), options);
    compiler.parse();
    compiler.processDefines();
    compiler.check();
    compiler.optimize();

    String expected = "function f() {if(true){var x=1;print(x)}else{x=2;print(x)}}";
    assertEquals(expected, compiler.toSource().trim());
  }
}
