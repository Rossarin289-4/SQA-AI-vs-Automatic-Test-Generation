package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:7>", "immplements", "<sample:4>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#391#2118570349", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<sample:3>", "ulk", "<sample:6>", "<sample:6>"}, true), new String[][]{{"children", "", "5"}, {"retainAll", "java.util.Collection", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:0>", "<null>", "1.\\5", "<sample:4>", "<sample:3>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483...#359#1926735730", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:5>", "<sample:5>", "2020-02-30T25:61:61", "<sample:6>", "<sample:5>"}, true), new String[][]{{"getLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<sample:6>", "", "<sample:2>", "<sample:5>"}, true), new String[][]{{"getJsDocBuilderForNode", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:1>", "/) @", "<sample:2>", "<sample:0>"}, true, 0, null, 2), new String[][]{{"getNext", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:7>", "consst", "<sample:0>", "<sample:0>"}, true), new String[][]{{"getExistingIntProp", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:7>", "a,E,c", "<sample:0>", "<sample:6>"}, true), new String[][]{{"getChildBefore", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:1>", "0e1", "<sample:1>", "<sample:7>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#387#248447652", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:3>", "<sample:4>", "20\r0-/1-01", "<sample:10>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getProp", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<sample:8>", "/* @", "<sample:3>", "<sample:2>"}, true), new String[][]{{"children", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:5>", "<null>", "1.53001.5e300", "<sample:8>", "<sample:4>"}, true), new String[][]{{"detachChildren", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483...#359#1926735730", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:1>", "<sample:4>", "1.55e300", "<sample:7>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"getSourcePosition", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<null>", "011", "<sample:2>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOf...#371#-374859426", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<sample:2>", "Unsupported syntax: ", "<sample:2>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=null, getSideEffectFlags...#399#257413638", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:1>", "++1", "<sample:4>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"isAssignAdd", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:1>", "Hello, Worldunknown lanIguage mode", "<sample:2>", "<sample:6>"}, true), new String[][]{{"getJSType", "", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:9>", "<sample:6>", "0xy1F", "<sample:5>", "<sample:0>"}, true), new String[][]{{"getChildCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:0>", "exort", "<sample:4>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"isAssignAdd", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:4>", "\\u", "<sample:7>", "<sample:6>"}, true, 0, null, 1), new String[][]{{"getQualifiedName", "", "2"}, {"isBreak", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:3>", "<sample:5>", "immplements1.1234567", "<null>", "<sample:7>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:0>", "<sample:2>", "1/* @", "<sample:3>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getCharno", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<null>", "enum", "<sample:0>", "<sample:10>"}, true, 0, null, 1), new String[][]{{"getJSType", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:1>", "<sample:7>", "1", "<sample:0>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=null, getSideEffectFlags...#403#364623233", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:8>", "<sample:0>", "0x123456789I", "<sample:0>", "<sample:9>"}, true, 0, null, 3), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "1"}, {"children", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$SiblingNodeIterable", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<sample:5>", "packagge", "<sample:0>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=null, getSideEffectFlags...#398#1808445908", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:0>", "<sample:8>", "invalid increment targdtenum", "<sample:2>", "<null>"}, true, 0, null, 1), new String[][]{{"getJsDocBuilderForNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:1>", "<sample:1>", "0x1", "<sample:0>", "<sample:6>"}, true, 0, null, 2), new String[][]{{"getProp", "int", "7"}, {"getString", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:10>", "<sample:5>", "a,b,c", "<sample:3>", "<sample:0>"}, true, 0, null, 1), new String[][]{{"getString", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:5>", "<sample:1>", "extens", "<sample:1>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getSideEffectFlags", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:2>", "1.12345678901234567", "<sample:4>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:8>", "<null>", "import1E-5", "<sample:2>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"isAdd", "", "2"}, {"getLineno", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:9>", "<sample:6>", "\nrue", "<sample:0>", "<null>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=null, getSideEffectFlags...#398#24279718", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:3>", "<sample:7>", "1.5", "<sample:3>", "<sample:7>"}, true, 0, null, 1), new String[][]{{"checkTreeEquals", "com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<null>", "1.5e200", "<sample:1>", "<null>"}, true, 0, null, 3), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483...#359#1926735730", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:5>", "a,b,c", "<sample:0>", "<sample:9>"}, true, 0, null, 2), new String[][]{{"getJsDocBuilderForNode", "", "0"}, {"append", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<null>", "202/-02-30T25:61:61", "<sample:6>", "<null>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOf...#371#-374859426", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:10>", "<sample:5>", "1.12345578", "<sample:2>", "<sample:0>"}, true, 0, null, 3), new String[][]{{"getDouble", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
}
