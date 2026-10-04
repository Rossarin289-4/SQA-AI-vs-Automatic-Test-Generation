package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:3>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.VarCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "--1", ".5"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "--1", ""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "--1", ""}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "{\"a\":1}", "0x123456789"}, true, 0, null, 2), new String[][]{{"isOnlyModifiesThisCall", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "--1", "-0.0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "--1", "-0.0i"}, true), new String[][]{{"isOnlyModifiesThisCall", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:7>"}, false, 11, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", " ", "1.5d"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#426#-485072152", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "!", "1.5d"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExc...#409#-1932167919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "!", "1.5d"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "!", "1.5d"}, true), new String[][]{{"getLineno", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "!", "1.5d"}, true, 0, null, 1), new String[][]{{"getLineno", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "2020-01-01", "1.5d"}, true, 0, null, 1), new String[][]{{"getLineno", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:1>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.VarCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:2>", "<sample:6>"}, {"com.google.javascript.jscomp.VarCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "2020-01", "1.5c"}, true, 0, null, 1), new String[][]{{"getQualifiedName", "", "5"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:4>"}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:0>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.VarCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:0>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "0xFFFFFFFF", "a,b,c"}, true, 0, null, 3), new String[][]{{"getLineno", "", "0"}, {"addChildToFront", "com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExc...#407#-385451834", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "/wFFFGFFFF", "ta,b,c"}, true, 0, null, 3), new String[][]{{"getLineno", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "/wFFFGFFFF", "ta,b,c"}, true, 0, null, 3), new String[][]{{"getLineno", "", "0"}, {"checkTreeEquals", "com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "0x123456789", "Function declaration"}, true), new String[][]{{"getJsDocBuilderForNode", "", "0"}, {"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "0x123", "Fun>tion declaratio/n"}, true, 0, null, 3), new String[][]{{"getJsDocBuilderForNode", "", "0"}, {"append", "java.lang.String", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:5>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.VarCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}, {"com.google.javascript.jscomp.VarCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<null>", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:4>", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:2>"}, {"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<null>", "<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.VarCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:6>"}, {"com.google.javascript.jscomp.VarCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:5>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.VarCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<null>", "<sample:6>"}, {"com.google.javascript.jscomp.VarCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "[1,2]", "JSC_UNDEFINED_SARIABLE"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupp...#425#278129791", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "[142]", "JSC_UNDEFINED_"}, true, 0, null, 1), new String[][]{{"isLocalResultCall", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "[152]", "JSB_UNDEFINE5_"}, true, 0, null, 1), new String[][]{{"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupp...#425#278129791", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "[152]", "JSB_UNDEFINE5_"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "123456789012345678901234567890", "Title"}, true, 0, null, 1), new String[][]{{"getLastSibling", "", "7"}, {"getParent", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:6>", "<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:6>", "<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "1e10", "<<"}, true), new String[][]{{"getNext", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "\u00e9", "Unexpected variable "}, true), new String[][]{{"detachFromParent", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "<null>", "0x1F"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "5.", "FOR initializer"}, true), new String[][]{{"getString", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "123456789012345678901234567890", "WHILE node"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "2020-/1-y01", "a\"b"}, true), new String[][]{{"getDouble", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "2020-/1.y01Unexpected LABEL", ""}, true, 0, null, 2), new String[][]{{"getDouble", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "mpty VAR node.", "1.2s5"}, true, 0, null, 3), new String[][]{{"getLastChild", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "1.5f", " "}, true), new String[][]{{"isNoSideEffectsCall", "", "7"}, {"getType", "", "6"}, {"getChildCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "-0.0", "0x123456789"}, true), new String[][]{{"addSuppression", "java.lang.String", "7"}, {"getDirectives", "", "1"}, {"getJSDocInfo", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getFileOverview=null, getImplementedInterfaceCount=0, getLendsName=null, getLicense=null...#380#2026955511", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "2e1101", "0xFFFFFFFF"}, true), new String[][]{{"isVarArgs", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "-F", "Emptd VAR node."}, true), new String[][]{{"isVarArgs", "", "7"}, {"getChildCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "-F", "Emptd VAR node."}, true, 0, null, 3), new String[][]{{"isVarArgs", "", "7"}, {"getAncestor", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "-F", "1e10"}, true, 0, null, 1), new String[][]{{"isVarArgs", "", "7"}, {"getAncestor", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "PT1:a", "dF0uplicate"}, true), new String[][]{{"appendStringTree", "java.lang.Appendable", "0"}, {"getAncestor", "int", "6"}, {"hasChild", "com.google.javascript.rhino.Node", "3"}, {"hasOneChild", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "ffOP7Hyy:u_", "F\r1tp1"}, true, 0, null, 2), new String[][]{{"isLocalResultCall", "", "6"}, {"getAncestor", "int", "6"}, {"checkTreeEquals", "com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nSCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1]\n    LABEL 1 [sourcename:  [testcode] ]\n        LABEL_NAME ffOP7Hyy 1 [sourcename:  [testcode] ]\n        BLOCK 1 [sourcen...#666#-1822519285", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "ffOPBHyy:u\n_", "Ia,b,c"}, true, 0, null, 3), new String[][]{{"isLocalResultCall", "", "0"}, {"hasSideEffects", "", "6"}, {"getJSType", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.VarCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "DfPPBHyy:u\n_", "Ia.bc"}, true, 0, null, 3), new String[][]{{"isLocalResultCall", "", "0"}, {"hasSideEffects", "", "6"}, {"getJSType", "", "0"}, {"removeChild", "com.google.javascript.rhino.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "DfPPBBGpyf:Sv\nR_I", "tduplicate1.5e300"}, true, 0, null, 1), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "5"}, {"hasSideEffects", "", "6"}, {"getJSType", "", "0"}, {"getChildAtIndex", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=3, hasC...#382#85513908", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "DfPPiBGqyf:Sw\nSm_I", "1.5e"}, true, 0, null, 2), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "5"}, {"hasSideEffects", "", "6"}, {"getJSType", "", "0"}, {"getChildAtIndex", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=3, hasC...#382#85513908", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.VarCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:3>", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "DDfOPnBrTg5c:RwSS_C", "-1oO5"}, true, 0, null, 2), new String[][]{{"getAncestor", "int", "5"}, {"getDirectives", "", "6"}, {"getJSType", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:5>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.VarCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:3>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "DDOPoKr6Wc4cc:SwSS_CI\u00e9", "dF0uplicate"}, true, 0, null, 2), new String[][]{{"isQualifiedName", "", "5"}, {"getDirectives", "", "5"}, {"children", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$SiblingNodeIterable", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "RDDOPoKr6Wc5O;c:SwSS_CI\u00e9", "dF0v;licatpeWHILE noode"}, true, 0, null, 3), new String[][]{{"isQualifiedName", "", "1"}, {"getDirectives", "", "5"}, {"children", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$SiblingNodeIterable", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "RDDOPoIIr6WhIv;c:SSSS_B", "-UFH.223"}, true, 0, null, 1), new String[][]{{"isQualifiedName", "", "4"}, {"putProp", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [label_id_prop: 2] [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0,...#443#-757287758", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "RDssOPoIIr6WhIv;c:SSTS_C", "/2020-02-30T2"}, true, 0, null, 2), new String[][]{{"isQualifiedName", "", "4"}, {"putProp", "int,java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [break: ] [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getStrin...#434#-42510261", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:10>", "DssOQU3o4<I16VhIv;c:TSSFS_B \t", "Unexpected LABEL"}, true, 0, null, 1), new String[][]{{"isQualifiedName", "", "0"}, {"putProp", "int,java.lang.Object", "5"}, {"getAncestor", "int", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [break: ] [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getStrin...#434#-42510261", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "ssOQU3o<H6abHv;d:TT;", "110"}, true, 0, null, 2), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "0"}, {"getChildCount", "", "5"}, {"getSideEffectFlags", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "RrOQU4o<m6bzEHuv;yc:T123456789012345678901234577890\n0x1F", "0.5f"}, true, 0, null, 2), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "0"}, {"getChildCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "RrOQU4o<m6bzEHuv;yc:T123456789012345678:01234577890\n0x1F", "LABEL normalization"}, true), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "0"}, {"getChildCount", "", "3"}, {"putIntProp", "int,int", "2"}, {"getSideEffectFlags", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "_RrOQT4oz<m6byEHuv;yc:T1;H2345679012346789/1234577", "m.5Ne3"}, true, 0, null, 1), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "0"}, {"getChildCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "_QxrhOPT4nnz<m3b-Huv;c:T0;H2345679D2446789/123455771;5", "ca"}, true, 0, null, 2), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "7"}, {"getChildCount", "", "6"}, {"putIntProp", "int,int", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "_Qxrh44OPT4nnz<m3-Huv;c:T0;H234567:E3446799/223455770;5", "1Et-"}, true, 0, null, 1), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "7"}, {"getChildCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "-1.5", "duplicate"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "Hello, World", "1.6d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupp...#425#278129791", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "Hello, World", "1.6d"}, true, 0, null, 3), new String[][]{{"getExistingIntProp", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "Hello, World", "1.6d"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "Hifl", "1/688"}, true, 0, null, 3), new String[][]{{"getIntProp", "int", "0"}, {"isNoSideEffectsCall", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "duplicate", "123456789012345678901234567890"}, true), new String[][]{{"getAncestors", "", "7"}, {"iterator", "", "4"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:6>", "<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.VarCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:4>", "<sample:6>"}, {"com.google.javascript.jscomp.VarCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:0>", "<null>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>", "<sample:3>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.VarCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:6>", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "SW3N5MM:RiCBUIFzJ\n_-T.LR\010J5C_UNDEFbNED_VARIBLE", ">"}, true, 0, null, 3), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nSCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1]\n    LABEL 1 [sourcename:  [testcode] ]\n        LABEL_NAME SW3N5MM 1 [sourcename:  [testcode] ]\n        BLOCK 1 [sourcena...#1324#-111413531", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "{SyntheticVarsDeclar}", "TITLE"}, true, 0, null, 2), new String[][]{{"checkTreeTypeAwareEqualsSilent", "com.google.javascript.rhino.Node", "1"}, {"putBooleanProp", "int,boolean", "3"}, {"getNext", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "dF0uplicate", "FOR initializer"}, true, 0, null, 3), new String[][]{{"getQualifiedName", "", "1"}, {"getLineno", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "0x1FPT1H", "<a>b</>"}, true, 0, null, 3), new String[][]{{"getType", "", "2"}, {"addChildToBack", "com.google.javascript.rhino.Node", "5"}, {"getString", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "SW3N5MM:RiCBUIFzJ\n_-T.LR\010J5C_UNDEFbNED_VARIBLE", "Titlye5SC_UNDEFINED_VARIABLE"}, true, 0, null, 1), new String[][]{{"getAncestors", "", "7"}, {"iterator", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "SW3N5MM:RiCBUIFzJ\n_-T.LR\010J5C_UNDEFbNED_VARIBLE", "T<tlye5SC_UNDEFINED_VARIABLE"}, true, 0, null, 1), new String[][]{{"getAncestors", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "null", "4n/ll"}, true, 0, null, 2), new String[][]{{"getLineno", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "b+1", ".0.1.12r34567"}, true, 0, null, 2), new String[][]{{"getCharno", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "b+1", ".0.1.12r34567"}, true, 0, null, 2), new String[][]{{"getCharno", "", "4"}, {"putIntProp", "int,int", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [target: 2147483647] [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags...#446#624957272", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "W3N5MM:RiCBUIFzK\n_-S.LR\010J4C_UNDEFbNNEXD_VARIBLE1e10", "/5FOOR-JM var declbratiion"}, true, 0, null, 1), new String[][]{{"putIntProp", "int,int", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [enum: 5] [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getStri...#435#-1861123880", SearchInputFactory_scaffolding.observe(actual));
 }
}
