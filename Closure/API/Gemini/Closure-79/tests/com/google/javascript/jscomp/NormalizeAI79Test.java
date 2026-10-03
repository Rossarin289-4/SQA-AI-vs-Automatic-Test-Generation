package com.google.javascript.jscomp;

import com.google.javascript.rhino.Node;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class NormalizeAI79Test {

  @Test
  public void testNormalizeProcessBasic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    JSSourceFile externs = JSSourceFile.fromCode("externs.js", "");
    JSSourceFile input = JSSourceFile.fromCode("input.js", "var a = 1, b = 2;");
    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);

    Normalize normalize = new Normalize(compiler, false);
    normalize.process(compiler.externsRoot, compiler.jsRoot);

    assertNotNull(compiler.jsRoot);
  }

  @Test
  public void testParseAndNormalizeSyntheticCode() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    String code = "var x = 10;";
    Node parsed = Normalize.parseAndNormalizeSyntheticCode(compiler, code, "testPrefix");
    assertNotNull(parsed);
  }

  @Test
  public void testParseAndNormalizeTestCode() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.initOptions(options);

    String code = "function f() { var y = 20; }";
    Node parsed = Normalize.parseAndNormalizeTestCode(compiler, code, "testPrefix");
    assertNotNull(parsed);
  }
}
