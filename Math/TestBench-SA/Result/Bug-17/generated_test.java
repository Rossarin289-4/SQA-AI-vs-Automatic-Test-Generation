package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"32768"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e32768 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.0"}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "intValue", ""}, {"org.apache.commons.math3.dfp.Dfp", "log10", ""}}, 1), new String[][]{{"getRadixDigits", "", "3"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-3264.62175"}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "log10", ""}}), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"isNaN", "", "1"}, {"strictlyNegative", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.0737418246942997E10"}, false, 1, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "strictlyNegative", ""}, {"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"newInstance", "org.apache.commons.math3.dfp.Dfp", "4"}, {"multiply", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-51.20530500000001"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "log10", ""}, {"org.apache.commons.math3.dfp.Dfp", "log10K", ""}}, 2), new String[][]{{"divide", "int", "4"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "7"}, {"negativeOrNull", "", "7"}, {"intValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-657.9274999999999"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "2078"}}), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}, {"negativeOrNull", "", "3"}, {"intValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-524723.6830000002"}, false, 10, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getZero", ""}, {"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "-53"}}, 1), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}, {"reciprocal", "", "0"}, {"divide", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"0.0"}, false, 10, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getZero", ""}, {"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "-53"}}, 1), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}, {"reciprocal", "", "0"}, {"divide", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"Infinity"}, false, 10, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}}), new String[][]{{"intValue", "", "0"}, {"sqrt", "", "6"}, {"reciprocal", "", "0"}, {"divide", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-52472.19789999999"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "294911"}, {"org.apache.commons.math3.dfp.Dfp", "dfp2string", ""}}, 3), new String[][]{{"intValue", "", "6"}, {"sqrt", "", "6"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"5.617791046444739E307"}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:7>"}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "147455"}, {"org.apache.commons.math3.dfp.Dfp", "dfp2string", ""}}), new String[][]{{"intValue", "", "0"}, {"sqrt", "", "6"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("7.4951924901533e153 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"NaN"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "147455"}}, 2), new String[][]{{"log10", "", "0"}, {"sqrt", "", "6"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "0"}, {"reciprocal", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"0.7739999999999999"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "147455"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}}, 1), new String[][]{{"log10", "", "0"}, {"sqrt", "", "6"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "0"}, {"getField", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=21, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-2023922579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:7>", "<sample:2>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "trunc", new String[]{"org.apache.commons.math3.dfp.DfpField$RoundingMode"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "strictlyNegative", ""}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "double", "2.1474836490999994E9"}}), new String[][]{{"greaterThan", "org.apache.commons.math3.dfp.Dfp", "6"}, {"divide", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "add", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.66"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-67043187"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:7>"}, {"org.apache.commons.math3.dfp.Dfp", "dfp2sci", ""}}, 2), new String[][]{{"ceil", "", "7"}, {"sqrt", "", "0"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "6"}, {"getField", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=24, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-79240208", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"0.9369999999999999"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "67043187"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:7>"}, {"org.apache.commons.math3.dfp.Dfp", "dfp2sci", ""}}), new String[][]{{"ceil", "", "1"}, {"power10K", "int", "0"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "6"}, {"newInstance", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2147483647"}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-69205939"}, {"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}, {"org.apache.commons.math3.dfp.Dfp", "strictlyPositive", ""}}, 1), new String[][]{{"ceil", "", "0"}, {"sqrt", "", "5"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("46340.95001183 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2.1474836496888796E12"}, false, 14, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "138475354"}, {"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}, {"org.apache.commons.math3.dfp.Dfp", "strictlyPositive", ""}}, 1), new String[][]{{"ceil", "", "0"}, {"sqrt", "", "5"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1465429.51031053 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-4.289000000000001"}, false, 13, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-1072693247"}, {"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}, {"org.apache.commons.math3.dfp.Dfp", "strictlyPositive", ""}}), new String[][]{{"ceil", "", "2"}, {"strictlyNegative", "", "5"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "3"}, {"sqrt", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.26831889999999997"}, false, 13, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "32769"}, {"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}, {"org.apache.commons.math3.dfp.Dfp", "strictlyPositive", ""}}), new String[][]{{"ceil", "", "4"}, {"strictlyNegative", "", "4"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "7"}, {"sqrt", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.002815625000000001"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "1610612735"}, {"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"ceil", "", "4"}, {"strictlyNegative", "", "4"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "1"}, {"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e-65544 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-4.9E-324"}, false, 15, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-2147483598"}, {"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}}, 2), new String[][]{{"ceil", "", "6"}, {"strictlyNegative", "", "4"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "2"}, {"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "classify", ""}}), new String[][]{{"newInstance", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"-1073750016"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "999999999"}, {"org.apache.commons.math3.dfp.Dfp", "round", "int", "-31"}}), new String[][]{{"nextAfter", "org.apache.commons.math3.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"2020-01-01"}, false), new String[][]{{"strictlyPositive", "", "5"}, {"getZero", "", "4"}, {"floor", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"-2147b4836481L1.123456789012345671E-5"}, false, 11, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "-134217670"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}}), new String[][]{{"strictlyPositive", "", "5"}, {"getZero", "", "4"}, {"floor", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 15, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "abs", ""}, {"org.apache.commons.math3.dfp.Dfp", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.math3.dfp.Dfp", "trunc", "org.apache.commons.math3.dfp.DfpField$RoundingMode", "<sample:6>"}}), new String[][]{{"power10", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.1 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "floor", new String[]{}, new String[]{}, false, 14, new String[][]{}), new String[][]{{"unequal", "org.apache.commons.math3.dfp.Dfp", "3"}, {"rint", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "positiveOrNull", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "complement", "int", "32769"}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.9999999999999997 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "shiftLeft", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "remainder", "org.apache.commons.math3.dfp.Dfp", "<sample:7>"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "java.lang.String", "010"}, {"org.apache.commons.math3.dfp.Dfp", "toDouble", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "double", "1023"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "-127", "0"}, {"org.apache.commons.math3.dfp.Dfp", "complement", "int", "2147483647"}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"floor", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "9872.99999979,),( {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "991"}, {"org.apache.commons.math3.dfp.Dfp", "unequal", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "double", "16347.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "sqrt", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:7>"}}), new String[][]{{"getZero", "", "4"}, {"subtract", "org.apache.commons.math3.dfp.Dfp", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "complement", "int", "1073741767"}, {"org.apache.commons.math3.dfp.Dfp", "toDouble", ""}}), new String[][]{{"power10K", "int", "0"}, {"isZero", "", "3"}, {"newInstance", "byte,byte", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.999999999990)-), {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "complement", "int", "-1073741767"}, {"org.apache.commons.math3.dfp.Dfp", "toDouble", ""}, {"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}), new String[][]{{"power10K", "int", "0"}, {"isZero", "", "3"}, {"abs", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0000000000107374 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "toDouble", ""}, {"org.apache.commons.math3.dfp.Dfp", "ceil", ""}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "java.lang.String", "\tf.cEb04/1"}}, 2), new String[][]{{"sqrt", "", "7"}, {"newInstance", "byte", "7"}, {"remainder", "org.apache.commons.math3.dfp.Dfp", "6"}, {"newInstance", "byte", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "shiftRight", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "-2147483647", "+1", "<sample:2>", "<sample:5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "intValue", ""}}), new String[][]{{"toDouble", "", "2"}, {"newInstance", "byte", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("4. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"-536870907"}, false, 14, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getTwo", ""}, {"org.apache.commons.math3.dfp.Dfp", "strictlyNegative", ""}}, 1), new String[][]{{"divide", "int", "2"}, {"greaterThan", "org.apache.commons.math3.dfp.Dfp", "5"}, {"newInstance", "int", "1"}, {"toDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"999999999"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "remainder", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math3.dfp.Dfp", "log10K", ""}}), new String[][]{{"divide", "org.apache.commons.math3.dfp.Dfp", "4"}, {"greaterThan", "org.apache.commons.math3.dfp.Dfp", "5"}, {"newInstance", "int", "1"}, {"positiveOrNull", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "-65520"}, {"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "remainder", "org.apache.commons.math3.dfp.Dfp", "<sample:0>"}}, 1), new String[][]{{"floor", "", "7"}, {"intValue", "", "0"}, {"newInstance", "int", "6"}, {"toSplitDouble", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[3.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", ""}, {"org.apache.commons.math3.dfp.Dfp", "toString", ""}, {"org.apache.commons.math3.dfp.Dfp", "intValue", ""}}), new String[][]{{"positiveOrNull", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"positiveOrNull", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:4>"}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}}, 3), new String[][]{{"getField", "", "2"}, {"getLn2", "", "3"}, {"remainder", "org.apache.commons.math3.dfp.Dfp", "3"}, {"newInstance", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:0>"}}, 3), new String[][]{{"strictlyNegative", "", "5"}, {"abs", "", "3"}, {"log10", "", "1"}, {"toSplitDouble", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-37.5"}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "toDouble", ""}, {"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "0"}}, 1), new String[][]{{"intValue", "", "7"}, {"multiply", "int", "6"}, {"intValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-112", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-27.49999999999999"}, false, 14, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "toDouble", ""}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "67043187"}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "262"}}, 2), new String[][]{{"intValue", "", "6"}, {"floor", "", "4"}, {"divide", "org.apache.commons.math3.dfp.Dfp", "6"}, {"unequal", "org.apache.commons.math3.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.4999999999999964"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "-134217622", "a", "<sample:6>", "<sample:0>"}, {"org.apache.commons.math3.dfp.Dfp", "toDouble", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "120"}}, 1), new String[][]{{"intValue", "", "0"}, {"floor", "", "5"}, {"strictlyNegative", "", "2"}, {"unequal", "org.apache.commons.math3.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "10"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}, 1), new String[][]{{"lessThan", "org.apache.commons.math3.dfp.Dfp", "5"}, {"getOne", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"-514309"}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math3.dfp.Dfp", "floor", ""}, {"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:7>"}}, 3), new String[][]{{"newInstance", "byte", "0"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "1"}, {"abs", "", "4"}, {"strictlyPositive", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dfp2string", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "round", "int", "32761"}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "-2147483598"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.0000000000000001", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0000000000000001 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"-514309"}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math3.dfp.Dfp", "floor", ""}, {"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:7>"}}, 3), new String[][]{{"newInstance", "byte", "0"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "1"}, {"abs", "", "4"}, {"negativeOrNull", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "shiftLeft", ""}}), new String[][]{{"newInstance", "byte", "0"}, {"newInstance", "java.lang.String", "6"}, {"negate", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<null>"}, {"org.apache.commons.math3.dfp.Dfp", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<null>"}, {"org.apache.commons.math3.dfp.Dfp", "toString", ""}}, 3), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<null>"}, {"org.apache.commons.math3.dfp.Dfp", "toString", ""}}, 3), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<null>"}, {"org.apache.commons.math3.dfp.Dfp", "toString", ""}}, 3), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<null>"}, {"org.apache.commons.math3.dfp.Dfp", "toString", ""}}, 3), new String[][]{{"intValue", "", "3"}, {"newInstance", "byte", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-128. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<null>"}, {"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}, {"org.apache.commons.math3.dfp.Dfp", "toString", ""}}, 3), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<null>"}, {"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}, {"org.apache.commons.math3.dfp.Dfp", "toString", ""}}, 3), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}, {"org.apache.commons.math3.dfp.Dfp", "isZero", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.0078740157480315 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}}, 3), new String[][]{{"intValue", "", "3"}, {"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}}, 2), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}}, 2), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}, {"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}}, 2), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}, {"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}}, 2), new String[][]{{"abs", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.0078740157480315 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}, {"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}}, 2), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "equals", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}, {"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "32768", "I", "<sample:7>", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}, 1), new String[][]{{"intValue", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}, 1), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}, 1), new String[][]{{"isInfinite", "", "5"}, {"divide", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.25 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}, 1), new String[][]{{"isInfinite", "", "5"}, {"divide", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.25 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "lessThan", "org.apache.commons.math3.dfp.Dfp", "<sample:0>"}, {"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}, 1), new String[][]{{"multiply", "org.apache.commons.math3.dfp.Dfp", "1"}, {"add", "org.apache.commons.math3.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1.07374182555E8"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "-127"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "1", "127"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}, 2), new String[][]{{"isNaN", "", "5"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.07374176E8, -6.555]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-9223372036854775808"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "-127"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "1", "127"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}, 2), new String[][]{{"isNaN", "", "1"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-9.223372036854776E18, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-4.6116860184273879E18"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "-128"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "1", "127"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}, 2), new String[][]{{"isNaN", "", "1"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-4.6116860184273879E18, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "-128"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "1", "127"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}, 2), new String[][]{{"isNaN", "", "1"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.147483648E9, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2.147483648E9"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "-128"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}, 2), new String[][]{{"isNaN", "", "1"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[2.147483648E9, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2147483648"}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "-128"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}, 2), new String[][]{{"isNaN", "", "1"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.147483648E9, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2.147483648045E9"}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "-128"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}, 2), new String[][]{{"isNaN", "", "1"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.147483648E9, -0.0451]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1.0737418240365E9"}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}, 2), new String[][]{{"getRadixDigits", "", "1"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.073741824E9, -0.0365]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.0737418240365E9"}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}, 2), new String[][]{{"getRadixDigits", "", "1"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.073741824E9, 0.0365]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"5.368709147582498E8"}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}, 2), new String[][]{{"getRadixDigits", "", "1"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[5.36870912E8, 2.7584]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-5.368709147582498E8"}, false, 7, new String[][]{}, 2), new String[][]{{"getRadixDigits", "", "1"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-5.36870912E8, -2.7584]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1.073741824E8"}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "intValue", ""}, {"org.apache.commons.math3.dfp.Dfp", "log10", ""}}, 2), new String[][]{{"getRadixDigits", "", "3"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.07374176E8, -6.4]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2.14748364903E7"}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "intValue", ""}, {"org.apache.commons.math3.dfp.Dfp", "log10", ""}}, 1), new String[][]{{"getRadixDigits", "", "3"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[2.1474836E7, 0.49029736]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2.1474836490299996E7"}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "intValue", ""}, {"org.apache.commons.math3.dfp.Dfp", "log10", ""}}, 1), new String[][]{{"getRadixDigits", "", "3"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.1474836E7, -0.49029736]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3.32"}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "intValue", ""}, {"org.apache.commons.math3.dfp.Dfp", "log10", ""}}, 1), new String[][]{{"getRadixDigits", "", "3"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[3.3199996948242188, 3.05176E-7]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3.32"}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10", ""}}, 1), new String[][]{{"getRadixDigits", "", "3"}, {"getRadixDigits", "", "4"}, {"getZero", "", "1"}, {"strictlyNegative", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.056"}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10", ""}}, 1), new String[][]{{"getRadixDigits", "", "3"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.055999994277954, 5.722E-9]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.056"}, false, 13, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10", ""}}, 1), new String[][]{{"getRadixDigits", "", "3"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.055999994277954, 5.722E-9]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.476"}, false, 13, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10", ""}}, 1), new String[][]{{"getRadixDigits", "", "3"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.4759998321533203, 1.67847E-7]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"65533.99999999999"}, false, 13, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "log10", ""}}, 2), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "4"}, {"isNaN", "", "1"}, {"strictlyNegative", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-657.9274999999999"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}}, 3), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"isNaN", "", "1"}, {"isZero", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-657.9274999999999"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}}, 3), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"newInstance", "org.apache.commons.math3.dfp.Dfp", "1"}, {"isZero", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-657.9274999999999"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}, 3), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"newInstance", "org.apache.commons.math3.dfp.Dfp", "1"}, {"isZero", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-657.9274999999999"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}, 3), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"newInstance", "org.apache.commons.math3.dfp.Dfp", "1"}, {"multiply", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-65.79274999999996"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}, 3), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"newInstance", "org.apache.commons.math3.dfp.Dfp", "1"}, {"newInstance", "org.apache.commons.math3.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.0737418246942997E10"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"newInstance", "org.apache.commons.math3.dfp.Dfp", "4"}, {"multiply", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-15949.800000000001"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10K", "int", "3"}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"newInstance", "org.apache.commons.math3.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1.0"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10K", "int", "3"}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"newInstance", "org.apache.commons.math3.dfp.Dfp", "4"}, {"log10K", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1.0"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10K", "int", "3"}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"newInstance", "org.apache.commons.math3.dfp.Dfp", "4"}, {"divide", "org.apache.commons.math3.dfp.Dfp", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3.32"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "intValue", ""}, {"org.apache.commons.math3.dfp.Dfp", "power10K", "int", "-48"}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"negativeOrNull", "", "6"}, {"intValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"13.280000000000001"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "intValue", ""}, {"org.apache.commons.math3.dfp.Dfp", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "7"}, {"negativeOrNull", "", "6"}, {"intValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10", ""}, {"org.apache.commons.math3.dfp.Dfp", "log10K", ""}}, 2), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "7"}, {"negativeOrNull", "", "7"}, {"intValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"16347.0"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "lessThan", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math3.dfp.Dfp", "log10K", ""}}, 2), new String[][]{{"divide", "int", "4"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "2"}, {"negativeOrNull", "", "4"}, {"intValue", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"32694.0"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "lessThan", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math3.dfp.Dfp", "log10K", ""}}, 2), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}, {"negativeOrNull", "", "4"}, {"intValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("181", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"16346.986"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "1024"}}, 2), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}, {"negativeOrNull", "", "4"}, {"intValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2046.0"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "1024"}}, 2), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}, {"negativeOrNull", "", "4"}, {"intValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("45", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1315.8549999999998"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "2078"}}, 3), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}, {"negativeOrNull", "", "3"}, {"intValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("36", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2631.7099999999996"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "2078"}}, 3), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}, {"negativeOrNull", "", "3"}, {"intValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("51", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1315.855"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "rint", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "2078"}}, 3), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("36.274715712194 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"32768"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "rint", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "-2147483648"}}, 3), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}, {"negativeOrNull", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-131180.49"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "1024"}}, 3), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"131180.49"}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "1024"}}, 3), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("362.188473035849 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-52472.19789999999"}, false, 11, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getZero", ""}, {"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "10"}}, 3), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}, {"reciprocal", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-262360.96150000003"}, false, 11, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getZero", ""}, {"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "-53"}}, 1), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}, {"reciprocal", "", "0"}, {"getZero", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"10230.0"}, false, 10, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "-53"}}, 1), new String[][]{{"intValue", "", "0"}, {"sqrt", "", "6"}, {"reciprocal", "", "0"}, {"divide", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.0049434732389014 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 10, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "-2147483648"}}, 1), new String[][]{{"intValue", "", "0"}, {"sqrt", "", "6"}, {"reciprocal", "", "0"}, {"divide", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("3.7291703656004e-155 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "shiftRight", ""}}, 3), new String[][]{{"divide", "int", "6"}, {"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "floor", ""}, {"org.apache.commons.math3.dfp.Dfp", "strictlyNegative", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"power10", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getRadixDigits", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"32760"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("32760. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}, {"org.apache.commons.math3.dfp.Dfp", "isZero", ""}}), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}}), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "32768", "I", "<sample:7>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "32768", "I", "<sample:7>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"1000000000", "2020-01-01", "<sample:2>", "<sample:5>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getOne", ""}, {"org.apache.commons.math3.dfp.Dfp", "getZero", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "32768", "I", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "-1073741823", "I", "<sample:7>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("127", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "isNaN", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "abs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}), new String[][]{{"isInfinite", "", "5"}, {"divide", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.25 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}), new String[][]{{"isInfinite", "", "5"}, {"divide", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.25 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}), new String[][]{{"isInfinite", "", "5"}, {"divide", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.25 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:4>"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}), new String[][]{{"multiply", "org.apache.commons.math3.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:4>"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}), new String[][]{{"getRadixDigits", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}), new String[][]{{"multiply", "org.apache.commons.math3.dfp.Dfp", "1"}, {"add", "org.apache.commons.math3.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}), new String[][]{{"multiply", "org.apache.commons.math3.dfp.Dfp", "1"}, {"add", "org.apache.commons.math3.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "lessThan", "org.apache.commons.math3.dfp.Dfp", "<sample:0>"}, {"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}), new String[][]{{"multiply", "org.apache.commons.math3.dfp.Dfp", "1"}, {"add", "org.apache.commons.math3.dfp.Dfp", "4"}, {"getTwo", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "lessThan", "org.apache.commons.math3.dfp.Dfp", "<sample:0>"}, {"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}), new String[][]{{"multiply", "org.apache.commons.math3.dfp.Dfp", "1"}, {"add", "org.apache.commons.math3.dfp.Dfp", "4"}, {"getTwo", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "lessThan", "org.apache.commons.math3.dfp.Dfp", "<sample:0>"}, {"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}}), new String[][]{{"multiply", "org.apache.commons.math3.dfp.Dfp", "1"}, {"add", "org.apache.commons.math3.dfp.Dfp", "4"}, {"getTwo", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"1023"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8977", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.9999999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"4503599627370495"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("4503599627370496. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2.2517998136852475E15"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2251799813685248. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2147483647.0003 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.0737418235E9"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1073741823.5002 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2.1474836469999998E9"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2147483647.0003 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"20000.0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("20000. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"40000.0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("40000. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"40022.0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("40022.00000001 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"40036.0"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("40035.99999998 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"80044.0"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("80044.00000002 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"80044.0"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("80044.00000002 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2147483648"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-2147483648. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-2147483648. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2.1474836491E9"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-2147483649.0995 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dfp2string", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"1000000001"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1000000001. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.07374182455E9"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1073741824.5498 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2.1474836490999994E9"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}), new String[][]{{"isNaN", "", "5"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[2.147483648E9, 1.0995]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2.1474836493999992E10"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "127"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}), new String[][]{{"isNaN", "", "5"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[2.147483648E10, 14.0016]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2.1474836490999994E9"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "127"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}), new String[][]{{"isNaN", "", "5"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.147483648E9, -1.0995]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2.1474836491E8"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "127"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}), new String[][]{{"isNaN", "", "5"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.14748352E8, -12.91]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"NaN"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "-127"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}), new String[][]{{"isNaN", "", "5"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2.1474836491000003E8"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "-127"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "1", "4"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}), new String[][]{{"isNaN", "", "5"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-2.14748352E8, -12.91]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dfp2sci", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.0e0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1.0737418245500002E7"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "-127"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "1", "4"}, {"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}), new String[][]{{"isNaN", "", "5"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-1.0737418E7, -0.245501]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"5.368709147582498E8"}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}), new String[][]{{"getRadixDigits", "", "1"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[5.36870912E8, 2.7584]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"10230.0"}, false, 7, new String[][]{}), new String[][]{{"getRadixDigits", "", "3"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[10230.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"<null>", "<sample:6>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.4760000000000002"}, false, 12, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10", ""}}), new String[][]{{"getRadixDigits", "", "3"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.4759998321533203, 1.67847E-7]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.5305"}, false, 12, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "log10", ""}}), new String[][]{{"divide", "int", "3"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.5304999351501465, -6.485E-8]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-6529.274999999999"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "log10", ""}}), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"isNaN", "", "1"}, {"strictlyNegative", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "trunc", new String[]{"org.apache.commons.math3.dfp.DfpField$RoundingMode"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-3264.62175"}, false, 8, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "log10", ""}}), new String[][]{{"divide", "int", "3"}, {"classify", "", "6"}, {"isNaN", "", "1"}, {"strictlyNegative", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "lessThan", "org.apache.commons.math3.dfp.Dfp", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-657.9274999999999"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}}), new String[][]{{"divide", "int", "3"}, {"multiply", "org.apache.commons.math3.dfp.Dfp", "6"}, {"isNaN", "", "1"}, {"isZero", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"1023", "I", "<null>", "<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "int", "-32768"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "equals", "java.lang.Object", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "shiftRight", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3648", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.999999999979,),( {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"1000000001"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e-294967292 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "strictlyPositive", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "isInfinite", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "intValue", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"999999999"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("999999999. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "floor", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "-1073741825", "1e10", "<null>", "<sample:0>", "<sample:1>"}, {"org.apache.commons.math3.dfp.Dfp", "getTwo", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"511.5"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "1053"}}), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "6"}, {"negativeOrNull", "", "4"}, {"intValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("23", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "align", new String[]{"int"}, new String[]{"1024"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "2078", "2147483647", "<null>", "<null>"}}), new String[][]{{"newInstance", "byte", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-128. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"+1"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "round", "int", "1"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte,byte", "0", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"32759"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("32759. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 10, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "-2147483648"}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", ""}}), new String[][]{{"intValue", "", "0"}, {"sqrt", "", "6"}, {"reciprocal", "", "0"}, {"divide", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("3.7291703656004e-155 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "unequal", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "3", "-", "<null>", "<sample:2>", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "isZero", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "add", "org.apache.commons.math3.dfp.Dfp", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"2078", "1.5", "<sample:6>", "<sample:7>", "<sample:2>"}, false), new String[][]{{"classify", "", "6"}, {"log10", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "classify", ""}, {"org.apache.commons.math3.dfp.Dfp", "lessThan", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "negativeOrNull", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getTwo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"5.617791046444739E307"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "294911"}, {"org.apache.commons.math3.dfp.Dfp", "dfp2string", ""}}, 3), new String[][]{{"intValue", "", "6"}, {"sqrt", "", "6"}, {"reciprocal", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.33418854994548e-154 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2.8088955232223696E307"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:1>"}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "32761"}, {"org.apache.commons.math3.dfp.Dfp", "dfp2string", ""}}, 3), new String[][]{{"intValue", "", "6"}, {"sqrt", "", "6"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("5.2999014360859e153 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2.808895523222369E307"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:4>"}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "147466"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}}, 2), new String[][]{{"log10", "", "0"}, {"sqrt", "", "6"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("5.2999014360859e153 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"0.83"}, false, 6, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "147394"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}}, 1), new String[][]{{"ceil", "", "0"}, {"sqrt", "", "6"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "0"}, {"getField", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=21, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-2023922579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.351"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "divide", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "147394"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}}, 1), new String[][]{{"ceil", "", "0"}, {"sqrt", "", "6"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "0"}, {"getField", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "add", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "java.lang.String", ".5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"0.5469999999999999"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-32766"}, {"org.apache.commons.math3.dfp.Dfp", "dfp2string", ""}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}}), new String[][]{{"ceil", "", "3"}, {"sqrt", "", "6"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "0"}, {"getField", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "strictlyNegative", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "strictlyNegative", ""}, {"org.apache.commons.math3.dfp.Dfp", "newInstance", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "nextAfter", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "lessThan", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"4086.75"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "2147483647"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}}, 1), new String[][]{{"ceil", "", "3"}, {"sqrt", "", "6"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "5"}, {"getField", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=20, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#1622817260", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"1000000001"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "shiftLeft", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.000099999999999 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10K", ""}, {"org.apache.commons.math3.dfp.Dfp", "getOne", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10K", "int", "1023"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getZero", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"0.01845"}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-134217622"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:4>"}}, 2), new String[][]{{"ceil", "", "7"}, {"sqrt", "", "6"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "5"}, {"getField", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=25, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#568987249", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"2078", "trunc", "<sample:1>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "trunc", "org.apache.commons.math3.dfp.DfpField$RoundingMode", "<sample:4>"}}), new String[][]{{"lessThan", "org.apache.commons.math3.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-6.224999999999999E-4"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-134217574"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:5>"}}, 2), new String[][]{{"ceil", "", "7"}, {"sqrt", "", "6"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "1"}, {"getField", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=25, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#568987249", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getRadixDigits", ""}, {"org.apache.commons.math3.dfp.Dfp", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "org.apache.commons.math3.dfp.Dfp", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "isInfinite", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "classify", ""}, {"org.apache.commons.math3.dfp.Dfp", "negativeOrNull", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"130805.99999999996"}, false, 5, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-67108787"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:7>"}, {"org.apache.commons.math3.dfp.Dfp", "dfp2sci", ""}}, 3), new String[][]{{"floor", "", "7"}, {"sqrt", "", "0"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "6"}, {"getField", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=24, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-79240208", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"294911", "1.1234567", "<sample:0>", "<sample:2>"}, false), new String[][]{{"ceil", "", "6"}, {"getTwo", "", "7"}, {"rint", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "align", "int", "147466"}, {"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "isZero", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"9999"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e39996 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "reciprocal", new String[]{}, new String[]{}, false), new String[][]{{"getTwo", "", "4"}, {"newInstance", "java.lang.String", "1"}, {"toDouble", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"sqrt"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"-67108787"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "rint", ""}, {"org.apache.commons.math3.dfp.Dfp", "multiply", "int", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("923794", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"-127"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getZero", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"log10", "", "1"}, {"add", "org.apache.commons.math3.dfp.Dfp", "4"}, {"unequal", "org.apache.commons.math3.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"0.009369999999999998"}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-67108787"}, {"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}, {"org.apache.commons.math3.dfp.Dfp", "strictlyPositive", ""}}), new String[][]{{"ceil", "", "0"}, {"sqrt", "", "1"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.9999999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "shiftRight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "remainder", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math3.dfp.Dfp", "classify", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "log10K", ""}}), new String[][]{{"getField", "", "0"}, {"setIEEEFlags", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=31, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#891259404", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "round", "int", "10000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0000000000000001 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "shiftLeft", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"147455"}, false, 1, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}, {"org.apache.commons.math3.dfp.Dfp", "greaterThan", "org.apache.commons.math3.dfp.Dfp", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"285.75"}, false, 15, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "1073741823"}, {"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}, {"org.apache.commons.math3.dfp.Dfp", "strictlyPositive", ""}}, 3), new String[][]{{"ceil", "", "1"}, {"sqrt", "", "5"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("16.911534525287 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.7289999999999999"}, false, 13, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-1073741823"}, {"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}, {"org.apache.commons.math3.dfp.Dfp", "strictlyPositive", ""}}, 1), new String[][]{{"ceil", "", "1"}, {"sqrt", "", "5"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "3"}, {"sqrt", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e-65544 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-4.7589999999999995"}, false, 13, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-1073741823"}, {"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}, {"org.apache.commons.math3.dfp.Dfp", "strictlyPositive", ""}}, 1), new String[][]{{"ceil", "", "1"}, {"sqrt", "", "5"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "3"}, {"sqrt", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"-32766"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "lessThan", "org.apache.commons.math3.dfp.Dfp", "<sample:7>"}}), new String[][]{{"divide", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "round", new String[]{"int"}, new String[]{"1000000000"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0000000000000001 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "shiftLeft", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "complement", "int", "-1072693247"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0.0000000000107269 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getZero", new String[]{}, new String[]{}, false), new String[][]{{"negativeOrNull", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false), new String[][]{{"divide", "int", "6"}, {"log10K", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"-127"}, false, 7, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "newInstance", "byte", "0"}, {"org.apache.commons.math3.dfp.Dfp", "subtract", "org.apache.commons.math3.dfp.Dfp", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-127. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"1023"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000000e1023 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.15944999999999984"}, false, 14, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "1072701402"}, {"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}, {"org.apache.commons.math3.dfp.Dfp", "strictlyPositive", ""}}, 2), new String[][]{{"ceil", "", "6"}, {"strictlyNegative", "", "7"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "3"}, {"sqrt", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e-65544 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "remainder", "org.apache.commons.math3.dfp.Dfp", "<sample:2>"}, {"org.apache.commons.math3.dfp.Dfp", "shiftLeft", ""}}), new String[][]{{"getTwo", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "complement", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.999999999979,),( {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "trunc", "org.apache.commons.math3.dfp.DfpField$RoundingMode", "<sample:0>"}, {"org.apache.commons.math3.dfp.Dfp", "shiftRight", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "floor", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "positiveOrNull", ""}}), new String[][]{{"floor", "", "0"}, {"divide", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"-1072693247"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-1072693247. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:1>"}, false, 3, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "equals", "java.lang.Object", "<s:b>"}, {"org.apache.commons.math3.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "1023", "E", "<sample:5>", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"2078"}, false, 4, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7922", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-0.49065945"}, false, 13, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-32769"}, {"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}, {"org.apache.commons.math3.dfp.Dfp", "toSplitDouble", ""}}), new String[][]{{"ceil", "", "4"}, {"strictlyNegative", "", "0"}, {"nextAfter", "org.apache.commons.math3.dfp.Dfp", "3"}, {"remainder", "org.apache.commons.math3.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e-131088 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "floor", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dfp2string", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "dfp2sci", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "isInfinite", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0e", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "add", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "hashCode", ""}, {"org.apache.commons.math3.dfp.Dfp", "power10", "int", "-1072693247"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"-32767"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math3.dfp.Dfp,org.apache.commons.math3.dfp.Dfp", "-2147483648", "\t", "<sample:3>", "<sample:6>"}, {"org.apache.commons.math3.dfp.Dfp", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2767", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0000000000000003 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"-32767"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "toDouble", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("-32767. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"1000000001"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getOne", ""}}), new String[][]{{"log10", "", "1"}, {"getZero", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "divide", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:6>"}, false), new String[][]{{"lessThan", "org.apache.commons.math3.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "getRadixDigits", ""}, {"org.apache.commons.math3.dfp.Dfp", "getOne", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"-1073741823"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e4 {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "newInstance", new String[]{"byte", "byte"}, new String[]{"127", "-1"}, false, 1, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "rint", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "unequal", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "strictlyNegative", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp"}, new String[]{"-1", "NaN", "<sample:5>", "<sample:4>", "<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "dfp2string", ""}, {"org.apache.commons.math3.dfp.Dfp", "reciprocal", ""}}), new String[][]{{"lessThan", "org.apache.commons.math3.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"32767"}, false, 1, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "multiply", "org.apache.commons.math3.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math3.dfp.Dfp", "negate", ""}}), new String[][]{{"log10K", "", "1"}, {"newInstance", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "lessThan", new String[]{"org.apache.commons.math3.dfp.Dfp"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math3.dfp.Dfp", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false, isZero=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.dfp.Dfp", "org.apache.commons.math3.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false, isZero=true}", SearchInputFactory_scaffolding.receiverState());
 }
}
