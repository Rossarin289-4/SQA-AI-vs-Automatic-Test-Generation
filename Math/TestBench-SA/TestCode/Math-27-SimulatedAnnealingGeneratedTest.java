package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.656612875245797E-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3200.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "32", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 30, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"262204"}, false, 8, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "2147483647"}, {"org.apache.commons.math3.fraction.Fraction", "add", "int", "0"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"0", "99"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-2147483648"}, {"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-1073741824"}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<i:4>"}, {"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-536870912 / 3", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "int", "262204"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "99"}, {"org.apache.commons.math3.fraction.Fraction", "intValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "1"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "1"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-2147483648"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "1"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-2147483648"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "1"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-2147483648"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "10 / 11", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "1"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-2147483648"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "2"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-2147483648"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "262204"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "32", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "262204"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25", String.valueOf(actual));
  assertEquals("receiver state after the call", "16 / 25", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "32", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "16 / 25", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-2147483648"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math3.fraction.Fraction", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-2147483648"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math3.fraction.Fraction", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-2147483648"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}, {"org.apache.commons.math3.fraction.Fraction", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "10 / 11", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-2147483648"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}, {"org.apache.commons.math3.fraction.Fraction", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-2147483648"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"101"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-101", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"101"}, false, 15, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-102", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"161"}, false, 15, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-162", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"158"}, false, 15, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-159", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"119"}, false, 15, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-120", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"59"}, false, 15, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-60", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"65595"}, false, 15, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-65596", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"32797"}, false, 15, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-32798", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"32775"}, false, 15, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-32776", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"268697660"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 268697660", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"134348830"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 134348830", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"134348784"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 134348784", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-134348784"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 134348784", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-268697568"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 268697568", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-268697583"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 268697583", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-134479855"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 134479855", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-63"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-11 / 756", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math3.fraction.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-1073741824"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24458", String.valueOf(actual));
  assertEquals("receiver state after the call", "32", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23890", String.valueOf(actual));
  assertEquals("receiver state after the call", "16 / 25", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 18, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("24064", String.valueOf(actual));
  assertEquals("receiver state after the call", "20 / 51", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 19, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32709", String.valueOf(actual));
  assertEquals("receiver state after the call", "255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 21, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("60274", String.valueOf(actual));
  assertEquals("receiver state after the call", "1000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 22, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23311", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("10 / 11", String.valueOf(actual));
  assertEquals("receiver state after the call", "10 / 11", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1200.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3200.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "32", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("4.656613E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.07374182E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-9", String.valueOf(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-10 / 11", String.valueOf(actual));
  assertEquals("receiver state after the call", "10 / 11", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-11 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "262204"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("25", String.valueOf(actual));
  assertEquals("receiver state after the call", "16 / 25", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "268697660"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}, {"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "32", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "100"}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "100"}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "10 / 11", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "100"}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-10"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"1014"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1015", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"268697660"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-268697661", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"268697691"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-268697692", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"268697730"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-268697731", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"134357057"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-134357058", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"67178528"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-67178529", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getOne", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getRuntimeClass", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.apache.commons.math3.fraction.Fraction {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.apache.commons.math3.fraction.Fraction, getClasses=[], getConstructors=[public org.a...#904#1852747929", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getRuntimeClass", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.apache.commons.math3.fraction.Fraction {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.apache.commons.math3.fraction.Fraction, getClasses=[], getConstructors=[public org.a...#904#1852747929", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}}), new String[][]{{"getZero", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math3.fraction.Fraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"-2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"-1073741824"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1073741825", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"-1073741824"}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1073741825", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"99"}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"100"}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"159"}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("158", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"159"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("160", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"95"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("96", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"79"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "-1073741824"}, {"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483491 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}, {"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.656612875245797E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}, {"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418235E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}, {"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}, {"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-12"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8333333333333334", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}, {"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-12"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("7.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9090909090909091", String.valueOf(actual));
  assertEquals("receiver state after the call", "10 / 11", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9166666666666666", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("12.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("32.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "32", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"262204"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 262204", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"268697660"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 268697660", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"1073741823"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-11 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"1073741824"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"1073741824"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-536870912", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-1073741824"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("536870912", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"1073741823"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1073741825 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"2147483647"}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483639", String.valueOf(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 22, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23311", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 23, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23089", String.valueOf(actual));
  assertEquals("receiver state after the call", "-5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "262342"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "268697660"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "-2139095008"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "-2139095008"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483648 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483647", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1073741823", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1073741823", "262204"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1073741823 / 262204", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "262204"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-536870912 / 65551", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1200.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"100"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 100", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("91.66666666666666", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("64.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "16 / 25", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("39.21568627450981", String.valueOf(actual));
  assertEquals("receiver state after the call", "20 / 51", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("25500.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "122"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100000.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "122"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "122"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-500.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-5", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("255.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<i:-16>"}, {"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"99"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 99", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-99"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 99", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-88"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 88", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-176"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 176", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23274", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147460339", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147460410", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-1"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23464", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23533", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23607", String.valueOf(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9090909090909091", String.valueOf(actual));
  assertEquals("receiver state after the call", "10 / 11", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9166666666666666", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("12.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "10 / 11", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("12", String.valueOf(actual));
  assertEquals("receiver state after the call", "12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("32", String.valueOf(actual));
  assertEquals("receiver state after the call", "32", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "16 / 25", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-8131"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"268697660"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-268697660", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-134348830"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("134348830", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-134348769"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("134348769", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"2147483646"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-1073741823"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 14", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:11>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 18", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1 / 2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
}
