package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "+"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "\ufffe"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}}), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("+", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n+\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-24>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-24\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \ntrue\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "long", "-3852193713161395149"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "N"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nN\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "Q"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844112"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844112\t1\t33%\t33%\n0\t1\t33%\t67%\n1\t1\t33%\t100%\n {getSumFreq=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"-9"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "10"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "\t"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{" "}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844111"}, {"org.apache.commons.math.stat.Frequency", "getPct", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844111\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"m"}, false, 9, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3845586908418843986"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-3852193713161395148"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<s:ky>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "\uffff"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "\uffff"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "\uffff"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"9"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-3852193713161395148"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"9"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-3852193713161395148"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "n"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nn\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"9"}, false, 13, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-3852193713161395148"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "n"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nn\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"1048577"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}, {"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"a"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<sample:6>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"-2097156"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"62"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"e"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "\uffff"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"h"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "\uffff"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"2147483648"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"18014398509481929"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3845586908418844096"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-53"}, false, 13, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:H>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"2147483647"}, false, 13, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:H>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"2147483647"}, false, 13, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:H>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-3845586908418844112"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "0"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:1>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-1922863822953599733"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "0"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:1>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"2147483135"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483135\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 3, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"9205357638345293823"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "\t"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<d:58.0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "+"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<null>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nnull\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"\t"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"1073741823"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844111"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "1"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "a"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844111\t1\t33%\t33%\n1\t1\t33%\t67%\n1073741823\t1\t33%\t100%\n {getSumFreq=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"D"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:a>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "long", "-3852193713161395148"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"D"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nD\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{":"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n:\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"\""}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\"\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"I"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nI\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395148"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395148\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395148"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395148\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:C>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:42>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n42\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:[C>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:b>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:[C>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:[DCEH>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:h>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nh\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:[DCEH>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:[DCEH>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"-1"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"2"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:-2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3845586908418844099"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\ufffe"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"6"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:-57.45>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-57.45\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"-23"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "524293"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<d:-116.0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "1"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-3852193713161395149"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "n"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nn\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3852193713161395149"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-9223372036854775808"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-1926096856580697595"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-5385330807623994272"}, {"org.apache.commons.math.stat.Frequency", "getCount", "long", "7691173816837684124"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\t"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\t"}, false, 15, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"d"}, false, 15, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<d:58.0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:a>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:-65>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-31"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-31\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "\uffff"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:l>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "\000"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"/"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n/\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"."}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n.\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"l"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "a"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nl\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"L"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "a"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nL\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"n"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "a"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nn\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"\t"}, false, 10, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-3852193713161395148"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "clear", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<d:-57.45>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036854775807\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"4611686018427387903"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n4611686018427387903\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"2305843009213693951"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2305843009213693951\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-2305843009213693951"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2305843009213693951\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193713161395148"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395148\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"n"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"a"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\000"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\t"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "1"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"["}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-35"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-35\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"["}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-70"}, {"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-70\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:keyn>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkeyn\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3845586908418844111"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483647\t1\t50%\t50%\n1\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n1\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"9223372036854775807"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "\uffff"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-3852193713161395147"}, false, 15, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:0>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"7722401822684772246"}, false, 14, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-1"}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "\ufffe"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-3845586908418844111"}, false, 14, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "\ufffe"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-1922793454209422055"}, false, 14, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "\ufffe"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-1922793454209421993"}, false, 14, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:b>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "\ufffe"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"961396727104710996"}, false, 14, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:b>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "\ufffe"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\nb\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-1922793454209421993"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<s:l>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "\ufffe"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"\037"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-3845586908418844112"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", " "}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "!"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n!\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", " "}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}}), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals(" ", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "+"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}}), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("+", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n+\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "+"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "\ufffe"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}}), new String[][]{{"next", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("+", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n+\t1\t50%\t50%\n\ufffe\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "+"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "\ufffe"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}}), new String[][]{{"next", "", "0"}, {"next", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Character", actual.getClass().getName());
  assertEquals("\ufffe", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n+\t1\t50%\t50%\n\ufffe\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "+"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "\ufffe"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}}), new String[][]{{"next", "", "0"}, {"next", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:mb>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nmb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:mbi>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nmbi\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"1"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"28"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n28\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-8388580"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-8388580\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:>>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n>\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:7>>"}, false, 1, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n7>\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:7>>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3852193713161395149"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"_"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "\uffff"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\ufffe"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-7691173816837688222"}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "\ufffe"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nn\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-959137226414664028"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "-33"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:42>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n42\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:[DH>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:[DH>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-49>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-49\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:[DH>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-24>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-24\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"1"}, false, 13, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "1073741823"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "1"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "524293"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1073741823\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:1>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<d:58.0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<d:-58.0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "N"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-3852193713161395147"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nN\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\t"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-9223372036854775808\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\001"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-256"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-256\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\001"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-512"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-512\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\001"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "256"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n256\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-1922793454209422055"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:c>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:1.5>"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t0\t0%\t100%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:c>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:1.5>"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t1\t100%\t100%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-961396727104710996"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "1"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "1"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-1922793454209421993"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", " "}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395149"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395149\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "1073745920"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "0"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<s:kem?F>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-9223372036854775808"}, {"org.apache.commons.math.stat.Frequency", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-9223372036854775808\t1\t100%\t100%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-9223372036854775808\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-9223372036854775808"}, {"org.apache.commons.math.stat.Frequency", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-9223372036854775808\t0\t0%\t100%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-9223372036854775808\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:-1.29>"}}), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1.29\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-961396727104711027"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "0"}, {"org.apache.commons.math.stat.Frequency", "getPct", "long", "1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395149"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395149\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-961396727104711027"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "3852193713161395149"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3852193713161395149\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:-62>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-62\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:-119>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-119\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:-238>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-238\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:-476>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-476\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "1922793454209421993"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<d:-116.07>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-140737488355328"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<i:4>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:l>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nl\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<i:4>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:l>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nl\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<i:4>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:+>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n+\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "1073741823"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1073741823\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "536870911"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n536870911\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "a"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "536870911"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n536870911\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3845586908418844110"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "1073741822"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1073741822\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3845586908418844110"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "1073741822"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1073741822\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:-33554431>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "0"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-33554431\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:-33554431>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "0"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-33554431\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"\ufffe"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "\t"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "9223372036854775807"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036854775807\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-1922793454209421993"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1922793454209421993\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "1922793454209421993"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1922793454209421993\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<i:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"o"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395147"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395147\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"o"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-1926096856580697573"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1926096856580697573\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"T"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-1926096856580697548"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1926096856580697548\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"T"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395148"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395148\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"T"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395148"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395148\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:134>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<i:47>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n134\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:91>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3852193713161395148"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n91\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:-2147483648>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3852193713161395148"}, {"org.apache.commons.math.stat.Frequency", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395148"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395148\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n0\t0\t0\u00a0%\t100\u00a0%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "4"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n4\t0\t0\u00a0%\t100\u00a0%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n4\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-41"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-41\t0\t0\u00a0%\t100\u00a0%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-41\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "23"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n23\t0\t0\u00a0%\t100\u00a0%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n23\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "\t"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-9223372036854775808"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-9223372036854775808\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395149"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395149\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-1926096856580697574"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1926096856580697574\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "3852193713161395149"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3845586908418844110"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3852193713161395149\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3852193713161395148"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3852193713161395148"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3852193713161395148"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-2145386496"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-4611686018427387903"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2145386496\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"0"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<i:2>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"48"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<i:2>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n48\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-48"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<i:2>"}, {"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-48\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"8388656"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<i:2>"}, {"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n8388656\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"23"}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "\000"}, {"org.apache.commons.math.stat.Frequency", "clear", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n23\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-32745"}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "\000"}, {"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "a"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-32745\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-32771"}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "\000"}, {"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "a"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-32771\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "\000"}, {"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "a"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-1073741824"}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "a"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1073741824\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-4611685880988434432"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-4611685880988434432"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"1073741823"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-4611685880988434432"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1073741823\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<d:-28.725>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t50%\t50%\na\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<d:-28.725>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "10"}}), new String[][]{{"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "0"}}, 1), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "a"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-44"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-44\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-87"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-87\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-174"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-174\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-174"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"673"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<d:1.5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n673\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"663"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<d:58.0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n663\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"hasNext", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}}, 3), new String[][]{{"hasNext", "", "3"}, {"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "9223372036854775807"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036854775807\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "9223372036854775807"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036854775807\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-3852193713161395148"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-3852193713161395148"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "W"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nW\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-3852193713161395148"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nd\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:b1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:b1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "\ufffe"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "P"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "p"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-1073741824"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "q"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844112"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844112\t1\t33%\t33%\n1\t2\t67%\t100%\n {getSumFreq=3}", SearchInputFactory_scaffolding.receiverState());
 }
}
