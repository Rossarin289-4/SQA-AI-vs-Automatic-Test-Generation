package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:8>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dfp2sci", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0e", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:2>"}, false, 3, new String[][]{}), new String[][]{{"add", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"-1006632833"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "hashCode", ""}, {"org.apache.commons.math.dfp.Dfp", "newInstance", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"2147483647"}, false), new String[][]{{"newInstance", "long", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "org.apache.commons.math.dfp.Dfp", "<sample:2>"}, {"org.apache.commons.math.dfp.Dfp", "log10K", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-2147483648", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "long", "2147483687"}, {"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:14>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "unequal", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "unequal", "org.apache.commons.math.dfp.Dfp", "<null>"}, {"org.apache.commons.math.dfp.Dfp", "round", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, -1.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0000000000000001 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"92188684372274-5312"}, false, 0, null, 2), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}, {"org.apache.commons.math.dfp.Dfp", "getOne", ""}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"4.9E-324"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}, {"org.apache.commons.math.dfp.Dfp", "add", "org.apache.commons.math.dfp.Dfp", "<sample:9>"}}, 3), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<sample:6>"}, {"org.apache.commons.math.dfp.Dfp", "log10K", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2147483647", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"1000000001"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "-9.223372036854776E18"}}), new String[][]{{"floor", "", "5"}, {"getField", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=21, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-2023922579", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "1022.95"}, {"org.apache.commons.math.dfp.Dfp", "divide", "int", "32816"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"511"}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "shiftLeft", ""}}, 2), new String[][]{{"log10", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"10T00"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10", "int", "4194308"}}), new String[][]{{"subtract", "org.apache.commons.math.dfp.Dfp", "5"}, {"power10K", "int", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e-4 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "align", new String[]{"int"}, new String[]{"-1"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"."}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "-1"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:14>"}}, 3), new String[][]{{"divide", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"1000524287", "-2147484648", "<sample:11>", "<sample:0>", "<sample:13>"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}, {"org.apache.commons.math.dfp.Dfp", "trunc", "org.apache.commons.math.dfp.DfpField$RoundingMode", "<sample:0>"}}), new String[][]{{"newInstance", "byte,byte", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"541710"}, false), new String[][]{{"toDouble", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 2), new String[][]{{"multiply", "int", "6"}, {"rint", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "int", "2147483647"}}, 1), new String[][]{{"intValue", "", "4"}, {"sqrt", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"-1073741809"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "unequal", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}}), new String[][]{{"negate", "", "2"}, {"multiply", "org.apache.commons.math.dfp.Dfp", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"1L"}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "negate", ""}, {"org.apache.commons.math.dfp.Dfp", "trunc", "org.apache.commons.math.dfp.DfpField$RoundingMode", "<sample:7>"}}, 3), new String[][]{{"remainder", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"1000000479", "E", "<sample:3>", "<sample:15>"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toDouble", ""}}), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:12>"}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "complement", "int", "-8188"}}), new String[][]{{"multiply", "org.apache.commons.math.dfp.Dfp", "6"}, {"log10K", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"32771"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "-32767"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e131084 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0000000000000003 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:15>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "lessThan", "org.apache.commons.math.dfp.Dfp", "<sample:15>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"163839.81499999997"}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "classify", ""}, {"org.apache.commons.math.dfp.Dfp", "floor", ""}}), new String[][]{{"floor", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("163839. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"-0.N0"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "subtract", "org.apache.commons.math.dfp.Dfp", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dfp2string", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getTwo", ""}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "1023"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "sqrt", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "complement", "int", "1073741823"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.9999999999946313 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.999999999990)-), {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"92188684372274-5312"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "2.1474836470000002E9"}, {"org.apache.commons.math.dfp.Dfp", "multiply", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}, 3), new String[][]{{"remainder", "org.apache.commons.math.dfp.Dfp", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"2147483647"}, false, 4, new String[][]{}), new String[][]{{"ceil", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2147483648. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:1>", "<sample:8>"}, true), new String[][]{{"remainder", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:15>"}, false), new String[][]{{"sqrt", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"greaterThanE-1.5"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "sqrt", ""}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "3"}}), new String[][]{{"remainder", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1022.51"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "byte,byte", "63", "44"}, {"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}}, 1), new String[][]{{"intValue", "", "7"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2.147483647E9"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<null>"}}), new String[][]{{"floor", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-2147483648. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "shiftLeft", ""}}), new String[][]{{"toSplitDouble", "", "5"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 3), new String[][]{{"floor", "", "4"}, {"intValue", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"1073751824"}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "17422"}}, 1), new String[][]{{"toSplitDouble", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[1.073751808E9, 15.9996]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"-1.5"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "classify", ""}}), new String[][]{{"rint", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-6.6000000000000005"}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "negate", ""}, {"org.apache.commons.math.dfp.Dfp", "multiply", "int", "1073741863"}}), new String[][]{{"ceil", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-6. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "shiftRight", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<sample:16>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 4, new String[][]{}), new String[][]{{"toDouble", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"NaN"}, false), new String[][]{{"classify", "", "6"}, {"classify", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"-8388639"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getOne", ""}}), new String[][]{{"sqrt", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "hashCode", ""}, {"org.apache.commons.math.dfp.Dfp", "intValue", ""}}), new String[][]{{"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"32758"}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toString", ""}}), new String[][]{{"toSplitDouble", "", "7"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[Infinity, -Infinity]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"0.49999999999999994"}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "dfp2string", ""}}, 3), new String[][]{{"intValue", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"4503599627370433"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "-1073741831"}}), new String[][]{{"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("67108863.99999953 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"-1051"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "268435457", "01w0", "<sample:3>", "<sample:2>", "<sample:3>"}}, 2), new String[][]{{"toSplitDouble", "", "1"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"-Infinity"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "subtract", "org.apache.commons.math.dfp.Dfp", "<sample:13>"}}), new String[][]{{"add", "org.apache.commons.math.dfp.Dfp", "7"}, {"ceil", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"499999992"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "1999999882"}, {"org.apache.commons.math.dfp.Dfp", "intValue", ""}}), new String[][]{{"sqrt", "", "7"}, {"subtract", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "byte", "50"}}, 1), new String[][]{{"add", "org.apache.commons.math.dfp.Dfp", "5"}, {"add", "org.apache.commons.math.dfp.Dfp", "4"}, {"unequal", "org.apache.commons.math.dfp.Dfp", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10", "int", "2"}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "-2147483648"}}), new String[][]{{"toSplitDouble", "", "3"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.9999998807907104, 1.1918802509999275E-7]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.999999999979,),( {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"32775"}, false), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "0"}, {"sqrt", "", "4"}, {"newInstance", "long", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "65636", "0xFFFFFFF-1", "<sample:13>", "<sample:13>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "byte,byte", "-63", "62"}}), new String[][]{{"nextAfter", "org.apache.commons.math.dfp.Dfp", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"32768"}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "0"}}), new String[][]{{"greaterThan", "org.apache.commons.math.dfp.Dfp", "0"}, {"remainder", "org.apache.commons.math.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.0E-323"}, false, 6, new String[][]{}), new String[][]{{"toSplitDouble", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 1.0E-323]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"0.064"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "isInfinite", ""}, {"org.apache.commons.math.dfp.Dfp", "power10", "int", "49144"}}), new String[][]{{"sqrt", "", "4"}, {"subtract", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.2529822128134704 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:3>", "<sample:7>"}, true, 0, null, 1), new String[][]{{"sqrt", "", "7"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[NaN, NaN]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:14>"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "2147483647"}, {"org.apache.commons.math.dfp.Dfp", "power10K", "int", "-2147483648"}}), new String[][]{{"ceil", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"2"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<sample:10>"}}), new String[][]{{"divide", "int", "6"}, {"sqrt", "", "0"}, {"log10K", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"rint", "", "6"}, {"toSplitDouble", "", "4"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[2.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "org.apache.commons.math.dfp.Dfp", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "divide", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "lessThan", "org.apache.commons.math.dfp.Dfp", "<sample:2>"}}, 1), new String[][]{{"log10K", "", "6"}, {"classify", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"995805695", "<null>", "<sample:1>", "<sample:0>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"4194308"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "divide", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "classify", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1"}, false, 6, new String[][]{}, 3), new String[][]{{"newInstance", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "round", "int", "-491512"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "ceil", ""}}, 3);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "isInfinite", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getRadixDigits", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "org.apache.commons.math.dfp.Dfp", "<sample:9>"}}, 3), new String[][]{{"getLn2", "", "6"}, {"newInstance", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("3. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "hashCode", ""}, {"org.apache.commons.math.dfp.Dfp", "subtract", "org.apache.commons.math.dfp.Dfp", "<sample:0>"}}, 2), new String[][]{{"unequal", "org.apache.commons.math.dfp.Dfp", "0"}, {"newInstance", "java.lang.String", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:11>"}}, 1);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "isInfinite", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trunc", "org.apache.commons.math.dfp.DfpField$RoundingMode", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"1000000028"}, false, 3, new String[][]{}, 2), new String[][]{{"add", "org.apache.commons.math.dfp.Dfp", "5"}, {"newInstance", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"ne xtAftdr"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toString", ""}, {"org.apache.commons.math.dfp.Dfp", "getZero", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"2147483647", "PT0H", "<sample:10>", "<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getRadixDigits", ""}}, 2), new String[][]{{"power10", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<null>", "<sample:5>"}, true, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "power10", "int", "9999"}}, 3), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "log10", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "byte,byte", "86", "4"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "long", "32742"}, {"org.apache.commons.math.dfp.Dfp", "dfp2string", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "byte,byte", "-51", "-128"}}, 2), new String[][]{{"floor", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "unequal", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "long", "-4611686018427387903"}, {"org.apache.commons.math.dfp.Dfp", "round", "int", "4227068"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "shiftLeft", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"9991"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "1000001071", "0", "<sample:2>", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "align", new String[]{"int"}, new String[]{"-1064"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"2147483647", "http://examole.com/a?b=c", "<sample:9>", "<sample:6>", "<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "hashCode", ""}, {"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getZero", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:8>", "<sample:10>"}, true, 0, null, 3), new String[][]{{"multiply", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "round", "int", "511"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1449618", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "divide", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "byte", "127"}}, 2), new String[][]{{"divide", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "classify", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "dfp2sci", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getZero", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"greaterThan", "org.apache.commons.math.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "30713"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "isNaN", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getRadixDigits", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "align", new String[]{"int"}, new String[]{"2147483624"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:10>"}, {"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math.dfp.Dfp", "getField", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"32823"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000000e32823 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "dfp2sci", ""}, {"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("923794", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:3>", "<sample:4>"}, true, 0, null, 3), new String[][]{{"divide", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "unequal", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dfp2sci", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.0e0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trunc", new String[]{"org.apache.commons.math.dfp.DfpField$RoundingMode"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-9.2233720368547763E17"}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "ceil", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-9.2233720368550e17 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dfp2sci", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "lessThan", "org.apache.commons.math.dfp.Dfp", "<sample:9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.0e0", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"0", "PT1", "<sample:17>", "<sample:17>"}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "4210683", "4503599626370495", "<sample:11>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dfp2string", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10K", "int", "-7"}, {"org.apache.commons.math.dfp.Dfp", "log10K", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:4>", "<sample:2>"}, true, 0, null, 2), new String[][]{{"power10K", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e16 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getTwo", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "classify", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"-55"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "int", "-13"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "byte", "-27"}}, 2), new String[][]{{"intValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-55", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "unequal", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "negate", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"2000000094"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-94", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "unequal", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:2>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "intValue", ""}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "4.9E-324"}}, 3), new String[][]{{"multiply", "int", "5"}, {"classify", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "shiftLeft", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "round", "int", "1006632965"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getRadixDigits", "", "5"}, {"nextAfter", "org.apache.commons.math.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.999999999999 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"2305843010213693951"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<d:1.484>"}, {"org.apache.commons.math.dfp.Dfp", "log10K", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.ArrayIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "align", new String[]{"int"}, new String[]{"32752"}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"4503599c627370796"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "shiftLeft", ""}, {"org.apache.commons.math.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "-1954", ".", "<sample:13>", "<sample:1>", "<sample:4>"}}, 2), new String[][]{{"getOne", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "isInfinite", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"12:0:45"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "org.apache.commons.math.dfp.Dfp", "<sample:14>"}}, 2), new String[][]{{"divide", "org.apache.commons.math.dfp.Dfp", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"32703"}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "byte,byte", "-5", "22"}, {"org.apache.commons.math.dfp.Dfp", "add", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "classify", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<sample:11>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "shiftLeft", ""}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "499999992"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-5", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0000999999999996'''' {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getField", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"-32760"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e-32760 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte", "byte"}, new String[]{"127", "-127"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"1073741823"}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "ceil", ""}, {"org.apache.commons.math.dfp.Dfp", "divide", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1073741823. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "unequal", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getRadixDigits", ""}}), new String[][]{{"add", "org.apache.commons.math.dfp.Dfp", "2"}, {"getZero", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dfp2string", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "divide", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "isInfinite", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "log10", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "32767.999999999996"}, {"org.apache.commons.math.dfp.Dfp", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "divide", new String[]{"int"}, new String[]{"1038"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "classify", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "rint", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "shiftLeft", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"1999999998"}, false), new String[][]{{"getOne", "", "7"}, {"getField", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "32767.962999999996"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dfp2string", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "classify", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"1000000012"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e-294967248 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"32789"}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "log10", ""}}), new String[][]{{"divide", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "round", new String[]{"int"}, new String[]{"12"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"9.223372036854776E18"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "round", "int", "17422"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("9.22337203685504e18 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"-56"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-56. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"32769", "<a>b</a>", "<sample:7>", "<sample:6>", "<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"-2147483648", "0x123456789", "<sample:0>", "<sample:10>", "<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "1049092", "2020-02,30T25:61:61", "<sample:10>", "<sample:7>"}}), new String[][]{{"getRadixDigits", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"1024", "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa", "<sample:0>", "<sample:7>"}, false), new String[][]{{"ceil", "", "0"}, {"classify", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "isNaN", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "negate", ""}, {"org.apache.commons.math.dfp.Dfp", "getZero", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "rint", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<null>"}}), new String[][]{{"newInstance", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("3. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "org.apache.commons.math.dfp.Dfp", "<sample:3>"}, {"org.apache.commons.math.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "2147483647", "nextAftFr", "<sample:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getOne", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:11>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e-131088 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "4.9E-324"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"-32760", "Hello, Wiorld", "<sample:12>", "<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}}), new String[][]{{"classify", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "nextAfter", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:2>"}, false), new String[][]{{"divide", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dfp2sci", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trunc", "org.apache.commons.math.dfp.DfpField$RoundingMode", "<sample:5>"}, {"org.apache.commons.math.dfp.Dfp", "align", "int", "-32768"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("-0.0e", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"268468153"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("268468153. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", ""}, {"org.apache.commons.math.dfp.Dfp", "getTwo", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:1>"}, false), new String[][]{{"newInstance", "java.lang.String", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10K", "int", "1000000001"}}), new String[][]{{"newInstance", "byte", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("4. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "add", "org.apache.commons.math.dfp.Dfp", "<sample:6>"}}), new String[][]{{"multiply", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "1000000047"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "shiftRight", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "dfp2string", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:11>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trunc", "org.apache.commons.math.dfp.DfpField$RoundingMode", "<null>"}}), new String[][]{{"multiply", "org.apache.commons.math.dfp.Dfp", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "-1006632961"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "9.007199254740986E15"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"-2.147483647E9"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getRadixDigits", ""}, {"org.apache.commons.math.dfp.Dfp", "lessThan", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-2147483647.0003 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:9>"}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "isNaN", ""}}), new String[][]{{"lessThan", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "align", new String[]{"int"}, new String[]{"20"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.0e0 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:8>"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false), new String[][]{{"negate", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:2>", "<sample:1>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"32760", "null", "<sample:1>", "<sample:13>", "<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<s:>"}}), new String[][]{{"newInstance", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"-1000000001"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "02"}}), new String[][]{{"add", "org.apache.commons.math.dfp.Dfp", "2"}, {"toDouble", "", "1"}, {"negate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10K", new String[]{"int"}, new String[]{"32764"}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "dfp2string", ""}}), new String[][]{{"multiply", "org.apache.commons.math.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "isInfinite", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trunc", new String[]{"org.apache.commons.math.dfp.DfpField$RoundingMode"}, new String[]{"<sample:6>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getRadixDigits", ""}, {"org.apache.commons.math.dfp.Dfp", "getTwo", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("923794", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"12"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("12. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:8>", "<sample:6>"}, true), new String[][]{{"ceil", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "floor", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10K", "int", "65667"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "java.lang.String", "divide"}, {"org.apache.commons.math.dfp.Dfp", "round", "int", "16380"}}), new String[][]{{"ceil", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getZero", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"511", "1.25", "<sample:6>", "<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "power10", "int", "-2147483648"}, {"org.apache.commons.math.dfp.Dfp", "getZero", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "-9"}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "long", "11808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "round", new String[]{"int"}, new String[]{"1000000000"}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getZero", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("16", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "getZero", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "byte,byte", "-120", "127"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-3647", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"-32767"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-32767. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:4>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math.dfp.Dfp", "dotrap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "999999941", "multioly", "<sample:7>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[-Infinity, NaN]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "log10", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "classify", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "unequal", "org.apache.commons.math.dfp.Dfp", "<sample:7>"}}), new String[][]{{"multiply", "org.apache.commons.math.dfp.Dfp", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:9>", "<sample:1>"}, true), new String[][]{{"intValue", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getZero", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "round", "int", "-9"}}), new String[][]{{"newInstance", "long", "3"}, {"greaterThan", "org.apache.commons.math.dfp.Dfp", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"-1024"}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "round", "int", "511"}}), new String[][]{{"multiply", "int", "3"}, {"multiply", "org.apache.commons.math.dfp.Dfp", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "align", new String[]{"int"}, new String[]{"999997951"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "double", "-0.5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "49144"}}), new String[][]{{"newInstance", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"-1000000001", ".", "<sample:1>", "<sample:1>", "<sample:8>"}, false, 7, new String[][]{}), new String[][]{{"multiply", "org.apache.commons.math.dfp.Dfp", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "isInfinite", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "negate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "byte,byte", "127", "-128"}}), new String[][]{{"newInstance", "byte", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"log10", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "499999999", "22", "<sample:0>", "<sample:10>", "<sample:0>"}, {"org.apache.commons.math.dfp.Dfp", "complement", "int", "-2"}}), new String[][]{{"getOne", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "org.apache.commons.math.dfp.Dfp", "<sample:9>"}, {"org.apache.commons.math.dfp.Dfp", "lessThan", "org.apache.commons.math.dfp.Dfp", "<sample:3>"}}), new String[][]{{"log10", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}), new String[][]{{"toSplitDouble", "", "2"}});
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "unequal", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:11>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "classify", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "complement", "int", "1000000012"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"ul"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "trap", "int,java.lang.String,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp,org.apache.commons.math.dfp.Dfp", "-2147483647", "i0x1Fnull", "<sample:9>", "<sample:3>", "<sample:3>"}, {"org.apache.commons.math.dfp.Dfp", "log10K", ""}}), new String[][]{{"negate", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"newInstance", "double", "7"}, {"power10", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1000. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"4"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("9996", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:6>", "<sample:10>"}, true), new String[][]{{"newInstance", "byte,byte", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dotrap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"16", "-y.5123456789012345678901234567890", "<sample:5>", "<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "2147483610"}, {"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}}), new String[][]{{"newInstance", "java.lang.String", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.StringIndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "long", "-2147483632"}}), new String[][]{{"getRadixDigits", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"PT1"}, false), new String[][]{{"classify", "", "6"}, {"log10", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "power10", new String[]{"int"}, new String[]{"999999945"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "byte,byte", "-2", "44"}, {"org.apache.commons.math.dfp.Dfp", "log10K", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "sqrt", ""}}), new String[][]{{"getField", "", "3"}, {"getE", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2.718281828459 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "intValue", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "4"}, {"org.apache.commons.math.dfp.Dfp", "round", "int", "512"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "align", "int", "9991"}}), new String[][]{{"divide", "int", "7"}, {"power10K", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1.000000000000e16 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:0>"}, false, 7, new String[][]{}), new String[][]{{"getField", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.DfpField", actual.getClass().getName());
  assertEquals("{getESplit=[2.7182, 0.00008182845904523536], getIEEEFlags=16, getLn2Split=[0.69314718, 5.59945309417232e-10], getLn5Split=[1.6094, 0.0000379124341003746], getPiSplit=[3.1415, 0.00009265358979323846], ...#296#-1697967277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"32768"}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toDouble", ""}}), new String[][]{{"lessThan", "org.apache.commons.math.dfp.Dfp", "2"}, {"newInstance", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "hashCode", ""}}), new String[][]{{"multiply", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("6. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"-2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"4194308"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4308", String.valueOf(actual));
  assertEquals("receiver state after the call", "0.9999999999999581 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getField", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.dfp.Dfp", "shiftLeft", ""}, {"org.apache.commons.math.dfp.Dfp", "newInstance", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getRadixDigits", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("4", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "lessThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "floor", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:7>", "<sample:8>"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toDouble", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "intValue", ""}, {"org.apache.commons.math.dfp.Dfp", "log10K", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "dfp2sci", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("0.0e0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "complement", new String[]{"int"}, new String[]{"1000000047"}, false, 3, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getOne", ""}, {"org.apache.commons.math.dfp.Dfp", "round", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-47", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "intValue", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "getTwo", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getRadixDigits", ""}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "int", "-32796"}}), new String[][]{{"greaterThan", "org.apache.commons.math.dfp.Dfp", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "multiply", new String[]{"int"}, new String[]{"-1073741824"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "toSplitDouble", ""}, {"org.apache.commons.math.dfp.Dfp", "newInstance", "byte,byte", "127", "31"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "add", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "remainder", "org.apache.commons.math.dfp.Dfp", "<sample:8>"}, {"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<null>"}}), new String[][]{{"multiply", "org.apache.commons.math.dfp.Dfp", "2"}, {"log10", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "copysign", new String[]{"org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:8>", "<null>"}, true); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trunc", new String[]{"org.apache.commons.math.dfp.DfpField$RoundingMode"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.dfp.Dfp", "multiply", "int", "999999945"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "equals", "java.lang.Object", "<s:I>"}, {"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "subtract", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "log10", ""}}), new String[][]{{"log10K", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "toSplitDouble", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("[D", actual.getClass().getName());
  assertEquals("[0.0, 0.0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "shiftLeft", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "floor", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "classify", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("8", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "remainder", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:7>"}, false, 6, new String[][]{{"org.apache.commons.math.dfp.Dfp", "ceil", ""}, {"org.apache.commons.math.dfp.Dfp", "add", "org.apache.commons.math.dfp.Dfp", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"3.51"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("3.51 {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "ceil", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "getTwo", ""}}), new String[][]{{"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{}, new String[]{}, false), new String[][]{{"negate", "", "1"}, {"newInstance", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("-1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "rint", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "byte", "-63"}}), new String[][]{{"greaterThan", "org.apache.commons.math.dfp.Dfp", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "log10K", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"1.0"}, false), new String[][]{{"log10", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getTwo", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("2. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"java.lang.String"}, new String[]{"PT1Idivide"}, false, 2, new String[][]{}), new String[][]{{"getOne", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("1. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "-Infinity {getRadixDigits=4, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "trap", new String[]{"int", "java.lang.String", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp"}, new String[]{"-2147483648", "[1,2]", "<sample:17>", "<sample:11>", "<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "negate", ""}}), new String[][]{{"log10", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "greaterThan", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "nextAfter", "org.apache.commons.math.dfp.Dfp", "<sample:11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"long"}, new String[]{"-26"}, false, 5, new String[][]{}), new String[][]{{"classify", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"byte"}, new String[]{"-88"}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "classify", ""}, {"org.apache.commons.math.dfp.Dfp", "greaterThan", "org.apache.commons.math.dfp.Dfp", "<null>"}}), new String[][]{{"getOne", "", "5"}, {"isNaN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.dfp.Dfp", "newInstance", "byte,byte", "127", "50"}, {"org.apache.commons.math.dfp.Dfp", "unequal", "org.apache.commons.math.dfp.Dfp", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "divide", new String[]{"org.apache.commons.math.dfp.Dfp"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "rint", ""}}), new String[][]{{"newInstance", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("0. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.dfp.Dfp", "org.apache.commons.math.dfp.Dfp", "newInstance", new String[]{"double"}, new String[]{"32767.999999999996"}, false, 7, new String[][]{{"org.apache.commons.math.dfp.Dfp", "divide", "org.apache.commons.math.dfp.Dfp", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.dfp.Dfp", actual.getClass().getName());
  assertEquals("32768. {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "NaN {getRadixDigits=4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
