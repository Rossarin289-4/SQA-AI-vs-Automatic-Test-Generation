package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<sample:3>", "1.5d", "<sample:5>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#391#1601328106", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<sample:3>", "1.5d", "<sample:7>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#391#1601328106", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<sample:3>", "1.5d", "<sample:5>", "<sample:0>"}, true), new String[][]{{"getSourceFileName", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<sample:3>", "1.5d", "<sample:0>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=null, getSideEffectFlags...#403#-152619010", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<null>", "1.5d", "<sample:5>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483...#359#1926735730", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<null>", "<sample:1>", "/* @export", "<sample:6>", "<sample:0>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<sample:1>", "/* @", "<sample:6>", "<sample:0>"}, true), new String[][]{{"getJSDocInfo", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:5>", "<sample:2>", "foun", "<sample:5>", "<sample:2>"}, true), new String[][]{{"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}, {"hasChildren", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:3>", "<sample:6>", "a,b,c", "<sample:3>", "<sample:4>"}, true), new String[][]{{"isArrayLit", "", "0"}, {"getNext", "", "0"}, {"getLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:3>", "<sample:6>", "1E-5", "<sample:2>", "<sample:4>"}, true), new String[][]{{"isArrayLit", "", "0"}, {"getNext", "", "0"}, {"getLength", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:6>", "1E-5", "<sample:5>", "<sample:6>"}, true), new String[][]{{"isArrayLit", "", "0"}, {"getNext", "", "0"}, {"getLength", "", "7"}, {"getSourceFileName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:5>", "1E-5", "<sample:5>", "<sample:6>"}, true), new String[][]{{"isArrayLit", "", "0"}, {"getNext", "", "0"}, {"getLength", "", "7"}, {"getSourceFileName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:5>", "1E,5", "<sample:5>", "<sample:6>"}, true, 0, null, 3), new String[][]{{"isArrayLit", "", "0"}, {"getNext", "", "0"}, {"getLength", "", "7"}, {"getSourceFileName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:4>", "1E,5", "<sample:5>", "<sample:6>"}, true, 0, null, 3), new String[][]{{"isArrayLit", "", "0"}, {"getNext", "", "0"}, {"getLength", "", "7"}, {"getSourceFileName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:7>", "1E,5enum", "<sample:5>", "<sample:6>"}, true, 0, null, 3), new String[][]{{"isArrayLit", "", "0"}, {"getNext", "", "0"}, {"getLength", "", "7"}, {"getSourceFileName", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<sample:5>", "0xFFvFFFFF", "<sample:3>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "0"}, {"getSideEffectFlags", "", "1"}, {"getString", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<null>", "<sample:7>", "0xFFvFFFFF", "<sample:3>", "<sample:0>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<null>", "<sample:4>", "1.5f", "<sample:1>", "<sample:1>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:1>", "J", "<sample:1>", "<sample:7>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#387#248447652", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<sample:0>", "implements", "<sample:1>", "<sample:3>"}, true, 0, null, 1), new String[][]{{"getJSType", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:4>", "invalid increment taqget", "<sample:7>", "<sample:10>"}, true, 0, null, 3), new String[][]{{"appendStringTree", "java.lang.Appendable", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#394#2002496861", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:0>", "<sample:5>", "2020-01-01", "<sample:4>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"getQualifiedName", "", "5"}, {"isCall", "", "1"}, {"getLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:3>", "<null>", "1.6", "<sample:4>", "<sample:4>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=2147483...#359#1926735730", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:2>", "i", "<sample:5>", "<sample:2>"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourc...#387#-448412686", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<sample:3>", "i", "<sample:7>", "<sample:2>"}, true, 0, null, 3), new String[][]{{"getType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("132", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:1>", "<sample:0>", "i", "<sample:7>", "<sample:3>"}, true, 0, null, 2), new String[][]{{"getExistingIntProp", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:0>", "<sample:5>", "0x1F", "<sample:3>", "<sample:3>"}, true, 0, null, 3), new String[][]{{"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<sample:4>", "", "<sample:1>", "<sample:4>"}, true, 0, null, 2), new String[][]{{"getJSType", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:5>", "<sample:3>", "1L", "<sample:2>", "<sample:8>"}, true, 0, null, 2), new String[][]{{"getDirectives", "", "0"}, {"addSuppression", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [jsdoc_info: JSDocInfo] [source_file: GeneratedTestInputProxy] [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=...#427#-2137662561", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:3>", "<sample:3>", "1L", "<sample:3>", "<sample:1>"}, true, 0, null, 2), new String[][]{{"getDirectives", "", "0"}, {"addSuppression", "java.lang.String", "4"}, {"getInputId", "", "2"}, {"hasOneChild", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:1>", "<sample:1>", "use strict", "<sample:3>", "<sample:5>"}, true, 0, null, 1), new String[][]{{"hasChildren", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:2>", "<sample:1>", "us stricct", "<sample:3>", "<sample:8>"}, true, 0, null, 1), new String[][]{{"hasChildren", "", "4"}, {"getChildCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<null>", "it0le", "<sample:3>", "<sample:4>"}, true, 0, null, 1), new String[][]{{"getParent", "", "4"}, {"getChildCount", "", "2"}, {"getSideEffectFlags", "", "5"}, {"copyInformationFrom", "com.google.javascript.rhino.Node", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT 7 {getCharno=8, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=7, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-214748...#363#-865753054", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:6>", "<sample:3>", "protectedi", "<sample:6>", "<null>"}, true, 0, null, 1), new String[][]{{"getAncestor", "int", "2"}, {"appendStringTree", "java.lang.Appendable", "2"}, {"getLastSibling", "", "2"}, {"getCharno", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:4>", "<null>", "enum1.5d", "<sample:0>", "<sample:4>"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOf...#371#-374859426", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<sample:8>", "00px1F", "<sample:3>", "<sample:8>"}, true, 0, null, 2), new String[][]{{"getChildCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.IRFactory", "com.google.javascript.jscomp.parsing.IRFactory", "transformTree", new String[]{"com.google.javascript.rhino.head.ast.AstRoot", "com.google.javascript.rhino.jstype.StaticSourceFile", "java.lang.String", "com.google.javascript.jscomp.parsing.Config", "com.google.javascript.rhino.head.ErrorReporter"}, new String[]{"<sample:7>", "<sample:4>", "2ft\n<1.5e300", "<sample:6>", "<null>"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("SCRIPT [source_file: GeneratedTestInputProxy] [length: 1] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=-1, getQualifiedName=null, getSideEffectFlags...#406#-1558880055", SearchInputFactory_scaffolding.observe(actual));
 }
}
