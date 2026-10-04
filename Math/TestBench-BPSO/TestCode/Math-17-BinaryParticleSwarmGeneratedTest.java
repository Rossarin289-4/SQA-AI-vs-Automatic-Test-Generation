package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "strictlyPositive", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "strictlyNegative", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<null>"}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-65536"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "unequal", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"-65280"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10", ""}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "java.lang.String", "0x123456789-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("5280", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0000000000000006 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"20002"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}), new String[][]{{"divide", "org.apache.commons.math3.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "negativeOrNull", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"127"}, false), new String[][]{{"strictlyPositive", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "org.apache.commons.math3.dfp.Dfp", "<sample:14>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("923794", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:16>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "unequal", "org.apache.commons.math3.dfp.Dfp", "<sample:14>"}}), new String[][]{{"getOne", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "align", "int", "8189"}, {"org.apache.commons.math3.dfp.Dfp", "lessThan", "org.apache.commons.math3.dfp.Dfp", "<sample:14>"}}), new String[][]{{"sqrt", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte", "byte"}, new String[]{"76", "2"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "strictlyNegative", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"1073741878"}, false, 5, new String[][]{}), new String[][]{{"toDouble", "", "4"}, {"lessThan", "org.apache.commons.math3.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "add", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "1024"}}), new String[][]{{"abs", "", "0"}, {"sqrt", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}), new String[][]{{"sqrt", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "-128"}}), new String[][]{{"toDouble", "", "4"}, {"divide", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"10"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "complement", "int", "-8222"}}), new String[][]{{"remainder", "org.apache.commons.math3.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}}), new String[][]{{"reciprocal", "", "0"}, {"negativeOrNull", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "shiftLeft", ""}}), new String[][]{{"sqrt", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.34078079299414e154 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-4.4942328371557893E307"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "floor", ""}}), new String[][]{{"isZero", "", "7"}, {"positiveOrNull", "", "0"}, {"intValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"-65520", "{\"a\":1}0", "<sample:5>", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "int", "1073741878"}}, 3), new String[][]{{"power10K", "int", "6"}, {"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "equals", "java.lang.Object", "<d:1.5>"}}), new String[][]{{"strictlyNegative", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}}), new String[][]{{"unequal", "org.apache.commons.math3.dfp.Dfp", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"58"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "java.lang.String", "divideHello, World"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("58. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"-Infinity"}, false), new String[][]{{"classify", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "floor", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "complement", "int", "32769"}}), new String[][]{{"add", "org.apache.commons.math3.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.9999999999999997 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "ceil", ""}}, 3), new String[][]{{"toSplitDouble", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"-9223372036n54775808"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-9.223372036548e16 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.0"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}}), new String[][]{{"positiveOrNull", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "add", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:17>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "complement", "int", "65476"}, {"org.apache.commons.math3.dfp.Dfp", "ceil", ""}}, 1), new String[][]{{"getOne", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.9999999999999994 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:14>"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "ceil", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"negativeOrNull", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"0xFFFFFFFF--1"}, false), new String[][]{{"strictlyNegative", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:3>"}, false), new String[][]{{"strictlyNegative", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1073741824"}, false, 0, null, 1), new String[][]{{"remainder", "org.apache.commons.math3.dfp.Dfp", "1"}, {"positiveOrNull", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "floor", ""}}, 2), new String[][]{{"remainder", "org.apache.commons.math3.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{".a"}, false, 3, new String[][]{}, 1), new String[][]{{"power10K", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1000000000000. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"1E-5"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:17>"}}), new String[][]{{"divide", "org.apache.commons.math3.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"-4503599627370444"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "remainder", "org.apache.commons.math3.dfp.Dfp", "<sample:14>"}, {"org.apache.commons.math3.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "2147483647", "12345678C012345678901234567890", "<sample:7>", "<sample:5>"}}), new String[][]{{"lessThan", "org.apache.commons.math3.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"5s.9218868437227405312"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "rint", ""}}), new String[][]{{"rint", "", "7"}, {"getTwo", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"34815"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "java.lang.String", "-2147483648greaserThan"}}, 2), new String[][]{{"negate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-1.000000000000e139260 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getRadixDigits", ""}}), new String[][]{{"nextAfter", "org.apache.commons.math3.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"-4503599627370495"}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "ceil", ""}}), new String[][]{{"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-4.503599627370496E15, 1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"32718"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}}, 2), new String[][]{{"intValue", "", "3"}, {"toDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-16383.5"}, false, 2, new String[][]{}), new String[][]{{"intValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-16384", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"131074"}, false), new String[][]{{"multiply", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-16383.5"}, false, 0, null, 3), new String[][]{{"negativeOrNull", "", "6"}, {"floor", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-16384. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "align", "int", "-2147483647"}}, 1), new String[][]{{"remainder", "org.apache.commons.math3.dfp.Dfp", "3"}, {"intValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}), new String[][]{{"sqrt", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:10>"}, false), new String[][]{{"strictlyPositive", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"4.503599627370496E15"}, false), new String[][]{{"sqrt", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("67108864. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"Infinity"}, false, 1, new String[][]{}), new String[][]{{"multiply", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "greaterThan", "org.apache.commons.math3.dfp.Dfp", "<sample:10>"}, {"org.apache.commons.math3.dfp.Dfp", "align", "int", "2147483647"}}), new String[][]{{"negativeOrNull", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dfp2string", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "align", "int", "32767"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte", "byte"}, new String[]{"-58", "64"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "remainder", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}}, 1), new String[][]{{"toSplitDouble", "", "0"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"2147483647"}, false), new String[][]{{"strictlyPositive", "", "5"}, {"power10K", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("10000. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"32728"}, false), new String[][]{{"multiply", "int", "1"}, {"toSplitDouble", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{}), new String[][]{{"nextAfter", "org.apache.commons.math3.dfp.Dfp", "1"}, {"getField", "", "5"}, {"newDfp", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"32769"}, false, 0, null, 1), new String[][]{{"log10K", "", "4"}, {"remainder", "org.apache.commons.math3.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.0000000000000e32769 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:14>"}, false, 3, new String[][]{}), new String[][]{{"sqrt", "", "2"}, {"getZero", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"5063"}, false), new String[][]{{"sqrt", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("3.162277660168380e2531 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "trunc", new String[]{"org.apache.commons.math3.dfp.DfpField$RoundingMode"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math3.dfp.Dfp", "7"}, {"subtract", "org.apache.commons.math3.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-1.000000000000e-131088 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:10>"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:4>"}, {"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:13>"}}, 3), new String[][]{{"greaterThan", "org.apache.commons.math3.dfp.Dfp", "7"}, {"strictlyPositive", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:10>"}, false, 6, new String[][]{}, 1), new String[][]{{"divide", "int", "3"}, {"toSplitDouble", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte", "byte"}, new String[]{"4", "4"}, false), new String[][]{{"floor", "", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "1"}, {"ceil", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "positiveOrNull", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}, {"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "align", "int", "21"}}, 2), new String[][]{{"sqrt", "", "4"}, {"toSplitDouble", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"5120"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "align", "int", "4096"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte", "byte"}, new String[]{"0", "2"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "equals", "java.lang.Object", "<s:L>"}}), new String[][]{{"sqrt", "", "0"}, {"negativeOrNull", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"-32826"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "complement", "int", "-2147450881"}}), new String[][]{{"rint", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0000000000214745 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "ceil", ""}}, 3), new String[][]{{"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[2.147483392E9, 255.0005]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:17>", "<sample:7>"}, true, 0, null, 1), new String[][]{{"intValue", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "2147483647"}}), new String[][]{{"divide", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "sqrt", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "complement", "int", "-536805454"}, {"org.apache.commons.math3.dfp.Dfp", "abs", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"65520"}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "strictlyPositive", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "strictlyPositive", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "align", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10K", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "round", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getRadixDigits", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "double", "1.8446744073709552E19"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "negativeOrNull", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dfp2sci", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getOne", ""}, {"org.apache.commons.math3.dfp.Dfp", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.0e0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"26384"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-6384", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.9999999999999998 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "negativeOrNull", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"setIEEEFlagsBits", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=31, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#891259404", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getZero", ""}, {"org.apache.commons.math3.dfp.Dfp", "getRadixDigits", ""}}, 1), new String[][]{{"divide", "org.apache.commons.math3.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"-1029360129"}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10K", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("129", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte", "byte"}, new String[]{"127", "-128"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "long", "1000000015"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "trunc", new String[]{"org.apache.commons.math3.dfp.DfpField$RoundingMode"}, new String[]{"<sample:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"-32701", "\t", "<null>", "<sample:1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "66"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "round", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "floor", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "intValue", ""}}, 2), new String[][]{{"getESplit", "", "4"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math3.dfp.Dfp;", actual.getClass().getName());
  assertEquals("[2.7182, 0.00008182845904523536]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"add", "org.apache.commons.math3.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dfp2string", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getZero", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "remainder", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:17>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:16>"}}, 2), new String[][]{{"getField", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=18, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-401512363", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "0"}, {"org.apache.commons.math3.dfp.Dfp", "strictlyNegative", ""}}, 2), new String[][]{{"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"33570812"}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getZero", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("33570812. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"-32767"}, false, 0, null, 3), new String[][]{{"abs", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "positiveOrNull", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dfp2string", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:7>", "<null>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "floor", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"toDouble", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"67076148"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}}, 2), new String[][]{{"getTwo", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "-128", "-10"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "add", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "intValue", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "round", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "127"}}, 2), new String[][]{{"getTwo", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}}, 2), new String[][]{{"floor", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"{\"aC\":1<}"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "equals", "java.lang.Object", "<s:a>"}}, 3), new String[][]{{"getRadixDigits", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "round", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10K", "int", "65542"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0000000000000001 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "toDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"127"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "-127", "127"}, {"org.apache.commons.math3.dfp.Dfp", "toString", ""}}, 2), new String[][]{{"isInfinite", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "trunc", new String[]{"org.apache.commons.math3.dfp.DfpField$RoundingMode"}, new String[]{"<sample:7>"}, false, 0, null, 2), new String[][]{{"isZero", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}, 3), new String[][]{{"lessThan", "org.apache.commons.math3.dfp.Dfp", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "lessThan", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:15>"}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "127", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dfp2sci", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "java.lang.String", "truue"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.0e0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "complement", "int", "2000000002"}}, 1), new String[][]{{"subtract", "org.apache.commons.math3.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.99999999998 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getZero", ""}}, 1), new String[][]{{"getTwo", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"6"}, false, 0, null, 3), new String[][]{{"strictlyNegative", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isZero", ""}}, 2), new String[][]{{"getRadixDigits", "", "7"}, {"divide", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"2147483647", "1.1234567890123456", "<sample:0>", "<sample:8>"}, false, 3, new String[][]{}, 3), new String[][]{{"classify", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"49153"}, false, 0, null, 2), new String[][]{{"isNaN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"67076200"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getTwo", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 3, new String[][]{}, 2), new String[][]{{"strictlyPositive", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "isInfinite", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"-65501"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10K", "int", "33"}}, 2), new String[][]{{"newInstance", "org.apache.commons.math3.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"-128"}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "classify", ""}}, 2), new String[][]{{"remainder", "org.apache.commons.math3.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "add", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:9>"}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"-6"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("6", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:8>"}, false, 0, null, 2), new String[][]{{"negativeOrNull", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}}, 2), new String[][]{{"reciprocal", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"971", ".5f", "<sample:3>", "<sample:5>", "<sample:7>"}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "floor", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "negativeOrNull", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"4227043", "1.1234667", "<sample:16>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "shiftLeft", ""}}, 2), new String[][]{{"newInstance", "byte,byte", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getOne", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"32766", "2147483648", "<sample:6>", "<sample:8>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.025"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "align", "int", "1073741823"}}, 1), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"1000000001"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "toDouble", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e-294967292 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dfp2sci", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.0e0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getOne", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "classify", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("923794", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<null>"}, false, 3, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"<null>", "<sample:7>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"-2147483648", "o1.5d", "<sample:7>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "-16384"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dfp2string", ""}, {"org.apache.commons.math3.dfp.Dfp", "getTwo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "double", "1042.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("923794", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"1073741823"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1073741823. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "align", new String[]{"int"}, new String[]{"2000000000"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "strictlyNegative", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "negativeOrNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "align", "int", "-1073741823"}, {"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "remainder", "org.apache.commons.math3.dfp.Dfp", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"2"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "isZero", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "java.lang.String", " \n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "add", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getRadixDigits", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "classify", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getRadixDigits", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "-128", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "int", "-2147483648"}, {"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "abs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:1>", "<sample:3>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "add", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "ceil", ""}}), new String[][]{{"classify", "", "5"}, {"getZero", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "remainder", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"2147483645"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "abs", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "lessThan", "org.apache.commons.math3.dfp.Dfp", "<sample:9>"}, {"org.apache.commons.math3.dfp.Dfp", "classify", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:9>", "<sample:6>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "java.lang.String", "0.E"}, {"org.apache.commons.math3.dfp.Dfp", "trunc", "org.apache.commons.math3.dfp.DfpField$RoundingMode", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "floor", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "0", "-128"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-30>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "shiftLeft", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "int", "2147483647"}, {"org.apache.commons.math3.dfp.Dfp", "hashCode", ""}}), new String[][]{{"ceil", "", "4"}, {"intValue", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "greaterThan", "org.apache.commons.math3.dfp.Dfp", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10K", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("988818", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "32768", "true", "<sample:8>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "isNaN", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10K", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getOne", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.9999999999999996"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:10>"}, false, 6, new String[][]{}), new String[][]{{"getTwo", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "strictlyNegative", ""}}), new String[][]{{"add", "org.apache.commons.math3.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getRadixDigits", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:14>", "<sample:9>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "1029360129"}, {"org.apache.commons.math3.dfp.Dfp", "toDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "align", "int", "-536608767"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"1.12345678901234561L"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "long", "-2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.123456789012 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"2147483136"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "lessThan", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2147483136. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "unequal", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "998"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "strictlyPositive", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "classify", ""}}), new String[][]{{"toDouble", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "unequal", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dfp2string", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "round", new String[]{"int"}, new String[]{"-500000000"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "isNaN", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"NaN"}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "-2147483648", "  \n", "<sample:3>", "<sample:7>"}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "1000000129"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"newDfp", "double", "3"}, {"strictlyNegative", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"32743", "<a>b</a>", "<sample:12>", "<sample:4>", "<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "lessThan", "org.apache.commons.math3.dfp.Dfp", "<sample:17>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "add", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "-2147483648"}, {"org.apache.commons.math3.dfp.Dfp", "align", "int", "1004194304"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte", "byte"}, new String[]{"0", "127"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}}), new String[][]{{"getPi", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("3.14159265359 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"998"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "strictlyPositive", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e3992 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negate", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:14>"}}), new String[][]{{"getESplit", "", "3"}});
  assertNotNull(actual);
  assertEquals("[Lorg.apache.commons.math3.dfp.Dfp;", actual.getClass().getName());
  assertEquals("[2.7182, 0.00008182845904523536]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "negativeOrNull", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getTwo", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"65520"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("65520. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "positiveOrNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "shiftRight", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "floor", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getRadixDigits", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:10>", "<sample:3>"}, true), new String[][]{{"classify", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"0x1F"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "equals", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"5"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9995", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "unequal", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "unequal", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}}), new String[][]{{"log10K", "", "7"}, {"getRadixDigits", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "floor", ""}}), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "round", new String[]{"int"}, new String[]{"65520"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "lessThan", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:10>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9990", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.9999999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "equals", "java.lang.Object", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dfp2sci", ""}}), new String[][]{{"getRoundingMode", "", "7"}, {"clearIEEEFlags", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=0, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], g...#295#1754187294", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"-2147483647"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dfp2sci", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3649", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.999999999979,),( {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "round", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0000000000000001 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:2>", "<sample:9>"}, true), new String[][]{{"divide", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"10001"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.9999999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"-16128"}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e-64512 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "shiftRight", ""}}), new String[][]{{"lessThan", "org.apache.commons.math3.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "align", new String[]{"int"}, new String[]{"-16384"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte", "byte"}, new String[]{"127", "-39"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getTwo", ""}, {"org.apache.commons.math3.dfp.Dfp", "getRadixDigits", ""}}), new String[][]{{"log10", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"-67141625", "/a/b", "<sample:0>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "int", "-65520"}}), new String[][]{{"getZero", "", "7"}, {"newInstance", "", "1"}, {"newInstance", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false), new String[][]{{"getTwo", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "unequal", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}), new String[][]{{"newInstance", "byte", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "floor", ""}}), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"1000000000"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e1000000000 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negate", ""}}), new String[][]{{"getField", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=17, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1049739820", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "align", "int", "32739"}}), new String[][]{{"divide", "int", "5"}, {"greaterThan", "org.apache.commons.math3.dfp.Dfp", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "align", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0.0e {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"511"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "998", "0.F", "<sample:8>", "<sample:10>", "<sample:0>"}}), new String[][]{{"power10K", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("100000000. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "align", "int", "-2147483646"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "strictlyNegative", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3647", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.999999999979,),( {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"999995903"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-5903", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:9>", "<sample:4>"}, true), new String[][]{{"power10", "int", "1"}, {"intValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"lessThan", "org.apache.commons.math3.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "floor", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "abs", new String[]{}, new String[]{}, false), new String[][]{{"unequal", "org.apache.commons.math3.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "rint", ""}, {"org.apache.commons.math3.dfp.Dfp", "dfp2string", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:16>"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getOne", ""}}), new String[][]{{"intValue", "", "0"}, {"getOne", "", "1"}, {"divide", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "1", "2"}}), new String[][]{{"add", "org.apache.commons.math3.dfp.Dfp", "0"}, {"intValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "sqrt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "java.lang.String", "ali\rn"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getField", new String[]{}, new String[]{}, false), new String[][]{{"setIEEEFlags", "int", "0"}, {"newDfp", "org.apache.commons.math3.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "align", "int", "2147483647"}}), new String[][]{{"lessThan", "org.apache.commons.math3.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getTwo", ""}, {"org.apache.commons.math3.dfp.Dfp", "strictlyNegative", ""}}), new String[][]{{"intValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"32768"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "org.apache.commons.math3.dfp.Dfp", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e131072 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "floor", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"power10K", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.0001 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"1023", "NaX", "<sample:10>", "<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "complement", "int", "986"}}), new String[][]{{"classify", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.9999999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"2147483647", "X1.5", "<sample:13>", "<null>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}, {"org.apache.commons.math3.dfp.Dfp", "getOne", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"9223372036854775807"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "round", new String[]{"int"}, new String[]{"32760"}, false, 1, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"-32760"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2760", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0000000000000003 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"-32766"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-32766. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "remainder", "org.apache.commons.math3.dfp.Dfp", "<sample:14>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:10>"}, false), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "floor", ""}}), new String[][]{{"getTwo", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "add", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:18>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "java.lang.String", "abc:"}}), new String[][]{{"negate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:5>", "<sample:10>"}, true), new String[][]{{"divide", "org.apache.commons.math3.dfp.Dfp", "1"}, {"add", "org.apache.commons.math3.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"1084"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "23"}}), new String[][]{{"nextAfter", "org.apache.commons.math3.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1083.999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:14>", "<sample:10>"}, true), new String[][]{{"intValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"-2147483648"}, false, 6, new String[][]{}), new String[][]{{"isZero", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
