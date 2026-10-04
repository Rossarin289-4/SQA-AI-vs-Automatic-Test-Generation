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
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:a>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "0", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:key>", "<d:1.5>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:b>", "<i:0>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:a>", "<i:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<b:true>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "java.lang.Comparable,java.lang.Comparable", "<b:true>", "<i:0>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "-1", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "10", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<s:X>", "<s:b00H>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<s:\tb>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", "boolean", "false"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<s:a>", "<s:keyB>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[sample, , a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"int", "int"}, new String[]{"-2147483635", "2147352575"}, false, 11, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:6>", "<s:b00H>", "<s:X>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:b00H>", "<s:b1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<i:1>", "<i:1>"}, false, 9, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:7>", "<s:a>", "<s:b>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<sample:1>", "<i:1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:3>", "<i:1>", "<sample:1>"}, false, 11, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<s:jiddy[>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<i:1>", "<i:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<i:0>", "<s:b00H>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"int", "int"}, new String[]{"1", "1"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<s:dB81>", "<s:b>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:6>", "<s:key>", "<s:kkey>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", new String[]{"boolean"}, new String[]{"false"}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "10", "0"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:b:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<d:1.5>", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:7>", "<sample:0>", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<null>", "<sample:0>", "<s:a>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:key>", "<i:2>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<b:true>", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "int,int", "0", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<s:X>"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:a>", "<s:X>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:X>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<i:0>", "<s:X>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:X>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"-60", "2147479317"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<sample:1>", "<s:b>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<i:1>", "<sample:2>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:1>", "<s:b00H>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<null>", "<i:1>", "<s:b00H>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<null>", "<sample:1>", "<i:0>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<i:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 10, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "int,int", "-2147483635", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<d:1.5>", "<s:b00TH>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("b00TH", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<d:1.5>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"-5", "-1073741824"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:1>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "int,int", "2147483647", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<i:-44>"}, false, 8, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:>", "<b:true>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "int,int", "-1", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<i:1>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:key>", "<i:-1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:k}ey>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:7>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:X>", "<null>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:W>", "<s:b>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 13, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"false"}, false, 12, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "int,int", "1", "0"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:X>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", "org.jfree.data.general.DatasetChangeEvent", "<sample:2>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"int", "int"}, new String[]{"2", "2051"}, false, 1, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "int,int", "-10", "10"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<s:X>", "<s:key>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"int", "int"}, new String[]{"10", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<d:1.5>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", "org.jfree.data.general.DatasetChangeEvent", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<s:kfi}>"}, false, 8, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "int,int", "-41", "-18"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"int", "int"}, new String[]{"0", "1"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<i:2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"int", "int"}, new String[]{"-10", "8184"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"int", "int"}, new String[]{"-1039", "-2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"int", "int"}, new String[]{"-1073741824", "-10"}, false, 13, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:4>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "int,int", "-10", "10"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:5>", "<i:0>", "<s:X>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1073741824>", "<s:k=ey>"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", "int", "20"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "-1073741824", "10"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:33>", "<s:>"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "-2147483647", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"int", "int"}, new String[]{"-1", "-10"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "int,int", "-10", "1"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", "boolean", "true"}}, 3), new String[][]{{"getLowerBound", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", new String[]{"boolean"}, new String[]{"true"}, false, 11, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:b1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<b:true>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<i:1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:5>", "<s:<>", "<s:X>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", "boolean", "true"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "-2147483648", "10"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:1>"}, false, 9, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "int,int", "-2147483648", "-10"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:3>"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<i:-32768>", "<i:0>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "-2147483648", "-1"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:b>"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", new String[]{"int", "int"}, new String[]{"-1", "-2147483648"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", "int,int", "-10", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "10", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:6>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 9, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<s:a>", "<b:true>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:3>", "<sample:1>", "<s:key>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<s:b>"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", "boolean", "true"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 0, null, 3), new String[][]{{"intersects", "double,double", "6"}, {"constrain", "double", "5"}, {"contains", "double", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"4"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"int", "int"}, new String[]{"28", "-1073741824"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "java.lang.Comparable,java.lang.Comparable", "<s:X>", "<s:a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"int", "int"}, new String[]{"1", "10"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getID", "", "0"}, {"clone", "", "0"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"int", "int"}, new String[]{"2147483647", "246"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 15, new String[][]{}, 2), new String[][]{{"addAll", "java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"int", "int"}, new String[]{"2147483647", "-1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "java.lang.Comparable,java.lang.Comparable", "<null>", "<s:X]>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", "org.jfree.data.general.DatasetChangeEvent", "<sample:2>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<null>", "<sample:1>"}}, 1), new String[][]{{"clear", "", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"int", "int"}, new String[]{"1073741823", "-536870848"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"-2147483647"}, false, 11, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", "boolean", "true"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"1073741848"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 6, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"0", "16777206"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "2147483606"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:Pey>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<b:true>", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<i:25>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:7>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "2", "-1073741824"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "int,int", "-1073741824", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:22>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:6>", "<i:2>", "<s:b0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<d:1.5>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:4>", "<s:<>", "<s:a>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<d:1.5>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<s:b>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "2147483647", "-2147483648"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<b:true>", "<i:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<s:key>"}}, 1), new String[][]{{"remove", "int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", "java.util.EventListener", "<sample:0>"}}, 2), new String[][]{{"addChangeListener", "org.jfree.data.general.DatasetChangeListener", "3"}, {"getMaxOutlier", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:0>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "java.lang.Comparable,java.lang.Comparable", "<s:key>", "<d:1.5>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:b>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:0>", "<s:>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:3>", "<s:b1>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<s:a1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", ""}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<i:-2147483648>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "int,int", "-2147483648", "-2147483647"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<s:key>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:key>"}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", new String[]{"int", "int"}, new String[]{"-1", "0"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", "int,int", "-2147483648", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<null>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"0", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "int,int", "-1", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<s:key>", "<null>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<i:1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<null>", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "1", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<null>", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"int", "int"}, new String[]{"10", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<i:2>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"-2147483648", "10"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:a>", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"-2147483648", "10"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:a>", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"-2147483648", "-10"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:4>", "<s:>", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<sample:0>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<s:key>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"int", "int"}, new String[]{"0", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<sample:0>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:>", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:>", "<i:2>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "10", "2147483647"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<empty>", "<s:key>", "<i:1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<s:key>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "2147483647", "-10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "true"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:key>", "<i:0>"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<null>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"int", "int"}, new String[]{"0", "0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"int", "int"}, new String[]{"1", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}}), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 12, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:>", "<b:true>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 14, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "int,int", "0", "10"}}), new String[][]{{"remove", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<d:1.5>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"int", "int"}, new String[]{"10", "-1"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "0", "2147483647"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "10", "-10"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:b1>", "<s:b>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "-2147483648", "-10"}}), new String[][]{{"getID", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:1>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "int,int", "-1", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:b1>", "<s:X>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "-1073741824", "-10"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", "java.lang.Comparable", "<s:a>"}}), new String[][]{{"getID", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", "java.lang.Comparable", "<i:-1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-1>", "<i:-1>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "java.lang.Comparable,java.lang.Comparable", "<i:1>", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:key>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"1"}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<null>", "<b:true>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:1>", "<s:>", "<d:1.5>"}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "true"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "10", "-2147483648"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false), new String[][]{{"constrain", "double", "2"}, {"getCentralValue", "", "6"}, {"getCentralValue", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:2>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"int", "int"}, new String[]{"-2147483648", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"true"}, false, 12, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "java.lang.Comparable,java.lang.Comparable", "<b:true>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:X>", "<sample:1>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:X>", "<sample:1>"}}), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:X>", "<sample:1>"}}), new String[][]{{"set", "int,java.lang.Object", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<sample:0>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"int", "int"}, new String[]{"-1", "-1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:0>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:2>", "<s:key>"}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", "int", "10"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"int", "int"}, new String[]{"10", "1"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", "boolean", "false"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "int,int", "-1073741824", "-29"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<i:1>"}}), new String[][]{{"getLowerBound", "", "0"}, {"intersects", "double,double", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<i:1073741823>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:key>"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "int,int", "-1", "-1073741824"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "-2147483648", "-1073741824"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false), new String[][]{{"addChangeListener", "org.jfree.data.general.DatasetChangeListener", "2"}, {"getMaxRegularValue", "int,int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:b1>", "<s:>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<null>"}, false, 13, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "int,int", "-2147483632", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:1>"}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<null>"}, false, 15, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "int,int", "0", "4"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<s:a>", "<b:true>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:X>", "<b:true>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:6>", "<i:1>", "<s:b>"}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<d:1.5>", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", "int", "10"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:1.5>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", "int", "33"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-41>", "<null>"}, false, 12, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<b:true>", "<i:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<s:key>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[true]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<sample:1>", "<i:-1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<i:-1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<i:0>"}}), new String[][]{{"listIterator", "", "7"}, {"previousIndex", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<sample:1>", "<i:-1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<i:-1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<i:0>"}}), new String[][]{{"listIterator", "", "7"}, {"next", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:0>", "<null>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "java.lang.Comparable,java.lang.Comparable", "<s:key>", "<d:1.5>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:2>"}, false, 8, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:6>", "<i:0>", "<sample:2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<d:1.5>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<d:1.5>", "<sample:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:1>"}}), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:1>"}}, 1), new String[][]{{"iterator", "", "6"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<b:true>", "<i:0>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<b:true>", "<i:0>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<b:true>", "<i:0>"}}, 2), new String[][]{{"getColumnIndex", "java.lang.Comparable", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<b:true>", "<i:0>"}}, 2), new String[][]{{"getColumnIndex", "java.lang.Comparable", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:2>"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:7>", "<s:>", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"int", "int"}, new String[]{"6", "-2147483648"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<s:b1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:2.3200000000000003>", "<s:>"}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "-2147483648", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:0>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "2147483647", "-2147483584"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<i:0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "2147483647", "-2147483584"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:W>", "<s:key>"}, false, 15, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", "java.lang.Comparable", "<i:0>"}}, 1), new String[][]{{"getQ1Value", "java.lang.Comparable,java.lang.Comparable", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", "java.lang.Comparable", "<i:87>"}}), new String[][]{{"getQ1Value", "java.lang.Comparable,java.lang.Comparable", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:1>", "<sample:1>"}, false, 14, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"int", "int"}, new String[]{"1", "0"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:o>", "<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "-10", "1"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "int,int", "-1", "-1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}}), new String[][]{{"contains", "double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:J>"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<i:1>", "<i:0>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3), new String[][]{{"add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"int", "int"}, new String[]{"24", "-68"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:>", "<i:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:a>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"int", "int"}, new String[]{"1", "-1073741824"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<null>", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<i:1>", "<d:1.5>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"true"}, false, 9, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", "org.jfree.data.general.DatasetChangeEvent", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:4>", "<i:0>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"false"}, false, 9, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", "org.jfree.data.general.DatasetChangeEvent", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:4>", "<i:0>", "<d:1.5>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:2>", "<i:2>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:2>", "<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<null>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "10", "4"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:b00H>", "<s:key>"}, false, 11, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<i:2>", "<b:true>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<i:2>", "<s:>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<i:2>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<i:2>", "<d:1.5>"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"getID", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:3>"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"true"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "-10", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", "int,int", "1", "-1073741824"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "-10", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", "int,int", "1", "-1073741824"}}, 1), new String[][]{{"getUpperBound", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<sample:0>", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "-10", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", "int,int", "1", "-1073741824"}}, 1), new String[][]{{"getUpperBound", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 8, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<sample:0>", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "-10", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "int,int", "-1073741824", "4"}}), new String[][]{{"getUpperBound", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "0", "0"}}), new String[][]{{"listIterator", "int", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>>", "<d:0.375>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "int,int", "-1073741824", "-21"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<b:false>", "<i:-1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "java.lang.Comparable,java.lang.Comparable", "<null>", "<i:2>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:4>", "<i:-1>", "<s:b00H>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:a>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "-1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:4>", "<i:-1>", "<s:b00H>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:a>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "-1"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"int", "int"}, new String[]{"-10", "1"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:1>", "<i:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<i:1>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:2>", "<s: >", "<i:1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "-1", "-1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", ""}}, 3), new String[][]{{"listIterator", "int", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"int", "int"}, new String[]{"1", "-10"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 11, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "int,int", "-10", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", "int,int", "-10", "2147483647"}}, 2), new String[][]{{"get", "int", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"int", "int"}, new String[]{"-1073741824", "-1073741824"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:4>"}, false, 11, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<s:>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<null>"}, false, 10, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<s:>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"int", "int"}, new String[]{"2147483647", "2147483647"}, false, 12, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"2147483647"}, false, 14, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "0", "8"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 16, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", "boolean", "true"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<s:a>", "<s:b1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<i:0>", "<d:1.5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "java.lang.Comparable,java.lang.Comparable", "<s:aE>", "<d:1.5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"-43", "2147483647"}, false, 14, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:a>", "<s:X>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:a>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<d:1.5>", "<i:1>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:5>"}, false, 0, null, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 3, new String[][]{}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:1>"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:b00H>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<sample:1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:b1>", "<i:1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:key>", "<i:-47>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "int,int", "2147483647", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "int,int", "-2147483648", "-1073741824"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "-2147483648", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"int", "int"}, new String[]{"-1", "0"}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "int,int", "4", "2147483647"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"-2147483648"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:b1>", "<sample:1>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2), new String[][]{{"getID", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"int", "int"}, new String[]{"0", "10"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "int,int", "-1073741824", "10"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"int", "int"}, new String[]{"-2147483648", "-1"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<s:X>", "<sample:1>"}}, 2), new String[][]{{"getCentralValue", "", "3"}, {"contains", "double", "3"}, {"getLength", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 6, new String[][]{}, 2), new String[][]{{"getCentralValue", "", "3"}, {"contains", "double", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:5>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "-1073741824", "2147483647"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:a>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 7, new String[][]{}, 3), new String[][]{{"size", "", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"true"}, false, 0, null, 2), new String[][]{{"intersects", "double,double", "1"}, {"contains", "double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "int,int", "0", "-10"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<i:-1>", "<i:1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getRowKeys", "", "2"}, {"iterator", "", "4"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:-2097090>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", "org.jfree.data.general.DatasetChangeEvent", "<sample:4>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", "int", "1073741823"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<sample:0>", "<s:b00H>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<null>"}, false, 11, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:b00H>", "<i:1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "int,int", "-1", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:b1oo>", "<s:e>"}, false, 12, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"0"}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "10", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "0", "-2147483643"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<s:X;>", "<s:b00H>"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("X;", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:6>", "<s:XX>", "<s:dB81>"}, false, 14, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:a>", "<i:-1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", "int", "2147483647"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<s:key>", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"false"}, false, 8, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:keyp>", "<s:b00H>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:4>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<i:1>", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"int", "int"}, new String[]{"-10", "-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<b:true>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:XX>", "<s:X>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:-176>"}, false, 7, new String[][]{}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:5>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<i:1>", "<s:>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "int,int", "1", "10"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "java.lang.Comparable,java.lang.Comparable", "<s:b00H>", "<s:b>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", new String[]{"int", "int"}, new String[]{"2", "-2147483648"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "int,int", "-1073741824", "-1"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getRangeUpperBound", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{}, 3), new String[][]{{"getRangeUpperBound", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 8, new String[][]{}, 2), new String[][]{{"getRangeUpperBound", "boolean", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:4>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:4>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}}, 3), new String[][]{{"listIterator", "", "7"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:4>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "int,int", "-1", "-1"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:4>"}}, 3), new String[][]{{"clear", "", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "10"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "10"}}, 1), new String[][]{{"getRowKey", "int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<s:ke6y<y>"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "int,int", "-2147483648", "10"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", "java.util.EventListener", "<empty>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<s:b>", "<s:aa>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false), new String[][]{{"addChangeListener", "org.jfree.data.general.DatasetChangeListener", "4"}, {"getColumnKeys", "", "4"}, {"addAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"addChangeListener", "org.jfree.data.general.DatasetChangeListener", "4"}, {"getColumnKeys", "", "6"}, {"addAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 9, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<sample:0>", "<i:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:b>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[a]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 13, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<sample:0>", "<i:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", "int,int", "2147483647", "0"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:2>"}}, 2), new String[][]{{"removeAll", "java.util.Collection", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "0", "2147483647"}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "-53", "2147483647"}}, 1), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "-26", "-1"}}, 1), new String[][]{{"contains", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 15, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "-49", "-32788"}}, 1), new String[][]{{"contains", "java.lang.Object", "1"}, {"listIterator", "", "2"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 22, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", "boolean", "false"}}, 1), new String[][]{{"contains", "java.lang.Object", "5"}, {"listIterator", "", "2"}, {"previousIndex", "", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 18, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<s:b>", "<s:key>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<b:true>"}}, 3), new String[][]{{"clone", "", "5"}, {"getID", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 20, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<s:b>", "<s:key>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<b:true>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<null>", "<i:1>", "<i:1>"}}, 3), new String[][]{{"clone", "", "5"}, {"getID", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:6>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"int", "int"}, new String[]{"-1", "-1073741824"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<s:a>"}, false, 12, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", "java.lang.Comparable", "<s:b00HP>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<null>", "<s:b>", "<d:1.5>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<s:>", "<s:a>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", "org.jfree.data.general.DatasetChangeEvent", "<sample:4>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", ""}}), new String[][]{{"isEmpty", "", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{}), new String[][]{{"addChangeListener", "org.jfree.data.general.DatasetChangeListener", "0"}, {"add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", "java.util.EventListener", "<sample:1>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 10, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 0, null, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<sample:1>", "<s:a>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "6"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
}
