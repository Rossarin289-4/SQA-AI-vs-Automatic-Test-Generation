package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"1073741824"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "3852193713161395148"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3852193713161395148\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "p"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-2147483647"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-288230376151711744"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:21>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"1073741824"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "E"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nE\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"p"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "o"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "16394"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "p"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n16394\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-9223372036854775807\t1\t50%\t50%\n2147483647\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"-2147483648"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "9"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:c>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"0"}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"1344446282109507212"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-536870912"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:ky>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "0"}, {"org.apache.commons.math.stat.Frequency", "getPct", "char", "p"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nky\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"o"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 4, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:-35>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-35\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"84"}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "d"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"536870911"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<d:7.5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n536870911\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "o"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \no\t0\t0%\t100%\nnull\t0\t0%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"\037"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\037\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"2"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-3557356532267132362"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-2147483648"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:n>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\037"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "2147483620"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"\n"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<b:true>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<null>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<d:-1.5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-3852193713161395085"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"\001"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"2"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:key>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"a"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<s:key.>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "l"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:t>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-288230376151711697"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "961396727104711028"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n961396727104711028\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "p"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193713161395149"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "1"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395149\t1\t50%\t50%\n1\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:-510>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-9223372036854775804"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "-54"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"-32"}, false, 4, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"1"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"-34"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\""}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "a"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193713161395094"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395094\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "3852193713161395133"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t50%\t50%\n3852193713161395133\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:d>"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nd\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<d:0.75>"}, {"org.apache.commons.math.stat.Frequency", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\037"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "p"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-9223372036854775808"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \np\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-288230376151711779"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<d:-31.625>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-288230376151711779\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}, {"org.apache.commons.math.stat.Frequency", "getPct", "char", "p"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"."}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n.\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"1922793453135680231"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "1073741824"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1922793453135680231\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"p"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-7691173812542720926"}, {"org.apache.commons.math.stat.Frequency", "toString", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \np\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"a"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<d:0.75>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "33554432"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:u>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "l"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nu\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"2147483647"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"F"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "getPct", "char", "Q"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nF\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"16367"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "\000"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-1926096856580697062"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161427915"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161427915\t1\t50%\t50%\n-1926096856580697062\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "1073741823"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t50%\t50%\n1073741823\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<d:5.5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "14"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n14\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-7691173812542720924"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-7691173812542720924\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-576460752303423416"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "L"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-576460752303423416\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 5, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036854775807\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"p"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \np\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:u>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nu\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"2147483647"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-576460752303423489"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-576460752303423489\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"10"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:0.75>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.TreeMap$KeyIterator", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-961396727104711028"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193713161427915"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161427915\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{" "}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-1"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-288230376151711744"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:n>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-961396727104711030"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-961396727104711030\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nfalse\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-7704387426322790298"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\n\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n9223372036854775807\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"1073741824"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 2, new String[][]{}), new String[][]{{"remove", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-23"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-864128178501713921"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-2147483647"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"2"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-480698363552355532"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:koey>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkoey\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1073741824\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"\n"}, false, 4, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\n\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"2147483643"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483643\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-576460752303423489"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-3852193713161428171"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "I"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nI\t0\t0%\t100%\n\t0\t0%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"p"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "."}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n.\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-3845586908418844106"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:-63.25>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-63.25\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "\n"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193713161395149"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395149\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"3"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"1"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"\ufffe"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"m"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:\r\u00e9>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-7691173816837688190"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\r\u00e9\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-2033"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2033\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "16"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:3a>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3a\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"u"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t0\t0%\t100%\nu\t0\t0%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-6"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\000\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-1926096856580713957"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "\013"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1926096856580713957\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{">"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-17"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-17\t1\t50%\t50%\n1\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"6"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "k"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nk\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-8182"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-8182\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<d:-63.243>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "p"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \np\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "56"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:-4139>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3841083308791473567"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-4139\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"T"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161427931"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161427931\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"2147483610"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "W"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483610\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-3845586908418844111"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "536870912"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n536870912\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-7704387424175306650"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<s:9>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<i:-18>"}}), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"B"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:ky>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nky\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "-34"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:\t4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t4\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-33554434"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-33554434\t1\t50%\t50%\n2147483647\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0.75\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "10"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-3852193713160870861"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3845586906271360463"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "759492305265959989"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:ky>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nky\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-759492305265960043"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"f"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"p"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-4611686018427387904"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:{>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n-4611686018427387904\t1\t100%\t100%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-4611686018427387904\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"int"}, new String[]{"-12"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "-2147483648"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nfalse\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<sample:0>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "759492305265962037"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n759492305265962037\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-1014"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-961414319290755444"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1014\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}}), new String[][]{{"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"3845586908418844106"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t33%\t33%\n-1\t1\t33%\t67%\n3845586908418844106\t1\t33%\t100%\n {getSumFreq=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<s:5a+>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418811343"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418811343\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "p"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \np\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-572"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-393429199340886987"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-393429199340886987\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "3845586906271360463"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:f>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3845586906271360463\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "valuesIterator", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:key>"}}, 2), new String[][]{{"hasNext", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147450880"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:h>"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:0.75>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0.75\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"383049555004271896"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"H"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "long", "1518984610531919978"}, {"org.apache.commons.math.stat.Frequency", "getPct", "char", "h"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nH\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-576460752303423488"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:xa>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "char", "0"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "7"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n7\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-1922793454209422055"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1922793454209422055\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<d:-126.5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"15"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "long", "-3845586908418844111"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2147483648"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:a>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"long"}, new String[]{"-3563963337009683403"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:-63.25>"}, {"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-63.25\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "2147483648"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:u>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-288265560523800576"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193988039302093"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:b>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193988039302093\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"1"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<s:n>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<d:3.0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:>"}, {"org.apache.commons.math.stat.Frequency", "getPct", "long", "-7704387426322790296"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "\000"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t50%\t50%\n2147483648\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"-7691173816837688212"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "P"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nP\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193713161395147"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:\rnky>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1.5\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-3852193712624524236"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"0"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "14"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n14\t0\t0%\t100%\n0\t0\t0%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"-15"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-15\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"\013"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "\013"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\013\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:-16>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-9223372036854775808"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-9223372036854775808\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<s:n>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:D>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:-4194305>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-4194305\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:ky>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nky\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "\000"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845591306473743824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845591306473743824\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\uffff"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "d"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:3.0>"}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "l"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3.0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<d:-0.75>"}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-1"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395276"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395276\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<d:0.15>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:Ekey>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nEkey\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-17"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-17\t1\t50%\t50%\n2147483647\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "toString", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:X>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nX\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:aP>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "4159"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n4159\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"\uffff"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\uffff\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "clear", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1073741824\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:jy>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "-2"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"7704387426322790298"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "10"}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", ";"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n10\t1\t50%\t50%\n7704387426322790298\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"3852193713161427915"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n3852193713161427915\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-288230376151711744"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "524298"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:8>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:key>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"long"}, new String[]{"-9079256848778919900"}, false, 3, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"o"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"30"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t50%\t50%\n2\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<i:-1>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:>"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "a"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"long"}, new String[]{"6158036722375089100"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n6158036722375089100\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "1"}, {"org.apache.commons.math.stat.Frequency", "valuesIterator", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<d:0.75>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "1"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "7704387426322790296"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:a3,>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<d:1.508>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na3,\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"E"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"`"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161395147"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3852193713161395147\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "\t"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n\t\t1\t100%\t100%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<s:n>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"char"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "p"}, {"org.apache.commons.math.stat.Frequency", "getPct", "char", "r"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \np\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"2147483647"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-17179869184"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-17179869184\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "2"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "17"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n17\t1\t50%\t50%\n2147483647\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2\t1\t50%\t50%\n2147483647\t1\t50%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "char", "/"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418841551"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418841551\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483589"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "long", "-3852193713161427915"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<sample:4>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483589\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<b:true>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "9223372036854775807"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \ntrue\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"char"}, new String[]{"`"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844106"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844106\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "I"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3852193713161427915"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nI\t0\t0%\t100%\n-3852193713161427915\t0\t0%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:\nb>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\nb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "f"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"L"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "-32"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "-32776"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCount", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "-3845586908418844129"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-3845586908418844129\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "\000"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\000\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-7704246688834435006"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:-65536>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:ony>"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n1\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:nky>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "-14"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-14\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"java.lang.Object"}, new String[]{"<d:7.5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<d:-63.25>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-63.25\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:key>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkey\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-1926096856580713957"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "\037"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\037\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<d:-63.25>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<s:n\">"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-63.25\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"\n"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-3852193713161395142"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\n\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:fly>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "long", "2147483648"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "A"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:ky>"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "16367"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n16367\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "toString", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-3852193713161395148"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "4035225266123964415"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("Value \t Freq. \t Pct. \t Cum Pct. \n4035225266123964415\t1\t100\u00a0%\t100\u00a0%\n", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n4035225266123964415\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"int"}, new String[]{"2147483647"}, false, 2, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "int", "-11"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n4\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<d:0.72>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "java.lang.Object", "<s:>"}, {"org.apache.commons.math.stat.Frequency", "addValue", "long", "-961396727104743796"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getSumFreq", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:-75>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-75\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "\t"}, {"org.apache.commons.math.stat.Frequency", "getCount", "java.lang.Object", "<d:-63.25>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\t\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"0"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"-2147483648"}, false, 7, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:-2>"}, {"org.apache.commons.math.stat.Frequency", "getCumFreq", "java.lang.Object", "<i:-2147483606>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"9223372036854775807"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "5"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n {getSumFreq=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Integer"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumFreq", "long", "-961396727104711028"}, {"org.apache.commons.math.stat.Frequency", "getCount", "char", "\000"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n-2147483648\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "e"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \ne\t2\t100%\t100%\n {getSumFreq=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"java.lang.Object"}, new String[]{"<s:kyE8>"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCount", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "getCount", "long", "-3845586908418844106"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nkyE8\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getPct", "char", "T"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n2147483647\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"int"}, new String[]{"2"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Comparable", "<i:0>"}, {"org.apache.commons.math.stat.Frequency", "getSumFreq", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "7"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n7\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"1"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "int", "8175"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n8175\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<s:ke}y>"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \nfalse\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"java.lang.Object"}, new String[]{"<s:ky>"}, false, 6, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<s:\rb>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\rb\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"\000"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "char", "r"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\000\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumFreq", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "a"}, {"org.apache.commons.math.stat.Frequency", "getCumPct", "java.lang.Object", "<s:d>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Long", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \na\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getPct", new String[]{"long"}, new String[]{"-3845586906271360511"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "char", "\n"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n\n\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Object", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n0\t0\t0%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "addValue", new String[]{"char"}, new String[]{"\uffff"}, false, 0, new String[][]{{"org.apache.commons.math.stat.Frequency", "getCumPct", "int", "2147483647"}, {"org.apache.commons.math.stat.Frequency", "addValue", "int", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.apache.commons.math.stat.Frequency", "org.apache.commons.math.stat.Frequency", "getCumPct", new String[]{"char"}, new String[]{"\037"}, false, 4, new String[][]{{"org.apache.commons.math.stat.Frequency", "addValue", "java.lang.Integer", "268435455"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "Value \t Freq. \t Pct. \t Cum Pct. \n268435455\t1\t100%\t100%\n {getSumFreq=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
