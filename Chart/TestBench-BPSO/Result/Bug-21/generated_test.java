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
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"int", "int"}, new String[]{"-524289", "10"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<null>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput001() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:a\n>", "<s:>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput002() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", new String[]{"boolean"}, new String[]{"true"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput003() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:7>", "<i:-16>", "<i:2147483647>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "java.lang.Comparable,java.lang.Comparable", "<s:ld6[>", "<i:-20>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput004() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<d:0.15>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput005() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ey>", "<d:-2.8000000000000003>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<d:2.4>", "<s:cc>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:ey0>", "<s:>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput006() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<s:f>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "-138", "18"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "java.lang.Comparable,java.lang.Comparable", "<s:e>", "<s:b1>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput007() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<s:c>", "<s:>"}}), new String[][]{{"getRowKeys", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput008() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "true"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<d:1.5>"}}, 1), new String[][]{{"contains", "java.lang.Object", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput009() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:3>"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "int,int", "-4194280", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "-524299", "-49"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput010() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<d:-9.7>", "<i:-2>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", "int,int", "0", "0"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput011() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<d:1.49>", "<s:ccI\\>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", "int", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("ccI\\", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput012() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:4>", "<s:>", "<d:57.15>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<s:c>", "<d:-4.3>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "java.lang.Comparable,java.lang.Comparable", "<s:ad[>", "<d:-1.5>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput013() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:5>", "<s:f2>", "<s:me6[>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput014() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:3>", "<i:-102>", "<s:aa\n>"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:6>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<i:-102>", "<sample:6>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput015() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "int,int", "-16", "2058"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<i:-102>", "<s:f>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[0, sample]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput016() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:ccI[>", "<s:dic[>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput017() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<s:c/c[>", "<s:1A>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:7>", "<i:-1>", "<d:0.745>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput018() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", "java.lang.Comparable", "<d:-9.76>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:5>", "<s:c2c[>", "<s:ad[>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput019() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:-102>"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<s: c>", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput020() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"int", "int"}, new String[]{"1", "-2147483648"}, false, 7, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput021() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "-37"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput022() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput023() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:7>", "<sample:4>", "<s:ey0>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:5>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput024() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<s:C>"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput025() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"int", "int"}, new String[]{"2147483647", "524257"}, false, 3, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput026() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:3>", "<s:b>"}, false, 4, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput027() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"int", "int"}, new String[]{"-116", "1073741823"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "48", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput028() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", "java.lang.Comparable", "<s:f>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput029() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:3>", "<b:true>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput030() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput031() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"int", "int"}, new String[]{"10", "1073741823"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput032() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:3>", "<s:Eld6[>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "-2147483648"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "java.lang.Comparable,java.lang.Comparable", "<s:cc>", "<d:1.5>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput033() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:a>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "true"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput034() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", new String[]{"int", "int"}, new String[]{"5", "-5"}, false, 7, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput035() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:0>", "<s:b2>"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", "java.lang.Comparable", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput036() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:>", "<i:102>"}}, 3), new String[][]{{"add", "int,java.lang.Object", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput037() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-51>", "<s:>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput038() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<s:d[>"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "int,int", "-6", "-2147483637"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput039() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"int", "int"}, new String[]{"-150", "-41"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput040() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"int", "int"}, new String[]{"-1073741818", "45"}, false, 3, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput041() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:7>"}}, 1), new String[][]{{"setGroup", "org.jfree.data.general.DatasetGroup", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput042() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", new String[]{"boolean"}, new String[]{"false"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<i:-1>", "<i:-1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput043() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:e0>", "<i:0>"}, false, 2, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput044() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:1>", "<s:>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<null>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput045() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"true"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput046() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<null>"}, false, 2, new String[][]{}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput047() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:4>"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "java.lang.Comparable,java.lang.Comparable", "<s:f>", "<s:>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput048() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ey0T>", "<i:-1>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput049() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:b>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:1>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput050() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<b:true>"}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:6>", "<d:2.4>", "<s:>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput051() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:1>", "<s:b4>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "16383", "43"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput052() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"int", "int"}, new String[]{"33554372", "4"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput053() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput054() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:Fley>", "<s:keyW>"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<null>", "<s:a\n>", "<d:3.0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput055() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-20>", "<s:ld7[>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput056() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:b1>", "<s:b1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", "org.jfree.data.general.DatasetChangeEvent", "<sample:3>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<i:-8192>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput057() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput058() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", new String[]{"int", "int"}, new String[]{"2147483647", "-268435499"}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "161", "-43"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "0", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput059() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ld6[>", "<s:ld6[>"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput060() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<s:b2>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "int,int", "-2", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput061() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ey0>", "<s:ey>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput062() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", ""}}, 1), new String[][]{{"containsAll", "java.util.Collection", "6"}, {"addAll", "java.util.Collection", "3"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput063() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"0", "-83"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<s:>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput064() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", "boolean", "false"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<i:-73>", "<s:a>"}}, 3);
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput065() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<b:true>", "<s:pdc[>"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", ""}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput066() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"75"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:a\n>", "<sample:0>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput067() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput068() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"int", "int"}, new String[]{"-37", "-10"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", "int,int", "-2147483648", "5"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput069() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-2147483610>", "<s:9b>"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "-2147483648", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput070() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<empty>", "<s:>", "<s:Fa\r\n>"}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "int,int", "524276", "-2147467251"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", "int,int", "1073741823", "2147483637"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput071() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-51>", "<s:ey>"}, false, 0, null, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput072() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:1>"}, false, 2, new String[][]{}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput073() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "-536870947", "37"}}, 1), new String[][]{{"getRowKey", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput074() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<i:-40>", "<d:0.15>"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "true"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput075() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<s: 7d>", "<i:-1>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput076() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:1>"}, false, 6, new String[][]{}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput077() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "-58", "-2147483648"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput078() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput079() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:0>", "<s:a>", "<d:1.2>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", ""}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput080() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:4>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<null>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput081() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<i:-1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput082() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:2>", "<i:-65535>", "<sample:1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "true"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput083() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<i:6>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput084() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:2>", "<d:-1.5>", "<s:dc[>"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput085() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput086() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"int", "int"}, new String[]{"-2147483648", "-1073741812"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "-138"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput087() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<sample:2>", "<s:ey5>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput088() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<sample:1>"}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<s:bbB>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput089() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}}, 2), new String[][]{{"getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput090() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:9>", "<d:3.0>", "<s:ld6[>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "-18", "1073741823"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput091() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"-18"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "java.lang.Comparable,java.lang.Comparable", "<i:-9>", "<s:cc[>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "int,int", "0", "-2147483648"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput092() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"int", "int"}, new String[]{"-5", "-524289"}, false, 0, null, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput093() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<null>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput094() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 2, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput095() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:b>", "<s:c>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput096() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:9>"}, false, 5, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput097() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"int", "int"}, new String[]{"-536870912", "-2147483648"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput098() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:4>"}, false);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput099() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"int", "int"}, new String[]{"-10", "2147483637"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput100() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<b:true>"}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput101() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"int", "int"}, new String[]{"-524289", "-2147483637"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput102() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "-18", "-2147483635"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "-524289", "2147483637"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput103() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput104() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"0"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput105() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "int,int", "24", "33554414"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput106() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"int", "int"}, new String[]{"2147483647", "51"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput107() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:cc[>", "<s:e>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput108() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"int", "int"}, new String[]{"-43", "2147483647"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<b:true>", "<s:key>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput109() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:1>"}, false, 2, new String[][]{});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput110() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:f>", "<i:-2147483648>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput111() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"int", "int"}, new String[]{"-2147483648", "2147483647"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "-9", "-75"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput112() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ey>", "<s:dc[>"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<i:102>", "<i:-2>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "java.lang.Comparable,java.lang.Comparable", "<s:>", "<s:>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput113() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"int", "int"}, new String[]{"-10", "-536870912"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput114() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "int,int", "37", "-2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput115() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 3, new String[][]{});
  assertNotNull(actual);
  assertEquals("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput116() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ey0>", "<d:1.5>"}, false, 6, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput117() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"int", "int"}, new String[]{"-2147483648", "-2147483648"}, false, 1, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput118() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getValue", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput119() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput120() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:4>", "<d:2.4>"}, false, 5, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput121() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput122() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<i:-8192>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput123() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<null>"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<s:,key>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", ""}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput124() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"int", "int"}, new String[]{"-2147483648", "-9"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "int,int", "-75", "14"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput125() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"int", "int"}, new String[]{"-2147483637", "2147483637"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", "java.util.EventListener", "<sample:2>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput126() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<s:ex>"}}), new String[][]{{"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput127() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", new String[]{}, new String[]{}, false);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput128() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:10>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", ""}}), new String[][]{{"getUpperBound", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput129() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"int", "int"}, new String[]{"-2147483648", "48"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput130() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", new String[]{"int", "int"}, new String[]{"-1073741792", "-75"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput131() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false), new String[][]{{"addAll", "int,java.util.Collection", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput132() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-204>", "<s:key>"}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "-524255", "-8193"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput133() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "1", "-33554414"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput134() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:2>", "<i:0>", "<s:cc[>"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput135() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:2>", "<s:>", "<s:\tmdc[>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<s:c8>", "<i:-335544322>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput136() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:e>", "<i:2147483647>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput137() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<i:-4>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "int,int", "1", "2147483637"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput138() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"-2147483637"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "-1073741817"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput139() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<i:-16>", "<d:4.8>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput140() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<i:-36>", "<s:uey>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput141() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getRowKeys", "", "6"}, {"isEmpty", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput142() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false), new String[][]{{"getGroup", "", "5"}, {"clone", "", "7"}, {"clone", "", "6"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput143() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput144() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "int,int", "1", "-33554450"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}}), new String[][]{{"getMaxRegularValue", "java.lang.Comparable,java.lang.Comparable", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput145() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "-1048578", "2147483647"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput146() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:5>", "<i:-102>", "<i:-4>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput147() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<s:a9>", "<i:-2147483648>"}}), new String[][]{{"contains", "java.lang.Object", "3"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput148() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false), new String[][]{{"getID", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput149() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput150() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<sample:0>", "<i:2>"}, false); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput151() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<i:-2147483648>", "<s:`\n>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "-18"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput152() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"24", "1073741842"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "0", "18"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput153() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<i:-536870920>", "<s:cc[>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput154() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:10>", "<sample:3>", "<s:a\n>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:5>", "<i:-1>", "<s:cc[>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<s:f>", "<d:12.100000000000001>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=3, getRowCount=3}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput155() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:0>"}}), new String[][]{{"getColumnCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput156() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<s:>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput157() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:ld6[A>"}}), new String[][]{{"addAll", "int,java.util.Collection", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput158() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:ld6[6>", "<i:-2147483648>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s:xddc[>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput159() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false), new String[][]{{"get", "int", "1"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput160() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<s:f>", "<s:>"}}, 1), new String[][]{{"getRangeBounds", "boolean", "7"}});
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput161() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"int", "int"}, new String[]{"2147483647", "-9"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", "int,int", "2147483647", "47"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "int,int", "-536870948", "-64"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput162() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"-2147483603"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput163() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "1"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput164() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", ""}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput165() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:4>", "<s:y>", "<s:{>"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "2147483647", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput166() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:4>", "<i:1073741823>", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "java.lang.Comparable,java.lang.Comparable", "<s:>", "<i:-102>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput167() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"int", "int"}, new String[]{"20", "-2147483648"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput168() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", new String[]{"int"}, new String[]{"2147483647"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput169() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<d:3.0>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<s: :t>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", "int,int", "536870912", "524289"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput170() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:0>"}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput171() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput172() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, null, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput173() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "20", "-101"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput174() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-38>"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<s:a9\u00e9\n>", "<d:0.15>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", "org.jfree.data.general.DatasetChangeEvent", "<sample:0>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput175() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:a\n>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "java.lang.Comparable,java.lang.Comparable", "<i:0>", "<s: d>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<d:45.15>", "<i:0>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput176() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"-40", "-36"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", "boolean", "false"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput177() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<b:true>", "<s:eyC>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "java.lang.Comparable,java.lang.Comparable", "<s:`>", "<sample:0>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput178() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:5>"}, false, 0, null, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput179() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:>"}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", "boolean", "false"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput180() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:>", "<s:>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput181() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, null, 3), new String[][]{{"getID", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput182() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 6, new String[][]{}, 1), new String[][]{{"set", "int,java.lang.Object", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput183() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"int", "int"}, new String[]{"-2147483520", "24"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "-4", "0"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput184() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:5>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:5>", "<s:ccZ>", "<s:kex>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", "int", "-1"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput185() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"int", "int"}, new String[]{"2147483647", "33554414"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "536870837", "-2147483636"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput186() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:5>", "<i:-2>", "<s:f2>"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<s:ac[>", "<i:-2147483648>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput187() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:a>", "<s:f2>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput188() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<null>", "<s: b>", "<i:1>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput189() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:4>", "<s:d0>"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "false"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "int,int", "1", "-18"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput190() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, null, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", actual.getClass().getName());
  assertEquals("{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput191() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"int", "int"}, new String[]{"10", "2147483573"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "java.lang.Comparable,java.lang.Comparable", "<d:1.5>", "<s:6>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput192() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<s:a>", "<s:e+1>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput193() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", ""}}, 1), new String[][]{{"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput194() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "int,int", "-2147483648", "-2147483648"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput195() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:6ey>", "<i:-2>"}, false, 5, new String[][]{}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput196() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:5>", "<s:ee>", "<i:-32>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "true"}}, 3), new String[][]{{"addAll", "java.util.Collection", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput197() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<s:c[>", "<s:\u00e9b>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:b>", "<i:-37>"}}), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput198() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:6>", "<sample:6>", "<s:a>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", ""}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput199() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false), new String[][]{{"iterator", "", "5"}});
  assertNotNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput200() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<sample:1>", "<s:dy>"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", "org.jfree.data.general.DatasetChangeEvent", "<sample:3>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput201() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", ""}}, 1);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput202() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", new String[]{"int", "int"}, new String[]{"10", "-10"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "int,int", "10", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput203() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:e>", "<i:-45>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "false"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput204() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:f>"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:fr>", "<i:-1>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput205() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "notifyListeners", new String[]{"org.jfree.data.general.DatasetChangeEvent"}, new String[]{"<sample:3>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "-18", "-2147483648"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput206() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"int", "int"}, new String[]{"33554375", "2147483647"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput207() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<i:-102>", "<i:0>"}}, 2), new String[][]{{"getRowKey", "int", "6"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput208() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"size", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput209() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<i:0>", "<s:/ey>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<i:-536870913>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput210() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", new String[]{"int", "int"}, new String[]{"0", "0"}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "2147483647", "-268435456"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput211() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", ""}}, 2), new String[][]{{"isEmpty", "", "3"}, {"addAll", "java.util.Collection", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput212() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnCount", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "java.lang.Comparable,java.lang.Comparable", "<s:c>", "<s:at[T>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput213() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<i:-20>"}, false, 1, new String[][]{}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput214() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:e>", "<s:>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput215() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:2>", "<s:B.>", "<sample:1>"}, false, 5, new String[][]{}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput216() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", new String[]{"int"}, new String[]{"2147483647"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<null>", "<d:-121.2>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput217() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:acZ[>", "<null>"}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<s:`>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "int,int", "-2147483648", "-265"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput218() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", "java.lang.Comparable", "<i:-2>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}}), new String[][]{{"lastIndexOf", "java.lang.Object", "1"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput219() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:a[>", "<s:kd6\\>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "java.lang.Comparable,java.lang.Comparable", "<s:b>", "<s:I7>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput220() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<empty>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", "boolean", "false"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput221() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 5, new String[][]{}, 1), new String[][]{{"listIterator", "int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput222() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, null, 2), new String[][]{{"getID", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput223() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:-62>"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:9>", "<s:f>", "<i:2>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput224() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:cEc[>", "<s:key>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "-536870912", "2147483647"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput225() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<null>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<i:-20>", "<s:>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:>", "<i:-60>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput226() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:4>", "<d:-4.2>", "<s:ad[>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<i:-2147483648>", "<i:2>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput227() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:1.5>", "<s:bb2>"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:ehy>", "<s: b>"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput228() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<s:d>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "int,int", "-2147483637", "-138"}}), new String[][]{{"size", "", "7"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput229() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:7>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}}, 2);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput230() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:2>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<i:-2147483648>", "<sample:0>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput231() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<s:>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", "int,int", "2147483647", "-8"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput232() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:7>", "<d:3.0>", "<i:-2147483648>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "java.lang.Comparable,java.lang.Comparable", "<i:59>", "<s:key>"}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput233() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<i:0>"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<i:-2147483648>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput234() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<d:0.15>", "<s:a.\n>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput235() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:`>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<i:102>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput236() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"false"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<s:ac[>", "<s:>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput237() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "int,int", "2147483647", "2147483647"}}), new String[][]{{"size", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput238() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:4>", "<i:-131173>", "<s:ad\\>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("-Infinity", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput239() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<d:24.0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:a\n>", "<s:>d6[>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput240() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:6>"}}, 3), new String[][]{{"subList", "int,int", "2"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput241() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKey", "int", "2147483647"}}), new String[][]{{"iterator", "", "6"}, {"next", "", "0"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.util.NoSuchElementException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput242() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnIndex", new String[]{"java.lang.Comparable"}, new String[]{"<s:ey0>"}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:dy>", "<b:false>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput243() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"int", "int"}, new String[]{"-2147483648", "1073741823"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<null>", "<sample:0>", "<i:102>"}}, 1); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput244() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "int,int", "-47", "-536870912"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput245() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:key>", "<i:-2147483648>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<i:-2147483648>", "<s:a\n>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<d:1.535>", "<s:b[1>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput246() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<i:32>", "<s:2>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "java.lang.Comparable,java.lang.Comparable", "<i:-524288>", "<s:eIy>"}}), new String[][]{{"getColumnIndex", "java.lang.Comparable", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("-1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput247() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<s:ac[>", "<d:0.15>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput248() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", "java.lang.Comparable,java.lang.Comparable", "<s:bc[>", "<i:2147483647>"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput249() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", new String[]{"java.util.EventListener"}, new String[]{"<sample:1>"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "-2147483647", "-20"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<d:1.5>", "<s:/c>"}}, 1);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput250() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", new String[]{"int", "int"}, new String[]{"-2147483634", "-2147483648"}, false, 0, null, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput251() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<sample:1>", "<i:2>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[2]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput252() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<s:>>", "<i:-4>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}}, 1), new String[][]{{"getValue", "java.lang.Comparable,java.lang.Comparable", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("org.jfree.data.UnknownKeyException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput253() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"int", "int"}, new String[]{"-20", "2147483647"}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "hasListener", "java.util.EventListener", "<sample:0>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "false"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput254() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<sample:0>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<d:0.15>"}}, 1), new String[][]{{"getRowCount", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput255() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:>", "<null>"}, false, 2, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput256() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:a>", "<null>"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "java.lang.Comparable,java.lang.Comparable", "<s:lac\\>", "<s: ]c>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput257() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:0>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<s: c>", "<i:-1>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput258() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", new String[]{}, new String[]{}, false, 6, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "-2147483638", "-4"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<s:c[>", "<s:c>"}}, 3);
  assertNotNull(actual);
  assertEquals("java.lang.Integer", actual.getClass().getName());
  assertEquals("1", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput259() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:5>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput260() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:5>", "<s:>", "<s:b;>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "536870909", "-2147483635"}}), new String[][]{{"getID", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput261() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", ""}}, 3), new String[][]{{"getMinOutlier", "int,int", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput262() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "validateObject", new String[]{}, new String[]{}, false, 1, new String[][]{}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput263() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:dcW[W>", "<null>"}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "false"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput264() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<d:0.15>", "<null>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<s:b>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", "boolean", "true"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput265() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "int,int", "1073741823", "2147483647"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", ""}}, 2), new String[][]{{"getRangeUpperBound", "boolean", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput266() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", new String[]{"int", "int"}, new String[]{"10", "2147483647"}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "-2147483648", "47"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getItem", "int,int", "-10", "-138"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput267() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKey", "int", "2147483637"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.Range", actual.getClass().getName());
  assertEquals("Range[0.0,0.0] {getCentralValue=0.0, getLength=0.0, getLowerBound=0.0, getUpperBound=0.0}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput268() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", new String[]{"org.jfree.data.general.DatasetGroup"}, new String[]{"<sample:2>"}, false, 0, null, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput269() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinRegularValue", new String[]{"int", "int"}, new String[]{"2147483580", "-524289"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "18", "-2147483648"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput270() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<i:0>", "<s:y>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:c>", "<s:ey>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput271() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"int", "int"}, new String[]{"-262172", "-9"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "int,int", "-2147483648", "2147483647"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput272() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<i:-49>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "int,int", "2147483647", "-2147483648"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput273() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", "int,int", "33554416", "-4"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:c[>", "<i:2147483634>"}});
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[c[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput274() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:2>", "<s:ccI[>", "<d:1.2>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:4>", "<s:b=>", "<i:-1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "java.lang.Comparable,java.lang.Comparable", "<s:\t>", "<sample:0>"}});
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=2, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput275() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", new String[]{}, new String[]{}, false, 7, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", ""}}, 3), new String[][]{{"getColumnKeys", "", "7"}, {"isEmpty", "", "5"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput276() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMedianValue", "java.lang.Comparable,java.lang.Comparable", "<i:-10>", "<i:2>"}}, 1), new String[][]{{"subList", "int,int", "4"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput277() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:6>"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<s:>", "<i:-16>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput278() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:4>", "<s:>", "<s:pb18>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput279() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getOutliers", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<s:ld6[>", "<null>"}, false, 4, new String[][]{}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput280() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getValue", new String[]{"java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<d:0.15>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxRegularValue", "java.lang.Comparable,java.lang.Comparable", "<i:2>", "<s:a>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "clone", ""}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput281() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 4, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}}, 2), new String[][]{{"remove", "java.lang.Object", "5"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.UnsupportedOperationException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput282() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", new String[]{"int", "int"}, new String[]{"-276", "-2147483637"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "int,int", "2147483647", "1"}}, 2); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput283() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "java.lang.Comparable,java.lang.Comparable", "<s:ex>", "<s:>"}}), new String[][]{{"getCentralValue", "", "1"}, {"intersects", "double,double", "4"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput284() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeUpperBound", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:0>", "<s:eyh>", "<d:-4.2>"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("1.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput285() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMinOutlier", "java.lang.Comparable,java.lang.Comparable", "<s:ac[>", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:0>"}}, 1), new String[][]{{"getID", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.String", actual.getClass().getName());
  assertEquals("NOID", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput286() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "setGroup", "org.jfree.data.general.DatasetGroup", "<sample:3>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "int,int", "-2147483648", "-2147483648"}}, 2);
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput287() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"true"}, false, 2, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", "org.jfree.data.general.DatasetChangeListener", "<sample:0>"}}, 1), new String[][]{{"getLowerBound", "", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput288() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "fireDatasetChanged", ""}}, 2), new String[][]{{"subList", "int,int", "7"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IndexOutOfBoundsException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput289() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "addChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<sample:6>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:a>", "<d:-2.85>"}}, 2);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput290() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:3>", "<s:b>", "<s:ld\"[>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:3>", "<s:b>", "<s:a>"}}); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.IllegalArgumentException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput291() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", new String[]{"java.lang.Object"}, new String[]{"<i:15>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:2>", "<s:ey>", "<s:ec[>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMaxOutlier", "int,int", "-536870912", "-10"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("false", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput292() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeLowerBound", new String[]{"boolean"}, new String[]{"true"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowCount", ""}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "equals", "java.lang.Object", "<s:aV>"}}, 2);
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("NaN", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput293() throws Throwable {
  Throwable thrown = null;
  try { SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"org.jfree.data.statistics.BoxAndWhiskerItem", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<null>", "<i:102>", "<sample:0>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getMeanValue", "java.lang.Comparable,java.lang.Comparable", "<b:true>", "<b:true>"}}, 3); } catch (Throwable caught) { thrown = caught; }
  assertNotNull("expected an exception", thrown);
  assertEquals("java.lang.NullPointerException", thrown.getClass().getName());
 }
 @Test(timeout = 20000)
 public void generatedInput294() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRowKeys", new String[]{}, new String[]{}, false, 5, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "-138", "-1"}}, 3);
  assertNotNull(actual);
  assertEquals("java.util.Collections$UnmodifiableRandomAccessList", actual.getClass().getName());
  assertEquals("[]", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput295() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "removeChangeListener", new String[]{"org.jfree.data.general.DatasetChangeListener"}, new String[]{"<null>"}, false, 3, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:1>", "<s:b==>", "<s:ey>"}}, 1);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput296() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", new String[]{}, new String[]{}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:5>", "<d:-42.0>", "<s:a\n>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ3Value", "int,int", "-184", "-524313"}}, 1);
  assertNotNull(actual);
  assertEquals("org.jfree.data.general.DatasetGroup", actual.getClass().getName());
  assertEquals("{getID=NOID}", SearchInputFactory_scaffolding.observe(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput297() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 1, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getQ1Value", "int,int", "-124", "-21"}}, 3), new String[][]{{"contains", "double", "2"}});
  assertNotNull(actual);
  assertEquals("java.lang.Boolean", actual.getClass().getName());
  assertEquals("true", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=0, getRowCount=0}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput298() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", new String[]{"java.util.List", "java.lang.Comparable", "java.lang.Comparable"}, new String[]{"<sample:3>", "<s:cc5[>", "<i:1>"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "org.jfree.data.statistics.BoxAndWhiskerItem,java.lang.Comparable,java.lang.Comparable", "<sample:6>", "<s:c>", "<sample:1>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getGroup", ""}}, 3);
  assertNull(actual);
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=2}", SearchInputFactory_scaffolding.receiverState());
 }
 @Test(timeout = 20000)
 public void generatedInput299() throws Throwable {
  Object actual = SearchInputFactory_scaffolding.follow(SearchInputFactory_scaffolding.call("org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getRangeBounds", new String[]{"boolean"}, new String[]{"false"}, false, 0, new String[][]{{"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "add", "java.util.List,java.lang.Comparable,java.lang.Comparable", "<empty>", "<s:c>>", "<s:ld6[>"}, {"org.jfree.data.statistics.DefaultBoxAndWhiskerCategoryDataset", "getColumnKeys", ""}}), new String[][]{{"getLowerBound", "", "0"}});
  assertNotNull(actual);
  assertEquals("java.lang.Double", actual.getClass().getName());
  assertEquals("0.0", String.valueOf(actual));
  assertEquals("receiver state after the call", "{getColumnCount=1, getRowCount=1}", SearchInputFactory_scaffolding.receiverState());
 }
}
