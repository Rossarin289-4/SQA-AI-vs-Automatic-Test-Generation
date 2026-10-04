package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"NaN"}, true, 0, null, 3), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.7976931348623157E308"}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"tan", "", "2"}, {"subtract", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2), new String[][]{{"acos", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"1.0"}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "10"}, {"org.apache.commons.math.complex.Complex", "hashCode", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"2.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.5, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}, 2), new String[][]{{"conjugate", "", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "toString", ""}, {"org.apache.commons.math.complex.Complex", "nthRoot", "int", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, NaN) {getArgument=NaN, getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 3), new String[][]{{"atan", "", "2"}, {"isInfinite", "", "1"}, {"divide", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:4>"}}), new String[][]{{"divide", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"6.283185307179586"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}}, 1), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "4"}, {"subtract", "double", "7"}, {"getReal", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "createComplex", new String[]{"double", "double"}, new String[]{"12.566370614359172", "0.5066"}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "double", "-Infinity"}, {"org.apache.commons.math.complex.Complex", "nthRoot", "int", "0"}, {"org.apache.commons.math.complex.Complex", "hashCode", ""}}, 1), new String[][]{{"cos", "", "2"}, {"subtract", "org.apache.commons.math.complex.Complex", "0"}, {"multiply", "org.apache.commons.math.complex.Complex", "6"}, {"pow", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:10>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:7>"}, {"org.apache.commons.math.complex.Complex", "exp", ""}}), new String[][]{{"negate", "", "2"}, {"divide", "org.apache.commons.math.complex.Complex", "6"}, {"nthRoot", "int", "7"}, {"retainAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:10>"}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "-1.7976931348623157E308", "0.0"}}), new String[][]{{"cos", "", "6"}, {"divide", "org.apache.commons.math.complex.Complex", "6"}, {"nthRoot", "int", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(NaN, NaN)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:6>"}, {"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "atan", ""}}, 2), new String[][]{{"acos", "", "2"}, {"add", "org.apache.commons.math.complex.Complex", "6"}, {"divide", "org.apache.commons.math.complex.Complex", "6"}, {"subtract", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"Infinity"}, false, 5, new String[][]{}, 3), new String[][]{{"multiply", "org.apache.commons.math.complex.Complex", "1"}, {"isNaN", "", "0"}, {"add", "org.apache.commons.math.complex.Complex", "3"}, {"negate", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "asin", ""}}, 3), new String[][]{{"getField", "", "3"}, {"getZero", "", "1"}, {"pow", "double", "1"}, {"sqrt1z", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "double", "1.7976931348623157E308"}, {"org.apache.commons.math.complex.Complex", "conjugate", ""}}), new String[][]{{"subtract", "org.apache.commons.math.complex.Complex", "4"}, {"exp", "", "6"}, {"cos", "", "6"}, {"atan", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tan", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:kdy>"}}, 1), new String[][]{{"atan", "", "4"}, {"subtract", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, Infinity) {getArgument=2.356194490192345, getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"NaN", "-1.2391329033374796E19"}, true), new String[][]{{"pow", "double", "0"}, {"sqrt1z", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"306.4092653589793", "NaN"}, true), new String[][]{{"pow", "double", "7"}, {"sqrt1z", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"double"}, new String[]{"NaN"}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "asin", ""}, {"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<s:kmm>"}, {"org.apache.commons.math.complex.Complex", "atan", ""}}), new String[][]{{"multiply", "double", "6"}, {"nthRoot", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(NaN, NaN)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"NaN"}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "-6195664516687396620"}, {"org.apache.commons.math.complex.Complex", "atan", ""}, {"org.apache.commons.math.complex.Complex", "log", ""}}, 3), new String[][]{{"sin", "", "0"}, {"add", "double", "0"}, {"getArgument", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "toString", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:0>"}, {"org.apache.commons.math.complex.Complex", "divide", "double", "NaN"}}, 2), new String[][]{{"divide", "double", "2"}, {"exp", "", "3"}, {"conjugate", "", "4"}, {"tan", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:3>"}, {"org.apache.commons.math.complex.Complex", "getImaginary", ""}}), new String[][]{{"pow", "double", "4"}, {"isInfinite", "", "0"}, {"cosh", "", "7"}, {"sinh", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "toString", ""}, {"org.apache.commons.math.complex.Complex", "pow", "double", "NaN"}}, 3), new String[][]{{"tanh", "", "5"}, {"abs", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"double"}, new String[]{"NaN"}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "getArgument", ""}}, 1), new String[][]{{"asin", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:1>"}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:1>"}, {"org.apache.commons.math.complex.Complex", "abs", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"6.283185307179586", "1.7976931348623157E308"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.283185307179586, 1.7976931348623157E308) {getArgument=1.5707963267948966, getImaginary=1.7976931348623157E308, getReal=6.283185307179586, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"6.283185307179586", "Infinity"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.283185307179586, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=6.283185307179586, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"12.566370614359172", "1.7976931348623157E308"}, true, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(12.566370614359172, 1.7976931348623157E308) {getArgument=1.5707963267948966, getImaginary=1.7976931348623157E308, getReal=12.566370614359172, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"12.566370614359172", "Infinity"}, true, 0, null, 3), new String[][]{{"sin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, Infinity) {getArgument=2.356194490192345, getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"12.766370614359172", "Infinity"}, true, 0, null, 3), new String[][]{{"sin", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7853981633974483, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7853981633974483, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"asin", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2), new String[][]{{"asin", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.9033391107665127, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.9033391107665127, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "-1.0"}}, 2), new String[][]{{"asin", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.9033391107665127, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.9033391107665127, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2), new String[][]{{"asin", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 10, new String[][]{}, 2), new String[][]{{"asin", "", "3"}, {"cos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2), new String[][]{{"asin", "", "3"}, {"cos", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"2.0"}, true, 0, null, 3), new String[][]{{"nthRoot", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"2.0"}, true, 0, null, 3), new String[][]{{"isNaN", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5430806348152437, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.5430806348152437, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, NaN) {getArgument=NaN, getImaginary=NaN, getReal=Infinity, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"abs", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 7, new String[][]{}, 2), new String[][]{{"abs", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}, 2), new String[][]{{"abs", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}, 2), new String[][]{{"abs", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5430806348152437", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:7>"}, {"org.apache.commons.math.complex.Complex", "acos", ""}}, 2), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -1.5430806348152437) {getArgument=-1.5707963267948966, getImaginary=-1.5430806348152437, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}, 2), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -1.0) {getArgument=-1.5707963267948966, getImaginary=-1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}, 2), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"pow", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}, 2), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"pow", "double", "2"}, {"subtract", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.7976931348623157E308"}}, 2), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"tan", "", "2"}, {"subtract", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.4932167668855038) {getArgument=-1.5707963267948966, getImaginary=-0.4932167668855038, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.7976931348623157E308"}}, 2), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"add", "org.apache.commons.math.complex.Complex", "2"}, {"subtract", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.5403023058681398) {getArgument=-0.49536728921867335, getImaginary=-0.5403023058681398, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"-262186"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math.complex.Complex", "add", "double", "-0.011"}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:8>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"10"}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math.complex.Complex", "add", "double", "-0.011"}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<null>"}}, 1), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(1.0, 0.0), (0.8090169943749475, 0.5877852522924731), (0.30901699437494745, 0.9510565162951535), (-0.30901699437494734, 0.9510565162951536), (-0.8090169943749473, 0.5877852522924732), (-1.0, 1.224646...#391#-1160134587", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 1), new String[][]{{"multiply", "double", "6"}, {"abs", "", "0"}, {"sin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.9996159447946292, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.9996159447946292, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}}, 1), new String[][]{{"multiply", "double", "6"}, {"abs", "", "0"}, {"sin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.5143952585235492, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.5143952585235492, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"multiply", "double", "6"}, {"abs", "", "0"}, {"sin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.9996159447946292, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.9996159447946292, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"multiply", "double", "6"}, {"abs", "", "0"}, {"sin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"multiply", "double", "6"}, {"abs", "", "0"}, {"sin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 0, null, 1), new String[][]{{"log", "", "2"}, {"asin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.862295743310848) {getArgument=1.5707963267948966, getImaginary=1.862295743310848, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, null, 1), new String[][]{{"log", "", "2"}, {"asin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"6.299185307179587"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.589853949607668, 0.8075099492465927) {getArgument=0.9399183630973972, getImaginary=0.8075099492465927, getReal=0.589853949607668, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"6.361185307179587"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.4224069955141274, 0.9064062721212425) {getArgument=1.134697107619963, getImaginary=0.9064062721212425, getReal=0.4224069955141274, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -1.2246467991473532E-16) {getArgument=-3.141592653589793, getImaginary=-1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"negate", "", "3"}, {"conjugate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, Infinity) {getArgument=2.356194490192345, getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"negate", "", "3"}, {"conjugate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7853981633974483, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"negate", "", "3"}, {"conjugate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"negate", "", "3"}, {"conjugate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"negate", "", "3"}, {"conjugate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7853981633974483, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3), new String[][]{{"negate", "", "3"}, {"conjugate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"negate", "", "3"}, {"conjugate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}}, 3), new String[][]{{"negate", "", "3"}, {"conjugate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.761594155955765, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.761594155955765, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "abs", ""}, {"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2), new String[][]{{"multiply", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, 0.0) {getArgument=NaN, getImaginary=0.0, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2), new String[][]{{"acos", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.4365658100345553, 1.1102230246251565E-16) {getArgument=4.5565074419615674E-17, getImaginary=1.1102230246251565E-16, getReal=2.4365658100345553, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 2), new String[][]{{"acos", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.5707963267948966, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "10"}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 5.562684646268003E-309) {getArgument=0.0, getImaginary=5.562684646268003E-309, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-1.7976931348623155E308"}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "10"}, {"org.apache.commons.math.complex.Complex", "hashCode", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 5.562684646268003E-309) {getArgument=0.0, getImaginary=5.562684646268003E-309, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"1.0"}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "10"}, {"org.apache.commons.math.complex.Complex", "hashCode", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-1.0"}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "10"}, {"org.apache.commons.math.complex.Complex", "hashCode", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "0.0"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-2.0"}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "10"}, {"org.apache.commons.math.complex.Complex", "hashCode", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-0.016"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.5, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"2.0"}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-0.016"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.5, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"2.1300000000000003"}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-0.016"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.4694835680751173, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.4694835680751173, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"1.0650000000000002"}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-0.016"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.9389671361502346, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.9389671361502346, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"8.988465674311579E307"}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "hashCode", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-0.016"}}, 3), new String[][]{{"asin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double", "double"}, new String[]{"6.283185307179586", "1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.283185307179586, 1.7976931348623157E308) {getArgument=1.5707963267948966, getImaginary=1.7976931348623157E308, getReal=6.283185307179586, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"Infinity"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"Infinity"}, false), new String[][]{{"getImaginary", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "0.0", "6.283185307179586"}, {"org.apache.commons.math.complex.Complex", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, -1.0) {getArgument=-1.5707963267948966, getImaginary=-1.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "0.0", "6.283185307179586"}, {"org.apache.commons.math.complex.Complex", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "1.7976931348623157E308", "6.283185307179586"}, {"org.apache.commons.math.complex.Complex", "negate", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "1.7976931348623157E308", "6.283185307179586"}, {"org.apache.commons.math.complex.Complex", "negate", ""}, {"org.apache.commons.math.complex.Complex", "getImaginary", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "1.7976931348623157E308", "6.283185307179586"}, {"org.apache.commons.math.complex.Complex", "negate", ""}, {"org.apache.commons.math.complex.Complex", "getImaginary", ""}}), new String[][]{{"multiply", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NullArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}), new String[][]{{"sqrt", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}), new String[][]{{"sqrt", "", "2"}, {"multiply", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}), new String[][]{{"sqrt", "", "2"}, {"multiply", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}), new String[][]{{"sqrt", "", "2"}, {"multiply", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}), new String[][]{{"sqrt", "", "2"}, {"multiply", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}), new String[][]{{"sqrt", "", "2"}, {"multiply", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "toString", ""}, {"org.apache.commons.math.complex.Complex", "pow", "org.apache.commons.math.complex.Complex", "<sample:7>"}}), new String[][]{{"sqrt", "", "2"}, {"multiply", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 5, new String[][]{}), new String[][]{{"sqrt", "", "2"}, {"multiply", "double", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, -1.0) {getArgument=-1.5707963267948966, getImaginary=-1.0, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "negate", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -0.0) {getArgument=-3.141592653589793, getImaginary=-0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.7853981633974483, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7853981633974483, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.7853981633974483, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"1.0"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"1.0"}, true), new String[][]{{"nthRoot", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.7976931348623157E308"}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"tan", "", "2"}, {"subtract", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.4932167668855038) {getArgument=-1.5707963267948966, getImaginary=-0.4932167668855038, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.7976931348623157E308"}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"tan", "", "2"}, {"subtract", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.9126365759632115) {getArgument=-1.5707963267948966, getImaginary=-0.9126365759632115, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "double", "6.283185307179586"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.761594155955765, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.761594155955765, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "getArgument", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.7976931348623157E308"}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"tan", "", "2"}, {"subtract", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.7976931348623157E308"}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"tan", "", "2"}, {"subtract", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.7976931348623157E308"}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"tan", "", "2"}, {"subtract", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.9126365759632115) {getArgument=-1.5707963267948966, getImaginary=-0.9126365759632115, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.7976931348623157E308"}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"tan", "", "2"}, {"subtract", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.761594155955765) {getArgument=-1.5707963267948966, getImaginary=-0.761594155955765, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.7976931348623157E308"}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"tan", "", "2"}, {"subtract", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "-1.7976931348623157E308"}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "1"}, {"tan", "", "2"}, {"subtract", "double", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "valueOf", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, true);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.7976931348623157E308, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.7976931348623157E308, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(-1.0, 1.2246467991473532E-16)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(0.7071067811865476, 0.7071067811865475), (-0.7071067811865475, 0.7071067811865476), (-0.7071067811865477, -0.7071067811865475), (0.7071067811865474, -0.7071067811865477)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(0.5000000000000001, 0.8660254037844386), (-1.0, 1.2246467991473532E-16), (0.49999999999999933, -0.866025403784439)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"3"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<i:2>"}, {"org.apache.commons.math.complex.Complex", "add", "double", "0.0"}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(0.5000000000000001, 0.8660254037844386), (-1.0, 1.2246467991473532E-16), (0.49999999999999933, -0.866025403784439)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math.complex.Complex", "add", "double", "0.0"}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(6.123233995736766E-17, 1.0), (-1.8369701987210297E-16, -1.0)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math.complex.Complex", "add", "double", "0.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.apache.commons.math.exception.NotPositiveException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"262102"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "equals", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math.complex.Complex", "add", "double", "0.0"}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:8>"}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isNaN", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"5"}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "-0.011"}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<null>"}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(1.0, 0.0), (0.30901699437494745, 0.9510565162951535), (-0.8090169943749473, 0.5877852522924732), (-0.8090169943749476, -0.587785252292473), (0.30901699437494723, -0.9510565162951536)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"2"}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "-0.011"}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<null>"}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(1.0, 0.0), (-1.0, 1.2246467991473532E-16)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("3.141592653589793", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"1"}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "add", "double", "-0.0055"}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<null>"}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(1.0, 0.0)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"3"}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(1.0, 0.0), (-0.4999999999999998, 0.8660254037844387), (-0.5000000000000004, -0.8660254037844384)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "nthRoot", new String[]{"int"}, new String[]{"66"}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(0.9997167946931291, 0.023797697546107513), (0.9929278846732883, 0.11871906265730518), (0.9771468659711595, 0.21256528955297666), (0.9525166539358605, 0.304486492269907), (0.9192603035816657, 0.39365...#2855#-1174170277", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "log", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.8414709848078965, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "log", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.1752011936438014) {getArgument=1.5707963267948966, getImaginary=1.1752011936438014, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "log", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.8414709848078965, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "log", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "exp", ""}, {"org.apache.commons.math.complex.Complex", "log", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false), new String[][]{{"log", "", "2"}, {"isInfinite", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false), new String[][]{{"log", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.7853981633974483) {getArgument=0.0, getImaginary=0.7853981633974483, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false), new String[][]{{"log", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false), new String[][]{{"log", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -1.5707963267948966) {getArgument=-1.5707963267948966, getImaginary=-1.5707963267948966, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false), new String[][]{{"log", "", "2"}, {"asin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -1.233403117511217) {getArgument=-1.5707963267948966, getImaginary=-1.233403117511217, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false), new String[][]{{"log", "", "2"}, {"asin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}}), new String[][]{{"log", "", "2"}, {"asin", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"6.283185307179586"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.62968172529648, 0.7768532196159377) {getArgument=0.8896528806399565, getImaginary=0.7768532196159377, getReal=0.62968172529648, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"6.299185307179587"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.589853949607668, 0.8075099492465927) {getArgument=0.9399183630973972, getImaginary=0.8075099492465927, getReal=0.589853949607668, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"-1.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -1.2246467991473532E-16) {getArgument=-3.141592653589793, getImaginary=-1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"-1.0"}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "cos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"sqrt", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.2422079676186446, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.2422079676186446, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"sqrt", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7350525871447157, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.7350525871447157, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tan", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.557407724654902, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.557407724654902, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cosh", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"sqrt", "", "5"}, {"tan", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.9329954010225774, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=2.9329954010225774, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "cos", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.5403023058681398, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.5403023058681398, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"negate", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -Infinity) {getArgument=-2.356194490192345, getImaginary=-Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 1, new String[][]{}), new String[][]{{"negate", "", "3"}, {"conjugate", "", "4"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, Infinity) {getArgument=2.356194490192345, getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sqrt1z", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getImaginary", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.557407724654902) {getArgument=1.5707963267948966, getImaginary=1.557407724654902, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sinh", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.1752011936438014, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.1752011936438014, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.761594155955765, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.761594155955765, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, 0.0) {getArgument=NaN, getImaginary=0.0, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "NaN", "1.7976931348623157E308"}}), new String[][]{{"getReal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"getReal", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-0.761594155955765", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, -0.0) {getArgument=NaN, getImaginary=-0.0, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"divide", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "tanh", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"divide", "double", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "10"}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(5.562684646268003E-309, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=5.562684646268003E-309, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "nthRoot", "int", "10"}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "0.0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 5.562684646268003E-309) {getArgument=0.0, getImaginary=5.562684646268003E-309, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-6.1956645166873979E18"}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "multiply", "double", "NaN"}}, 3), new String[][]{{"asin", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-3.0978322583436989E18"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getArgument", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}}, 3), new String[][]{{"asin", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(3.228063744596244E-19, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=3.228063744596244E-19, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"double"}, new String[]{"-6.1956645166873984E17"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getArgument", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}}, 3), new String[][]{{"asin", "", "6"}, {"sqrt", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.27044554086278E-9, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.27044554086278E-9, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "0"}, {"asin", "", "1"}, {"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "0"}, {"asin", "", "1"}, {"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.7071067811865476, -0.7071067811865475) {getArgument=-0.7853981633974483, getImaginary=-0.7071067811865475, getReal=0.7071067811865476, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "sin", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}}), new String[][]{{"divide", "org.apache.commons.math.complex.Complex", "0"}, {"asin", "", "1"}, {"sqrt", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "log", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(1.0, Infinity)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.complex.Complex", "log", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-1.0, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "isInfinite", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-2.0, -Infinity) {getArgument=-1.5707963267948966, getImaginary=-Infinity, getReal=-2.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.04321391826377226, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.04321391826377226, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 1.2246467991473532E-16) {getArgument=3.141592653589793, getImaginary=1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -1.2246467991473532E-16) {getArgument=-3.141592653589793, getImaginary=-1.2246467991473532E-16, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:11>"}, false), new String[][]{{"log", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-3.141592653589793, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-3.141592653589793, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:11>"}, false, 11, new String[][]{}), new String[][]{{"log", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.5707963267948966, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:11>"}, false, 12, new String[][]{}), new String[][]{{"log", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, false, 11, new String[][]{}), new String[][]{{"log", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.5707963267948966) {getArgument=1.5707963267948966, getImaginary=1.5707963267948966, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:10>"}, false, 11, new String[][]{}, 3), new String[][]{{"log", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 11, new String[][]{}, 3), new String[][]{{"log", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.5707963267948966, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.5707963267948966, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}}, 3), new String[][]{{"log", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}, {"org.apache.commons.math.complex.Complex", "sqrt1z", ""}}, 3), new String[][]{{"log", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.5707963267948966) {getArgument=1.5707963267948966, getImaginary=1.5707963267948966, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.123233995736766E-17, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=6.123233995736766E-17, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:2>"}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "conjugate", ""}, {"org.apache.commons.math.complex.Complex", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.123233995736766E-17, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=6.123233995736766E-17, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "multiply", new String[]{"double"}, new String[]{"-6.1956645166873984E17"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(6.1956645166873984E17, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=6.1956645166873984E17, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:6>"}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}}), new String[][]{{"exp", "", "5"}, {"sqrt1z", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.36787944117144233, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:8>"}}), new String[][]{{"sinh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.37623361672720984, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.37623361672720984, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:8>"}}), new String[][]{{"sinh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.3778144811861532, 0.8571314157170596) {getArgument=1.1556282462801113, getImaginary=0.8571314157170596, getReal=0.3778144811861532, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "exp", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:8>"}}), new String[][]{{"sinh", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(7.544137102816975, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=7.544137102816975, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 3.141592653589793) {getArgument=1.5707963267948966, getImaginary=3.141592653589793, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 1.5707963267948966) {getArgument=1.5707963267948966, getImaginary=1.5707963267948966, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -0.7853981633974483) {getArgument=-0.0, getImaginary=-0.7853981633974483, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "log", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -0.7853981633974483) {getArgument=-0.0, getImaginary=-0.7853981633974483, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, false);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getArgument", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:8>"}, false), new String[][]{{"sin", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.8414709848078965, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false), new String[][]{{"sin", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.8414709848078965, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.8414709848078965, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "divide", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 1, new String[][]{}), new String[][]{{"sin", "", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.0, -1.1752011936438014) {getArgument=-1.5707963267948966, getImaginary=-1.1752011936438014, getReal=-0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}}), new String[][]{{"exp", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.36787944117144233, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}}, 2), new String[][]{{"exp", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.36787944117144233, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.36787944117144233, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}}, 2), new String[][]{{"exp", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "readResolve", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "isNaN", ""}, {"org.apache.commons.math.complex.Complex", "subtract", "double", "-6.1956645166873984E17"}}, 2), new String[][]{{"exp", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"conjugate", "", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 1), new String[][]{{"conjugate", "", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 1), new String[][]{{"conjugate", "", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"conjugate", "", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"conjugate", "", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}), new String[][]{{"conjugate", "", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}, 2), new String[][]{{"conjugate", "", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}, 2), new String[][]{{"conjugate", "", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, Infinity) {getArgument=0.7853981633974483, getImaginary=Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}, 2), new String[][]{{"conjugate", "", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}, 2), new String[][]{{"conjugate", "", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}, 2), new String[][]{{"conjugate", "", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}, {"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}), new String[][]{{"multiply", "double", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}, {"conjugate", "", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.complex.Complex", "negate", ""}, {"org.apache.commons.math.complex.Complex", "tanh", ""}, {"org.apache.commons.math.complex.Complex", "readResolve", ""}}), new String[][]{{"multiply", "double", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}, {"divide", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -Infinity) {getArgument=-2.356194490192345, getImaginary=-Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 1), new String[][]{{"multiply", "double", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}, {"divide", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 1), new String[][]{{"multiply", "double", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}, {"divide", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -Infinity) {getArgument=-2.356194490192345, getImaginary=-Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "acos", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.apache.commons.math.complex.Complex", "tanh", ""}}, 1), new String[][]{{"multiply", "double", "7"}, {"multiply", "org.apache.commons.math.complex.Complex", "7"}, {"divide", "double", "1"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -Infinity) {getArgument=-2.356194490192345, getImaginary=-Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-1.0, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(0.0, 1.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(1.0, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.complex.Complex", "getField", ""}, {"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(0.0, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "getReal", ""}, {"org.apache.commons.math.complex.Complex", "divide", "double", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(0.0, 0.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "toString", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "divide", "double", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0)", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}), new String[][]{{"sinh", "", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}), new String[][]{{"sinh", "", "2"}, {"add", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"-1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}), new String[][]{{"sinh", "", "2"}, {"add", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "pow", new String[]{"double"}, new String[]{"1.7976931348623157E308"}, false, 4, new String[][]{{"org.apache.commons.math.complex.Complex", "isInfinite", ""}}, 2), new String[][]{{"sinh", "", "2"}, {"add", "double", "2"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, Infinity) {getArgument=1.5707963267948966, getImaginary=Infinity, getReal=1.0, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}}), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}}), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}}), new String[][]{{"isNaN", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}}), new String[][]{{"isNaN", "", "6"}, {"exp", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(2.1932800507380152, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=2.1932800507380152, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.complex.Complex", "multiply", "org.apache.commons.math.complex.Complex", "<sample:1>"}, {"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}}), new String[][]{{"isNaN", "", "6"}, {"exp", "", "7"}, {"add", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}}), new String[][]{{"isNaN", "", "6"}, {"exp", "", "7"}, {"add", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(Infinity, -Infinity) {getArgument=-0.7853981633974483, getImaginary=-Infinity, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "atan", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}}), new String[][]{{"isNaN", "", "6"}, {"exp", "", "7"}, {"add", "org.apache.commons.math.complex.Complex", "3"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(NaN, NaN) {getArgument=NaN, getImaginary=NaN, getReal=NaN, isInfinite=false, isNaN=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"double"}, new String[]{"1.0"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"double"}, new String[]{"0.949"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.051000000000000045, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.051000000000000045, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"double"}, new String[]{"0.4745"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-0.5255000000000001, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-0.5255000000000001, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"double"}, new String[]{"2.3745000000000003"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.3745000000000003, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.3745000000000003, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"double"}, new String[]{"2.4025000000000007"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "subtract", "org.apache.commons.math.complex.Complex", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(1.4025000000000007, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.4025000000000007, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"double"}, new String[]{"1.1462500000000004"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.14625000000000044, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.14625000000000044, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"double"}, new String[]{"1.1462500000000004"}, false, 9, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "add", new String[]{"double"}, new String[]{"1.1462500000000004"}, false, 9, new String[][]{}, 3), new String[][]{{"exp", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, -0.0) {getArgument=-0.0, getImaginary=-0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-Infinity, -1.0) {getArgument=-3.141592653589793, getImaginary=-1.0, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sqrt1z", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "-1.7976931348623157E308", "-6.1956645166873984E17"}, {"org.apache.commons.math.complex.Complex", "asin", ""}});
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, Infinity) {getArgument=2.356194490192345, getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "-1.7976931348623157E308", "-6.1956645166873984E17"}, {"org.apache.commons.math.complex.Complex", "asin", ""}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-Infinity, Infinity) {getArgument=2.356194490192345, getImaginary=Infinity, getReal=-Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "-1.7976931348623157E308", "-6.1956645166873984E17"}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(0.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "createComplex", "double,double", "-1.7976931348623157E308", "-6.1956645166873984E17"}, {"org.apache.commons.math.complex.Complex", "sinh", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(-1.0, -1.0) {getArgument=-2.356194490192345, getImaginary=-1.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "sinh", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.apache.commons.math.complex.Complex", actual.getClass().getName());
  assertEquals("(Infinity, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=Infinity, isInfinite=true, isNaN=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5707963267948966", String.valueOf(actual));
  assertEquals("receiver state after the call", "(0.0, 1.0) {getArgument=1.5707963267948966, getImaginary=1.0, getReal=0.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "getArgument", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.complex.Complex", "cosh", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "(1.0, 0.0) {getArgument=0.0, getImaginary=0.0, getReal=1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"negate", "", "0"}, {"nthRoot", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(0.0, -0.0), (0.0, 0.0), (-0.0, 0.0), (-0.0, -0.0)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.complex.Complex", "org.apache.commons.math.complex.Complex", "subtract", new String[]{"org.apache.commons.math.complex.Complex"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.apache.commons.math.complex.Complex", "readResolve", ""}, {"org.apache.commons.math.complex.Complex", "acos", ""}}), new String[][]{{"negate", "", "0"}, {"nthRoot", "int", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[(Infinity, Infinity)]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "(-1.0, 0.0) {getArgument=3.141592653589793, getImaginary=0.0, getReal=-1.0, isInfinite=false, isNaN=false}", SearchInputFactory_scaffolding.receiverState());
 }
}
