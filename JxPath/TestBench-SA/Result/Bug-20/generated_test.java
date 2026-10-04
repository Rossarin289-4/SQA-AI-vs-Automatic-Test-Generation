package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[unknownFunction-1()()[null][null][null]/null, 0:sample(null, null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[0:sample(null, null, null), /UNKNOWN::null/null/parent::null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 39, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "-2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[unknownFunction-1()()[null][null][null]/null, 0:sample(null, null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[0:sample(null, null, null), /UNKNOWN::null/null/parent::null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:sample(null, null, null) > /UNKNOWN::null/null/parent::null", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample > '0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' > unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeContextDependent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"60"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"-1073741884"}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[$0:sample, '0']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("['0', unknownFunction0()(null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("['0', unknownFunction0()(null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("['0', unknownFunction0()(null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[unknownFunction-1()()[null][null][null]/null, 0:sample(null, null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[0:sample(null, null, null), /UNKNOWN::null/null/parent::null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[unknownFunction-1()()[null][null][null]/null, 0:sample(null, null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[0:sample(null, null, null), /UNKNOWN::null/null/parent::null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[$0:sample, '0']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 39, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 42, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$sample > 'null' {getArguments=[$sample, 'null'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:sample(null, null, null) > /UNKNOWN::null/null/parent::null", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample > '0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' > unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' > unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[$0:sample, '0']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 21, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("['0', unknownFunction0()(null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 20, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:sample(null, null, null) > /UNKNOWN::null/null/parent::null", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample > '0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' > unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:sample(null, null, null) > /UNKNOWN::null/null/parent::null", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample > '0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "2147483647"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "2147483647"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[$0:sample, '0']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 17, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 39, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 39, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 42, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$sample > 'null' {getArguments=[$sample, 'null'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 39, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 42, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$sample > 'null' {getArguments=[$sample, 'null'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"2147483647"}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 39, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample(null) > null", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 42, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$sample > 'null' {getArguments=[$sample, 'null'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 39, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 61, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", ":a(null, null) > /parent::null/ancestor::null {getArguments=[:a(null, null), /parent::null/ancestor::null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"-2147483648"}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"2147483647"}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 39, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[sample(null), null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 42, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[$sample, 'null']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$sample > 'null' {getArguments=[$sample, 'null'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 43, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("['null', last(null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'null' > last(null, null) {getArguments=['null', last(null, null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 39, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 39, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 42, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "2"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[$sample, 'null']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$sample > 'null' {getArguments=[$sample, 'null'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 43, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "2"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("['null', last(null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'null' > last(null, null) {getArguments=['null', last(null, null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 39, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[sample(null), null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 42, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[$sample, 'null']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$sample > 'null' {getArguments=[$sample, 'null'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 43, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("['null', last(null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'null' > last(null, null) {getArguments=['null', last(null, null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 42, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$sample > 'null'", String.valueOf(actual));
  assertEquals("receiver state after the call", "$sample > 'null' {getArguments=[$sample, 'null'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 43, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'null' > last(null, null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'null' > last(null, null) {getArguments=['null', last(null, null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"175"}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"2097152"}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 39, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[sample(null), null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 39, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[sample(null), null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"-2147483648"}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "20"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 39, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("sample(null) > null", String.valueOf(actual));
  assertEquals("receiver state after the call", "sample(null) > null {getArguments=[sample(null), null], getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 42, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$sample > 'null' {getArguments=[$sample, 'null'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 42, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$sample > 'null' {getArguments=[$sample, 'null'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
