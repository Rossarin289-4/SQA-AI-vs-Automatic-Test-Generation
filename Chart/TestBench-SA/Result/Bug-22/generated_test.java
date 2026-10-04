package generated.algorithm;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import static org.junit.Assert.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SimulatedAnnealingGeneratedTest {
 @Test(timeout = 20000)
 public void generatedInput000() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<i:-37>", "<s:G>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<null>", "<sample:0>"}, {"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-37>", "<sample:0>"}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<i:0>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:b>", "<s:key>", "<s:a>"}, {"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<s:a>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<null>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<sample:1>", "<s:aa>"}}, 3), new String[][]{{"removeObject", "java.lang.Comparable,java.lang.Comparable", "1"}, {"getColumnKeys", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[aa]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:fff2-\t->", "<s:fff2-\t->"}, {"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("fff2-\t-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:2>", "<s:day3>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:2>", "<i:-37>", "<s:aaa>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<sample:3>", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:G>", "<null>"}, false, 14, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<s:kXy>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 9, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s: ey->", "<s:a>"}, {"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<s:4>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<null>", "<s:key>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:kkwEexye>", "<s:aaa>", "<sample:3>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<b:true>"}}, 3), new String[][]{{"addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "3"}, {"getObject", "java.lang.Comparable,java.lang.Comparable", "4"}, {"removeColumn", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<null>"}, false, 10, new String[][]{{"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<s:kE>"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "int", "1"}, {"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<null>", "<s:kkey>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<s:3fff2-\t->", "<s:ff2-\t-->"}, {"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}), new String[][]{{"addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "7"}, {"clone", "", "5"}, {"getObject", "int,int", "2"}, {"getColumnIndex", "java.lang.Comparable", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:8>", "<s:fff2-\t->", "<s:ff2-\t-->"}, {"org.jfree.data.KeyedObjects2D", "hashCode", ""}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:8>", "<sample:0>", "<s:aP>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:b>", "<i:1>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:50>", "<sample:1>", "<sample:1>"}, {"org.jfree.data.KeyedObjects2D", "clone", ""}}, 3), new String[][]{{"setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "1"}, {"removeObject", "java.lang.Comparable,java.lang.Comparable", "6"}, {"getObject", "java.lang.Comparable,java.lang.Comparable", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:L>", "<i:28>"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<s:b>"}, {"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:gf>", "<s:\t>"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:g>", "<s:\tk>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<b:true>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<s:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-2147483648"}}, 1), new String[][]{{"removeColumn", "java.lang.Comparable", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<s:fff2-\t->"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<s:c>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:2>", "<i:-37>", "<s:fff2-\t->"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "10"}, {"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}, {"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<s:!ey->", "<i:2>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:8>", "<s:x>", "<s:3fff2-\t->"}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-10"}, {"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}, {"org.jfree.data.KeyedObjects2D", "hashCode", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:-13>"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s: ey->", "<s:fff2-\t->"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<sample:1>", "<s:key>"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<null>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"-2147352587"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"removeRow", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:a>", "<s:key>", "<s:x>"}}, 1), new String[][]{{"removeRow", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s: Bey,>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:ff2R-\t--->", "<s:key>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:ff2R-\t--->", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"-1"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "int", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:a>", "<s:aa>"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}, {"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "2147483647"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"int"}, new String[]{"-1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"-2147483648"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<null>", "<i:-2>"}}, 3), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:bb>"}, false, 15, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:0>", "<s:ff2-\t-->"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"int", "int"}, new String[]{"1", "-2147483648"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:l>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:l>"}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:fff2-\t->", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<null>", "<s:G>", "<s:3fff2-\t->"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "int", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"54"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "-10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:v>", "<s:C6>", "<s:ff2S-\t---T>"}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<i:-1>", "<b:true>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:.>", "<s:C>", "<s:ff3wS-\t--.T>"}, false, 9, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}, {"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:a>", "<s:fff2-\t->", "<s:ff2R-\t--->"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[ff2R-\t---]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s:b>", "<s:>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:m>", "<s:fff2-\t->", "<s:ff2R-\t--->"}}, 2), new String[][]{{"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s:b>", "<s:>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:m>", "<s:fff2-\t->", "<s:ff2R-\t--->"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[ff2R-\t---]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s:b>", "<s:>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:m>", "<s:fff2-\t->", "<s:ff2R-\t--->"}}, 2), new String[][]{{"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s:b>", "<s:>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:m>", "<s:fff2-\t->", "<s:ff2R-\t--->"}}, 2), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<sample:1>", "<s:G>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 10, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "int", "-2147483627"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<sample:1>", "<s:GG>"}}, 3), new String[][]{{"getColumnKey", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-2147483648"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<s:x>"}}, 2), new String[][]{{"removeObject", "java.lang.Comparable,java.lang.Comparable", "4"}, {"getRowKey", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}, {"org.jfree.data.KeyedObjects2D", "hashCode", ""}}, 1), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s::x>", "<i:-1>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"2147483647"}, false, 4, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s:3>", "<s:G)>"}}, 3), new String[][]{{"get", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"int"}, new String[]{"1"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"-1073741815"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-1"}, {"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:1HX>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<sample:0>", "<i:1>"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<i:1>"}, {"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:mG>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<i:1>"}, {"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<sample:0>", "<i:1>"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<i:1>"}, {"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:1.5>", "<s:>", "<s:\u00e93>"}, false, 10, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:fff2-\t->", "<s:x>"}, {"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:G>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<s:>"}, {"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s:aa>", "<null>"}}, 1), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}, {"listIterator", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:a>", "<null>", "<i:-43>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-3>", "<s:b>", "<s:f2R-\t--->"}, false, 7, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 14, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:G>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:ff2A\t--6->"}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:fe2-\t-->", "<s:x>"}, {"org.jfree.data.KeyedObjects2D", "clone", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<i:2>", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("871", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:3eff2-\t->"}, false, 10, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<s: ey->"}, {"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<b:false>", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "int", "-1"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "int", "-1073741824"}}, 3), new String[][]{{"clear", "", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-37>", "<sample:1>"}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<i:0>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:b>", "<s:key>", "<s:a>"}, {"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s: ey->", "<null>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}}, 2), new String[][]{{"remove", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<null>", "<i:2>", "<s:x>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[x]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<null>", "<i:2>", "<s:w>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[w]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:key>", "<s:a>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s: ey->", "<s:aa>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}, {"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<s:3>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<s:3>", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"2147483647"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:x>", "<s:ff2-\t-->"}, false, 11, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "-2147483648"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<s:b>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<s:key>", "<s:b>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<s: ey->", "<s:x>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "int", "10"}}), new String[][]{{"removeColumn", "java.lang.Comparable", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}, {"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-2147483648"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<s: ey->"}}), new String[][]{{"removeColumn", "java.lang.Comparable", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<null>"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<s:fff2-\t->"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"int"}, new String[]{"-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<i:2>", "<s:>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-63>", "<i:-92>", "<s:>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:a>", "<s:fff2-\t->"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<d:1.5>", "<b:true>"}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-2147483648"}, {"org.jfree.data.KeyedObjects2D", "getObject", "int,int", "2147483647", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<sample:1>", "<s:key>"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<i:-61>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "-2147483648"}}), new String[][]{{"removeRow", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:a>", "<s:kAey>", "<s:x>"}, {"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "-2147483648"}}), new String[][]{{"removeRow", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:2>", "<s:aa>", "<d:1.5>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:`>", "<s:kAey>", "<s:x>"}, {"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "-2147483596"}}), new String[][]{{"removeRow", "int", "2"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=2, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s:3>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "-10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"int", "int"}, new String[]{"-2147483648", "10"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "hashCode", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<s:3fff2-\t->", "<null>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("871", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<s:b>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "int,int", "1", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:2>"}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:8>", "<i:0>", "<s:3fff2-\t->"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false), new String[][]{{"listIterator", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:2>", "<i:2>", "<i:2>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}, {"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:ff2R-\t--->", "<s:aa>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<null>", "<s:3fff2-\t->"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:a>", "<null>", "<s:ff2R-\t--->"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<i:-1>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "-10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:a>", "<s:fff2-\t->", "<s:ff2R-\t--->"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[ff2R-\t---]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:m>", "<s:fff2-\t->", "<s:ff2R-\t--->"}}), new String[][]{{"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}}), new String[][]{{"indexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}, {"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-10"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<d:1.5>", "<s:fff>"}}), new String[][]{{"removeObject", "java.lang.Comparable,java.lang.Comparable", "4"}, {"getRowCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}, {"org.jfree.data.KeyedObjects2D", "hashCode", ""}}), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:H>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<sample:0>", "<i:1>"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<i:1>"}, {"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false), new String[][]{{"remove", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<i:4>"}}), new String[][]{{"getRowIndex", "java.lang.Comparable", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"int"}, new String[]{"10"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}, {"listIterator", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<s:b>", "<s:>"}, {"org.jfree.data.KeyedObjects2D", "getRowCount", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:ff2-\t-->"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:ff2-\t-->", "<s:x>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<i:2>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<null>", "<s:ff2R-\t--->", "<s:3>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[3]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<i:1>"}}), new String[][]{{"getColumnKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<s:aaa>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<i:0>", "<i:2>"}, {"org.jfree.data.KeyedObjects2D", "getObject", "int,int", "0", "10"}, {"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:b>", "<i:2>", "<s:x>"}}, 3), new String[][]{{"lastIndexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<s:ff2-\t-->"}, {"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<s:3>", "<s:fff2-\t->"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:Eb>", "<i:2>", "<s:x>"}}, 1), new String[][]{{"addAll", "int,java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<b:true>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "int", "1"}, {"org.jfree.data.KeyedObjects2D", "clone", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<d:1.5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s:Taa>"}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<s:>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:2>", "<i:-1>", "<i:-37>"}, {"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getColumnCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false), new String[][]{{"contains", "java.lang.Object", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ff2-\t-->", "<s:aa>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:ff2-\t-->", "<i:-1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ff2-\t-->", "<s:aP>"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:ff2-\t-->", "<i:-1>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "0"}, {"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ff2R-\t--->", "<s:a>"}, false, 11, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:ff2-\t-->", "<i:-1>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "0"}, {"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ff2R-\t--->", "<s:>"}, false, 11, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:ff2-\t-->", "<i:-1>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "0"}, {"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "24"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "-2147483648"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:>", "<s:fff2-\t->"}, {"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:ff2-\t-->", "<sample:0>"}, {"org.jfree.data.KeyedObjects2D", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:Ca>"}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:ff2-\t-->", "<sample:0>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<s:a>"}, {"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:aa>"}}, 3), new String[][]{{"removeObject", "java.lang.Comparable,java.lang.Comparable", "7"}, {"getColumnKeys", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<s:a>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<null>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<sample:1>", "<s:aa>"}}), new String[][]{{"removeObject", "java.lang.Comparable,java.lang.Comparable", "1"}, {"getColumnKeys", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[aa]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 17, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}, 1), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getColumnCount", "", "6"}, {"getColumnCount", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:2>", "<i:1>", "<s:G>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<b:true>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:1.4699999999999998>", "<s:b>"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<i:-37>", "<s:3fff2-\t->"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<s: eyL->"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"-10"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "0"}, {"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"int"}, new String[]{"8388608"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}, 1), new String[][]{{"isEmpty", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"8202"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "int,int", "2147483647", "-10"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<sample:4>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:0>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<s:a\u00e9aa>", "<null>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<s:a\u00e9aa>", "<null>"}}, 3), new String[][]{{"containsAll", "java.util.Collection", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:aab>"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<s:key>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:a>", "<i:33554384>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "hashCode", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("871", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:3>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<i:-37>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:71>", "<s:x>", "<s:Pa>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:x>", "<s:G>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"-1"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "clone", ""}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "int,int", "1", "1"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<s:b>"}}, 1), new String[][]{{"isEmpty", "", "4"}, {"set", "int,java.lang.Object", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 21, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<i:2>", "<i:0>"}, {"org.jfree.data.KeyedObjects2D", "getRowCount", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 9, new String[][]{}, 3), new String[][]{{"subList", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "hashCode", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.data.KeyedObjects2D", "hashCode", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("871", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "2147483647"}, {"org.jfree.data.KeyedObjects2D", "hashCode", ""}, {"org.jfree.data.KeyedObjects2D", "getRowKeys", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:3>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ao>", "<d:1.5>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:key>", "<s:aa>", "<s:G>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:1.5>", "<s:>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:key>", "<sample:0>", "<s:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<i:-47>", "<s:keey>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:kH@y>", "<null>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "hashCode", ""}, {"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<s:>"}, {"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<i:2>"}}, 2), new String[][]{{"subList", "int,int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "hashCode", ""}, {"org.jfree.data.KeyedObjects2D", "removeRow", "java.lang.Comparable", "<s:>"}}, 2), new String[][]{{"iterator", "", "4"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:0>"}, false, 9, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:aaa>", "<s:3fff2-\t->"}, {"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<i:0>"}, {"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.KeyedObjects2D", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 11, new String[][]{}, 3), new String[][]{{"remove", "java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"java.lang.Comparable"}, new String[]{"<i:2>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s:fff2-\t->", "<s:aa>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<i:2>", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 23, new String[][]{}), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 26, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "-2147483648"}}, 2), new String[][]{{"indexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s:x>"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:a>", "<s:x>"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"java.lang.Comparable"}, new String[]{"<s:x>"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:a>", "<s:x>"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<sample:1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:aa>", "<s:ff2-\t-->"}, {"org.jfree.data.KeyedObjects2D", "getRowCount", ""}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[aa]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-10"}, {"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<s:3>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<i:2>"}}, 3), new String[][]{{"getColumnKeys", "", "6"}, {"indexOf", "java.lang.Object", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:key>", "<s: ey->", "<s:3fff2-\t->"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:key>", "<i:0>", "<s:aP>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:8x>", "<s:t>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ky>", "<s:/D>", "<s:`a>"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:ff2R-\t--->", "<s:3>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<sample:1>", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=3, getRowCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:0Dky\tr>", "<s:ff>", "<s:l>"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:ff2R-\t--->", "<s:3>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<b:true>", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=3, getRowCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:0Dky\tr>", "<s:ff>", "<s:>"}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowCount", ""}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:ff2R-\t--->", "<s:3>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<b:true>", "<s:>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s: ey->", "<s:fff2-\t->"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:-0.097>"}, false, 14, new String[][]{{"org.jfree.data.KeyedObjects2D", "getObject", "int,int", "2147483647", "-1073741824"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<d:1.5>", "<s: ey->"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<s: ey->"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:1>", "<null>", "<s:ff2R-\t--->"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<s:key>"}, {"org.jfree.data.KeyedObjects2D", "clone", ""}, {"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<i:49>", "<s:>"}}, 1), new String[][]{{"iterator", "", "1"}, {"next", "", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{}, 1), new String[][]{{"getColumnKeys", "", "3"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 16, new String[][]{}, 1), new String[][]{{"getColumnKeys", "", "3"}, {"isEmpty", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 11, new String[][]{}, 2), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 13, new String[][]{}, 2), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<s:ff2-\t-,>", "<b:true>"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<i:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:key>", "<s:b>", "<i:-37>"}, {"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<s:>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[-37]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2), new String[][]{{"getRowIndex", "java.lang.Comparable", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<sample:3>", "<s:G>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("2", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:aaa>", "<s:ff2-\t-->"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ff2-\t--", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s: ey->", "<i:-37>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:aaa>", "<s:ff2-\t-->"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-37", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<i:-37>", "<s:aa>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:key>", "<sample:1>", "<s:3>"}}), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeColumn", new String[]{"int"}, new String[]{"0"}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<s:day3>", "<d:1.5>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<i:2>"}}, 2), new String[][]{{"setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "0"}, {"getColumnKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<null>"}}, 2), new String[][]{{"setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "0"}, {"getColumnKeys", "", "4"}, {"clear", "", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:3>", "<s:3fff2-\t->"}, {"org.jfree.data.KeyedObjects2D", "hashCode", ""}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<s:3fff2-\t->"}}, 2), new String[][]{{"setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "0"}, {"getColumnKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:3>", "<s:3fff2-\t->"}, {"org.jfree.data.KeyedObjects2D", "hashCode", ""}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<s:)3fff2-\t->"}}, 2), new String[][]{{"setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "0"}, {"getColumnKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[3fff2-\t-, b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:3>", "<s:3fff2-\t->"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "java.lang.Comparable", "<s:3fff2-\t->"}, {"org.jfree.data.KeyedObjects2D", "getObject", "int,int", "2147483647", "-10"}}), new String[][]{{"setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "0"}, {"getColumnKeys", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[b]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<s:3/fff2-\t->", "<sample:1>"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnKey", "int", "0"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<s:aP>", "<sample:3>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:false>", "<d:0.75>", "<s:ff2-\t->"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<sample:2>", "<i:1>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:key>", "<s: ey->", "<i:2>"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "int", "2097151"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=3, getRowCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<d:0.787>", "<s:ff2-->"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:key>", "<s: ey->", "<i:2>"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "int", "0"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:b>", "<d:0.787>", "<s:ff1-->"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:key>", "<s: ey->", "<i:2>"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "int", "256"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:aaa>", "<s:>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:x>", "<s:aP>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:aa>", "<s:aa>"}, {"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:aaad>", "<s:>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:x>", "<s:aP>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:aa>", "<s:aa>"}, {"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:-29>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:a>", "<sample:3>", "<sample:3>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:a>", "<sample:3>", "<sample:3>"}, {"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 27, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:b>", "<i:1>", "<b:true>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:y>"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "int", "2147483647"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<s:day3>", "<i:-1>"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:a>", "<s:xo>", "<s:aaa>"}}, 3), new String[][]{{"getColumnIndex", "java.lang.Comparable", "6"}, {"getRowKey", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xo", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:a>", "<s:xn>", "<s:aaa>"}, {"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}, 3), new String[][]{{"getColumnIndex", "java.lang.Comparable", "6"}, {"getRowKey", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("xn", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:aP>", "<i:0>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:a>", "<s:xn>", "<s:aaa>"}, {"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}, 3), new String[][]{{"getColumnIndex", "java.lang.Comparable", "3"}, {"getRowKey", "int", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("aP", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<b:true>"}}, 1), new String[][]{{"get", "int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 9, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:b>", "<s: ey>"}, {"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<s:aa>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ey", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:8>", "<sample:1>", "<i:-1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<s:4>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<i:1>", "<s: ey->"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ey-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowIndex", "java.lang.Comparable", "<s:4>"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<i:1>", "<s: ey->"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals(" ey-", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "int", "0"}, {"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "2147483647"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<i:2>"}}, 1), new String[][]{{"getRowIndex", "java.lang.Comparable", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeRow", "int", "64"}, {"org.jfree.data.KeyedObjects2D", "equals", "java.lang.Object", "<sample:0>"}}, 1), new String[][]{{"getRowIndex", "java.lang.Comparable", "2"}, {"getRowIndex", "java.lang.Comparable", "2"}, {"getColumnCount", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeObject", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:fff_2-\t->", "<null>"}, false, 1, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "-1"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnCount", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:\010key>", "<s:a_aK>"}, {"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<s:3fff2-\t->", "<s:3fff2-\t->"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{{"org.jfree.data.KeyedObjects2D", "getRowKey", "int", "5"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:8>", "<i:0>", "<s:kez>"}}, 2), new String[][]{{"getRowCount", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:8>", "<i:1>", "<s:kez>"}}, 2), new String[][]{{"getRowKeys", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[1]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "setObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:false>", "<s:  >", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:40>"}, false, 11, new String[][]{{"org.jfree.data.KeyedObjects2D", "hashCode", ""}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:2>", "<i:-37>", "<s:>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "hashCode", ""}, {"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:b>", "<sample:3>", "<s:day3>"}}, 2), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "hashCode", ""}, {"org.jfree.data.KeyedObjects2D", "getColumnKeys", ""}}, 2), new String[][]{{"iterator", "", "1"}, {"next", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b1Ct>"}, false, 9, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "0"}, {"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:true>", "<b:true>", "<s:x->"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKeys", new String[]{}, new String[]{}, false, 12, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:8>", "<b:true>", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 5, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<b:false>", "<s:FF>", "<d:1.5>"}, {"org.jfree.data.KeyedObjects2D", "getColumnCount", ""}, {"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s:ff2-\t-->", "<s:ff2-\t-->"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.5", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "clone", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeColumn", "int", "-2147483648"}, {"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<b:false>"}, {"org.jfree.data.KeyedObjects2D", "getObject", "java.lang.Comparable,java.lang.Comparable", "<s:aa>", "<i:2>"}}, 1), new String[][]{{"getRowKeys", "", "2"}, {"clear", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "addObject", new String[]{"java.lang.Object", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<s:>", "<s:aa>"}, false, 2, new String[][]{{"org.jfree.data.KeyedObjects2D", "getColumnIndex", "java.lang.Comparable", "<s:key>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<i:0>", "<s:aP>"}, {"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<s:`a>", "<sample:3>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:LEj-y>"}, false, 0, new String[][]{{"org.jfree.data.KeyedObjects2D", "addObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:key>", "<s:ff2R-\t--->"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getRowKey", new String[]{"int"}, new String[]{"0"}, false, 6, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:a>", "<sample:0>", "<sample:3>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("a", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "removeRow", new String[]{"int"}, new String[]{"0"}, false, 10, new String[][]{{"org.jfree.data.KeyedObjects2D", "removeObject", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:d>"}, {"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<i:0>", "<i:-1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getColumnKeys", new String[]{}, new String[]{}, false, 2, new String[][]{}, 1), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.KeyedObjects2D", "org.jfree.data.KeyedObjects2D", "getObject", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 3, new String[][]{{"org.jfree.data.KeyedObjects2D", "setObject", "java.lang.Object,java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:aP>", "<i:-1>"}, {"org.jfree.data.KeyedObjects2D", "removeRow", "int", "-2147483632"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
