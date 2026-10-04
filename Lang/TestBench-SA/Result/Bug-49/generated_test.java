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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-1", "10", "-32"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "pow", "int", "2147483647"}, {"org.apache.commons.lang.math.Fraction", "toString", ""}, {"org.apache.commons.lang.math.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<null>"}, {"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"2147483603", "-2147483585"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483603/2147483585", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}, {"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"0", "-2147483647", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"32", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/67108864", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "hashCode", ""}, {"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<null>"}, {"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"NaN"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"32", "-2147483594"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-16/1073741797", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}, {"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "pow", "int", "-32"}, {"org.apache.commons.lang.math.Fraction", "doubleValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang.math.Fraction", "longValue", ""}, {"org.apache.commons.lang.math.Fraction", "pow", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-2147483647", "0", "58"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"2147483647", "0", "57"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("91/81", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.lang.math.Fraction", "hashCode", ""}, {"org.apache.commons.lang.math.Fraction", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:14>"}, false, 7, new String[][]{{"org.apache.commons.lang.math.Fraction", "hashCode", ""}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang.math.Fraction", "reduce", ""}, {"org.apache.commons.lang.math.Fraction", "floatValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"9/5"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("9/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:22>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:3>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}, {"org.apache.commons.lang.math.Fraction", "negate", ""}, {"org.apache.commons.lang.math.Fraction", "pow", "int", "-2147483630"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:16>"}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:16>"}, {"org.apache.commons.lang.math.Fraction", "invert", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1 "}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:14>"}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<s:D>"}, {"org.apache.commons.lang.math.Fraction", "pow", "int", "58"}, {"org.apache.commons.lang.math.Fraction", "pow", "int", "68"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.656612875245797E-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 44, new String[][]{{"org.apache.commons.lang.math.Fraction", "reduce", ""}, {"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647/2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1 73/5"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("78/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "hashCode", ""}, {"org.apache.commons.lang.math.Fraction", "negate", ""}, {"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "reduce", ""}, {"org.apache.commons.lang.math.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}, {"org.apache.commons.lang.math.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.math.Fraction", "getNumerator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"2"}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"-19"}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:4>"}, {"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:7>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"1073741824", "1610612682"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073741824/1610612682", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"1073741824", "10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073741824/10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"536870912", "-2147483585"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-536870912/2147483585", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"536870912", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("536870912/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1", "-2147483643"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/2147483643", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"0", "-2147483643"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/2147483643", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"0", "-2147483592"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/2147483592", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "doubleValue", ""}, {"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<s:c>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}, {"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}, {"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"SIHL"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-3/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("3/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"0.5d"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"3"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("3/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"0", "2147483646", "2147483646"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483646/2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"0", "2147483647", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "negate", ""}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang.math.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:\">"}, false, 8, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "invert", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang.math.Fraction", "abs", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-2147483648"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-2.147483648E8"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1073741824/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1073741824", "-1073741814"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073741824/1073741814", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "-1073741814"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483636", "-1073741806"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483636/1073741806", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-1073741806"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483647/1073741806", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"1073741823", "-1073741806"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1073741823/1073741806", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"1073741823", "-536870866"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1073741823/536870866", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"1073741823", "536870866"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073741823/536870866", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<s:Bm>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<s:Bm>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2.14748364636E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483607/25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2.14748364638E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-81/50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}, {"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.math.Fraction", "doubleValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "doubleValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}, {"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:6>"}, {"org.apache.commons.lang.math.Fraction", "getDenominator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "longValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang.math.Fraction", "getNumerator", ""}, {"org.apache.commons.lang.math.Fraction", "negate", ""}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.lang.math.Fraction", "getNumerator", ""}, {"org.apache.commons.lang.math.Fraction", "negate", ""}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "reduce", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang.math.Fraction", "reduce", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.math.Fraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483647/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}, {"org.apache.commons.lang.math.Fraction", "invert", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<null>"}, {"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<null>"}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:6>"}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:6>"}, {"org.apache.commons.lang.math.Fraction", "invert", ""}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang.math.Fraction", "invert", ""}, {"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:4>"}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.lang.math.Fraction", "invert", ""}, {"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:4>"}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:4>"}, {"org.apache.commons.lang.math.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:4>"}, {"org.apache.commons.lang.math.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"1.0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"0.5"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"0.25"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-1", "10", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}, {"org.apache.commons.lang.math.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<s:Bm>"}, {"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:0>"}, {"org.apache.commons.lang.math.Fraction", "pow", "int", "-32"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "floatValue", ""}, {"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<s:Am>"}, {"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "pow", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"262143"}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:6>"}, {"org.apache.commons.lang.math.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"10", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("10/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"37", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("37/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483648/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "1073741823"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483648/1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483627", "1073741823"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483627/1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483632", "1073741770"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483632/1073741770", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483632", "1610612682"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483632/1610612682", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "1610612682"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483648/1610612682", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1073741824", "1610612682"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1073741824/1610612682", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "getNumerator", ""}, {"org.apache.commons.lang.math.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "pow", "int", "10"}, {"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:1>"}, false, 11, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"65382027393090"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}, {"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"I"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"11"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("11/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"111"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("111/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"111/ "}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"111. "}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("111/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-32", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-32/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "invert", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"0", "-2147483585"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"32", "-2147483585"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-32/2147483585", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"26", "-2147483585"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2/165191045", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-16", "-2147483594"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("8/1073741797", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "longValue", ""}, {"org.apache.commons.lang.math.Fraction", "intValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "floatValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "longValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<s:Bm>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2.14748364638E9"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-81/50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"0.0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-2.147483648E8"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1073741824/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"10.0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("10/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"20.096"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2512/125", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "hashCode", ""}, {"org.apache.commons.lang.math.Fraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "hashCode", ""}, {"org.apache.commons.lang.math.Fraction", "toString", ""}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"10", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("10/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"10", "-51"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-10/51", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "reduce", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 24, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 28, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:3>"}, {"org.apache.commons.lang.math.Fraction", "pow", "int", "1073741823"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}, {"org.apache.commons.lang.math.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toString", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toString", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}, {"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}, {"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"1", "0", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:3>"}, {"org.apache.commons.lang.math.Fraction", "getDenominator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "abs", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:6>"}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 6, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.math.Fraction", "getNumerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"-0.0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "invert", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:6>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang.math.Fraction", "getDenominator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"58"}, false, 5, new String[][]{{"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<null>"}, {"org.apache.commons.lang.math.Fraction", "pow", "int", "2147483616"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"-43253760"}, false, 5, new String[][]{{"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:5>"}, {"org.apache.commons.lang.math.Fraction", "pow", "int", "2147483630"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.lang.math.Fraction", "getDenominator", ""}, {"org.apache.commons.lang.math.Fraction", "abs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.lang.math.Fraction", "getDenominator", ""}, {"org.apache.commons.lang.math.Fraction", "abs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang.math.Fraction", "getDenominator", ""}, {"org.apache.commons.lang.math.Fraction", "abs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang.math.Fraction", "compareTo", "java.lang.Object", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "compareTo", "java.lang.Object", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 24, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang.math.Fraction", "getNumerator", ""}, {"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:0>"}, {"org.apache.commons.lang.math.Fraction", "getDenominator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:0>"}, false, 16, new String[][]{{"org.apache.commons.lang.math.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "invert", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang.math.Fraction", "invert", ""}, {"org.apache.commons.lang.math.Fraction", "getDenominator", ""}, {"org.apache.commons.lang.math.Fraction", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}, {"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:7>"}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.5f"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("3/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1/f"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"6.f"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("6/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "getDenominator", ""}, {"org.apache.commons.lang.math.Fraction", "toProperString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"10", "10"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("10/10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.math.Fraction", "longValue", ""}, {"org.apache.commons.lang.math.Fraction", "compareTo", "java.lang.Object", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:al>"}, false, 8, new String[][]{{"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<d:0.41>"}, {"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.lang.math.Fraction", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483603", "-2147483585"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483603/2147483585", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483603", "57"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483603/57", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483603", "32"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483603/32", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483603", "93"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483603/93", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483603", "46"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483603/46", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483603", "92"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483603/92", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"1073741801", "92"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073741801/92", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"1073741769", "92"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073741769/92", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 14, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "invert", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "intValue", ""}, {"org.apache.commons.lang.math.Fraction", "toString", ""}, {"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang.math.Fraction", "hashCode", ""}, {"org.apache.commons.lang.math.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"0", "64", "2147483603"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("64/2147483603", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<i:0>"}, {"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<i:0>"}, {"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"116", "1073741823", "29"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073745187/29", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"124", "1073741823", "29"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073745419/29", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"172", "1073741823", "29"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073746811/29", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-2147483647", "-32", "2147483610"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483645", "1073741823"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483645/1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"-2147483648"}, false, 10, new String[][]{{"org.apache.commons.lang.math.Fraction", "floatValue", ""}, {"org.apache.commons.lang.math.Fraction", "pow", "int", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"2147483647"}, false, 10, new String[][]{{"org.apache.commons.lang.math.Fraction", "floatValue", ""}, {"org.apache.commons.lang.math.Fraction", "negate", ""}, {"org.apache.commons.lang.math.Fraction", "pow", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "longValue", ""}, {"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"/1.5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("3/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"11.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("23/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang.math.Fraction", "longValue", ""}, {"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}, {"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang.math.Fraction", "invert", ""}, {"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"32", "32", "57"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1856/57", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "longValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "longValue", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang.math.Fraction", "invert", ""}, {"org.apache.commons.lang.math.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"40.00000000000001"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("40/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-2.147483648E8"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1073741824/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-2.147483648E7"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-536870912/25", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"1", "58", "58"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("116/58", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:5>"}, {"org.apache.commons.lang.math.Fraction", "invert", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
}
