package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:-0.5>", "<s:a>", "<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "-1", "<i:-1>", "-1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:>", "-5514169970951994748"}, {"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:7>"}}), new String[][]{{"getItemCount", "", "6"}, {"getValue", "java.lang.Comparable", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:2.0>", "<s:8>"}, false, 13, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowIndex", "java.lang.Comparable", "<s:_efy>"}, {"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<null>", "<s:>"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnKey", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "hashCode", ""}, {"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<null>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "-1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "hashCode", ""}, {"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<null>"}}, 3), new String[][]{{"removeRow", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<s:cxP>"}, false, 9, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:-3.4000000000000004>", "<b:true>", "<i:11>"}, {"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<i:0>", "<null>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:5k>"}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKey", "int", "5"}, {"org.jfree.data.DefaultKeyedValues2D", "clear", ""}, {"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-79>", "<b:true>"}, false, 9, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<b:false>", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"0", "<null>", "<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getIndex", "java.lang.Comparable", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:Ay>", "<b:false>"}, {"org.jfree.data.DefaultKeyedValues2D", "hashCode", ""}, {"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:`w>", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[Ay]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "5"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:-12.749999999999996>", "<s:c>", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("c", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "0", "<s:a>", "0.5"}, {"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:6>"}, {"org.jfree.data.DefaultKeyedValues", "equals", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<null>", "<b:false>", "<sample:0>"}, {"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1023>", "<s:key>", "<s:>"}, {"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1040>", "<s:c>", "<s:_efy>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=3, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "java.lang.Comparable", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:-->"}, false, 11, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1073741816>", "<b:true>", "<d:1.5>"}, {"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<b:true>", "<d:1.5>"}, {"org.jfree.data.DefaultKeyedValues2D", "getValue", "int,int", "0", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:_efy>", "<d:3.0>"}, {"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "0", "<s:_efy>", "8468154364608194797"}}), new String[][]{{"contains", "java.lang.Object", "2"}, {"listIterator", "", "1"}, {"hasPrevious", "", "2"}, {"remove", "", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalStateException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<null>"}, {"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1073741799>", "<i:78>", "<s:7@a>"}, {"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<s:kueyyA>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "clear", ""}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<b:false>", "<s:kez>"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<s:7a>"}}, 3), new String[][]{{"addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "4"}, {"removeValue", "java.lang.Comparable,java.lang.Comparable", "5"}, {"getColumnKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[kez]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"1", "<d:2.0>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<d:2.0>", "<d:-12.749999999999996>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:9>", "-5.5141699709519933E18"}, {"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "10", "<s:aa>", "<i:47>"}, {"org.jfree.data.DefaultKeyedValues", "getKeys", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("9", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<s:b>", "<i:-44>"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "0"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnKey", "int", "1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1023>", "<s:c>", "<i:79>"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<b:true>", "<i:0>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<s:key>", "<i:0>"}, {"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106110", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"int"}, new String[]{"2147483629"}, false, 8, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeRow", "java.lang.Comparable", "<sample:1>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:a>", "<b:true>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"int"}, new String[]{"2147483647"}, false, 8, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeRow", "java.lang.Comparable", "<s:a>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeRow", "java.lang.Comparable", "<null>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:a>", "<b:false>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"int"}, new String[]{"-536870942"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:7a>", "<b:false>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"int"}, new String[]{"-1073741831"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:7a>", "<b:false>"}, {"org.jfree.data.DefaultKeyedValues2D", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 3, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$Itr", actual.getClass().getName());
  assertEquals("{hasNext=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "int,int", "10", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "int,int", "5", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"1", "<s:c>", "<i:-1>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<d:-2.2>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKey", "int", "-1107296278"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:79>", "<s:c>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKeys", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}}, 3), new String[][]{{"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "2147483647", "<i:79>", "0.0"}, {"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "2147483647", "<i:79>", "0.0"}, {"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<i:2147483647>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "2147483647", "<i:79>", "0.0"}, {"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<i:2147483647>"}}, 2), new String[][]{{"removeValue", "java.lang.Comparable", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"int"}, new String[]{"63"}, false, 14, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<i:-1>", "Infinity"}, {"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:1>", "<s:c>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:`w>", "-5514169970951994748"}, {"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "0", "<i:2>", "<i:-1023>"}}, 1), new String[][]{{"getItemCount", "", "6"}, {"getValue", "java.lang.Comparable", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:8>", "-5514169970951994748"}, {"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:7>"}}, 1), new String[][]{{"getItemCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:8>", "-5514169970951994748"}, {"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:7>"}}, 1), new String[][]{{"getItemCount", "", "6"}, {"setValue", "java.lang.Comparable,java.lang.Number", "1"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:8>", "-5514169970951994748"}, {"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:7>"}}, 1), new String[][]{{"getItemCount", "", "6"}, {"setValue", "java.lang.Comparable,java.lang.Number", "1"}, {"setValue", "java.lang.Comparable,java.lang.Number", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=3}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:8>", "-5.5141699709519942E17"}, {"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<null>"}, {"org.jfree.data.DefaultKeyedValues", "clear", ""}}, 1), new String[][]{{"getItemCount", "", "6"}, {"setValue", "java.lang.Comparable,java.lang.Number", "1"}, {"setValue", "java.lang.Comparable,java.lang.Number", "2"}, {"getValue", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 8, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:1.5>"}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<s:`w>"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:b>", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:key>", "NaN"}, {"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<s:`w>"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:4>", "1.0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<s:`w>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-120>", "<b:false>"}, false, 13, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowIndex", "java.lang.Comparable", "<i:-1>"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<i:-1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "java.lang.Comparable", "<sample:0>"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<sample:0>", "<i:-1023>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:tF>", "<s:>"}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKey", "int", "-1073741831"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}, {"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:key>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getIndex", "java.lang.Comparable", "<s:a>"}, {"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"int"}, new String[]{"-1107296263"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKey", "int", "1073741804"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}, {"org.jfree.data.DefaultKeyedValues2D", "hashCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:4>"}}, 3), new String[][]{{"size", "", "4"}, {"add", "java.lang.Object", "4"}, {"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:4>"}}, 3), new String[][]{{"size", "", "4"}, {"add", "java.lang.Object", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:4>"}}, 3), new String[][]{{"size", "", "4"}, {"add", "java.lang.Object", "4"}, {"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:-0.5>", "<i:1>", "<i:-1>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getIndex", "java.lang.Comparable", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"int"}, new String[]{"-2147483088"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<s:key>", "<b:false>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-2147483648>", "<s:`w>"}, false, 15, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"1073741824", "<s:a/>", "NaN"}, false, 8, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<d:1.5>", "-1.7976931348623157E308"}, {"org.jfree.data.DefaultKeyedValues", "clear", ""}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:key>", "8468154364608194797"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"int"}, new String[]{"-2147483647"}, false, 3, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}, {"org.jfree.data.DefaultKeyedValues", "equals", "java.lang.Object", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "-2147483648", "<s:b>", "1.0"}}, 1), new String[][]{{"remove", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "-2147483648", "<s:b>", "1.0"}}, 1), new String[][]{{"isEmpty", "", "5"}, {"trimToSize", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:1.5>", "<i:2>", "<i:2>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clear", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<s:>"}, {"org.jfree.data.DefaultKeyedValues2D", "getRowKeys", ""}, {"org.jfree.data.DefaultKeyedValues2D", "clone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-50>", "<d:-0.75>", "<s:b>"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "int", "2147483647"}, {"org.jfree.data.DefaultKeyedValues2D", "clear", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<i:1>", "-1.9"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getKeys", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<i:1>", "-1.9"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<sample:1>", "-5514169970951994748"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeRow", "java.lang.Comparable", "<s:7a>"}, {"org.jfree.data.DefaultKeyedValues2D", "getRowKey", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clear", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:1000>", "<s:b>", "<b:true>"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnKey", "int", "-1107296203"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"int", "int"}, new String[]{"-30", "-14"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<i:-1>", "<d:1.5>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "-1073741831"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"int", "int"}, new String[]{"1073741804", "-7"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"int", "int"}, new String[]{"10", "-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<s:c>", "<i:-2038>"}, false, 10, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:EE>", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "java.lang.Comparable", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false, 11, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKey", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 5, new String[][]{}, 3), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<d:28.997999999999998>", "-8.4681543646081946E18"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<null>", "-1.0000000000000002"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<s:a>", "<i:-1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<s:`w>", "<i:-1>"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "0"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"int"}, new String[]{"2147483647"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getKeys", ""}, {"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKey", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<s:key>", "<i:0>"}, {"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:1>"}, {"org.jfree.data.DefaultKeyedValues", "removeValue", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("106110", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:a>", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:`w>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"int", "int"}, new String[]{"-1073741831", "10"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "int,int", "10", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<b:false>", "-1.7976931348623157E308"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<b:false>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:24>", "<d:15.0>"}}), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<i:0>", "<i:-1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "int,int", "5", "20"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "int,int", "5", "10"}}), new String[][]{{"remove", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clone", ""}, {"org.jfree.data.DefaultKeyedValues", "clear", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"-1", "<i:79>", "<i:1>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"1073741804", "<s:b>", "<i:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"int", "int"}, new String[]{"-1073741824", "2147483590"}, false, 8, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:>"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1023>", "<b:true>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"int", "int"}, new String[]{"5", "-1107296263"}, false, 8, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:>"}, {"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<i:79>", "<i:-1>"}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:>", "0.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"int"}, new String[]{"10"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<i:1>", "1.7976931348623157E308"}, {"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<i:79>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "int", "-1073741824"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKey", "int", "-1107296263"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:79>", "<s:c>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKeys", ""}}), new String[][]{{"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<i:79>", "<i:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getIndex", "java.lang.Comparable", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getIndex", "java.lang.Comparable", "<i:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 14, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-10>", "<s:aL>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<sample:1>", "-5514169970951994748"}, {"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "0", "<i:2>", "<i:-1023>"}}), new String[][]{{"getItemCount", "", "6"}, {"getValue", "java.lang.Comparable", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<s:c>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:>", "-5514169970951994748"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<sample:1>", "8468154364608194797"}, {"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:7>"}}), new String[][]{{"getItemCount", "", "6"}, {"getValue", "java.lang.Comparable", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:8>", "-5514169970951994748"}, {"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:7>"}}), new String[][]{{"getItemCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 19, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:17>", "-5.5141699709519942E17"}, {"org.jfree.data.DefaultKeyedValues", "clear", ""}}), new String[][]{{"getItemCount", "", "6"}, {"setValue", "java.lang.Comparable,java.lang.Number", "1"}, {"setValue", "java.lang.Comparable,java.lang.Number", "2"}, {"getValue", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<s:>", "<i:79>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<s::72H>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<i:-1>", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<i:-1>", "<d:1.5>"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<i:-2>", "1.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:2>", "<b:false>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<i:2>", "1.0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getIndex", "java.lang.Comparable", "<s:`w>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKey", new String[]{"int"}, new String[]{"10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"-1107296263", "<s:key>", "NaN"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"int"}, new String[]{"1073741804"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clone", ""}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<i:-1>", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("30", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"int", "int"}, new String[]{"0", "20"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<null>", "<s:`w>", "<i:1>"}, {"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false), new String[][]{{"remove", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<i:1>", "-1.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:1.5>", "<s:7a>", "<s:key>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:key>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKeys", ""}, {"org.jfree.data.DefaultKeyedValues2D", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("871", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "20", "<i:1>", "<i:1>"}}), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:ke>"}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "-20", "<i:-1>", "8468154364608194797"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:key>", "8468154364608194797"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "-20", "<i:-1>", "8468154364608194797"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:key>", "8468154364608194797"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:_ffy>"}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:8>", "<i:-1023>"}, {"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "-20", "<i:-1>", "8468154364608194797"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:ke>", "8468154364608194797"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"0", "<i:2>", "Infinity"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1023>", "<b:true>", "<d:2.0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<s:key>", "<d:-0.5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}, {"org.jfree.data.DefaultKeyedValues", "clear", ""}}), new String[][]{{"getIndex", "java.lang.Comparable", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:7>"}, false, 5, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<d:1.5>", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKey", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:k{>"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<null>", "<s:_efy>", "<sample:1>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<s:_efy>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:c>", "8.4681543646081946E17"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "equals", "java.lang.Object", "<i:2>"}, {"org.jfree.data.DefaultKeyedValues", "getValue", "int", "1"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:k-y>", "<s:mXz>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<s:>", "<s:key>"}, {"org.jfree.data.DefaultKeyedValues2D", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:k-y>", "<s:mXz>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<s:>", "<s:key>"}, {"org.jfree.data.DefaultKeyedValues2D", "hashCode", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:1>"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:c>"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<i:-1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"java.lang.Comparable"}, new String[]{"<d:-2.0>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clear", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:`wg>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clear", ""}, {"org.jfree.data.DefaultKeyedValues", "clear", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"java.lang.Comparable"}, new String[]{"<b:true>"}, false, 12, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clear", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<d:0.0435>", "<i:1>"}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getKey", "int", "5"}, {"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<i:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "clear", ""}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnKey", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<null>", "0.0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:b>", "1.0E-322"}, false, 11, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "java.lang.Comparable", "<s:key>"}, {"org.jfree.data.DefaultKeyedValues", "getKeys", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", ""}}), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<s:b>", "<i:0>"}, false, 14, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:a>", "-1.7976931348623157E308"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:a>", "-1.7976931348623157E308"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<s:k{>"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:aa>", "-1.7976931348623157E308"}, {"org.jfree.data.DefaultKeyedValues", "equals", "java.lang.Object", "<i:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3135", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<s:k{>"}, {"org.jfree.data.DefaultKeyedValues", "equals", "java.lang.Object", "<i:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 23, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<b:false>"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<b:true>", "8468154364608194797"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:gBa>"}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "-1"}, {"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:c>", "<s:7a>"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<s:kez>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKey", new String[]{"int"}, new String[]{"-1"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "int", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "-1073741831", "<i:79>", "8468154364608194797"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<s:k{>", "<s:a>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-67108864>", "<s:k{>", "<s:b>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "int", "-1073741857"}, {"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<null>", "<d:2.0>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:1.5>", "<s:7a>", "<s:_efy>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<s:k8ey>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:6.0>", "<null>", "<s:;at>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowCount", ""}, {"org.jfree.data.DefaultKeyedValues2D", "getValue", "int,int", "10", "-1073741876"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "int", "-8388608"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}, {"org.jfree.data.DefaultKeyedValues", "removeValue", "java.lang.Comparable", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:k{>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKey", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:2.0500000000000003>", "<s:j{>"}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "clear", ""}, {"org.jfree.data.DefaultKeyedValues2D", "getValue", "int,int", "2147483590", "-1073741824"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:2147483647>", "<b:true>"}, false, 14, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<i:2>"}, {"org.jfree.data.DefaultKeyedValues2D", "getRowKey", "int", "2147483590"}, {"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "int", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:`w>", "1.7976931348623157E308"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clone", ""}, {"org.jfree.data.DefaultKeyedValues", "hashCode", ""}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:a>", "<d:-0.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKey", new String[]{"int"}, new String[]{"40"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", ""}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<sample:1>", "<d:-0.5>"}, false, 4, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "int,int", "-2147483648", "-1073741824"}, {"org.jfree.data.DefaultKeyedValues2D", "getRowIndex", "java.lang.Comparable", "<i:79>"}}), new String[][]{{"listIterator", "", "7"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clear", ""}}), new String[][]{{"sortByValues", "org.jfree.chart.util.SortOrder", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"1", "<s:8>", "-1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<i:2>", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "int", "1073741804"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:a>", "NaN"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKey", new String[]{"int"}, new String[]{"20"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "0", "<s:key>", "-5514169970951994748"}}), new String[][]{{"getKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[key]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<sample:1>", "<d:-0.5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:Kaa>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clear", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKey", "int", "20"}, {"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:c>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<sample:1>", "-1.7976931348623157E308"}, false, 5, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<d:1.5>", "<d:1.5>"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<i:0>", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-4122>", "<d:-1.18>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:key>", "<i:2>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:c>", "<s:8>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<d:-0.295>", "<s:`w>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:kke7y>", "<i:79>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:d>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-2147483648>", "<s:c>", "<s:``>"}, false, 14, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:c>", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:_efy>", "1.7976931348623157E308"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<i:1>", "-1.9"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"0", "<s:>", "Infinity"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "equals", "java.lang.Object", "<i:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"-46", "<sample:0>", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getKey", "int", "41"}, {"org.jfree.data.DefaultKeyedValues", "equals", "java.lang.Object", "<i:-2147483648>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("871", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "-1073741831"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnKey", "int", "1"}}), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:X888>"}, false, 5, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "clear", ""}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<d:1.0>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 13, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<d:0.5>", "<s:0>"}, {"org.jfree.data.DefaultKeyedValues2D", "getRowIndex", "java.lang.Comparable", "<sample:0>"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1023>", "<s:k{>", "<s:7a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:b>", "<i:-1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("129", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "0", "<s:b>", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "0", "<s:b>", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:6>"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<s:k{>"}, {"org.jfree.data.DefaultKeyedValues", "equals", "java.lang.Object", "<s:key>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "equals", "java.lang.Object", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<sample:1>", "<s:Ay>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKey", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKeys", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "10", "<s:b>", "<i:0>"}, {"org.jfree.data.DefaultKeyedValues", "getIndex", "java.lang.Comparable", "<s:Ay>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<b:true>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<b:true>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<d:2.0>", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clear", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<null>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "1"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<sample:1>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<d:2.0>", "<i:0>"}, {"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1023>", "<i:-1>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:0>", "<s:`w>", "<sample:0>"}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<d:2.0>", "<i:0>"}, {"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-2047>", "<i:-18>", "<s:8>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1023>", "<s:``r>", "<s:B>"}, false, 15, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:c>", "<i:0>"}, {"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-2047>", "<i:-18>", "<sample:0>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:-24>", "<i:158>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1023>", "<s:>", "<s:>"}, false, 13, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-2047>", "<i:-18>", "<sample:0>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:-24>", "<i:-158>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<i:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<s:>", "<d:2.0>"}, false, 15, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<i:1>", "<d:2.0>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:-24>", "<i:-158>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<i:2>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<s:r_efyh>", "<i:-967>"}, false, 15, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "0", "<d:1.5>", "NaN"}, {"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "clear", ""}}, 3), new String[][]{{"removeRow", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"-502", "<s:_fy>", "1.9000000000000001"}, false, 12, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "-1", "<s:kh{>", "Infinity"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<b:true>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "int", "-1073741831"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:1>", "<i:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<s:a>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[1.5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "int", "-1082130438"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:-7>", "<sample:1>"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}}), new String[][]{{"getColumnKeys", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:-7>", "<sample:1>"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}}, 1), new String[][]{{"getColumnKeys", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:-7>", "<sample:1>"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<sample:0>"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<s:a>", "<s:8>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnCount", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "clone", ""}, {"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:a->"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<i:48>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:5>"}, false, 15, new String[][]{{"org.jfree.data.DefaultKeyedValues", "equals", "java.lang.Object", "<sample:1>"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:``w>", "8468154364608194797"}, {"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "10", "<null>", "NaN"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:0.1453>", "<b:true>", "<s:>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<s:k{>", "<s:key>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:key>", "0.0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:8>", "<i:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getKey", "int", "1073741804"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:8>", "-1.9"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<b:true>", "<i:1>"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:>", "1.0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:2>"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:k{>", "-1.0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:`w>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<sample:1>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:key>", "<s:_efy>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clear", ""}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<i:2>", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<s:`w>", "<null>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "int,int", "-2147483648", "1073741804"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<s:c>", "<s:>"}, {"org.jfree.data.DefaultKeyedValues2D", "getValue", "int,int", "5", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"0", "<i:2>", "8468154364608194797"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "int", "-1073741831"}, {"org.jfree.data.DefaultKeyedValues", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:``>", "<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<s:c>", "<s:`w>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:0>", "<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<s:<c>", "<s:`w>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "-2147483648"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<sample:0>", "<s:>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getKey", "int", "1073741804"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<i:0>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getRowKey", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "clone", ""}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<s:7a>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues2D", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clone", ""}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:b>", "0.0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKey", new String[]{"int"}, new String[]{"-4"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clone", ""}, {"org.jfree.data.DefaultKeyedValues", "clone", ""}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:b>", "0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<d:1.5>", "<null>"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "10", "<i:79>", "<d:-0.5>"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:_efy>", "-5514169970951994748"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<s:/a>"}, {"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<d:1.5>", "<s:Ay>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<sample:3>", "<i:1>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"1073741804", "<i:-79>", "<i:1>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "0", "<s:`w>", "-5514169970951994748"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"int"}, new String[]{"20"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKey", new String[]{"int"}, new String[]{"-2147483580"}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKey", "int", "-1107296263"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<s:b>", "<null>"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<i:2>", "-1.7976931348623157E308"}, {"org.jfree.data.DefaultKeyedValues", "removeValue", "java.lang.Comparable", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}, {"org.jfree.data.DefaultKeyedValues", "equals", "java.lang.Object", "<d:1.5>"}}, 1), new String[][]{{"clear", "", "3"}, {"sortByValues", "org.jfree.chart.util.SortOrder", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "hashCode", ""}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1023>", "<d:2.0>", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<s:8>", "<s:key>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<d:2.0>", "<d:2.0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:Ay>", "<i:-1023>"}, {"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:Ay>", "<i:-1023>"}, {"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:7>"}}, 3), new String[][]{{"setValue", "java.lang.Comparable,double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:7>"}}, 3), new String[][]{{"setValue", "java.lang.Comparable,double", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"int"}, new String[]{"1073741823"}, false, 10, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "int", "-1014"}, {"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "2147483590", "<s:7a>", "<i:-2147483648>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<i:2>", "<i:1>"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<i:-1>", "-5514169970951994748"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:^efy>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<s:key>", "<s:``>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<null>", "<i:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
}
