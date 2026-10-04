package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"tan", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.1752011936438014) {getArgument=1.5707963267948966, getImaginary=1.1752011936438014, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "5"}, {"getReal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "NaN"}}), new String[][]{{"atan", "", "5"}, {"atan", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "4"}, {"isNaN", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"divide", "double", "4"}, {"multiply", "org.apache.commons.math.complex.Complex", "3"}, {"acos", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"NaN", "1.0"}, true), new String[][]{{"add", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<sample:5>"}}), new String[][]{{"sin", "", "0"}, {"cosh", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}), new String[][]{{"getArgument", "", "2"}, {"conjugate", "", "2"}, {"asin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "double", "-8.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"NaN"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 7, new String[][]{}), new String[][]{{"sqrt", "", "1"}, {"tanh", "", "2"}, {"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 4, new String[][]{}), new String[][]{{"subtract", "double", "7"}, {"acos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "double", "-3.0978322583436984E18"}}), new String[][]{{"sqrt1z", "", "2"}, {"divide", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "1"}, {"org.apache.commons.math.complex.Complex", "divide", "double", "199.99"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1112539136", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 1), new String[][]{{"subtract", "double", "1"}, {"log", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "double", "Infinity"}}), new String[][]{{"negate", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}}), new String[][]{{"pow", "double", "0"}, {"nthRoot", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(NaN, NaN)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "0.0"}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-20.0"}}, 3), new String[][]{{"divide", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "double", "-6.1956645166873969E18"}}, 3), new String[][]{{"sin", "", "0"}, {"sqrt1z", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}), new String[][]{{"cos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:La>"}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "double", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"-5.8975", "NaN"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"NaN"}, true), new String[][]{{"multiply", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "cosh", ""}}, 2), new String[][]{{"sin", "", "3"}, {"pow", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "-1073741824"}, {"org.apache.commons.math.complex.Complex", "log", ""}}), new String[][]{{"get", "int", "2"}, {"sqrt1z", "", "0"}, {"sinh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}, 3), new String[][]{{"divide", "double", "7"}, {"getField", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "tan", ""}}, 2), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:f>"}}, 1), new String[][]{{"log", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<null>"}}, 1), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "2"}, {"cos", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"12.56637061435917", "0.0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(12.56637061435917, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=12.56637061435917, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, -1.0) {getArgument=-1.5707963267948966, getImaginary=-1.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "-6.1956645166873969E18"}, {"org.apache.commons.math.complex.Complex", "cosh", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "double", "3.0978322583436984E18"}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7853981633974483, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"tanh", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.557407724654902) {getArgument=1.5707963267948966, getImaginary=1.557407724654902, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}, 2), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, Infinity) {getArgument=2.356194490192345, getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"acos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.4741354375614093, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=2.4741354375614093, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 0, null, 2), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "0"}, {"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"10.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}}, 2), new String[][]{{"atan", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.4801364395941514, -1.1102230246251565E-16) {getArgument=-3.141592653589793, getImaginary=-1.1102230246251565E-16, getReal=-1.4801364395941514, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"log", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5884375528174727, -0.5113252103366475) {getArgument=-0.715395482742321, getImaginary=-0.5113252103366475, getReal=0.5884375528174727, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}}, 1), new String[][]{{"divide", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 3.141592653589793) {getArgument=1.5707963267948966, getImaginary=3.141592653589793, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"sinh", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(11.548739357257748, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=11.548739357257748, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"cosh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"-6195664516687396620"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}}, 3), new String[][]{{"sinh", "", "0"}, {"log", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "double", "20.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"6.1956645166873958E18"}, false, 0, null, 1), new String[][]{{"abs", "", "6"}, {"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, NaN) {getArgument=NaN, getImaginary=NaN, getReal=-Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.5707963267948966, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"conjugate", "", "5"}, {"multiply", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.36787944117144233, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"sinh", "", "4"}, {"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}}, 2), new String[][]{{"negate", "", "3"}, {"add", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.6321205588285577, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=0.6321205588285577, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:5>"}, {"org.apache.commons.math.complex.Complex", "isNaN", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.36787944117144233, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "double", "Infinity"}}, 1), new String[][]{{"pow", "double", "5"}, {"sqrt", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"55.283185307179586"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-1.0, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "3"}, {"pow", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"asin", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.3767275080585751, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.3767275080585751, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"sqrt", "", "6"}, {"add", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7724538509055159, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.7724538509055159, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "log", ""}}, 1), new String[][]{{"getField", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"2.0749999999999997"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "1.7976931348623157E308"}}, 1), new String[][]{{"add", "double", "2"}, {"pow", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}}, 3), new String[][]{{"sinh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.2326303196791324, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=2.2326303196791324, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}, 1), new String[][]{{"getImaginary", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:8>"}, {"org.apache.commons.math.complex.Complex", "isInfinite", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1112539136", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"acos", "", "7"}, {"add", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:c>"}}, 3), new String[][]{{"log", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}, {"org.apache.commons.math.complex.Complex", "log", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-1.0, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-1.0, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-8.988465674311579E307", "-6.1956645166873958E18"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}, 2), new String[][]{{"getImaginary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-6.1956645166873958E18", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"subtract", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"Infinity", "0.4"}, true, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.4) {getArgument=0.0, getImaginary=0.4, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "getArgument", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:0>"}, {"org.apache.commons.math.complex.Complex", "pow", "double", "6.238185307179586"}}, 1), new String[][]{{"conjugate", "", "5"}, {"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "6.283185307179586"}}, 3), new String[][]{{"nthRoot", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(Infinity, Infinity)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "negate", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}, {"org.apache.commons.math.complex.Complex", "cos", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}, {"sin", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, 7.196031900750151E-17) {getArgument=4.663419226702788E-17, getImaginary=7.196031900750151E-17, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"0.1", "6.1956645166873979E18"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.1, 6.1956645166873979E18) {getArgument=1.5707963267948966, getImaginary=6.1956645166873979E18, getReal=0.1, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}}, 1), new String[][]{{"abs", "", "0"}, {"isInfinite", "", "0"}, {"multiply", "org.apache.commons.math.complex.Complex", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"divide", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"atan", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.352513421777619, -5.551115123125783E-17) {getArgument=-1.5747244729386986E-16, getImaginary=-5.551115123125783E-17, getReal=0.352513421777619, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 6, new String[][]{}, 1), new String[][]{{"subtract", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "subtract", "double", "3.0978322583436989E18"}}, 3), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "2"}, {"subtract", "org.apache.commons.math.complex.Complex", "4"}, {"add", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, -1.0) {getArgument=NaN, getImaginary=-1.0, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getArgument", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"cos", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.123233995736766E-17, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=6.123233995736766E-17, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "isNaN", ""}}, 1), new String[][]{{"divide", "double", "4"}, {"getImaginary", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"-10.0"}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<null>"}}, 3), new String[][]{{"cosh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-Infinity", "4.05"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "20.25", "100.0"}}, 2), new String[][]{{"getReal", "", "1"}, {"sqrt", "", "5"}, {"sin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, Infinity) {getArgument=NaN, getImaginary=Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"atan", "", "3"}, {"abs", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.2626272556789118", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"sin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.8686709614860095) {getArgument=-1.5707963267948966, getImaginary=-0.8686709614860095, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"77.75"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}, 2), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.9871382636655949, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.9871382636655949, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 3.141592653589793) {getArgument=1.5707963267948966, getImaginary=3.141592653589793, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1772093440", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "2.025", "10.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "log", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"6.283185307179586", "1.0000000000000002"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.283185307179586, 1.0000000000000002) {getArgument=0.1578311902881589, getImaginary=1.0000000000000002, getReal=6.283185307179586, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7853981633974483, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"-6.1956645166873969E18"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "10.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.1956645166873969E18, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=6.1956645166873969E18, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "NaN"}, {"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}), new String[][]{{"asin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5707963267948966, -1.8115262724608532) {getArgument=-0.8564513198385214, getImaginary=-1.8115262724608532, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-1.0, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-1.7976931348623157E308", "-4.800000000000001"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.7976931348623157E308, -4.800000000000001) {getArgument=-3.141592653589793, getImaginary=-4.800000000000001, getReal=-1.7976931348623157E308, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"1.0", "4.9E-324"}, true), new String[][]{{"getArgument", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("4.9E-324", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "getArgument", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"Infinity"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"1.0", "11.783185307179584"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 11.783185307179584) {getArgument=1.4861325020000167, getImaginary=11.783185307179584, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.36787944117144233, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "double", "NaN"}, {"org.apache.commons.math.complex.Complex", "subtract", "double", "12.566370614359174"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5707963267948966, -0.8813735870195429) {getArgument=-0.5113252103366475, getImaginary=-0.8813735870195429, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.5707963267948966, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"10.0", "14.0"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(10.0, 14.0) {getArgument=0.9505468408120752, getImaginary=14.0, getReal=10.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false), new String[][]{{"sqrt", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"double"}, new String[]{"-2.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-3.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-3.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:9>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-3.0978322583436984E18", "2.0000000000000004"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<null>"}}), new String[][]{{"cos", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.903682731059604, -2.306171394518849) {getArgument=-0.6712083956956115, getImaginary=-2.306171394518849, getReal=2.903682731059604, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false), new String[][]{{"abs", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getReal", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"-6195664516687396620"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"1.7976931348623157E308", "NaN"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.7976931348623157E308, NaN) {getArgument=NaN, getImaginary=NaN, getReal=1.7976931348623157E308, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"6.283185307179586"}, false), new String[][]{{"cos", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681399, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.5403023058681399, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"1"}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(Infinity, Infinity)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "getArgument", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"6.783185307179587", "3.0978322583436986E17"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.783185307179587, 3.0978322583436986E17) {getArgument=1.5707963267948966, getImaginary=3.0978322583436986E17, getReal=6.783185307179587, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"Infinity", "1.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "1.7976931348623157E308"}}), new String[][]{{"multiply", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"-6.1956645166873969E18"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.1956645166873969E18, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=6.1956645166873969E18, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(3.141592653589793, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -Infinity) {getArgument=-2.356194490192345, getImaginary=-Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.8414709848078965, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:3>"}, {"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"sqrt", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.6065306597126334, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.6065306597126334, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"tanh", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.9962720762207499, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.9962720762207499, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getArgument", ""}}), new String[][]{{"pow", "org.apache.commons.math.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.6366197723675814, -7.796343665038751E-17) {getArgument=-3.141592653589793, getImaginary=-7.796343665038751E-17, getReal=-0.6366197723675814, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"0.6283185307179586"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"2.0", "-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.0, -1.0) {getArgument=-0.4636476090008061, getImaginary=-1.0, getReal=2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"pow", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"abs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"0.5"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.5, 1.0) {getArgument=2.0344439357957027, getImaginary=1.0, getReal=-0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false), new String[][]{{"negate", "", "4"}, {"divide", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"tanh", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"cosh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}), new String[][]{{"log", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.1447298858494002, 1.5707963267948966) {getArgument=0.9410294873126003, getImaginary=1.5707963267948966, getReal=1.1447298858494002, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"NaN", "NaN"}, false), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"cosh", "", "1"}, {"sqrt1z", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 2.232630319679133) {getArgument=1.5707963267948966, getImaginary=2.232630319679133, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"20.0"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-21.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-21.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false), new String[][]{{"divide", "double", "0"}, {"multiply", "double", "5"}, {"conjugate", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "12.566370614359174"}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "100.0"}}), new String[][]{{"getField", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"1000.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:2>"}}), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1002.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1002.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"cosh", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.3246090892520057, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.3246090892520057, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}}), new String[][]{{"conjugate", "", "6"}, {"getReal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5430806348152437", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}), new String[][]{{"negate", "", "6"}, {"cos", "", "5"}, {"add", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.414213562373095, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.414213562373095, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false), new String[][]{{"getImaginary", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.761594155955765, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.761594155955765, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"getArgument", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "double", "25.11874122871835"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"exp", "", "1"}, {"divide", "org.apache.commons.math.complex.Complex", "6"}, {"multiply", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"-8.988465674311579E307", "-6.1956645166873969E18"}, false, 6, new String[][]{}), new String[][]{{"multiply", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false), new String[][]{{"add", "double", "4"}, {"sqrt1z", "", "6"}, {"getField", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false), new String[][]{{"cosh", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(11.591953275521519, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=11.591953275521519, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false), new String[][]{{"sin", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, Infinity) {getArgument=NaN, getImaginary=Infinity, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false), new String[][]{{"abs", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.36787944117144233", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false), new String[][]{{"add", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.5707963267948966, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false), new String[][]{{"multiply", "double", "5"}, {"add", "org.apache.commons.math.complex.Complex", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "double", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"20.25"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-20.25, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-20.25, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"62.83185307179586", "-3.0978322583436984E18"}, false), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -3.0978322583436984E18) {getArgument=-0.0, getImaginary=-3.0978322583436984E18, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false), new String[][]{{"add", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"multiply", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "3"}, {"sqrt", "", "5"}, {"sin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false), new String[][]{{"log", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"getArgument", "", "3"}, {"conjugate", "", "7"}, {"add", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1112539136", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"27.304185307179587", "-6195664516687396620"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"subtract", "double", "3"}, {"sin", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}, {"org.apache.commons.math.complex.Complex", "isInfinite", ""}}), new String[][]{{"getReal", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"1.0"}, false), new String[][]{{"exp", "", "1"}, {"divide", "org.apache.commons.math.complex.Complex", "6"}, {"multiply", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:3>"}, {"org.apache.commons.math.complex.Complex", "sin", ""}}), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "1"}, {"pow", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"4.0", "65.43185307179586"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(4.0, 65.43185307179586) {getArgument=1.5097400051793028, getImaginary=65.43185307179586, getReal=4.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"3.0978322583436984E18", "100.0"}, false), new String[][]{{"nthRoot", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(41953.14030257102, 3.385685279567225E-13), (2.5688889492861708E-12, 41953.14030257102), (-41953.14030257102, 5.1377778985723415E-12), (-7.706666847858512E-12, -41953.14030257102)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "divide", "org.apache.commons.math.complex.Complex", "<sample:1>"}}), new String[][]{{"exp", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.444667861009766, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.444667861009766, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.557407724654902, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.557407724654902, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false), new String[][]{{"getArgument", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "org.apache.commons.math.complex.Complex", "<sample:1>"}}), new String[][]{{"getReal", "", "7"}, {"pow", "double", "5"}, {"acos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"200.0", "4.0"}, true), new String[][]{{"abs", "", "1"}, {"asin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5507987430169716, 5.991658264562817) {getArgument=1.3175279633725354, getImaginary=5.991658264562817, getReal=1.5507987430169716, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}}), new String[][]{{"subtract", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, Infinity) {getArgument=2.356194490192345, getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"-1.34"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.34, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.34, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false), new String[][]{{"exp", "", "5"}, {"getImaginary", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}}), new String[][]{{"asin", "", "4"}, {"pow", "double", "6"}, {"sqrt1z", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.135050017612039, 1.5554947695748778E-17) {getArgument=1.3704195810219766E-17, getImaginary=1.5554947695748778E-17, getReal=1.135050017612039, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:La>"}}), new String[][]{{"divide", "double", "4"}, {"divide", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "abs", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"subtract", "double", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.5430806348152437, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=2.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false), new String[][]{{"getImaginary", "", "3"}, {"subtract", "double", "5"}, {"abs", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false), new String[][]{{"getImaginary", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"conjugate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(1.0, Infinity)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}, {"org.apache.commons.math.complex.Complex", "asin", ""}}), new String[][]{{"subtract", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -Infinity) {getArgument=-1.5707963267948966, getImaginary=-Infinity, getReal=0.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "double", "10.0"}}), new String[][]{{"cosh", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.149548905166106, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.149548905166106, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}}), new String[][]{{"removeAll", "java.util.Collection", "4"}, {"add", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "1"}, {"org.apache.commons.math.complex.Complex", "nthRoot", "int", "-2147483648"}}), new String[][]{{"log", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.2415644752704905, 3.141592653589793) {getArgument=1.6475376823833596, getImaginary=3.141592653589793, getReal=-0.2415644752704905, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"double"}, new String[]{"4.9E-324"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"sin", "", "1"}, {"acos", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.356194490192345, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=2.356194490192345, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "-10.0"}}), new String[][]{{"cos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.9330920755982086, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.9330920755982086, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false), new String[][]{{"multiply", "double", "3"}, {"acos", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(3.141592653589793, -1.0232274785475506) {getArgument=-0.314867988828903, getImaginary=-1.0232274785475506, getReal=3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"10.0"}, false, 4, new String[][]{}), new String[][]{{"tan", "", "4"}, {"log", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.1752011936438014, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.1752011936438014, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "3.0978322583436984E18"}}), new String[][]{{"sqrt1z", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.618990892446662, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.618990892446662, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "getArgument", ""}, {"org.apache.commons.math.complex.Complex", "pow", "double", "0.9999999999999999"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"6.283185307179587"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "-12.566370614359172"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-6.283185307179587, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-6.283185307179587, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "double", "62.83185307179586"}, {"org.apache.commons.math.complex.Complex", "abs", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-2.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "-2147483643"}, {"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"sinh", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "-Infinity", "1.9999999999999996"}}), new String[][]{{"getArgument", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getField", new String[]{}, new String[]{}, false), new String[][]{{"getOne", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false), new String[][]{{"negate", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.36787944117144233, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.2533141373155001) {getArgument=1.5707963267948966, getImaginary=1.2533141373155001, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"-6.1956645166873969E18", "-1.7976931348623155E308"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-6.1956645166873969E18, -1.7976931348623155E308) {getArgument=-1.5707963267948966, getImaginary=-1.7976931348623155E308, getReal=-6.1956645166873969E18, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "double", "NaN"}}), new String[][]{{"pow", "double", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 3.141592653589793) {getArgument=0.0, getImaginary=3.141592653589793, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"nthRoot", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(7.674335732947767E-17, 1.2533141373155001), (-2.30230071988433E-16, -1.2533141373155001)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.4142135623730951, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.4142135623730951, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"2.0", "-1.0"}, true), new String[][]{{"conjugate", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.0, 1.0) {getArgument=0.4636476090008061, getImaginary=1.0, getReal=2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}}), new String[][]{{"log", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.8414709848078965, -1.0) {getArgument=-2.2703179711434163, getImaginary=-1.0, getReal=-0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "3.0978322583436979E18", "-8.988465674311579E307"}}), new String[][]{{"getField", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false), new String[][]{{"getArgument", "", "1"}, {"isNaN", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false), new String[][]{{"atan", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7853981633974483, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"-1.0"}, true), new String[][]{{"nthRoot", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"1.0125"}, false), new String[][]{{"exp", "", "7"}, {"negate", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.3724493137139072, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-0.3724493137139072, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "0"}, {"getReal", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.1585290151921035", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 7, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getImaginary", ""}}), new String[][]{{"negate", "", "4"}, {"exp", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5825721107833085, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.5825721107833085, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false), new String[][]{{"getImaginary", "", "6"}, {"getField", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.ComplexField", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"double"}, new String[]{"0.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "-1"}}), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-2.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:K`>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}}), new String[][]{{"abs", "", "5"}, {"nthRoot", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(0.7788007830714049, 0.0), (4.7687794308092406E-17, 0.7788007830714049), (-0.7788007830714049, 9.537558861618481E-17), (-1.430633829242772E-16, -0.7788007830714049)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "10.0"}, {"org.apache.commons.math.complex.Complex", "add", "double", "2.0250000000000004"}}), new String[][]{{"add", "org.apache.commons.math.complex.Complex", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"-44.716814692820414", "-0.20249999999999999"}, true), new String[][]{{"negate", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(44.716814692820414, 0.20249999999999999) {getArgument=0.004528466912632554, getImaginary=0.20249999999999999, getReal=44.716814692820414, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getField", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}}), new String[][]{{"getZero", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"divide", "double", "5"}, {"getImaginary", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "6"}, {"multiply", "org.apache.commons.math.complex.Complex", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"0.021"}, false), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "4"}, {"negate", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"log", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.2723414689118315, 3.141592653589793) {getArgument=1.6572691273823663, getImaginary=3.141592653589793, getReal=-0.2723414689118315, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"-42.925"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "Infinity", "2.025"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(42.925, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=42.925, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 1.0) {getArgument=2.356194490192345, getImaginary=1.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "getArgument", ""}}), new String[][]{{"negate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.761594155955765, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.761594155955765, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}}), new String[][]{{"sqrt", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.2422079676186446, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.2422079676186446, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"-2.0"}, true), new String[][]{{"subtract", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-2.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-2.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "6.2681853071795866"}}), new String[][]{{"multiply", "double", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"cosh", "", "1"}, {"pow", "org.apache.commons.math.complex.Complex", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -1.2246467991473532E-16) {getArgument=-3.141592653589793, getImaginary=-1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}}), new String[][]{{"sqrt1z", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "double", "8.988465674311578E307"}}), new String[][]{{"subtract", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"10.000000000000002"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}), new String[][]{{"conjugate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"asin", "", "4"}, {"nthRoot", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "2.025"}, {"org.apache.commons.math.complex.Complex", "getField", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "conjugate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<i:2>"}}), new String[][]{{"multiply", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "asin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}), new String[][]{{"subtract", "double", "2"}, {"conjugate", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5707963267948966, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
