package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "http://example.com/a?b=c", "21e7483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExc...#409#-1932167919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "1e10", "-1010"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#424#-309491915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "2147482648", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "..5", "0x123456789abc"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExc...#409#-1932167919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "Ttle1.25", "2020-01-01"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:0>", "<sample:2>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.VarCheck", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "Ttle1.25", "."}, true), new String[][]{{"hasChildren", "", "0"}, {"isOnlyModifiesThisCall", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:0>", "<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.VarCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:6>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "Title-1.5", "TIULE"}, true), new String[][]{{"getParent", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:6>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:2>", "<sample:2>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.VarCheck", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:6>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "Function decla", "1.123456/78"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExc...#409#-1932167919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", ",1", "null"}, true, 0, null, 2), new String[][]{{"getSideEffectFlags", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "5.", "R"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#424#-309491915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "The name!", "122:30:45"}, true), new String[][]{{"putBooleanProp", "int,boolean", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [label_id_prop: 1] [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsu...#428#-1617134230", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "SitleTitle", "1..5d"}, true), new String[][]{{"getFirstChild", "", "6"}, {"getLastSibling", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EXPR_RESULT 1 [sourcename:  [testcode] ] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperat...#413#-120980990", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "011", "The name --1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:0>", "<sample:2>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:5>", "<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "a,b,c", "2020,02-30T25:61:61"}, true), new String[][]{{"getString", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "x1FFOR-IN var declaration", "i"}, true), new String[][]{{"children", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "Laa,b,c", "a,b,c1.5e300"}, true), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "2"}, {"getLineno", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "2020-02-30T25:61:61 ", "FOR-IN var declaration"}, true), new String[][]{{"hasSideEffects", "", "4"}, {"isQuotedString", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "\u00e9x", "Ttle1-25"}, true), new String[][]{{"getCharno", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.VarCheck", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:7>", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:0>", "<null>"}, false, 3, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "2020-02-30A255:61:61", "1.24"}, true), new String[][]{{"getDouble", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "WHILE node123456789012345678901234567890", ""}, true), new String[][]{{"getAncestors", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:5>", "<sample:0>"}, false, 2, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "12:30:45", "<a>b</a>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:2>", "<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "+1", "1"}, true, 0, null, 1), new String[][]{{"appendStringTree", "java.lang.Appendable", "6"}, {"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("125", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "JSC_UNDEFINED_VARIABLE", "j"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:11>", "nulm", "H"}, true, 0, null, 2), new String[][]{{"isQualifiedName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "PT1H-1.5", "abc0x128456789"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:11>", "FOR-IN war declasation", "1.25"}, true, 0, null, 2), new String[][]{{"addSuppression", "java.lang.String", "2"}, {"getLastChild", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "Hello, World1.1234567", "5.trueTITLE"}, true, 0, null, 2), new String[][]{{"getCharno", "", "5"}, {"getString", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "1/25a,b,c", "[1L-2]"}, true), new String[][]{{"getParent", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "[[1,2]", "TITLE"}, true, 0, null, 1), new String[][]{{"isQualifiedName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "{SyntheticVarsDecla9r}", "1.5g"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#424#-309491915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "abc", "TITLE010"}, true, 0, null, 3), new String[][]{{"getBooleanProp", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "1.5g", "a,b,c"}, true, 0, null, 3), new String[][]{{"putIntProp", "int,int", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [label_id_prop: 1] [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsu...#428#-1617134230", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "2e10", "0{\"a\":1}"}, true, 0, null, 2), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "1e10i", "cttp://example.com/a?b=c"}, true), new String[][]{{"copyInformationFromForTree", "com.google.javascript.rhino.Node", "2"}, {"clonePropsFrom", "com.google.javascript.rhino.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "2147/483648", "null1e10"}, true, 0, null, 3), new String[][]{{"getChildAtIndex", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "<a>c</a>", "L@BXEL normalization"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExc...#409#-1932167919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "Empty VAR node.1.25", "2020-01-01"}, true, 0, null, 2), new String[][]{{"getIntProp", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "0xFFFFFFFF ", "2147483648Hello, World"}, true), new String[][]{{"removeChildAfter", "com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "Title", ""}, true, 0, null, 3), new String[][]{{"getExistingIntProp", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:10>", "D\n", "1.1234567\u00e9"}, true, 0, null, 2), new String[][]{{"hasMoreThanOneChild", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "\n", " -"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupp...#427#1569983612", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "1LL", "1.5f-1 "}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "XSC_UNDEFINED_VARIABLE", "0x1234X56789The name "}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#424#-309491915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "1.5d", "null"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "nul1.25", "FOR initializer"}, true, 0, null, 2), new String[][]{{"removeChildAfter", "com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "0x1F", "-0.0"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupp...#425#278129791", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "-0.0", ""}, true, 0, null, 3), new String[][]{{"getFirstChild", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "Unexpected variable -1 ", "01.5The name "}, true, 0, null, 3), new String[][]{{"children", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:4>", "<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "JSC_UNDEFI1NED_VARIABLE", "+1FOR initializer"}, true, 0, null, 3), new String[][]{{"getDirectives", "", "3"}, {"getChildCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "1.a5\t", "dupliccat"}, true, 0, null, 2), new String[][]{{"removeChild", "com.google.javascript.rhino.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "-1.0", "Hello, World1234567890123456789012345678905."}, true, 0, null, 1), new String[][]{{"getCharno", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "0.i", "<a>b</a>SyntheticVarsDeclar}"}, true, 0, null, 3), new String[][]{{"detachFromParent", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "JSC_UNDEFI;NED_VARIABLE", "JSC_UNDEFINED_VARIABLE"}, true, 0, null, 1), new String[][]{{"removeChildAfter", "com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "1.5d", "WHJLE nnode"}, true, 0, null, 2), new String[][]{{"putProp", "int,java.lang.Object", "4"}, {"getProp", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "{SyntheticVarsDeclar}", "I21e74883648"}, true, 0, null, 3), new String[][]{{"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("125", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "<null>", "-zz"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "1e10", "0"}, true, 0, null, 1), new String[][]{{"hasChildren", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "123456789012345778901234567890Function declaration", "Ttle1.25"}, true, 0, null, 3), new String[][]{{"isSyntheticBlock", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "1e10", "TITLE"}, true, 0, null, 1), new String[][]{{"getLineno", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "123456789012345678901234567890", " 1.5d"}, true, 0, null, 1), new String[][]{{"getString", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<null>", "<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<null>", "<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "1e00", "1.25"}, true, 0, null, 1), new String[][]{{"getChildAtIndex", "int", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.VarCheck", "com.google.javascript.jscomp.VarCheck", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<null>", "<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "+1", "TIULE"}, true, 0, null, 2), new String[][]{{"removeChildAfter", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "JSC_UNDEFINED_VARIABLE", "TITLE"}, true, 0, null, 1), new String[][]{{"getIntProp", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "1.12445678", " "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupp...#425#278129791", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "", "1.4e300"}, true, 0, null, 2), new String[][]{{"getLineno", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "1", "\013"}, true, 0, null, 1), new String[][]{{"getJSDocInfo", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:9>", "{SyntheticVarsDeclar}", "Empty VAR node."}, true, 0, null, 3), new String[][]{{"putProp", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [label_id_prop: 2] [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!Uns...#429#1306808289", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "1.5ftrue", "FOR initializer"}, true, 0, null, 1), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "Ttle1.R25", "{\"a\":1}"}, true, 0, null, 3), new String[][]{{"getProp", "int", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "-{\"a\":1}", "Stle1.R252020-02-30T25:61:61"}, true), new String[][]{{"isOptionalArg", "", "5"}, {"isLocalResultCall", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "TIU:E", "The name "}, true), new String[][]{{"isOptionalArg", "", "1"}, {"getIntProp", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
}
