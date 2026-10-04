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
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "a", "{\"a\":1}"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExc...#409#-1932167919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "a", "-0.0"}, true), new String[][]{{"isLocalResultCall", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "null", "1.5f"}, true), new String[][]{{"isLocalResultCall", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "[1,2]", "1.5e300"}, true), new String[][]{{"isLocalResultCall", "", "6"}, {"getJSDocInfo", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "PT1H", "a,b,c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExc...#409#-1932167919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "PT1I", "a,b,c"}, true, 0, null, 3), new String[][]{{"getJsDocBuilderForNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "\r1H5f", "tru>a b"}, true, 0, null, 3), new String[][]{{"isNoSideEffectsCall", "", "2"}, {"getParent", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "b", "trv>a b"}, true, 0, null, 3), new String[][]{{"isNoSideEffectsCall", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "1d10", "x"}, true), new String[][]{{"children", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "1d10", "x"}, true, 0, null, 2), new String[][]{{"children", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "1.5e300", "null"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:6>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<null>", "-F-1PV2HH", ""}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "20", "hut://example.com/a?b=c0x7FFFFFFF"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#424#-309491915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "duplicate", "hut9//example.cnm/a?b=c0x7FFFFFFF/a/a"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#424#-309491915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "TITLE", "1.12345678901234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#424#-309491915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "TITLE", "-1"}, true, 0, null, 1), new String[][]{{"getBooleanProp", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:10>", "WITLE", "f."}, true), new String[][]{{"removeChild", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "WIULD", "1.12345678-0.0"}, true, 0, null, 3), new String[][]{{"removeChild", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "IULD\n", "1.11355678-0.0"}, true, 0, null, 3), new String[][]{{"removeChild", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<null>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<null>"}, false, 3, new String[][]{}), new String[][]{{"isLocal", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<null>"}, false, 3, new String[][]{}, 1), new String[][]{{"isLocal", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<null>"}, false), new String[][]{{"isLocal", "", "3"}, {"getParent", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "2020-02-30T25:61:61", "true"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "2020-02-30T25:61:61", "true1L"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:11>", "2020-R.30T25:61:61Hello, World12:30:451.5e300", "The\037name -1W.5"}, true), new String[][]{{"getCharno", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "2020-R.30T25:61:61HHello, World12:30:451.5e300", "The\037name -1W.4"}, true), new String[][]{{"putIntProp", "int,int", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "2020-R.30T25:61:61HHello, Wor<ld12:30:451.5d300", "The"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "2020-R.30T25:61:61HHello, Wor<ld12:30:451.5d300", "She"}, true, 0, null, 2), new String[][]{{"putIntProp", "int,int", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "2020-R.30T25:61:u1HHello, Wor<ld12:30:451.5d300", "he0x123O56789"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "2020-R.30T25;61:u1HHello, Wor;ld12:30:451.5d300", "he0x123O56789"}, true, 0, null, 2), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:5>", "2020-R.30T25;61:u1HHello, Woreld12:30:451.5d300", "he0+x12I3O56789"}, true), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:3>", "1.223456789012346667", "he0+x12I3O56749"}, true), new String[][]{{"getJsDocBuilderForNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "2147483648", "1.12345678901234567"}, true), new String[][]{{"putProp", "int,java.lang.Object", "2"}, {"checkTreeEquals", "com.google.javascript.rhino.Node", "5"}, {"getString", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "g2147483648", "1.123456789012345567"}, true, 0, null, 1), new String[][]{{"putProp", "int,java.lang.Object", "2"}, {"checkTreeEquals", "com.google.javascript.rhino.Node", "5"}, {"getString", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "g2R47483648", "WHILE node"}, true, 0, null, 1), new String[][]{{"putProp", "int,java.lang.Object", "2"}, {"checkTreeEquals", "com.google.javascript.rhino.Node", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nSCRIPT 1 [label_id_prop: 2] [sourcename:  [testcode] ] [synthetic: 1]\n    EXPR_RESULT 1 [sourcename:  [testcode] ]\n        NAME g2R47483648 1 [sourcename:  [testcode] ]\n\n\n...#434#1897653347", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "g2R47482648", "HILE noae"}, true, 0, null, 1), new String[][]{{"putProp", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [label_id_prop: 2] [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0,...#443#-599761297", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "g2R47482648", "HILE noae"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#424#-309491915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "g2R4474V92638", "HvLE nae"}, true, 0, null, 1), new String[][]{{"checkTreeTypeAwareEqualsSilent", "com.google.javascript.rhino.Node", "2"}, {"getLastChild", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EXPR_RESULT 1 [sourcename:  [testcode] ] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperat...#413#-120980990", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "g2R4474V92638", "HvLE nae"}, true, 0, null, 1), new String[][]{{"checkTreeTypeAwareEqualsSilent", "com.google.javascript.rhino.Node", "2"}, {"getLastChild", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "<null>", "http://example.com/a?b=c"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<sample:6>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", " ", "Ba\037b"}, true, 0, null, 2), new String[][]{{"detachChildren", "", "0"}, {"cloneNode", "", "3"}, {"getChildAtIndex", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", " ", "Ba\037b"}, true, 0, null, 2), new String[][]{{"detachChildren", "", "0"}, {"cloneNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [testcode] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationExc...#409#-1932167919", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:7>", "", "B\037\037b"}, true, 0, null, 2), new String[][]{{"detachChildren", "", "0"}, {"cloneNode", "", "3"}, {"addSuppression", "java.lang.String", "2"}, {"isOnlyModifiesThisCall", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:2>", "12:30:45", "1.12345678901234567"}, true, 0, null, 2), new String[][]{{"getAncestors", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "-1", "1/12346678901234567"}, true, 0, null, 2), new String[][]{{"isUnscopedQualifiedName", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<null>", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<null>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<null>"}}), new String[][]{{"getOwnSlot", "java.lang.String", "2"}, {"getVarCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:8>", "<null>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:4>"}}), new String[][]{{"getOwnSlot", "java.lang.String", "2"}, {"getVarCount", "", "4"}, {"isGlobal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:7>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:10>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>"}, {"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:1>"}, {"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<null>"}, false), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOF {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=0, hasChildre...#377#575037193", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:10>", "<sample:4>"}}, 1), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOF {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=0, hasChildre...#377#575037193", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:6>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:10>", "<sample:4>"}}, 1), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=39, hasChildren=false...#372#-162157149", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:10>", "<sample:4>"}}, 1), new String[][]{{"getRootNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationException, getType=3, hasC...#382#85513908", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "hut9//example.cnm/a?b=c0x7FFFFFFF/a/a", "hut9//example.cnm/a?b=c0x7FFFFFFF/a/a"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupp...#425#278129791", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "ut9//example.cnm/a?b=c0xFFGFFFF/a/a", "WHLL nodeTITLE"}, true, 0, null, 3), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "21234+67", "http://example.com/a?b=c"}, true), new String[][]{{"getDirectives", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "N1", "nu9ll"}, true, 0, null, 2), new String[][]{{"hasChildren", "", "3"}, {"removeChildAfter", "com.google.javascript.rhino.Node", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "I", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupp...#425#278129791", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "I", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOperationEx...#410#-136846375", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "I", "1"}, true, 0, null, 3), new String[][]{{"putProp", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [label_id_prop: 2] [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0...#444#-130286459", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "I1.1234567", "1"}, true, 0, null, 3), new String[][]{{"putProp", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BLOCK [label_id_prop: 2] [sourcename:  [synthetic] ] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getString=!Uns...#429#1306808289", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "BC", "Ynuggj"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "BC", "Ynuggj"}, true, 0, null, 3), new String[][]{{"getChildCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:5>"}, {"com.google.javascript.jscomp.Normalize", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:10>", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "OI", "Y7/21474937g8T/tle"}, true), new String[][]{{"removeChildAfter", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "NI", "1.1234567"}, true, 0, null, 3), new String[][]{{"getProp", "int", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "L1Ee0", "The aa`me "}, true, 0, null, 1), new String[][]{{"copyInformationFromForTree", "com.google.javascript.rhino.Node", "2"}, {"getChildCount", "", "5"}, {"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "L1Ef0", "The aa_me "}, true, 0, null, 1), new String[][]{{"copyInformationFromForTree", "com.google.javascript.rhino.Node", "2"}, {"getChildCount", "", "5"}, {"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("125", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "L1Ef0", "The aa_me "}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "L2vf1 -0.0", "1.12345678901234561.12345678"}, true, 0, null, 1), new String[][]{{"copyInformationFromForTree", "com.google.javascript.rhino.Node", "2"}, {"getChildCount", "", "0"}, {"getType", "", "7"}, {"hasOneChild", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "L2vf1 -0.01.25", "1.12345678901234561.12345678"}, true, 0, null, 1), new String[][]{{"copyInformationFromForTree", "com.google.javascript.rhino.Node", "2"}, {"getChildCount", "", "0"}, {"getType", "", "7"}, {"hasOneChild", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "LL7,v1pR", "1.034-5D6701/"}, true, 0, null, 2), new String[][]{{"children", "", "6"}, {"iterator", "", "0"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "LL7,v1oR", "1.034-5_D6701y"}, true, 0, null, 2), new String[][]{{"children", "", "6"}, {"iterator", "", "0"}, {"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "hu,t9//ewaBplIf.bnn/a?b=", ""}, true, 0, null, 1), new String[][]{{"children", "", "6"}, {"iterator", "", "0"}, {"next", "", "2"}, {"getLastSibling", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EXPR_RESULT 1 [sourcename:  [synthetic] ] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!UnsupportedOpera...#414#1141064468", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "pHelf,-ci3rfmd0yFGFFFFFFagummeXss", "1.12d445687BFOR initializer"}, true, 0, null, 1), new String[][]{{"isLocalResultCall", "", "4"}, {"getDouble", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "G__1fx1F", "/X-@@"}, true, 0, null, 1), new String[][]{{"getLastSibling", "", "1"}, {"addChildrenToBack", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [synthetic] ] [synthetic: 1] {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsupp...#425#120603330", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "H._1fx1F\u00e9", "/X-.B"}, true), new String[][]{{"hasOneChild", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeSyntheticCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:1>", "P:E\rG.A00127", "zeaom UU.nslc-1L.51<a>b</a"}, true, 0, null, 3), new String[][]{{"getType", "", "1"}, {"hasMoreThanOneChild", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "Function declaration", "???"}, true, 0, null, 2), new String[][]{{"detachFromParent", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:0>", "null", "0"}, true, 0, null, 2), new String[][]{{"getCharno", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:1>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:0>"}, {"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:3>"}, {"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:1>"}}), new String[][]{{"getVars", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:10>", "<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:3>"}, {"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:4>", "<sample:4>"}, {"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:6>", "1.12345678901234567", "{\"a\"F:1}"}, true, 0, null, 2), new String[][]{{"copyInformationFromForTree", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 1 [sourcename:  [testcode] ] [synthetic: 1] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getString=!Unsuppo...#424#-309491915", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:9>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:1>", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<null>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.jscomp.Scope", actual.getClass().getName());
  assertEquals("{getVarCount=0, isGlobal=true, isLocal=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "H._1fx1F\u00e9", "12:30:45"}, true, 0, null, 3), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "5"}, {"getSideEffectFlags", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:4>", "hut9//exa", "2o265.b/n12:30:45"}, true, 0, null, 3), new String[][]{{"putIntProp", "int,int", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<null>"}, false), new String[][]{{"getRootNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:3>"}, {"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:10>", "<sample:3>"}}, 2), new String[][]{{"getVarCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:3>", "<sample:1>"}, {"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:10>", "<sample:3>"}}, 2), new String[][]{{"getParentScope", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:4>", "<null>"}, false, 0, null, 3), new String[][]{{"getSlot", "java.lang.String", "0"}, {"getParentScope", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:5>", "<null>"}, false, 0, null, 1), new String[][]{{"getSlot", "java.lang.String", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:7>", "<sample:5>"}, {"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:5>", "<sample:6>"}}, 1), new String[][]{{"getVarCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:2>", "<null>"}, false, 0, null, 2), new String[][]{{"isLocal", "", "7"}, {"getRootNode", "", "6"}, {"getNext", "", "4"}, {"getAncestors", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:7>", "<null>"}, false, 0, null, 3), new String[][]{{"getParentScope", "", "7"}, {"getVars", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.LinkedHashMap$LinkedValueIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<null>", "<sample:7>"}, false, 13, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SyntacticScopeCreator", "com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Scope"}, new String[]{"<sample:0>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.SyntacticScopeCreator", "createScope", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Scope", "<sample:0>", "<sample:5>"}}, 3), new String[][]{{"isLocal", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.Normalize", "com.google.javascript.jscomp.Normalize", "parseAndNormalizeTestCode", new String[]{"com.google.javascript.jscomp.AbstractCompiler", "java.lang.String", "java.lang.String"}, new String[]{"<sample:8>", "mP:\rHL41w1F1mu:ll", "P:Eo..A00uu237"}, true, 0, null, 3), new String[][]{{"detachFromParent", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
}
