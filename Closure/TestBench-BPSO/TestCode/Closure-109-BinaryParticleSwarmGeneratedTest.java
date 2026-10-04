package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:4>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 5, new String[][]{}, 2), new String[][]{{"isVarArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<null>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1eb0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1eb0 0 [length: 4] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=4, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFile...#344#1152804273", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=true, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getLe...#390#1474963268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING a 7 [length: 1] {getChangeTime=0, getCharno=8, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=7, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNam...#342#-962141651", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getModifies", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:5>"}}), new String[][]{{"isOptionalArg", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.5fT"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.5fT 0 [length: 5] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=5, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFil...#346#-1124283833", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#394#1159833417", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:0>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}), new String[][]{{"getRootNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}), new String[][]{{"getReferences", "", "0"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"isConsistentIdGenerator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false), new String[][]{{"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<null>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}), new String[][]{{"getRootNode", "", "4"}, {"getSourceOffset", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"getRoot", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:3>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}), new String[][]{{"getRoot", "", "7"}, {"hasChildren", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"Pg1H"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING Pg1H 0 [length: 4] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=4, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFile...#344#1557508145", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:4>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}), new String[][]{{"getTemplateTypeNames", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.RegularImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 7, new String[][]{}), new String[][]{{"getRoot", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING <a><b>t</b></a> {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#355#2035619353", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 3), new String[][]{{"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 3), new String[][]{{"hasType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}), new String[][]{{"getSourceFileName", "", "6"}, {"getIntProp", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#394#1159833417", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"SDARCHING_ANNOTATION"}, true), new String[][]{{"detachFromParent", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"xFFFFFFFFTRIM"}, true), new String[][]{{"isAnd", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#394#1159833417", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 1), new String[][]{{"isCall", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=true, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getLe...#393#-1944398360", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:4>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"hasType", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:5>"}}), new String[][]{{"isOptionalArg", "", "5"}, {"getRootNode", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isConsistentIdGenerator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSo...#325#878405295", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"isOptionalArg", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=true, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getLe...#390#1474963268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"getRoot", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"-1.5msg.jsdoc.authormissing"}, true), new String[][]{{"children", "", "3"}, {"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:3>"}}), new String[][]{{"getBooleanProp", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"202/-01-01"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 202/-01-01 0 [length: 10] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=10, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSo...#358#1998170793", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.consistidgenmsg.jsdoc.nginject.extra"}, true), new String[][]{{"getLength", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("46", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 3), new String[][]{{"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 2), new String[][]{{"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  1 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSo...#327#-699032478", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=true, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getLe...#390#1474963268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"THTLE<"}, true), new String[][]{{"cloneNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING THTLE< 0 [length: 6] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=6, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFi...#348#-421657263", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}}), new String[][]{{"getSourceOffset", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:3>"}}), new String[][]{{"getParameterNames", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 3), new String[][]{{"getParameterNames", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"getReferences", "", "1"}, {"isDisposes", "", "6"}, {"getType", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:5>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.java"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jsdoc.java 0 [length: 14] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=14, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, g...#366#1458136769", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1eb0TITLE"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1eb0TITLE 0 [length: 9] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=9, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourc...#354#35191463", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 1), new String[][]{{"getRoot", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"getTemplateTypeNames", "", "0"}, {"add", "java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING sample 0 [length: 6] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=6, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFi...#348#2146034225", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 3), new String[][]{{"getRoot", "", "5"}, {"getLastChild", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("RETURN 6 {getChangeTime=0, getCharno=7, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=6, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#354#2038797628", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"isExterns", "", "7"}, {"getImplementedInterfaces", "", "2"}, {"indexOf", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=true, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getLe...#390#1474963268", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 1), new String[][]{{"isExport", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456SEARCHING_NEWLINE"}, true, 0, null, 3), new String[][]{{"getBooleanProp", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"t1.5"}, true, 0, null, 1), new String[][]{{"getLastSibling", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING t1.5 0 [length: 4] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=4, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFile...#344#-1364385423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:4>"}}, 1), new String[][]{{"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1E5e301"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1E5e301 0 [length: 7] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=7, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceF...#350#695645275", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.unexoected.eof"}, true, 0, null, 3), new String[][]{{"getNext", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 2), new String[][]{{"isOptionalArg", "", "1"}, {"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}, 2), new String[][]{{"getRoot", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}), new String[][]{{"detachChildren", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING a 3 [length: 1] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=3, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNam...#342#-475314500", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:7>"}}, 3), new String[][]{{"isVarArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING +1 0 [length: 2] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=2, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNa...#340#-970743631", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"isDisposes", "", "2"}, {"getTypeNodes", "", "4"}, {"set", "int,java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 0 1 [length: 1] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNam...#341#24185458", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}), new String[][]{{"getDouble", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 1), new String[][]{{"getRoot", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jrdoc.authormissing"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jrdoc.authormissing 0 [length: 23] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=23, getLineno=0, getQualifiedName=null, getSideEffectF...#384#998070247", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.export1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jsdoc.export1.5 0 [length: 19] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=19, getLineno=0, getQualifiedName=null, getSideEffectFlags...#376#2106985605", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 2, new String[][]{}, 2), new String[][]{{"getRootNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getOriginalCommentPosition", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  1 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSo...#327#-699032478", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.ngiject.extra"}, true, 0, null, 2), new String[][]{{"hasChildren", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"P"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING P 0 [length: 1] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNam...#338#-760111333", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.4"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.4 0 [length: 3] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=3, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#342#-1964910807", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"null"}, true), new String[][]{{"hasChildren", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  1048575 {getChangeTime=0, getCharno=1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1048575, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName...#340#-935500967", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:7>"}}, 2), new String[][]{{"getExtendedInterfaces", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.RegularImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"TITE"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING TITE 0 [length: 4] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=4, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFile...#344#1595206961", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:5>"}}, 2), new String[][]{{"cloneTree", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 0 1 [length: 1] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNam...#341#24185458", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:9>"}}, 3), new String[][]{{"getAssociatedNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdnc.externs"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jsdnc.externs 0 [length: 17] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=17, getLineno=0, getQualifiedName=null, getSideEffectFlags=0...#372#1452518945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isIdGenerator", "", "7"}, {"getExtendedInterfaces", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.RegularImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:15>"}}, 3), new String[][]{{"getRootNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:17>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}), new String[][]{{"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 3, new String[][]{}, 1), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  {getChangeTime=0, getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSo...#323#-1406133020", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}, 3), new String[][]{{"getRoot", "", "0"}, {"getQualifiedName", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:19>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BANG 1 {getChangeTime=0, getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourc...#353#625950227", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}), new String[][]{{"hasBaseType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 3), new String[][]{{"cloneNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 0 1 [length: 1] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNam...#341#24185458", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}}, 1), new String[][]{{"getExtendedInterfacesCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}, 1), new String[][]{{"getRoot", "", "6"}, {"getAncestor", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.123456789012345671.1234567"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.123456789012345671.1234567 0 [length: 28] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=28, getLineno=0, getQualifiedName=null, getSideEf...#394#-1707779941", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:10>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 2), new String[][]{{"getRootNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:15>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("STAR 1 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourc...#355#324524480", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}), new String[][]{{"getTypeNodes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}}, 2), new String[][]{{"hasParameter", "java.lang.String", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{".5PRESERVE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING .5PRESERVE 0 [length: 10] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=10, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSo...#358#430784425", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jtdoc.nginiect.extra"}, true, 0, null, 1), new String[][]{{"getExistingIntProp", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}, 2), new String[][]{{"getExtendedInterfaces", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.RegularImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:19>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:15>"}}, 1), new String[][]{{"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:19>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{".5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING .5 0 [length: 2] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=2, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNa...#340#-1228166063", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"I\r"}, true), new String[][]{{"getProp", "int", "0"}, {"addSuppression", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING I 0 [jsdoc_info: JSDocInfo] [length: 1] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=0, getQualifiedName=null, getSideEffectF...#362#-375199028", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"disposesOf", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("QMARK 3 {getChangeTime=0, getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=3, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#355#-395765277", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, null, 2), new String[][]{{"getRoot", "", "4"}, {"getChildAtIndex", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:1>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#394#1159833417", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"-1.6 "}, true, 0, null, 1), new String[][]{{"isBreak", "", "6"}, {"getIntProp", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}), new String[][]{{"getImplementedInterfaces", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.RegularImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"NEXT_IS_ANNOTATION"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING NEXT_IS_ANNOTATION 0 [length: 18] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=18, getLineno=0, getQualifiedName=null, getSideEffectFlags=...#374#-1355718407", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 3), new String[][]{{"getRoot", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}}, 3), new String[][]{{"getImplementedInterfaceCount", "", "0"}, {"hasParameter", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("QMARK 1 {getChangeTime=0, getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#354#1927360363", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:19>"}, false, 3, new String[][]{}, 2), new String[][]{{"detachChildren", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BANG 3 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=3, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourc...#356#1370240876", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{" 1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.5 0 [length: 3] {getChangeTime=0, getCharno=1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=3, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#342#-1256396917", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING sample 1048575 [length: 6] {getChangeTime=0, getCharno=2, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=6, getLineno=1048575, getQualifiedName=null, getSideEffectFlags=0,...#364#-119040765", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:15>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("STAR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourc...#353#-1949777645", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 1), new String[][]{{"getAssociatedNode", "", "4"}, {"getLastChild", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("RETURN 6 {getChangeTime=0, getCharno=7, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=6, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#354#2038797628", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, null, 3), new String[][]{{"isAnd", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"hasType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.exportmsg.jsdoc.nginject.extraa,b,c"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jsdoc.exportmsg.jsdoc.nginject.extraa 0 [length: 41] {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=41, getLineno=0, getQualifiedName=nu...#420#1854835729", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:19>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 3), new String[][]{{"cloneNode", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BANG 1 {getChangeTime=0, getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourc...#355#370687006", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}), new String[][]{{"getParameterNames", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"getRoot", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getAssociatedNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-...#343#1363071907", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 1), new String[][]{{"getRoot", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#353#-119463252", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}}, 1), new String[][]{{"getReturnType", "", "0"}, {"getExtendedInterfaces", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.RegularImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true, 0, null, 1), new String[][]{{"getDirectives", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING a 7 [length: 1] {getChangeTime=0, getCharno=8, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=7, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNam...#342#-962141651", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 2), new String[][]{{"getExtendedInterfaces", "", "0"}, {"listIterator", "int", "2"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:18>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}}, 3), new String[][]{{"getRoot", "", "1"}, {"getSourceOffset", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 3, new String[][]{}, 2), new String[][]{{"getChildBefore", "com.google.javascript.rhino.Node", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:14>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("QMARK {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#354#384834505", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:13>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:15>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:0>"}}, 2), new String[][]{{"getDirectives", "", "6"}, {"getBooleanProp", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}}), new String[][]{{"getSuppressions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}), new String[][]{{"getImplementedInterfaceCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getTypeNodes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[STRING 0 1 [length: 1]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getModifies", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3), new String[][]{{"getExtendedInterfaces", "", "4"}, {"add", "int,java.lang.Object", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:8>"}}, 2), new String[][]{{"getSourceOffset", "", "0"}, {"addChildrenAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:15>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("STAR {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourc...#353#-1949777645", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}, 3), new String[][]{{"hasModifies", "", "2"}, {"getExtendedInterfaces", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.RegularImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:11>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:3>"}}, 1), new String[][]{{"getRoot", "", "6"}, {"getLength", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}}, 1), new String[][]{{"isDisposes", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:1>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 3), new String[][]{{"getExtendedInterfacesCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:20>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:14>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:17>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:6>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}}), new String[][]{{"getParameterNames", "", "4"}, {"addAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}, 3), new String[][]{{"getParameterNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.bad.\nsdoc.tag"}, true), new String[][]{{"isBlock", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}, 2), new String[][]{{"getParameterNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:11>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:17>"}}), new String[][]{{"isOptionalArg", "", "3"}, {"getRoot", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:3>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}), new String[][]{{"getJsDocBuilderForNode", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:10>"}}), new String[][]{{"getLastSibling", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("QMARK {getChangeTime=0, getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#354#384834505", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}, 2), new String[][]{{"hasFileOverview", "", "1"}, {"getModifies", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:20>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:17>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:2>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:18>"}}, 3);
  assertNull(actual);
 }
}
