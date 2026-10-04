package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"l"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", " "}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<i:-131072>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"3834179314651913202"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "m"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"6"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "97"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "4194358"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n97\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-3852193713161395152"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:\t\t>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:-2147483648>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483647"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483647\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-2147483626"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-1922793454209422094"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<i:16>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"+"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "i"}, {"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<s:\t>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \ni\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"20"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2228223"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2228223\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:-131029>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3834181513675168716"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-41>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3834181513675168716\t1\t50%\t50%\n-41\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<i:-41>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<b:true>"}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "!"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-2"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3845586908418844110"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"+"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n+\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:-131029>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:1.5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-131029\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "E"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "7"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n7\t1\t50%\t50%\nE\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:2>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-82"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-82\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"/"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-17592186044416"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-4064", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-17592186044416\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\\"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3852184917068372951"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:\t>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "A"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-93"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-93\t1\t100\u00a0%\t100\u00a0%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-93\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-194"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("223", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-194\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{","}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "\""}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Comparable", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\"\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "hashCode", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "P"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("112", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nP\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n0\t0\t0\u00a0%\t100\u00a0%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"2"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:o>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "9223336852482686975"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223336852482686975\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"2147483629"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"10"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"-2147483648"}, false, 3, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "c"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:d>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nd\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-13"}}, 2), new String[][]{{"hasNext", "", "3"}, {"hasNext", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-13\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"]"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "C"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:o>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:ley>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nley\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "b"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t50%\t50%\nb\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:-2>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:-160>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-160\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Comparable", "<s:key>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "hashCode", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "F"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nF\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "f"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<i:3>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("134", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nf\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"\001"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"E"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-2"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<i:-38>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:E\t>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<s:PPo>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "+"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n+\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:H>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nH\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"_"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:bB>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "D"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<b:true>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nbB\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"23"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-19"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-19\t1\t50%\t50%\n23\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<d:63.5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "130"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n63.5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:65>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<sample:2>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "int", "2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n65\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"61"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-4294967425"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"h"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Comparable", "<i:-2147483611>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "long", "8216"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "511"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3834179314651913164"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "hashCode", ""}, {"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<i:-41>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3834179314651913164\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-7"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-7\t1\t50%\t50%\n-1\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"-2147483612"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "9223372036854775807"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:\t\t>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-1922793454209422056"}, {"org.apache.commons.math.stat.Frequency", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1922793454209422056\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:2>"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"5"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "a"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t%100\t%100\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{" "}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:`>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n`\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "hashCode", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-1069547520"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-1069547520\t1\t100\u00a0%\t100\u00a0%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1069547520\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"218"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "l"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nl\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483647\t2\t67%\t67%\n2147483647\t1\t33%\t100%\n {getSumFreq=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<s:7>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "a"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713157200843"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<s:a\u00e9>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-1073741824"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1073741824\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-3834179314651913164"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3845586908418844070"}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "i"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "]"}, {"org.apache.commons.math.stat.Frequency", "getPct", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<s:\t>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-3845584709395588559"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"\uffff"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"17592186044416"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"54"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "\""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:\014>"}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"0"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-7668358629303826328"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:o>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-1922793454209422055"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713163492299"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713163492299\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "E"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"194"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"="}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n=\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "\""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("66", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\"\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"1"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"17592186044416"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1073741824\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "+"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n+\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"m"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nm\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "\000"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\""}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:-131072>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:\014d>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:77>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n77\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"e"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "#"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n#\t1\t50%\t50%\ne\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3852193713161395213"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"+"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:-33>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "P"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-33\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<d:15.0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<i:29>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n15.0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", ":"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n:\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-16"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-16\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<d:0.15>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0.15\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "1073741824"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-2147483644"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "16481"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483644\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"f"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852189315114883788"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852189315114883788\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"-1073741808"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "A"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nA\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"3845586908418975182"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "I"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3845586908418975182\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Comparable", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-62"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-62\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"*"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "}"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "2147483624"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n}\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<s:\u00e9>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-193"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-193\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"17592186044416"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", ":"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "!"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n!\t1\t50%\t50%\n:\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"u"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "3845586908418844110"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Comparable", "<i:-61>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-3852193713161395147"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "^"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n^\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"d"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "]"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n]\t1\t50%\t50%\nd\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"-194"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:a>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "char", ":"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-274877906945"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"1922793454209422055"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-7691173816837688220"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:25>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:62>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:1.5>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"2"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "#"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<d:1.524>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-3846712808325686709"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-11>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-11\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:\014>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-288230376151711746"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\014\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483606"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483606\t0\t0%\t100%\n1\t0\t0%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:64>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-131073"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<s:P>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-131073\t1\t50%\t50%\n64\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "}"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:\t\t>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3852193713161395136"}, {"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t\t\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-94"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-94\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:k>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nk\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:r>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "/"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nr\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:t?>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:65514>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n65514\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "\uffff"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\uffff\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-7704387426322790242"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "F"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nF\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"i"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "27"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n27\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-3845586908418844112"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "E"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Comparable", "<s:kez>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nE\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2096958"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2096958\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "D"}, {"org.apache.commons.math.stat.Frequency", "getPct", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nD\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"hasNext", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-1926096856580697573"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1926096856580697573\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<i:-131072>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "h"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nh\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3834179314651913164"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-1922793454209421992"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:-1073741824>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1922793454209421992\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:-65558>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1073741824\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483637"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:ea6>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483637\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<d:-1.5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{";"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "F"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nF\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:`>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "47"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n47\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483595>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "m"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nm\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:`>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1073741824\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-1922793454192644839"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nn\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"26"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2145386496"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<b:false>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "long", "-9223372036821221376"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2145386496\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"]"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-3845586908418844112"}, {"org.apache.commons.math.stat.Frequency", "getPct", "long", "-9222809086901354496"}}), new String[][]{{"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "5"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Comparable", "<b:true>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:>"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-3845586908418844125"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-1922793454209417959"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"p"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "20"}, {"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n20\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-6917529027641081856"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2049"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2049\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"!"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844110"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "L"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844110\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-3852193712087653324"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<s:\013>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-54"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", " "}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n \t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"3834179314651913141"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "0"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "9"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9\t1\t50%\t50%\n3834179314651913141\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:key>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "7"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"E"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"-"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"61"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "1"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Comparable", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<s:a7>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"17592186011648"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-1922793454209422055"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<i:-2147483648>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "E"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "]"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nE\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"4"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:ey>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \ney\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"hasNext", "", "7"}, {"remove", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"4"}, false, 4, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"459"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:57>"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n459\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-1926096856580697574"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "16777270"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n16777270\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3844461008512001488"}}, 3), new String[][]{{"next", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"39"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n39\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-218"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-218\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-3834179314651913420"}, false, 7, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-35>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-35\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-5"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Comparable", "<s:ke{y>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-3845586908418844149"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "l"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nl\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<s: \014>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<d:15.0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-1922230504256000743"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1922230504256000743\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "+"}, {"org.apache.commons.math.stat.Frequency", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n+\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:}>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n}\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "h"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<s:b<>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<s:a >"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-31"}, {"org.apache.commons.math.stat.Frequency", "getPct", "long", "-4097788487551591888"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-31\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "-2147418112"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "9223372036854775807"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<d:-0.10000000000000009>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036854775807\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<d:-4.0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-4.0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:262058>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n262058\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-1926096856580697573"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-3852193713161395147"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1926096856580697573\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:a5>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:\013>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "194"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-140"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-140\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-14"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"i"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"17592722915327"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-4521191813414912"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-4521191813414912\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "9223372036854775807"}, {"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<s:on>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"-"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-10"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-10\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s::\n>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"L"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \ntrue\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"!"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "n"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nn\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:29>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:\014>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\014\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"1"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "l"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nl\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844112"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844112\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036854775807\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-82"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<s:4o>"}, {"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<s:1\014>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-82\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:key6>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:-41>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey6\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3852193713161395149"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-49"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-1107296255"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1107296255\t1\t50%\t50%\n-49\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:h>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-2147483648>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "long", "-3845586908418844148"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<i:-2>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nfalse\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-39"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "194"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-39\t1\t50%\t50%\n194\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-47"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-47\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<s:\n>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "27"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n27\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-75"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "7"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:\014>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-75\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-1922793454209422055"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "17592186044361"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n17592186044361\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"17592186568724"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418843983"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418843983\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"184"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "E"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nE\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844111"}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "|"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844111\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:-59>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \ntrue\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"3852193713161395104"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "\t"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3852193713161395104\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "+"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "54"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n54\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3845586908418846133"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "E"}, {"org.apache.commons.math.stat.Frequency", "getPct", "long", "-3845586908418844110"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nE\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-1"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "10"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-2147483648"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "i"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-8388608>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-8388608\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"m"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:-88>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:-131029>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"17592186044416"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "6"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n6\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-7691173816837688224"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "4"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"2049"}, false, 3, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2049\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "114"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3845516539674666446"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n114\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"8219"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "\uffff"}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "\000"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n8219\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
