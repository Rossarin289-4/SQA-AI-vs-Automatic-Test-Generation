package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "contains", "java.util.Iterator,java.lang.Object", "<sample:0>", "<i:-1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<empty>", "<s:b>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:0>", "<s:b8>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "contains", "java.util.Iterator,java.lang.Object", "<sample:3>", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<null>", "<sample:6>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<null>", "<sample:5>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:5>", "<sample:6>", "<sample:6>"}, false, 13, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:5>", "<sample:6>", "<sample:9>"}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "findMatch", "java.util.Iterator,java.util.Iterator", "<null>", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:0>", "<sample:0>", "<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:key>", "<s:b>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:8>", "<sample:6>", "<sample:8>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:10>", "<sample:5>", "<sample:8>"}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:b>", "<s:b>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:10>", "<sample:0>", "<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "contains", "java.util.Iterator,java.lang.Object", "<sample:1>", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<d:1.5>", "<d:1.5>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:3>", "<null>", "<sample:10>"}, false, 10, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<null>", "<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:2>", "<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:a>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:3>", "<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"org.apache.commons.jxpath.ri.EvalContext", "org.apache.commons.jxpath.ri.compiler.Expression", "org.apache.commons.jxpath.ri.compiler.Expression"}, new String[]{"<sample:3>", "<sample:4>", "<sample:8>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:key>", "<i:-1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "contains", "java.util.Iterator,java.lang.Object", "<sample:1>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:1>", "<b:true>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getPrecedence", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "findMatch", "java.util.Iterator,java.util.Iterator", "<empty>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 12, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[unknownFunction-1()()[null][null][null]/null, 0:sample(null, null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[0:sample(null, null, null), /UNKNOWN::null/null/parent::null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[$0:sample, '0']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<null>", "<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<null>", "<null>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:0>", "<sample:0>"}, false, 11, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-1>", "<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<null>", "<i:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "findMatch", "java.util.Iterator,java.util.Iterator", "<sample:0>", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:2>", "<s:>"}, false, 12, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:je\u00e9yzz>", "<b:false>"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:5>", "<sample:2>", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<b:true>"}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:0>", "<sample:8>", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:5>", "<sample:5>", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<b:true>"}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:0>", "<sample:8>", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:5>", "<sample:3>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<i:-2147483648>", "<sample:0>"}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:0>", "<sample:8>", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:5>", "<sample:3>", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:je\u00e9yzz>", "<i:-1>"}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:9>", "<sample:6>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<s:jf\u00e9ryzz>", "<i:-1>"}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:7>", "<sample:6>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:false>", "<s:+P>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:9>", "<sample:8>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "equal", new String[]{"java.lang.Object", "java.lang.Object"}, new String[]{"<b:false>", "<null>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:9>", "<sample:8>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:1>", "<sample:8>", "<sample:8>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:1>", "<sample:8>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:1>", "<sample:8>", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("['0', unknownFunction0()(null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'0' = unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol==, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<i:2>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:9>", "<null>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 20, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 21, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' = unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol==, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:}ey>", "<s:>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isSymmetric", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:key>", "<i:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:key>", "<i:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getArguments", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:a>", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:7a>", "<i:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:7a>", "<i:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:7a>", "<i:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:8>", "<s:je\u00e9yzz>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<sample:0>", "<i:-1073741824>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "contains", "java.util.Iterator,java.lang.Object", "<null>", "<s:a>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:f88>", "<s:je\u00e9>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<s:k>", "<i:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "findMatch", "java.util.Iterator,java.util.Iterator", "<null>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:1>", "<sample:6>", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:4>", "<sample:6>", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getArguments", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:3>", "<sample:6>", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isSymmetric", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "isContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "org.apache.commons.jxpath.ri.EvalContext,org.apache.commons.jxpath.ri.compiler.Expression,org.apache.commons.jxpath.ri.compiler.Expression", "<sample:3>", "<sample:6>", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<null>", "<b:false>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:2>", "<b:false>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:1>", "<b:true>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "findMatch", "java.util.Iterator,java.util.Iterator", "<null>", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "findMatch", "java.util.Iterator,java.util.Iterator", "<null>", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getArguments", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<sample:2>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<i:2>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "findMatch", new String[]{"java.util.Iterator", "java.util.Iterator"}, new String[]{"<null>", "<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<i:39>", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeContextDependent", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "contains", "java.util.Iterator,java.lang.Object", "<sample:2>", "<s:jem\u00e9yzzn>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null = 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol==, isContextDependent=!NullPointerExce...#206#2088391979", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "contains", "java.util.Iterator,java.lang.Object", "<sample:2>", "<s:jem\u00e9yzzn>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "contains", "java.util.Iterator,java.lang.Object", "<sample:2>", "<s:jem\u00e9yzzn>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "getSymbol", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "contains", "java.util.Iterator,java.lang.Object", "<sample:2>", "<s:jem\u00e9yzzn>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("=", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' = unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol==, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:3>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<null>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "contains", new String[]{"java.util.Iterator", "java.lang.Object"}, new String[]{"<sample:2>", "<s:>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "equal", "java.lang.Object,java.lang.Object", "<i:63>", "<b:false>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) = /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol==, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "org.apache.commons.jxpath.ri.compiler.CoreOperationEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationCompare", "getPrecedence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample = '0' {getArguments=[$0:sample, '0'], getSymbol==, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
