package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "reset", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceMap", "appendTo", "java.lang.Appendable,java.lang.String", "<sample:3>", "Infinity"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "reset", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceMap", "reset", ""}, {"com.google.javascript.jscomp.SourceMap", "appendTo", "java.lang.Appendable,java.lang.String", "<sample:3>", "Infinity"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "reset", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceMap", "setStartingPosition", "int,int", "31", "-2"}, {"com.google.javascript.jscomp.SourceMap", "reset", ""}, {"com.google.javascript.jscomp.SourceMap", "appendTo", "java.lang.Appendable,java.lang.String", "<sample:3>", "Infinity"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=-1, hasChildren=false, hasMoreTha...#373#1444327757", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "appendTo", new String[]{"java.lang.Appendable", "java.lang.String"}, new String[]{"<sample:0>", "<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceMap", "addMapping", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Position,com.google.javascript.jscomp.Position", "<sample:6>", "<sample:0>", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "setStartingPosition", new String[]{"int", "int"}, new String[]{"-2147483648", "32"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "setStartingPosition", new String[]{"int", "int"}, new String[]{"-2147483648", "32"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceMap", "appendTo", "java.lang.Appendable,java.lang.String", "<sample:0>", "string"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "setStartingPosition", new String[]{"int", "int"}, new String[]{"2147483647", "33"}, false, 10, new String[][]{{"com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", "java.lang.String", "[].join()"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "setStartingPosition", new String[]{"int", "int"}, new String[]{"2147483647", "33"}, false, 10, new String[][]{{"com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", "java.lang.String", "[].join()"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:3>", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=-1, hasChildren=false, hasMoreTha...#373#1444327757", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOF {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=0, hasChildren=true, hasMoreThanOne...#369#430767175", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=3, hasChildren=true, hasMoreT...#374#-1331295150", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GOTO 7 {getCharno=8, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=7, getQualifiedName=null, getString=!UnsupportedOperationException, getType=5, hasChildren=true, hasMoreThanOn...#369#279101180", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("IFNE 10 {getCharno=11, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=10, getQualifiedName=null, getString=!UnsupportedOperationException, getType=7, hasChildren=true, hasMoreTha...#372#-231894074", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING <a><b>t</b></a> {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=<a><b>t</b></a>, getType=40, hasChildren=false, hasMoreT...#376#-390277977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:13>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITAND {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=11, hasChildren=true, hasMoreTha...#373#-2060119847", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:12>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:1>", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}), new String[][]{{"isOptionalArg", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", new String[]{"java.lang.String"}, new String[]{"1.12345678901234567"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", new String[]{"java.lang.String"}, new String[]{"1.12334S678900234567a"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", "java.lang.String", "lastIndexOf"}, {"com.google.javascript.jscomp.SourceMap", "setStartingPosition", "int,int", "0", "2147483646"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", new String[]{"java.lang.String"}, new String[]{" k"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<null>"}}), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "2"}, {"putProp", "int,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<null>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:5>", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<null>", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "2"}, {"getSuppressions", "", "5"}, {"isSyntheticBlock", "", "4"}, {"cloneNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity 0 {getCharno=0, getChildCount=0, getDouble=-Infinity, getLineno=0, getQualifiedName=null, getString=!UnsupportedOperationException, getType=39, hasChildren=false, hasMoreThanOneChild=...#364#-30766505", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "2"}, {"getSuppressions", "", "5"}, {"isSyntheticBlock", "", "4"}, {"cloneNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=!UnsupportedOperationException, getType=3, hasChildren=false, hasMore...#376#1988282885", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "2"}, {"getSuppressions", "", "5"}, {"isSyntheticBlock", "", "4"}, {"cloneNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "2"}, {"getSuppressions", "", "5"}, {"isSyntheticBlock", "", "4"}, {"cloneNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=!UnsupportedOperationException, getType=1, hasChildren=false, hasMoreThanOn...#371#-1396227175", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:4>"}}, 3), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "2"}, {"getSuppressions", "", "5"}, {"isSyntheticBlock", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "appendTo", new String[]{"java.lang.Appendable", "java.lang.String"}, new String[]{"<sample:1>", "U2020-02-30T25:[61:61"}, false, 12, new String[][]{{"com.google.javascript.jscomp.SourceMap", "appendTo", "java.lang.Appendable,java.lang.String", "<sample:2>", "1L"}, {"com.google.javascript.jscomp.SourceMap", "setStartingPosition", "int,int", "2147483646", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "addMapping", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Position", "com.google.javascript.jscomp.Position"}, new String[]{"<sample:4>", "<sample:6>", "<sample:7>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "setStartingPosition", new String[]{"int", "int"}, new String[]{"2147483608", "-2147483648"}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceMap", "reset", ""}, {"com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", "java.lang.String", "1.5f"}, {"com.google.javascript.jscomp.SourceMap", "addMapping", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Position,com.google.javascript.jscomp.Position", "<sample:7>", "<sample:0>", "<sample:1>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<null>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "addMapping", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Position", "com.google.javascript.jscomp.Position"}, new String[]{"<sample:4>", "<null>", "<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:8>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:6>", "<sample:2>"}}, 2), new String[][]{{"getCharno", "", "3"}, {"getLineno", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:1>", "<sample:6>"}}, 3), new String[][]{{"getCharno", "", "3"}, {"getLineno", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "appendTo", new String[]{"java.lang.Appendable", "java.lang.String"}, new String[]{"<sample:0>", "2147483648"}, false, 4, new String[][]{{"com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", "java.lang.String", "string>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "addMapping", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Position", "com.google.javascript.jscomp.Position"}, new String[]{"<null>", "<sample:3>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceMap", "reset", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:7>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:2>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "reset", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.SourceMap", "appendTo", "java.lang.Appendable,java.lang.String", "<sample:1>", "0w1F"}, {"com.google.javascript.jscomp.SourceMap", "reset", ""}, {"com.google.javascript.jscomp.SourceMap", "addMapping", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Position,com.google.javascript.jscomp.Position", "<sample:1>", "<null>", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "addMapping", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Position", "com.google.javascript.jscomp.Position"}, new String[]{"<null>", "<sample:2>", "<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.SourceMap", "appendTo", "java.lang.Appendable,java.lang.String", "<sample:3>", ""}, {"com.google.javascript.jscomp.SourceMap", "appendTo", "java.lang.Appendable,java.lang.String", "<null>", ""}, {"com.google.javascript.jscomp.SourceMap", "addMapping", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Position,com.google.javascript.jscomp.Position", "<sample:2>", "<sample:7>", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "addMapping", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Position", "com.google.javascript.jscomp.Position"}, new String[]{"<sample:4>", "<sample:3>", "<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.SourceMap", "reset", ""}, {"com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", "java.lang.String", "undefined1.2yg]67"}, {"com.google.javascript.jscomp.SourceMap", "setStartingPosition", "int,int", "31", "2147483646"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "reset", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", "java.lang.String", "11"}, {"com.google.javascript.jscomp.SourceMap", "appendTo", "java.lang.Appendable,java.lang.String", "<sample:3>", "5"}, {"com.google.javascript.jscomp.SourceMap", "reset", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:4>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceMap", "appendTo", "java.lang.Appendable,java.lang.String", "<sample:3>", "Unknown shift operator: "}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "appendTo", new String[]{"java.lang.Appendable", "java.lang.String"}, new String[]{"<sample:0>", "null"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceMap", "addMapping", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Position,com.google.javascript.jscomp.Position", "<sample:7>", "<sample:3>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"appendStringTree", "java.lang.Appendable", "3"}, {"getLineno", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:9>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", new String[]{"java.lang.String"}, new String[]{"1.1L234567lengthJSC_DIVIDE_BY_0_ERROR"}, false, 1, new String[][]{{"com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", "java.lang.String", "joi\n"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "addMapping", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Position", "com.google.javascript.jscomp.Position"}, new String[]{"<sample:0>", "<null>", "<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", "java.lang.String", "-1.5"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<null>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "addMapping", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Position", "com.google.javascript.jscomp.Position"}, new String[]{"<null>", "<sample:4>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", new String[]{"java.lang.String"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<null>", "<sample:3>"}}, 1), new String[][]{{"getDirectives", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:6>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:3>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "addMapping", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.jscomp.Position", "com.google.javascript.jscomp.Position"}, new String[]{"<null>", "<sample:4>", "<sample:7>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.SourceMap", "addMapping", "com.google.javascript.rhino.Node,com.google.javascript.jscomp.Position,com.google.javascript.jscomp.Position", "<sample:6>", "<sample:3>", "<sample:7>"}, {"com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", "java.lang.String", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:8>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<null>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2), new String[][]{{"hasOneChild", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<null>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=2, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=!UnsupportedOperationException, getType=1, hasChildren=true, hasMoreThanOne...#369#-920249111", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, null, 1), new String[][]{{"isNoSideEffectsCall", "", "5"}, {"removeFirstChild", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, null, 1), new String[][]{{"isNoSideEffectsCall", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 2), new String[][]{{"getString", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:4>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:8>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "error", "com.google.javascript.jscomp.DiagnosticType,com.google.javascript.rhino.Node", "<sample:4>", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GOTO 7 {getCharno=8, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=7, getQualifiedName=null, getString=!UnsupportedOperationException, getType=5, hasChildren=true, hasMoreThanOn...#369#279101180", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:4>"}}, 1), new String[][]{{"removeChildAfter", "com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("LEAVEWITH {getCharno=-1, getChildCount=3, getDouble=!UnsupportedOperationException, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=3, hasChildren=true, hasMoreT...#374#-1331295150", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLineno=-1, getQualifiedName=null, getString=!UnsupportedOperationException, getType=39, hasChildren=false, hasMoreThanOneChild=...#364#507729729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 1), new String[][]{{"cloneNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("EOL 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=!UnsupportedOperationException, getType=1, hasChildren=false, hasMoreThanOn...#371#-1396227175", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("GOTO 7 {getCharno=8, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=7, getQualifiedName=null, getString=!UnsupportedOperationException, getType=5, hasChildren=true, hasMoreThanOn...#369#279101180", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:5>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:5>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:0>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "error", new String[]{"com.google.javascript.jscomp.DiagnosticType", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:11>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "areNodesEqualForInlining", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "reportCodeChange", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "beginTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.PeepholeFoldConstants", "com.google.javascript.jscomp.PeepholeFoldConstants", "optimizeSubtree", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.PeepholeFoldConstants", "isASTNormalized", ""}, {"com.google.javascript.jscomp.PeepholeFoldConstants", "endTraversal", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}), new String[][]{{"getDouble", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.SourceMap", "com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", new String[]{"java.lang.String"}, new String[]{"<null>"}, false, 10, new String[][]{{"com.google.javascript.jscomp.SourceMap", "setWrapperPrefix", "java.lang.String", "2.147483647E9"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
