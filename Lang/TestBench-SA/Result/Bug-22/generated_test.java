package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483648/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483648"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "pow", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.lang3.math.Fraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"2147483647", "-2147483648", "-10"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"2147483647", "-2147483648", "2147483647"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "abs", new String[]{}, new String[]{}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-32819", "32794", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "multiplyBy", "org.apache.commons.lang3.math.Fraction", "<sample:6>"}, {"org.apache.commons.lang3.math.Fraction", "negate", ""}, {"org.apache.commons.lang3.math.Fraction", "invert", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("91/81", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483630", "-2097201"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2147483630/2097201", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}, {"org.apache.commons.lang3.math.Fraction", "invert", ""}, {"org.apache.commons.lang3.math.Fraction", "getDenominator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"NaN"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-32819", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "floatValue", ""}, {"org.apache.commons.lang3.math.Fraction", "pow", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "pow", new String[]{"int"}, new String[]{"-32758"}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:20>"}, {"org.apache.commons.lang3.math.Fraction", "invert", ""}, {"org.apache.commons.lang3.math.Fraction", "pow", "int", "32764"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang3.math.Fraction", "reduce", ""}, {"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23274", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "subtract", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false, 8, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:14>"}, false, 6, new String[][]{{"org.apache.commons.lang3.math.Fraction", "floatValue", ""}, {"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:5>"}, {"org.apache.commons.lang3.math.Fraction", "reduce", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang3.math.Fraction", "pow", "int", "2147483647"}, {"org.apache.commons.lang3.math.Fraction", "getProperWhole", ""}, {"org.apache.commons.lang3.math.Fraction", "pow", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1 L"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 48, new String[][]{{"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:14>"}, {"org.apache.commons.lang3.math.Fraction", "toProperString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647/2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:4>"}, {"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:14>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang3.math.Fraction", "add", "org.apache.commons.lang3.math.Fraction", "<sample:2>"}, {"org.apache.commons.lang3.math.Fraction", "floatValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1/124567"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/124567", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}, {"org.apache.commons.lang3.math.Fraction", "toProperString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 54, new String[][]{{"org.apache.commons.lang3.math.Fraction", "abs", ""}, {"org.apache.commons.lang3.math.Fraction", "add", "org.apache.commons.lang3.math.Fraction", "<sample:2>"}, {"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2/3", String.valueOf(actual));
  assertEquals("receiver state after the call", "2/3", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147460339", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "add", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:14>"}, false, 16, new String[][]{{"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.lang3.math.Fraction", "longValue", ""}, {"org.apache.commons.lang3.math.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-2/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-31", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-31/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483637", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483637/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483597", "-1073741824"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2147483597/1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483597", "-1006616576"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("306783371/143802368", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1073741798", "-1006616576"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("536870899/503308288", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1073741798", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1073741798/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1073741798", "-10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("536870899/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1073741816", "-10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("536870908/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1073741816", "10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-536870908/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getProperWhole", ""}, {"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:1>"}, {"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:3>"}, {"org.apache.commons.lang3.math.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "add", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "add", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "intValue", ""}, {"org.apache.commons.lang3.math.Fraction", "abs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "add", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false, 10, new String[][]{{"org.apache.commons.lang3.math.Fraction", "abs", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "subtract", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:4>"}, false, 15, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "subtract", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:4>"}, false, 16, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toString", ""}, {"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:14>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.math.Fraction", "intValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:8>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "pow", new String[]{"int"}, new String[]{"-31"}, false, 8, new String[][]{{"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<s:kex>"}, {"org.apache.commons.lang3.math.Fraction", "longValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "pow", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<s:kex>"}, {"org.apache.commons.lang3.math.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"1073741793", "-2147483648", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"2147483586", "1", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "negate", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}, {"org.apache.commons.lang3.math.Fraction", "add", "org.apache.commons.lang3.math.Fraction", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:14>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-32819", "-32819", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"10", "-2147483648", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"Infinity"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"40.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("40/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2.147483647E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2.1474836418E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2147483617/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2.14748364222E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-289/50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2.14748364022E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-389/50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"1.07374182011E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-389/100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"1.07374182022E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2147483459/50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.math.Fraction", "negate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.lang3.math.Fraction", "hashCode", ""}, {"org.apache.commons.lang3.math.Fraction", "longValue", ""}, {"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:18>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getDenominator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getDenominator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "longValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "floatValue", ""}, {"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"2147483647", "10"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "-2097142"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "multiplyBy", "org.apache.commons.lang3.math.Fraction", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang3.math.Fraction", "multiplyBy", "org.apache.commons.lang3.math.Fraction", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "add", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "add", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false, 12, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "abs", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "floatValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toString", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang3.math.Fraction", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}, {"org.apache.commons.lang3.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang3.math.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.lang3.math.Fraction", "longValue", ""}, {"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.math.Fraction", "intValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "compareTo", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "longValue", ""}, {"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "doubleValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "invert", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getNumerator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "invert", new String[]{}, new String[]{}, false, 13, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "invert", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getProperNumerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 21, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getDenominator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getProperWhole", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getProperWhole", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getProperWhole", ""}, {"org.apache.commons.lang3.math.Fraction", "reduce", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "add", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "floatValue", ""}, {"org.apache.commons.lang3.math.Fraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}, {"org.apache.commons.lang3.math.Fraction", "getProperWhole", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}, {"org.apache.commons.lang3.math.Fraction", "getProperWhole", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}, {"org.apache.commons.lang3.math.Fraction", "getProperWhole", ""}, {"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}, {"org.apache.commons.lang3.math.Fraction", "getProperWhole", ""}, {"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}, {"org.apache.commons.lang3.math.Fraction", "getProperWhole", ""}, {"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "add", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "add", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<i:-4194304>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"1", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-10", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-10/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-31", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-31/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483637", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483637/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "compareTo", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "add", "org.apache.commons.lang3.math.Fraction", "<sample:7>"}, {"org.apache.commons.lang3.math.Fraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "floatValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "pow", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.lang3.math.Fraction", "floatValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "pow", new String[]{"int"}, new String[]{"10"}, false, 2, new String[][]{{"org.apache.commons.lang3.math.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "pow", new String[]{"int"}, new String[]{"-32819"}, false, 2, new String[][]{{"org.apache.commons.lang3.math.Fraction", "floatValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "subtract", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}, {"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "longValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:1>"}, {"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:3>"}, {"org.apache.commons.lang3.math.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "subtract", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "subtract", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang3.math.Fraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "subtract", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:14>"}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang3.math.Fraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "subtract", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang3.math.Fraction", "doubleValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "intValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:7>"}, {"org.apache.commons.lang3.math.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:4>"}, {"org.apache.commons.lang3.math.Fraction", "getNumerator", ""}, {"org.apache.commons.lang3.math.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "negate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "negate", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "floatValue", ""}, {"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "negate", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.lang3.math.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-10"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483647/10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "negate", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}, {"org.apache.commons.lang3.math.Fraction", "add", "org.apache.commons.lang3.math.Fraction", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "abs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"I"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-32819"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483647/32819", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getDenominator", ""}, {"org.apache.commons.lang3.math.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"Infinity"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"1.07374182022E9"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2147483459/50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "invert", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "pow", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "add", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:14>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.5d"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("3/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.25"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("5/4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.math.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483647/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"1", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483647", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:2>"}, {"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "abs", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.math.Fraction", "doubleValue", ""}, {"org.apache.commons.lang3.math.Fraction", "getProperNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toString", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.lang3.math.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toString", new String[]{}, new String[]{}, false, 28, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toString", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang3.math.Fraction", "invert", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "longValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "longValue", new String[]{}, new String[]{}, false, 24, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "invert", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getProperNumerator", ""}, {"org.apache.commons.lang3.math.Fraction", "multiplyBy", "org.apache.commons.lang3.math.Fraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-1.0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-0.49999999999999994"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-0.049999999999999996"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-0.09999999999999999"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}, {"org.apache.commons.lang3.math.Fraction", "invert", ""}, {"org.apache.commons.lang3.math.Fraction", "getDenominator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "negate", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"0.0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "compareTo", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getProperWhole", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "subtract", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "longValue", ""}, {"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:2>"}, {"org.apache.commons.lang3.math.Fraction", "doubleValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "subtract", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:2>"}, {"org.apache.commons.lang3.math.Fraction", "doubleValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "subtract", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:14>"}, false, 11, new String[][]{{"org.apache.commons.lang3.math.Fraction", "intValue", ""}, {"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:2>"}, {"org.apache.commons.lang3.math.Fraction", "doubleValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "invert", new String[]{}, new String[]{}, false, 28, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "invert", new String[]{}, new String[]{}, false, 34, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "subtract", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:14>"}, false, 3, new String[][]{{"org.apache.commons.lang3.math.Fraction", "pow", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"overflow: gcd is ^31"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{".--"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("91/81", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"2020-02-30T25;6\u00e91:61"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-0.1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"0.1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-0.2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-45.2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-226/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"45.2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("226/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"53.2"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("266/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"65382027393090"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"106.4"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("532/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:14>"}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang3.math.Fraction", "invert", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "compareTo", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.lang3.math.Fraction", "intValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "compareTo", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "abs", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:4>"}, {"org.apache.commons.lang3.math.Fraction", "doubleValue", ""}, {"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<s:La>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "pow", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "pow", new String[]{"int"}, new String[]{"-1073741823"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "pow", new String[]{"int"}, new String[]{"1"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "pow", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toString", ""}, {"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getDenominator", ""}, {"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"0", "32794"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/32794", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"0", "16397"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/16397", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"0", "16359"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/16359", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"65555", "16359"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("65555/16359", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"65555", "65436"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("65555/65436", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:8>"}, {"org.apache.commons.lang3.math.Fraction", "longValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.lang3.math.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.lang3.math.Fraction", "longValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "invert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:5>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "reduce", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "longValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"32798", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("32798/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"32806", "2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("32806/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"32806", "1073741823"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("32806/1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "negate", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "add", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:14>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "invert", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.lang3.math.Fraction", "pow", "int", "-1"}, {"org.apache.commons.lang3.math.Fraction", "intValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "invert", new String[]{}, new String[]{}, false, 28, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang3.math.Fraction", "intValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "invert", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang3.math.Fraction", "intValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 14, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "pow", new String[]{"int"}, new String[]{"-2147483647"}, false, 1, new String[][]{{"org.apache.commons.lang3.math.Fraction", "pow", "int", "-44"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.lang3.math.Fraction", "compareTo", "org.apache.commons.lang3.math.Fraction", "<sample:14>"}, {"org.apache.commons.lang3.math.Fraction", "invert", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "longValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.1234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("91/81", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.123567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("11075/9857", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 2, new String[][]{{"org.apache.commons.lang3.math.Fraction", "hashCode", ""}, {"org.apache.commons.lang3.math.Fraction", "getProperWhole", ""}, {"org.apache.commons.lang3.math.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 24, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 28, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1/2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"0.12345678"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("10/81", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"0.123445678"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("685/5549", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "compareTo", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.apache.commons.lang3.math.Fraction", "pow", "int", "-2147483569"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:14>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:15>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "subtract", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "getProperWhole", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "pow", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.lang3.math.Fraction", "hashCode", ""}, {"org.apache.commons.lang3.math.Fraction", "multiplyBy", "org.apache.commons.lang3.math.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:8>"}, false, 1, new String[][]{{"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:1>"}, {"org.apache.commons.lang3.math.Fraction", "getNumerator", ""}, {"org.apache.commons.lang3.math.Fraction", "abs", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:1>"}, {"org.apache.commons.lang3.math.Fraction", "abs", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"6.538202739308968E13"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"1.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-1.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"0.0"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2.1474836418E9"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("2147483617/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.math.Fraction", "negate", ""}, {"org.apache.commons.lang3.math.Fraction", "toProperString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toProperString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.lang3.math.Fraction", "longValue", ""}, {"org.apache.commons.lang3.math.Fraction", "doubleValue", ""}, {"org.apache.commons.lang3.math.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang3.math.Fraction"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toString", ""}, {"org.apache.commons.lang3.math.Fraction", "subtract", "org.apache.commons.lang3.math.Fraction", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "abs", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.lang3.math.Fraction", "longValue", ""}, {"org.apache.commons.lang3.math.Fraction", "equals", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.lang3.math.Fraction", "getNumerator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "longValue", new String[]{}, new String[]{}, false, 18, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "longValue", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.math.Fraction", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 24, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 28, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/2147483647", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 34, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toString", ""}, {"org.apache.commons.lang3.math.Fraction", "toString", ""}, {"org.apache.commons.lang3.math.Fraction", "getDenominator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toString", ""}, {"org.apache.commons.lang3.math.Fraction", "toString", ""}, {"org.apache.commons.lang3.math.Fraction", "getDenominator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.lang3.math.Fraction", "toString", ""}, {"org.apache.commons.lang3.math.Fraction", "toString", ""}, {"org.apache.commons.lang3.math.Fraction", "getDenominator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.math.Fraction", "divideBy", "org.apache.commons.lang3.math.Fraction", "<sample:3>"}, {"org.apache.commons.lang3.math.Fraction", "add", "org.apache.commons.lang3.math.Fraction", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "abs", new String[]{}, new String[]{}, false, 19, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "abs", new String[]{}, new String[]{}, false, 20, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "abs", new String[]{}, new String[]{}, false, 24, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang3.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.lang3.math.Fraction", "floatValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1/1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang3.math.Fraction", "org.apache.commons.lang3.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.lang3.math.Fraction", "floatValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
}
