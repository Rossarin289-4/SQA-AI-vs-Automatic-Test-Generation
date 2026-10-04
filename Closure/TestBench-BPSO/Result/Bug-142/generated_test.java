package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msgg.jsd5oc.const"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msgg.jsd5oc.const 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=msgg.jsd5oc.const, getType=40, hasChildren=false, hasM...#380#-981202209", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:4>"}, false, 4, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<sample:5>", "<sample:2>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}, {"com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"PRE\nSERVE"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING PRE 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=PRE, getType=40, hasChildren=false, hasMoreThanOneChild=false, hasOn...#352#1555147935", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:1>", "<sample:4>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"+"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING + 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=+, getType=40, hasChildren=false, hasMoreThanOneChild=false, hasOneChi...#348#1964738783", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:8>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:3>", "<sample:4>"}, {"com.google.javascript.jscomp.CoalesceVariableNames", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:2>", "<sample:0>", "<sample:9>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:4>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:7>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:2>", "<sample:5>"}, {"com.google.javascript.jscomp.CoalesceVariableNames", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:6>", "<sample:1>", "<null>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.5"}, true), new String[][]{{"hasOneChild", "", "5"}, {"checkTreeEquals", "com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Node tree inequality:\nTree1:\nSTRING 1.5 0\n\n\nTree2:\nLEAVEWITH\n    GOTO 7\n        SETNAME\n    IFEQ\n        SETNAME 12\n            BITXOR\n            BITAND 12\n            EQ 16\n        BITOR 32\n        ...#874#-1494304061", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"110"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 110 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=110, getType=40, hasChildren=false, hasMoreThanOneChild=false, hasOn...#352#294497663", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}, {"com.google.javascript.jscomp.CoalesceVariableNames", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"i1.12345678901234567Title"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING i1.12345678901234567Title 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=i1.12345678901234567Title, getType=40, hasChil...#396#-1303408609", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"mtg.jsdoc.const"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING mtg.jsdoc.const 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=mtg.jsdoc.const, getType=40, hasChildren=false, hasMoreT...#376#154074047", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"-1.44"}, true, 0, null, 3), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING -1.44 0 {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=-1.44, getType=40, hasChildren=true, hasMoreThanOneChild=false, ha...#354#1371975692", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 1), new String[][]{{"removeFirstChild", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:4>", "<sample:9>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<null>", "<sample:6>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "enterScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "enterScope", "com.google.javascript.jscomp.NodeTraversal", "<null>"}, {"com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:3>", "<sample:2>"}, {"com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"sg.jsdoc.authormissing"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING sg.jsdoc.authormissing 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=sg.jsdoc.authormissing, getType=40, hasChildren=f...#390#-2059008693", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"4."}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 4. 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=4., getType=40, hasChildren=false, hasMoreThanOneChild=false, hasOneC...#350#1854817115", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.bad.jsdoc.tag"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.bad.jsdoc.tag 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=msg.bad.jsdoc.tag, getType=40, hasChildren=false, hasM...#380#-1289709793", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:5>", "<sample:0>", "<sample:5>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:7>", "<null>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"+10"}, true), new String[][]{{"hasChild", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:6>", "<sample:6>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"NEXT_IS_ANNOTATION1.123456-78"}, true), new String[][]{{"getFirstChild", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"`bbc"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING `bbc 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=`bbc, getType=40, hasChildren=false, hasMoreThanOneChild=false, has...#354#636430025", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:5>", "<null>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg..b"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg..b 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=msg..b, getType=40, hasChildren=false, hasMoreThanOneChild=false,...#358#-1471666931", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"TQIM"}, true, 0, null, 3), new String[][]{{"putProp", "int,java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.incompat.type"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jsdoc.incompat.type 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=msg.jsdoc.incompat.type, getType=40, hasChildren...#392#655564255", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.Wxterns"}, true, 0, null, 2), new String[][]{{"getType", "", "6"}, {"addChildrenToFront", "com.google.javascript.rhino.Node", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jsdoc.Wxterns 0 {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=msg.jsdoc.Wxterns, getType=40, hasChildren=true, hasMo...#378#-168126484", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.L1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.L1 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=1.L1, getType=40, hasChildren=false, hasMoreThanOneChild=false, has...#354#1698909131", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.j5doc.incompat.type"}, true, 0, null, 2), new String[][]{{"removeChild", "com.google.javascript.rhino.Node", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"TITLE$u"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING TITLE$u 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=TITLE$u, getType=40, hasChildren=false, hasMoreThanOneChild=fals...#360#1885076831", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {getBlockDescription=null, getDeprecationReason=null, getDescription=null, getFileOverview=null, getImplementedInterfaceCount=0, getLicense=null, getParameterCount=0, getReturnDescription=nu...#377#1127273843", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"5i"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 5i 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=5i, getType=40, hasChildren=false, hasMoreThanOneChild=false, hasOneC...#350#-1230006233", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "shouldTraverse", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:0>", "<sample:6>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"nul2+1"}, true, 0, null, 3), new String[][]{{"children", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"9msgg.jsd5oc.const"}, true, 0, null, 2), new String[][]{{"isEquivalentTo", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"-1.4"}, true, 0, null, 2), new String[][]{{"putProp", "int,java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING -1.4 0 [label_id_prop: 2] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=-1.4, getType=40, hasChildren=false, hasMoreThan...#373#664590075", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "process", new String[]{"com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:3>", "<null>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"TITTE"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING TITTE 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=TITTE, getType=40, hasChildren=false, hasMoreThanOneChild=false, h...#356#-662606081", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.javadispatch1.12345678901233567"}, true, 0, null, 2), new String[][]{{"getParent", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"5,"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 5 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=5, getType=40, hasChildren=false, hasMoreThanOneChild=false, hasOneChi...#348#-2078163169", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msf.bad.jsdoc.tag"}, true, 0, null, 1), new String[][]{{"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"2020-01,30T25:61:61"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 2020-01 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=2020-01, getType=40, hasChildren=false, hasMoreThanOneChild=fals...#360#1944159295", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"I-0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING I-0.0 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=I-0.0, getType=40, hasChildren=false, hasMoreThanOneChild=false, h...#356#440481471", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"null"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING null 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=null, getType=40, hasChildren=false, hasMoreThanOneChild=false, has...#354#942269249", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:9>", "<sample:3>", "<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "shouldTraverse", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:0>", "<sample:5>", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 0xFFFFFFFF 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=0xFFFFFFFF, getType=40, hasChildren=false, hasMoreThanOneChil...#366#-1187505089", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"*"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("STAR 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=!UnsupportedOperationException, getType=302, hasChildren=false, hasMoreTha...#374#-1969991547", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {getBlockDescription=null, getDeprecationReason=null, getDescription=null, getFileOverview=null, getImplementedInterfaceCount=0, getLicense=null, getParameterCount=0, getReturnDescription=nu...#377#1127273843", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:1>"}}), new String[][]{{"getImplementedInterfaceCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}), new String[][]{{"hasTypedefType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "visit", new String[]{"com.google.javascript.jscomp.NodeTraversal", "com.google.javascript.rhino.Node", "com.google.javascript.rhino.Node"}, new String[]{"<sample:1>", "<sample:4>", "<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", "com.google.javascript.jscomp.NodeTraversal", "<sample:2>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "visit", "com.google.javascript.jscomp.NodeTraversal,com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:4>", "<sample:1>", "<sample:2>"}, {"com.google.javascript.jscomp.CoalesceVariableNames", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:9>", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {getBlockDescription=null, getDeprecationReason=null, getDescription=null, getFileOverview=null, getImplementedInterfaceCount=0, getLicense=null, getParameterCount=0, getReturnDescription=nu...#377#1127273843", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"("}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.CoalesceVariableNames", "com.google.javascript.jscomp.CoalesceVariableNames", "exitScope", new String[]{"com.google.javascript.jscomp.NodeTraversal"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.CoalesceVariableNames", "process", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "<sample:7>", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"(-1"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msgm.<sdoc.export"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"-0.<"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING -0 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLineno=0, getQualifiedName=null, getString=-0, getType=40, hasChildren=false, hasMoreThanOneChild=false, hasOneC...#350#395573449", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msgm.<sdoc.ex\nortSEARCHING_NEWLINE"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:8>"}}, 2), new String[][]{{"hasTypedefType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"(a,b,c"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {getBlockDescription=null, getDeprecationReason=null, getDescription=null, getFileOverview=null, getImplementedInterfaceCount=0, getLicense=null, getParameterCount=0, getReturnDescription=nu...#377#1127273843", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msgm.<sdoc.exporta+b,c"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:9>"}}, 3), new String[][]{{"isImplicitCast", "", "1"}, {"hasType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
