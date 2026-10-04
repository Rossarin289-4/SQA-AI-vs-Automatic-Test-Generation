package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:12>"}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "sin", ""}}, 2), new String[][]{{"reciprocal", "", "3"}, {"getReal", "", "5"}, {"subtract", "double", "7"}, {"sqrt", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7071067811865476, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.7071067811865476, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "pow", "double", "-2.96"}}, 3), new String[][]{{"atan", "", "1"}, {"cosh", "", "1"}, {"conjugate", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "NaN"}}, 3), new String[][]{{"sqrt", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}, {"org.apache.commons.math.complex.Complex", "isNaN", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}), new String[][]{{"sqrt", "", "2"}, {"divide", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:2>"}}), new String[][]{{"pow", "org.apache.commons.math.complex.Complex", "3"}, {"pow", "org.apache.commons.math.complex.Complex", "0"}, {"atan", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"negate", "", "7"}, {"isNaN", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"NaN"}, true), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"-10"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "double", "NaN"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}, 2), new String[][]{{"atan", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "94"}}, 2), new String[][]{{"tanh", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "double", "0.0"}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"NaN"}, false, 15, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "-2080"}, {"org.apache.commons.math.complex.Complex", "asin", ""}, {"org.apache.commons.math.complex.Complex", "hashCode", ""}}, 1), new String[][]{{"sinh", "", "3"}, {"pow", "org.apache.commons.math.complex.Complex", "6"}, {"asin", "", "7"}, {"add", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:5>"}, {"org.apache.commons.math.complex.Complex", "divide", "double", "-Infinity"}, {"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"reciprocal", "", "6"}, {"pow", "org.apache.commons.math.complex.Complex", "6"}, {"nthRoot", "int", "3"}, {"retainAll", "java.util.Collection", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"int"}, new String[]{"-536870958"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "tan", ""}}), new String[][]{{"tanh", "", "4"}, {"sin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, 3048.78120001719) {getArgument=1.5707963267948966, getImaginary=3048.78120001719, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.7976931348623157E308, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.7976931348623157E308, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"NaN", "-Infinity"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"-5.92"}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}}), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "6"}, {"reciprocal", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 3), new String[][]{{"sin", "", "3"}, {"divide", "double", "1"}, {"abs", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "nthRoot", "int", "2147483647"}}, 2), new String[][]{{"tan", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "nthRoot", "int", "-32"}}, 1), new String[][]{{"add", "double", "2"}, {"reciprocal", "", "0"}, {"divide", "org.apache.commons.math.complex.Complex", "2"}, {"nthRoot", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(0.0, 0.0), (0.0, 0.0), (-0.0, 0.0), (-0.0, -0.0)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"-8.988465674311578E307", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "reciprocal", new String[]{}, new String[]{}, false, 16, new String[][]{}, 2), new String[][]{{"subtract", "double", "3"}, {"sqrt1z", "", "4"}, {"sinh", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "3"}}, 3), new String[][]{{"isInfinite", "", "2"}, {"subtract", "org.apache.commons.math.complex.Complex", "6"}, {"conjugate", "", "0"}, {"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:b>"}, {"org.apache.commons.math.complex.Complex", "exp", ""}}, 2), new String[][]{{"conjugate", "", "6"}, {"reciprocal", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2), new String[][]{{"acos", "", "0"}, {"pow", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"2.0"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2), new String[][]{{"acos", "", "0"}, {"pow", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}}, 1), new String[][]{{"isNaN", "", "2"}, {"multiply", "double", "0"}, {"divide", "org.apache.commons.math.complex.Complex", "1"}, {"multiply", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "int", "10"}, {"org.apache.commons.math.complex.Complex", "acos", ""}}, 1), new String[][]{{"isNaN", "", "2"}, {"multiply", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:1>"}, {"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "conjugate", ""}}, 3), new String[][]{{"asin", "", "5"}, {"pow", "double", "3"}, {"cos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "-6195664516687396620"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.5707963267948966) {getArgument=1.5707963267948966, getImaginary=1.5707963267948966, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<null>"}, {"org.apache.commons.math.complex.Complex", "divide", "double", "-6195664516687396620"}}, 3), new String[][]{{"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 0, null, 3), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-2.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 0, null, 3), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 0, null, 3), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "reciprocal", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 1), new String[][]{{"cosh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 1), new String[][]{{"cosh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, NaN) {getArgument=NaN, getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 1), new String[][]{{"asin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 1), new String[][]{{"asin", "", "7"}, {"multiply", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 1), new String[][]{{"asin", "", "7"}, {"multiply", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.5707963267948966, 1.3169578969248164) {getArgument=2.4438708110971454, getImaginary=1.3169578969248164, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 1), new String[][]{{"asin", "", "7"}, {"multiply", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 1), new String[][]{{"asin", "", "7"}, {"multiply", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:14>"}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 1), new String[][]{{"asin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 1), new String[][]{{"asin", "", "7"}, {"acos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 1), new String[][]{{"asin", "", "7"}, {"acos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 1), new String[][]{{"exp", "", "7"}, {"acos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5707963267948966, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 1), new String[][]{{"exp", "", "7"}, {"acos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 1), new String[][]{{"exp", "", "7"}, {"acos", "", "2"}, {"getArgument", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.1752011936438014, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.1752011936438014, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.1752011936438014, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.1752011936438014, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.8414709848078965) {getArgument=1.5707963267948966, getImaginary=0.8414709848078965, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.1752011936438014, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.1752011936438014, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, NaN) {getArgument=NaN, getImaginary=NaN, getReal=-Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 1), new String[][]{{"subtract", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 1), new String[][]{{"subtract", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "1.0"}}, 1), new String[][]{{"subtract", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, -Infinity) {getArgument=NaN, getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "-10.0"}}, 1), new String[][]{{"subtract", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-21"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.220446049250313E-16, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=2.220446049250313E-16, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-21"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-2.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-21"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.7976931348623157E308, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.7976931348623157E308, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-21"}}, 2), new String[][]{{"abs", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.7976931348623157E308", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-21"}}, 2), new String[][]{{"abs", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"Infinity"}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-21"}}, 2), new String[][]{{"abs", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"Infinity"}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-21"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, -Infinity) {getArgument=NaN, getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"Infinity"}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "2147483647"}}, 2), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"-Infinity"}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "2"}}, 2), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "sin", ""}}, 2), new String[][]{{"reciprocal", "", "3"}, {"getReal", "", "5"}, {"subtract", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:14>"}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "sin", ""}}, 2), new String[][]{{"reciprocal", "", "3"}, {"getReal", "", "5"}, {"cos", "", "2"}, {"sqrt", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "sin", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:@>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 3), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 3), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 3), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7853981633974483, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 3), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 3), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7853981633974483, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "-1.0"}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 3), new String[][]{{"atan", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "-1.0"}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 3), new String[][]{{"atan", "", "1"}, {"acos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.4741354375614093, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=2.4741354375614093, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "toString", ""}, {"org.apache.commons.math.complex.Complex", "pow", "double", "-1.48"}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:1>"}}, 3), new String[][]{{"atan", "", "1"}, {"acos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5707963267948966, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.complex.Complex", "toString", ""}, {"org.apache.commons.math.complex.Complex", "pow", "double", "-1.48"}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:1>"}}, 3), new String[][]{{"atan", "", "1"}, {"acos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "-2.96"}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:1>"}}, 3), new String[][]{{"atan", "", "1"}, {"acos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "pow", "double", "-2.96"}}, 3), new String[][]{{"atan", "", "1"}, {"cosh", "", "1"}, {"conjugate", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.3246090892520057, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.3246090892520057, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "pow", "double", "20.0"}, {"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "1.7976931348623157E308", "-20.0"}}, 3), new String[][]{{"atan", "", "1"}, {"cosh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"cosh", "", "1"}, {"multiply", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -1.2246467991473532E-16) {getArgument=-3.141592653589793, getImaginary=-1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 0, null, 3), new String[][]{{"getField", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.123233995736766E-17, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=6.123233995736766E-17, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 3), new String[][]{{"sqrt", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7071067811865476, 0.7071067811865475) {getArgument=0.7853981633974483, getImaginary=0.7071067811865475, getReal=0.7071067811865476, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 3), new String[][]{{"sqrt", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "NaN"}}, 3), new String[][]{{"sqrt", "", "2"}, {"getArgument", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 1, new String[][]{}, 3), new String[][]{{"sqrt", "", "2"}, {"divide", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.36787944117144233, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, 0.8414709848078965) {getArgument=1.0, getImaginary=0.8414709848078965, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.36787944117144233, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, 0.8414709848078965) {getArgument=1.0, getImaginary=0.8414709848078965, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.718281828459045, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=2.718281828459045, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "-1.7976931348623157E308"}}), new String[][]{{"sinh", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, NaN) {getArgument=NaN, getImaginary=NaN, getReal=-Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 3.141592653589793) {getArgument=1.5707963267948966, getImaginary=3.141592653589793, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "-6195664516687396620"}}), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "-6195664516687396620"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.5707963267948966) {getArgument=1.5707963267948966, getImaginary=1.5707963267948966, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "-6195664516687396620"}}), new String[][]{{"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "-6195664516687396620"}}), new String[][]{{"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "-6195664516687396620"}}), new String[][]{{"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<null>"}, {"org.apache.commons.math.complex.Complex", "divide", "double", "-6195664516687396620"}}), new String[][]{{"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-20"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.36787944117144233, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-20"}}), new String[][]{{"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.36787944117144233", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-20"}}), new String[][]{{"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-20"}}), new String[][]{{"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.718281828459045", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-20"}, {"org.apache.commons.math.complex.Complex", "toString", ""}}), new String[][]{{"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-2"}, {"org.apache.commons.math.complex.Complex", "toString", ""}}), new String[][]{{"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "1"}, {"org.apache.commons.math.complex.Complex", "toString", ""}}), new String[][]{{"abs", "", "0"}, {"conjugate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "1"}, {"org.apache.commons.math.complex.Complex", "toString", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}), new String[][]{{"abs", "", "0"}, {"conjugate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.36787944117144233, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "1"}, {"org.apache.commons.math.complex.Complex", "toString", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}), new String[][]{{"abs", "", "0"}, {"conjugate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}, {"org.apache.commons.math.complex.Complex", "tan", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -1.2246467991473532E-16) {getArgument=-3.141592653589793, getImaginary=-1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "1"}, {"org.apache.commons.math.complex.Complex", "toString", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}), new String[][]{{"abs", "", "0"}, {"conjugate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-6195664516687396620"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.6140318722981223E-19, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.6140318722981223E-19, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.8414709848078965, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "1"}, {"org.apache.commons.math.complex.Complex", "toString", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}), new String[][]{{"abs", "", "0"}, {"conjugate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "1"}, {"org.apache.commons.math.complex.Complex", "toString", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}), new String[][]{{"abs", "", "0"}, {"conjugate", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, -0.8414709848078965) {getArgument=-1.0, getImaginary=-0.8414709848078965, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"2.0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-2.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"4.0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-4.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-4.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"4.0"}, false), new String[][]{{"pow", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, NaN) {getArgument=NaN, getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=0.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -Infinity) {getArgument=-1.5707963267948966, getImaginary=-Infinity, getReal=0.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, NaN) {getArgument=NaN, getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7071067811865476, 0.7071067811865475) {getArgument=0.7853981633974483, getImaginary=0.7071067811865475, getReal=0.7071067811865476, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7071067811865476, 0.7071067811865475) {getArgument=0.7853981633974483, getImaginary=0.7071067811865475, getReal=0.7071067811865476, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:6>"}}), new String[][]{{"getArgument", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7853981633974483", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:6>"}}), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -0.29289321881345254) {getArgument=-3.141592653589793, getImaginary=-0.29289321881345254, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:6>"}}), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<null>"}}), new String[][]{{"nthRoot", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<null>"}}), new String[][]{{"getReal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<null>"}}), new String[][]{{"getReal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-2.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<null>"}}), new String[][]{{"getReal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:10>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<null>"}}), new String[][]{{"getReal", "", "0"}, {"sin", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.8414709848078965, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<null>"}}), new String[][]{{"getReal", "", "0"}, {"sin", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.2984575814159773, -0.6349639147847361) {getArgument=-2.6867724202798433, getImaginary=-0.6349639147847361, getReal=-1.2984575814159773, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<null>"}}), new String[][]{{"getReal", "", "0"}, {"sin", "", "6"}, {"cos", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.3250557495338327, -0.6534932345733467) {getArgument=-1.1092208030790807, getImaginary=-0.6534932345733467, getReal=0.3250557495338327, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<null>"}}), new String[][]{{"getReal", "", "0"}, {"sin", "", "6"}, {"cos", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:0>"}}), new String[][]{{"getReal", "", "0"}, {"sin", "", "6"}, {"cos", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 1, new String[][]{}), new String[][]{{"getReal", "", "0"}, {"sin", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=0.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.0"}}), new String[][]{{"log", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 3.141592653589793) {getArgument=0.0, getImaginary=3.141592653589793, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:14>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.0"}}), new String[][]{{"log", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 3.141592653589793) {getArgument=0.0, getImaginary=3.141592653589793, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:13>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.0"}}), new String[][]{{"log", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -0.7853981633974483) {getArgument=-0.0, getImaginary=-0.7853981633974483, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.0"}}), new String[][]{{"log", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.3465735902799727, 2.356194490192345) {getArgument=1.4247531610804738, getImaginary=2.356194490192345, getReal=0.3465735902799727, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-20.0"}}), new String[][]{{"log", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.6931471805599453, 3.141592653589793) {getArgument=1.3536398454434488, getImaginary=3.141592653589793, getReal=0.6931471805599453, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "reciprocal", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "reciprocal", ""}, {"org.apache.commons.math.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 2.0) {getArgument=1.5707963267948966, getImaginary=2.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:4>"}, {"org.apache.commons.math.complex.Complex", "cosh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1112539136", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("414187520", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1034944512", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1449132032", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-38797312", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1772093440", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1772093440", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.7976931348623157E308, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.7976931348623157E308, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}}), new String[][]{{"isNaN", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}}), new String[][]{{"isNaN", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-21"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"-1.0000000000000002"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "-21"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.220446049250313E-16, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=2.220446049250313E-16, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"Infinity"}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "2"}}), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"-Infinity"}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "2"}}), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"-Infinity"}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "2"}}), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "double", "-1.7976931348623157E308"}}), new String[][]{{"reciprocal", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "47"}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "-1.7976931348623157E308"}}), new String[][]{{"reciprocal", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "47"}, {"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:7>"}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "47"}, {"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:7>"}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}), new String[][]{{"reciprocal", "", "3"}, {"getReal", "", "5"}, {"sinh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "47"}, {"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:7>"}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}), new String[][]{{"reciprocal", "", "3"}, {"getReal", "", "5"}, {"sinh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:@>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:@>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:@>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7853981633974483, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, -1.0) {getArgument=-1.5707963267948966, getImaginary=-1.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7853981633974483, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "reciprocal", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "-1.0"}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:1>"}}), new String[][]{{"atan", "", "1"}, {"acos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.4741354375614093, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=2.4741354375614093, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "-1.0"}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:1>"}}), new String[][]{{"atan", "", "1"}, {"acos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "-1.0"}, {"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:1>"}}), new String[][]{{"atan", "", "1"}, {"acos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.6674572160283838, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.6674572160283838, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "-1.0"}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:1>"}}), new String[][]{{"atan", "", "1"}, {"acos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5707963267948966, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "-1.0"}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:1>"}}), new String[][]{{"atan", "", "1"}, {"acos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"cosh", "", "1"}, {"multiply", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"cosh", "", "1"}, {"multiply", "int", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getArgument", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getArgument", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -1.2246467991473532E-16) {getArgument=-3.141592653589793, getImaginary=-1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 1.2246467991473532E-16) {getArgument=3.141592653589793, getImaginary=1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false), new String[][]{{"isInfinite", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false), new String[][]{{"getField", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.123233995736766E-17, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=6.123233995736766E-17, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}), new String[][]{{"add", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.123233995736766E-17, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=6.123233995736766E-17, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "NaN"}, {"org.apache.commons.math.complex.Complex", "cos", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}, {"org.apache.commons.math.complex.Complex", "isNaN", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}), new String[][]{{"sqrt", "", "2"}, {"divide", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7071067811865475, -0.7071067811865476) {getArgument=-2.356194490192345, getImaginary=-0.7071067811865476, getReal=-0.7071067811865475, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}, {"org.apache.commons.math.complex.Complex", "isNaN", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}), new String[][]{{"sqrt", "", "2"}, {"divide", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.45593812776599624) {getArgument=-1.5707963267948966, getImaginary=-0.45593812776599624, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}, {"org.apache.commons.math.complex.Complex", "isNaN", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}), new String[][]{{"sqrt", "", "2"}, {"divide", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"NaN"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}}), new String[][]{{"pow", "double", "6"}, {"multiply", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(3.141592653589793, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5707963267948966, -0.8813735870195429) {getArgument=-0.5113252103366475, getImaginary=-0.8813735870195429, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "getField", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.718281828459045, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=2.718281828459045, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getField", "", "5"}, {"getZero", "", "2"}, {"multiply", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"getField", "", "5"}, {"getZero", "", "2"}, {"multiply", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"getField", "", "5"}, {"getZero", "", "2"}, {"multiply", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 9, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, false, 14, new String[][]{}), new String[][]{{"multiply", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "3.141592653589793"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "3.141592653589793"}}), new String[][]{{"getArgument", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-1.0, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(0.0, 1.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(1.0, Infinity)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-1.0, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:14>"}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}, {"org.apache.commons.math.complex.Complex", "toString", ""}}, 3), new String[][]{{"multiply", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math.complex.Complex", "toString", ""}}, 1), new String[][]{{"multiply", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "add", "double", "8.988465674311579E307"}}), new String[][]{{"multiply", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7853981633974483", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "log", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(5.562684646268003E-309, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=5.562684646268003E-309, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-5.562684646268003E-309, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-5.562684646268003E-309, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-5.562684646268003E-309, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-5.562684646268003E-309, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-Infinity"}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-Infinity"}, false, 2, new String[][]{}, 1), new String[][]{{"isInfinite", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-Infinity"}, false, 2, new String[][]{}, 1), new String[][]{{"sqrt1z", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(1.0, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(0.0, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(0.0, 1.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:5>"}, {"org.apache.commons.math.complex.Complex", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:5>"}, {"org.apache.commons.math.complex.Complex", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:5>"}, {"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:5>"}, {"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:5>"}, {"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "reciprocal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.557407724654902, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.557407724654902, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.7615941559557649) {getArgument=1.5707963267948966, getImaginary=0.7615941559557649, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.557407724654902, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.557407724654902, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getArgument", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getArgument", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getArgument", "", "0"}, {"getImaginary", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2), new String[][]{{"getArgument", "", "0"}, {"getImaginary", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}}), new String[][]{{"getArgument", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "23"}}), new String[][]{{"getArgument", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "23"}}), new String[][]{{"getArgument", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "int", "23"}}, 3), new String[][]{{"getArgument", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
