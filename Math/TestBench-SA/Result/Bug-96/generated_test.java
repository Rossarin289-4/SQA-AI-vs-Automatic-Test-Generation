package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}}), new String[][]{{"exp", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("7", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "isInfinite", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<null>"}}), new String[][]{{"atan", "", "2"}, {"acos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "5"}, {"cos", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}}), new String[][]{{"cosh", "", "0"}, {"tanh", "", "6"}, {"pow", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}}), new String[][]{{"negate", "", "7"}, {"acos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.1066375976528167E-8, getReal=1.1066376096750704E-8, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:3>"}, {"org.apache.commons.math.complex.Complex", "getReal", ""}}, 3), new String[][]{{"negate", "", "0"}, {"tan", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "hashCode", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 3), new String[][]{{"cos", "", "4"}, {"cos", "", "6"}, {"isInfinite", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<null>"}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:7>"}}, 3), new String[][]{{"acos", "", "0"}, {"atan", "", "0"}, {"acos", "", "6"}, {"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 3), new String[][]{{"asin", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:3>"}, {"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:1>"}}, 3), new String[][]{{"tanh", "", "4"}, {"exp", "", "0"}, {"getReal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.637575455050017", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:18>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "log", ""}}), new String[][]{{"cosh", "", "1"}, {"isInfinite", "", "3"}, {"add", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:18>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"conjugate", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.1102230246251568E-16, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 5, new String[][]{}, 3), new String[][]{{"atan", "", "7"}, {"atan", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.04316022883888437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:9>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:9>"}}, 1), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 2), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 2), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 2), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 2), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 2), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}, {"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 2), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}, {"org.apache.commons.math.complex.Complex", "sqrt1z", ""}, {"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.1752011936438014, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 3), new String[][]{{"getImaginary", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1752011936438014", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 3), new String[][]{{"getImaginary", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 3), new String[][]{{"getImaginary", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 3), new String[][]{{"getImaginary", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 3), new String[][]{{"getImaginary", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 3), new String[][]{{"getImaginary", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}, 2), new String[][]{{"getImaginary", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}, 2), new String[][]{{"getImaginary", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1752011936438014", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}, 2), new String[][]{{"getImaginary", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}, 2), new String[][]{{"getImaginary", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}, 2), new String[][]{{"getImaginary", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}, 2), new String[][]{{"conjugate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}, 2), new String[][]{{"conjugate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:10>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}, 2), new String[][]{{"conjugate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}, 2), new String[][]{{"conjugate", "", "1"}, {"multiply", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 15, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}}, 2), new String[][]{{"conjugate", "", "1"}, {"multiply", "org.apache.commons.math.complex.Complex", "3"}, {"atan", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.1752011936438014, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.8414709848078965, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}, 3), new String[][]{{"getReal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 3), new String[][]{{"getReal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}, {"org.apache.commons.math.complex.Complex", "conjugate", ""}}, 3), new String[][]{{"getReal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 25, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:2>"}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:2>"}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "5"}, {"getImaginary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "5"}, {"getImaginary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "5"}, {"getImaginary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}, 1), new String[][]{{"sinh", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=-1.1752011936438014, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}, 1), new String[][]{{"sinh", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.8414709848078965, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-1.0", "-1.7976931348623157E308"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.7976931348623157E308, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}, 2), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.557407724654902, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "sin", ""}}), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.761594155955765, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}}), new String[][]{{"exp", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.690076070875319, getReal=0.7237368419565787, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}}), new String[][]{{"exp", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.04321391826377226, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.04321391826377226, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.1102230246251568E-16, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false), new String[][]{{"cos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.401330692831598E-16, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:9>"}, false, 5, new String[][]{}), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "1.0", "1.0"}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}), new String[][]{{"atan", "", "7"}, {"atan", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:9>"}, false, 5, new String[][]{}), new String[][]{{"atan", "", "7"}, {"atan", "", "6"}, {"getImaginary", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 5, new String[][]{}), new String[][]{{"atan", "", "7"}, {"atan", "", "6"}, {"getImaginary", "", "2"}, {"divide", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:11>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}}), new String[][]{{"atan", "", "7"}, {"atan", "", "6"}, {"getImaginary", "", "2"}, {"divide", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.04316022883888437, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=-0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.8414709848078965, getReal=-0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:8>"}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}, {"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "-6530173849413811929", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-0.761594155955765, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.557407724654902, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 12, new String[][]{}), new String[][]{{"atan", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 14, new String[][]{}), new String[][]{{"conjugate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}), new String[][]{{"isInfinite", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false), new String[][]{{"isNaN", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isNaN", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isNaN", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-1.0", "Infinity"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=-1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.1752011936438014, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:3>"}, {"org.apache.commons.math.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 13, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 16, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "getImaginary", ""}, {"org.apache.commons.math.complex.Complex", "conjugate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"asin", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}}), new String[][]{{"asin", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}}), new String[][]{{"asin", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}}), new String[][]{{"asin", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}}), new String[][]{{"asin", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}}), new String[][]{{"asin", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}}), new String[][]{{"asin", "", "0"}, {"acos", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}}), new String[][]{{"asin", "", "0"}, {"acos", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.0232274785475506, getReal=3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}}), new String[][]{{"asin", "", "0"}, {"acos", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.7949577687638787, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}, {"org.apache.commons.math.complex.Complex", "exp", ""}}), new String[][]{{"asin", "", "2"}, {"acos", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.1752011936438014, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.8414709848078965, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.8813735870195429, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1772093440", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1112539136", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("414187520", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1449132032", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 17, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1772093440", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1772093440", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"cos", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}}), new String[][]{{"conjugate", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}}), new String[][]{{"conjugate", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=-2.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}}), new String[][]{{"conjugate", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}}), new String[][]{{"atan", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"cosh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=2.5091784786580567, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"cosh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.6360918665423811, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"cosh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"cosh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"cosh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 16, new String[][]{}), new String[][]{{"cosh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.7071067811865475, getReal=0.7071067811865476, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=0.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"getImaginary", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"getImaginary", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.math.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=0.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=0.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=2.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:3>"}}), new String[][]{{"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"isNaN", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}), new String[][]{{"atan", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.1102230246251568E-16, getReal=0.49536728921867335, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}), new String[][]{{"atan", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}), new String[][]{{"atan", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}), new String[][]{{"atan", "", "2"}, {"acos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.1102230246251565E-16, getReal=1.0525387348509188, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "isInfinite", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<null>"}}), new String[][]{{"atan", "", "2"}, {"acos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-2.2204460492503128E-16, getReal=0.09179120783964699, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "isInfinite", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<null>"}}), new String[][]{{"atan", "", "2"}, {"acos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "isInfinite", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<null>"}}), new String[][]{{"atan", "", "2"}, {"acos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.4142135623730951, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "log", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "log", ""}}), new String[][]{{"atan", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=3.141592653589793, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-3.141592653589793, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.5707963267948966, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "5"}, {"getImaginary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "5"}, {"getImaginary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.5707963267948966, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.7853981633974483, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-3.141592653589793, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 2), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.5707963267948966, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 2), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"acos", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.226191170883517, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.4142135623730951, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 12, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}}), new String[][]{{"isNaN", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:b>"}}), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=-1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:b>"}}), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "7"}, {"asin", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:b>"}}), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "7"}, {"asin", "", "5"}, {"exp", "", "6"}, {"getReal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:b>"}}), new String[][]{{"isNaN", "", "7"}, {"asin", "", "5"}, {"exp", "", "3"}, {"getReal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.810477380965351", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "exp", ""}}, 1), new String[][]{{"isNaN", "", "7"}, {"asin", "", "5"}, {"exp", "", "3"}, {"getReal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:1>"}, {"org.apache.commons.math.complex.Complex", "exp", ""}}, 1), new String[][]{{"isNaN", "", "7"}, {"asin", "", "5"}, {"exp", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=-1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}, 3), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=-Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=-Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=-1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "5"}, {"cos", "", "0"}, {"isInfinite", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.761594155955765, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.557407724654902, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=0.0, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<sample:0>"}}, 2), new String[][]{{"cosh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=2.4785912770698393, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 15, new String[][]{}), new String[][]{{"getReal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.557407724654902", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
