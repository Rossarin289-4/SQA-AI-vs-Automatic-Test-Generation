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
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "doubleValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "pow", "long", "9223372036854775807"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "99"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"9"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "-45"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", "int", "1"}, {"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:2>"}, {"org.apache.commons.math3.fraction.BigFraction", "add", "java.math.BigInteger", "-144115183780888558"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{"int", "int"}, new String[]{"-536870912", "45"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:8>"}, {"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}, {"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "198"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "212"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "long", "-2147483649"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 31, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "212"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "long", "-4294967298"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "2147483646"}, {"org.apache.commons.math3.fraction.BigFraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "reciprocal", ""}, {"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"-268435456"}, false, 10, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-268435456", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "-538968064"}, {"org.apache.commons.math3.fraction.BigFraction", "getDenominator", ""}, {"org.apache.commons.math3.fraction.BigFraction", "compareTo", "org.apache.commons.math3.fraction.BigFraction", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23311", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"1073741824"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getDenominator", ""}, {"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.BigFraction", "subtract", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{"int", "int"}, new String[]{"-45", "1"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "int", "-2147483647"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0E+45", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"2303591209400008686"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "int", "0"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "java.math.BigInteger", "<null>"}, {"org.apache.commons.math3.fraction.BigFraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2303591209400008686", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"int"}, new String[]{"-106"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsLong", ""}, {"org.apache.commons.math3.fraction.BigFraction", "getNumerator", ""}, {"org.apache.commons.math3.fraction.BigFraction", "divide", "org.apache.commons.math3.fraction.BigFraction", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 106", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"long"}, new String[]{"-5558155553293650498"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:7>"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<null>"}, {"org.apache.commons.math3.fraction.BigFraction", "pow", "java.math.BigInteger", "-18446744073709551616"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 5558155553293650498", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-9007199237963774"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "0"}, {"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9007199237963773", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"987"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-11833 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "intValue", new String[]{}, new String[]{}, false, 24, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<s:b>"}, {"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147460410", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsInt", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "org.apache.commons.math3.fraction.BigFraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:13>"}, {"org.apache.commons.math3.fraction.Fraction", "abs", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"1.29"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "compareTo", "org.apache.commons.math3.fraction.BigFraction", "<sample:8>"}, {"org.apache.commons.math3.fraction.BigFraction", "intValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-41095345521827531"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "long", "-9007199254740989"}, {"org.apache.commons.math3.fraction.BigFraction", "negate", ""}, {"org.apache.commons.math3.fraction.BigFraction", "equals", "java.lang.Object", "<s:Ufy>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 41095345521827531", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"-1073610810"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "org.apache.commons.math3.fraction.BigFraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "-1073741823"}, {"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1073610811", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<i:-28>"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:13>"}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483645 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483646"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "floatValue", ""}}, 1), new String[][]{{"getZero", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"4535124824762089447"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<null>"}, {"org.apache.commons.math3.fraction.BigFraction", "divide", "java.math.BigInteger", "<null>"}, {"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967296 / 4535124824762089447", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"10"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 10", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 5", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"0"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"29"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 29", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"14"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 14", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-45"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 45", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-45"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 45", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 13, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "doubleValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "doubleValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<null>"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "doubleValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "doubleValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "long", "2147483666"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 18, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "java.math.BigInteger", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("255.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "java.math.BigInteger", "17179869185"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1000.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 9", String.valueOf(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("12 / 11", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "divide", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 255", String.valueOf(actual));
  assertEquals("receiver state after the call", "255", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-2815106573665789221"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2815106573665789221", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-2815106573665756453"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2815106573665756453", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"-45"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "reciprocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("45", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"-45"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.BigFraction", "reciprocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("45", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.BigFraction", "reciprocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "int", "2147483647"}, {"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.BigFraction", "reciprocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumerator", ""}, {"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.BigFraction", "reciprocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"1024"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumerator", ""}, {"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.BigFraction", "reciprocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1024", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"976"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumerator", ""}, {"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.BigFraction", "reciprocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-976", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "-7972084953564236434"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"-1.3611294E37"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"9"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "-45"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-9"}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "45"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-9"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "45"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5159780352 / 2357947691", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-18"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "45"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("26623333280885243904 / 5559917313492231481", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-36"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "45"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("708801874985091845381344307009569161216 / 30912680532870672635673352936887453361", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"36"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("30912680532870672635673352936887453361 / 708801874985091845381344307009569161216", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-25"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("953962166440690129601298432 / 108347059433883722041830251", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-24"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("79496847203390844133441536 / 9849732675807611094711841", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("11 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 12, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 8, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"2"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"2147483619"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "45"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483619", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "45"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"1073741823"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "45"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"1073741823"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "45"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "2147483646"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1073741823", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"1073741868"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "45"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "2147483646"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1073741868", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 10", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.294967296E11", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.223372036854776E20", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.BigFraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.223372036854776E20", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.BigFraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E11", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.BigFraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("75.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.BigFraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-45"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("83.33333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "hashCode", ""}, {"org.apache.commons.math3.fraction.BigFraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("83.33333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "hashCode", ""}, {"org.apache.commons.math3.fraction.BigFraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("700.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.294967296E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9166666666666666", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "double", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9166666666666666", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "double", "-9223372036854775808"}, {"org.apache.commons.math3.fraction.BigFraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "long", "2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "java.math.BigInteger", "17179869185"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1000.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1000", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"-5630213147331578514"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"-7972084953564236434"}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"-7972084953564236434"}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", ""}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "99"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", ""}, {"org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}, {"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "101"}, {"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"2147484671"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "101"}, {"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147484671", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"8589934588"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-8589934588", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"4294967294"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4294967294", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-281470681743362"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("281470681743362", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-576742222985166850"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("576742222985166850", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-5630213147331578515"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5630213147331578515", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-2815106573665789257"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2815106573665789257", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"-45"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("45", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"4503599627370495"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4503599627370496", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-5630213147331578516"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5630213147331578515", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-2214592511"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2214592510", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-2214592483"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2214592482", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"2214592483"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2214592484", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "-7972084953564236434"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "-7972084953564236434"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418235E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.9166666666666666", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"3.4028235E38"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "99"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "99"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "99"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "48"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "9", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-45"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "-45"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 8646571782111912545778731933398401290572561123964873100919110415201442199081630905460299414033862907884186728801874779333714232929055814751617696931703961541850335575384515669995055925486890998949...#424#-1570466311", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:4>"}, {"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:2>"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:8>"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:8>"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("11 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}, {"org.apache.commons.math3.fraction.Fraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-11 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "compareTo", "org.apache.commons.math3.fraction.BigFraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "compareTo", "org.apache.commons.math3.fraction.BigFraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "compareTo", "org.apache.commons.math3.fraction.BigFraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "compareTo", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-10", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"5"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"2"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"6"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-6", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"48"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-48", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"2147483642"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483642", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"127"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "-1"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-127", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-1073741868"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "45"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "2147483647"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1073741868", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "45"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "2147483647"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-1073741824"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "int", "45"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "2147483647"}, {"org.apache.commons.math3.fraction.Fraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1073741824", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<i:-1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}, {"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<i:-1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"4503599627370497"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4503599627370496", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"7881299347898370"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("7881299347898369", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"3940649673949185"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("3940649673949184", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "java.math.BigInteger", "9007199254740990"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "pow", "java.math.BigInteger", "9007199254740990"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"2147483647"}, false, 8, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "pow", "java.math.BigInteger", "9007199254741045"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-2147483647"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "pow", "java.math.BigInteger", "9007199254741045"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ZeroException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"-72057591890444289"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "9218868437227405311"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"-72057591890444289"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "9218868437227405311"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ZeroException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"-72057591890444255"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "9218886029413449725"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"-72057591890444198"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "9218886029413449725"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"-72057591890476966"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "9218886029413449725"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ZeroException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"-72057594037960614"}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "9218886029413449666"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "0"}, {"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "0"}, {"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "0"}, {"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "100"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "100"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("11", String.valueOf(actual));
  assertEquals("receiver state after the call", "11 / 12", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "100"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "200"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", "int", "1"}, {"org.apache.commons.math3.fraction.BigFraction", "reduce", ""}, {"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", "int", "1"}, {"org.apache.commons.math3.fraction.BigFraction", "reduce", ""}, {"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", "int", "1"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "9"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "9"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "9"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "9"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "7", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "9"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"99"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"128"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"100"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("99", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"-100"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-101", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"-100"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-101", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"200"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("199", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"178"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("177", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"2147483646"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483645", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"2147483646"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372034707292159", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumerator", ""}, {"org.apache.commons.math3.fraction.BigFraction", "pow", "java.math.BigInteger", "100"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
}
