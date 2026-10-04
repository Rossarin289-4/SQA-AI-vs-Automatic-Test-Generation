package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-9223372036317642870"}, false, 13, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<d:-2.5949999999999998>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-9223372036317642870\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"A"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-1099511627775"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1099511627775\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:`,>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n0\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"E"}, false, 16, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-3852193713161395149"}, {"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3852193713161395149"}, {"org.apache.commons.math.stat.Frequency", "getPct", "int", "-1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nE\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"9223372036317904896"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "z"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036317904896\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<i:-63>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<i:-42>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:-2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2\t1\t50%\t50%\n0\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"-"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:->"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "A"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{":"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "0"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<b:false>"}, {"org.apache.commons.math.stat.Frequency", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"1"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t50%\t50%\n10\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"8"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Comparable", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<d:-1.5>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193713161395147"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395147\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-1926096856580697573"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1926096856580697573\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193713161395148"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395148\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193713161395156"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395156\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193713161395125"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395125\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"9223372036317904896"}, false, 13, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036317904896\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:1.5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:`,>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:0.75>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n`,\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:`,>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:0.075>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:-1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n`,\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:_,>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:0.075>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:-1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n_,\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:_8>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:0.075>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:-2147483648>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n_8\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:_08>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:0.075>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:-2147483648>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n_08\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:_080>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:0.075>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:-2147483648>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n_080\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:E9heBup>"}, false, 11, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nE9heBup\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:E9heup>"}, false, 11, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nE9heup\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:E9hetp>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nE9hetp\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:E9hetq>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<s:>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nE9hetq\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:Ehetq>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nEhetq\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:g\teq>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "hashCode", ""}, {"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \ng\teq\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-9223372036317642870"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-3845586908418844112"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "0"}, {"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3845586908418844112"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<sample:2>"}, false, 9, new String[][]{{"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"z"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:-42>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-9223356643155378656"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:6xaa>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3845586908418844111"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "h"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Comparable", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "10"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t50%\t50%\n2147483647\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "10"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "10"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t0\t0%\t100%\n10\t0\t0%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483647"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:-42>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "\000"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "\000"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "\000"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<d:0.075>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:`Gl>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:`TL>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:key>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "9223372036854775807"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<s:Akey>"}, false, 2, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "7"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "65546"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>82>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "7"}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", " "}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n7\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-3845586908418844112"}, {"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3852193713161395149"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"9223372036317642830"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<i:2>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "H"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<d:-6.25>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<d:-6.25>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:-2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"-122871"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3845586908418844110"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-963048428290348800"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "20"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:0.075>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:0.075>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "20"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t50%\t50%\n20\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"-17"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"n"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"9895604649983"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"9895604649983"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-1073741824"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1073741824\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"9895604649926"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-1073741764"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1073741764\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-10>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "\000"}, {"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<i:-42>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<s:ac>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:b>"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<s:ac>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:?b>"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n?b\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<s:x9rbb>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:?b>"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n?b\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<s:x2sbbb>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "7"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "char", "\uffff"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "char", "\uffff"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", " "}, {"org.apache.commons.math.stat.Frequency", "getPct", "char", "\uffff"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "7"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3845586908418844110"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "0"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Comparable", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"c"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Comparable", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"n"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Comparable", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<d:-1.5>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<d:-1.5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"H"}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<b:false>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "c"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nc\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"h"}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<b:false>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"h"}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<b:false>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "char", " "}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "b"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"="}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "\037"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "<"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n<\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"o"}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "c"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", ";"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n;\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<null>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"z"}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "b"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nH\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"z"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "b"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nH\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193713161395147"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395147\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "n"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"10"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-268435446"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-268435446\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-268959734"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-268959734\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-134479867"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-134479867\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<i:-1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-42>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:0.75>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-42\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:a+>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:2>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:0.75>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:a,>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:0.75>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na,\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:`,>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:0.75>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n`,\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:_W0W80>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:0.075>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n_W0W80\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}, {"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"9223372036317904896"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"7"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"8"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "40"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n40\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"7"}, false, 8, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-1099511627775"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1099511627775\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"7"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-1099511627775"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1099511627775\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"n"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<null>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395148"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395148\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3845586908418844110"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "hashCode", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"h"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nh\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"2147483647"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-3845586908418844111"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "b"}, {"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193713161395149"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395149\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-7704422610694879130"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-7704422610694879130\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-7704422610694879146"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-7704422610694879146\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "46"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n46\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:[5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:[5h>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483647"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<s:k{e}>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"10"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:`,>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Comparable", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-2147483648"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{" "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:30>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<s:3b\u00ea>"}, false, 14, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "D"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Comparable", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nD\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<d:0.7999999999999999>"}, false, 14, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "C"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Comparable", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nC\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<d:0.7999999999999999>"}, false, 14, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Comparable", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"A"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nA\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"2"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"H"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nH\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"P"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nP\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "7"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:-1.5>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1.5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "7"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:-0.15>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-0.15\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<s:b82>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "7"}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", " "}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n7\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-9223372036317642870"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "H"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nH\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "10"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Comparable", "<d:-2.5949999999999998>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<s:a>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t50%\t50%\n10\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<s:>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"4611686018427387904"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-1073741824"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "20"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "20"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:0.075>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t0\t0%\t100%\n0.075\t0\t0%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:0.075>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t50%\t50%\n20\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:0.075>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("3", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t0\t0%\t100%\n0.075\t0\t0%\t100%\n20\t0\t0%\t100%\n {getSumFreq=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:aC>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \naC\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"9895604649983"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"9895604649926"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<s:key>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-1073741764"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1073741764\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"4947802324963"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<s:key>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-536870882"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-536870882\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"2"}, false, 15, new String[][]{{"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3852193713161395149"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:0.075>"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0.075\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:0.15>"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0.15\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=true}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "7"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:`,>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n20\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-1926096856580697574"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-1922793454209422055"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "\uffff"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<d:-2.5949999999999998>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2.5949999999999998\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<d:-25.949999999999996>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-25.949999999999996\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"7"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:-2.5949999999999998>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-3852193713161395147"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844110"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844110\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"3852193713161395147"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844110"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844110\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "20"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n20\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "20"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n20\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "\000"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\000\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "\000"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\000\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"140731045904434"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:key>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "p"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:ub>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \np\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"140731045904434"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:keey>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "p"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:ub>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \np\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"140731045904434"}, false, 8, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:keey>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "p"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:ub>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \np\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-1"}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-1"}, false, 12, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<d:0.75>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \ntrue\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-3852193713161395150"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"34"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "1"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<d:3.0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"b"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"z"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2130706432"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2130706432\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"^"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "h"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nh\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:57>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"9223372036317904896"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036317904896\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-3845586908418844110"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:1.5>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395147"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"29"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n29\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-29"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-29\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"20"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "A"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n20\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"20"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:-2.5949999999999998>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "{"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2.5949999999999998\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-2"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:-25.949999999999996>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-25.949999999999996\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"g"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "o"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"\uffff"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "71"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "c"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nc\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"e"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "71"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "d"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nd\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "20"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Comparable", "<d:1.5>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395148"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395148\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<sample:0>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395148"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395148\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"-1073741816"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-2147483587"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "20"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:3.0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n20\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "20"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<d:3.0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n20\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:key>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:1>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:ke\n>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nke\n\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "equals", "java.lang.Object", "<s:kfy>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "b"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"1048556"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:`,;>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Comparable", "<s:.>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"2147483647"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-2147483648"}, false, 11, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<b:false>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \ntrue\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"2147483647"}, false, 8, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<d:60.0>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"10"}, false, 9, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<d:60.0>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "-65"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"40"}, false, 9, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:4>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "-65"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"40"}, false, 9, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"40"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"40"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"40"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nc\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false), new String[][]{{"hasNext", "", "0"}, {"hasNext", "", "2"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:k;,>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844111"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844111\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844111"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844111\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "3845586908418844111"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3845586908418844111\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "3845586908410455503"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3845586908410455503\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "131073"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n131073\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:-48>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "131073"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n131073\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:-98>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "131125"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n131125\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:-49>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "131125"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n131125\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:-49>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "2251799813816373"}, {"org.apache.commons.math.stat.Frequency", "hashCode", ""}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2251799813816373\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:-42>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<i:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t0\t0%\t100%\n\t0\t0%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-3845586908418844110"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "H"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"d"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:4>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:-2>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1028>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:-20>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:1.5>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<i:-2147483648>"}, false, 8, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:-32>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:1.464>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.464\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false, 8, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:-32>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:1.464>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.464\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Comparable"}, new String[]{"<d:0.75>"}, false, 8, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:-32>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:1.464>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.464\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"20"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483647"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "0"}, {"org.apache.commons.math.stat.Frequency", "getPct", "long", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483647\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483647"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "0"}, {"org.apache.commons.math.stat.Frequency", "getPct", "long", "1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:key>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t0\t0%\t100%\n-2147483647\t0\t0%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:1bh>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3852193713161395149"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:`+>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:`,>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-23"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:`,>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-23\t1\t50%\t50%\n-1\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-4119"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:`,>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-4119\t1\t50%\t50%\n-1\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-4119"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:`,>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t0\t0%\t100%\n-4119\t0\t0%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<s:E>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"i"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "9223372036854775807"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<s:F>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036854775807\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\u00e9"}, false, 13, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "9223372036854775807"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<s:F>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036854775807\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\u00e9"}, false, 13, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "9223372036854775807"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Comparable", "<s:F>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036854775807\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "c"}, {"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Comparable", "<i:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3852193713161395147"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "z"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3845586908418844112"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
