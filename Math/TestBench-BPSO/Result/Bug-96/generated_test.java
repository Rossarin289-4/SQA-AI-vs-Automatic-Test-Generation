package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.5707963267948966, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:7>"}}), new String[][]{{"cosh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}}), new String[][]{{"abs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "7"}, {"sinh", "", "5"}, {"sqrt1z", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}), new String[][]{{"negate", "", "4"}, {"conjugate", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<i:-2147483648>"}}), new String[][]{{"tan", "", "3"}, {"sinh", "", "5"}, {"abs", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.6653345369377348E-16", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:12>"}, false, 0, null, 1), new String[][]{{"sin", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:7>"}}), new String[][]{{"pow", "org.apache.commons.math.complex.Complex", "2"}, {"getReal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"tan", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}, 3), new String[][]{{"atan", "", "3"}, {"abs", "", "0"}, {"sqrt", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "NaN", "0.10700000000000001"}}, 1), new String[][]{{"acos", "", "5"}, {"divide", "org.apache.commons.math.complex.Complex", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:16>"}}), new String[][]{{"isInfinite", "", "0"}, {"negate", "", "6"}, {"getImaginary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:16>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}, {"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:9>"}}, 2), new String[][]{{"asin", "", "1"}, {"atan", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "cos", ""}}, 2), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "7"}, {"sin", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"cos", "", "4"}, {"tanh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1449132032", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}}, 1), new String[][]{{"sinh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-2.3012989023072947, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"1.0", "0.9999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.9999999999999998, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 0, null, 2), new String[][]{{"conjugate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:7>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1112539136", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}}, 1), new String[][]{{"exp", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-4.505223801027239E-17, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:0>"}}, 3), new String[][]{{"cosh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.5707963267948966, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}}, 1), new String[][]{{"getReal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:7>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"cosh", "", "3"}, {"getReal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5960680219775756", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"abs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"sqrt1z", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=3.141592653589793, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"cos", "", "6"}, {"acos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=3.1415926535897922, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "cos", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1772093440", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}, 1), new String[][]{{"sqrt1z", "", "4"}, {"isNaN", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "tan", ""}}, 1), new String[][]{{"atan", "", "1"}, {"sinh", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.8686709614860095, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 2), new String[][]{{"sinh", "", "6"}, {"tanh", "", "2"}, {"tan", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.5574077240171549, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "cosh", ""}}, 1), new String[][]{{"tan", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:3>"}}, 3), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "3"}, {"conjugate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"isInfinite", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}, {"org.apache.commons.math.complex.Complex", "isInfinite", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 3), new String[][]{{"sqrt", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.886226925452758, getReal=0.8862269254527579, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}}, 1), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("414187520", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:3>"}, {"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:1>"}}, 1), new String[][]{{"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}}, 1), new String[][]{{"tanh", "", "5"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 1), new String[][]{{"sqrt1z", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.1752011936438014, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<d:1.5>"}}, 1), new String[][]{{"atan", "", "3"}, {"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:3>"}}, 1), new String[][]{{"exp", "", "0"}, {"isNaN", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1112539136", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"0.5", "NaN"}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=0.5, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}, 3), new String[][]{{"asin", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"NaN", "NaN"}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}}, 1), new String[][]{{"cos", "", "5"}, {"sqrt1z", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:11>"}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 3), new String[][]{{"sinh", "", "3"}, {"divide", "org.apache.commons.math.complex.Complex", "2"}, {"add", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}, {"org.apache.commons.math.complex.Complex", "asin", ""}}, 2), new String[][]{{"acos", "", "2"}, {"getReal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:9>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}, 1), new String[][]{{"cosh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-2.400000000000001", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "log", ""}}, 1), new String[][]{{"exp", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=4.5013838278937604E-4, getReal=-0.09071683649938612, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:4>"}}, 3), new String[][]{{"sinh", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.9999103740052037, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=-2.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:1>"}, {"org.apache.commons.math.complex.Complex", "tanh", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 0, null, 2), new String[][]{{"cosh", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.9888977057628651, getReal=0.8337300251311491, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}, {"org.apache.commons.math.complex.Complex", "isNaN", ""}}, 1), new String[][]{{"getReal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.557407724654902", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"sqrt", "", "2"}, {"pow", "org.apache.commons.math.complex.Complex", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "1.7976931348623157E308", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"abs", "", "3"}, {"subtract", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}, 1), new String[][]{{"tan", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:10>"}}, 3), new String[][]{{"acos", "", "3"}, {"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.1940688187363215", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<b:true>"}}, 3), new String[][]{{"asin", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.complex.Complex", "sin", ""}}, 1), new String[][]{{"sqrt1z", "", "2"}, {"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.364586343592294, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.557407724654902, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:12>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 1), new String[][]{{"isInfinite", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.4142135623730951, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.1752011936438014, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "0.0", "1.0"}}), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}}), new String[][]{{"getReal", "", "4"}, {"cos", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1112539136", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"exp", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.8414709848078965, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.761594155955765, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("414187520", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.8813735870195428, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1449132032", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=2.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=3.141592653589793, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:6>"}}), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-0.761594155955765, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false), new String[][]{{"isNaN", "", "3"}, {"atan", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false), new String[][]{{"abs", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.4142135623730951", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}}), new String[][]{{"asin", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=0.376727508058575, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false), new String[][]{{"cosh", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=2.5091784786580567, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:9>"}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "3"}, {"tanh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-6530173849413811929", "-6.5301738494138112E18"}, false), new String[][]{{"cos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-37>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false), new String[][]{{"isNaN", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"cos", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}}), new String[][]{{"tanh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.2246467991473532E-16, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}}), new String[][]{{"sinh", "", "2"}, {"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=2.2204460492503126E-16, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:10>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=-2.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:4>"}}), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "3"}, {"getReal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:a>"}}), new String[][]{{"sinh", "", "2"}, {"sqrt", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"pow", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-Infinity", "-6530173849413811929"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-6.5301738494138122E18, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<null>"}}), new String[][]{{"abs", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"2.0", "-0.0"}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false), new String[][]{{"pow", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}}), new String[][]{{"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}), new String[][]{{"sqrt1z", "", "0"}, {"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "getImaginary", ""}}), new String[][]{{"cos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=11.591953275521519, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}), new String[][]{{"log", "", "0"}, {"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "0"}, {"getReal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.5707963267948966, getReal=-0.8813735870195429, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}, {"org.apache.commons.math.complex.Complex", "tan", ""}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"Infinity", "1.7976931348623157E308"}, false, 2, new String[][]{}), new String[][]{{"sqrt", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:8>"}}), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:2>"}, {"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}}), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "log", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.5707963267948966, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}}), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}}), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=4.141592653589793, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
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
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1772093440", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=-0.5707963267948966, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:9>"}, false), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"tanh", "", "6"}, {"getReal", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false), new String[][]{{"pow", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=23.140692632779267, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "log", ""}}), new String[][]{{"atan", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:0>"}, {"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "-1.7976931348623157E308", "-1.005"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=0.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "hashCode", ""}}), new String[][]{{"abs", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:10>"}}), new String[][]{{"sqrt", "", "3"}, {"asin", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"cos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}}), new String[][]{{"asin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.0, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "isInfinite", ""}}), new String[][]{{"atan", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"acos", "", "1"}, {"conjugate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "exp", ""}}), new String[][]{{"cos", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:6>"}}), new String[][]{{"getImaginary", "", "3"}, {"isNaN", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"sinh", "", "6"}, {"acos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.5836293809324177, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false), new String[][]{{"isNaN", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false), new String[][]{{"sqrt1z", "", "3"}, {"add", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"getReal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "negate", ""}}), new String[][]{{"cos", "", "4"}, {"atan", "", "6"}, {"conjugate", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=0.013387402316584167, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-1.0000000000000002", "4.9E-324"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}}), new String[][]{{"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-23.0", "5.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:5>"}}), new String[][]{{"abs", "", "1"}, {"getImaginary", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("5.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"0.0", "NaN"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}, {"org.apache.commons.math.complex.Complex", "exp", ""}}), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:9>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"sin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"conjugate", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-3.141592653589793, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:5>"}}), new String[][]{{"pow", "org.apache.commons.math.complex.Complex", "7"}, {"getReal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:3>"}}), new String[][]{{"atan", "", "6"}, {"divide", "org.apache.commons.math.complex.Complex", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-1.7976931348623155E308", "-6530173849413811929"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}}), new String[][]{{"log", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-3.141592653589793, getReal=709.782712893384, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"cos", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"sqrt", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"getReal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}), new String[][]{{"isInfinite", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"isNaN", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"getReal", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false), new String[][]{{"cos", "", "0"}, {"add", "org.apache.commons.math.complex.Complex", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:9>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"atan", "", "6"}, {"isNaN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}, {"org.apache.commons.math.complex.Complex", "cos", ""}}), new String[][]{{"getImaginary", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false), new String[][]{{"getReal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false), new String[][]{{"isInfinite", "", "3"}, {"getReal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7853981633974483", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "Infinity", "NaN"}}), new String[][]{{"asin", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}}), new String[][]{{"tan", "", "3"}, {"cosh", "", "6"}, {"isNaN", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}}), new String[][]{{"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<b:true>"}}), new String[][]{{"asin", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"asin", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-0.9033391107665127, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"isInfinite", "", "0"}, {"getImaginary", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:1>"}, {"org.apache.commons.math.complex.Complex", "sin", ""}}), new String[][]{{"tanh", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:>"}}), new String[][]{{"abs", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7853981633974483", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}}), new String[][]{{"cos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "isInfinite", ""}}), new String[][]{{"isInfinite", "", "3"}, {"asin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0120948455406893, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false), new String[][]{{"asin", "", "3"}, {"acos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.2949737737699818, getReal=2.4988343854877435, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"tanh", "", "2"}, {"add", "org.apache.commons.math.complex.Complex", "7"}, {"sqrt1z", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:5>"}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "-0.0", "-1.0"}}, 3), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false), new String[][]{{"getReal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.557407724654902", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}}, 1), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:12>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}, {"org.apache.commons.math.complex.Complex", "tan", ""}}, 1), new String[][]{{"asin", "", "1"}, {"asin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0232274785475506, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:5>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isInfinite", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 4, new String[][]{}), new String[][]{{"getImaginary", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "1"}, {"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.9999103740052037, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 1), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "hashCode", ""}}, 1), new String[][]{{"sqrt", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "log", ""}, {"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:0>"}}), new String[][]{{"getReal", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5403023058681398", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"conjugate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=-1.557407724654902, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:10>"}, false, 0, null, 3), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:8>"}}), new String[][]{{"acos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-0.0", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:8>"}}, 1), new String[][]{{"acos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.8414709848078965, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=-1.557407724654902, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}}), new String[][]{{"asin", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}, {"org.apache.commons.math.complex.Complex", "hashCode", ""}}, 1), new String[][]{{"atan", "", "2"}, {"abs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7853981633974483", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:12>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}, 2), new String[][]{{"cosh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:0>"}}, 1), new String[][]{{"acos", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=2.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}, 1), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-Infinity, getReal=-3.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "5"}, {"conjugate", "", "1"}, {"cos", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:10>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}}), new String[][]{{"atan", "", "7"}, {"tanh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}), new String[][]{{"cosh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}}), new String[][]{{"getReal", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}, 1), new String[][]{{"conjugate", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}}), new String[][]{{"cos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-0.0, getReal=0.8575532158463934, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}}), new String[][]{{"getImaginary", "", "3"}, {"tan", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "getImaginary", ""}}), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 1), new String[][]{{"getReal", "", "4"}, {"pow", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}, {"org.apache.commons.math.complex.Complex", "tan", ""}}, 1), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "1"}, {"acos", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}}), new String[][]{{"getImaginary", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:12>"}}), new String[][]{{"cos", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:]>"}}, 3), new String[][]{{"exp", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=0.9227673888116062, getReal=0.38535742648327137, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:4>"}, {"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:0>"}}, 1), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false), new String[][]{{"cosh", "", "2"}, {"isNaN", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"conjugate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:7>"}}, 1), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "3"}, {"pow", "org.apache.commons.math.complex.Complex", "5"}, {"getReal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:4>"}}), new String[][]{{"getReal", "", "2"}, {"getImaginary", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}), new String[][]{{"conjugate", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("{getImaginary=-1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
