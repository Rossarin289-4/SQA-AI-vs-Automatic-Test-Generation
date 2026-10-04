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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-1073741824", "-2147483647", "2147483647"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1073741820", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"NaN"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-2147483648", "-2147483648", "-30"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1073741778", "-7"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073741778/7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "pow", "int", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"0.0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.lang.math.Fraction", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1073741770", "-7"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073741770/7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-1.073741824E9"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1073741824/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-805306322", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}, {"org.apache.commons.lang.math.Fraction", "toProperString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-536870856", "2147483647", "2147483647"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "hashCode", ""}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "pow", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"536870856", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-67108857/268435456", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"1073741770", "0", "2147483646"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.12345778"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("91/81", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"-2 "}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:18>"}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:14>"}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:16>"}, false, 1, new String[][]{{"org.apache.commons.lang.math.Fraction", "floatValue", ""}, {"org.apache.commons.lang.math.Fraction", "toProperString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1/4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483647", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483647/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "longValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "floatValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483646"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:7>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.lang.math.Fraction", "invert", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:1>"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:3>"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.math.Fraction", "getNumerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.math.Fraction", "compareTo", "java.lang.Object", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-14"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483647/14", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.lang.math.Fraction", "doubleValue", ""}, {"org.apache.commons.lang.math.Fraction", "intValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "invert", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}, {"org.apache.commons.lang.math.Fraction", "invert", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-1.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"8388613", "-43"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-8388613/43", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "longValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.math.Fraction", "compareTo", "java.lang.Object", "<i:-129>"}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "doubleValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "abs", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1", "0"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "invert", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"-2147483556"}, false, 2, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-402653161", "-805306322"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("402653161/805306322", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1073741823", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "invert", ""}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.lang.math.Fraction", "longValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:3>"}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "pow", "int", "-1"}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "floatValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "invert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "compareTo", "java.lang.Object", "<b:false>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "invert", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"-536870890"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.lang.math.Fraction", "floatValue", ""}, {"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"-2147483136"}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "getNumerator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"30"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:7>"}, {"org.apache.commons.lang.math.Fraction", "compareTo", "java.lang.Object", "<d:2.54>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "getDenominator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"0", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "intValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-0.1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "reduce", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:10>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483648/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:10>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "compareTo", "java.lang.Object", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<s:ab>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.lang.math.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"E"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:10>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getDenominator", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:4>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1", "0"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toProperString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "reduce", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:7>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23273", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "negate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "doubleValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "longValue", new String[]{}, new String[]{}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<s:bm>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.lang.math.Fraction", "getNumerator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ClassCastException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "invert", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1073741770", "10"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1073741770/10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.lang.math.Fraction", "reduce", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-536870910", "12"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-536870910/12", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1", "-1073741778"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1073741778", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-7", "-30"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("7/30", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"1073741778", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1073741778/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1073741522", "-2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073741522/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "-30"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-46", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-46/2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147352576", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147352576/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"a b"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1073610731", "1073741823"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1073610731/1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2.147483607E9"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483607/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1073741824", "-536870889"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073741824/536870889", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-8388622", "1073741823"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-762602/97612893", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"0", "-805306310"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-1.0000000000000002"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-7", "-1073741824"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("7/1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:3>"}, {"org.apache.commons.lang.math.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"i0x1F"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "invert", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}, {"org.apache.commons.lang.math.Fraction", "floatValue", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"46", "-1073741770"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-23/536870885", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"1.19"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("119/100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"1073745874", "-1071644618"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-536872937/535822309", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "50"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/50", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-14", "2147483646"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/153391689", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "0"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-805306310", "3"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-805306310/3", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-6.2"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-31/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, true, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperNumerator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-805306368", "2147483646"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-805306368/2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "1073741820"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/1073741820", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "37"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483648/37", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "134217791"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483648/134217791", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "longValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "805306382"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/805306382", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"a a"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1879048192", "1073741820"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-469762048/268435455", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"16777226", "-1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-16777226/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"-1.5 "}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-3/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "abs", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"..5"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "toString", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "multiplyBy", "org.apache.commons.lang.math.Fraction", "<sample:0>"}, {"org.apache.commons.lang.math.Fraction", "pow", "int", "1073741770"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-0.05"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "invert", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getNumerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1073741712", "-2147483648"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("67108857/134217728", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.apache.commons.lang.math.Fraction", "divideBy", "org.apache.commons.lang.math.Fraction", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"2.147483647E9"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483135"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "1074790346"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483648/1074790346", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"  -1.5"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-3/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{".5"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-0.25"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.79"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("179/100", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"4.4942328371557893E307"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:14>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getProperWhole", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<sample:16>"}, {"org.apache.commons.lang.math.Fraction", "reduce", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:14>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-1", "-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "2147483646"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"1073741823", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073741823/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.lang.math.Fraction", "getDenominator", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"2147483647", "-1073709092", "2147483647"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"55", "-536870856"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-55/536870856", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:18>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.5e300"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2.147483647E9"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-2.147483644E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483644/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"0", "2147483647", "1073741823"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-1610612732"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483647/1610612732", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-131071", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-131071/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:16>"}, false, 2, new String[][]{{"org.apache.commons.lang.math.Fraction", "pow", "int", "29"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483648/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.lang.math.Fraction", "invert", ""}, {"org.apache.commons.lang.math.Fraction", "compareTo", "java.lang.Object", "<i:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"33.0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("33/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "add", "org.apache.commons.lang.math.Fraction", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:18>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "pow", "int", "-805306383"}, {"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1073741862", "-536870856"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073741862/536870856", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-2.147483647E9"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483647/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"0", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-805306322", "-1073741820"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("9364027/12485370", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1073741821", "-1073741823"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073741821/1073741823", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "multiplyBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.1234567890123456"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("91/81", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-26", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-26/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"24", "16385"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("24/16385", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.lang.math.Fraction", "floatValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:16>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:5>"}, {"org.apache.commons.lang.math.Fraction", "getNumerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"10", "-1074790346"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-5/537395173", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.234567"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("100/81", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "subtract", "org.apache.commons.lang.math.Fraction", "<sample:10>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"5", "1073741828"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("5/1073741828", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"2147483613", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483613/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-53.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-53/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"1", "2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "add", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:16>"}, false, 3, new String[][]{{"org.apache.commons.lang.math.Fraction", "doubleValue", ""}, {"org.apache.commons.lang.math.Fraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483616", "-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483616/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"2.7976931348623157E308"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-805306322", "7", "1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-805306329/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:14>"}, false, 4, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperWhole", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"-214748"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-214748/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "compareTo", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "toProperString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "divideBy", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.lang.math.Fraction", "getProperNumerator", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.lang.math.Fraction", "intValue", ""}, {"org.apache.commons.lang.math.Fraction", "toProperString", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"4.9E-324"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-55", "402653161", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-402653216/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "pow", new String[]{"int"}, new String[]{"0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-14", "-2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("14/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"1", "-805306322"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/805306322", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-0.9999999999999999"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"2147483647"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"-214748364"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-214748364/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("3/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-1073676242", "-2147483634"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1073676242/2147483634", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"2147483647", "63"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/63", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<sample:14>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0/0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-7", "-1073741770"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("7/1073741770", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"2.5"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("5/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"0.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483589", "2147483647"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-2147483589/2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-1.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"+1"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{".5"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"-1.5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-3/2", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.55d"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("31/20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.7976931348623156E308"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-1.073741824E9"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1073741824/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "-48"}, true, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"\n\n1.25"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("5/4", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"4.294967294E8"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"1.0000000000000002"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"1", "26", "17"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("43/17", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"-1"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"6."}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("6/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"01/"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NumberFormatException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"0.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"1.0"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"java.lang.String"}, new String[]{"1.12345678"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("91/81", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"2147483647"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("2147483647/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "subtract", new String[]{"org.apache.commons.lang.math.Fraction"}, new String[]{"<null>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-268435455", "1", "7"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1879048186/7", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-7", "1", "5"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-36/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"0", "10", "2147483646"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("10/2147483646", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"7", "1", "20"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("141/20", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"double"}, new String[]{"-1.073741824E9"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1073741824/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-536870795", "1073741770", "1"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1610612565/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-1073741824", "536870885", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1610612709/1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"-14", "1073741823", "1048577"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("-1088421901/1048577", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"0", "0", "5"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("0/5", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.lang.math.Fraction", "org.apache.commons.lang.math.Fraction", "getFraction", new String[]{"int", "int", "int"}, new String[]{"2097152", "1073741823", "7"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.lang.math.Fraction", actual.getClass().getName());
  assertEquals("1088421887/7", String.valueOf(actual));
 }
}
