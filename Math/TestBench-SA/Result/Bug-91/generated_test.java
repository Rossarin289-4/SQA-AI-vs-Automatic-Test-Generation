package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:11>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "longValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23692", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c8c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:7>"}, {"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:12>"}, false, 13, new String[][]{{"org.apache.commons.math.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ad0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c8c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483648"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:8>"}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:8>"}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}, {"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:8>"}, {"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5d48", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5a34", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@59ec", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5a58", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5a34", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5a34", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.math.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math.fraction.Fraction", "negate", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:8>"}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:8>"}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:8>"}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:10>"}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5c1a", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c1a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 9, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@6018", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bf4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math.fraction.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<null>"}, {"org.apache.commons.math.fraction.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<null>"}, {"org.apache.commons.math.fraction.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math.fraction.Fraction", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "floatValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math.fraction.Fraction", "abs", ""}, {"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<i:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@58c6", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5a12", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "longValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bf4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c1a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aa2", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "longValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5d54", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}, {"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147460410", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23350", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23388", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23426", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23311", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bf4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c1a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c8c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 15, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 8, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:10>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.math.fraction.Fraction", "hashCode", ""}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:11>"}, false, 15, new String[][]{{"org.apache.commons.math.fraction.Fraction", "hashCode", ""}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:11>"}, false, 14, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b5c", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 14, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:11>"}, false, 9, new String[][]{{"org.apache.commons.math.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5bf4", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bf4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5e48", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c8c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "floatValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "negate", ""}, {"org.apache.commons.math.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math.fraction.Fraction", "negate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math.fraction.Fraction", "negate", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.math.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@622e", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bf4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@59ea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math.fraction.Fraction", "hashCode", ""}, {"org.apache.commons.math.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "negate", ""}, {"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5a7c", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5a12", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5c1a", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c1a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 10, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:10>"}, {"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:10>"}, {"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483647", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0c", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}, {"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "abs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c8c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bf4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c1a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "negate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b86", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "hashCode", ""}, {"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b5c", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "hashCode", ""}, {"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b80", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ba6", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b80", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5bf2", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23311", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23502", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23540", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bf4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23578", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c1a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23274", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math.fraction.Fraction", "abs", ""}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23692", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c8c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23388", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23274", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23890", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5d52", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32964", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@80c4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "negate", ""}, {"org.apache.commons.math.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "negate", ""}, {"org.apache.commons.math.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("4.656613E-10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.Fraction", "negate", ""}, {"org.apache.commons.math.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.07374182E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "negate", ""}, {"org.apache.commons.math.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.6666667", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac7", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:10>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.fraction.Fraction", "hashCode", ""}, {"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5d52", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5acb", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ad8", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:8a6>"}, false, 12, new String[][]{{"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 11, new String[][]{{"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c1a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac7", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b82", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23274", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32964", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@80c4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4774", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@12a6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}, {"org.apache.commons.math.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147460339", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}, {"org.apache.commons.math.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23089", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5a31", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.85714287", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.875", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bf4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8888889", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c1a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.9166667", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c8c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.64", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5d52", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 26, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("4.656613E-10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 27, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.07374182E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 29, new String[][]{{"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.875", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bf4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 33, new String[][]{{"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.9166667", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c8c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5ac5", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"10", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5978", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b36", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b5c", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b82", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 9, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bf4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c1a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("4.656613E-10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aa0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:10>"}, false, 9, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@6d8c", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bf4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5db4", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c8c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "add", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}, {"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b80", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23350", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23426", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:19>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "divide", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:12>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.Fraction", "hashCode", ""}, {"org.apache.commons.math.fraction.Fraction", "compareTo", "org.apache.commons.math.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("4.656613E-10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.07374182E9", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.6666667", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.85714287", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.875", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bf4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8888889", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c1a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "reciprocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.656612875245797E-10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bf4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.6666667", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b82", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.85714287", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5bce", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5b0f", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.Fraction", actual.getClass().getName());
  assertEquals("org.apache.commons.math.fraction.Fraction@5aea", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.656612875245797E-10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "hashCode", ""}, {"org.apache.commons.math.fraction.Fraction", "subtract", "org.apache.commons.math.fraction.Fraction", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:16>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:16>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b0f", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:16>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c8c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:16>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:18>"}, {"org.apache.commons.math.fraction.Fraction", "negate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5d52", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:18>"}, {"org.apache.commons.math.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5d52", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "multiply", "org.apache.commons.math.fraction.Fraction", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b36", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c1a", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math.fraction.Fraction", "divide", "org.apache.commons.math.fraction.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5c8c", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5ac5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5aea", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}, {"org.apache.commons.math.fraction.Fraction", "longValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.Fraction", "org.apache.commons.math.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.Fraction", "add", "org.apache.commons.math.fraction.Fraction", "<sample:11>"}, {"org.apache.commons.math.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math.fraction.Fraction", "getNumerator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "org.apache.commons.math.fraction.Fraction@5b5c", SearchInputFactory_scaffolding.receiverState());
 }
}
