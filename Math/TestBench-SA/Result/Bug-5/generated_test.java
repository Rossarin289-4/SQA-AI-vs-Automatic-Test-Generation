package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-20.0"}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "-54"}, {"org.apache.commons.math3.complex.Complex", "getReal", ""}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<null>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "-54"}, {"org.apache.commons.math3.complex.Complex", "sin", ""}}, 2), new String[][]{{"acos", "", "7"}, {"reciprocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:3>"}}), new String[][]{{"atan", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7853981633974483, 1.1102230246251564E-16) {getArgument=3.141592653589793, getImaginary=1.1102230246251564E-16, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"NaN", "-0.0"}, true, 0, null, 1), new String[][]{{"multiply", "int", "0"}, {"reciprocal", "", "1"}, {"asin", "", "6"}, {"sinh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "-20.0"}}), new String[][]{{"cosh", "", "3"}, {"getField", "", "4"}, {"getOne", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "-7"}}, 3), new String[][]{{"multiply", "double", "3"}, {"reciprocal", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.6366197723675814, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-0.6366197723675814, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.complex.Complex", "atan", ""}, {"org.apache.commons.math3.complex.Complex", "add", "double", "-2.0"}, {"org.apache.commons.math3.complex.Complex", "reciprocal", ""}}, 2), new String[][]{{"multiply", "double", "0"}, {"pow", "double", "0"}, {"pow", "org.apache.commons.math3.complex.Complex", "2"}, {"divide", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.complex.Complex", "readResolve", ""}, {"org.apache.commons.math3.complex.Complex", "atan", ""}, {"org.apache.commons.math3.complex.Complex", "add", "double", "-1.0"}}, 3), new String[][]{{"multiply", "double", "6"}, {"abs", "", "3"}, {"tanh", "", "1"}, {"abs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.complex.Complex", "atan", ""}, {"org.apache.commons.math3.complex.Complex", "add", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<i:0>"}}, 3), new String[][]{{"add", "org.apache.commons.math3.complex.Complex", "6"}, {"log", "", "3"}, {"tanh", "", "1"}, {"multiply", "org.apache.commons.math3.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.complex.Complex", "atan", ""}, {"org.apache.commons.math3.complex.Complex", "add", "double", "-0.1558"}, {"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<s:lkuhey>"}}), new String[][]{{"multiply", "double", "6"}, {"log", "", "3"}, {"sin", "", "1"}, {"cos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "divide", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-1.7976931348623157E308"}}), new String[][]{{"subtract", "double", "0"}, {"subtract", "org.apache.commons.math3.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"Infinity"}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "double", "-0.54"}}), new String[][]{{"isNaN", "", "1"}, {"pow", "double", "3"}, {"atan", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "reciprocal", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "org.apache.commons.math3.complex.Complex", "<sample:2>"}, {"org.apache.commons.math3.complex.Complex", "tan", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "tanh", ""}, {"org.apache.commons.math3.complex.Complex", "sqrt1z", ""}}), new String[][]{{"cosh", "", "5"}, {"cos", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.201588407601501, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.201588407601501, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "asin", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "NaN"}, {"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<i:-57>"}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}}), new String[][]{{"divide", "double", "5"}, {"pow", "double", "2"}, {"negate", "", "4"}, {"nthRoot", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(NaN, NaN)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"-6.1956645166873979E18", "NaN"}, true, 0, null, 3), new String[][]{{"isNaN", "", "7"}, {"add", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"double"}, new String[]{"-0.1558"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "NaN"}, {"org.apache.commons.math3.complex.Complex", "tan", ""}}), new String[][]{{"tanh", "", "7"}, {"negate", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.1545515097243884, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.1545515097243884, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "asin", ""}, {"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}}), new String[][]{{"sinh", "", "1"}, {"subtract", "double", "7"}, {"conjugate", "", "6"}, {"getReal", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:0>"}, false, 9, new String[][]{{"org.apache.commons.math3.complex.Complex", "getImaginary", ""}, {"org.apache.commons.math3.complex.Complex", "divide", "double", "-Infinity"}, {"org.apache.commons.math3.complex.Complex", "atan", ""}}, 3), new String[][]{{"add", "double", "0"}, {"tan", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"NaN"}, true), new String[][]{{"tanh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"6"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(0.8660254037844387, 0.49999999999999994), (6.123233995736766E-17, 1.0), (-0.8660254037844385, 0.5000000000000003), (-0.866025403784439, -0.4999999999999994), (-1.0718754395722282E-15, -1.0), (0.8660...#235#-1732935339", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math3.complex.Complex", "divide", "double", "NaN"}, {"org.apache.commons.math3.complex.Complex", "abs", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7853981633974483", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"int"}, new String[]{"-28"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "org.apache.commons.math3.complex.Complex", "<sample:6>"}, {"org.apache.commons.math3.complex.Complex", "divide", "double", "-1.7976931348623157E308"}, {"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(28.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=28.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<null>"}, {"org.apache.commons.math3.complex.Complex", "conjugate", ""}, {"org.apache.commons.math3.complex.Complex", "tan", ""}}, 2), new String[][]{{"cosh", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:9>"}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}}, 1), new String[][]{{"divide", "org.apache.commons.math3.complex.Complex", "4"}, {"sqrt1z", "", "0"}, {"cosh", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-0.25", "-7.7445806458592471E18"}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}}, 2), new String[][]{{"tan", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -1.0) {getArgument=-1.5707963267948966, getImaginary=-1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tan", new String[]{}, new String[]{}, false, 30, new String[][]{{"org.apache.commons.math3.complex.Complex", "hashCode", ""}, {"org.apache.commons.math3.complex.Complex", "pow", "org.apache.commons.math3.complex.Complex", "<sample:7>"}}, 2), new String[][]{{"reciprocal", "", "1"}, {"nthRoot", "int", "3"}, {"removeAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tan", new String[]{}, new String[]{}, false, 48, new String[][]{{"org.apache.commons.math3.complex.Complex", "getArgument", ""}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}}), new String[][]{{"reciprocal", "", "1"}, {"nthRoot", "int", "3"}, {"removeAll", "java.util.Collection", "6"}, {"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cos", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cos", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getField", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "reciprocal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 17, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 19, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 20, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 21, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 22, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "readResolve", ""}, {"org.apache.commons.math3.complex.Complex", "cosh", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-20.0"}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<null>"}}, 1), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-20.0"}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<null>"}}, 1), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-20.0"}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<null>"}}, 1), new String[][]{{"getField", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, null, 2), new String[][]{{"conjugate", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-1.7976931348623157E308"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.7976931348623157E308, -1.7976931348623157E308) {getArgument=-2.356194490192345, getImaginary=-1.7976931348623157E308, getReal=-1.7976931348623157E308, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"6.283185307179586", "8.988465674311578E307"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(6.283185307179586, 8.988465674311578E307) {getArgument=1.5707963267948966, getImaginary=8.988465674311578E307, getReal=6.283185307179586, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.complex.Complex", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "-54"}, {"org.apache.commons.math3.complex.Complex", "getReal", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7853981633974483, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-15.238000000000001", "-0.89029"}, false, 8, new String[][]{{"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<s:P>"}, {"org.apache.commons.math3.complex.Complex", "sqrt", ""}}, 2), new String[][]{{"multiply", "double", "5"}, {"subtract", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:8>"}, false, 0, null, 1), new String[][]{{"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.4142135623730951) {getArgument=1.5707963267948966, getImaginary=1.4142135623730951, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:7>"}, false, 0, null, 1), new String[][]{{"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, -Infinity) {getArgument=NaN, getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:3>"}, false, 0, null, 1), new String[][]{{"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, Infinity) {getArgument=NaN, getImaginary=Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:3>"}, false, 13, new String[][]{}, 1), new String[][]{{"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:7>"}, false, 13, new String[][]{}, 1), new String[][]{{"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, NaN) {getArgument=NaN, getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-0.54", "1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt1z", ""}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "int", "0"}}, 1), new String[][]{{"sinh", "", "0"}, {"sin", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5367940414816761, 0.004811889344464237) {getArgument=0.008963885757849411, getImaginary=0.004811889344464237, getReal=0.5367940414816761, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-0.5399999999999999", "1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "tanh", ""}, {"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "int", "0"}}, 1), new String[][]{{"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5666223293737629, 0.005703159474923317) {getArgument=0.010064846722638762, getImaginary=0.005703159474923317, getReal=0.5666223293737629, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-0.5399999999999999", "1.7976931348623157E308"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "int", "0"}}, 1), new String[][]{{"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5666223293737629, 0.005703159474923317) {getArgument=0.010064846722638762, getImaginary=0.005703159474923317, getReal=0.5666223293737629, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-0.5399999999999999", "8.988465674311579E307"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "acos", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "int", "0"}}, 1), new String[][]{{"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.001405798823137849, 1.1493740198997733) {getArgument=1.5720194257146451, getImaginary=1.1493740198997733, getReal=-0.001405798823137849, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-0.05399999999999999", "8.988465674311579E307"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "acos", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "int", "0"}}, 1), new String[][]{{"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.3403831209527883E-4, 1.0014552721920418) {getArgument=1.5709301703274205, getImaginary=1.0014552721920418, getReal=-1.3403831209527883E-4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"0.366", "8.988465674311579E307"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "acos", ""}}, 1), new String[][]{{"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(9.284496515171352E-4, 1.0677257358379444) {getArgument=1.5699267688303893, getImaginary=1.0677257358379444, getReal=9.284496515171352E-4, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"0.366", "-6.1956645166873969E18"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "acos", ""}}, 1), new String[][]{{"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.07161453836024329, 1.0479958513989176) {getArgument=1.5025676422931837, getImaginary=1.0479958513989176, getReal=0.07161453836024329, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"4.966", "-6.1956645166873969E18"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "acos", ""}}, 1), new String[][]{{"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(13.725313710909036, 70.40378715339286) {getArgument=1.3782599126838315, getImaginary=70.40378715339286, getReal=13.725313710909036, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"4.966", "-6.1956645166873969E18"}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "acos", ""}}, 1), new String[][]{{"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(13.725313710909036, 70.40378715339286) {getArgument=1.3782599126838315, getImaginary=70.40378715339286, getReal=13.725313710909036, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"4.966", "-3.0978322583436984E18"}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "acos", ""}}, 1), new String[][]{{"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(55.355793003935254, 45.609808163822215) {getArgument=0.6891685260916105, getImaginary=45.609808163822215, getReal=55.355793003935254, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-0.5", "0.5"}, false, 0, null, 3), new String[][]{{"subtract", "double", "2"}, {"pow", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.9999999999999998, -1.0) {getArgument=-2.356194490192345, getImaginary=-1.0, getReal=-0.9999999999999998, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"Infinity", "-3.097832258343698E19"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:7>"}, {"org.apache.commons.math3.complex.Complex", "acos", ""}}, 1), new String[][]{{"sinh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-22.4126", "23.9"}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "acos", ""}}, 2), new String[][]{{"sinh", "", "6"}, {"cosh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -Infinity) {getArgument=-2.356194490192345, getImaginary=-Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-26.312600000000003", "23.9"}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "acos", ""}}, 2), new String[][]{{"sinh", "", "6"}, {"cosh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, Infinity) {getArgument=2.356194490192345, getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-26.315600000000003", "23.9"}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "acos", ""}}, 2), new String[][]{{"sinh", "", "6"}, {"cosh", "", "7"}, {"pow", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-9.0578", "6.46"}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "acos", ""}}, 2), new String[][]{{"sinh", "", "6"}, {"cosh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-9.0578", "-0.63"}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "acos", ""}, {"org.apache.commons.math3.complex.Complex", "conjugate", ""}}, 2), new String[][]{{"sinh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-3468.5559367687174, -2528.975291317241) {getArgument=-2.5115926406724545, getImaginary=-2528.975291317241, getReal=-3468.5559367687174, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-9.0578", "51.37"}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "acos", ""}, {"org.apache.commons.math3.complex.Complex", "conjugate", ""}}, 2), new String[][]{{"sinh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1929.814093929404, 3834.3727419562956) {getArgument=2.037075100129924, getImaginary=3834.3727419562956, getReal=-1929.814093929404, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-9.0578", "102.74"}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "acos", ""}, {"org.apache.commons.math3.complex.Complex", "conjugate", ""}}, 2), new String[][]{{"sinh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(2557.4656642198615, 3447.602933180613) {getArgument=0.9325575814471312, getImaginary=3447.602933180613, getReal=2557.4656642198615, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "20.0"}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "acos", ""}, {"org.apache.commons.math3.complex.Complex", "acos", ""}}, 3), new String[][]{{"sinh", "", "6"}, {"multiply", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "-54"}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(3.141592653589793, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "-54"}}, 2), new String[][]{{"acos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.8115262724608536) {getArgument=1.5707963267948966, getImaginary=1.8115262724608536, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "-54"}}, 2), new String[][]{{"acos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5848186935304827, 1.247154382013722) {getArgument=1.132318388749723, getImaginary=1.247154382013722, getReal=0.5848186935304827, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "-54"}}, 2), new String[][]{{"acos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5707963267948966, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "-54"}, {"org.apache.commons.math3.complex.Complex", "sin", ""}}, 2), new String[][]{{"acos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "-54"}, {"org.apache.commons.math3.complex.Complex", "sin", ""}}, 2), new String[][]{{"acos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}}, 2), new String[][]{{"acos", "", "7"}, {"reciprocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.5520206994522678) {getArgument=-1.5707963267948966, getImaginary=-0.5520206994522678, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}}, 2), new String[][]{{"acos", "", "7"}, {"reciprocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}}, 2), new String[][]{{"acos", "", "7"}, {"reciprocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}}, 2), new String[][]{{"acos", "", "7"}, {"reciprocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.6366197723675814, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.6366197723675814, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}, {"org.apache.commons.math3.complex.Complex", "conjugate", ""}}, 2), new String[][]{{"acos", "", "7"}, {"reciprocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.9772997900911325) {getArgument=-1.5707963267948966, getImaginary=-0.9772997900911325, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}, {"org.apache.commons.math3.complex.Complex", "conjugate", ""}}, 3), new String[][]{{"acos", "", "7"}, {"reciprocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, null, 3), new String[][]{{"reciprocal", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"double"}, new String[]{"-20.0"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(20.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=20.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"org.apache.commons.math3.complex.Complex", "sinh", ""}, {"org.apache.commons.math3.complex.Complex", "add", "double", "-33.561"}}, 1), new String[][]{{"getArgument", "", "5"}, {"negate", "", "6"}, {"cos", "", "6"}, {"subtract", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:6>"}, false, 14, new String[][]{{"org.apache.commons.math3.complex.Complex", "isNaN", ""}, {"org.apache.commons.math3.complex.Complex", "sinh", ""}, {"org.apache.commons.math3.complex.Complex", "add", "double", "2.971"}}, 1), new String[][]{{"getArgument", "", "5"}, {"negate", "", "6"}, {"cos", "", "6"}, {"getArgument", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-0.1", "Infinity"}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "negate", ""}}, 3), new String[][]{{"abs", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:2>"}, false, 13, new String[][]{}, 1), new String[][]{{"getArgument", "", "5"}, {"negate", "", "6"}, {"cos", "", "0"}, {"sin", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false, 8, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:5>"}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:0>"}}, 2), new String[][]{{"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7615941559557649, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7615941559557649, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:0>"}}, 1), new String[][]{{"sinh", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.1752011936438014, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.1752011936438014, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:0>"}}, 1), new String[][]{{"sinh", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, NaN) {getArgument=NaN, getImaginary=NaN, getReal=-Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cos", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cos", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "abs", ""}, {"org.apache.commons.math3.complex.Complex", "add", "double", "-0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sinh", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.1752011936438014, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.1752011936438014, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-0.1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-0.09999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-0.09999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-0.09999999999999999"}, {"org.apache.commons.math3.complex.Complex", "tan", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-0.049999999999999996"}, {"org.apache.commons.math3.complex.Complex", "tan", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-0.049999999999999996"}, {"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "10"}, {"org.apache.commons.math3.complex.Complex", "tan", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-0.049999999999999996"}, {"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "10"}, {"org.apache.commons.math3.complex.Complex", "tan", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getField", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getField", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "negate", ""}, {"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getField", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "negate", ""}, {"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getField", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "reciprocal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sin", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.8414709848078965, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sin", new String[]{}, new String[]{}, false), new String[][]{{"isNaN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sin", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"isNaN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sin", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"isNaN", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sin", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.8414709848078965, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "divide", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 10, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.36787944117144233, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, 0.8414709848078965) {getArgument=1.0, getImaginary=0.8414709848078965, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "exp", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(2.718281828459045, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=2.718281828459045, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1449132032", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(6.123233995736766E-17, 1.0), (-1.8369701987210297E-16, -1.0)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"-54"}, false, 15, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"37"}, false, 15, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(0.9963974885425265, 0.08480592447550919), (0.9677329469334989, 0.2519780613851252), (0.9112284903881357, 0.41190124824399266), (0.8285096492438422, 0.5599747861375953), (0.7219560939545245, 0.691938...#1595#-568522528", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"37"}, false, 15, new String[][]{}), new String[][]{{"set", "int,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7219560939545245, 0.6919388689775462) {getArgument=0.764171186008328, getImaginary=0.6919388689775462, getReal=0.7219560939545245, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"18"}, false, 15, new String[][]{}), new String[][]{{"set", "int,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(6.123233995736766E-17, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=6.123233995736766E-17, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"-18"}, false, 16, new String[][]{{"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"19"}, false, 16, new String[][]{{"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<s:>"}}), new String[][]{{"set", "int,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0825793454723324, 0.9965844930066698) {getArgument=1.4881228359109546, getImaginary=0.9965844930066698, getReal=0.0825793454723324, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"61"}, false, 16, new String[][]{{"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<s:>"}}), new String[][]{{"set", "int,java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.8944870822287956, 0.44709379298511387) {getArgument=0.46351367020177275, getImaginary=0.44709379298511387, getReal=0.8944870822287956, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-6195664516687396620"}, {"org.apache.commons.math3.complex.Complex", "pow", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-6.1956645166873969E18"}, {"org.apache.commons.math3.complex.Complex", "pow", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7853981633974483, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-6.1956645166873969E18"}, {"org.apache.commons.math3.complex.Complex", "pow", "double", "-0.5"}}), new String[][]{{"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7853981633974483", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-0.5"}}), new String[][]{{"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-0.5"}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}}), new String[][]{{"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.7853981633974483", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-0.63"}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}, {"org.apache.commons.math3.complex.Complex", "isInfinite", ""}}), new String[][]{{"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-20.0"}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}}), new String[][]{{"divide", "org.apache.commons.math3.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7853981633974483, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "double", "-0.63"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-20.0"}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-20.0"}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}}), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-20.0"}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}}), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-20.0"}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<null>"}}), new String[][]{{"getField", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "sinh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "-20.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:3>"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:6>"}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:6>"}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:6>"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:6>"}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}}), new String[][]{{"exp", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:6>"}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}}), new String[][]{{"exp", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.36787944117144233, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:5>"}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "org.apache.commons.math3.complex.Complex", "<sample:6>"}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=0.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false), new String[][]{{"conjugate", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:7>"}, false), new String[][]{{"conjugate", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -Infinity) {getArgument=-1.5707963267948966, getImaginary=-Infinity, getReal=0.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "double", "-0.63"}, {"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.557407724654902, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.557407724654902, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tan", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "double", "-0.63"}, {"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.7615941559557649) {getArgument=1.5707963267948966, getImaginary=0.7615941559557649, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tan", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "double", "-0.63"}, {"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.557407724654902, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.557407724654902, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tan", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "double", "-0.63"}, {"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "getReal", ""}}), new String[][]{{"acos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "atan", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "int", "-54"}, {"org.apache.commons.math3.complex.Complex", "getReal", ""}}), new String[][]{{"acos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "getImaginary", ""}, {"org.apache.commons.math3.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "getImaginary", ""}, {"org.apache.commons.math3.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"20.0", "-0.09999999999999999"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(20.0, -0.09999999999999999) {getArgument=-0.004999958333958322, getImaginary=-0.09999999999999999, getReal=20.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"20.0", "-0.009999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(20.0, -0.009999999999999998) {getArgument=-4.999999583333395E-4, getImaginary=-0.009999999999999998, getReal=20.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"20.015", "-0.009999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(20.015, -0.009999999999999998) {getArgument=-4.996252394661696E-4, getImaginary=-0.009999999999999998, getReal=20.015, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"40.03", "-0.009999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(40.03, -0.009999999999999998) {getArgument=-2.498126353229783E-4, getImaginary=-0.009999999999999998, getReal=40.03, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"NaN", "-0.009999999999999998"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, -0.009999999999999998) {getArgument=NaN, getImaginary=-0.009999999999999998, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"NaN", "2.7900000000000005"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, 2.7900000000000005) {getArgument=NaN, getImaginary=2.7900000000000005, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"NaN", "5.580000000000001"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, 5.580000000000001) {getArgument=NaN, getImaginary=5.580000000000001, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"NaN", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, -1.0) {getArgument=NaN, getImaginary=-1.0, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"1.0", "-1.43"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -1.43) {getArgument=-0.9605398459392694, getImaginary=-1.43, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"1.0", "-0.029"}, false, 8, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.029) {getArgument=-0.028991874433100476, getImaginary=-0.029, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"0.5", "-0.029"}, false, 8, new String[][]{}), new String[][]{{"multiply", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:6>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 1.0) {getArgument=0.0, getImaginary=1.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:0>"}, false), new String[][]{{"isInfinite", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-2.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:8>"}, false), new String[][]{{"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.4142135623730951) {getArgument=1.5707963267948966, getImaginary=1.4142135623730951, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "cos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, NaN) {getArgument=NaN, getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-0.1", "-0.63"}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "pow", "double", "0.5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.1, -0.63) {getArgument=-1.7282131995214873, getImaginary=-0.63, getReal=-0.1, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-0.54", "Infinity"}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt1z", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "int", "2"}}), new String[][]{{"sinh", "", "6"}, {"sin", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "subtract", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "abs", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "-6.1956645166873969E18"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-20.063", "3.097832258343698E19"}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "sqrt", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:7>"}, {"org.apache.commons.math3.complex.Complex", "acos", ""}}), new String[][]{{"sinh", "", "6"}, {"cosh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -Infinity) {getArgument=-2.356194490192345, getImaginary=-Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 3.141592653589793) {getArgument=1.5707963267948966, getImaginary=3.141592653589793, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}, {"org.apache.commons.math3.complex.Complex", "conjugate", ""}}), new String[][]{{"acos", "", "7"}, {"reciprocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.9772997900911325) {getArgument=-1.5707963267948966, getImaginary=-0.9772997900911325, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"Infinity"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}, {"org.apache.commons.math3.complex.Complex", "tanh", ""}, {"org.apache.commons.math3.complex.Complex", "conjugate", ""}}), new String[][]{{"acos", "", "7"}, {"reciprocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.3082199585124957, -0.6572940915455031) {getArgument=-1.132318388749723, getImaginary=-0.6572940915455031, getReal=0.3082199585124957, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}, {"org.apache.commons.math3.complex.Complex", "conjugate", ""}}), new String[][]{{"acos", "", "7"}, {"reciprocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}, {"org.apache.commons.math3.complex.Complex", "conjugate", ""}, {"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<s:>"}}), new String[][]{{"acos", "", "7"}, {"reciprocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "acos", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math3.complex.Complex", "sin", ""}, {"org.apache.commons.math3.complex.Complex", "conjugate", ""}, {"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<s:>"}}), new String[][]{{"acos", "", "7"}, {"reciprocal", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.5520206994522678) {getArgument=-1.5707963267948966, getImaginary=-0.5520206994522678, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:2>"}, false), new String[][]{{"reciprocal", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:1>"}, false), new String[][]{{"reciprocal", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false), new String[][]{{"reciprocal", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false), new String[][]{{"reciprocal", "", "5"}, {"negate", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false, 1, new String[][]{}), new String[][]{{"reciprocal", "", "5"}, {"negate", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:3>"}, false, 10, new String[][]{}), new String[][]{{"getArgument", "", "5"}, {"negate", "", "6"}, {"cos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:7>"}, false, 10, new String[][]{{"org.apache.commons.math3.complex.Complex", "atan", ""}}), new String[][]{{"getArgument", "", "5"}, {"negate", "", "6"}, {"cos", "", "6"}, {"subtract", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false, 14, new String[][]{{"org.apache.commons.math3.complex.Complex", "sinh", ""}, {"org.apache.commons.math3.complex.Complex", "atan", ""}}), new String[][]{{"getArgument", "", "5"}, {"negate", "", "6"}, {"cos", "", "6"}, {"subtract", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false, 13, new String[][]{{"org.apache.commons.math3.complex.Complex", "sinh", ""}, {"org.apache.commons.math3.complex.Complex", "atan", ""}}), new String[][]{{"getArgument", "", "5"}, {"negate", "", "6"}, {"cos", "", "6"}, {"subtract", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"int"}, new String[]{"-2"}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "cos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "org.apache.commons.math3.complex.Complex", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "org.apache.commons.math3.complex.Complex", "<sample:1>"}}), new String[][]{{"exp", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "subtract", "org.apache.commons.math3.complex.Complex", "<sample:1>"}}), new String[][]{{"exp", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "pow", "org.apache.commons.math3.complex.Complex", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -1.2246467991473532E-16) {getArgument=-3.141592653589793, getImaginary=-1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "pow", "org.apache.commons.math3.complex.Complex", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "pow", "org.apache.commons.math3.complex.Complex", "<sample:5>"}}), new String[][]{{"getArgument", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:8>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "pow", "org.apache.commons.math3.complex.Complex", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 1.2246467991473532E-16) {getArgument=3.141592653589793, getImaginary=1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "pow", "org.apache.commons.math3.complex.Complex", "<sample:5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math3.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "pow", "org.apache.commons.math3.complex.Complex", "<sample:5>"}}), new String[][]{{"atan", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "pow", "org.apache.commons.math3.complex.Complex", "<sample:5>"}}), new String[][]{{"atan", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7853981633974483, 1.1102230246251564E-16) {getArgument=3.141592653589793, getImaginary=1.1102230246251564E-16, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:11>"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:3>"}}), new String[][]{{"atan", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.04318704852478214, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.04318704852478214, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "multiply", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "reciprocal", ""}, {"org.apache.commons.math3.complex.Complex", "getReal", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-2.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:3>"}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:2>"}}), new String[][]{{"atan", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:3>"}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:0>"}}), new String[][]{{"atan", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7853981633974483, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"org.apache.commons.math3.complex.Complex"}, new String[]{"<sample:1>"}, false, 8, new String[][]{{"org.apache.commons.math3.complex.Complex", "tan", ""}, {"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:5>"}, {"org.apache.commons.math3.complex.Complex", "divide", "org.apache.commons.math3.complex.Complex", "<sample:0>"}}), new String[][]{{"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:6>"}}), new String[][]{{"sinh", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.1752011936438014, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.1752011936438014, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:0>"}}, 1), new String[][]{{"sinh", "", "5"}, {"atan", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math3.complex.Complex", "add", "double", "2.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7615941559557649, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7615941559557649, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"sinh", "", "5"}, {"atan", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.8657694832396586, 1.1102230246251564E-16) {getArgument=3.141592653589793, getImaginary=1.1102230246251564E-16, getReal=-0.8657694832396586, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"sinh", "", "5"}, {"atan", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1), new String[][]{{"sinh", "", "5"}, {"atan", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 11, new String[][]{}, 1), new String[][]{{"sinh", "", "5"}, {"atan", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.2261911708835171) {getArgument=1.5707963267948966, getImaginary=1.2261911708835171, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.complex.Complex", "getArgument", ""}}, 1), new String[][]{{"sinh", "", "5"}, {"atan", "", "3"}, {"exp", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.33782507281529445, 0.9412089142041425) {getArgument=1.2261911708835171, getImaginary=0.9412089142041425, getReal=0.33782507281529445, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.complex.Complex", "getArgument", ""}}, 1), new String[][]{{"sinh", "", "5"}, {"atan", "", "1"}, {"exp", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(-1.0, 1.2246467991473532E-16)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"42"}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "multiply", "org.apache.commons.math3.complex.Complex", "<sample:3>"}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}}), new String[][]{{"add", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"0.5", "-0.09999999999999999"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5, -0.09999999999999999) {getArgument=-0.19739555984988075, getImaginary=-0.09999999999999999, getReal=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"10.5", "-0.09999999999999999"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(10.5, -0.09999999999999999) {getArgument=-0.009523521593612853, getImaginary=-0.09999999999999999, getReal=10.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"10.5", "-0.09999999999999999"}, true), new String[][]{{"multiply", "int", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(42.0, -0.39999999999999997) {getArgument=-0.009523521593612853, getImaginary=-0.39999999999999997, getReal=42.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"10.5", "-0.09999999999999999"}, true), new String[][]{{"multiply", "int", "7"}, {"add", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -0.39999999999999997) {getArgument=-0.0, getImaginary=-0.39999999999999997, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"10.5", "-0.009999999999999998"}, true), new String[][]{{"multiply", "int", "7"}, {"add", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -0.039999999999999994) {getArgument=-0.0, getImaginary=-0.039999999999999994, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"10.5", "0.009999999999999998"}, true), new String[][]{{"multiply", "int", "7"}, {"add", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.039999999999999994) {getArgument=0.0, getImaginary=0.039999999999999994, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"10.5", "0.009999999999999998"}, true, 0, null, 2), new String[][]{{"multiply", "int", "7"}, {"add", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.039999999999999994) {getArgument=0.0, getImaginary=0.039999999999999994, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"double"}, new String[]{"-0.09999999999999999"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.9510565162951535, -0.3090169943749474) {getArgument=-0.3141592653589793, getImaginary=-0.3090169943749474, getReal=0.9510565162951535, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"double"}, new String[]{"-0.19999999999999998"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.8090169943749475, -0.5877852522924731) {getArgument=-0.6283185307179586, getImaginary=-0.5877852522924731, getReal=0.8090169943749475, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"double"}, new String[]{"-0.19999999999999998"}, false), new String[][]{{"pow", "org.apache.commons.math3.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.8744560875853382, 4.1621286141720626E-16) {getArgument=2.2204460492503128E-16, getImaginary=4.1621286141720626E-16, getReal=1.8744560875853382, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"double"}, new String[]{"0.19999999999999998"}, false), new String[][]{{"pow", "org.apache.commons.math3.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5334880910911033, 1.1845815241853312E-16) {getArgument=2.2204460492503126E-16, getImaginary=1.1845815241853312E-16, getReal=0.5334880910911033, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"double"}, new String[]{"0.19999999999999998"}, false, 0, null, 3), new String[][]{{"pow", "org.apache.commons.math3.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5334880910911033, 1.1845815241853312E-16) {getArgument=2.2204460492503126E-16, getImaginary=1.1845815241853312E-16, getReal=0.5334880910911033, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "pow", new String[]{"double"}, new String[]{"-0.19999999999999998"}, false, 0, null, 3), new String[][]{{"pow", "org.apache.commons.math3.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.8744560875853382, 4.1621286141720626E-16) {getArgument=2.2204460492503128E-16, getImaginary=4.1621286141720626E-16, getReal=1.8744560875853382, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}, {"org.apache.commons.math3.complex.Complex", "cosh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}, {"org.apache.commons.math3.complex.Complex", "cosh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}, {"org.apache.commons.math3.complex.Complex", "cosh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.7853981633974483", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}, {"org.apache.commons.math3.complex.Complex", "cosh", ""}, {"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}, {"org.apache.commons.math3.complex.Complex", "cosh", ""}, {"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}, {"org.apache.commons.math3.complex.Complex", "cosh", ""}, {"org.apache.commons.math3.complex.Complex", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "add", new String[]{"double"}, new String[]{"-0.0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.complex.Complex", "getArgument", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "21"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "21"}}), new String[][]{{"sinh", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(2.2326303196791324, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=2.2326303196791324, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}}), new String[][]{{"pow", "org.apache.commons.math3.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}}), new String[][]{{"pow", "org.apache.commons.math3.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}}), new String[][]{{"pow", "org.apache.commons.math3.complex.Complex", "6"}, {"multiply", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}}), new String[][]{{"pow", "org.apache.commons.math3.complex.Complex", "6"}, {"conjugate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}}), new String[][]{{"pow", "org.apache.commons.math3.complex.Complex", "6"}, {"multiply", "double", "2"}, {"divide", "org.apache.commons.math3.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math3.complex.Complex", "nthRoot", "int", "6"}}, 1), new String[][]{{"pow", "org.apache.commons.math3.complex.Complex", "6"}, {"multiply", "double", "2"}, {"divide", "org.apache.commons.math3.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "abs", ""}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "abs", ""}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "abs", ""}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math3.complex.Complex", "abs", ""}, {"org.apache.commons.math3.complex.Complex", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "atan", ""}, {"org.apache.commons.math3.complex.Complex", "reciprocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 3.141592653589793) {getArgument=1.5707963267948966, getImaginary=3.141592653589793, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math3.complex.Complex", "atan", ""}, {"org.apache.commons.math3.complex.Complex", "reciprocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.5707963267948966) {getArgument=1.5707963267948966, getImaginary=1.5707963267948966, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math3.complex.Complex", "atan", ""}, {"org.apache.commons.math3.complex.Complex", "reciprocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "log", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math3.complex.Complex", "atan", ""}, {"org.apache.commons.math3.complex.Complex", "reciprocal", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -0.7853981633974483) {getArgument=-0.0, getImaginary=-0.7853981633974483, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math3.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math3.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, -Infinity) {getArgument=NaN, getImaginary=-Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math3.complex.Complex", "org.apache.commons.math3.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math3.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math3.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
