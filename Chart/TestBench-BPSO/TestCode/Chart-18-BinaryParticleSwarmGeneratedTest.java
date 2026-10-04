package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<s:>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<s:a >"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<d:0.75>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "java.lang.Comparable", "<null>"}, {"org.jfree.data.DefaultKeyedValues", "equals", "java.lang.Object", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"-2147483648", "<i:-2147483648>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "int", "-2147483594"}, {"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "57", "<s:ky>", "0.0"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKeys", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"0", "<null>", "<d:-63.833>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<i:0>", "<d:0.167>"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:b>", "-0.04000000000000001"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<i:0>", "<i:-3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<sample:5>", "Infinity"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:+>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:aa>", "<i:61>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-2147483648>", "<i:-26>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-4095>", "<i:-2147483648>", "<s:k,yn>"}, {"org.jfree.data.DefaultKeyedValues2D", "clone", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:Tf>", "<s:bf>"}}), new String[][]{{"getColumnIndex", "java.lang.Comparable", "4"}, {"getColumnKeys", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[bf]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ky>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowIndex", "java.lang.Comparable", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:1.66>", "<s:c>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<i:-80>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:kLLx>", "<s:kx>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-35>", "<b:true>", "<s:kx>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<s:fl,yn>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKey", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:b5>", "<i:35>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:-15.0>", "<s:.i>", "<s:kLUx>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("99217443", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"0", "<s:jk>", "-0.011999999999999999"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:4>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<i:-8128>", "-0.011999999999999999"}, {"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:7>"}}, 2), new String[][]{{"removeValue", "java.lang.Comparable", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:Tky>", "<s:>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKey", "int", "3964"}, {"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:0.24000000000000002>", "<s:kx>", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "clear", ""}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:23.86>", "<s:lLx>", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("89397996", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:,ym>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:4>", "<i:-2147483648>", "<s:kLrUx>"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:0.72>", "<s:,ym>", "<s:k,Uyn>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 5, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<i:0>", "<d:-638.3299999999999>"}, {"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-638.3299999999999", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"int"}, new String[]{"1"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<i:0>", "<s:kz>"}, {"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:b>", "<i:-2147483648>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false), new String[][]{{"addValue", "java.lang.Comparable,double", "3"}, {"insertValue", "int,java.lang.Comparable,double", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s:Tky>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:.9i>", "<d:0.75>"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-48>", "<s:Tz>", "<s:Tky>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<null>", "<s:b->", "<s:i>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:5.1000000000000005>", "<s:1>", "<s:+>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<s:.i>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:Lx>", "<i:0>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false), new String[][]{{"addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "4"}, {"getValue", "java.lang.Comparable,java.lang.Comparable", "5"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKeys", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"int", "int"}, new String[]{"1", "0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-58>", "<s:k,Uyn>", "<s:kLrU>"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:35>", "<s:Oy>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "java.lang.Comparable", "<sample:1>"}, {"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:4>"}}), new String[][]{{"addValue", "java.lang.Comparable,java.lang.Number", "4"}, {"insertValue", "int,java.lang.Comparable,double", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"int"}, new String[]{"-2041"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<d:-2.3>"}, false, 1, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:1>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"int"}, new String[]{"1073741823"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"int"}, new String[]{"10"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a >"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "java.lang.Comparable", "<s:+>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-2>", "<s:a>"}, false, 2, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:ly>"}, false, 5, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"-1", "<i:-8192>", "<i:0>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "-5", "<s:`>", "<d:1.5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:3>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"0", "<i:1>", "0.04000000000000001"}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<s:k,ym>", "<i:6>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "0"}, {"getColumnCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"java.lang.Comparable"}, new String[]{"<s:ky>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", ""}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"int"}, new String[]{"-2"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKeys", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<d:0.75>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"java.lang.Comparable"}, new String[]{"<sample:1>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:2>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<d:0.375>", "<s:key>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"2147483647", "<d:6.0>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clone", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:k,ycnb>", "<sample:0>"}}, 1), new String[][]{{"removeColumn", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "int", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "-2041", "<s:>", "<d:-1.6700000000000002>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<i:-14>", "-4.4942328371557893E307"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("17", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"int", "int"}, new String[]{"3964", "-1020"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:6>"}, false, 5, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<i:0>", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("31", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"-2147483647", "<i:-2147483648>", "<null>"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:k_>", "<s: aa>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<s:_>", "<d:-0.5>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:4>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clone", ""}, {"org.jfree.data.DefaultKeyedValues", "getValue", "int", "76"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<sample:1>", "-0.38"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getKey", "int", "2147483647"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"int"}, new String[]{"-2147483643"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<s:a>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clear", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKey", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<i:0>", "<i:43>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"int"}, new String[]{"-2147483640"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "3952", "<s:bXf>", "-0.005999999999999999"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:_>"}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clear", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clone", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clear", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"-67108865", "<s:N\ra>", "-Infinity"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:fx>", "<s:>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKey", "int", "-2114977792"}, {"org.jfree.data.DefaultKeyedValues2D", "getRowIndex", "java.lang.Comparable", "<s:),ym>"}}, 2), new String[][]{{"size", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clear", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeRow", "java.lang.Comparable", "<s:c>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"int"}, new String[]{"4194303"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeRow", "java.lang.Comparable", "<d:-1.5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"int"}, new String[]{"1"}, false, 5, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clone", ""}, {"org.jfree.data.DefaultKeyedValues", "getIndex", "java.lang.Comparable", "<s:k,y\ro>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowIndex", "java.lang.Comparable", "<i:-262201>"}, {"org.jfree.data.DefaultKeyedValues2D", "getRowKey", "int", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<d:-1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("871", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ke{5>", "<sample:1>"}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"int"}, new String[]{"524287"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<i:1073741823>", "<s:ley>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<i:2>", "-46.120000000000005"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:kez5>"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<i:-2147483648>", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<i:-8158>", "<i:-12>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"int"}, new String[]{"1026"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getKey", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"getValue", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}, {"org.jfree.data.DefaultKeyedValues", "getKeys", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:kyh>"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<s:a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getColumnKey", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getIndex", "java.lang.Comparable", "<i:-2147483648>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<i:0>", "<d:-0.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<i:-262201>", "<i:12>"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "hashCode", ""}, {"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<s:>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"java.lang.Comparable"}, new String[]{"<i:37>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKey", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "int", "-2147483648"}, {"org.jfree.data.DefaultKeyedValues", "getKeys", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"clear", "", "1"}, {"insertValue", "int,java.lang.Comparable,java.lang.Number", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKeys", ""}}, 3), new String[][]{{"getValue", "java.lang.Comparable,java.lang.Comparable", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:-x>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:>", "<i:-1>"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:+>", "1.0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "equals", "java.lang.Object", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKey", "int", "1982"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<sample:1>"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"java.lang.Comparable"}, new String[]{"<d:0.75>"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<i:-262201>", "<i:-1>"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:ky>", "-0.011999999999999999"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<d:1.5>", "-1.7976931348623157E308"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<s:a >"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s:aa>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:y>", "-Infinity"}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getIndex", "java.lang.Comparable", "<s:baa>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKey", new String[]{"int"}, new String[]{"-2041"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "int", "10"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<sample:0>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("128", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getKey", "int", "-2147483648"}}), new String[][]{{"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"int"}, new String[]{"-2041"}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:\r>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeRow", "java.lang.Comparable", "<s:mkey>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false), new String[][]{{"removeRow", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clear", new String[]{}, new String[]{}, false, 6, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:0.14>", "<b:true>", "<d:0.75>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<d:0.375>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clear", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<s:b>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKey", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:2>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:6>"}, false, 7, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<i:-1073741823>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKeys", ""}, {"org.jfree.data.DefaultKeyedValues2D", "hashCode", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"int"}, new String[]{"-2147475456"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<i:-6>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"int"}, new String[]{"2147483391"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}), new String[][]{{"getValue", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-12>", "<s:>", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<s:>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "1073741823", "<i:-2147483648>", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"int", "int"}, new String[]{"0", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "-30"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<s:key>", "<d:1.5>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"1", "<null>", "<i:-131071>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "2147483647", "<i:-262178>", "<d:-0.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "clear", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("871", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false), new String[][]{{"clear", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:6>"}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:k,yn>", "<d:0.167>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<s:kgy>", "<i:-12>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<i:-8144>", "<i:-6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<s:kx>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"-2147483648", "<d:0.075>", "2.0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false), new String[][]{{"get", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKey", new String[]{"int"}, new String[]{"-2147483647"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKey", "int", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "0", "<s:key/:>", "<i:12>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getKeys", ""}, {"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "-1", "<s:b>", "<d:0.14>"}}), new String[][]{{"addValue", "java.lang.Comparable,java.lang.Number", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:ke.>", "<null>"}, {"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}}), new String[][]{{"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:kk>", "<null>"}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<s:>"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:bf>", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<b:false>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "-508"}}), new String[][]{{"getColumnKeys", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:0.14>", "<i:-1>", "<s:key>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "removeValue", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<s:kez5>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"0", "<s:ky>", "<d:-0.5>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clear", ""}, {"org.jfree.data.DefaultKeyedValues", "getKey", "int", "2147483608"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:-x>", "<s:i>"}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-3>", "<s:kLx>", "<s:w>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "hashCode", ""}, {"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<i:0>", "<s:)ym>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1324862", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "int,int", "-2113929216", "20"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:3>"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:kez5>", "<i:8>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3288564", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<i:1>", "<d:0.14>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<i:-35>", "Infinity"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<i:-1>", "<i:-3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<null>"}, false, 5, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:0.167>", "<i:2147483647>", "<s:bf>"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:j>", "<s:b>"}}), new String[][]{{"getRowCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:b8>", "<d:-63.943>"}, {"org.jfree.data.DefaultKeyedValues", "removeValue", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<i:-2147483648>", "1.7976931348623157E308"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<b:true>", "1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getIndex", "java.lang.Comparable", "<d:1.5>"}}), new String[][]{{"getItemCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:-x>", "<s:bdf>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:0.14>", "<d:0.15>", "<s:kA>"}}), new String[][]{{"clone", "", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues2D", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:3>", "<s:k,zrn>", "<i:-8179>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1590628741", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getKey", "int", "-2041"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:ky>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("3469", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:kLx>", "-1.0"}}), new String[][]{{"sortByValues", "org.jfree.chart.util.SortOrder", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-67108876>", "<d:1.77>", "<s:kx>"}, {"org.jfree.data.DefaultKeyedValues2D", "getRowKeys", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-210514657", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getRowIndex", "java.lang.Comparable", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<s:k>", "<d:0.167>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "int", "2147483647"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<s:U>", "<d:-0.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<s:A>"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<i:-262201>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[-262201]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "1073741823", "<s:kk>", "1.7976931348623155E308"}, {"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:5>"}}), new String[][]{{"getIndex", "java.lang.Comparable", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<d:1.443>", "<i:55>"}, {"org.jfree.data.DefaultKeyedValues", "getValue", "int", "33554432"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-2147483648>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<s:x>", "<s:aoa>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"int"}, new String[]{"0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<i:-2147483648>", "-1.0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<s:/kez5>", "<d:0.167>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowCount", ""}}), new String[][]{{"removeColumn", "java.lang.Comparable", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<s:E>"}}), new String[][]{{"add", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "java.lang.Number"}, new String[]{"1080", "<i:4>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "hashCode", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getKey", "int", "-27"}}, 2), new String[][]{{"ensureCapacity", "int", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"0", "<d:1.5>", "1.0"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-2>", "<sample:1>", "<s:ky>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "int,int", "-1073741824", "-55"}, {"org.jfree.data.DefaultKeyedValues2D", "getRowIndex", "java.lang.Comparable", "<s:lx>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:-1.0>", "<i:-1>", "<s:kez5>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<i:-1073741824>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<i:-2147483646>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKey", new String[]{"int"}, new String[]{"991"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-6>", "<s:bKfe>", "<s:aa>"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-2147483648>", "<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:-1.0>", "<i:-2147483648>", "<s:f>"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-31>", "<s:>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:-1.2000000000000002>", "<d:1.5>", "<s:k,Nm>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[k,Nm]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<s:k,yn\t>", "<d:0.103>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("100247282", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:y>", "<i:-12>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", ""}}, 3), new String[][]{{"isEmpty", "", "3"}, {"addAll", "int,java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<s:jy>", "<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:/>", "<i:24>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "-2041"}, {"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<s:5>"}}), new String[][]{{"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("871", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<i:2>", "5.5141699709519944E18"}}), new String[][]{{"getItemCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-2147483646>", "<i:1>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<i:-2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<i:-2147483648>", "<i:-1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "int", "-2113925146"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:4101>", "<s:key>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("89276401", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<d:1.5>", "0.72"}}), new String[][]{{"ensureCapacity", "int", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[1.5]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"setValue", "java.lang.Comparable,double", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "clear", ""}, {"org.jfree.data.DefaultKeyedValues2D", "clear", ""}}), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:7>"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:jDk>", "-0.0012"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("104112", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1073741830>", "<d:1.5>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-524402>", "<i:-2147483648>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKeys", ""}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:-30.5>", "<i:-1073741775>", "<s:si>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:Xaa>", "<s:k>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<s:a >"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:0.14>", "<sample:0>", "<null>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<i:-1>"}, {"org.jfree.data.DefaultKeyedValues2D", "clone", ""}}), new String[][]{{"getColumnKeys", "", "6"}, {"removeAll", "java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:-26>"}, false, 4, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:kk>", "<i:1>"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:-0.25>", "<s:b>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:-64.033>", "<i:61>", "<s:>"}}), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<s:fm,yn>", "<i:-26>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<sample:0>", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getItemCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:-1276.6599999999999>", "<s:kLxu>", "<s:k,>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1549386524", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clone", ""}, {"org.jfree.data.DefaultKeyedValues", "clear", ""}}, 1), new String[][]{{"getValue", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<i:4>", "<s:f>"}}), new String[][]{{"getRowCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<d:1.5>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:bf>", "0.0"}, {"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "0", "<s:y-xP>", "-1.7976931348623157E308"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<s:khy>"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-12>", "<s:kyW>", "<i:-26>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("89731517", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<i:29>", "<d:0.375>"}, {"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<s:fl,yn>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues2D", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:0.0835>", "<s:>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("29972", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<s:0\r>", "<s:keay>"}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-24>", "<s:k+yn>", "<d:-27.208>"}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeValue", "java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:kez5>"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:k,7y7>", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:k,yyn_>", "<s:bkk>"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:-85.833>", "<s:a>", "<s:kLLx>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:ky>", "-0.4000000000000001"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<s:k y>", "<i:-1073741824>"}, {"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<i:1073741796>", "-4.0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:ke\014z5>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKey", "int", "1073725439"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:kdy>"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:-31.9165>", "<s:bf>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:- /x>", "4.2340771823040973E18"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[- /x]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:+>", "-5.5141699709519933E18"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:k+ym>", "<d:-128.126>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "setValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-524290>", "<i:-16320>", "<null>"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKeys", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:6>"}}), new String[][]{{"getValue", "java.lang.Comparable", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<b:false>", "-5.5141699709519954E18"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clear", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<i:-2>", "<i:-4095>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<i:-26>", "<null>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", ""}}), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByValues", "org.jfree.chart.util.SortOrder", "<sample:0>"}, {"org.jfree.data.DefaultKeyedValues", "removeValue", "java.lang.Comparable", "<i:-285212698>"}}, 1), new String[][]{{"clone", "", "6"}, {"removeValue", "java.lang.Comparable", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:aa >"}, false, 7, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<d:0.075>", "<s:by>", "<d:3.0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<s:>", "5.5141699709519946E19"}, {"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<i:1073741823>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"listIterator", "", "3"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<b:false>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKey", "int", "54"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "hashCode", ""}}), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:-63.833>", "<sample:1>", "<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKey", "int", "-25"}, {"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "int", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "int", "2147483647"}, {"org.jfree.data.DefaultKeyedValues", "clone", ""}}), new String[][]{{"setValue", "java.lang.Comparable,double", "1"}, {"addValue", "java.lang.Comparable,java.lang.Number", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-3>", "<i:-60>", "<i:2147483647>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-23458", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "hashCode", ""}, {"org.jfree.data.DefaultKeyedValues", "getKey", "int", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeColumn", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:lLx>", "<s:k,yn>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowCount", ""}}), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clear", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "clone", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1036>", "<i:-61>", "<s:-x>"}, {"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<s:kezx5>", "<s:bf>"}}), new String[][]{{"getColumnKeys", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[-x, bf]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<s:alLx>", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2996022", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<s:fl,yn>", "<d:-11.832999999999998>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "hashCode", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getRowKey", "int", "10"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getValue", new String[]{"int"}, new String[]{"-1073741824"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:10>"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:ke5>", "NaN"}, false, 4, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "int", "-2147479552"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 3, new String[][]{}, 1), new String[][]{{"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<d:1.5>", "-0.011999999999999997"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "java.lang.Comparable", "<null>"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:Ck>", "<i:-1059>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2215", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.DefaultKeyedValues", "sortByKeys", "org.jfree.chart.util.SortOrder", "<sample:7>"}}, 1), new String[][]{{"clone", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:>k,yn>", "-0.11999999999999998"}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}, {"org.jfree.data.DefaultKeyedValues", "removeValue", "int", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<sample:3>"}}), new String[][]{{"size", "", "0"}, {"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnCount", ""}, {"org.jfree.data.DefaultKeyedValues2D", "removeRow", "int", "1978"}}), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getItemCount", ""}, {"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "2147483647", "<s:key>", "<i:-35>"}}, 1), new String[][]{{"clone", "", "2"}, {"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "int", "2147483647"}, {"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,double", "0", "<s:Xau>", "-0.04000000000000001"}}, 2), new String[][]{{"getItemCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"listIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.util.ArrayList$ListItr", actual.getClass().getName());
  assertEquals("{hasNext=false, hasPrevious=false}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"0", "<s:k,Ln>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "removeValue", "int", "2147483647"}, {"org.jfree.data.DefaultKeyedValues", "insertValue", "int,java.lang.Comparable,java.lang.Number", "1", "<s:5\n>", "<i:35>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<s:a>", "<d:-7.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByValues", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<i:-2147483648>", "<i:-1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getValue", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "equals", "java.lang.Object", "<i:0>"}, {"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-12>", "<s:>", "<s:k-e{5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "insertValue", new String[]{"int", "java.lang.Comparable", "double"}, new String[]{"0", "<s:>", "-1.0"}, false, 6, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<i:-1073741823>", "<i:21>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:kok>", "NaN"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "java.lang.Comparable", "<s:Xkk>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "setValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:-12>", "<i:30>", "<s:b>"}, {"org.jfree.data.DefaultKeyedValues2D", "clone", ""}}, 2), new String[][]{{"addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues2D", actual.getClass().getName());
  assertEquals("{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "addValue", new String[]{"java.lang.Comparable", "java.lang.Number"}, new String[]{"<s:key>", "<i:-2047>"}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<d:0.375>", "-1.0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:kLHKx>", "<s:>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "addValue", "java.lang.Number,java.lang.Comparable,java.lang.Comparable", "<i:2>", "<i:1>", "<i:-61>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "removeRow", new String[]{"int"}, new String[]{"2147482623"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "getColumnIndex", "java.lang.Comparable", "<null>"}, {"org.jfree.data.DefaultKeyedValues2D", "removeRow", "java.lang.Comparable", "<s:kNyKn>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "addValue", new String[]{"java.lang.Number", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-37>", "<d:3.0>", "<i:-2147483648>"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues2D", "removeColumn", "java.lang.Comparable", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "setValue", new String[]{"java.lang.Comparable", "double"}, new String[]{"<s:>", "-5.5141699709519946E19"}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<b:true>", "<d:0.07>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "getKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,java.lang.Number", "<i:-61>", "<i:-2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.ArrayList", actual.getClass().getName());
  assertEquals("[-61]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "hashCode", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,java.lang.Number", "<s:k>", "<d:-63.833>"}, {"org.jfree.data.DefaultKeyedValues", "getKeys", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("138", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getItemCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues2D", "org.jfree.data.DefaultKeyedValues2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"add", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:0>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "sortByKeys", new String[]{"org.jfree.chart.util.SortOrder"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.data.DefaultKeyedValues", "addValue", "java.lang.Comparable,double", "<d:1.5>", "-4.0"}, {"org.jfree.data.DefaultKeyedValues", "setValue", "java.lang.Comparable,double", "<s:an+a>", "-0.011999999999999997"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.DefaultKeyedValues", "org.jfree.data.DefaultKeyedValues", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.DefaultKeyedValues", "getValue", "int", "-2147483634"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.DefaultKeyedValues", actual.getClass().getName());
  assertEquals("{getItemCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getItemCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
