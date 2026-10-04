package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING -0.0 0 [length: 4] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=4, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#340#741418812", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:7>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:7>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:7>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<null>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false), new String[][]{{"isVarArgs", "", "3"}, {"getRoot", "", "4"}, {"getFirstChild", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}), new String[][]{{"isVarArgs", "", "3"}, {"getRoot", "", "4"}, {"getFirstChild", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}, 2), new String[][]{{"isVarArgs", "", "3"}, {"getRoot", "", "4"}, {"getFirstChild", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}), new String[][]{{"isVarArgs", "", "3"}, {"getRoot", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:2>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:2>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:1>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 10, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:2>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:2>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:7>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 0 1 [length: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSource...#337#-513603911", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"getJSDocInfo", "", "4"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:6>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:5>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:5>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:5>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:5>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:10>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=true, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getLe...#388#-1100829703", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1e10"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1e10 0 [length: 4] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=4, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#340#-1117418336", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1e10msg.jsdoc.expose"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1e10msg.jsdoc.expose 0 [length: 20] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=20, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFil...#374#-1864921106", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1e10msg.jsdoc.eexpos\r"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1e10msg.jsdoc.eexpos 0 [length: 20] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=20, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFil...#374#-1659102594", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1>e10msg.jsdoc.eexpos\r"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1 0 [length: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSource...#334#2122531130", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1>e10msg.jsdc.eexpos\r"}, true), new String[][]{{"getChildCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{".SI010true"}, true, 0, null, 2), new String[][]{{"isCast", "", "2"}, {"getSourcePosition", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"null"}, true, 0, null, 2), new String[][]{{"isCast", "", "2"}, {"getSourcePosition", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.5e300 0 [length: 7] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=7, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, get...#346#2008543886", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.5H300"}, true), new String[][]{{"cloneTree", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.5H300 0 [length: 7] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=7, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, get...#346#1333690606", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.5G300"}, true), new String[][]{{"cloneTree", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.5G300 0 [length: 7] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=7, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, get...#346#2050931406", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.5G300"}, true, 0, null, 3), new String[][]{{"cloneTree", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.5G300 0 [length: 7] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=7, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, get...#346#2050931406", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.5G/00"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.5G/00 0 [length: 7] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=7, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, get...#346#2143478606", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.5G/00"}, true, 0, null, 3), new String[][]{{"isBlock", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"w0EXT_IS_ANNOSATION"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING w0EXT_IS_ANNOSATION 0 [length: 19] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=19, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFile...#372#-35460634", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"w0EEXT_IS_ANNOSATIN"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING w0EEXT_IS_ANNOSATIN 0 [length: 19] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=19, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFile...#372#1612805734", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"w0EEXT_IS_AN.NNS!ATIN"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BANG 0 {getCharno=16, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#348#1020718201", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"w0EEYT_IS_A\nN.NS!ATIN"}, true, 0, null, 3), new String[][]{{"addChildrenToBack", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING w0EEYT_IS_A 0 [length: 11] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=11, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=nul...#354#1767896625", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.bad.jsdoc.tag"}, true, 0, null, 3), new String[][]{{"addChildrenToBack", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.bad.jsdoc.tag 0 [length: 17] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=17, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNa...#366#1694615921", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"2020-02-0T25:61:61"}, true, 0, null, 3), new String[][]{{"addChildrenToBack", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 2020-02-0T25 0 [length: 12] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=12, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=nu...#356#-334146977", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<null>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"0x1F1.12345678901234567"}, true, 0, null, 2), new String[][]{{"getJSDocInfo", "", "7"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"cPupl"}, true, 0, null, 2), new String[][]{{"getJSDocInfo", "", "7"}, {"getJsDocBuilderForNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$FileLevelJsDocBuilder", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}}), new String[][]{{"isOptionalArg", "", "0"}, {"getRoot", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=true, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getLe...#388#-1100829703", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 3), new String[][]{{"hasParameter", "java.lang.String", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=true, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getLe...#388#-1100829703", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"hasThisType", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:4>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:5>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:4>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}), new String[][]{{"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"SEARCHING_ANNOTATION"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING SEARCHING_ANNOTATION 0 [length: 20] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=20, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFil...#374#1910941644", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"hasType", "", "1"}, {"getParameterNames", "", "6"}, {"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:0>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 1), new String[][]{{"hasParameter", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}), new String[][]{{"getTemplateTypeNames", "", "7"}, {"iterator", "", "7"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false), new String[][]{{"isVarArgs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ge...#321#-1482453316", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=true, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getLe...#388#-1100829703", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:2>"}}), new String[][]{{"children", "", "2"}, {"add", "java.lang.Object", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{" "}, true, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 3), new String[][]{{"isOptionalArg", "", "6"}, {"isVarArgs", "", "3"}, {"isOptionalArg", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:0>"}}, 3), new String[][]{{"copyInformationFrom", "com.google.javascript.rhino.Node", "3"}, {"getProp", "int", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:3>"}}), new String[][]{{"isOptionalArg", "", "2"}, {"getRoot", "", "1"}, {"addChildToFront", "com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#347#-1094867940", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:5>"}}), new String[][]{{"getRoot", "", "5"}, {"getJSDocInfo", "", "6"}, {"getString", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.javadispatch"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jsdoc.javadispatch 0 [length: 22] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=22, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceF...#378#-748498332", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:0>"}}), new String[][]{{"getChildAtIndex", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:5>"}}, 2), new String[][]{{"getRoot", "", "0"}, {"addChildToBack", "com.google.javascript.rhino.Node", "4"}, {"detachChildren", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:1>"}}), new String[][]{{"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(<a><b>t</b></a>|null|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=false, hasDisplayName=false, isAllTy...#406#1005924719", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:1>"}}, 2), new String[][]{{"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.jstype.UnionType", actual.getClass().getName());
  assertEquals("(<a><b>t</b></a>|null|undefined) {canBeCalled=false, getDisplayName=null, getPossibleToBooleanOutcomes=BOTH, hasAnyTemplateTypes=false, hasAnyTemplateTypesInternal=false, hasDisplayName=false, isAllTy...#406#1005924719", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:1>"}}, 2), new String[][]{{"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}), new String[][]{{"getProp", "int", "3"}, {"isAssignAdd", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}), new String[][]{{"getProp", "int", "3"}, {"isAssignAdd", "", "7"}, {"getType", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}), new String[][]{{"getProp", "int", "3"}, {"isAssignAdd", "", "7"}, {"appendStringTree", "java.lang.Appendable", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 0 0 [length: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSource...#334#-258269542", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:15>"}, false, 8, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}), new String[][]{{"getProp", "int", "3"}, {"isAssignAdd", "", "7"}, {"appendStringTree", "java.lang.Appendable", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("STAR 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#348#440925614", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 3), new String[][]{{"getProp", "int", "3"}, {"isAssignAdd", "", "7"}, {"appendStringTree", "java.lang.Appendable", "2"}, {"isAssignAdd", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}), new String[][]{{"getProp", "int", "3"}, {"isCase", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:1>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 1), new String[][]{{"getProp", "int", "3"}, {"isCase", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 3), new String[][]{{"getRoot", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:7>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 3), new String[][]{{"getRoot", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 3), new String[][]{{"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:7>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:17>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 25, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:19>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<null>"}}, 3), new String[][]{{"getImplementedInterfaceCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 15, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 22, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:17>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:12>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 26, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:17>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:6>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 35, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:18>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 1), new String[][]{{"cloneTree", "", "7"}, {"detachChildren", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  1048575 {getCharno=1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1048575, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceO...#336#2138874686", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:19>"}, false, 3, new String[][]{}, 1), new String[][]{{"cloneTree", "", "7"}, {"detachChildren", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BANG 3 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=3, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#352#-1387377705", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:15>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:2>"}}, 2), new String[][]{{"cloneTree", "", "7"}, {"detachChildren", "", "1"}, {"cloneNode", "", "5"}, {"getAncestors", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:15>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:2>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 1), new String[][]{{"cloneTree", "", "6"}, {"detachChildren", "", "1"}, {"cloneNode", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("STAR 16 {getCharno=31, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=16, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ge...#355#132430703", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:5>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING sample 16 [length: 6] {getCharno=37, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=6, getLineno=16, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, g...#351#663590774", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:10>"}}), new String[][]{{"getChildCount", "", "6"}, {"isArrayLit", "", "1"}, {"getBooleanProp", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:8>"}}), new String[][]{{"getChildCount", "", "6"}, {"isArrayLit", "", "1"}, {"getBooleanProp", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:15>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 3), new String[][]{{"getChildCount", "", "0"}, {"isBlock", "", "0"}, {"getCharno", "", "3"}, {"addChildrenToBack", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("STAR 12 {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=12, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, get...#352#452906882", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:15>"}, false, 13, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:5>"}}, 3), new String[][]{{"getChildCount", "", "3"}, {"isBlock", "", "2"}, {"addChildrenToBack", "com.google.javascript.rhino.Node", "5"}, {"detachChildren", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("STAR 16 {getCharno=37, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=16, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ge...#355#114088144", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<null>"}}, 3), new String[][]{{"getChildCount", "", "3"}, {"hasOneChild", "", "2"}, {"addChildrenToBack", "com.google.javascript.rhino.Node", "5"}, {"detachChildren", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING sample 0 [length: 6] {getCharno=5, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=6, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#344#408202262", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:8>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<null>"}}, 3), new String[][]{{"getChildCount", "", "3"}, {"hasOneChild", "", "2"}, {"addChildrenToBack", "com.google.javascript.rhino.Node", "5"}, {"detachChildren", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("QMARK {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#350#1368170352", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:3>"}}, 3), new String[][]{{"getString", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:6>"}}, 3), new String[][]{{"getString", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 2), new String[][]{{"getString", "", "3"}, {"hasOneChild", "", "2"}, {"addChildrenToBack", "com.google.javascript.rhino.Node", "5"}, {"detachChildren", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING sample 0 [length: 6] {getCharno=5, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=6, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#344#408202262", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:15>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2), new String[][]{{"getJSType", "", "1"}, {"getChildCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"ms.sdoc.export"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING ms.sdoc.export 0 [length: 14] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=14, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=...#362#-230769750", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"mtg.<sdoc.export"}, true, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"n`tf7."}, true, 0, null, 2), new String[][]{{"getParent", "", "3"}, {"addChildrenToFront", "com.google.javascript.rhino.Node", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING n`tf7. 0 [length: 6] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=6, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#342#1515799551", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"m`uf7.sdoc/eypor"}, true, 0, null, 2), new String[][]{{"getParent", "", "3"}, {"addChildrenToFront", "com.google.javascript.rhino.Node", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING m`uf7.sdoc/eypor 0 [length: 16] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=16, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNam...#364#-897856319", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"m`_uf7.<"}, true), new String[][]{{"getParent", "", "3"}, {"addChildrenToFront", "com.google.javascript.rhino.Node", "5"}, {"addChildrenAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"12:30:45"}, true, 0, null, 1), new String[][]{{"getParent", "", "3"}, {"addChildrenToFront", "com.google.javascript.rhino.Node", "5"}, {"children", "", "5"}, {"remove", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"m`_uf7.<"}, true, 0, null, 1), new String[][]{{"getParent", "", "3"}, {"addChildrenToFront", "com.google.javascript.rhino.Node", "5"}, {"children", "", "1"}, {"next", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"E`;;Hufa..<"}, true, 0, null, 1), new String[][]{{"getParent", "", "3"}, {"addChildrenToFront", "com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING E`;;Hufa. 0 [length: 9] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=9, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, g...#348#1251646007", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 1), new String[][]{{"getProp", "int", "6"}, {"getFirstChild", "", "0"}, {"getParent", "", "3"}, {"getSourcePosition", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"w0EEXT_IS_AN.NNS!ATIN"}, true, 0, null, 1), new String[][]{{"getProp", "int", "6"}, {"getFirstChild", "", "0"}, {"getParent", "", "3"}, {"getSourcePosition", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"tg.r/d.-mspp.Ncbd.jrd5c.ssamxg-jrdXoNET_IS_B4NNTARIM-0.0"}, true, 0, null, 1), new String[][]{{"isAssign", "", "6"}, {"getLastChild", "", "0"}, {"children", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"s2f.</R?.1"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 2), new String[][]{{"getLength", "", "7"}, {"getDirectives", "", "5"}, {"addSuppression", "java.lang.String", "7"}, {"getJSDocInfo", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"/O1df.;lO.<10,21477483649"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"28.<<<-aq,,L,`uloEs/L;,/Suo\nBTjtmk2X12:3G:45sg.jsoc.dercatde0xFFFFFFF12345671e1"}, true, 0, null, 2), new String[][]{{"detachFromParent", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"N..<51-4sc+,GdNC/0>9Vp\nDU1.2.5msg.is+oc./desc.1extqF2020/2-30T25;1:61 a,b,c"}, true, 0, null, 3), new String[][]{{"copyInformationFromForTree", "com.google.javascript.rhino.Node", "5"}, {"hasMoreThanOneChild", "", "4"}, {"getChildCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}), new String[][]{{"getParameterNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"hykW.<+38e6ca/t,-+.\niBiQ/GCabcc-PT1HTRIM"}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"/5z.j.<m9<bN-38F66Z7s4,6,_jn-.\n"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 0 1 [length: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSource...#337#-513603911", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}), new String[][]{{"getBaseType", "", "0"}, {"getSuppressions", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ge...#321#-1482453316", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"getParameterType", "java.lang.String", "3"}, {"isHidden", "", "5"}, {"getClassTemplateTypeNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:18>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ge...#321#-1482453316", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:12>"}}, 1), new String[][]{{"getRoot", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:19>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BANG 9 {getCharno=5, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=9, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#350#-1344501166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:15>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("STAR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#349#-1635273090", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 12, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:5>"}}), new String[][]{{"containsDeclaration", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"addChildrenAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 15, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:3>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}), new String[][]{{"addChildrenAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 11, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}}, 2), new String[][]{{"getThisType", "", "4"}, {"getDescription", "", "5"}, {"isDefine", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:19>"}, false, 9, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BANG 9 {getCharno=5, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=9, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#350#-1344501166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}), new String[][]{{"isExport", "", "3"}, {"getTemplateTypeNames", "", "4"}, {"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 16, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:14>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}), new String[][]{{"getNext", "", "7"}, {"getExistingIntProp", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:1>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:18>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 14, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:3>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:14>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 18, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 2), new String[][]{{"getRoot", "", "2"}, {"isBreak", "", "0"}, {"isArrayLit", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 13, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getTemplateTypeNames", "", "7"}, {"asList", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 2), new String[][]{{"getRoot", "", "2"}, {"appendStringTree", "java.lang.Appendable", "4"}, {"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:6>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:11>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:11>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}), new String[][]{{"addChildrenToFront", "com.google.javascript.rhino.Node", "7"}, {"isAssignAdd", "", "2"}, {"getAncestor", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, null, 1), new String[][]{{"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}}), new String[][]{{"getLicense", "", "6"}, {"getType", "", "1"}, {"getSuppressions", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 31, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1), new String[][]{{"hasFileOverview", "", "6"}, {"getTypeNodes", "", "6"}, {"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:5>"}}, 1), new String[][]{{"hasFileOverview", "", "6"}, {"getTypeNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[STRING sample 0 [length: 6]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 17, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 3), new String[][]{{"getTypeNodes", "", "1"}, {"removeAll", "java.util.Collection", "5"}, {"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}), new String[][]{{"getExtendedInterfacesCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}}, 1), new String[][]{{"isExterns", "", "1"}, {"getImplementedInterfaces", "", "4"}, {"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getExtendedInterfacesCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 2), new String[][]{{"isConstructor", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 8, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 1), new String[][]{{"getThrownTypes", "", "1"}, {"contains", "java.lang.Object", "0"}, {"containsAll", "java.util.Collection", "2"}, {"retainAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getTypeNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[STRING 0 1 [length: 1]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"getTypeNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[STRING sample 1048575 [length: 6]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getTypeNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[STRING a 3 [length: 1]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"getTypeNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[STRING 0 4 [length: 1]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2), new String[][]{{"getTypeNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[STRING sample 0 [length: 6]]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}}, 1), new String[][]{{"isVarArgs", "", "2"}, {"isVarArgs", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}}, 1), new String[][]{{"isVarArgs", "", "2"}, {"getRoot", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 12, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:5>"}}, 1), new String[][]{{"isVarArgs", "", "2"}, {"getRoot", "", "3"}, {"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 13, new String[][]{}, 1);
  assertNull(actual);
 }
}
