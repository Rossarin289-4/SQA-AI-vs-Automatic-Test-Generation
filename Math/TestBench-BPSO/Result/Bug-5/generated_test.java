package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"double"}, new String[]{"-Infinity"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "sinh", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"pow", "org.apache.commons.math3.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "atan", ""}, {"org.apache.commons.math3.complex.Complex", "sinh", ""}}), new String[][]{{"sinh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"NaN"}, true), new String[][]{{"multiply", "int", "5"}, {"subtract", "org.apache.commons.math3.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "-20"}, {"org.apache.commons.math3.complex.Complex", "add", "double", "-200.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getArgument", "", "6"}, {"sin", "", "2"}, {"reciprocal", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "double", "-199.979"}, {"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "-8154"}}), new String[][]{{"getField", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"divide", "double", "0"}, {"sinh", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-Infinity"}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "getArgument", ""}, {"org.apache.commons.math3.complex.Complex", "conjugate", ""}}), new String[][]{{"reciprocal", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "hashCode", ""}}), new String[][]{{"atan", "", "7"}, {"acos", "", "0"}, {"sqrt", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"double"}, new String[]{"NaN"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -1.0) {getArgument=-1.5707963267948966, getImaginary=-1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "NaN"}}, 3), new String[][]{{"abs", "", "2"}, {"pow", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"NaN"}, false), new String[][]{{"tan", "", "3"}, {"pow", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "tan", ""}}), new String[][]{{"asin", "", "6"}, {"subtract", "org.apache.commons.math3.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"NaN", "-8.988465674311578E307"}, true), new String[][]{{"nthRoot", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(NaN, NaN)]", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "log", ""}}), new String[][]{{"divide", "double", "7"}, {"conjugate", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "asin", ""}}, 2), new String[][]{{"add", "double", "3"}, {"getField", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}, {"org.apache.commons.math3.complex.Complex", "cos", ""}}), new String[][]{{"sqrt1z", "", "3"}, {"multiply", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cos", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "-100.00000000000001"}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}}), new String[][]{{"negate", "", "3"}, {"divide", "org.apache.commons.math3.complex.Complex", "4"}, {"multiply", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"subtract", "double", "3"}, {"divide", "org.apache.commons.math3.complex.Complex", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"double"}, new String[]{"NaN"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "sinh", ""}, {"org.apache.commons.math3.complex.Complex", "readResolve", ""}}), new String[][]{{"tanh", "", "3"}, {"cos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"NaN", "-2.0"}, false, 6, new String[][]{}, 1), new String[][]{{"negate", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "atan", ""}, {"org.apache.commons.math3.complex.Complex", "pow", "double", "2.250000000000001"}}), new String[][]{{"cosh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "org.apache.commons.math3.complex.Complex", "<sample:4>"}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:5>"}}, 1), new String[][]{{"tanh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<s:>,>"}}, 3), new String[][]{{"tan", "", "2"}, {"log", "", "2"}, {"multiply", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:2>"}}), new String[][]{{"tan", "", "1"}, {"atan", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<sample:0>"}}), new String[][]{{"nthRoot", "int", "6"}, {"ensureCapacity", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(Infinity, Infinity)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "reciprocal", ""}}, 3), new String[][]{{"nthRoot", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(0.5403023058681398, 0.8414709848078965)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "reciprocal", ""}, {"org.apache.commons.math3.complex.Complex", "asin", ""}}, 3), new String[][]{{"conjugate", "", "1"}, {"getImaginary", "", "6"}, {"asin", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "NaN"}, {"org.apache.commons.math3.complex.Complex", "sinh", ""}}, 2), new String[][]{{"asin", "", "1"}, {"divide", "org.apache.commons.math3.complex.Complex", "2"}, {"conjugate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"double"}, new String[]{"-1.9999999999999998"}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "-19.790000000000003"}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}}, 2), new String[][]{{"add", "double", "0"}, {"tan", "", "2"}, {"sinh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "reciprocal", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "acos", ""}}, 3), new String[][]{{"asin", "", "3"}, {"acos", "", "6"}, {"pow", "org.apache.commons.math3.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.6366197723675814, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.6366197723675814, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tan", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "createComplex", "double,double", "-3.9999999999999996", "-0.9999999999999999"}}, 2), new String[][]{{"cosh", "", "2"}, {"divide", "double", "3"}, {"atan", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getField", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"-20.0", "-6.195664516687396E19"}, true, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-20.0, -6.195664516687396E19) {getArgument=-1.5707963267948966, getImaginary=-6.195664516687396E19, getReal=-20.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"NaN"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-Infinity"}, false, 2, new String[][]{}, 2), new String[][]{{"getField", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "isInfinite", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.5707963267948966, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"asin", "", "1"}, {"tanh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<s:>"}}, 3), new String[][]{{"pow", "double", "2"}, {"multiply", "org.apache.commons.math3.complex.Complex", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<null>"}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "20"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 3.141592653589793) {getArgument=1.5707963267948966, getImaginary=3.141592653589793, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, true, 0, null, 2), new String[][]{{"conjugate", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.7976931348623157E308, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.7976931348623157E308, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:32>"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "log", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"tanh", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.9126365759632116, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.9126365759632116, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 1.2246467991473532E-16) {getArgument=3.141592653589793, getImaginary=1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "sinh", ""}, {"org.apache.commons.math3.complex.Complex", "isInfinite", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "abs", ""}, {"org.apache.commons.math3.complex.Complex", "sqrt1z", ""}}, 3), new String[][]{{"getReal", "", "1"}, {"log", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.7853981633974483) {getArgument=0.0, getImaginary=0.7853981633974483, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "log", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "double", "3.1415926535897927"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-6.1956645166873969E18"}, false, 0, null, 3), new String[][]{{"asin", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.6140318722981223E-19, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.6140318722981223E-19, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "sinh", ""}}, 1), new String[][]{{"reciprocal", "", "3"}, {"getReal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "asin", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "negate", ""}, {"org.apache.commons.math3.complex.Complex", "cos", ""}}, 2), new String[][]{{"abs", "", "1"}, {"asin", "", "0"}, {"atan", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.1182850384116252, -0.24090223314512282) {getArgument=-0.2121786540855583, getImaginary=-0.24090223314512282, getReal=1.1182850384116252, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "log", ""}}, 2), new String[][]{{"divide", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"multiply", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-1.2391329033374794E19"}, {"org.apache.commons.math3.complex.Complex", "add", "double", "-83.0"}}, 2), new String[][]{{"atan", "", "7"}, {"asin", "", "6"}, {"subtract", "org.apache.commons.math3.complex.Complex", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7615941559557649, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7615941559557649, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"divide", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "toString", ""}, {"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:4>"}}, 3), new String[][]{{"getReal", "", "2"}, {"multiply", "org.apache.commons.math3.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getField", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "hashCode", ""}}, 3), new String[][]{{"sinh", "", "4"}, {"exp", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"0.5"}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "negate", ""}}, 2), new String[][]{{"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "toString", ""}, {"org.apache.commons.math3.complex.Complex", "add", "double", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "getImaginary", ""}}, 2), new String[][]{{"conjugate", "", "7"}, {"add", "org.apache.commons.math3.complex.Complex", "6"}, {"subtract", "org.apache.commons.math3.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"6.283185307179585"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "1.0"}, {"org.apache.commons.math3.complex.Complex", "reciprocal", ""}}, 3), new String[][]{{"exp", "", "2"}, {"sinh", "", "4"}, {"log", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.04073595551211177, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.04073595551211177, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "16785387"}}, 3), new String[][]{{"log", "", "5"}, {"asin", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5710214580886362, 1.3825217843629671) {getArgument=1.179108837162259, getImaginary=1.3825217843629671, getReal=0.5710214580886362, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "isNaN", ""}, {"org.apache.commons.math3.complex.Complex", "divide", "double", "-Infinity"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"add", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.7615941559557649, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.7615941559557649, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"abs", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "conjugate", ""}, {"org.apache.commons.math3.complex.Complex", "createComplex", "double,double", "-6.1956645166873969E18", "5.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:2>"}, false, 2, new String[][]{}, 1), new String[][]{{"nthRoot", "int", "5"}, {"addAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "conjugate", ""}, {"org.apache.commons.math3.complex.Complex", "pow", "double", "-6.1956645166873958E18"}}, 3), new String[][]{{"add", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-0.09799999999999998", "1.7976931348623157E308"}, false, 0, null, 1), new String[][]{{"atan", "", "6"}, {"add", "double", "7"}, {"negate", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.5707963267948966, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tan", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "double", "-1.7976931348623153E308"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7615941559557649, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7615941559557649, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(2.147483647E9, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=2.147483647E9, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"sinh", "", "7"}, {"add", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-2.2679097686563057, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-2.2679097686563057, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"double"}, new String[]{"0.9999999999999999"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "readResolve", ""}, {"org.apache.commons.math3.complex.Complex", "getField", ""}}, 3), new String[][]{{"atan", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7853981633974483, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "toString", ""}}, 2), new String[][]{{"sin", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.9996159447946292, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.9996159447946292, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "double", "-200.0"}, {"org.apache.commons.math3.complex.Complex", "log", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "-1"}}, 1), new String[][]{{"divide", "org.apache.commons.math3.complex.Complex", "7"}, {"multiply", "double", "1"}, {"sqrt1z", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-Infinity"}, false, 0, null, 2), new String[][]{{"tanh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:3>"}}, 1), new String[][]{{"subtract", "org.apache.commons.math3.complex.Complex", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"getField", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"add", "org.apache.commons.math3.complex.Complex", "3"}, {"sinh", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"6.263185307179587"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "negate", ""}}, 3), new String[][]{{"atan", "", "3"}, {"atan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.15702342130964347, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.15702342130964347, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"isInfinite", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "getImaginary", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-4000.0"}, false, 0, null, 1), new String[][]{{"cosh", "", "0"}, {"add", "org.apache.commons.math3.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0000000312500001, 1.0) {getArgument=0.7853981477724484, getImaginary=1.0, getReal=1.0000000312500001, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-1.9999999999999996"}}, 2), new String[][]{{"add", "org.apache.commons.math3.complex.Complex", "2"}, {"negate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 1.0) {getArgument=2.356194490192345, getImaginary=1.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getImaginary", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "20.000000000000004"}, {"org.apache.commons.math3.complex.Complex", "multiply", "int", "36"}}, 3), new String[][]{{"multiply", "int", "7"}, {"acos", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.4053979747921177) {getArgument=1.5707963267948966, getImaginary=1.4053979747921177, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "double", "-1.7976931348623155E308"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "abs", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "6.1956645166873958E18"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "getReal", ""}}, 3), new String[][]{{"sqrt", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.189207115002721, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.189207115002721, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "toString", ""}}, 1), new String[][]{{"atan", "", "2"}, {"subtract", "org.apache.commons.math3.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 1.0) {getArgument=0.0, getImaginary=1.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "negate", ""}}, 2), new String[][]{{"cos", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.3754263876807227, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.3754263876807227, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "abs", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "toString", ""}}, 1), new String[][]{{"getImaginary", "", "3"}, {"asin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "atan", ""}, {"org.apache.commons.math3.complex.Complex", "sqrt", ""}}, 2), new String[][]{{"cos", "", "3"}, {"acos", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "-200.0"}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:2>"}}, 2), new String[][]{{"add", "org.apache.commons.math3.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, 1.0) {getArgument=0.5750061825784119, getImaginary=1.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"-0.9999999999999998", "200.0"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.9999999999999998, 200.0) {getArgument=1.575796285128855, getImaginary=200.0, getReal=-0.9999999999999998, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "-6.1956645166873969E18"}, {"org.apache.commons.math3.complex.Complex", "subtract", "double", "-1.7976931348623157E308"}}, 1), new String[][]{{"divide", "double", "0"}, {"pow", "org.apache.commons.math3.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.8414709848078965, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 3.141592653589793) {getArgument=1.5707963267948966, getImaginary=3.141592653589793, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-1.7976931348623158E307"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.7976931348623157E308, -1.7976931348623158E307) {getArgument=-3.0419240010986313, getImaginary=-1.7976931348623158E307, getReal=-1.7976931348623157E308, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-20.000000000000004"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.04999999999999999, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.04999999999999999, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:1>"}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "getArgument", ""}, {"org.apache.commons.math3.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 1.0) {getArgument=3.141592653589793, getImaginary=1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -Infinity) {getArgument=-1.5707963267948966, getImaginary=-Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "negate", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "asin", ""}, {"org.apache.commons.math3.complex.Complex", "exp", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 1.0) {getArgument=0.0, getImaginary=1.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-1.9999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getField", ""}}), new String[][]{{"atan", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.4636476090008062, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.4636476090008062, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "sinh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.36787944117144233, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math3.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1112539136", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cos", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7853981633974483, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"tanh", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7615941559557649, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-0.7615941559557649, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 10.0) {getArgument=1.5707963267948966, getImaginary=10.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.5707963267948966) {getArgument=1.5707963267948966, getImaginary=1.5707963267948966, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "atan", ""}}), new String[][]{{"divide", "org.apache.commons.math3.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isNaN", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<null>"}}), new String[][]{{"getRuntimeClass", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Class", actual.getClass().getName());
  assertEquals("class org.apache.commons.math3.complex.Complex {getAnnotatedInterfaces=?, getAnnotations=[], getCanonicalName=org.apache.commons.math3.complex.Complex, getClasses=[], getConstructors=[public org.apach...#778#-1832207957", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getField", new String[]{}, new String[]{}, false), new String[][]{{"getZero", "", "2"}, {"tanh", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-3>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false), new String[][]{{"add", "org.apache.commons.math3.complex.Complex", "4"}, {"isNaN", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"-1.0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-2.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "abs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"int"}, new String[]{"20"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-20.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-20.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-1.9629999999999999", "6.283185307179586"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.9629999999999999, 6.283185307179586) {getArgument=1.8736093616788072, getImaginary=6.283185307179586, getReal=-1.9629999999999999, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sinh", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.1752011936438014, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.1752011936438014, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"1.0"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "cos", ""}}), new String[][]{{"sinh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5669767943827976, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.5669767943827976, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getArgument", ""}}), new String[][]{{"acos", "", "4"}, {"add", "org.apache.commons.math3.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(3.141592653589793, 0.4163706190675822) {getArgument=0.13176694812910808, getImaginary=0.4163706190675822, getReal=3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-6.1956645166873969E18"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "createComplex", "double,double", "2.0", "-0.9999999999999998"}, {"org.apache.commons.math3.complex.Complex", "multiply", "int", "1"}}), new String[][]{{"pow", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.614031872298126E-19, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.614031872298126E-19, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "asin", ""}, {"org.apache.commons.math3.complex.Complex", "exp", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.4142135623730951, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.4142135623730951, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(3.141592653589793, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sinh", new String[]{}, new String[]{}, false), new String[][]{{"multiply", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "double", "1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"200.0", "-1.2391329033374794E19"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "negate", ""}, {"org.apache.commons.math3.complex.Complex", "add", "double", "20.0"}}), new String[][]{{"sqrt1z", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.2391329033374794E19, 200.0) {getArgument=1.614031872298122E-17, getImaginary=200.0, getReal=1.2391329033374794E19, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "cos", ""}}), new String[][]{{"divide", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-3.0978322583436984E18"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt1z", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-38797312", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "reciprocal", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:12>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "reciprocal", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false), new String[][]{{"acos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(2.4365658100345553, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=2.4365658100345553, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sin", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "cos", ""}}), new String[][]{{"pow", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getField", ""}}), new String[][]{{"conjugate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7615941559557649, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-0.7615941559557649, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"cosh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.6360918665423811, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.6360918665423811, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false), new String[][]{{"sin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.8414709848078965, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "toString", ""}, {"org.apache.commons.math3.complex.Complex", "toString", ""}}), new String[][]{{"isInfinite", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "log", ""}, {"org.apache.commons.math3.complex.Complex", "cosh", ""}}), new String[][]{{"sqrt1z", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.9298734950321937, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.9298734950321937, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"0.6283185307179586"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "exp", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.3716814692820414, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.3716814692820414, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "exp", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-1.9999999999999996"}}), new String[][]{{"pow", "org.apache.commons.math3.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "toString", ""}, {"org.apache.commons.math3.complex.Complex", "getArgument", ""}}), new String[][]{{"add", "org.apache.commons.math3.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "negate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "negate", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getField", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-2.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "NaN"}}), new String[][]{{"getReal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7853981633974483", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"pow", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.2732395447351628, -1.5592687330077502E-16) {getArgument=-3.141592653589793, getImaginary=-1.5592687330077502E-16, getReal=-1.2732395447351628, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false), new String[][]{{"log", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.2415644752704905, 3.141592653589793) {getArgument=1.6475376823833596, getImaginary=3.141592653589793, getReal=-0.2415644752704905, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:5>"}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "cos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 1.0) {getArgument=0.7853981633974483, getImaginary=1.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "cos", ""}}), new String[][]{{"exp", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.43107595064559234, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.43107595064559234, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"getImaginary", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getField", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-Infinity"}}), new String[][]{{"getOne", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:1>"}, false, 7, new String[][]{}), new String[][]{{"add", "org.apache.commons.math3.complex.Complex", "3"}, {"exp", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false), new String[][]{{"multiply", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:4>"}}), new String[][]{{"log", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-Infinity"}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "readResolve", ""}}), new String[][]{{"divide", "double", "3"}, {"pow", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"double"}, new String[]{"Infinity"}, false), new String[][]{{"asin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.557407724654902, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.557407724654902, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "acos", ""}, {"org.apache.commons.math3.complex.Complex", "atan", ""}}), new String[][]{{"cos", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.38535742648327137, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.38535742648327137, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isInfinite", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"int"}, new String[]{"-38"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(38.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=38.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false), new String[][]{{"getField", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sin", new String[]{}, new String[]{}, false), new String[][]{{"cos", "", "2"}, {"log", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.40591509124607167, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.40591509124607167, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"6.1956645166873969E18", "-9.999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(6.1956645166873969E18, -9.999999999999998) {getArgument=-1.614031872298122E-18, getImaginary=-9.999999999999998, getReal=6.1956645166873969E18, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, -Infinity) {getArgument=NaN, getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"tan", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.557407724654902, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.557407724654902, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "double", "-6.1956645166873958E18"}, {"org.apache.commons.math3.complex.Complex", "conjugate", ""}}), new String[][]{{"reciprocal", "", "6"}, {"asin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.5707963267948966, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"8.988465674311579E307", "-6.1956645166873958E18"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(8.988465674311579E307, -6.1956645166873958E18) {getArgument=-6.89290557608089E-290, getImaginary=-6.1956645166873958E18, getReal=8.988465674311579E307, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"-0.09999999999999998"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "toString", ""}}), new String[][]{{"subtract", "org.apache.commons.math3.complex.Complex", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"acos", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false), new String[][]{{"log", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getImaginary", ""}}), new String[][]{{"isNaN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"-14.0"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-1.9999999999999996"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-15.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-15.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:2>"}}), new String[][]{{"atan", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<b:false>"}}), new String[][]{{"multiply", "double", "6"}, {"add", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "toString", ""}}), new String[][]{{"getField", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:0>"}}), new String[][]{{"exp", "", "0"}, {"cos", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "negate", ""}, {"org.apache.commons.math3.complex.Complex", "log", ""}}), new String[][]{{"add", "org.apache.commons.math3.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"-6.195664516687397E19"}, false), new String[][]{{"divide", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"NaN"}, false), new String[][]{{"atan", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "cos", ""}}), new String[][]{{"exp", "", "2"}, {"asin", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.4734259924442535, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.4734259924442535, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:3>"}, {"org.apache.commons.math3.complex.Complex", "asin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-6.1956645166873969E18"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt1z", ""}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}}), new String[][]{{"sin", "", "3"}, {"getField", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "asin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "toString", ""}}), new String[][]{{"add", "org.apache.commons.math3.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "isInfinite", ""}, {"org.apache.commons.math3.complex.Complex", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.557407724654902) {getArgument=1.5707963267948966, getImaginary=1.557407724654902, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"divide", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"double"}, new String[]{"6.283185307179585"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-7.283185307179585, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-7.283185307179585, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"divide", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-20.0"}, false), new String[][]{{"cosh", "", "2"}, {"getArgument", "", "6"}, {"multiply", "org.apache.commons.math3.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.001250260438369, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.001250260438369, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt", new String[]{}, new String[]{}, false), new String[][]{{"isNaN", "", "2"}, {"negate", "", "5"}, {"sqrt1z", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.4142135623730951, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.4142135623730951, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"-Infinity"}, true), new String[][]{{"exp", "", "7"}, {"abs", "", "4"}, {"getReal", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"int"}, new String[]{"67108971"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "org.apache.commons.math3.complex.Complex", "<sample:5>"}}), new String[][]{{"add", "double", "7"}, {"multiply", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(6.7108971E7, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=6.7108971E7, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "negate", ""}, {"org.apache.commons.math3.complex.Complex", "divide", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -1.0) {getArgument=-1.5707963267948966, getImaginary=-1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<null>"}}), new String[][]{{"cos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7071067811865476, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.7071067811865476, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "negate", ""}}), new String[][]{{"getArgument", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"int"}, new String[]{"2147483645"}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:0>"}, {"org.apache.commons.math3.complex.Complex", "sqrt1z", ""}}), new String[][]{{"abs", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("2.147483645E9", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "-4077"}, {"org.apache.commons.math3.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, NaN) {getArgument=NaN, getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"8.988465674311579E307", "20.0"}, true), new String[][]{{"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getArgument", ""}}), new String[][]{{"subtract", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 3.141592653589793) {getArgument=1.2626272556789118, getImaginary=3.141592653589793, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-28.0"}, false), new String[][]{{"negate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.03571428571428571, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.03571428571428571, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"int"}, new String[]{"3"}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<s:key>"}, {"org.apache.commons.math3.complex.Complex", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 3.0) {getArgument=1.5707963267948966, getImaginary=3.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-Infinity"}}), new String[][]{{"pow", "double", "5"}, {"multiply", "int", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "reciprocal", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"exp", "", "3"}, {"cos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:3>"}}), new String[][]{{"abs", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:7>"}}), new String[][]{{"exp", "", "1"}, {"pow", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "-20.000000000000004"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.7976931348623157E308, -20.000000000000004) {getArgument=-1.112536929253601E-307, getImaginary=-20.000000000000004, getReal=1.7976931348623157E308, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false), new String[][]{{"getField", "", "3"}, {"getZero", "", "1"}, {"getImaginary", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:2>"}, {"org.apache.commons.math3.complex.Complex", "getReal", ""}}), new String[][]{{"divide", "org.apache.commons.math3.complex.Complex", "2"}, {"asin", "", "6"}, {"divide", "org.apache.commons.math3.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "toString", ""}, {"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "-19"}}), new String[][]{{"isInfinite", "", "2"}, {"exp", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.4669214877224426, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.4669214877224426, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:4>"}, {"org.apache.commons.math3.complex.Complex", "sin", ""}}), new String[][]{{"divide", "org.apache.commons.math3.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-20.000000000000004"}, false), new String[][]{{"asin", "", "3"}, {"negate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.05002085680577, -1.1102230246251565E-16) {getArgument=-3.141592653589791, getImaginary=-1.1102230246251565E-16, getReal=-0.05002085680577, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-400.00000000000006"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:3>"}, {"org.apache.commons.math3.complex.Complex", "getArgument", ""}}), new String[][]{{"negate", "", "6"}, {"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"400.0"}, true), new String[][]{{"negate", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-400.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-400.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("414187520", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "-20.000000000000004"}}), new String[][]{{"atan", "", "2"}, {"conjugate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.2626272556789118, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.2626272556789118, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-2.022"}}), new String[][]{{"asin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.5707963267948966, 0.5836293809324177) {getArgument=2.7858500630063103, getImaginary=0.5836293809324177, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "double", "-2000.0"}, {"org.apache.commons.math3.complex.Complex", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "-1"}}), new String[][]{{"add", "org.apache.commons.math3.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, Infinity) {getArgument=2.356194490192345, getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false), new String[][]{{"asin", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.5707963267948966, 1.0232274785475506) {getArgument=2.5642290743261356, getImaginary=1.0232274785475506, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"0.6283185307179586"}, false), new String[][]{{"multiply", "org.apache.commons.math3.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "createComplex", "double,double", "-1.9999999999999998", "NaN"}}), new String[][]{{"getArgument", "", "3"}, {"pow", "org.apache.commons.math3.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.36787944117144233, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"-0.9999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "hashCode", ""}}), new String[][]{{"atan", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7853981633974484, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.7853981633974484, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "cosh", ""}}), new String[][]{{"getArgument", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:2>"}, {"org.apache.commons.math3.complex.Complex", "subtract", "org.apache.commons.math3.complex.Complex", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "createComplex", "double,double", "-200.61", "NaN"}, {"org.apache.commons.math3.complex.Complex", "abs", ""}}), new String[][]{{"multiply", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"1.0", "-1.0"}, true), new String[][]{{"conjugate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 1.0) {getArgument=0.7853981633974483, getImaginary=1.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"0.09999999999999999", "-1.7976931348623155E308"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:0>"}, {"org.apache.commons.math3.complex.Complex", "subtract", "org.apache.commons.math3.complex.Complex", "<sample:2>"}}), new String[][]{{"reciprocal", "", "6"}, {"pow", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "double", "8.0"}}), new String[][]{{"negate", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.5403023058681398, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}}), new String[][]{{"reciprocal", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt1z", ""}}), new String[][]{{"nthRoot", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(NaN, NaN)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"6.195664516687397E19"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "hashCode", ""}, {"org.apache.commons.math3.complex.Complex", "divide", "double", "-1.2391329033374794E19"}}), new String[][]{{"conjugate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(6.195664516687397E19, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=6.195664516687397E19, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"cos", "", "7"}, {"asin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "5.2"}}), new String[][]{{"conjugate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.7976931348623157E308, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.7976931348623157E308, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt1z", ""}}), new String[][]{{"multiply", "org.apache.commons.math3.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}}), new String[][]{{"cosh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.3043045862358962, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.3043045862358962, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "cos", ""}}), new String[][]{{"divide", "org.apache.commons.math3.complex.Complex", "6"}, {"getImaginary", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "isInfinite", ""}}), new String[][]{{"cosh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false), new String[][]{{"sinh", "", "5"}, {"getReal", "", "3"}, {"cos", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5253829059023629, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.5253829059023629, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cos", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"sin", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "org.apache.commons.math3.complex.Complex", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:8>"}, false), new String[][]{{"cos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-Infinity"}}), new String[][]{{"getOne", "", "2"}, {"acos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"Infinity"}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "getField", ""}, {"org.apache.commons.math3.complex.Complex", "exp", ""}}), new String[][]{{"divide", "double", "1"}, {"tanh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "-0.9999999999999999"}}), new String[][]{{"asin", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.5707963267948966, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getField", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "cos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"multiply", "int", "1"}, {"multiply", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.6209069176044193, -2.5244129544236893) {getArgument=-2.141592653589793, getImaginary=-2.5244129544236893, getReal=-1.6209069176044193, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "negate", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "int", "28"}}), new String[][]{{"log", "", "6"}, {"subtract", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:2>"}, false), new String[][]{{"sin", "", "3"}, {"negate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.9092974268256817, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.9092974268256817, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "cos", ""}}), new String[][]{{"tanh", "", "3"}, {"multiply", "org.apache.commons.math3.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.9171523356672743, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.9171523356672743, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt", new String[]{}, new String[]{}, false), new String[][]{{"sqrt1z", "", "2"}, {"negate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.4142135623730951, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.4142135623730951, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cos", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt1z", ""}}), new String[][]{{"divide", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "conjugate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "negate", new String[]{}, new String[]{}, false), new String[][]{{"exp", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(2.718281828459045, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=2.718281828459045, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "1"}, {"org.apache.commons.math3.complex.Complex", "multiply", "double", "-20.61"}}), new String[][]{{"cos", "", "5"}, {"sqrt", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.16646964819512283, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.16646964819512283, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
