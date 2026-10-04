package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"128"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:1>"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "java.math.BigInteger", "-11260426294663157089"}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:13>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9 / 11", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("12884901893 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.ZeroException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reciprocal", new String[]{}, new String[]{}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.ZeroException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "-2007", "-128"}, {"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:12>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483649", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getField", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:13>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}, {"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("25769803765 / 12", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "105", "-2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"50"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("203 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"4294967294"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "long", "4503599627370497"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "-66", "1"}, {"org.apache.commons.math.fraction.BigFraction", "getNumerator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "equals", "java.lang.Object", "<s:ley>"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "long", "2269890215936"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int", "128"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("55340232221128654847 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "2251799813685247"}, {"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:17>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"int"}, new String[]{"262140"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "1"}, {"org.apache.commons.math.fraction.BigFraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 262140", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"2147483584"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483584", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "<null>"}}), new String[][]{{"getRuntimeClass", "", "5"}, {"getZero", "", "7"}, {"getOne", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"0", "10"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"-50"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 4446241647709404462001681406551736431581923451213783931941822309375368306976915223898478257617396941748595352114104938374510705645528397931638501670161281011956258507862041597673070569834508703903...#486#-1006023710", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"9218868437227405312"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "int", "-131067"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"-576460752303423488"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "-9218868437227405312"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:2>"}, {"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsInt", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "-4", "-33"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:o>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"4.503599627370496E14"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "long", "4616189618054758335"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"9007199254740990"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9007199254740991", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "int", "32895"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4294967297", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominatorAsInt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "int", "-2147483646"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"4503599627370495"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4503599627370495", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"-283726776524340993"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1134907106097363975 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "reduce", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23311", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "reciprocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"-5630213147331578515"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "double", "-4.503599627370495E15"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5630213147331578516", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-11", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:11>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"-5"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsInt", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "percentageValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-6 / 5", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"-549755813988"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "doubleValue", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("549755813987", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2147483647>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "4503599627370495"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "java.math.BigInteger", "9223372036854775861"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775806", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:16>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "long", "-4611686018427387904"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"4503599627501567"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "49"}, {"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4503601774985215", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"-33554340"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-5630213147331578571"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-33554341", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"-5594184350312614506"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "int", "-100"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5594184350312614507", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"4294968316"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4294968317", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"4503599627370447"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "long", "-9223372036854775808"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("18014398509481791 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"9007199254740936"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 9007199254740936", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}, {"org.apache.commons.math.fraction.BigFraction", "compareTo", "org.apache.commons.math.fraction.BigFraction", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominatorAsInt", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "equals", "java.lang.Object", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "-283717980431318836"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "int", "-5"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-2815106573665781066"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:16>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2815106573665781065", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"4294967278"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "49"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967277", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "int", "127"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "long", "-2815106573665789249"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-2815106573665789232"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}, {"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "137438953983"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2815106573665789231", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"long"}, new String[]{"-36028797018963770"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1073741824 / 18014398509481885", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "9223372036854779904"}, {"org.apache.commons.math.fraction.BigFraction", "longValue", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.ZeroException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "1073741823"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "double", "-1.0737418235E9"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4611686016279904256", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483640", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"-2146959360"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "double", "4.9E-324"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "58"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483648E11", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int", "33554498"}, {"org.apache.commons.math.fraction.BigFraction", "pow", "java.math.BigInteger", "9218868420047536144"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:12>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getField", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-2815106573665789286"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsInt", ""}, {"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsInt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 2815106573665789286", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "9218868437227405312"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"Infinity"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "reciprocal", ""}, {"org.apache.commons.math.fraction.BigFraction", "intValue", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-11 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumerator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-1028"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "toString", ""}, {"org.apache.commons.math.fraction.BigFraction", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{"int", "int"}, new String[]{"2147483647", "-4112"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:11>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-128"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"9223372036854775808"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9223372034707292160", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.294967296E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{"int", "int"}, new String[]{"2147483647", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23237", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"4294967296"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "198", "93"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4294967297", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getReducedFraction", new String[]{"int", "int"}, new String[]{"23", "64"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("23 / 64", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "equals", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-283726776524340993"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.8333333333333334", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"4611686018427387903"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsInt", ""}, {"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "100"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4611686018427387904", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-9007199254740990"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9007201402224638", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}, {"org.apache.commons.math.fraction.BigFraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"-5630213147331578520"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "long", "8589934592"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5630213147331578520", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.ZeroException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"-5630213147331578499"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "percentageValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "0", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5630213147331578500", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:Aa>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"18446744073709551616"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "doubleValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("18446744073709551615", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"2251799813685248"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2251799813685247", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"9187343514713718784"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9187343514713718783", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"2147484672"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147484671", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("9.223372036854776E20", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{}, new String[]{}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4294967295", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("55340232221128654847 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"-11260426294663157089"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "pow", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("11260426294663157089", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumeratorAsInt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"16777472"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominatorAsInt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getField", ""}, {"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "-5630213147331578499"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 4294967296", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "int", "-4045"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"-36"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-37", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "-11260426294663157030"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"9218868437227405312"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 9218868437227405312", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"99"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"-16384"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("16383", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumerator", ""}, {"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 10", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "int", "101"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("10 / 9", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "2147483647", "121"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"-4033"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4032", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-6>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"9007199254740992"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9007199254740993", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-7 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "int", "127"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.ZeroException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "long", "92"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "java.math.BigInteger", "549755813988"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-8", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "equals", "java.lang.Object", "<s:0c>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "negate", ""}, {"org.apache.commons.math.fraction.BigFraction", "intValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.8333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "-36", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "int", "-2056"}, {"org.apache.commons.math.fraction.BigFraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"9223372586610589796"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "java.math.BigInteger", "-22520852589326281410"}, {"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "9007199254740992"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9223372586610589797", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "4609434218613702656"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5 / 12884901888", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"int"}, new String[]{"198"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 264", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"-567453553044487682"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "compareTo", "org.apache.commons.math.fraction.BigFraction", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-567453553044487683", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:9>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "int", "-33"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("31 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "long", "1152921504606846981"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"9007199255527423"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}, {"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9007199255527424", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:+>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "intValue", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"11260426294797374817"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-45041705179189499265 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"198"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2489206111144456682857625621512049696236100867488466853240446645915879533614153376473577929250285446782786635822048992849886417388916015625 / 1185625621700076113324930254218815923174968737095803970820...#297#-869103795", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"131071"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("131072", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:10>"}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"long"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"5.630213147331579E19"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "equals", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("7 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("3 / 8589934588", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"282024736718948"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("705061841797370 / 3", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"5066549580791807"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "-11260426294663156990"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("25332747903959035 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "-5630213130151707288"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"102"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4638397686588101979328150167890591454318967698009 / 25711008708143844408671393477458601640355247900524685364822016", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-2101264"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "int", "101"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:11>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"4503599627370486"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 6004799503160648", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int", "-1073741823"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "double", "4.50359962737045E15"}});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{"int"}, new String[]{"-5"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFractionField", actual.getClass().getName());
  assertEquals("{getOne=1, getZero=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"100"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-100", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getNumerator", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.math.BigInteger", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483648 / 9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"4503326896947200"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9218868709957828607", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "-288230376151711743"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-55340232221128654837 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:2>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 2", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "negate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "org.apache.commons.math.fraction.BigFraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:16>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("75.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"-11260425195151529316"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-11260425195151529317", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "1099511627976"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}, {"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 8", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "negate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "longValue", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("83.33333333333333", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"766"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("765", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "long", "9218868437294514114"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"java.math.BigInteger"}, new String[]{"9007199254740994"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-9007199254740994", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-5630213147331578514"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5630213149479062162", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"9007199254741051"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5 / 54043195528446306", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "549755813989"}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"-2"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumerator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 4611686018427387904", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"-67109020"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "compareTo", "org.apache.commons.math.fraction.BigFraction", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-67109021", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"79"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483727", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"4503874505277441"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "reduce", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("4503874505277440", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:4>"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "reciprocal", ""}, {"org.apache.commons.math.fraction.BigFraction", "add", "int", "1048603"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "java.math.BigInteger", "2147483648"}, {"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("2147483646", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"4"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "-11260426294663157054"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("536870912", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"4503599627370537"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 4503599627370537", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "abs", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("3 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"-5630213147331545752"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:3>"}, {"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "2147483647", "105"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5630213147331545753", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"4.6094342186137032E18"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "percentageValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "4294967288"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-100.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:2>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4294967295", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "doubleValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"-18013848753667996"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5 / 108083092522007976", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"4.503599627370495E15"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<null>"}, {"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("27670116110564327421 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"long"}, new String[]{"9007199254740994"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"-61"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-62", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"50"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsInt", ""}, {"org.apache.commons.math.fraction.BigFraction", "getDenominator", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArithmeticException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:5>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("7 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"long"}, new String[]{"1152921504606846976"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "toString", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 536870912", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"4503599627370494"}, false, 7, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("27021597764222969 / 6", String.valueOf(actual));
  assertEquals("receiver state after the call", "5 / 6", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"-11260426294663157131"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "org.apache.commons.math.fraction.BigFraction", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-11260426294663157132", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "long", "2147483648"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"-5630213147331592852"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "org.apache.commons.math.fraction.BigFraction", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5630213147331592851", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "org.apache.commons.math.fraction.BigFraction", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"4503599627370495"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-4503597479886847", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"9007199254741031"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1 / 9007199254741031", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "multiply", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-7", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "reduce", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "subtract", "int", "1073741823"}, {"org.apache.commons.math.fraction.BigFraction", "subtract", "java.math.BigInteger", "4503324749463551"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "pow", "long", "2147483637"}}), new String[][]{{"getRuntimeClass", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.apache.commons.math.fraction.BigFraction {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.apache.commons.math.fraction.BigFraction, getClasses=[], getConstructors=[public o...#786#-957780767", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"java.math.BigInteger"}, new String[]{"8796093020260"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-1 / 8796093020260", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-99"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "compareTo", "org.apache.commons.math.fraction.BigFraction", "<sample:0>"}, {"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("98", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"140737488355388"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("562949953421555 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"double"}, new String[]{"Infinity"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9223372036854775808", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "floatValue", ""}});
  assertNotNull(actual);
  assertEquals("java.math.BigDecimal", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "compareTo", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:8>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"long"}, new String[]{"-576460752303423506"}, false, 0, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "multiply", "java.math.BigInteger", "11260426294663157089"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-576460752303423507", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "48"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.75", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"java.math.BigInteger"}, new String[]{"50"}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "-4609434218613702654"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "getDenominatorAsLong", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "add", "java.math.BigInteger", "5066549580791807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "divide", new String[]{"long"}, new String[]{"9007199254743038"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "divide", "long", "-9007199254740990"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("1073741824 / 4503599627371519", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"-2147483648"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-8589934589 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"java.math.BigInteger"}, new String[]{"-9218868437227405312"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getNumeratorAsInt", ""}, {"org.apache.commons.math.fraction.BigFraction", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("9218868441522372608", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"long"}, new String[]{"-5630213147331578548"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsInt", ""}, {"org.apache.commons.math.fraction.BigFraction", "divide", "int", "-99"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("5630213151626545844", String.valueOf(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "floatValue", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Float", actual.getClass().getName());
  assertEquals("2.14748365E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "subtract", new String[]{"org.apache.commons.math.fraction.BigFraction"}, new String[]{"<sample:10>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-29 / 4", String.valueOf(actual));
  assertEquals("receiver state after the call", "3 / 4", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"int"}, new String[]{"97"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("96", String.valueOf(actual));
  assertEquals("receiver state after the call", "-1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "add", new String[]{"java.math.BigInteger"}, new String[]{"-5630213147331578560"}, false, 4, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", ""}, {"org.apache.commons.math.fraction.BigFraction", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("-5630213145184094912", String.valueOf(actual));
  assertEquals("receiver state after the call", "2147483648", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "longValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "bigDecimalValue", "int,int", "-2056", "99"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("9223372036854775807", String.valueOf(actual));
  assertEquals("receiver state after the call", "9223372036854775807", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "doubleValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "getDenominatorAsInt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.fraction.BigFraction", "org.apache.commons.math.fraction.BigFraction", "pow", new String[]{"int"}, new String[]{"196"}, false, 2, new String[][]{{"org.apache.commons.math.fraction.BigFraction", "compareTo", "org.apache.commons.math.fraction.BigFraction", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.fraction.BigFraction", actual.getClass().getName());
  assertEquals("11485047732582817769423525115645176624401653309560185145047837041024467840732918697245294375018816062214082963438227916140961994014386386246996530867280807634049780896007662356363987156104086344804303...#1889#-2049713808", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "4294967296", SearchInputFactory_scaffolding.receiverState());
 }
}
