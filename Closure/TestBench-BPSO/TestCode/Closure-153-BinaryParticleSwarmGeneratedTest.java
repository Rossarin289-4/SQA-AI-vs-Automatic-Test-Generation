package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "12:30:55", "\n"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExc...#409#-1932167919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "The namBe PT1H", "-1"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:9>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<null>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", ",T1H", "argumfnts0xFFFFFFFF"}, true), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "1.123556789012345671.1234567", "1.12345678901234567"}, true), new String[][]{{"isOptionalArg", "", "0"}, {"hasOneChild", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:3>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>"}, {"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "P1H", ""}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#424#-309491915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:9>", "", "1.51.5f"}, true, 0, null, 1), new String[][]{{"getDouble", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "\u00e9WHILE node", "1"}, true, 0, null, 1), new String[][]{{"getType", "", "7"}, {"hasOneChild", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "0x1", "FOR initializer"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "The nme ", "1.12345678901"}, true), new String[][]{{"getNext", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "0x123467895.", "Tie name "}, true), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "du", "Empty VAR node.1.1234567890123457"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#424#-309491915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:3>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "1.5f", "Unexpected LA"}, true), new String[][]{{"isQualifiedName", "", "7"}, {"getLastChild", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "The namBe PT1TH", "1E-5"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<null>"}, false, 0, null, 2), new String[][]{{"isGlobal", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:8>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "0x1234567891.5e300", "\t"}, true), new String[][]{{"isSyntheticBlock", "", "1"}, {"getString", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "1.12\u00e9", "ab,c"}, true), new String[][]{{"putProp", "int,java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [catch_scope_prop: b] [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!U...#431#460864095", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "Helmo, World", "TITLE"}, true), new String[][]{{"getJsDocBuilderForNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "2", ";a,b,c/a/b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "--1", "a,b,c{\"a\":1}"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "2020-/1-0", "1:30:45"}, true), new String[][]{{"isNoSideEffectsCall", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "a-b,c", "P1H"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExc...#409#-1932167919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "0x123456799", "U"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "_", "atguments"}, true, 0, null, 2), new String[][]{{"checkTreeEqualsSilent", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "The name ", ""}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExc...#409#-1932167919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "1.12345778", "tsve"}, true), new String[][]{{"getChildBefore", "com.google.javascript.rhino.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "1.f", "PT_H"}, true, 0, null, 3), new String[][]{{"getDirectives", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "\u00e9\u00e9", "Unfxpected LABEL"}, true, 0, null, 3), new String[][]{{"getJsDocBuilderForNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "a b", ""}, true), new String[][]{{"hasOneChild", "", "4"}, {"getIntProp", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "FOR initialWzer", "2020-01-01true"}, true, 0, null, 1), new String[][]{{"isOptionalArg", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "FOR i", "nuull"}, true), new String[][]{{"getExistingIntProp", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "\u00e9", "1.1h2345678"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupp...#425#278129791", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "[1-2]", "1n25"}, true, 0, null, 3), new String[][]{{"getJSDocInfo", "", "4"}, {"getChildCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "[1", "duplicate"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExc...#409#-1932167919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "1E-5", "Unexpected :L"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "Hdllo, World", "Unexpected LABEK"}, true, 0, null, 2), new String[][]{{"removeChild", "com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "1.1234567", ""}, true, 0, null, 2), new String[][]{{"addSuppression", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [jsdoc_info: JSDocInfo] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFla...#448#1548841430", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "{\"a:1}", "1.5"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "Hllo, World", "-.00"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#424#-309491915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:9>", "<null>", "1.5e300"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:7>"}, {"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "+11", ""}, true), new String[][]{{"putIntProp", "int,int", "5"}, {"getCharno", "", "0"}, {"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [break: 3] [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupported...#421#-842747073", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "0xFEFFFFFF", "avnull"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "12:30:45", " "}, true, 0, null, 2), new String[][]{{"hasOneChild", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "12:30:45", ""}, true, 0, null, 2), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nBLOCK [sourcename:  [testcode] ]\n\n\nTree2:\nLEAVEWITH\n    GOTO 7\n        SETNAME\n    IFEQ\n        SETNAME 12\n            BITXOR\n            BITAND 12\n            EQ 16\n     ...#914#-1875367069", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<null>"}, false, 7, new String[][]{}), new String[][]{{"getOwnSlot", "java.lang.String", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "2", "a\n"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#424#-309491915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "PT1H010", "The name "}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "nl", "TVtle"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "", ".5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupp...#427#1578671538", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "2020-01.01", "a!b"}, true, 0, null, 1), new String[][]{{"getDirectives", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "-1.0", "-1.5"}, true, 0, null, 1), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.Node", "5"}, {"getJsDocBuilderForNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:10>", "FOR-IN var decHlaration0", "10"}, true, 0, null, 1), new String[][]{{"getAncestors", "", "7"}, {"iterator", "", "4"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "[11,2]", "argumennts"}, true, 0, null, 2), new String[][]{{"removeChildAfter", "com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "FOR Fnitializer", "0xFFFFFFFF"}, true, 0, null, 2), new String[][]{{"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "12345678901244567890123456", "0xFFFFFFFF"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupp...#425#278129791", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "", "rue"}, true, 0, null, 2), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "\n", "urue"}, true, 0, null, 3), new String[][]{{"getAncestor", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "\t", "??"}, true, 0, null, 3), new String[][]{{"hasMoreThanOneChild", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "FOR-IN var decaration\n", ""}, true, 0, null, 3), new String[][]{{"getAncestors", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "Unexpected LABEK", "FOR-IN  ar declaration"}, true, 0, null, 1), new String[][]{{"getParent", "", "6"}, {"detachFromParent", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "J", "h"}, true, 0, null, 2), new String[][]{{"getQualifiedName", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:9>", "PT1H", "123467899012345678901234567890"}, true, 0, null, 2), new String[][]{{"getParent", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "i", ""}, true, 0, null, 3), new String[][]{{"detachFromParent", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "", "1.5d"}, true, 0, null, 1), new String[][]{{"getJSDocInfo", "", "3"}, {"getAncestor", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "T", "."}, true, 0, null, 3), new String[][]{{"hasOneChild", "", "3"}, {"getString", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "--11", "2020-02-30T25961:61"}, true, 0, null, 3), new String[][]{{"removeChildAfter", "com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "21447483648", "oHelloo, World"}, true, 0, null, 2), new String[][]{{"getJsDocBuilderForNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:2>"}, {"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:10>", "<sample:1>"}}, 1), new String[][]{{"getVar", "java.lang.String", "1"}, {"isGlobal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 2), new String[][]{{"getOwnSlot", "java.lang.String", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "Empty VAR node.", "-5"}, true, 0, null, 1), new String[][]{{"getExistingIntProp", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:9>", "1.1234H567890123456", "PT1H"}, true, 0, null, 1), new String[][]{{"getString", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<null>"}, false, 6, new String[][]{}), new String[][]{{"getTypeOfThis", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=global this, hasC...#418#-1507268682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:10>", "<null>"}, false, 3, new String[][]{}, 2), new String[][]{{"getVars", "", "5"}, {"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "a b1L", "1.5e300PT1H"}, true, 0, null, 2), new String[][]{{"putProp", "int,java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [target: key] [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppor...#424#565522953", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:10>", "<sample:3>"}}, 2), new String[][]{{"getVarCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "+", "s??"}, true, 0, null, 1), new String[][]{{"getAncestors", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<null>"}, false, 5, new String[][]{}), new String[][]{{"getVars", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<null>"}, false), new String[][]{{"isDeclared", "java.lang.String,boolean", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "Vx:F", "1234567890123456789012345.67890"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupp...#425#278129791", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:8>", "<sample:1>"}, {"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:8>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:2>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:5>"}}, 1), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GOTO 7 {getCharno=8, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=7, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=5, hasChildr...#377#670022238", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "yel.o, World", "b"}, true, 0, null, 3), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:10>"}, {"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:8>", "<sample:0>"}}, 2), new String[][]{{"getTypeOfThis", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.PrototypeObjectType", actual.getClass().getName());
  assertEquals("global this {canBeCalled=false, getDisplayName=global this, getNormalizedReferenceName=global this, getPossibleToBooleanOutcomes=TRUE, getPropertiesCount=2147483647, getReferenceName=global this, hasC...#418#-1507268682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<null>"}, false, 6, new String[][]{}), new String[][]{{"getVarCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<null>"}, false, 0, null, 1), new String[][]{{"getVar", "java.lang.String", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:4>", "<null>"}, false, 0, null, 1), new String[][]{{"getParent", "", "0"}, {"isDeclared", "java.lang.String,boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<null>"}, false, 0, null, 3), new String[][]{{"getParent", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<null>"}, false), new String[][]{{"getTypeOfThis", "", "2"}, {"canAssignTo", "com.google.javascript.rhino.jstype.JSType", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:9>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:6>"}}, 3), new String[][]{{"isLocal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:4>", "<null>"}, false, 6, new String[][]{}, 3), new String[][]{{"getParentScope", "", "4"}, {"getVarCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<null>"}, false), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOF {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=0, hasChildre...#377#575037193", SearchInputFactory_scaffolding.observe(actual));
 }
}
