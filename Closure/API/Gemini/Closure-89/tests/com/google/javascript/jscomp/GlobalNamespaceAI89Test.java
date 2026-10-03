package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.Map;

public class GlobalNamespaceAI89Test {

  @Test
  public void testGlobalNamespaceBasic() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("testcode", "var a = 1; a.b = 2;") },
        options
    );
    compiler.parse();
    
    GlobalNamespace namespace = new GlobalNamespace(compiler, compiler.getRoot());
    Map<String, GlobalNamespace.Name> index = namespace.getNameIndex();
    
    assertNotNull(index.get("a"));
    assertNotNull(index.get("a.b"));
  }

  @Test
  public void testGlobalNamespaceEmpty() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    compiler.init(
        new JSSourceFile[] { JSSourceFile.fromCode("externs", "") },
        new JSSourceFile[] { JSSourceFile.fromCode("testcode", "") },
        options
    );
    compiler.parse();
    
    GlobalNamespace namespace = new GlobalNamespace(compiler, compiler.getRoot());
    List<GlobalNamespace.Name> forest = namespace.getNameForest();
    
    assertTrue(forest.isEmpty());
  }

  @Test
  public void testGlobalNamespaceExterns() {
    Compiler compiler = new Compiler();
    CompilerOptions options = new CompilerOptions();
    JSSourceFile externs = JSSourceFile.fromCode("externs", "var externVar;");
    JSSourceFile input = JSSourceFile.fromCode("testcode", "var localVal = 1;");
    compiler.init(new JSSourceFile[] { externs }, new JSSourceFile[] { input }, options);
    compiler.parse();

    GlobalNamespace namespace = new GlobalNamespace(compiler, externs, compiler.getRoot());
    Map<String, GlobalNamespace.Name> index = namespace.getNameIndex();

    assertNotNull(index.get("externVar"));
    assertNotNull(index.get("localVal"));
  }
}
