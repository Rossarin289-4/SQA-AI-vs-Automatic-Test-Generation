package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3270.2000000000003"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-32767"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "3"}}, 1), new String[][]{{"floor", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("3270. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:7>", "<sample:0>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3277.4000000000005"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}}), new String[][]{{"getTwo", "", "1"}, {"multiply", "int", "4"}, {"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"getOne", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"6555.270000000002"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:7>"}, {"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:7>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}}), new String[][]{{"getTwo", "", "4"}, {"multiply", "int", "4"}, {"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"getOne", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-319819.99999999994"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:7>"}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"lessThan", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-319819.99999999994"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:10>"}, {"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"lessThan", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-159913.09999999998"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"lessThan", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "long", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-8.58993459234E9"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "rint", ""}, {"org.apache.commons.math.dfp.Dfp", "divide", "int", "0"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"floor", "", "1"}, {"getTwo", "", "5"}, {"newInstance", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-16.0"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "int", "1000000001"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "1"}, {"getOne", "", "1"}, {"getTwo", "", "5"}, {"newInstance", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.0"}, false, 12, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "10000"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2.1474836456749996E10"}, false, 15, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"subtract", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "2"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "6"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=8, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=8, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "divide", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "2020-01-01"}, {"org.apache.commons.math.dfp.Dfp", "lessThan", "org.apache.commons.math.dfp.Dfp", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"65521.12699999999"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getZero", ""}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "multiply", "int", "1022"}}, 3), new String[][]{{"subtract", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "5"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "5"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-3270.2"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "multiply", "int", "2044"}}, 2), new String[][]{{"subtract", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "5"}, {"log10", "", "5"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"16350.968"}, false, 12, new String[][]{{"org.apache.commons.math.dfp.Dfp", "dfp2sci", ""}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "intValue", ""}}, 3), new String[][]{{"classify", "", "1"}, {"power10K", "int", "3"}, {"log10K", "", "6"}, {"classify", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-8.589934631226004E9"}, false, 12, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "NaN"}, {"org.apache.commons.math.dfp.Dfp", "toString", ""}}), new String[][]{{"add", "org.apache.commons.math.dfp.Dfp", "0"}, {"power10K", "int", "4"}, {"log10K", "", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1636.8000000000002"}, false, 13, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "byte", "-64"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"multiply", "org.apache.commons.math.dfp.Dfp", "1"}, {"power10K", "int", "4"}, {"floor", "", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2.175"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}), new String[][]{{"rint", "", "6"}, {"floor", "", "7"}, {"power10K", "int", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "add", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}), new String[][]{{"divide", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"32768"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10", "int", "1023"}}), new String[][]{{"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.3996499999999998"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "-9993"}, {"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}, 3), new String[][]{{"rint", "", "6"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "6"}, {"floor", "", "3"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9999. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "sqrt", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}), new String[][]{{"getOne", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "10001", "J", "<sample:9>", "<sample:7>", "<sample:10>"}, {"org.apache.commons.math.dfp.Dfp", "subtract", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}}, 3), new String[][]{{"log10K", "", "2"}, {"add", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "divide", "int", "32761"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"-128"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "negate", ""}}), new String[][]{{"log10", "", "5"}, {"add", "org.apache.commons.math.dfp.Dfp", "2"}, {"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "ceil", ""}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-1"}, {"org.apache.commons.math.dfp.Dfp", "ceil", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "1"}}), new String[][]{{"newInstance", "java.lang.String", "5"}, {"getOne", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 7, new String[][]{}, 2), new String[][]{{"newInstance", "byte", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-128. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 2), new String[][]{{"newInstance", "byte", "0"}, {"greaterThan", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:12>"}, false, 9, new String[][]{{"org.apache.commons.math.dfp.Dfp", "shiftRight", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-99999999. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"newInstance", "byte,byte", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "isNaN", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "unequal", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}}), new String[][]{{"isNaN", "", "3"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:16>"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "ceil", ""}, {"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<sample:2>"}}), new String[][]{{"ceil", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "long", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "ceil", ""}, {"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<sample:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"negate", "", "0"}, {"toDouble", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.dfp.Dfp", "negate", ""}, {"org.apache.commons.math.dfp.Dfp", "toString", ""}}), new String[][]{{"toDouble", "", "6"}, {"lessThan", "org.apache.commons.math.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=8, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}, 1), new String[][]{{"log10K", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}, 1), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "1e10"}, {"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}, 1), new String[][]{{"log10K", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:9>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e-131088 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "floor", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483570"}, {"org.apache.commons.math.dfp.Dfp", "getRadixDigits", ""}}), new String[][]{{"multiply", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"999999999"}, false), new String[][]{{"sqrt", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("31622.77658587 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "sqrt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "int", "-1073741824"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}}), new String[][]{{"divide", "org.apache.commons.math.dfp.Dfp", "0"}, {"getZero", "", "4"}, {"newInstance", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"32768"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "http://example.com/a?b=c"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "e"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2768", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.9999999999999997 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}, {"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}, 1), new String[][]{{"log10K", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}, 1), new String[][]{{"log10K", "", "3"}, {"newInstance", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"1000000000", "a,b,c", "<sample:0>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "1687.935000000001"}}), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "floor", new String[]{}, new String[]{}, false), new String[][]{{"power10", "int", "4"}, {"intValue", "", "7"}, {"isInfinite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"32766"}, false), new String[][]{{"log10", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("32765", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", ""}, {"org.apache.commons.math.dfp.Dfp", "round", "int", "10000"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0000000000000001 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"21474836>8"}, false, 9, new String[][]{}), new String[][]{{"greaterThan", "org.apache.commons.math.dfp.Dfp", "6"}, {"greaterThan", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "isNaN", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:12>"}, {"org.apache.commons.math.dfp.Dfp", "hashCode", ""}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "32761"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-0.0e {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "subtract", "org.apache.commons.math.dfp.Dfp", "<sample:7>"}, {"org.apache.commons.math.dfp.Dfp", "dfp2string", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.dfp.Dfp", "shiftRight", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "16384"}, {"org.apache.commons.math.dfp.Dfp", "round", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[10000.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "10000. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"multiply", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"-2147483517"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:10>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math.dfp.Dfp", "shiftRight", ""}}), new String[][]{{"subtract", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"-32759"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math.dfp.Dfp", "shiftRight", ""}}, 3), new String[][]{{"subtract", "org.apache.commons.math.dfp.Dfp", "7"}, {"divide", "org.apache.commons.math.dfp.Dfp", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"32761", "-1.5", "<sample:3>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trunc", "org.apache.commons.math.dfp.DfpField$RoundingMode", "<sample:5>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "-4.9E-324"}}), new String[][]{{"getOne", "", "6"}, {"nextAfter", "org.apache.commons.math.dfp.Dfp", "4"}, {"getOne", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<s:`>"}, {"org.apache.commons.math.dfp.Dfp", "dfp2string", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.9999999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3270.2000000000003"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-32767"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "3"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("3270.2 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3270.2000000000003"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-32767"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "3"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("3270.2 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3270.2000000000003"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-32767"}}, 1), new String[][]{{"floor", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("3270. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"327.02000000000004"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-32767"}}, 1), new String[][]{{"floor", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("327. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"326.98"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-32767"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-1073741825"}}, 1), new String[][]{{"floor", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("326. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-32767"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "10000"}}, 1), new String[][]{{"floor", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.797693134862e308 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"326.98"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-32767"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "10000"}}, 1), new String[][]{{"floor", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"277.98"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-32767"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "20000"}}, 1), new String[][]{{"floor", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("277. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"277.98"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-32767"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("277.98 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"271.88"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-32767"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("271.88 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-271.88"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-32767"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-271.88 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-32767"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-271.88"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-32767"}}, 1), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-271.88"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "long", "32769"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-32767"}}, 1), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-13.686500000000004"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "byte,byte", "2", "4"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}}, 1), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-13.686500000000004"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-2147483648"}}, 1), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"0.0"}, false, 11, new String[][]{}, 2), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"13.0"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}}, 2), new String[][]{{"getTwo", "", "4"}, {"multiply", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"13.0"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}, 2), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "4"}, {"multiply", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"13.0"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}, 2), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "4"}, {"multiply", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-16.0"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}, 2), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "4"}, {"multiply", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2.2049999999999996"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}, 2), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-2.204999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2.2049999999999996"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}, 2), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-2.205000000001 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2.21"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}, 2), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-2.209999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-64.21"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}, 2), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-64.209999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-6554.800000000002"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}, 2), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-6554.799999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-6554.800000000002"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-6554.8 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-655.4800000000002"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}, 2), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-655.479999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3361.4000000000015"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:2>"}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("3361.399999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3361.4500000000016"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("3361.450000001023 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3361.4500000000016"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("3361.450000001023 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"10000"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("9999.999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"10000"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("9999.999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"9996.0"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("9995.999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-10000.0"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:0>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math.dfp.Dfp", "isInfinite", ""}}, 1), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-9999.999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-40008.35999999999"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:2>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math.dfp.Dfp", "isInfinite", ""}}, 1), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-40008.35999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:2>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math.dfp.Dfp", "isInfinite", ""}}, 1), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1635.0629999999999"}, false, 12, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 1), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"lessThan", "org.apache.commons.math.dfp.Dfp", "1"}, {"getOne", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-6561.818000000001"}, false, 9, new String[][]{{"org.apache.commons.math.dfp.Dfp", "rint", ""}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"floor", "", "1"}, {"getTwo", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"4.294967294E9"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "int", "-2147483517"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.0"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "int", "-2147483517"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.0"}, false, 12, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "int", "-2147483536"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "<null>"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-6554.800000000002"}, false, 8, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "10000"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "2"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-3277.400000000001"}, false, 9, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "10000"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "2"}, {"multiply", "org.apache.commons.math.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10", "int", "-1073741823"}, {"org.apache.commons.math.dfp.Dfp", "log10K", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"4.294967294E8"}, false, 9, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.dfp.Dfp", "classify", ""}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 1), new String[][]{{"subtract", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "2"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"NaN"}, false, 9, new String[][]{{"org.apache.commons.math.dfp.Dfp", "floor", ""}, {"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 1), new String[][]{{"subtract", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "2"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"4.29496729135E9"}, false, 15, new String[][]{{"org.apache.commons.math.dfp.Dfp", "floor", ""}, {"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 1), new String[][]{{"subtract", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "2"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=8, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"65521.12699999999"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getZero", ""}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "multiply", "int", "1022"}}, 3), new String[][]{{"subtract", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "1"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "5"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"65521.12699999999"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getZero", ""}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "multiply", "int", "1022"}}, 3), new String[][]{{"subtract", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "1"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"65520.666999999994"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getZero", ""}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "multiply", "int", "1022"}}, 2), new String[][]{{"subtract", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "5"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "5"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-5.368709133249999E8"}, false, 12, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "10000", "Infinity", "<sample:5>", "<sample:2>", "<sample:7>"}, {"org.apache.commons.math.dfp.Dfp", "dfp2sci", ""}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 2), new String[][]{{"classify", "", "0"}, {"power10K", "int", "1"}, {"log10K", "", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getRadixDigits", ""}, {"org.apache.commons.math.dfp.Dfp", "power10K", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1.7179869262292004E10"}, false, 12, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "NaN\u00e9"}}, 1), new String[][]{{"add", "org.apache.commons.math.dfp.Dfp", "0"}, {"power10K", "int", "4"}, {"floor", "", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "unequal", "org.apache.commons.math.dfp.Dfp", "<sample:7>"}}, 3), new String[][]{{"log10K", "", "3"}, {"rint", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-6539.900000000001"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 1), new String[][]{{"rint", "", "6"}, {"power10K", "int", "7"}, {"floor", "", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1635.345"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 1), new String[][]{{"rint", "", "6"}, {"power10K", "int", "7"}, {"floor", "", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1635.0020000000002"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "ceil", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "2044"}}, 1), new String[][]{{"rint", "", "3"}, {"power10K", "int", "7"}, {"isNaN", "", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9998.999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"0.6725"}, false, 9, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "-1073741824"}, {"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}, 3), new String[][]{{"rint", "", "6"}, {"floor", "", "7"}, {"power10K", "int", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9999.000000107374 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.8679999999999997"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}, 3), new String[][]{{"rint", "", "6"}, {"floor", "", "7"}, {"log10", "", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9998.99999979,),( {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.8679999999999997"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}, 2), new String[][]{{"rint", "", "6"}, {"floor", "", "7"}, {"log10", "", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9998.99999979,),( {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.07914999999999996"}, false, 14, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "32766"}, {"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}, 3), new String[][]{{"rint", "", "6"}, {"floor", "", "6"}, {"floor", "", "5"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.9999999999999997 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "shiftLeft", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "-32702.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "shiftRight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getField", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "10001", "I", "<sample:9>", "<sample:7>", "<sample:10>"}}, 3), new String[][]{{"log10K", "", "2"}, {"add", "org.apache.commons.math.dfp.Dfp", "7"}, {"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "10001", "I", "<sample:9>", "<sample:7>", "<sample:10>"}}, 3), new String[][]{{"log10K", "", "2"}, {"add", "org.apache.commons.math.dfp.Dfp", "7"}, {"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "10001", "I", "<sample:9>", "<sample:7>", "<sample:10>"}, {"org.apache.commons.math.dfp.Dfp", "subtract", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}}, 3), new String[][]{{"log10K", "", "2"}, {"add", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "10001", "I", "<sample:9>", "<sample:7>", "<sample:10>"}, {"org.apache.commons.math.dfp.Dfp", "subtract", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}}, 3), new String[][]{{"log10K", "", "2"}, {"add", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "10001", "I", "<sample:9>", "<sample:7>", "<sample:10>"}, {"org.apache.commons.math.dfp.Dfp", "subtract", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}}, 3), new String[][]{{"log10K", "", "2"}, {"add", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"newDfp", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.math.dfp.Dfp", "dfp2string", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.math.dfp.Dfp", "dfp2string", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.math.dfp.Dfp", "dfp2string", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.9999999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<s:`>"}, {"org.apache.commons.math.dfp.Dfp", "dfp2string", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9998", String.valueOf(actual));
  assertEquals("receiver state after the call", "9997.999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"32760"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("32760. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"32760"}, false, 8, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("32760. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"4.294967294E9"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "3"}, {"org.apache.commons.math.dfp.Dfp", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("4294967294.0007 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"32702.0"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "3"}, {"org.apache.commons.math.dfp.Dfp", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("32702.00000001 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"65404.0"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "32767"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "3"}, {"org.apache.commons.math.dfp.Dfp", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("65404.00000002 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3270.2"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "32767"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "3"}, {"org.apache.commons.math.dfp.Dfp", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("3270.2 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"1022"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e4088 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"-1"}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.1 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3270.2000000000003"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-32767"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "byte", "-128"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("3270.2 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"5."}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("5. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "-2147483647", "add", "<sample:4>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-14.586500000000004"}, false, 11, new String[][]{}), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"0.0"}, false, 11, new String[][]{}), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2046.0"}, false, 11, new String[][]{}), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1023.0"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "rint", ""}}), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "5"}, {"greaterThan", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1023.0"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "rint", ""}}), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "5"}, {"getField", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2046.0000000000002"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getTwo", ""}, {"org.apache.commons.math.dfp.Dfp", "shiftRight", ""}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "1024"}}), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-818.4000000000001"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getTwo", ""}, {"org.apache.commons.math.dfp.Dfp", "getField", ""}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "1024"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-818.4 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-818.4000000000001"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "floor", ""}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "32761"}, {"org.apache.commons.math.dfp.Dfp", "getTwo", ""}}), new String[][]{{"getTwo", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1636.8000000000002"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "-32767"}, {"org.apache.commons.math.dfp.Dfp", "getTwo", ""}}), new String[][]{{"getTwo", "", "1"}, {"multiply", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1638.7000000000003"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "getTwo", ""}}), new String[][]{{"getTwo", "", "1"}, {"multiply", "int", "4"}, {"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3277.4000000000005"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "-2147483648"}}), new String[][]{{"getTwo", "", "1"}, {"multiply", "int", "4"}, {"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"getOne", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3277.4000000000005"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-2147483648"}}), new String[][]{{"getTwo", "", "1"}, {"multiply", "int", "4"}, {"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"getOne", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3277.4000000000005"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}}), new String[][]{{"getTwo", "", "1"}, {"multiply", "int", "4"}, {"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"getOne", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-6554.800000000002"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}}), new String[][]{{"getTwo", "", "1"}, {"multiply", "int", "4"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "0"}, {"getOne", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-6554.800000000002"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:7>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}}), new String[][]{{"getTwo", "", "1"}, {"multiply", "int", "4"}, {"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"getOne", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"40.0"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:7>"}, {"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:7>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:6>"}}), new String[][]{{"getTwo", "", "4"}, {"multiply", "int", "4"}, {"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"getOne", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"40.0"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}}), new String[][]{{"getTwo", "", "4"}, {"multiply", "int", "4"}, {"log10K", "", "0"}, {"getOne", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "32767"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"40.0"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:10>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}}), new String[][]{{"getTwo", "", "4"}, {"multiply", "int", "4"}, {"log10K", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "round", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("923794", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"6548.800000000002"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:12>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("6548.799999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3311.4000000000005"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("3311.399999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "align", new String[]{"int"}, new String[]{"999999999"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"10000"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("9999.999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-Infinity"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "classify", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trunc", "org.apache.commons.math.dfp.DfpField$RoundingMode", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"32759"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10", "int", "10"}, {"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("32759. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"4"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("4. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"32702.0"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"lessThan", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-32702.0"}, false, 8, new String[][]{{"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:9>"}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-32702. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-3270.2"}, false, 8, new String[][]{{"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}), new String[][]{{"log10", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-327.02"}, false, 8, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-327.019999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-319819.99999999994"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"lessThan", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte", "byte"}, new String[]{"2", "127"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "log10K", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10", "int", "10000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1449618", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 12, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"lessThan", "org.apache.commons.math.dfp.Dfp", "1"}, {"getOne", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "dfp2string", ""}, {"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "divide", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"32769"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-102.5"}, false, 12, new String[][]{{"org.apache.commons.math.dfp.Dfp", "rint", ""}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"floor", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-103. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "divide", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:10>"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "complement", "int", "1024"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0.9999999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-6561.818000000001"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "rint", ""}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"floor", "", "1"}, {"getTwo", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2.205"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "rint", ""}, {"org.apache.commons.math.dfp.Dfp", "divide", "int", "0"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "0"}, {"floor", "", "1"}, {"getTwo", "", "0"}, {"newInstance", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"2147483647", "\u00e9", "<sample:7>", "<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"32760"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-40061.35999999999"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "int", "-2147483570"}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "2"}, {"getTwo", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte", "byte"}, new String[]{"2", "3"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "-2147483647", "\t", "<sample:7>", "<sample:15>"}}), new String[][]{{"isNaN", "", "2"}, {"isInfinite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dfp2sci", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.0e0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"999999999"}, false), new String[][]{{"log10K", "", "2"}, {"rint", "", "4"}, {"divide", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dfp2string", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trunc", new String[]{"org.apache.commons.math.dfp.DfpField$RoundingMode"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "shiftLeft", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "-1638.7000000000003"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getOne", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9999", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.9999999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-261.60396000000003"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"subtract", "org.apache.commons.math.dfp.Dfp", "1"}, {"isInfinite", "", "2"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "5"}, {"intValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"-128"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-128. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"9218868437227405312"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getRadixDigits", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e-4 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:6>", "<sample:1>"}, true), new String[][]{{"log10K", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getOne", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "classify", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"1024", "divide", "<sample:13>", "<sample:13>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10K", "int", "1022"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"-2147483570"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "complement", "int", "32769"}, {"org.apache.commons.math.dfp.Dfp", "add", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.9999999999999997 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10", "int", "-2147483570"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "isNaN", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "unequal", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math.dfp.Dfp", "classify", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "lessThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getZero", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte", "byte"}, new String[]{"1", "2"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "a"}, {"org.apache.commons.math.dfp.Dfp", "add", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}}), new String[][]{{"log10K", "", "7"}, {"newInstance", "double", "6"}, {"negate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "sqrt", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "4"}}), new String[][]{{"getField", "", "2"}, {"newDfp", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "classify", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trunc", "org.apache.commons.math.dfp.DfpField$RoundingMode", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2147483647"}, false, 12, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"rint", "", "1"}, {"power10K", "int", "4"}, {"floor", "", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:10>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3364.270000000002"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "-2059"}, {"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}), new String[][]{{"rint", "", "6"}, {"floor", "", "7"}, {"classify", "", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9999. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1687.935000000001"}, false, 11, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}), new String[][]{{"rint", "", "6"}, {"floor", "", "7"}, {"power10K", "int", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-4.9E-324"}, false, 9, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}), new String[][]{{"rint", "", "6"}, {"floor", "", "7"}, {"power10K", "int", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9998.99999979,),( {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"0.967"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}), new String[][]{{"rint", "", "6"}, {"floor", "", "7"}, {"log10K", "", "3"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9998.99999979,),( {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "isInfinite", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "rint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"32768", "0xFFFFFFFF", "<sample:6>", "<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "sqrt", ""}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "9999"}}), new String[][]{{"divide", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"42.32000000000001"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}), new String[][]{{"rint", "", "6"}, {"floor", "", "7"}, {"log10", "", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9998.99999979,),( {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.8679999999999997"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}), new String[][]{{"rint", "", "6"}, {"floor", "", "7"}, {"log10", "", "2"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"9999"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"32768"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<s:`>"}, {"org.apache.commons.math.dfp.Dfp", "toDouble", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2768", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.9999999999999997 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "floor", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "round", new String[]{"int"}, new String[]{"32767"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0000000000000001 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "classify", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"10", "1.12345678901234567", "<sample:3>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "shiftRight", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "sqrt", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "long", "1"}, {"org.apache.commons.math.dfp.Dfp", "log10K", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "10001", "J", "<sample:9>", "<sample:7>", "<sample:10>"}, {"org.apache.commons.math.dfp.Dfp", "subtract", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}}), new String[][]{{"log10K", "", "2"}, {"add", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"newDfp", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", ""}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "0.967"}}, 2), new String[][]{{"newDfp", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", ""}}, 2), new String[][]{{"getSqr3Reciprocal", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.5773502691896258 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", ""}}, 2), new String[][]{{"getSqr3Reciprocal", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.5773502691896258 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"-64"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-64. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"-48"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-48. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"48"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("48. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"127"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("127. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"127"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "3"}}), new String[][]{{"divide", "org.apache.commons.math.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "-1073741825"}, {"org.apache.commons.math.dfp.Dfp", "divide", "int", "32761"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "-2147483596"}, {"org.apache.commons.math.dfp.Dfp", "divide", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "-2147483596"}, {"org.apache.commons.math.dfp.Dfp", "divide", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "-2147483596"}, {"org.apache.commons.math.dfp.Dfp", "divide", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trunc", "org.apache.commons.math.dfp.DfpField$RoundingMode", "<sample:1>"}, {"org.apache.commons.math.dfp.Dfp", "power10K", "int", "-1073741785"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trunc", "org.apache.commons.math.dfp.DfpField$RoundingMode", "<sample:1>"}, {"org.apache.commons.math.dfp.Dfp", "power10K", "int", "-1073741785"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"-32768", ".5", "<sample:10>", "<sample:0>", "<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"-32768", ".5", "<sample:10>", "<null>", "<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"-32768", ".5", "<sample:10>", "<sample:3>", "<sample:6>"}, false, 0, null, 2), new String[][]{{"multiply", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10", "int", "1000000029"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:4>"}, false, 10, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10", "int", "1000000029"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "subtract", "org.apache.commons.math.dfp.Dfp", "<null>"}}), new String[][]{{"getTwo", "", "1"}, {"floor", "", "3"}, {"divide", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "subtract", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "power10", "int", "32767"}}), new String[][]{{"getTwo", "", "1"}, {"floor", "", "1"}, {"divide", "int", "3"}, {"newInstance", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "subtract", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}}), new String[][]{{"getTwo", "", "1"}, {"floor", "", "1"}, {"divide", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "subtract", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}}), new String[][]{{"getTwo", "", "1"}, {"floor", "", "1"}, {"divide", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:15>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-32768"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:15>"}, false), new String[][]{{"newInstance", "byte", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:10>"}}), new String[][]{{"newInstance", "byte", "2"}, {"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:10>"}}), new String[][]{{"newInstance", "byte", "2"}, {"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:10>"}}), new String[][]{{"newInstance", "byte", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("127. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:10>"}, {"org.apache.commons.math.dfp.Dfp", "ceil", ""}}), new String[][]{{"newInstance", "byte", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-128. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:10>"}, {"org.apache.commons.math.dfp.Dfp", "ceil", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "0"}, {"org.apache.commons.math.dfp.Dfp", "ceil", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "ceil", ""}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-1"}, {"org.apache.commons.math.dfp.Dfp", "ceil", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "ceil", ""}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "32768"}}), new String[][]{{"setIEEEFlags", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=4, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], g...#295#52129826", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "1"}}), new String[][]{{"newInstance", "java.lang.String", "5"}, {"getOne", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "1"}}), new String[][]{{"newInstance", "java.lang.String", "5"}, {"getOne", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:9>"}, false, 3, new String[][]{}, 1), new String[][]{{"newInstance", "java.lang.String", "5"}, {"getOne", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:9>"}, false, 3, new String[][]{}), new String[][]{{"newInstance", "java.lang.String", "5"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:9>"}, false, 3, new String[][]{}, 1), new String[][]{{"newInstance", "java.lang.String", "5"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<null>"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "complement", "int", "32"}}), new String[][]{{"newInstance", "java.lang.String", "5"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.9999999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
