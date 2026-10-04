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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTranslate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFalse", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionBoolean", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNamespaceURI", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("['0']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNamespaceURI", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNumber", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("concat", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:9>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:9>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNull", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionContains", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionPosition", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSum", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSum", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction255()('0')", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCount", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("root", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionID", "org.apache.commons.jxpath.ri.EvalContext", "<sample:16>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCount", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction255()", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNumber", "org.apache.commons.jxpath.ri.EvalContext", "<sample:10>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", new String[]{}, new String[]{}, false, 41, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction1000()('null', last(null, null))", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction1000()('null', last(null, null)) {getArgumentCount=2, getArguments=['null', last(null, null)], getFunctionCode=1000, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", "org.apache.commons.jxpath.ri.EvalContext", "<sample:10>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", ""}}, 1), new String[][]{{"isContextDependent", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionBoolean", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCount", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction255()", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLang", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction255()", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNot", "org.apache.commons.jxpath.ri.EvalContext", "<sample:15>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:17>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFalse", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("['0']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFloor", "org.apache.commons.jxpath.ri.EvalContext", "<sample:14>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCount", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTranslate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNamespaceURI", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTranslate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNamespaceURI", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNamespaceURI", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationAnd", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNamespaceURI", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTranslate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("count", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction0()", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("last", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction2147483647()", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("local-name", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("name", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("contains", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFalse", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFalse", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 3), new String[][]{{"hasNext", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()()", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFloor", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionContains", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionContains", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSum", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFalse", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFloor", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", "org.apache.commons.jxpath.ri.EvalContext", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLang", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNamespaceURI", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCount", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 13, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionID", "org.apache.commons.jxpath.ri.EvalContext", "<sample:10>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionPosition", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:10>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction0()", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("last", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction2147483647()", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("count", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:9>"}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNamespaceURI", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNot", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTranslate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTranslate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTranslate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 11, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFalse", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationAnd", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}), new String[][]{{"isContextDependent", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}), new String[][]{{"isContextDependent", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}), new String[][]{{"isContextDependent", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFalse", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 12, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 11, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 14, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionPosition", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTranslate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNot", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionBoolean", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionBoolean", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNumber", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSum", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionBoolean", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionContains", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLang", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCount", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNumber", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNumber", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionBoolean", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionBoolean", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionBoolean", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTranslate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionBoolean", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTranslate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNamespaceURI", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNull", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCount", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLang", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNumber", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}), new String[][]{{"getSymbol", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("or", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", "org.apache.commons.jxpath.ri.EvalContext", "<sample:11>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}), new String[][]{{"getNameTestExpression", "", "1"}});
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}), new String[][]{{"getArguments", "", "1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction0()", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("contains", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("normalize-space", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionBoolean", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("count", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTranslate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionID", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSum", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 10, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationDivide", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFloor", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFalse", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionID", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("last", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction2147483647()", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()()", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeContextDependent", new String[]{}, new String[]{}, false, 37, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction64()(sample(null)) {getArgumentCount=1, getArguments=[sample(null)], getFunctionCode=64, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionContains", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationMod", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionContains", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationNegate", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionContains", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionContains", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 8, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCount", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCount", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFalse", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}), new String[][]{{"hasNext", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", ""}}), new String[][]{{"iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("local-name", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionKey", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFloor", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNamespaceURI", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNot", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNot", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNot", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringBefore", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNot", "org.apache.commons.jxpath.ri.EvalContext", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNamespaceURI", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionContains", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionContains", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionContains", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSum", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSum", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:10>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", new String[]{}, new String[]{}, false), new String[][]{{"getArguments", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1), new String[][]{{"getArguments", "", "5"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}, 2);
  assertNull(actual);
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNull", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTranslate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}}, 3), new String[][]{{"iterate", "org.apache.commons.jxpath.ri.EvalContext", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLang", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNamespaceURI", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNamespaceURI", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionPosition", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionPosition", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:10>"}, false, 10, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionPosition", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:11>"}, false, 13, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionString", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFloor", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLang", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFalse", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLast", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStartsWith", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLang", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 1), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:10>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNull", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg2", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFloor", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNot", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionFloor", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNot", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstring", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNull", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionID", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionStringLength", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", "org.apache.commons.jxpath.ri.EvalContext", "<sample:10>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationOr", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:10>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArguments", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()()", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 10, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNormalizeSpace", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionContains", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:10>"}, false, 12, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNot", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNumber", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}), new String[][]{{"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionBoolean", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getFunctionName", new String[]{}, new String[]{}, false, 19, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction255()", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionConcat", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNot", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}}), new String[][]{{"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionPosition", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNull", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction255()('0') {getArgumentCount=1, getArguments=['0'], getFunctionCode=255, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$EmptyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArgumentCount", ""}}, 1), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false), new String[][]{{"next", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNull", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:13>"}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTrue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCeiling", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionBoolean", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}), new String[][]{{"getArguments", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[null, null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", new String[]{}, new String[]{}, false, 9, new String[][]{}), new String[][]{{"getArguments", "", "2"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[null]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionRound", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNull", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:10>"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNull", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:sample", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionName", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionNull", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionLocalName", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSum", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionBoolean", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionSubstringAfter", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.jxpath.JXPathInvalidSyntaxException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg3", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionTranslate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionPosition", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()() {getArgumentCount=0, getArguments=null, getFunctionCode=-1, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreFunction", "org.apache.commons.jxpath.ri.compiler.CoreFunction", "functionCount", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreFunction", "getArg1", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
}
