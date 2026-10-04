package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=true, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getLe...#388#-1100829703", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=true, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getLe...#388#-1100829703", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:4>"}}), new String[][]{{"getThrownTypes", "", "7"}, {"addAll", "int,java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:5>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:6>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<null>"}}), new String[][]{{"isVarArgs", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ge...#321#-1482453316", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false), new String[][]{{"isVarArgs", "", "1"}, {"getRoot", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=true, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getLe...#388#-1100829703", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:3>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"getExtendedInterfaces", "", "4"}, {"remove", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"isHidden", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}), new String[][]{{"getCharno", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:1>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:9>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}), new String[][]{{"getRoot", "", "6"}, {"getDirectives", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"SEARCHING_NEWKINE"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING SEARCHING_NEWKINE 0 [length: 17] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=17, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNa...#368#-2007447898", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}), new String[][]{{"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"i"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING i 0 [length: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSource...#334#-1991584710", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg/jsdoc.incompat.typePRESERVE"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg/jsdoc.incompat.typePRESERVE 0 [length: 31] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=31, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, g...#396#-1230947226", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"0.5"}, true), new String[][]{{"detachFromParent", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"numbes"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING numbes 0 [length: 6] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=6, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#344#-1272526154", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"hasType", "", "2"}, {"getOriginalCommentString", "", "4"}, {"hasReturnType", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:2>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"containsDeclaration", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING sample 1048575 [length: 6] {getCharno=2, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=6, getLineno=1048575, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNam...#360#1126978212", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<null>"}}, 1), new String[][]{{"getRoot", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"0x123456"}, true), new String[][]{{"getNext", "", "7"}, {"detachChildren", "", "5"}, {"getType", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("40", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false), new String[][]{{"getRoot", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}}), new String[][]{{"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:9>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"214A7483648null"}, true), new String[][]{{"addSuppression", "java.lang.String", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 214A7483648null 0 [jsdoc_info: JSDocInfo] [length: 15] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=15, getLineno=0, getQualifiedName=null, getSideEffectFl...#388#1643431813", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"isDefine", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"getMarkers", "", "6"}, {"listIterator", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"2020-01-02"}, true, 0, null, 3), new String[][]{{"getLastChild", "", "4"}, {"addChildrenToFront", "com.google.javascript.rhino.Node", "6"}, {"isCall", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:1>"}, false, 0, null, 3), new String[][]{{"isOptionalArg", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.E2"}, true), new String[][]{{"isCase", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}}), new String[][]{{"isConsistentIdGenerator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}), new String[][]{{"getRoot", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#349#637856945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<null>"}}), new String[][]{{"getThrownTypes", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:6>"}}, 3), new String[][]{{"getAssociatedNode", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"getType", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"isOptionalArg", "", "4"}, {"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"nvmberi"}, true, 0, null, 3), new String[][]{{"getParent", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}), new String[][]{{"getParameterCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"0x123456789I"}, true, 0, null, 2), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "5"}, {"getExistingIntProp", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 3), new String[][]{{"getReturnDescription", "", "2"}, {"getSuppressions", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 0 1 [length: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSource...#337#-513603911", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:4>"}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:2>"}}, 1), new String[][]{{"getRoot", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#349#637856945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"getSuppressions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=true, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getLe...#388#-1100829703", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:6>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 1), new String[][]{{"isVarArgs", "", "4"}, {"isOptionalArg", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 2), new String[][]{{"getRoot", "", "4"}, {"hasOneChild", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:9>"}, false), new String[][]{{"getRoot", "", "3"}, {"getFirstChild", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BITOR 32 {getCharno=64, getChildCount=4, getDouble=!UnsupportedOperationException, getLength=0, getLineno=32, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, g...#353#2146048475", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:2>"}, false, 0, null, 2), new String[][]{{"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}, 1), new String[][]{{"getRoot", "", "7"}, {"getAncestors", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:4>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 2), new String[][]{{"getType", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.externs"}, true, 0, null, 1), new String[][]{{"getIntProp", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}), new String[][]{{"clonePropsFrom", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  1048575 {getCharno=1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1048575, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceO...#336#2138874686", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false), new String[][]{{"getParameterNames", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}), new String[][]{{"getAncestors", "", "1"}, {"iterator", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:6>"}}, 3), new String[][]{{"getRoot", "", "3"}, {"getCharno", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:7>"}}), new String[][]{{"getJSDocInfo", "", "1"}, {"hasOneChild", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ge...#321#-1482453316", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 3), new String[][]{{"cloneNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING a 3 [length: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=3, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSource...#338#-1857557567", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:1>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSTypeExpression", actual.getClass().getName());
  assertEquals("{isOptionalArg=false, isVarArgs=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:5>"}, false, 0, null, 3), new String[][]{{"getRoot", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}), new String[][]{{"getCharno", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:5>"}}, 2), new String[][]{{"getParameterNames", "", "6"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"PRSERVE"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING PRSERVE 0 [length: 7] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=7, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, get...#346#719799214", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 0 1 [length: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSource...#337#-513603911", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}}, 3), new String[][]{{"hasReturnType", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.6msg.jsdoc.javadispatch"}, true, 0, null, 3), new String[][]{{"getChildCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 3), new String[][]{{"getExtendedInterfaces", "", "5"}, {"iterator", "", "3"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"PRESERWE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING PRESERWE 0 [length: 8] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=8, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, ge...#348#2938296", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.5e"}, true, 0, null, 2), new String[][]{{"children", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 2), new String[][]{{"getMeaning", "", "5"}, {"getModifies", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}, 3), new String[][]{{"getDouble", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"getImplementedInterfaceCount", "", "4"}, {"isJavaDispatch", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"nul_"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING nul_ 0 [length: 4] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=4, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#340#-1915474926", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, null, 1), new String[][]{{"getRoot", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 2), new String[][]{{"getImplementedInterfaces", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#384#-22863423", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:4>"}}, 2), new String[][]{{"getDeprecationReason", "", "2"}, {"getVisibility", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo$Visibility", actual.getClass().getName());
  assertEquals("INHERITED", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<null>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"getAssociatedNode", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ge...#321#-1482453316", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"PRERERtE"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING PRERERtE 0 [length: 8] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=8, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, ge...#348#513867700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.externs"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jsdoc.externs 0 [length: 17] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=17, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNa...#368#-477926586", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 2), new String[][]{{"getRoot", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"SEARCHING_NEWLINE1.5d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING SEARCHING_NEWLINE1.5d 0 [length: 21] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=21, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFi...#376#-1603855386", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1E-52020-01-01"}, true, 0, null, 3), new String[][]{{"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}, 3), new String[][]{{"addChildToFront", "com.google.javascript.rhino.Node", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  1048575 {getCharno=1, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1048575, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceO...#334#-1289942231", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:7>"}}, 2), new String[][]{{"getDeprecationReason", "", "5"}, {"isHidden", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:10>"}}, 2), new String[][]{{"getRoot", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"0x1F"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 0x1F 0 [length: 4] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=4, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#340#-1411384436", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 0 1 [length: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSource...#337#-513603911", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 3), new String[][]{{"hasChild", "com.google.javascript.rhino.Node", "7"}, {"getChildCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdod.missing.rc"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jsdod.missing.rc 0 [length: 20] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=20, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFil...#374#1182069484", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 1), new String[][]{{"getRoot", "", "2"}, {"getDirectives", "", "2"}, {"getIntProp", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.5:"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.5 0 [length: 3] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=3, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#338#-1368462890", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, null, 3), new String[][]{{"getString", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.export"}, true, 0, null, 2), new String[][]{{"getAncestors", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$AncestorIterable", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}}), new String[][]{{"getExtendedInterfaces", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:1>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}}, 1), new String[][]{{"getAssociatedNode", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"detachChildren", "", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ge...#321#-1482453316", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<null>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:2>"}}, 1), new String[][]{{"getMarkers", "", "0"}, {"iterator", "", "1"}});
  assertNotNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 4, new String[][]{}, 2), new String[][]{{"isVarArgs", "", "2"}, {"getRoot", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#349#637856945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}}, 3), new String[][]{{"getSuppressions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msf.js\noc.javadispatch"}, true), new String[][]{{"isCast", "", "1"}, {"cloneTree", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msf.js 0 [length: 6] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=6, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#344#-841496036", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"trve"}, true, 0, null, 1), new String[][]{{"copyInformationFromForTree", "com.google.javascript.rhino.Node", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING trve [length: 4] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=4, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#341#-1699695856", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.25TITLE"}, true, 0, null, 2), new String[][]{{"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}, 1), new String[][]{{"containsDeclaration", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:10>"}}), new String[][]{{"getImplementedInterfaceCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 4, new String[][]{}, 1), new String[][]{{"addChildrenToBack", "com.google.javascript.rhino.Node", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  4 {getCharno=4, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=4, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, ge...#322#-2033630821", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"getSideEffectFlags", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}}, 1), new String[][]{{"getMarkers", "", "6"}, {"add", "java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"Rrue"}, true, 0, null, 2), new String[][]{{"cloneTree", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING Rrue 0 [length: 4] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=4, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#340#-620830682", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}), new String[][]{{"getSuppressions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getAssociatedNode", "", "6"}, {"getCharno", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:9>"}}), new String[][]{{"getMarkers", "", "0"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}), new String[][]{{"getMarkers", "", "0"}, {"clear", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.5V"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.5V 0 [length: 4] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=4, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#340#324236746", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"PRESSERV"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING PRESSERV 0 [length: 8] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=8, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, ge...#348#209606914", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdpc.expose"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jsdpc.expose 0 [length: 16] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=16, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileNam...#366#-380034190", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 2147483648 0 [length: 10] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=10, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null...#354#-772445958", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"null"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING null 0 [length: 4] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=4, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSou...#340#2047720056", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:1>"}}, 3), new String[][]{{"getRoot", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("ERROR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#349#637856945", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"addSuppression", "java.lang.String", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING  [jsdoc_info: JSDocInfo] {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null...#345#81977531", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<null>"}}, 3), new String[][]{{"getRoot", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$NumberNode", actual.getClass().getName());
  assertEquals("NUMBER -Infinity {getCharno=-1, getChildCount=0, getDouble=-Infinity, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSourcePosit...#339#1917934166", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}}, 1), new String[][]{{"getImplementedInterfaces", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:0>"}, false, 0, null, 2), new String[][]{{"getRoot", "", "6"}, {"getSourceOffset", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 1), new String[][]{{"isCase", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 0 1 [length: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSource...#337#-513603911", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"addChildAfter", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}}, 2), new String[][]{{"getImplementedInterfaces", "", "6"}, {"listIterator", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:13>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", new String[]{"com.google.javascript.rhino.Node"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<sample:8>"}}, 1), new String[][]{{"evaluate", "com.google.javascript.rhino.jstype.StaticScope,com.google.javascript.rhino.jstype.JSTypeRegistry", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "createJSTypeExpression", "com.google.javascript.rhino.Node", "<null>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:15>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:11>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:19>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:11>"}}), new String[][]{{"getStaticSourceFile", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:15>"}, false, 0, null, 1), new String[][]{{"isCall", "", "1"}, {"clonePropsFrom", "com.google.javascript.rhino.Node", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("STAR {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#349#-1635273090", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:19>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("BANG 1 {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#349#-1600503120", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:7>"}}, 2), new String[][]{{"getChildBefore", "com.google.javascript.rhino.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.RuntimeException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:8>"}}), new String[][]{{"addSuppression", "java.lang.String", "5"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("QMARK 1 [jsdoc_info: JSDocInfo] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, ...#376#-1813949374", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 1, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("QMARK 1048575 {getCharno=1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=1048575, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOff...#365#1696392620", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:18>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}}, 1), new String[][]{{"isJavaDispatch", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"isAdd", "", "3"}, {"getString", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:19>"}, false, 0, null, 2), new String[][]{{"isCast", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 7, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}), new String[][]{{"containsDeclaration", "", "4"}, {"getTypeNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}, 2), new String[][]{{"getClassTemplateTypeNames", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:20>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:14>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:18>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:16>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseInlineTypeDoc", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:9>"}}, 1), new String[][]{{"getImplementedInterfaces", "", "0"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:20>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("QMARK {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#350#1368170352", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", new String[]{"com.google.javascript.jscomp.parsing.JsDocToken"}, new String[]{"<sample:17>"}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseAndRecordTypeNode", "com.google.javascript.jscomp.parsing.JsDocToken", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("QMARK {getCharno=-1, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=-1, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getS...#350#1368170352", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}}, 3), new String[][]{{"getImplementedInterfaces", "", "6"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}, 1), new String[][]{{"getSuppressions", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 4, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}}, 3), new String[][]{{"getTemplateTypeNames", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
}
