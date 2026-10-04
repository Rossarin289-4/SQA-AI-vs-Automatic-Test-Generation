package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample >= '0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample >= '0' {getArguments=[$0:sample, '0'], getSymbol=>=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' >= unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' >= unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", "int", "-1"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", "int", "60"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[unknownFunction-1()()[null][null][null]/null, 0:sample(null, null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null <= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=<=, isContextDependent=!NullPointerEx...#208#-1294695535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getPrecedence", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' < unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=<, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getArguments", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) < /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=<, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample < '0' {getArguments=[$0:sample, '0'], getSymbol=<, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getSymbol", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isSymmetric", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isSymmetric", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()()[null][null][null]/null >= 0:sample(null, null, null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null >= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>=, isContextDependent=!NullPointerEx...#208#97347605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:sample(null, null, null) >= /UNKNOWN::null/null/parent::null", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) >= /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", "int", "1"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", "int", "-2147483648"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", "int", "0"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", "int", "0"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", "int", "5"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getSymbol", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getPrecedence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getPrecedence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null >= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>=, isContextDependent=!NullPointerEx...#208#97347605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getPrecedence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) >= /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample >= '0' {getArguments=[$0:sample, '0'], getSymbol=>=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' >= unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 25, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 14, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", "int", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 12, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getSymbol", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getSymbol", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isSymmetric", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isSymmetric", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"-2147483648"}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"2147479551"}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", "int", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"-6"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 8, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isSymmetric", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getPrecedence", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getArguments", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null <= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=<=, isContextDependent=!NullPointerEx...#208#-1294695535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) <= /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=<=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample <= '0' {getArguments=[$0:sample, '0'], getSymbol=<=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false, 21, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' <= unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=<=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isSymmetric", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample >= '0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample >= '0' {getArguments=[$0:sample, '0'], getSymbol=>=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()()[null][null][null]/null >= 0:sample(null, null, null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null >= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>=, isContextDependent=!NullPointerEx...#208#97347605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", "int", "1"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getPrecedence", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isContextDependent", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"-1"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getSymbol", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getPrecedence", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeContextDependent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", new String[]{"int"}, new String[]{"1073741900"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:10>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getPrecedence", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getPrecedence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isSymmetric", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null < 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=<, isContextDependent=!NullPointerExce...#206#-1883815989", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", "int", "-1"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getPrecedence", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isSymmetric", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) < /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=<, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isContextDependent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()()[null][null][null]/null <= 0:sample(null, null, null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null <= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=<=, isContextDependent=!NullPointerEx...#208#-1294695535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0:sample(null, null, null) <= /UNKNOWN::null/null/parent::null", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) <= /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=<=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isContextDependent", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null >= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>=, isContextDependent=!NullPointerEx...#208#97347605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null >= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>=, isContextDependent=!NullPointerEx...#208#97347605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[unknownFunction-1()()[null][null][null]/null, 0:sample(null, null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null >= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>=, isContextDependent=!NullPointerEx...#208#97347605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) < /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=<, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 10, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isContextDependent", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null <= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=<=, isContextDependent=!NullPointerEx...#208#-1294695535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) <= /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=<=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample <= '0' {getArguments=[$0:sample, '0'], getSymbol=<=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' <= unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=<=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[0:sample(null, null, null), /UNKNOWN::null/null/parent::null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) >= /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[$0:sample, '0']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample >= '0' {getArguments=[$0:sample, '0'], getSymbol=>=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("['0', unknownFunction0()(null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "'0' >= unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "isSymmetric", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getSymbol", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null < 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=<, isContextDependent=!NullPointerExce...#206#-1883815989", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getSymbol", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) < /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=<, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">=", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null >= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>=, isContextDependent=!NullPointerEx...#208#97347605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">=", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) >= /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">=", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample >= '0' {getArguments=[$0:sample, '0'], getSymbol=>=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">=", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' >= unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", "int", "2147483647"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) <= /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=<=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", "int", "2147483647"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isContextDependent", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample <= '0' {getArguments=[$0:sample, '0'], getSymbol=<=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", "int", "2147483647"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isContextDependent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", new String[]{"int"}, new String[]{"18"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getSymbol", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", new String[]{"int"}, new String[]{"-20"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", new String[]{"int"}, new String[]{"1073741823"}, false, 1, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isContextDependent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", "int", "0"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null < 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=<, isContextDependent=!NullPointerExce...#206#-1883815989", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getPrecedence", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", "int", "-16384"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) < /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=<, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getPrecedence", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", "int", "-16384"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample < '0' {getArguments=[$0:sample, '0'], getSymbol=<, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getPrecedence", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", "int", "-16384"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' < unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=<, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getPrecedence", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", new String[]{"int"}, new String[]{"-46"}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getSymbol", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", "int", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", "int", "36"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", "int", "36"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", "int", "10"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "evaluateCompare", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:9>"}, false, 9, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample > '0' {getArguments=[$0:sample, '0'], getSymbol=>, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isSymmetric", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' > unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=>, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isContextDependent", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isContextDependent", new String[]{}, new String[]{}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", "int", "10"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", "int", "60"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[0:sample(null, null, null), /UNKNOWN::null/null/parent::null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) <= /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=<=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[$0:sample, '0']", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "$0:sample <= '0' {getArguments=[$0:sample, '0'], getSymbol=<=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("unknownFunction-1()()[null][null][null]/null <= 0:sample(null, null, null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null <= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=<=, isContextDependent=!NullPointerEx...#208#-1294695535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("$0:sample <= '0'", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample <= '0' {getArguments=[$0:sample, '0'], getSymbol=<=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' <= unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' <= unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=<=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("'0' <= unknownFunction0()(null)", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' <= unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=<=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 10, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) < /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=<, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isSymmetric", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample < '0' {getArguments=[$0:sample, '0'], getSymbol=<, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:4>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", "int", "8192"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isSymmetric", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"-2147483648"}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"2147483621"}, false, 8, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<=", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null <= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=<=, isContextDependent=!NullPointerEx...#208#-1294695535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<=", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) <= /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=<=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:3>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getPrecedence", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:2>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isContextDependent", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("<=", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "evaluateCompare", "int", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "compute", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "isContextDependent", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "iteratePointers", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getArguments", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:7>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getPrecedence", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null <= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=<=, isContextDependent=!NullPointerEx...#208#-1294695535", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getPrecedence", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) <= /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=<=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample <= '0' {getArguments=[$0:sample, '0'], getSymbol=<=, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' <= unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=<=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getPrecedence", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getArguments", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "'0' <= unknownFunction0()(null) {getArguments=['0', unknownFunction0()(null)], getSymbol=<=, isContextDependent=!NullPointerException}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "isContextDependent", new String[]{}, new String[]{}, false, 20, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "$0:sample < '0' {getArguments=[$0:sample, '0'], getSymbol=<, isContextDependent=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "iterate", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "iteratePointers", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "computeValue", "org.apache.commons.jxpath.ri.EvalContext", "<sample:4>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "getArguments", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:15>"}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getArguments", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[unknownFunction-1()()[null][null][null]/null, 0:sample(null, null, null)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null >= 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>=, isContextDependent=!NullPointerEx...#208#97347605", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "getArguments", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThanOrEqual", "iterate", "org.apache.commons.jxpath.ri.EvalContext", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.jxpath.ri.compiler.Expression;", actual.getClass().getName());
  assertEquals("[0:sample(null, null, null), /UNKNOWN::null/null/parent::null]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) >= /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>=, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "evaluateCompare", "int", "10"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "evaluateCompare", "int", "268435456"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getPrecedence", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", "int", "-1"}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "evaluateCompare", "int", "-2147221504"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "unknownFunction-1()()[null][null][null]/null > 0:sample(null, null, null) {getArguments=[unknownFunction-1()()[null][null][null]/null, 0:sample(null.., getSymbol=>, isContextDependent=!NullPointerExce...#206#1765632651", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "getSymbol", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "computeContextDependent", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(">", String.valueOf(actual));
  assertEquals("receiver state after the call", "0:sample(null, null, null) > /UNKNOWN::null/null/parent::null {getArguments=[0:sample(null, null, null), /UNKNOWN::null/null/parent::nul.., getSymbol=>, isContextDependent=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThanOrEqual", "getSymbol", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeValue", new String[]{"org.apache.commons.jxpath.ri.EvalContext"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "computeContextDependent", ""}, {"org.apache.commons.jxpath.ri.compiler.CoreOperationLessThan", "getArguments", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "org.apache.commons.jxpath.ri.compiler.CoreOperationGreaterThan", "isContextDependent", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.jxpath.ri.compiler.CoreOperationRelationalExpression", "compute", "org.apache.commons.jxpath.ri.EvalContext", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
}
