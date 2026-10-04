package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "9"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "int", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"."}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "\000"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-766099110008543730"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-4194303"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "-10"}, {"org.apache.commons.math.stat.Frequency", "toString", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3845586908418844111"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 14, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<null>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "."}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "0"}}, 3), new String[][]{{"next", "", "3"}, {"remove", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:e>"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{" "}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"\t"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"\uffff"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"0"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844110"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:<>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"961396727104710984"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-3852193713161395147"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\000"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<s:b>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "\uffff"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"2"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{" "}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3845586908418844111"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3845595704511866319"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3845586908418844112"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "2"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3852193713161395148"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"0"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "9"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", " "}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "."}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "0"}}), new String[][]{{"next", "", "3"}, {"remove", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"\013"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "0"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"0"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "10"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"\uffff"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "."}}), new String[][]{{"remove", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:9I>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "."}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "1"}, {"org.apache.commons.math.stat.Frequency", "toString", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"10"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 8, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}, {"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3841092104884495823"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"16384"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "z"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"0"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<i:-26>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}}, 2), new String[][]{{"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"2"}, false, 17, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"10"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 8, new String[][]{}, 3), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", " "}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", ";"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844112"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3845586908418844111"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:key>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3845586908418844100"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<s:i>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:key>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-1922793454209422050"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<s:WAA>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:keey>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-1922793454209422040"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkeey\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193713161395148"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395148\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-9223372036854775808"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-9223372036854775808\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-4611686018427387904"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-4611686018427387904\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3847821133226354096"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:0>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n1\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3845586908418844112"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844112\t1\t50%\t50%\n1\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-7691173816837688224"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-7691173816837688224\t1\t50%\t50%\n1\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-7691173816841882528"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<sample:1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-7691173816841882528\t1\t50%\t50%\n1\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845595704511866319"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845595704511866319\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845595704511866319"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395148"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395148\t1\t50%\t50%\n-3845595704511866319\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:H>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"57"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "0"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:H>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"hasNext", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-1922793454209422039"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
