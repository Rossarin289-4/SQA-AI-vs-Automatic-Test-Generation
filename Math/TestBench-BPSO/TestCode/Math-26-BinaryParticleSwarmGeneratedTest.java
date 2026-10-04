package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483645 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"50"}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}, {"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-50", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"20", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-5 / 536870912", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-536870892"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("536870893", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"51", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"-72"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("73 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("715827881 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"0", "-156"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-20"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 20", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8333333333333334", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-6 / 5", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-11 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"-1065353216"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "12"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1065353215", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:10>"}, {"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-55 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:12>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:11>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "20"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "124"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "-32718"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.656612875245797E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<s:ab>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "37"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418235E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "-20"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"198"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-197", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:8>"}, {"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:Ta>"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<s:oa>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:15>"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getRuntimeClass", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.apache.commons.math3.fraction.Fraction {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.apache.commons.math3.fraction.Fraction, getClasses=[], getConstructors=[public org.a...#904#1852747929", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.656612875245797E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "20"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:14>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-2147483642"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483642", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418235E11", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483608"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483608", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-99"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:14>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483550 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "1073741821"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483648 / 1073741821", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-2147483610"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483610", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-2147483640"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483640", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.656612875245797E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"100"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-99 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-268435446"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("268435446", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"-2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"134217778"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:L>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<s:\n>"}}), new String[][]{{"getZero", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483648 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false), new String[][]{{"getRuntimeClass", "", "6"}, {"getRuntimeClass", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.apache.commons.math3.fraction.Fraction {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.apache.commons.math3.fraction.Fraction, getClasses=[], getConstructors=[public org.a...#904#1852747929", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"101"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483546 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.656612875245797E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-65520"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("65520", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:10>"}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8333333333333334", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-2147418112"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147418112", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"1073741823"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"58"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("58", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"2147483646"}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483645", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-134217678"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-134217678", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418235E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"20"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("19", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"512"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-511 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:I>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483645 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"37"}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-217 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23311", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-41>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-6 / 5", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-134217723"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("134217722", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483646 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"-536870892"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1073741863 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-100"}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-100", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"-2147483640"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483641", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-227"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("11 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"66"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483515 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-104"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 104", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("6 / 5", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483648 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.656612875245797E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"100"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 200", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("4.656613E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483648 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"116"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("117", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"40"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 40", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"2147483646"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483645", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:14>"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "2147483642"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483646 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147460410", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"-2147483607"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483608", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-2096954"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}, {"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2096954", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"37", "86"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("37 / 86", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483603"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483603", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-4095"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483642"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1073741824 / 1073741821", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"50", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-25 / 1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483647", "-20"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "134217782"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"1073741759", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1073741759 / 2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.656612875245797E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-2"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "58"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"99"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getZero", "", "3"}, {"getRuntimeClass", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.apache.commons.math3.fraction.Fraction {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.apache.commons.math3.fraction.Fraction, getClasses=[], getConstructors=[public org.a...#904#1852747929", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "50"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483648 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<s:T>"}}, 2), new String[][]{{"getZero", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483642", "-19"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483642 / 19", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:16>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "134217778"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 134217778", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 7", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"114"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 114", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-268435484"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-268435483 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:13>"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("11 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8333333333333334", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418235E11", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483646"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-20"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("21", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("83.33333333333334", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483645 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"getRuntimeClass", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.apache.commons.math3.fraction.Fraction {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.apache.commons.math3.fraction.Fraction, getClasses=[], getConstructors=[public org.a...#904#1852747929", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-23 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-1048543"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2146435105", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "-49"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
}
