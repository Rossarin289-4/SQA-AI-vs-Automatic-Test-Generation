package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"0", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "4503599627370497"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:7>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"0"}, false, 14, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "2305843009213693915"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "int", "-4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.ZeroException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "percentageValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "java.math.BigInteger", "-580964351930793989"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}, {"org.apache.commons.math.fraction.BigFraction", "abs", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:8>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "intValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "long", "4503599627370496"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{"int", "int"}, new String[]{"100", "0"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("-1.0000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getField", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}, {"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "long", "9218868437227405311"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "int", "-2"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "9007199254740990"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "long", "-2815106573665789272"}, {"org.apache.commons.math.fraction.BigFraction", "getNumerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "java.math.BigInteger", "1"}, {"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "9218868437227405313"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
  assertEquals("receiver state after the call", "9 / 10", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getField", ""}, {"org.apache.commons.math.fraction.BigFraction", "equals", "java.lang.Object", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "int", "-2147483648"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "long", "-1"}, {"org.apache.commons.math.fraction.BigFraction", "doubleValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "<null>"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "int", "2147483647"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "4503599627370493"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"32768"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:4>"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854808575", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "abs", ""}, {"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"-2.81510657366578944E17"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:4>"}, {"org.apache.commons.math.fraction.BigFraction", "longValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"2147483648"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483649", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"4.5035996273704968E16"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:5>"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "int", "48"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"4.5035996273704968E16"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:5>"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"4.5035996273704968E16"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsInt", ""}, {"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"-1.0737418235000001E8"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "hashCode", ""}, {"org.apache.commons.math.fraction.BigFraction", "pow", "double", "-5630213147331578515"}, {"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "0"}, {"org.apache.commons.math.fraction.BigFraction", "equals", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "0"}, {"org.apache.commons.math.fraction.BigFraction", "equals", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "0"}, {"org.apache.commons.math.fraction.BigFraction", "equals", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "4503599627370497"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "intValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "add", "long", "0"}, {"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "0", "100"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.223372036854776E20", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"4503599627370496"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4503599627370496", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"4503599627370496"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"4503599627370447"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("19342813113833856341901312", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"6755399441055695"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("29014219670750889739550720", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"6755399441055755"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("29014219670751147437588480", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"2251799813685247"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9671406556917029102682112", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"2251799813685194"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9671406556916801469415424", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"4503599627370388"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("19342813113833602938830848", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "divide", "long", "9007199254740990"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "divide", "long", "9007199254740990"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-4611686018427387909"}, false, 13, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "doubleValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-16909515400900422333 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-4611686018494496819"}, false, 13, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "doubleValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-50728546203439465009 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-2305843009247248392"}, false, 13, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "doubleValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2113689425143311026", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-1143914305368883204"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-3145764339764428811 / 3", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"0"}, false, 13, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-82"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "toString", ""}, {"org.apache.commons.math.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 82", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"82"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "toString", ""}, {"org.apache.commons.math.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 82", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"2147483599"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "toString", ""}, {"org.apache.commons.math.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 2147483599", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"18049582881566712"}, false, 9, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 2578511840223816", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-36134350135222190"}, false, 9, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-7 / 36134350135222190", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"int"}, new String[]{"99"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 99", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-4503599627370440"}, false, 15, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}, {"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "pow", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-4503599627370440"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}, {"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "pow", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 4503599627370440", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-1405140963688465"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "2305843009213693952"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "int", "-4"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4294967296 / 1405140963688465", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-2251799813685272"}, false, 15, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "4611686018427387830"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"100"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-9218868437227404801"}, false, 13, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "4611686018427387767"}, {"org.apache.commons.math.fraction.BigFraction", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-11 / 110626421246728857612", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"8796093022251"}, false, 13, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}, {"org.apache.commons.math.fraction.BigFraction", "add", "int", "2147483646"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("11 / 105553116267012", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-4503599627370440"}, false, 13, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}, {"org.apache.commons.math.fraction.BigFraction", "add", "int", "2147483646"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-11 / 54043195528445280", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-36134350135222190"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-36134350135222190"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-36134350135222190"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "double", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"16"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "double", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"38"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "double", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-38", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"19"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "double", "-9.2233720368547763E17"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-19", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"32787"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "double", "-9.2233720368547763E17"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-32787", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"101"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"202"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "java.math.BigInteger", "2147483648"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "java.math.BigInteger", "2147483648"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4 / 3", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.ZeroException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "long", "2147483647"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4 / 3", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "long", "2147483647"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "long", "2147483647"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "int", "101"}, {"org.apache.commons.math.fraction.BigFraction", "reduce", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.294967296E11", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.223372036854776E20", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.294967296E11", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "hashCode", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("91.66666666666667", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"-5630213147331578515"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:3>"}, {"org.apache.commons.math.fraction.BigFraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "pow", "double", "-2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "pow", "double", "-2.0"}, {"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"0.1"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "pow", "double", "37.0"}, {"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"5.0"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "pow", "double", "-37.0"}, {"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"-6.202"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:4>"}, {"org.apache.commons.math.fraction.BigFraction", "compareTo", "org.apache.commons.math.fraction.BigFraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.098004811945686", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"-0.4792000000000001"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:5>"}, {"org.apache.commons.math.fraction.BigFraction", "compareTo", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.147811687448948", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"-0.23960000000000006"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:5>"}, {"org.apache.commons.math.fraction.BigFraction", "compareTo", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0713597376460195", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"4503599627370496"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:5>"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "int", "48"}, {"org.apache.commons.math.fraction.BigFraction", "compareTo", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "abs", ""}, {"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "100"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-19807040628566084396238503936", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"2.1474836069999998E9"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "hashCode", ""}, {"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("255", String.valueOf(actual));
  assertEquals("receiver state after the call", "255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-7 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "4503599627370497"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-7 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "intValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "add", "long", "0"}, {"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "0", "100"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "intValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "add", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E11", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"2147516477"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147516477", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"4503599627370496"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4503599627370496", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumeratorAsInt", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int", "2147483646"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"-5630213147331578515"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "compareTo", "org.apache.commons.math.fraction.BigFraction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5630213147331578516", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"32"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "4503599627370497"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("295147905179352825824", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"16"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "100"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("147573952589676412912", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"9218868437227405313"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "9218868437227405313"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("85029053355366337244819911486935662591", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"9218868437260959721"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "9218868437227405313"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("85029053355675822033280327671112269847", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"9218868437260959721"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "9007199254740861"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("19797369222081224909634142208", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"4609434218630479860"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "9007199254740861"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9898684611040612453743329280", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"9218868437227405287"}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("33802517603167152719 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"4503599627370495"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"100"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 100", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-82"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "toString", ""}, {"org.apache.commons.math.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 82", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"99"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumerator", ""}, {"org.apache.commons.math.fraction.BigFraction", "pow", "double", "-5630213147331578515"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775906", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumerator", ""}, {"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "4503599627370495"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:6>"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumeratorAsInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "-9223372036854775808"}, {"org.apache.commons.math.fraction.BigFraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-2251799813685220"}, false, 13, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "4611686018427387767"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-11 / 27021597764222640", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"8796093022251"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "2305843009213693883"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775807 / 8796093022251", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"8796093022251"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}, {"org.apache.commons.math.fraction.BigFraction", "add", "int", "2147483646"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "2305843009213693883"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967296 / 8796093022251", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"9218868437227405312"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9218868437227405313", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"9218868437227405312"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9218868437227405313", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reciprocal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"4503599627370497"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4503599627370496", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "16"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-36134350135222190"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-36134350135222190"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-36134350135222190"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967295", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-36134350135222190"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"-4503599627370440"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4503599627370439", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 13, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-36134350135222190"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("7 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-36134350135222190"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-36134350135222190"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-36134350135222190"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5 / 3", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 8, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-36134350135222190"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "-9223372036854775808"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-72268700270444380"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-72268700268347228"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-72268700268347228"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("19 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "24"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-54254301758865244"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "96"}, {"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-54253752003051356"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"2147483646"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-5630213147331578515"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-5630213147331578515"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-5630213147331578515"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}, {"org.apache.commons.math.fraction.BigFraction", "percentageValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967295", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}, {"org.apache.commons.math.fraction.BigFraction", "percentageValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483649", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}, {"org.apache.commons.math.fraction.BigFraction", "percentageValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "percentageValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775806", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"long"}, new String[]{"4503599627370497"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 4503599627370497", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getField", ""}, {"org.apache.commons.math.fraction.BigFraction", "percentageValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "negate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"24"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-25", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getField", ""}, {"org.apache.commons.math.fraction.BigFraction", "percentageValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("31 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"10", "1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "-4", "101"}, {"org.apache.commons.math.fraction.BigFraction", "getNumerator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"long"}, new String[]{"4503599627370496"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "2147483647"}, {"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5 / 27021597764222976", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"100"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483748", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reciprocal", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"101", "10"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("101 / 10", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"long"}, new String[]{"-5630213147331578516"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 5630213147331578516", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{"int", "int"}, new String[]{"-4", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "abs", ""}, {"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "percentageValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "java.math.BigInteger", "-580964351930793989"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:13>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "percentageValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "java.math.BigInteger", "-580964351930793989"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("11 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("36893488147419103231 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("11 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "9218868437227405313"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "-9218868437227405333"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "-9218868437227405333"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "-4609434218613702666"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "-4609434218613702666"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "-4609434218613702666"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reciprocal", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "reduce", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.ZeroException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "4503599627370494"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "4503599627370494"}, {"org.apache.commons.math.fraction.BigFraction", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("83.33333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "4503599627370494"}, {"org.apache.commons.math.fraction.BigFraction", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("700.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "-1", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"-5630213147331578516"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"-5630213147331578516"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"-9223372036854775808"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.294967296E11", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E11", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("75.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("83.33333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("91.66666666666667", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
}
