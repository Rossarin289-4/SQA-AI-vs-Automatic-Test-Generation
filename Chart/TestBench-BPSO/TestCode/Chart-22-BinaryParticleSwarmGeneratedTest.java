package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryParticleSwarmGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-2147483648>", "<sample:0>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<i:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:Fa>", "<sample:5>", "<null>"}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:b>", "<null>", "<null>"}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<i:-2147483648>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:b>", "<s:b>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<i:0>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:key>", "<s:>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s:key>", "<null>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<i:2>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("871", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<sample:2>"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:b>", "<sample:9>", "<sample:9>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"-1"}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:18>", "<s:bo>", "<d:1.5>"}, {"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<i:0>"}}, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:5>", "<i:2147483647>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<s:b>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:\rkeyN>", "<i:0>", "<sample:9>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:`a>", "<i:1>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:\rkeyN>", "<sample:2>", "<s:>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:\t5>", "<sample:7>", "<s:Ab>"}}), new String[][]{{"addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "0"}, {"removeColumn", "int", "3"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:Ca>", "<s:<>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:k>"}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<null>", "<s:key>", "<s:>"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<sample:4>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "int,int", "-10", "1073741823"}}, 3), new String[][]{{"addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "3"}, {"getObject", "java.lang.Comparable,java.lang.Comparable", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:b>", "<i:22>", "<s:xey>"}}), new String[][]{{"addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "7"}, {"getObject", "int,int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"10"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "int", "2147483647"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 7, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "int", "1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:FT>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "0"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<s:key>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-4>", "<i:-1>", "<sample:0>"}, false, 7, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:4>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"1"}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<sample:3>", "<s:b>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<i:0>"}, false, 6, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:0.75>"}, false, 6, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"-8388598"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:ex>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:56>", "<b:true>", "<null>"}, false, 5, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<s:gkey>", "<sample:1>"}, false, 6, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:w`>", "<i:1>", "<s:key>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 4, new String[][]{}, 1), new String[][]{{"contains", "java.lang.Object", "0"}, {"contains", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<s:a>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:at>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<sample:0>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "2147483641"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:a>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<b:true>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<s:k\rey>"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<s:Xb>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"1073741823"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:Ea>", "<s:b>", "<i:-2147483648>"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "-2147483647"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<i:-2>"}}, 2), new String[][]{{"remove", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:\tE>", "<sample:1>", "<b:true>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:\t->", "<sample:4>", "<sample:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "2147483647"}}, 3), new String[][]{{"contains", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:keyu>"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<i:0>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:5>", "<sample:9>"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:b>", "<s:ky>"}, {"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "hashCode", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"10"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<i:-2147483648>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1), new String[][]{{"addAll", "int,java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-4"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:a\010>", "<sample:5>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<i:-4>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:ky7>", "<s:kkey>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:ke:y>"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:y>", "<s:_0a>", "<s:keez>"}, {"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}}, 2), new String[][]{{"getRowKey", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"-1073741823"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"int", "int"}, new String[]{"-1", "-1"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<i:1>"}}, 2), new String[][]{{"removeColumn", "java.lang.Comparable", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ky6>", "<i:-2147483648>", "<s:_b>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:db>", "<d:0.75>", "<i:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<d:15.0>", "<i:0>", "<i:-1>"}}, 1), new String[][]{{"removeObject", "java.lang.Comparable,java.lang.Comparable", "5"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "int", "-2"}, {"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:18>", "<i:60>", "<i:-2147483648>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s:I_Da>", "<d:1.5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"int", "int"}, new String[]{"2", "2147483594"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:8>", "<null>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "-10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"removeRow", "java.lang.Comparable", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:\t>", "<i:2>", "<sample:9>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:F`>", "<sample:0>", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}, {"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}, 1), new String[][]{{"containsAll", "java.util.Collection", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:31>", "<sample:0>", "<s:s>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:7>"}, false, 4, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "1"}}, 1), new String[][]{{"getRowCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}, 2), new String[][]{{"getRowCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Ey>", "<s:bo>", "<d:1.5>"}}, 1), new String[][]{{"getColumnCount", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getRowIndex", "java.lang.Comparable", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("871", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:FaE>", "<s:>", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 1, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:Fa>", "<sample:2>", "<i:-2147483648>"}, false, 3, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "hashCode", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "hashCode", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("871", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:>0>"}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"-2147483135"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:7>", "<s:H >"}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "2"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getColumnIndex", "java.lang.Comparable", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s:keyy>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<s:>", "<s:>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<b:true>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<d:2.5>"}}), new String[][]{{"getColumnKeys", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"add", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Pa>", "<i:1>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "int", "2"}, {"nextIndex", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<d:1.5>"}}), new String[][]{{"getRowKeys", "", "7"}, {"remove", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"int", "int"}, new String[]{"0", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getRowKey", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 5, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:Ha>", "<sample:1>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<i:-2>", "<d:3.0>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:C>", "<sample:0>", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<d:1.51>", "<s:a>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"containsAll", "java.util.Collection", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getObject", "java.lang.Comparable,java.lang.Comparable", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<s:b>"}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:\t>", "<sample:5>", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "6"}, {"next", "", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ca>", "<null>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<s:>"}}), new String[][]{{"get", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-2>", "<s:a>", "<i:0>"}}), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<sample:9>", "<s:_a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<i:2>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:ky>", "<s:_a>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:1>"}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<sample:5>", "<s:>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:2>", "<s:a>", "<i:-67108865>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:xkey>", "<sample:9>", "<i:1>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Hb>", "<i:-1>", "<i:-2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "hashCode", ""}, {"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}), new String[][]{{"remove", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:_a>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:5>", "<s:key>", "<s:>"}, {"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:ley>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "2147483647"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<i:1>", "<s:A>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<sample:1>", "<s:_a>"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<s:ob>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<b:true>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<i:-16777216>", "<sample:7>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{}), new String[][]{{"getColumnIndex", "java.lang.Comparable", "4"}, {"getColumnCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:27>", "<s:a>", "<s:9_a>"}, {"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:0>", "<i:2>", "<b:true>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<b:false>", "<sample:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"int"}, new String[]{"-2147483647"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:4>", "<b:false>", "<d:1.457>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "-2147483648"}}), new String[][]{{"addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "5"}, {"getColumnKeys", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 5, new String[][]{}), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}}), new String[][]{{"listIterator", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:\n5>", "<s:>", "<s:Hb>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:>", "<sample:4>"}, {"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<sample:9>", "<sample:0>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "-2147483648"}}), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"removeRow", "java.lang.Comparable", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}), new String[][]{{"listIterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"removeRow", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "hashCode", ""}}, 3), new String[][]{{"add", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getColumnIndex", "java.lang.Comparable", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getRowCount", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "hashCode", ""}}, 3), new String[][]{{"getColumnKeys", "", "0"}, {"retainAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:a>", "<s:_a>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:Faa>", "<sample:8>", "<i:2147483647>"}, false, 6, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-16384>", "<s:>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:ly>", "<i:0>", "<i:-2147483648>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<s:b>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<i:0>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "int", "0"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "2147483647"}}, 3), new String[][]{{"isEmpty", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<i:-2147483648>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "hashCode", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"int"}, new String[]{"18"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<i:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false), new String[][]{{"isEmpty", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "int,int", "0", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"getRowKey", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<i:-44>"}}, 3), new String[][]{{"clone", "", "3"}, {"getColumnIndex", "java.lang.Comparable", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"getRowKeys", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, null, 1), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getRowKeys", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:xkey>", "<sample:2>", "<s:aa>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s::F\ra>", "<s:9a>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:bm>", "<d:0.75>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:k>", "<i:-1>", "<s:a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[-1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:e>", "<b:true>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:b>", "<s:bbo>", "<s:c>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:key>", "<d:0.75>", "<i:-2147483648>"}}, 1), new String[][]{{"add", "int,java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-46>", "<sample:8>", "<sample:0>"}}, 2), new String[][]{{"getColumnIndex", "java.lang.Comparable", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}, 3), new String[][]{{"removeAll", "java.util.Collection", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<i:0>"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("871", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "hashCode", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<s:bb>", "<i:-45>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"int", "int"}, new String[]{"2147483647", "2147483644"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:xkey>"}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Ga>", "<s:_a>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:0>", "<i:-1073741835>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-59>", "<i:0>", "<s:ke>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"indexOf", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:k>", "<s:_a>", "<b:true>"}}, 1), new String[][]{{"getColumnKeys", "", "3"}, {"removeAll", "java.util.Collection", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s:Cbo>"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<i:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:obX>", "<sample:1>", "<b:true>"}, {"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:F>", "<sample:10>", "<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:key>", "<sample:2>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:o>", "<sample:7>", "<i:-2147483648>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=3, getRowCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<i:-16360>"}}), new String[][]{{"addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "5"}, {"getRowCount", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}}, 1), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-33554431>", "<s:>", "<i:-2147483648>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:ks>", "<s:a>", "<s:fB>"}}), new String[][]{{"clone", "", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:xa>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<s:w_a>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}, 3), new String[][]{{"indexOf", "java.lang.Object", "5"}, {"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}, 2), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<i:-1073741824>"}, {"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-512>", "<d:1.5>", "<s:__a>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:8Fa>", "<s:key>", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:HHb>", "<i:0>", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:key>"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:xldy>", "<i:0>", "<b:true>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:a>", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ke>", "<i:-1>", "<s:>"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:uxky>", "<s:bo>", "<s:a>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "0"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s:kecy>"}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<i:-2147483648>", "<s:)a>"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<b:true>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[-2147483648]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<sample:1>", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<i:0>", "<s::>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:a8:>", "<i:-2>"}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>key>", "<s:_a>", "<s:o>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:rb>", "<s:key>", "<sample:9>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Hb7>", "<sample:8>", "<i:2>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:bo1>", "<b:false>"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:ykey>", "<sample:1>", "<i:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}}, 3), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<i:-2147483648>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:56>", "<s:_>", "<sample:0>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:61>"}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:;ke>", "<sample:5>", "<s:b>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<null>", "<sample:1>", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:3>"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:ke>", "<s:b>", "<sample:9>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<s:c>", "<i:-2147483648>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[-2147483648]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<b:true>", "<i:1>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:key>", "<s:_a1>", "<sample:12>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("_a1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "71"}}, 1), new String[][]{{"listIterator", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:cbo>"}, false, 4, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"int"}, new String[]{"-1"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<i:-1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "2147483601"}}, 2), new String[][]{{"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<b:false>"}, {"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-54"}}, 2), new String[][]{{"getRowKeys", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<i:26>", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:false>", "<i:8>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:30>", "<i:-1>", "<s:_a>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:ky>", "<sample:11>", "<sample:9>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "2147221503"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:BHb>", "<i:1>", "<s:_a>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[_a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:Fca>", "<sample:0>", "<s:)>"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:ua>", "<d:1.5>", "<i:2>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:0>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1073741823>", "<s:\r>", "<i:-2147483648>"}, {"org.jfree.data.KeyedObjects2D", "getObject", "int,int", "0", "-10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Ib>", "<i:2>", "<s:a>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<i:0>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[2, 0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<i:-2147483648>", "<s:`>"}, {"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<sample:8>", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<i:-2147483648>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:ky>", "<sample:1>", "<sample:4>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<s:\r>", "<i:45>"}, {"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<sample:5>"}}, 3), new String[][]{{"getColumnKey", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("45", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:18>", "<s:_T`>", "<s:\r>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[\r]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Hb>", "<i:-1>", "<i:50>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:27>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:E>", "<s:_`>", "<i:2>"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<sample:4>", "<sample:0>"}, {"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}, 2), new String[][]{{"containsAll", "java.util.Collection", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{}, 3), new String[][]{{"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:xkex>", "<s:\r>", "<sample:7>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{}, 2), new String[][]{{"isEmpty", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:2147483647>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-17>", "<s:a>", "<d:13.899999999999999>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:xkey>", "<i:-2>", "<sample:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:\010c>", "<sample:10>", "<s:\r>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:b>", "<i:2>", "<d:7.7>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:kx>", "<s:boi>", "<i:0>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<i:0>"}}, 2), new String[][]{{"getRowKeys", "", "1"}, {"addAll", "int,java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Hb4>", "<i:0>", "<s:_a>"}}, 1), new String[][]{{"listIterator", "", "0"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:xkdy>", "<s:>", "<sample:4>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("key", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:\016>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Cnb>", "<s:key>", "<i:0>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<s:>", "<i:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<s:a>"}}, 3), new String[][]{{"indexOf", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<s:aT>"}, {"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "59"}}, 2), new String[][]{{"get", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Ga>", "<s:`>", "<s:key>"}, {"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[key]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:2>"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<sample:5>", "<sample:0>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Hb>", "<s:-key>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-3>", "<i:0>", "<i:-2147483625>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:a>", "<s:b>"}, {"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:D>", "<s:keyy>", "<i:-8388610>"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-8388610", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:2147483646>", "<s:bos>", "<sample:4>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "0"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[bos]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"int"}, new String[]{"0"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Hb>", "<s:1>", "<sample:11>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"listIterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<i:2147483647>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"get", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}}, 2), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:\rkeN>", "<s:`a>", "<i:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("`a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<i:2147483647>", "<sample:9>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<sample:9>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getRowKeys", "", "1"}, {"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<s:ky>"}}, 3), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<s:_a>", "<i:28>"}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:\t>", "<s:_a>", "<i:2147483647>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<i:0>", "<i:-1>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:ky>", "<s:>", "<s:k\ry>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "5"}, {"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"0"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:-Fa>", "<sample:1>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:kfy>", "<sample:5>", "<s:b>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:uxky>", "<sample:0>", "<null>"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}, {"org.jfree.data.KeyedObjects2D", "getObject", "int,int", "-10", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:uxkkHy>", "<sample:0>", "<s:key>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<sample:0>", "<i:1073741823>"}, {"org.jfree.data.KeyedObjects2D", "getObject", "int,int", "37", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:uxkx>", "<null>", "<s:aa>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<sample:5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:2>", "<s:>", "<s:>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:\rkeyN>", "<s:8b>", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Fa>", "<sample:3>", "<i:-2147483648>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:kyg>", "<s:bo>", "<i:-2147483648>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[-2147483648]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:ky>", "<s:>", "<i:2147483647>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[2147483647]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:ky>", "<s:o>", "<i:-1>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:18>", "<i:-25>", "<i:-2147483648>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-2>", "<s:bo8>", "<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:FP>", "<i:2147483608>", "<i:2>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:52>", "<sample:0>", "<sample:10>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=3, getRowCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<sample:0>", "<s:bo>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}}, 2), new String[][]{{"size", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:8Hb>", "<sample:4>", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:key>"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:ux>", "<sample:1>", "<sample:5>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:)>", "<sample:4>", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:a>", "<b:true>", "<s:fab>"}, {"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fab", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-11>", "<i:2147483626>", "<i:-2147483648>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:\rkeyN>", "<s:b>", "<s:jey>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
}
