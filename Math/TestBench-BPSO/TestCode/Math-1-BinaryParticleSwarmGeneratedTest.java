package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"4503599627370528"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4503603922337824", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"4503616807239679"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4503616807239678", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"-3698073679419167739"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "java.math.BigInteger", "9007199254740990"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "long", "3698073679419233332"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.ZeroException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"0", "10"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getDenominator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "long", "-5630213147331578516"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", "int,int", "-53", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-2147483648"}, {"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-2147483646"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"<null>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"int"}, new String[]{"-1073741821"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "double", "-5630213147331578515"}, {"org.apache.commons.math3.fraction.BigFraction", "intValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1073741820", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "intValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "long", "2147221504"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"11258999068426239"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "equals", "java.lang.Object", "<sample:3>"}, {"org.apache.commons.math3.fraction.BigFraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "int", "104"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-99"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:14>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}, {"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}, {"org.apache.commons.math3.fraction.Fraction", "intValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-17", "-2147483648"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "hashCode", ""}, {"org.apache.commons.math3.fraction.BigFraction", "divide", "org.apache.commons.math3.fraction.BigFraction", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"101"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "divide", "org.apache.commons.math3.fraction.BigFraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "floatValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("83.33333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"0", "-1"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"8388682", "-2147483648"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-4194341 / 1073741824", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}, {"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"-1073741824"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<sample:13>"}, {"org.apache.commons.math3.fraction.Fraction", "add", "org.apache.commons.math3.fraction.Fraction", "<sample:16>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "org.apache.commons.math3.fraction.BigFraction", "<sample:13>"}, {"org.apache.commons.math3.fraction.BigFraction", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"long"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "double", "4.5035996273704945E15"}, {"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:16>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsInt", ""}, {"org.apache.commons.math3.fraction.BigFraction", "pow", "double", "200.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:13>"}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "java.math.BigInteger", "-9223372036854775808"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("23 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:5>"}, {"org.apache.commons.math3.fraction.BigFraction", "getField", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:10>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:17>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "org.apache.commons.math3.fraction.Fraction", "<null>"}, {"org.apache.commons.math3.fraction.Fraction", "getNumerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.07374182E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}, {"org.apache.commons.math3.fraction.Fraction", "add", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"-5630213146794707603"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5630213146794707603", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"-2147483647"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "toString", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "floatValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"9007199254740997"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"-9223372036854775808"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"2147491839"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4611703608465948672", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "1073741832"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483649", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"4503599625273343"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9227875636480049150", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsInt", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "percentageValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"2147483646"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsLong", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"3698073679419233232"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("12921445716274009039", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-6 / 5", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "8388628"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("19 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "org.apache.commons.math3.fraction.BigFraction", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "longValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "java.math.BigInteger", "9223372036854775866"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}, {"org.apache.commons.math3.fraction.BigFraction", "add", "java.math.BigInteger", "4503599625273343"}}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getRuntimeClass", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.apache.commons.math3.fraction.Fraction {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.apache.commons.math3.fraction.Fraction, getClasses=[], getConstructors=[public org.a...#843#-1822449922", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getDenominator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-7 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "long", "3734102476438197243"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"-475"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "long", "-5630213181691316884"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-475", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsInt", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "long", "-5630213147339967122"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "percentageValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"2147483646"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"2251799813685247"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "long", "-27021597764222978"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", "int,int", "-2147483646", "8388670"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"49", "1073741925"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("49 / 1073741925", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "divide", "int", "-1073741836"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"long"}, new String[]{"-1125899906842593"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 1125899906842593", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372041149743103", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"9007199258935294"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "int", "126"}, {"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9232379236113711101", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"40"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"18446744073709551616"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("27670116110564327423", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:<>"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "negate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<s:keay>"}}, 1), new String[][]{{"getRuntimeClass", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.apache.commons.math3.fraction.Fraction {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.apache.commons.math3.fraction.Fraction, getClasses=[], getConstructors=[public org.a...#843#-1822449922", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483633 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"2147483647"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"-5630213147331578515"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "reciprocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("3593158889523197292", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"62"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483648 / 31", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"1073741895"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "9223372036854775807"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "16777256"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"-2147483603"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "percentageValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483604", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "java.math.BigInteger", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"2305843009213693954"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2305843009213693953", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsLong", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"-5630213147331578516"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "java.math.BigInteger", "4503599627370496"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5630213147331578517", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "compareTo", "org.apache.commons.math3.fraction.BigFraction", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775806", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsInt", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"100"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "floatValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"-2147483646"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "percentageValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E11", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"9579156407417044992"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9579156407417044992", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"4503599895822336"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", "int,int", "98", "20"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4503599895822337", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"4433230883192832"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "java.math.BigInteger", "-5630213147331578457"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4433230883192831", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{"int", "int"}, new String[]{"1073741836", "-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "compareTo", "org.apache.commons.math3.fraction.BigFraction", "<sample:4>"}, {"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "57"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-70866960384"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "int", "1073741836"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("70866960384", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "long", "50"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"-49"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("49", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"200"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("200", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getDenominator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"4503599625273343"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 4503599625273343", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.FractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"4609434218613702656"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "toString", ""}, {"org.apache.commons.math3.fraction.BigFraction", "compareTo", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("42514526677683168617798269725040443392", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"5630213147331578520"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"9223372312001118208"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9223372312001118208", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsInt", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-2251799813685247"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2251804108652543", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getDenominator", ""}, {"org.apache.commons.math3.fraction.BigFraction", "add", "long", "4503599627370462"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9223372034707292159", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "abs", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"-9151314442816847907"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "long", "50"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9151314442816847908", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"5630213147331578520"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5630213147331578520", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"4503599627370528"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4503599627370528", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"1073741925"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1 / 1073741925", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "reduce", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"8388628"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "java.math.BigInteger", "2"}, {"org.apache.commons.math3.fraction.BigFraction", "divide", "long", "9007199254740991"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:6>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"9.2188684372274053E18"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:1>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483647 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"int"}, new String[]{"100"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("101", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.223372036854776E20", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"68"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "double", "2.1474836469999998E9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "long", "-1073741952"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", "int,int", "8388628", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:2>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("39614081257132168792477007872", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"int"}, new String[]{"10"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967286", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "multiply", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"-9007199254740990"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-83076749736557223600736668303228930", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "percentageValue", ""}, {"org.apache.commons.math3.fraction.BigFraction", "subtract", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"4503582447501344"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-27021494685008059 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "compareTo", "org.apache.commons.math3.fraction.BigFraction", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-1073741836"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsInt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"3698073679419233290"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("12921445716274009097", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"9218868437227405312"}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "long", "-2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 9218868437227405312", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"2147483648"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"277025390592"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("277025390591", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"9218868437227405312"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5 / 55313210623364431872", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"281474976710655"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("281474976710656", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"4503599627370521"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "percentageValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 4503599627370521", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483645 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4 / 3", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967295", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "doubleValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0737418235E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "1073741959"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2147483648 / 1073741959", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"1"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "hashCode", ""}, {"org.apache.commons.math3.fraction.BigFraction", "pow", "long", "3698073679419233275"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "percentageValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("5", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"25"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("13250832699863327890485880589325945092323232409035463357438923266746801041873849562269017904457025466357794958718389950499836740806085495596033148759739306554246233364569346533126057083410462834456316...#475#1259972154", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"2147483646"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483645", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "multiply", "int", "-2147483648"}, {"org.apache.commons.math3.fraction.Fraction", "multiply", "org.apache.commons.math3.fraction.Fraction", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "longValue", ""}}), new String[][]{{"getZero", "", "1"}, {"getZero", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "java.math.BigInteger", "-5630213146794707603"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"-9223372036854775744"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775744", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "pow", "java.math.BigInteger", "-9367487224930631680"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "subtract", "int", "-53"}, {"org.apache.commons.math3.fraction.Fraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:10>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483649", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"101"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775763"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775807 / 9223372036854775763", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"int"}, new String[]{"8388628"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-8388629", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:3>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "compareTo", "org.apache.commons.math3.fraction.Fraction", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:11>"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "long", "-9222809086901354495"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-101"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1 / 101", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-6 / 5", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"4611686018427387904"}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("42535295865117307928310139910543638528", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"2147483647", "-1073741869"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483647 / 1073741869", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967289", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "add", "org.apache.commons.math3.fraction.BigFraction", "<sample:12>"}, {"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getNumerator", ""}, {"org.apache.commons.math3.fraction.BigFraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23311", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "negate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"4503599627370555"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4503599627370554", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"8", "-53"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-8 / 53", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "bigDecimalValue", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483648 / 2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "divide", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.MathArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"1073741925"}, false, 1, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "multiply", "org.apache.commons.math3.fraction.BigFraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1073741925", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"163", "16777256"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("163 / 16777256", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:1>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("9.223372E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-9218868437227405313"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9218868437227405313", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "subtract", "org.apache.commons.math3.fraction.BigFraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "reciprocal", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"2097153"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2097152", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:8>"}, false, 2, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "getDenominator", ""}, {"org.apache.commons.math3.fraction.Fraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-2"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("36 / 25", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "add", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:5>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("2147483645 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483647 / 2", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"long"}, new String[]{"-277025390564"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "divide", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("277025390564", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("36893488147419103231 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"5630212047283079827"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5630212047283079828", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"-101"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-102", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "subtract", new String[]{"org.apache.commons.math3.fraction.Fraction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.fraction.Fraction", "doubleValue", ""}, {"org.apache.commons.math3.fraction.Fraction", "intValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.Fraction", "org.apache.commons.math3.fraction.Fraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"57", "2147483647"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.Fraction", actual.getClass().getName());
  assertEquals("57 / 2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math3.fraction.BigFraction"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"9007199250546804"}, false, 7, new String[][]{{"org.apache.commons.math3.fraction.BigFraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("54043195503280829 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.fraction.BigFraction", "org.apache.commons.math3.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.fraction.BigFraction", actual.getClass().getName());
  assertEquals("3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
}
