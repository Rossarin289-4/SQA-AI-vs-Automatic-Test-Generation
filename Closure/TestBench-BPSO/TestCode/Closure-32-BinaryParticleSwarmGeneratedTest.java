package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"SINGLE_LINE"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING SINGLE_LINE 0 [length: 11] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=11, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=nul...#356#-1102565754", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 6, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{""}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"0.1234567890123456"}, true), new String[][]{{"addChildBefore", "com.google.javascript.rhino.Node,com.google.javascript.rhino.Node", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.javadispatch2021-01-01"}, true, 0, null, 2), new String[][]{{"getDirectives", "", "6"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true), new String[][]{{"getString", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1.5f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"SINGME_LINE"}, true), new String[][]{{"hasOneChild", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25:61:61"}, true), new String[][]{{"getLength", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("13", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 5, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"SINGLE_L"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING SINGLE_L 0 [length: 8] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=8, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, ge...#348#108697700", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"numbermsg.jsdoc.missing.rc"}, true), new String[][]{{"children", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true), new String[][]{{"addChildToBack", "com.google.javascript.rhino.Node", "7"}, {"copyInformationFrom", "com.google.javascript.rhino.Node", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.5e300 0 [length: 7] {getCharno=0, getChildCount=1, getDouble=!UnsupportedOperationException, getLength=7, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, get...#344#964997787", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"55."}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 55. 0 [length: 3] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=3, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#338#1403436566", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jssdoc.exposeHello, World"}, true, 0, null, 2), new String[][]{{"getExistingIntProp", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#390#-1856857836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"0.1234567a"}, true, 0, null, 2), new String[][]{{"getBooleanProp", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"NEXT_IS_ANNOTATJON"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING NEXT_IS_ANNOTATJON 0 [length: 18] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=18, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#370#275110050", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"-"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING - 0 [length: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSource...#334#1189263034", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"133456789012345678901234567890"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 133456789012345678901234567890 0 [length: 30] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=30, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, ge...#394#1065923440", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "retrieveAndResetParsedJSDocInfo", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}), new String[][]{{"getImplementedInterfaces", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"PiT1"}, true, 0, null, 3), new String[][]{{"getChildAtIndex", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{".12345678"}, true, 0, null, 1), new String[][]{{"getDirectives", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", new String[]{"com.google.javascript.rhino.JSDocInfo"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"null"}, true), new String[][]{{"getAncestor", "int", "3"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.externsmsg.jsdoc.desc.extra"}, true, 0, null, 1), new String[][]{{"children", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"+1msg.jsdoc.consistidgen"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING +1msg.jsdoc.consistidgen 0 [length: 24] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=24, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourc...#382#972509784", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "parse", ""}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}, 3), new String[][]{{"getSuppressions", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:8>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "hasParsedJSDocInfo", ""}}), new String[][]{{"isJavaDispatch", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.12345678null"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.12345678null 0 [length: 14] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=14, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=...#362#-504447100", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.123c567890123456"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1.123c567890123456 0 [length: 18] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=18, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileN...#370#6444992", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.expose"}, true, 0, null, 1), new String[][]{{"hasOneChild", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"ac"}, true, 0, null, 3), new String[][]{{"getSourcePosition", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"2.5d"}, true, 0, null, 3), new String[][]{{"getParent", "", "6"}, {"isCase", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{""}, true, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"4.SEARCHING_NEWLINE"}, true, 0, null, 2), new String[][]{{"getDouble", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.authormissiing"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jsdoc.authormissiing 0 [length: 24] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=24, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourc...#382#42920796", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", new String[]{"com.google.javascript.rhino.Node$FileLevelJsDocBuilder"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{".5"}, true, 0, null, 3), new String[][]{{"isCase", "", "7"}, {"getDouble", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.const"}, true, 0, null, 3), new String[][]{{"isBreak", "", "5"}, {"getIndexOfChild", "com.google.javascript.rhino.Node", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"B1.5dd"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING B1.5dd 0 [length: 6] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=6, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getS...#344#1522440158", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.consistidgena,b,c"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jsdoc.consistidgena 0 [length: 23] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=23, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSource...#380#-517559962", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}), new String[][]{{"getParameterNames", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"!"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"SS!"}, true), new String[][]{{"cloneTree", "", "2"}, {"getInputId", "", "2"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}, 2), new String[][]{{"getFileOverview", "", "5"}, {"getExtendedInterfaces", "", "7"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}}, 1), new String[][]{{"isIdGenerator", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}), new String[][]{{"getSuppressions", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"+1i"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING +1i 0 [length: 3] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=3, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSour...#338#-1862901770", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#390#-1856857836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:9>"}}), new String[][]{{"getSuppressions", "", "6"}, {"add", "java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#390#-1856857836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:4>"}}), new String[][]{{"getParameterCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}, 2), new String[][]{{"isConstant", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:1>"}}, 2), new String[][]{{"getModifies", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"*S"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node", actual.getClass().getName());
  assertEquals("STAR 0 {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=0, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSourceOffset=-1, getSo...#348#440925614", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.jsdoc.authormissi\rg"}, true, 0, null, 3), new String[][]{{"getLastSibling", "", "1"}});
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.jsdoc.authormissi 0 [length: 21] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=21, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFi...#376#105738374", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileLevelJsDocBuilder", "com.google.javascript.rhino.Node$FileLevelJsDocBuilder", "<sample:2>"}, {"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}, 3), new String[][]{{"hasParameterType", "java.lang.String", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.JSDocInfo", actual.getClass().getName());
  assertEquals("JSDocInfo {containsDeclaration=false, getBlockDescription=null, getDeprecationReason=null, getDescription=null, getExtendedInterfacesCount=0, getFileOverview=null, getImplementedInterfaceCount=0, getL...#390#-1856857836", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}, 1), new String[][]{{"getThrownTypes", "", "4"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:1>"}}), new String[][]{{"getFileOverview", "", "6"}, {"getTypeNodes", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:4>"}}, 3), new String[][]{{"hasThisType", "", "4"}, {"getParameterNames", "", "7"}, {"asList", "", "3"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}, 2), new String[][]{{"getParameterNames", "", "6"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}}, 1), new String[][]{{"getTypeNodes", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 2, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}}, 1), new String[][]{{"getVisibility", "", "6"}, {"getParameterNames", "", "0"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:2>"}}, 2), new String[][]{{"getExtendedInterfacesCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 3, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:3>"}}, 1), new String[][]{{"getModifies", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptySet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.\rsdoc.authormissing"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING msg.sdoc.authormissing 0 [length: 22] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=22, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceF...#378#1681713846", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:5>"}}, 1), new String[][]{{"getParameterCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.<d"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"msg.\r"}, true), new String[][]{{"getCharno", "", "0"}, {"getChildCount", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.<"}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1 0 [length: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSource...#334#2122531130", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.<dHello, orld"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"(S"}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"1.<dHello, "}, true);
  assertNotNull(actual);
  assertEquals("com.google.javascript.rhino.Node$StringNode", actual.getClass().getName());
  assertEquals("STRING 1 0 [length: 1] {getCharno=0, getChildCount=0, getDouble=!UnsupportedOperationException, getLength=1, getLineno=0, getQualifiedName=null, getSideEffectFlags=0, getSourceFileName=null, getSource...#334#2122531130", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:0>"}}, 3), new String[][]{{"getParameterNames", "", "2"}});
  assertNotNull(actual);
  assertEquals("com.google.common.collect.EmptyImmutableSet", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "parseTypeString", new String[]{"java.lang.String"}, new String[]{"("}, true);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("com.google.javascript.jscomp.parsing.JsDocInfoParser", "com.google.javascript.jscomp.parsing.JsDocInfoParser", "getFileOverviewJSDocInfo", new String[]{}, new String[]{}, false, 0, new String[][]{{"com.google.javascript.jscomp.parsing.JsDocInfoParser", "setFileOverviewJSDocInfo", "com.google.javascript.rhino.JSDocInfo", "<sample:6>"}}, 2), new String[][]{{"getMarkers", "", "6"}, {"remove", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
}
