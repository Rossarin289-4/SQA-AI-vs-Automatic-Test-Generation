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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:1>", "<sample:5>", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:7>", "<sample:6>", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<null>", "<s:>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<i:0>", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<null>", "<d:1.5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<i:0>", "<i:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getArguments", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:0>", "<sample:4>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "java.lang.Object,java.lang.Object", "<i:0>", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getPrecedence", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()()[null][null][null]/null != 0:sample(null, null, null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null != 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=!=, isContextDependent=!NullPointerEx...#208#-759925093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:sample(null, null, null) != /UNKNOWN::null/null/parent::null", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) != /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=!=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample != '0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample != '0' {getArguments=[$0:sample, '0'], getSymbol=!=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' != unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' != unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=!=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<s:a>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:4>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' != unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' != unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=!=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<null>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<sample:1>", "<s:key>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<i:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:5>", "<null>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", "java.util.Iterator,java.lang.Object", "<empty>", "<i:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' != unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' != unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=!=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' != unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' != unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=!=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:1>", "<null>", "<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample != '0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample != '0' {getArguments=[$0:sample, '0'], getSymbol=!=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' != unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' != unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=!=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:1>", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' != unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' != unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=!=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:0>", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:0>", "<sample:0>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "java.lang.Object,java.lang.Object", "<i:-1>", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "java.lang.Object,java.lang.Object", "<sample:1>", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' != unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' != unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=!=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:2>", "<i:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "java.lang.Object,java.lang.Object", "<s:key>", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' != unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' != unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=!=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:4>", "<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:2>", "<i:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<i:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:1>", "<i:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample != '0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample != '0' {getArguments=[$0:sample, '0'], getSymbol=!=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<empty>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:6>", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<null>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<null>", "<i:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<null>", "<empty>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:0>", "<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:7>", "<sample:6>", "<sample:4>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:1>", "<i:13>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample != '0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample != '0' {getArguments=[$0:sample, '0'], getSymbol=!=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getPrecedence", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:0>", "<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getPrecedence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:0>", "<i:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:1>", "<i:13>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample != '0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample != '0' {getArguments=[$0:sample, '0'], getSymbol=!=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "java.lang.Object,java.lang.Object", "<i:0>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("!=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:7>", "<sample:1>", "<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<null>", "<s:key>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<d:1.5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getPrecedence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:5>", "<sample:6>", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:5>", "<sample:6>", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 14, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getPrecedence", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "java.lang.Object,java.lang.Object", "<s:key>", "<d:1.5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:6>", "<sample:7>", "<sample:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:3>", "<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<null>", "<sample:1>", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[unknownFunction-1()()[null][null][null]/null, 0:sample(null, null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:0>", "<sample:1>", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[0:sample(null, null, null), /UNKNOWN::null/null/parent::null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getPrecedence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<empty>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<null>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<null>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<null>", "<empty>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getPrecedence", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<empty>", "<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:4>", "<sample:6>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:4>", "<sample:7>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:2>", "<empty>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:2>", "<sample:9>", "<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:6>", "<null>", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<s:`>", "<d:-1.5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:2>", "<sample:0>", "<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:2>", "<sample:2>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:1>", "<sample:4>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<sample:2>", "<s:>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<i:13>", "<i:-2147483648>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:5>", "<sample:4>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<sample:2>", "<s:>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<i:13>", "<i:-2147483648>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:4>", "<sample:4>", "<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<s:>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "java.lang.Object,java.lang.Object", "<b:true>", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:7>", "<sample:2>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:true>", "<b:true>"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' = unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol==, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:2>", "<empty>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:6>", "<null>", "<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "java.lang.Object,java.lang.Object", "<s:FAa>", "<i:-5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<b:true>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:3>", "<sample:1>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<b:true>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:3>", "<sample:5>", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<b:false>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:3>", "<sample:5>", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:ccccc0>", "<b:false>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:ccccc0>", "<b:true>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:>", "<i:30>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:>", "<i:30>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<null>", "<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:1>", "<s:>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:3>", "<s:>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:2>", "<s:>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:3>", "<s:>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<empty>", "<s:>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<null>", "<s:2>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:1>", "<i:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:0>", "<i:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<sample:0>", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:0>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[unknownFunction-1()()[null][null][null]/null, 0:sample(null, null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null != 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=!=, isContextDependent=!NullPointerEx...#208#-759925093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:0>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[unknownFunction-1()()[null][null][null]/null, 0:sample(null, null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null != 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=!=, isContextDependent=!NullPointerEx...#208#-759925093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:0>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[0:sample(null, null, null), /UNKNOWN::null/null/parent::null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) != /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=!=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:0>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:0>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[$0:sample, '0']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample != '0' {getArguments=[$0:sample, '0'], getSymbol=!=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null != 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=!=, isContextDependent=!NullPointerEx...#208#-759925093", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) != /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=!=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 20, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample != '0' {getArguments=[$0:sample, '0'], getSymbol=!=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample != '0' {getArguments=[$0:sample, '0'], getSymbol=!=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' != unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=!=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 39, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample(null) != null {getArguments=[sample(null), null], getSymbol=!=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 39, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample(null) != null {getArguments=[sample(null), null], getSymbol=!=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:0>", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:0>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("['0', unknownFunction0()(null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'0' != unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=!=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[unknownFunction-1()()[null][null][null]/null, 0:sample(null, null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:2>", "<null>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[0:sample(null, null, null), /UNKNOWN::null/null/parent::null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:2>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[0:sample(null, null, null), /UNKNOWN::null/null/parent::null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[$0:sample, '0']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("['0', unknownFunction0()(null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'0' = unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol==, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<s:key>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<null>", "<s:k<z>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:jef2z>", "<i:1>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getArguments", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:3>", "<i:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:1>", "<d:1.5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:1>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:1>", "<d:-1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:3>", "<i:13>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "contains", "java.util.Iterator,java.lang.Object", "<sample:3>", "<i:13>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isSymmetric", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:3>", "<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:13>"}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 20, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' = unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol==, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 21, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' = unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol==, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isContextDependent", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "java.lang.Object,java.lang.Object", "<i:-1>", "<s:ke>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationNotEqual", "equal", "java.lang.Object,java.lang.Object", "<i:-1073741825>", "<s:ke>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) != /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=!=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:5>", "<sample:6>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:5>", "<sample:8>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<i:-1>", "<i:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:4>", "<sample:8>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<i:-1>", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:4>", "<sample:8>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "java.lang.Object,java.lang.Object", "<i:-1>", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:4>", "<sample:8>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:4>", "<sample:8>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:4>", "<sample:8>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:4>", "<sample:8>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:4>", "<sample:8>", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:0>", "<sample:6>", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 39, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "contains", "java.util.Iterator,java.lang.Object", "<sample:0>", "<b:true>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<null>", "<sample:6>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample(null) = null {getArguments=[sample(null), null], getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 42, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<null>", "<sample:6>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$sample = 'null' {getArguments=[$sample, 'null'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:0>", "<sample:6>", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:0>", "<sample:6>", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
